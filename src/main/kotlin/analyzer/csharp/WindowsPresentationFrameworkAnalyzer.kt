package analyzer.csharp

import analyzer.FrameworkSpecificAnalyzer
import analyzer.ViewModelInfo
import java.io.File

class WindowsPresentationFrameworkAnalyzer : FrameworkSpecificAnalyzer {
    override fun isRepositoryUsingKnownFramework(filePath: String): Boolean {
        return findAnyXamlFile(filePath)
    }

    private fun findAnyXamlFile(filePath: String) =
        File(filePath).walkTopDown().any { it.isFile && it.name.endsWith(".xaml") }

    override fun findViewModels(filePath: String): List<ViewModelInfo> {
        val viewFiles = mutableSetOf<String>()

        val viewModelInfos = mutableListOf<ViewModelInfo>()
        File(filePath).walkTopDown().forEach {
            if (it.isFile) {
                if (it.name.lowercase().contains("viewmodel") &&
                    !it.readText().contains("interface ${it.nameWithoutExtension}")) {
                    viewModelInfos.add(ViewModelInfo(it.name, it.path))
                } else if (it.name.endsWith(".xaml")) {
                    viewFiles.add(it.name)
                }
            }
        }

        viewModelInfos.forEach { info ->
            val baseName = info.name.lowercase().substringBefore("viewmodel")
            viewFiles.forEach { viewFile ->
                if (viewFile.lowercase().contains(baseName)) {
                    info.relatedViewFilePath = viewFile
                }
            }
        }

        return viewModelInfos
    }
}