package step2_search_process.papers.processing

import papers.getPaperUrl
import papers.getType
import papers.skip
import java.io.File

// each CSV file has the columns: Cites,Authors,Title,Year,Source,Publisher,ArticleURL,CitesURL,GSRank,QueryDate,Type,DOI,ISSN,CitationURL,Volume,Issue,StartPage,EndPage,ECC,CitesPerYear,CitesPerAuthor,AuthorCount,Age,Abstract,FullTextURL,RelatedURL
// the separator is a comma

fun main() {
    val file = File("step2_search_process/scholar_searches/relevantPapers.csv")
    file.readLines().skip(1).sortedBy { it.getType() }.forEach {
        val url = it.getPaperUrl()
        println(url)
    }
}

