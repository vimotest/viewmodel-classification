package papers.util

import papers.skip
import java.io.File

data class BibTexInfo(
    val authors: String,
    val title: String,
    val year: String,
    val publisher: String,
    val doi: String,
)

fun extractBibTex(basePath: String): List<BibTexInfo> {
    val allBibFiles = File(basePath).listFiles { _, name -> name.endsWith(".bib") }
    return allBibFiles?.flatMap { extractBibTexInfo(it) }?.distinctBy { it.doi } ?: emptyList()
}

private fun extractBibTexInfo(bibFile: File) = when {
    bibFile.name.contains("acm") -> extractBibTexInfoFromAcmExport(bibFile)
    bibFile.name.contains("ieee") -> extractBibTexInfoFromIeeeExport(bibFile)
    else -> throw IllegalArgumentException("Unknown bib file: ${bibFile.absolutePath}")
}

private fun extractBibTexInfoFromAcmExport(bibFile: File) =
    bibFile.readText().split("@inproceedings").skip(1).map { it.parseBibTexInfo("ACM") }

private fun extractBibTexInfoFromIeeeExport(bibFile: File) =
    bibFile.readText().split("@INPROCEEDINGS").skip(1).map { it.parseBibTexInfo("IEEE") }

private fun String.parseBibTexInfo(publisher: String) = BibTexInfo(
    authors = this.readProperty("author"),
    title = this.readProperty("title"),
    year = this.readProperty("year"),
    publisher = publisher,
    doi = this.readProperty("doi"),
)

private fun String.readProperty(propertyName: String): String {
    val simplified = this.replace(" = ", "=")
    val searchKey = " $propertyName={"

    val propertyStart = simplified.replace("\n", " ").indexOf(searchKey)
    if (propertyStart == -1) {
        return ""
    }
    val propertyEnd = simplified.indexOf("}", propertyStart)
    if (propertyEnd == -1) {
        throw IllegalArgumentException("Could not find end of property: $propertyName in string: $simplified")
    }
    return simplified.substring(propertyStart + searchKey.length, propertyEnd)
}
