package papers

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
            val paperTitle = line.getTitleLowerCaseLogical()
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

private fun String.includeReference() =
    !titleContainsChineseOrCoreanOrJapaneseOrRussianCharacters(this) && titleReallyContainsRelevantWord(this)
private fun titleContainsChineseOrCoreanOrJapaneseOrRussianCharacters(line: String) = line.getTitleLowerCaseLogical().any { it in '\u4e00'..'\u9fa5' || it in '\uac00'..'\ud7a3' || it in '\u3040'..'\u30ff' || it in '\u0400'..'\u04ff' }
private fun titleReallyContainsRelevantWord(line: String) = line.getTitle().lowercase().containsAnyOf("viewmodel", "view-model", "view model", "mvvm", "m-v-vm", "m-v-v-m", "model-view")
private fun String.containsAnyOf(vararg words: String) = words.any { this.contains(it) }


private fun Char.isLetterOrNumber() = this.isLetter() || this.isDigit()