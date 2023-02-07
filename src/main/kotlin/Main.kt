import java.io.File

data class Website(val url: String, val name: String)

fun main(args: Array<String>) {
    val website = getNextUrl()
    if (website != null) {
        println("Next website: ${website.name} (${website.url})")
        addWebsiteToClassificationFile(website)
    } else {
        println("No more websites to check")
    }
}

private fun getNextUrl(): Website? {
    val files = File("input").listFiles()
    for (file in files) {
        for (line in file.readText().lines()) {
            if (containsChineseCharacters(line)) {
                continue
            }
            if (!lineIsAlreadyUsed(line)) {
                return Website(line.toUrl(), line.toWebsiteName())
            }
        }
    }
    return null
}

private fun addWebsiteToClassificationFile(website: Website) {
    val file = File("site_initial_classification.md")
    if (!file.readText().contains(website.url)) {
        file.appendText("|-|${website.name}|${website.url}|TODO|\n")
    }
}

private fun usedUrls() = emptySet<String>()

private fun lineIsAlreadyUsed(line: String) = usedUrls().contains(line.toUrl())

private fun String.toUrl() = substringBefore("\t")
private fun String.toWebsiteName() = substringAfter("\t")

private fun containsChineseCharacters(line: String) = line.any { it in '\u4e00'..'\u9fa5' }
