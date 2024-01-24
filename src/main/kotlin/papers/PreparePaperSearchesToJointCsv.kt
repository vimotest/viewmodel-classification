package papers

import papers.util.extractBibTex
import java.io.File

// each CSV file has the columns: Cites,Authors,Title,Year,Source,Publisher,ArticleURL,CitesURL,GSRank,QueryDate,Type,DOI,ISSN,CitationURL,Volume,Issue,StartPage,EndPage,ECC,CitesPerYear,CitesPerAuthor,AuthorCount,Age,Abstract,FullTextURL,RelatedURL
// the separator is a comma

fun main() {
    val directoryOfCsvFiles = File("searches/raw/")
    val csvFiles = directoryOfCsvFiles.listFiles { _, name -> name.endsWith(".csv") }!!.toList().sortedBy { it.name }
    val joinedFile = File("output/joined.csv")
    joinedFile.delete()
    joinedFile.parentFile.mkdir()

    val mapOfPapersByTitle = mutableMapOf<String, String>()

    csvFiles.forEach { csvFile ->
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

    extractBibTex("searches/raw/").forEach { bibTexInfo ->
        if (!stringBuilder.contains(bibTexInfo.doi)) {
            // stringBuilder.append(bibTexInfo.toCsvLine())
            // stringBuilder.append("\n")
            println("Found additional entry: $bibTexInfo")
        }
    }

    joinedFile.writeText(stringBuilder.toString())
    println("Successfully wrote ${mapOfPapersByTitle.size} papers to file: ${joinedFile.absolutePath}")

    println("\n\n")
    writeRelvantPapersCsv(stringBuilder.toString())
}

private fun writeRelvantPapersCsv(joinedCsv: String) {
    println("Now write relevantPapers.csv based on joined.csv and manually_excluded.txt")
    val manuallyExcludedFile = File("searches/manuallyExcluded.txt")

    val manuallyExclusionCriteria = manuallyExcludedFile.readLines()
        .map { it.pickRelevantExclusionCriteria() }
        .toSet()

    val relevantLines = joinedCsv.lines().filterNot { it.isManuallyExcluded(manuallyExclusionCriteria) }
    val relevantPapersCsv = File("searches/relevantPapers.csv")
    relevantPapersCsv.writeText(relevantLines.joinToString("\r\n"))

    println("Successfully wrote ${relevantLines.size-1} filtered papers to file: ${relevantPapersCsv.absolutePath}")
}

private fun String.isManuallyExcluded(manuallyExcluded: Set<String>) = manuallyExcluded.contains(this.pickRelevantExclusionCriteria())

private fun String.pickRelevantExclusionCriteria() = this.getAuthor() + "," + this.getTitle() + "," + this.getYear()

private fun String.includeReference() =
    !titleContainsChineseOrCoreanOrJapaneseOrRussianCharacters(this) && lineReallyContainsRelevantWord(this)
private fun titleContainsChineseOrCoreanOrJapaneseOrRussianCharacters(line: String) = line.getTitleLowerCaseLogical().any { it in '\u4e00'..'\u9fa5' || it in '\uac00'..'\ud7a3' || it in '\u3040'..'\u30ff' || it in '\u0400'..'\u04ff' }
private fun lineReallyContainsRelevantWord(line: String) = line.getTitle().lowercase().containsAnyOf("viewmodel", "view-model", "view model", "mvvm", "m-v-vm", "m-v-v-m", "model-view")
private fun String.containsAnyOf(vararg words: String) = words.any { this.contains(it) }


private fun Char.isLetterOrNumber() = this.isLetter() || this.isDigit()
