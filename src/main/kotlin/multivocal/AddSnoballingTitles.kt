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
            if (title == null) {
                line
            } else {
                "$line\t$title"
            }
        }
    }
    snowballingFile.writeText(newLines.joinToString("\n"))
}

private fun String.requestTitleOfHtmlPage(): String? {
    println("Requesting title of $this")
    val url = this

    HttpURLConnection.setFollowRedirects(true)
    val urlConnection = URL(url).openConnection() as HttpURLConnection
    urlConnection.instanceFollowRedirects = true
    urlConnection.connectTimeout = 1000
    urlConnection.readTimeout = urlConnection.connectTimeout
    urlConnection.requestMethod = "GET"

    try {
        val html = urlConnection.inputStream.bufferedReader().readText()
        if (urlConnection.responseCode == HttpURLConnection.HTTP_OK && html.contains("<title>")) {
            val title = html.substringAfter("<title>").substringBefore("</title>")
            println("-> $title")
            return title
        }
        if (urlConnection.responseCode == HttpURLConnection.HTTP_MOVED_TEMP || urlConnection.responseCode == HttpURLConnection.HTTP_MOVED_PERM) {
            val newUrl = urlConnection.getHeaderField("Location")
            println("-> Redirected to $newUrl")
            return newUrl.requestTitleOfHtmlPage()
        }
        return null
    } catch (e: Exception) {
        println("-> ERROR: ${e.message}")
        return null
    } finally {
        urlConnection.disconnect()
    }
}
