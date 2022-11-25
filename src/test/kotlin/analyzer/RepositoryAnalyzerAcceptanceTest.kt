package analyzer

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RepositoryAnalyzerAcceptanceTest {
    private lateinit var inputUrl: String
    private lateinit var sut: RepositoryAnalyzer
    private lateinit var actual: RepositoryInfo

    @Test
    fun `GIVEN sample repository with ViewModel WHEN analyze THEN found 1 viewmodel`() {
        givenAnalyzerForUrl("https://github.com/Deadpikle/EasyBackup/tree/0.9.1")
        analyzeRepository()
        assertEquals(5, actual.viewModelInfos.size)
    }

    private fun givenAnalyzerForUrl(url: String) {
        sut = RepositoryAnalyzer()
        this.inputUrl = url
    }

    private fun analyzeRepository() {
        actual = sut.analyze(this.inputUrl)
    }
}