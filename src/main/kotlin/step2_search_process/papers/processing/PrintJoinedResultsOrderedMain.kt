package step2_search_process.papers.processing

import papers.*
import papers.getAuthor
import papers.getPaperUrl
import papers.getTitleLowerCaseLogical
import papers.skip
import java.io.File

/**
 * Only for ad-hoc analyses purposes
 */
fun main() {
    val file = File("step2_search_process/output/papers/joined.csv")
    file.readLines().skip(1).sortedBy { it.getTitleLowerCaseLogical() }.forEach {
        val url = it.getPaperUrl()
        println("${it.getAuthor()} - ${it.getTitle()}: $url")
    }
}

