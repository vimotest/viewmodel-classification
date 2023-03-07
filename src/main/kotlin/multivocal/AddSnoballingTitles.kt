package multivocal

import java.io.File
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val snowballingFile = File("input/snowballing.txt")
    val lines = snowballingFile.readLines()
    val newLines = lines.map { line ->
        if (line.contains("\t")) {
            line
        } else {
            val title = line.requestTitleOfHtmlPage()
            "$line\t$title"
        }
    }
    snowballingFile.writeText(newLines.joinToString("\n"))
}

private fun String.requestTitleOfHtmlPage(): String {
    println("Requesting title of $this")
    val url = this

    val urlConnection = URL(url).openConnection() as HttpURLConnection
    urlConnection.connectTimeout = 1000
    urlConnection.readTimeout = 1000

    try {
        val html = urlConnection.inputStream.bufferedReader().readText()
        val title = html.substringAfter("<title>").substringBefore("</title>")
        return title
    } finally {
        urlConnection.disconnect()
    }
}
