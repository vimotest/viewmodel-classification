package papers

import java.io.File

data class Paper(val url: String, val name: String)

fun main(args: Array<String>) {
    if (args.size == 1 && args.first() == "count") {
        val count = countAllUrls()
        val alreadyHandled = usedUrls.size
        println("$alreadyHandled of $count initially handled, remaining: ${count - alreadyHandled}")
        return
    }
    val paper = getNextUrl()
    if (paper != null) {
        println("Next paper: ${paper.name} (${paper.url})")
        addPaperToClassificationFile(paper)
    } else {
        println("No more papers to check")
    }
}

private fun getNextUrl(): Paper? {
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
private fun paperIsAlreadyUsed(paper: Paper) = usedUrls.contains(paper.url)

private fun addPaperToClassificationFile(paper: Paper) {
    val file = File("site_initial_classification_papers.md")
    if (!file.readText().contains(paper.url)) {
        file.appendText("|-|${paper.name}|${paper.url}|TODO| |\n")
    }
}

private val usedUrls : Set<String> by lazy {
    File("site_initial_classification_papers.md")
        .readText()
        .lines()
        .filter { it.matches("\\|[^|]+\\|[^|]+\\|[^|]+\\|\\s*(REJECT|REVIEW|ACCEPT|STANDARD_ACCEPT)\\s*\\|[^|]+\\|".toRegex()) }
        .map { it.split("|")[3].trim() }.toSet()
}

private fun String.toUrl() = getPaperUrl()
private fun String.toPaperName() = getTitle()

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
        val stop = consumer(Paper(line.toUrl(), line.toPaperName()))
        if (stop) {
            return
        }
    }
}

