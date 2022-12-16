package facade

import analyzer.RepositoryAnalyzer
import analyzer.RepositoryInfo
import analyzer.csharp.WindowsPresentationFrameworkAnalyzer

class ViewModelAnalyzer {

    fun analyzeRepository(filePath: String): RepositoryInfo {
        val repositoryAnalyzer = RepositoryAnalyzer(listOf(WindowsPresentationFrameworkAnalyzer()))
        return repositoryAnalyzer.analyze(filePath)
    }
}
