package step4_data_extraction

import papers.skip
import java.io.File

fun main() {
    val scansOverviewFile = File("step2_search_process/output/chatgpt/chatgpt_scans.csv")
    val alreadyScannedFile = File("step2_search_process/output/chatgpt/alreadyChecked.txt")

    val scansOverview = scansOverviewFile.readLines()
    val alreadyScanned = alreadyScannedFile.readLines().toSet()

    val nextScan = scansOverview.skip(1)
        .filter { !alreadyScanned.contains(it.url()) }
        .first { it.category().contains("B") || it.category().contains("C") }

    alreadyScannedFile.appendText("${nextScan.url()}\n")

    println("Next scan")
    println("${nextScan.url()}")
    println("${nextScan.category()}")
    printWhichScanFileHandlesUrl(nextScan.url(), nextScan.category())
}

private fun String.url() = this.split(";").first()
private fun String.category() = this.split(";").last()

private fun printWhichScanFileHandlesUrl(url: String, category: String) {
    val scanFiles = File("step2_search_process/output/chatgpt/").listFiles()!!
    val scanFile = scanFiles.first { it.extension == "md" && it.readText().contains(url) }
    println("In file: ${scanFile.name}")
    scanFile.printRelatedScanPartFileHandlesUrl(url, category)
}

private fun File.printRelatedScanPartFileHandlesUrl(url: String, category: String) {
    val lines = this.readLines()
    val i = lines.indexOf(url)
    val parts = this.readText().split("Used WebPilot")
    val relevantPart = parts[i+1].trim()
    println(relevantPart)

    val websiteInfosText = url + "\n" + category + "\n" + relevantPart

    // copy to clipboard
    val clipboard = java.awt.Toolkit.getDefaultToolkit().systemClipboard
    val selection = java.awt.datatransfer.StringSelection(websiteInfosText)
    clipboard.setContents(selection, selection)

    println(">>> Copied to clipboard")
}
