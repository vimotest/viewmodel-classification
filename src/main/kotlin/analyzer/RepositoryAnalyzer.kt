package analyzer

import java.io.File
import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths

class RepositoryAnalyzer(
    val frameworkAnalyzers: List<FrameworkSpecificAnalyzer>
) {
    fun analyze(repositoryUrl: String): RepositoryInfo {
        val repositoryName = repositoryUrl.substringAfterLast("/")

        var url = repositoryUrl
        if (url.contains("tree")) {
            url = repositoryUrl.replace("tree", "archive/refs/tags")
        }
        url += ".zip"

        cleanWorkDir()

        downloadFile(url, "./work/$repositoryName.zip")
        extractZip("./work/$repositoryName.zip", "./work/$repositoryName")

        val viewModelInfos = findViewModels("./work/$repositoryName")

        return RepositoryInfo(repositoryName, 0, viewModelInfos, repositoryUrl)
    }

    private fun findViewModels(filePath: String): List<ViewModelInfo> {
        val viewModelInfos = mutableListOf<ViewModelInfo>()

        frameworkAnalyzers.forEach { analyzer ->
            if (analyzer.isRepositoryUsingKnownFramework(filePath)) {
                viewModelInfos.addAll(analyzer.findViewModels(filePath))
            }
        }

        return viewModelInfos
    }

    private fun cleanWorkDir() {
        val workDir = File("./work")
        if (workDir.exists()) {
            workDir.deleteRecursively()
        }
        workDir.mkdir()
    }

    private fun downloadFile(url: String, fileName: String) {
        File(fileName).parentFile.mkdirs()
        URL(url).openStream().use { Files.copy(it, Paths.get(fileName)) }
    }

    private fun extractZip(fileName: String, outputDir: String) {
        val processBuilder = ProcessBuilder()
        if (System.getProperty("os.name").contains("Windows")) {
            processBuilder.command("powershell.exe", "-Command", "Expand-Archive", "-Path", fileName, "-DestinationPath", outputDir)
        } else {
            processBuilder.command("unzip", fileName, "-d", outputDir)
        }
        processBuilder
            .redirectError(ProcessBuilder.Redirect.INHERIT)
            .redirectOutput(ProcessBuilder.Redirect.INHERIT)
            .start()
            .waitFor()
    }

}