package analyzer

import java.io.File
import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths
import java.util.zip.ZipFile

class RepositoryAnalyzer {
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
        File(filePath).walkTopDown().forEach {
            if (it.isFile && it.name.contains("ViewModel")) {
                viewModelInfos.add(ViewModelInfo(it.name, it.path))
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
/*        ZipFile(fileName).use { zip ->
            zip.entries().asSequence().forEach { entry ->
                zip.getInputStream(entry).use { input ->
                    val targetFile = File("$outputDir/${entry.name}")
                    targetFile.parentFile.mkdirs()
                    targetFile.outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
            }
        }*/
        ProcessBuilder()
            .command("unzip", fileName, "-d", outputDir)
            .redirectError(ProcessBuilder.Redirect.INHERIT)
            .redirectOutput(ProcessBuilder.Redirect.INHERIT)
            .start()
            .waitFor()
    }

}