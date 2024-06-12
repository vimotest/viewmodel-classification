package step2_search_process

import papers.skip
import java.io.File

fun main() {
    val poolOfScholarEntriesCount = File("step2_search_process/output/papers/joined.csv").readText().countNonEmptyLinesWithoutHeader()
    val poolOfWebsiteEntriesCount = File("step2_search_process/output/chatgpt/chatgpt_scans.csv").readText().countNonEmptyLinesWithoutHeader()

    val relevantScholarEntiresCount = File("step2_search_process/scholar_searches/relevantPapers.csv").readText().countNonEmptyLinesWithoutHeader()

    val finalScholarEntriesCount = File("step2_search_process/output/papers/alreadyChecked.txt").readText().countNonEmptyLines()
    val finalWebsiteEntriesCount = File("step2_search_process/output/chatgpt/alreadyChecked.txt").readText().countNonEmptyLines()

    println("Pool of Scholar Entries: $poolOfScholarEntriesCount")
    println("Pool of Website Entries: $poolOfWebsiteEntriesCount")
    println("Relevant Scholar Entries: $relevantScholarEntiresCount")
    println("Final Scholar Entries: $finalScholarEntriesCount")
    println("Final Website Entries: $finalWebsiteEntriesCount")
}

fun String.countNonEmptyLinesWithoutHeader() = trim().lines().skip(1).count()
fun String.countNonEmptyLines() = trim().lines().count()
