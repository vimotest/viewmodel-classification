package step2_search_process.papers.util

import papers.getCsvCell
import papers.getPaperUrl
import papers.getTitle
import java.io.File

fun main() {

    val file = File("searches/relevantPapers.csv")
    val result = mutableListOf<String>()
    var i = 0
    for (line in file.readText().lines()) {
        var resultLine = line;
        if (i >= 140 && line.isNotEmpty()) {
            val url = line.getPaperUrl()
            if (url.isEmpty() || url == line.getTitle()) {
                println("found empty URL: " + line)
                val urlInComment = line.getCsvCell(25, false)
                if (urlInComment.isNotEmpty()) {
                    val parts = line.split(",").toMutableList()
                    parts[6] = "\"" + urlInComment + "\""
                    resultLine = parts.joinToString(",")
                }
            }
        }
        result.add(resultLine)
        i++
    }

    File("searches/relevantPapers.csv").writeText(result.joinToString("\r\n"))
}