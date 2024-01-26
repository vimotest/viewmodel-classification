package papers

import java.io.File

data class Paper(val url: String, val name: String, val type: String)

fun main(args: Array<String>) {
    if (args.size == 1 && args.first() == "count") {
        val count = countAllUrls()
        val alreadyHandled = usedUrls.size
        println("$alreadyHandled of $count initially handled, remaining: ${count - alreadyHandled}")
        return
    }
    val paper = getNextPaper()
    if (paper != null) {
        println("Next paper: ${paper.name} <${paper.type}> (${paper.url})")
        addPaperToClassificationFile(paper)
    } else {
        println("No more papers to check")
    }
}

private fun getNextPaper(): Paper? {
    var result: Paper? = null
    iterateInputUrls {
        val stop = !paperIsAlreadyUsed(it)
        if (stop) {
            result = it
        }
        stop
    }
    return result
}
private fun paperIsAlreadyUsed(paper: Paper) =
    usedUrls.contains(paper.url) ||
    usedTitles.contains(paper.url) // some entries do not have a URL (they store the title as a fallback into .url), then we have to use the title

private fun addPaperToClassificationFile(paper: Paper) {
    val file = File("site_initial_classification_papers.md")
    if (!file.readText().contains(paper.url)) {
        file.appendText("|-|${paper.name}|${paper.type}|${paper.url}|TODO| |\n")
    }
}

private val usedUrls : Set<String> by lazy {
    getUsedInitialClassificationLines()
        .map { it.split("|")[4].trim() }.toSet()
}

private val usedTitles : Set<String> by lazy {
    getUsedInitialClassificationLines()
        .map { it.split("|")[2].trim() }.toSet()
}

private fun getUsedInitialClassificationLines() = File("site_initial_classification_papers.md")
    .readText()
    .lines()
    .filter { it.matches("\\|[^|]+\\|[^|]+\\|[^|]+\\|[^|]+\\|\\s*(REJECT|REVIEW|ACCEPT|STANDARD_ACCEPT|DUPLICATE)\\s*\\|[^|]+\\|".toRegex()) }


private fun String.toUrl() = getPaperUrl()
private fun String.toPaperName() = getTitle()
private fun String.toUrlType() = getType().takeIf { it.isNotBlank() } ?: "DEFAULT"

private fun countAllUrls(): Int {
    val urlSet = mutableSetOf<String>()
    iterateInputUrls {
        urlSet += it.url
        false
    }
    return urlSet.size
}

private fun iterateInputUrls(consumer: (Paper) -> Boolean) {
    val file = File("searches/relevantPapers.csv")
    for (line in file.readText().lines().drop(1)) {
        val stop = consumer(Paper(line.toUrl(), line.toPaperName(), line.toUrlType()))
        if (stop) {
            return
        }
    }
}

