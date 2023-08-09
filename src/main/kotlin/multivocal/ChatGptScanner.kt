package multivocal

import java.io.File

fun checkNextUrlChunkWithChatGPT(inputUrls: List<String>) {
    val nextUrls = next5ChatGptUrls(inputUrls)
    println("Next websites for Chat-GPT:")
    for (nextUrl in nextUrls) {
        println(nextUrl)
    }
    createNextGptScannedResultsFile(nextUrls)
}

private fun next5ChatGptUrls(inputUrls: List<String>): List<String> {
    val scannedUrl = collectScannedUrls().toSet()

    val results = mutableListOf<String>()
    for (url in inputUrls) {
        if (url in scannedUrl) {
            continue
        }
        results.add(url)
        if (results.size >= 5) {
            break
        }
    }
    return results
}

private fun collectScannedUrls(): List<String> {
    val chatgptOutputDir = File("output/chatgpt")
    val files = chatgptOutputDir.listFiles()
    if (files == null || files.isEmpty()) {
        return emptyList()
    }
    return files.map { extractUrls(it) }.flatten()
}

private fun extractUrls(it: File) = it.readText().lines().take(5).filter { it.startsWith("http") }

fun createNextGptScannedResultsFile(nextUrls: List<String>) {
    val chatgptOutputDir = File("output/chatgpt")
    val nextNumber = (chatgptOutputDir.listFiles()?.size ?: 0) + 1
    val nextNumberString = nextNumber.toString().padStart(3, '0')
    
    val file = File("output/chatgpt/chatgpt_scan_$nextNumberString.md")
    assert(!file.exists())
    file.writeText(nextUrls.joinToString("\n"))

    val promptFile = File("src/main/chatgpt/prompt.txt")
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
