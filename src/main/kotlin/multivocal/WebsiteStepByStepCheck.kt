package multivocal

import papers.skip
import java.io.File

fun main() {
    val scansOverviewFile = File("output/chatgpt/chatgpt_scans.csv")
    val alreadyScannedFile = File("output/chatgpt/alreadyChecked.txt")

    val scansOverview = scansOverviewFile.readLines()
    val alreadyScanned = alreadyScannedFile.readLines().toSet()

    val nextScan = scansOverview.skip(1)
        .filter { !alreadyScanned.contains(it.url()) }
        .first { it.category().contains("B") || it.category().contains("C") }

    alreadyScannedFile.appendText("${nextScan.url()}\n")

    println("Next scan")
    println("${nextScan.url()}")
    println("${nextScan.category()}")
    printWhichScanFileHandlesUrl(nextScan.url())
}

private fun String.url() = this.split(";").first()
private fun String.category() = this.split(";").last()

private fun printWhichScanFileHandlesUrl(url: String) {
    val scanFiles = File("output/chatgpt/").listFiles()!!
    val scanFile = scanFiles.first { it.extension == "md" && it.readText().contains(url) }
    println("In file: ${scanFile.name}")
    scanFile.printRelatedScanPartFileHandlesUrl(url)
}

private fun File.printRelatedScanPartFileHandlesUrl(url: String) {
    val lines = this.readLines()
    val i = lines.indexOf(url)
    val parts = this.readText().split("Used WebPilot")
    val relevantPart = parts[i+1].trim()
    println(relevantPart)

    val websiteInfosText = url + "\n" + relevantPart

    // copy to clipboard
    val clipboard = java.awt.Toolkit.getDefaultToolkit().systemClipboard
    val selection = java.awt.datatransfer.StringSelection(websiteInfosText)
    clipboard.setContents(selection, selection)

    println(">>> Copied to clipboard")
}
