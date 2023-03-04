package papers

import java.io.File

/**
 * Only for ad-hoc analyses purposes
 */
fun main() {
    val file = File("output/joined.csv")
    file.readLines().skip(1).sortedBy { it.getTitleLowerCaseLogical() }.forEach {
        val url = it.getPaperUrl()
        println("${it.getAuthor()} - ${it.getTitle()}: $url")
    }
}

