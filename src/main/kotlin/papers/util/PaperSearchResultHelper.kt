package papers

internal fun String.getCiticationCount() = this.getCsvCell(0).toInt()
internal fun String.getAuthor() = this.getCsvCell(1, false)
internal fun String.getTitle() = this.getCsvCell(2, false)
internal fun String.getTitleLowerCaseLogical() = this.getCsvCell(2).lowercase()
internal fun String.getYear() = this.getCsvCell(3)
internal fun String.getType() = this.getCsvCell(10)
internal fun String.getDoi() = this.getCsvCell(11)
internal fun String.getPaperUrl(): String {
    var url = getCsvCell(6, false)
    if (url.isEmpty()) {
        url = getCsvCell(7, false)
    }
    if (url.isEmpty()) {
        url = getCsvCell(11, false)
    }
    if (url.isEmpty()) {
        url = getCsvCell(2, false)
    }
    return url
}

internal fun String.getCsvCell(index: Int, onlyAbcChars: Boolean = true): String {
    var currentIndex = 0
    val result = StringBuilder()

    var isInQuotes = false
    for (c in this) {
        if (!isInQuotes && c == '\"') {
            isInQuotes = true
        } else if (isInQuotes && c == '\"') {
            isInQuotes = false
        }
        if (c == ',' && !isInQuotes) {
            currentIndex++
        } else if (currentIndex == index) {
            if (!onlyAbcChars || c.isLetterOrNumber()) {
                result.append(c)
            }
        }
    }

    return result.toString()
        .trim('\"')
        .replace("   ", " ".replace("  ", " "))
}

private fun Char.isLetterOrNumber() = this.isLetter() || this.isDigit()

internal fun List<String>.skip(numberOfLines: Int) = this.drop(numberOfLines)
