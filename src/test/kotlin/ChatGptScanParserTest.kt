import chatgpt.ChatGptScan
import chatgpt.parseGptScan
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

class ChatGptScanParserTest {
    private lateinit var actual: List<ChatGptScan>

    @Test
    fun testFile001() {
        val input = "output/chatgpt/chatgpt_scan_001.md"
        actual = parseGptScan(File(input))
        assertScans(
            "https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel -> Wikipedia - Model–view–viewmodel" to "A*",
            "https://learn.microsoft.com/en-us/xamarin/xamarin-forms/enterprise-application-patterns/mvvm -> Microsoft - Xamarin.Forms MVVM" to "A*",
            "https://www.geeksforgeeks.org/introduction-to-model-view-view-model-mvvm/ -> GeeksforGeeks - Introduction to Model View View Model (MVVM)" to "A/B",
            "https://www.techtarget.com/whatis/definition/Model-View-ViewModel -> TechTarget - Model-View-ViewModel (MVVM)" to "A*",
            "https://www.youtube.com/watch?v=fo6rvTP9kkc -> YouTube - What is MVVM (Model-View-ViewModel) Pattern? by Programming with Mosh" to "D*",
        )
    }
    @Test
    fun testFile002() {
        val input = "output/chatgpt/chatgpt_scan_002.md"
        actual = parseGptScan(File(input))
        assertScansContains(
            "https://www.atmosera.com/blog/model-view-viewmodel-mvvm-explained/ -> Atmosera" to "A*"
        )
    }
    @Test
    fun testFile024() {
        val input = "output/chatgpt/chatgpt_scan_024.md"
        actual = parseGptScan(File(input))
        assertScansContains(
            "https://canjs.com/doc/can-component.prototype.ViewModel.html" to "B*",
        )
    }
    @Test
    fun testFile034() {
        val input = "output/chatgpt/chatgpt_scan_034.md"
        actual = parseGptScan(File(input))
        assertScansContains(
            "https://en.wiktionary.org/wiki/view_model" to "D",
        )
    }
    @Test
    fun testFile041() {
        val input = "output/chatgpt/chatgpt_scan_041.md"
        actual = parseGptScan(File(input))
        assertScans(
            "https://deutschergrossspitz.de/tf2-viewmodel-mod.html" to "D",
            "https://books.google.com/books?id=USXsDwAAQBAJ&pg=PA242&lpg=PA242&dq=viewmodel&source=bl&ots=iRVMxIRu9r&sig=ACfU3U3mddQ8CTP_DwbaMKnj6HFU2uh1Jw&hl=de&sa=X&ved=2ahUKEwjkp7_HmoT9AhWai_0HHVYRDf44ZBDoAXoFCNgBEAM" to "D",
            "https://amitshekhar.me/blog/mvvm-architecture-android" to "A*",
            "https://blog.fossasia.org/handling-configuration-changes-by-implementing-viewmodels-in-the-open-event-android-app/" to "A*",
            "https://tickets.summitov.com/webstore/shop/viewItems.aspx?CG=romance&C=romance" to "D",
        )
    }

    private fun assertScans(vararg expectedPairs: Pair<String, String>) {
        val expected = expectedPairs.map { (url, category) -> "$url:$category" }.joinToString("\n")
        val forceUrlOnly = !expected.contains(" -> ")
        val actual = actual.map { "${it.toUrlWithName(forceUrlOnly)}:${it.category}" }.joinToString("\n")
        assertEquals(expected, actual)
    }

    private fun assertScansContains(expectedPair: Pair<String, String>) {
        val expected = expectedPair.let { (url, category) -> "$url:$category" }
        val forceUrlOnly = !expected.contains(" -> ")
        val actual = actual.map { "${it.toUrlWithName(forceUrlOnly)}:${it.category}" }
        assert(actual.contains(expected)) { "Expected $expected in $actual" }
    }

    private fun ChatGptScan.toUrlWithName(forceUrlOnly: Boolean = false) = if (websiteName.isEmpty() || forceUrlOnly) websiteUrl else "$websiteUrl -> $websiteName"
}
