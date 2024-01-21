package multivocal.chatgpt

import java.io.File

fun main() {
    val scans = collectAndParseScans()

    println("Scans with unsure answers:")
    scans
        .filterNot { it.category.contains("B") || it.category.contains("C") }
        .filter { it.chatGptAnswer.mightBeUnsure() }
        .forEach { println(it.websiteUrl) }
}

private fun String.mightBeUnsure() =
    this.contains("variation") ||
    this.contains("not part of the standard definition") ||
    this.contains("consider") && (this.contains("deviation") || this.contains("extension"))
