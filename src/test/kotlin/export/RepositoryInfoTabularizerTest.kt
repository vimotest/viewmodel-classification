package export

import analyzer.RepositoryInfo
import analyzer.ViewModelInfo
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RepositoryInfoTabularizerTest {
    private lateinit var actual: Table

    @Test
    fun `GIVEN no repository info WHEN tabularize THEN return table with columns`() {
        val input = emptyList<RepositoryInfo>()
        val sut = RepositoryInfoTabularizer()
        actual = sut.convertToTable(input)
        assertTable("""
            |Application|ViewModel Link|View Link|Kind of ViewModel|1/2-way binding|Granularity|VM/Model Separation|Async|UI-framework agnostic|Use Button|Use Label|Use Checkbox|Use TextBox|Use Radio-Btn|Use Table|Use Lists|
        """.trimIndent())
    }
    @Test
    fun `GIVEN one repository info with two viewmodel infos WHEN tabularize THEN return table of three rows`() {
        val input = listOf(
            RepositoryInfo(
                "MyRepo",
                0,
                listOf(
                    ViewModelInfo("MyViewModel1.cs", "MyViewModel1.cs", "MyView1.xaml"),
                    ViewModelInfo("MyViewModel2.cs", "MyViewModel2.cs", "MyView2.xaml")
                ),
                "https://repo")
        )
        val sut = RepositoryInfoTabularizer()
        actual = sut.convertToTable(input)
        assertTable("""
            |Application|              ViewModel Link|                     View Link|*
            |MyRepo     |https://repo/vm/ViewModel.cs|https://repo/view/MyView1.xaml|*
        """.trimIndent())
    }

    private fun assertTable(expected: String) {
        val expectedTrimmed =
            expected.lines().map {
                it.split("|").map { it.trim() }
            }.joinToString("\n") {
                it.joinToString("\n")
            }

        assertEquals(expectedTrimmed, actual.toString())
    }
}
