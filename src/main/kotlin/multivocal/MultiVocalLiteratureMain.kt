package multivocal

import java.io.File

data class Website(val url: String, val name: String)

fun main(args: Array<String>) {
    if (args.size == 1 && args.first() == "count") {
        val count = countAllUrls()
        val alreadyHandled = usedUrls.size
        println("$alreadyHandled of $count initially handled, remaining: ${count - alreadyHandled}")
        return
    }
    if (args.size == 1 && args.first() == "chatgpt") {
        checkNextUrlChunkWithChatGPT(collectAllInputUrls())
        return
    }
    val website = getNextUrl()
    if (website != null) {
        println("Next website: ${website.name} (${website.url})")
        addWebsiteToClassificationFile(website)
    } else {
        println("No more websites to check")
    }
}

private fun getNextUrl(): Website? {
    var result: Website? = null
    iterateInputUrls {
        val stop = !websiteIsAlreadyUsed(it)
        if (stop) {
            result = it
        }
        stop
    }
    return result
}

private fun websiteIsAlreadyUsed(website: Website) = usedUrls.contains(website.url)
private fun addWebsiteToClassificationFile(website: Website) {
    val file = File("site_initial_classification_multivocal.md")
    if (!file.readText().contains(website.url)) {
        file.appendText("|-|${website.name}|${website.url}|TODO| |\n")
    }
}

private val usedUrls : Set<String> by lazy {
    File("site_initial_classification_multivocal.md")
        .readText()
        .lines()
        .filter { it.matches("\\|[^|]+\\|[^|]+\\|[^|]+\\|\\s*(REJECT|REVIEW|ACCEPT|STANDARD_ACCEPT|SUBPAGE|DUPLICATE)\\s*\\|[^|]+\\|".toRegex()) }
        .map { it.split("|")[3].trim() }.toSet()
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

private fun countAllUrls(): Int {
    val urlSet = mutableSetOf<String>()
    iterateInputUrls {
        urlSet += it.url
        false
    }
    return urlSet.size
}

private fun iterateInputUrls(consumer: (Website) -> Boolean) {
    val files = File("input").listFiles()
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

