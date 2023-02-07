package export

import analyzer.RepositoryInfo

class RepositoryInfoTabularizer {
    fun convertToTable(repositoryInfos: List<RepositoryInfo>): Table {
        val headers = listOf(
            "Application",
            "ViewModel Link",
            "View Link",
            "Kind of ViewModel",
            "1/2-way binding",
            "Granularity",
            "VM/Model Separation",
            "Async",
            "UI-framework agnostic",
            "Use Button",
            "Use Label",
            "Use Checkbox",
            "Use TextBox",
            "Use Radio-Btn",
            "Use Table",
            "Use Lists"
        )
        val rows = repositoryInfos.flatMap { repositoryInfo ->
            repositoryInfo.viewModelInfos.map { viewModelInfo ->
                listOf(
                    repositoryInfo.name,
                    viewModelInfo.path,
                    viewModelInfo.relatedViewFilePath ?: ""
                )
            }
        }
        return Table(headers, rows)
    }
}