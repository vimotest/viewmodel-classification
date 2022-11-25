package analyzer

data class RepositoryInfo(
    val name: String,
    val stars: Int,
    val viewModelInfos: List<ViewModelInfo>,
    val url: String
)

data class ViewModelInfo(
    val name: String,
    val path: String
)
