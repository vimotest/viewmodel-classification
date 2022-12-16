package analyzer

import facade.ViewModelAnalyzer
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ViewModelAnalyzerAcceptanceTest {
    private lateinit var inputUrl: String
    private lateinit var sut: ViewModelAnalyzer
    private lateinit var actual: RepositoryInfo

    @Test
    fun `GIVEN sample repository with ViewModel WHEN analyze THEN found 1 viewmodel`() {
        givenAnalyzerForUrl("https://github.com/Deadpikle/EasyBackup/tree/0.9.1")
        analyzeRepository()
        assertEquals(listOf(
            ViewModelInfo("BackupInProgressVIewModel.cs", "./work/0.9.1/EasyBackup-0.9.1/EasyBackup/ViewModels/BackupInProgressVIewModel.cs", "BackupInProgress.xaml"),
            ViewModelInfo("BaseViewModel.cs", "./work/0.9.1/EasyBackup-0.9.1/EasyBackup/ViewModels/BaseViewModel.cs", null),
            ViewModelInfo("ExcludeFilesFoldersViewModel.cs", "./work/0.9.1/EasyBackup-0.9.1/EasyBackup/ViewModels/ExcludeFilesFoldersViewModel.cs", "ExcludeFilesFolders.xaml"),
            ViewModelInfo("MainWindowViewModel.cs", "./work/0.9.1/EasyBackup-0.9.1/EasyBackup/ViewModels/MainWindowViewModel.cs", "MainWindow.xaml"),
            ViewModelInfo("SetupBackupViewModel.cs", "./work/0.9.1/EasyBackup-0.9.1/EasyBackup/ViewModels/SetupBackupViewModel.cs", "SetupBackup.xaml"),
        ), actual.viewModelInfos.sortedBy { it.name })
    }

    private fun givenAnalyzerForUrl(url: String) {
        sut = ViewModelAnalyzer()
        this.inputUrl = url
    }

    private fun analyzeRepository() {
        actual = sut.analyzeRepository(this.inputUrl)
    }
}