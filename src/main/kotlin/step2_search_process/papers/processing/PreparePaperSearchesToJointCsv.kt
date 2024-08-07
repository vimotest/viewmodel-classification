package step2_search_process.papers.processing

import papers.*
import papers.getAuthor
import papers.getCiticationCount
import papers.getTitleLowerCaseLogical
import papers.skip
import step2_search_process.papers.util.BibTexInfo
import step2_search_process.papers.util.extractBibTex
import java.io.File

// each CSV file has the columns: Cites,Authors,Title,Year,Source,Publisher,ArticleURL,CitesURL,GSRank,QueryDate,Type,DOI,ISSN,CitationURL,Volume,Issue,StartPage,EndPage,ECC,CitesPerYear,CitesPerAuthor,AuthorCount,Age,Abstract,FullTextURL,RelatedURL
// the separator is a comma

fun joinResultsToCsv() {
    val directoryOfCsvFiles = File("step2_search_process/scholar_searches/raw/")
    val csvFiles = directoryOfCsvFiles.listFiles { _, name -> name.endsWith(".csv") }!!.toList().sortedBy { it.name }
    val joinedFile = File("step2_search_process/output/papers/joined.csv")
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

    val entriesLowerCaseSoFar = stringBuilder.toString().lowercase()
    extractBibTex("step2_search_process/scholar_searches/raw/").forEach { bibTexInfo ->
        if (!entriesLowerCaseSoFar.contains(bibTexInfo.title.lowercase()) && !entriesLowerCaseSoFar.contains(bibTexInfo.doi)) {
            stringBuilder.append(bibTexInfo.toCsvLine())
        }
    }

    joinedFile.writeText(stringBuilder.toString())
    println("Successfully wrote ${mapOfPapersByTitle.size} papers to file: ${joinedFile.absolutePath}")

    println("\n\n")
    writeRelvantPapersCsv(stringBuilder.toString())
}

private fun BibTexInfo.toCsvLine() = "0,\"$authors\",\"$title\",$year,,\"$publisher\",,,,,,\"$doi\",,,,,,,,,,,,,,\n"

private fun writeRelvantPapersCsv(joinedCsv: String) {
    println("Now write relevantPapers.csv based on joined.csv and manually_excluded.txt")
    val manuallyExcludedFile = File("step2_search_process/scholar_searches/manuallyExcluded.txt")

    val manuallyExclusionCriteria = manuallyExcludedFile.readLines()
        .map { it.pickRelevantExclusionCriteria() }
        .toSet()

    val relevantLines = joinedCsv.lines().filterNot { it.isManuallyExcluded(manuallyExclusionCriteria) }
    val relevantPapersCsv = File("step2_search_process/scholar_searches/relevantPapers.csv")
    relevantPapersCsv.writeText(relevantLines.joinToString("\r\n"))

    println("Successfully wrote ${relevantLines.size-1} filtered papers to file: ${relevantPapersCsv.absolutePath}")
}

private fun String.isManuallyExcluded(manuallyExcluded: Set<String>) = manuallyExcluded.contains(this.pickRelevantExclusionCriteria())

private fun String.pickRelevantExclusionCriteria() = this.getAuthor() + "," + this.getTitle() + "," + this.getYear()

private fun String.includeReference() =
    !titleContainsChineseOrCoreanOrJapaneseOrRussianCharacters(this) && isRelevant()
private fun titleContainsChineseOrCoreanOrJapaneseOrRussianCharacters(line: String) = line.getTitleLowerCaseLogical().any { it in '\u4e00'..'\u9fa5' || it in '\uac00'..'\ud7a3' || it in '\u3040'..'\u30ff' || it in '\u0400'..'\u04ff' }
private fun String.reallyContainsRelevantWord() = this.lowercase().containsAnyOf("viewmodel", "view-model", " view model", "mvvm", "m-v-vm", "m-v-v-m", "model-view", "model-view-view model", "model view view model")
private fun String.containsAnyOf(vararg words: String) = words.any { this.contains(it) }

private fun String.isRelevant() =
    this.getTitle().reallyContainsRelevantWord()

private fun Char.isLetterOrNumber() = this.isLetter() || this.isDigit()
