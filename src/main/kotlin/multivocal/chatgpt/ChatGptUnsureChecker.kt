package multivocal.chatgpt

import java.io.File

fun main() {
    val scans = collectAndParseScans()

    println("Scans with unsure answers:")
    scans
        .filterNot { it.category.contains("B") || it.category.contains("C") }
        .filter { it.chatGptAnswer.mightBeUnsure() }
        .forEach {
            println(it.websiteUrl)
            println("  " + it.chatGptAnswer.getUnsureLines().joinToString("\n  "))
        }
}

private fun String.mightBeUnsure() = getUnsureLines().isNotEmpty()
private fun String.getUnsureLines() = lines().filterNot { it.contains("overview table") } // filter out the overview table, which might be contained in the last part if not splitted correctly
.filter {
    it.contains("not part of the standard definition") ||
    it.contains("consider[^\\.]+(deviation|extension)".toRegex()) ||
    it.contains("additional[^\\.]+(challenges|drawbacks|benefits|advantages|insights)".toRegex())
}