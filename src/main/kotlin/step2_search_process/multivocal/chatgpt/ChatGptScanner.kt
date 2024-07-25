package step2_search_process.multivocal.chatgpt

import java.io.File

fun checkNextUrlChunkWithChatGPT(inputUrls: List<String>) {
    val nextUrls = next5ChatGptUrls(inputUrls)
    if (nextUrls.isEmpty()) {
        println("No next URLs - all processed")
        return
    }
    println("Next websites for Chat-GPT:")
    for (nextUrl in nextUrls) {
        println(nextUrl)
    }
    createNextGptScannedResultsFile(nextUrls)
}

private fun next5ChatGptUrls(inputUrls: List<String>): List<String> {
    val scannedUrl = collectScannedUrls().toMutableSet()

    val results = mutableListOf<String>()
    for (url in inputUrls) {
        if (url in scannedUrl) {
            continue
        }
        results.add(url)
        scannedUrl.add(url)
        if (results.size >= 5) {
            break
        }
    }
    return results
}

private fun collectScannedUrls(): List<String> {
    val chatgptOutputDir = File("step2_search_process/output/chatgpt")
    val files = chatgptOutputDir.listFiles()
    if (files == null || files.isEmpty()) {
        return emptyList()
    }
    return files.map { extractUrls(it) }.flatten()
}

private fun extractUrls(it: File) = it.readText().lines().take(5).filter { it.startsWith("http") }

fun createNextGptScannedResultsFile(nextUrls: List<String>) {
    val chatgptOutputDir = File("step2_search_process/output/chatgpt")
    val nextNumber = (chatgptOutputDir.listFiles()?.count { it.name.startsWith("chatgpt_scan_") && it.extension == "md" } ?: 0) + 1
    val nextNumberString = nextNumber.toString().padStart(3, '0')
    
    val file = File("step2_search_process/output/chatgpt/chatgpt_scan_$nextNumberString.md")
    assert(!file.exists())
    file.writeText(nextUrls.joinToString("\n"))

    val promptFile = File("step2_search_process/chatgpt/prompt.txt")
    val promptTemplate = promptFile.readText()
    val promptWithUrls = promptTemplate.replace("\$URLS\$", nextUrls.joinToString("\n"))
    println("Prompt for Chat-GPT:")
    println(promptWithUrls)

    // copy to clipboard
    val clipboard = java.awt.Toolkit.getDefaultToolkit().systemClipboard
    val selection = java.awt.datatransfer.StringSelection(promptWithUrls)
    clipboard.setContents(selection, selection)

    println("Prompt copied to clipboard")
}
