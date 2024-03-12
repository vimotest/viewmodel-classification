package step2_search_process.multivocal

import step2_search_process.multivocal.chatgpt.chatgpParseScans
import step2_search_process.multivocal.chatgpt.checkNextUrlChunkWithChatGPT
import step2_search_process.multivocal.chatgpt.checkUnsureResults
import java.io.File

data class Website(val url: String, val name: String)

fun main(args: Array<String>) {
    if (args.size == 1 && args.first() == "chatgpt-next-chunk") {
        val inputUrls = collectAllInputUrls()
        checkNextUrlChunkWithChatGPT(inputUrls)
    } else if (args.size == 1 && args.first() == "chatgpt-scan-results") {
        chatgpParseScans()
    } else if (args.size == 1 && args.first() == "chatgpt-unsure-check") {
        checkUnsureResults()
    } else {
        println("Invalid args")
    }
}

private fun String.toUrl() = substringBefore("\t")
private fun String.toWebsiteName() = substringAfter("\t")

private fun containsChineseCharacters(line: String) = line.any { it in '\u4e00'..'\u9fa5' }

private fun collectAllInputUrls(): List<String> {
    val urls = mutableListOf<String>()
    iterateInputUrls {
        urls += it.url
        false
    }
    return urls
}

private fun iterateInputUrls(consumer: (Website) -> Boolean) {
    val files = File("step2_search_process/website_searches").listFiles()
    for (file in files) {
        for (line in file.readText().lines()) {
            if (containsChineseCharacters(line)) {
                continue
            }
            val stop = consumer(Website(line.toUrl(), line.toWebsiteName()))
            if (stop) {
                return
            }
        }
    }
}

