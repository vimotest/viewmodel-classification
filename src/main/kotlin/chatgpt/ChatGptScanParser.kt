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
            .harmonizeLabels("Website-Name", "Category", "Overview Table")
            .replace("**Website:**", "**Website-Name:**")
            .substringBefore("**Overview Table:**")

    val urls = text.lines().take(5).toTypedArray()
    val writtenWebPilotResults = partOfAnswers.divideWrittenWebPilotResults()
    val websiteNames = writtenWebPilotResults.map { it.extractValueInLinesOfOrDefault("**Website-Name:**", "?") }
    val categories = writtenWebPilotResults.map { it.extractValueInLinesOfOrDefault("**Category:**", "D") }
        .map { it.trimSuffixOfPattern(" \\(.*\\)") }

    return (1..5)
        .map { ChatGptScan(file.name, websiteNames[it-1], urls[it-1], categories[it-1]) }
}

private fun String.harmonizeLabels(vararg labels: String): String {
    var result = this
    for (label in labels) {
        result = result
            .replace("**$label**:", "**$label:**")
            .replace("**$label** :", "**$label:**")
    }
    return result
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
    directory.listFiles()!!.filter { it.name.endsWith(".md") }.forEach { file ->
        println("Checking ${file.name}")
        scans += parseGptScan(file)
    }

    // print all scans as a simple csv table into output/chatgpt/chatgpt_scans.csv with the columns URL, Website, Category
    File("output/chatgpt/chatgpt_scans.csv").writeText(scans.joinToString("\n") { "${it.websiteUrl},${it.websiteName},${it.category}" })
}
