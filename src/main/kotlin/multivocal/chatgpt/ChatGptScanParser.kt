package multivocal.chatgpt

import papers.skip
import java.io.File
import kotlin.system.exitProcess

data class ChatGptScan(
    val fileName: String,
    val websiteName: String,
    val websiteUrl: String,
    val category: String,
    val chatGptAnswer: String)

val overrideWebsiteCategory by lazy {
    val file = File("output/chatgpt/overrideWebsiteCategory.txt")
    file.readLines().map { it.split("=") }.map { it[0] to it[1] }.toMap()
}

fun parseGptScan(file: File): List<ChatGptScan> {
    val text = file.readText()
    val partOfAnswers =
        text.substringAfter("ChatGPT:")
            .harmonize()
            .substringBefore("**Overview Table:**")

    val urls = text.takeUrlLines().toTypedArray()
    val writtenWebPilotResults = partOfAnswers.divideWrittenWebPilotResults()
    val websiteNames = writtenWebPilotResults.map { it.extractValueInLinesOfOrDefault("**Website-Name:**", "?") }
    val categories = writtenWebPilotResults.map { it.extractValueInLinesOfOrDefault("**Category:**", "E") }
        .map { it.trimSuffixOfPattern(" \\(.*\\)|:[\\w ]*") }
        .mapIndexed { index, it -> overrideWebsiteCategory[urls[index]] ?: it }

    return (1..urls.size)
        .map { ChatGptScan(file.name, websiteNames[it-1], urls[it-1], categories[it-1], writtenWebPilotResults[it-1]) }
}

private fun String.takeUrlLines() = this.lines().takeWhile { it.startsWith("http") }

private fun String.harmonize() = this
    .replace("\r\n", "\n")
    .replace("Website Name", "Website-Name")
    .harmonizeLabels("Website-Name", "Category", "Overview Table")
    .replace("**Website**", "**Website-Name:**")
    .replace("### Website:", "**Website-Name:**")
    .replace("- Used WebPilot\n\n###", "- Used WebPilot\n\n**Website-Name:**")
    .replace("**Website-Name:** Website Analysis:", "**Website-Name:**")
    .replaceSpecialCharacters()
    .harmonizeMultiBullets()

private fun String.replaceSpecialCharacters() = this
    .replace("–", "-")
    .replace("’", "'")

private fun String.replaceIf(pattern: String, replacement: String, predicate: (String) -> Boolean) =
    if (predicate(this)) {
        this.replace(pattern, replacement)
    } else {
        this
    }

private fun String.harmonizeLabels(vararg labels: String): String {
    var result = this
    for (label in labels) {
        result = result
            .replace("**$label**:", "**$label:**")
            .replace("**$label** :", "**$label:**")

            // handle headline labels
            .replace("# $label:", "# $label") // remove colons
            .replace("#### $label\n-", "**$label:**")
            .replace("### $label\n-", "**$label:**")
            .replace("## $label\n-", "**$label:**")

            .replace("**$label:**(\n- [])+", "**$label:**")
    }
    return result
}

private fun String.harmonizeMultiBullets(): String {
    val result = StringBuilder()
    val sourceLines = this.lines()

    var inCategoryBlock = false
    var inCategoryValueCount = 0
    var originalCategoryLine = ""
    val categoryValueRegex = "- ([A-E]\\*?).*".toRegex()
    for (line in sourceLines) {
        if (inCategoryBlock) {
            val match = categoryValueRegex.matchEntire(line)
            if (inCategoryValueCount == 0) {
                val singleLineCategory = match == null
                if (singleLineCategory) {
                    result.appendLine(originalCategoryLine)
                } else {
                    result.append("**Category:** ")
                }
            }
            if (match != null) {
                if (inCategoryValueCount >= 1) {
                    result.append("/")
                }
                val categoryValue = match.groupValues[1]
                result.append(categoryValue)
                inCategoryValueCount++
            } else {
                inCategoryBlock = false
                inCategoryValueCount = 0
                result.appendLine()
            }
        } else {
            if (line.contains("**Category:**")) {
                originalCategoryLine = line
                inCategoryBlock = true
            } else {
                result.appendLine(line)
            }
        }
    }

    return result.toString()
}

private fun String.divideWrittenWebPilotResults(): Array<String> {
    val parts = this.split("Used WebPilot")
        .skip(1)
        .toTypedArray()
    assert(parts.size == 5)
    return parts
}

private fun String.extractValueInLinesOf(prefix: String): String {
    return this.lines()
        .first { it.contains(prefix) }
        .substringAfter(prefix).trim()
}

private fun String.extractValueInLinesOfOrDefault(prefix: String, defaultValue: String): String {
    return this.lines()
        .firstOrNull { it.contains(prefix) }
        ?.substringAfter(prefix)?.trim()
        ?: defaultValue
}

private fun String.trimSuffixOfPattern(regex: String): String {
    val match = regex.toRegex().find(this)
    return if (match != null) {
        this.substring(0, match.range.first)
    } else {
        this
    }
}

private fun String.countSubstring(substring: String) = this.split(substring).size - 1

fun main() {
    //checkInconsistentScans()
    val scans = collectAndParseScans()

    // print all scans as a simple csv table into output/chatgpt/chatgpt_scans.csv with the columns URL, Website, Category
    val outputFile = File("output/chatgpt/chatgpt_scans.csv")
    outputFile.writeText("URL;Name;Category\n" + scans.joinToString("\n") { "${it.websiteUrl};${it.websiteName};${it.category}" })
    println("Wrote ${scans.size} scans into $outputFile")
}

fun checkInconsistentScans() {

    val directory = File("output/chatgpt")
    directory.listFiles()!!.sorted().filter { it.name.endsWith(".md") }.forEach { file ->
        val content = file.readText()
        if (content.startsWith("SKIP")) {
            println("Skipping ${file.name}")
            return@forEach
        }

        val countUrlsAtBeginning = content.lines().take(5).count { it.startsWith("http") }

        val categoryCount = content.harmonize()
            .countCategorys()
        if (categoryCount != countUrlsAtBeginning) {
            println("ERROR: $file has $countUrlsAtBeginning URLs at the beginning but $categoryCount categories")
        }
        val usedWebPilotCount = content.countSubstring("Used WebPilot")
        if (usedWebPilotCount != countUrlsAtBeginning) {
            println("ERROR: $file has $usedWebPilotCount 'Used WebPilot' sections")
        }
    }


    exitProcess(0)
}

private fun String.countCategorys(): Int {
    // count occurences of ""**Category:**"
    return this.countSubstring("**Category:**")
}

internal fun collectAndParseScans(): MutableList<ChatGptScan> {
    val directory = File("output/chatgpt")
    val scans = mutableListOf<ChatGptScan>()
    directory.listFiles()!!.sorted()
        .filter { it.name.endsWith(".md") }
        .filterNot { it.name.startsWith("waybackmachine") }
        .forEach { file ->
        if (file.readText().startsWith("SKIP")) {
            println("Skipping ${file.name}")
            return@forEach
        }
        println("Checking ${file.name}")
        scans += parseGptScan(file)
    }
    return scans
}
