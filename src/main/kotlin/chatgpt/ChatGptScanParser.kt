package chatgpt

import java.io.File

data class ChatGptScan(
    val fileName: String,
    val websiteName: String,
    val websiteUrl: String,
    val category: String)

fun parseGptScan(file: File): List<ChatGptScan> {
    val text = file.readText()
    val partOfAnswers = text.substringAfter("ChatGPT:")
    assert(partOfAnswers.countSubstring("**Website-Name:**") == 5)
    assert(partOfAnswers.countSubstring("**Category:**") == 5)

    val urls = text.lines().take(5).toTypedArray()
    val websiteNames = extractValuesInLinesOf("**Website-Name:**", partOfAnswers)
    val categories = extractValuesInLinesOf("**Category:**", partOfAnswers)

    return (1..5)
        .map { ChatGptScan(file.name, websiteNames[it-1], urls[it-1], categories[it-1]) }
}

private fun extractValuesInLinesOf(prefix: String, partOfAnswers: String): Array<String> {
    return partOfAnswers.lines()
        .filter { it.contains(prefix) }
        .map { it.substringAfter(prefix).trim() }
        .toTypedArray()
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
