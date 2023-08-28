import chatgpt.ChatGptScan
import chatgpt.parseGptScan
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

class ChatGptScanParserTest {
    private lateinit var actual: List<ChatGptScan>

    @Test
    fun test() {
        val input = "output/chatgpt/chatgpt_scan_001.md"
        actual = parseGptScan(File(input))
        assertScans(
            "https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel" to "A*",
            "https://learn.microsoft.com/en-us/xamarin/xamarin-forms/enterprise-application-patterns/mvvm" to "A*",
            "https://www.geeksforgeeks.org/introduction-to-model-view-view-model-mvvm/" to "A/B",
            "https://www.techtarget.com/whatis/definition/Model-View-ViewModel" to "A*",
            "https://www.youtube.com/watch?v=fo6rvTP9kkc" to "D*",
        )
    }

    private fun assertScans(vararg expectedPairs: Pair<String, String>) {
        val expected = expectedPairs.map { (url, category) -> "$url:$category" }.joinToString("\n")
        val actual = actual.map { "${it.websiteUrl}:${it.category}" }.joinToString("\n")
        assertEquals(expected, actual)
    }
}
