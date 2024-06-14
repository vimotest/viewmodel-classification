# Commands Alternative by EventHandlers/ViewModel Method Calls

If no dedicated Command classes are available/implemented, then they can be simply replaced by a usual event handler which then calls the appropriate method on the ViewModel.
Example (MvvmInSilverlight)
```cs
void genreComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
{
 string item = genreComboBox.SelectedItem as string;
 if (item != null)
 {
   LoadGames(item);
 }
}
void LoadGames(string genre)
{
 loadingBar.Visibility = Visibility.Visible;
 if (genre == "(All)")
 {
   viewModel.LoadGames();
 }
 else
 {
   viewModel.LoadGamesByGenre(genre);
 }
}
```


## Construct Type

**RealizationGuideline:** realization guideline for an aspect mentioned by the MVVM standard rules

**Why:** "commands" aspect mentioned in standard definition



## Relates to

* [ViewModel_Independent_of_UI_Framework_Utility_Classes.md](ViewModel Independent of UI-Framework Utility Classes)

## Used By
* BookChapter: Pro Business Applications with Silverlight 5: The Model-View-ViewModel (MVVM) Design Pattern
* Book: Developer's Guide to Microsoft Prism 4: Building Modular MVVM Applications with Windows Presentation Foundation and Microsoft Silverlight
* TechnicalReport: Model-View-ViewModel In Silverlight 2 Apps
* TechnicalReport: Modern Approaches to Android APP Architecture: MVVM, MVP, VIPER

