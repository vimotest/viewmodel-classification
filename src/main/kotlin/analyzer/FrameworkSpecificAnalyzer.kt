package analyzer

interface FrameworkSpecificAnalyzer {
    fun isRepositoryUsingKnownFramework(filePath: String): Boolean
    fun findViewModels(filePath: String): List<ViewModelInfo>
}