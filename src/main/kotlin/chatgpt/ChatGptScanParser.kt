package chatgpt

import java.io.File

data class ChatGptScan(
    val fileName: String,
    val websiteUrl: String,
    val category: String)

fun parseGptScan(file: File): List<ChatGptScan> {
    return (1..5)
        .map { ChatGptScan("foo$it", "bar$it", "baz$it") }
}
