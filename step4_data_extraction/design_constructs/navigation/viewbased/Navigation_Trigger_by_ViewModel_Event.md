# Navigation Trigger by ViewModel Event

## Summary
ViewModels have events which trigger navigation.

## Details
The ViewModel triggers navigation by events - the view will listen to the events and perform then the navigation.
E.g., in C#, events are a language feature which can be used to trigger navigation, where the view listens to those events and performs the actual navigation.

## Resources
Example (BeginningWin8AppXamlStartViewModel)
ViewGenre: This event is raised by the ViewModel to indicate that a Genre has been selected and the UI should transition to GroupDetailPage.
ViewTitle: This event is raised by the ViewModel to indicate that a Title has been selected and the UI should transition to ItemDetailPage.

> There are many ways available to keep navigation code out of the ViewModel, and frameworks are available that handle this task in sophisticated manners. You will keep this application simple, however, by raising events from the ViewModel, which can be handled in the UI code of the application to perform navigation.


## Relates to

* [Navigation_in_View___Navigation_System.md](Navigation in View / Navigation System)
* [ViewModel_with_Events_Triggers.md](ViewModel with Events/Triggers)
* [MessageBox_by_Event.md](MessageBox by Event)

## Used By
* BookChapter: Beginning Windows 8 Application Development: XAML Edition: Starting the ViewModel

