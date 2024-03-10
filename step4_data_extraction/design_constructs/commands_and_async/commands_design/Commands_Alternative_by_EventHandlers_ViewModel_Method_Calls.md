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


## Relates to

* [ViewModel_Independent_of_UI_Framework_Utility_Classes.md](ViewModel Independent of UI-Framework Utility Classes)
