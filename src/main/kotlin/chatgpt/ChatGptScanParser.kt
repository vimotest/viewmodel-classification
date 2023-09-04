package chatgpt

import papers.skip
import java.io.File

data class ChatGptScan(
    val fileName: String,
    val websiteName: String,
    val websiteUrl: String,
    val category: String)

fun parseGptScan(file: File): List<ChatGptScan> {
    val text = file.readText()
    val partOfAnswers =
        text.substringAfter("ChatGPT:")
            .harmonize()
            .substringBefore("**Overview Table:**")

    val urls = text.lines().take(5).toTypedArray()
    val writtenWebPilotResults = partOfAnswers.divideWrittenWebPilotResults()
    val websiteNames = writtenWebPilotResults.map { it.extractValueInLinesOfOrDefault("**Website-Name:**", "?") }
    val categories = writtenWebPilotResults.map { it.extractValueInLinesOfOrDefault("**Category:**", "D") }
        .map { it.trimSuffixOfPattern(" \\(.*\\)|:[\\w ]*") }

    return (1..5)
        .map { ChatGptScan(file.name, websiteNames[it-1], urls[it-1], categories[it-1]) }
}

private fun String.harmonize() = this
    .harmonizeLabels("Website-Name", "Category", "Overview Table")
    .replace("**Website:**", "**Website-Name:**")
    .harmonizeMultiBullets()

private fun String.harmonizeLabels(vararg labels: String): String {
    var result = this
    for (label in labels) {
        result = result
            .replace("**$label**:", "**$label:**")
            .replace("**$label** :", "**$label:**")
            .replace("#### $label:\n-", "**$label:**")
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
    val directory = File("output/chatgpt")
    val scans = mutableListOf<ChatGptScan>()
    directory.listFiles()!!.sorted().filter { it.name.endsWith(".md") }.forEach { file ->
        println("Checking ${file.name}")
        scans += parseGptScan(file)
    }

    // print all scans as a simple csv table into output/chatgpt/chatgpt_scans.csv with the columns URL, Website, Category
    val outputFile = File("output/chatgpt/chatgpt_scans.csv")
    outputFile.writeText(scans.joinToString("\n") { "${it.websiteUrl},${it.websiteName},${it.category}" })
    println("Wrote ${scans.size} scans into $outputFile")
}
