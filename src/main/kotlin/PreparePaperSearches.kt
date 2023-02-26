import java.io.File

// each CSV file has the columns: Cites,Authors,Title,Year,Source,Publisher,ArticleURL,CitesURL,GSRank,QueryDate,Type,DOI,ISSN,CitationURL,Volume,Issue,StartPage,EndPage,ECC,CitesPerYear,CitesPerAuthor,AuthorCount,Age,Abstract,FullTextURL,RelatedURL
// the separator is a comma

fun main() {
    val directoryOfCsvFiles = File("searches/raw/")
    val csvFiles = directoryOfCsvFiles.listFiles { _, name -> name.endsWith(".csv") }
    val joinedFile = File("output/joined.csv")
    joinedFile.delete()
    joinedFile.parentFile.mkdir()

    val mapOfPapersByTitle = mutableMapOf<String, String>()

    csvFiles?.forEach { csvFile ->
        csvFile.readLines().skip(1)
            .filter { it.includeReference() }
            .forEach { line ->
            val paperTitle = line.getTitle()
            if (!mapOfPapersByTitle.containsKey(paperTitle)) {
                mapOfPapersByTitle[paperTitle] = line
            }
        }
    }

    val stringBuilder = StringBuilder()
    stringBuilder.append("Cites,Authors,Title,Year,Source,Publisher,ArticleURL,CitesURL,GSRank,QueryDate,Type,DOI,ISSN,CitationURL,Volume,Issue,StartPage,EndPage,ECC,CitesPerYear,CitesPerAuthor,AuthorCount,Age,Abstract,FullTextURL,RelatedURL")
    stringBuilder.append("\n")
    mapOfPapersByTitle.values
        .sortedByDescending { it.getCiticationCount() }
        .forEach { line ->
        stringBuilder.append(line)
        stringBuilder.append("\n")
    }

    joinedFile.writeText(stringBuilder.toString())
    println("Successfully wrote ${mapOfPapersByTitle.size} papers to file: ${joinedFile.absolutePath}")
}

private fun String.getTitle() = this.getCsvCell(2).lowercase()
private fun String.getCiticationCount() = this.getCsvCell(0).toInt()
private fun List<String>.skip(numberOfLines: Int) = this.drop(numberOfLines)

private fun String.includeReference() =
    !titleContainsChineseOrCoreanOrJapaneseOrRussianCharacters(this) && titleReallyContainsRelevantWord(this)
private fun titleContainsChineseOrCoreanOrJapaneseOrRussianCharacters(line: String) = line.getTitle().any { it in '\u4e00'..'\u9fa5' || it in '\uac00'..'\ud7a3' || it in '\u3040'..'\u30ff' || it in '\u0400'..'\u04ff' }
private fun titleReallyContainsRelevantWord(line: String) = line.getTitle().lowercase().containsAnyOf("viewmodel", "view-model", "view model", "mvvm", "m-v-vm", "m-v-v-m")
private fun String.containsAnyOf(vararg words: String) = words.any { this.contains(it) }

private fun String.getCsvCell(index: Int): String {
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
            if (c.isLetterOrNumber()) {
                result.append(c)
            }
        }
    }

    return result.toString()
        .trim('\"')
        .replace("   ", " ".replace("  ", " "))
}

private fun Char.isLetterOrNumber() = this.isLetter() || this.isDigit()
