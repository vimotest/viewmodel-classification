package step4_data_extraction

import papers.skip
import java.io.File

fun main() {
    val classificationFile = File("step2_search_process/output/papers/site_initial_classification_papers.md")
    val alreadyScannedFile = File("step2_search_process/output/papers/alreadyChecked.txt")

    val markdownLines = classificationFile.readLines()
    val alreadyScanned = alreadyScannedFile.readLines().toSet()

    val nextEntry = markdownLines.skip(6)
        .filter { !alreadyScanned.contains(it.url()) }
        .firstOrNull { it.classification() == "ACCEPT" }
    if (nextEntry == null) {
        println("No more scholar entries to check")
        return
    }

    alreadyScannedFile.appendText("${nextEntry.url()}\n")

    println("Next paper entry")
    println("${nextEntry.url()}")
    println("${nextEntry.title()}")
    printEntryIntoClipboard(nextEntry)
}

private fun String.key() = this.split("|").get(0+1).trim()
private fun String.title() = this.split("|").get(1+1).trim()
private fun String.entryType() = this.split("|").get(2+1).trim()
private fun String.url() = this.split("|").get(3+1).trim()
private fun String.classification() = this.split("|").get(4+1).trim()
private fun String.reason() = this.split("|").get(5+1).trim()

private fun printEntryIntoClipboard(nextEntry: String) {
    val entryInfoText = nextEntry.key() + "\n" +
            nextEntry.title() + "\n" +
            nextEntry.entryType() + "\n" +
            nextEntry.url() + "\n" +
            nextEntry.classification() + "\n" +
            nextEntry.reason()

    // copy to clipboard
    val clipboard = java.awt.Toolkit.getDefaultToolkit().systemClipboard
    val selection = java.awt.datatransfer.StringSelection(entryInfoText)
    clipboard.setContents(selection, selection)

    println(">>> Copied to clipboard")
    println("```")
    println(entryInfoText)
    println("```")
}
