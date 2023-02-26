import java.io.File

// each CSV file has the columns: Cites,Authors,Title,Year,Source,Publisher,ArticleURL,CitesURL,GSRank,QueryDate,Type,DOI,ISSN,CitationURL,Volume,Issue,StartPage,EndPage,ECC,CitesPerYear,CitesPerAuthor,AuthorCount,Age,Abstract,FullTextURL,RelatedURL
// the separator is a comma

fun main() {
    val file = File("searches/relevantPapers.csv")
    file.readLines().skip(1).sortedBy { it.getType() }.forEach {
        var url = it.getCsvCell(6, false)
        if (url.isEmpty()) {
            url = it.getCsvCell(7, false)
        }
        if (url.isEmpty()) {
            url = it.getCsvCell(2, false)
        }
        println(url)
    }
}

private fun String.getAuthor() = this.getCsvCell(1)
private fun String.getTitle() = this.getCsvCell(2)
private fun String.getType() = this.getCsvCell(10)
private fun List<String>.skip(numberOfLines: Int) = this.drop(numberOfLines)

private fun String.getCsvCell(index: Int, onlyAbcChars: Boolean = true): String {
    var currentIndex = 0
    val result = StringBuilder()

    var isInQuotes = false
    for (c in this) {
        if (!isInQuotes && c == '\"') {
            isInQuotes = true
        } else if (isInQuotes && c == '\"') {
            isInQuotes = false
        }
        if (c == ',' && !isInQuotes) {
            currentIndex++
        } else if (currentIndex == index) {
            if (!onlyAbcChars || c.isLetterOrNumber()) {
                result.append(c)
            }
        }
    }

    return result.toString()
        .trim('\"')
        .replace("   ", " ".replace("  ", " "))
}

private fun Char.isLetterOrNumber() = this.isLetter() || this.isDigit()
