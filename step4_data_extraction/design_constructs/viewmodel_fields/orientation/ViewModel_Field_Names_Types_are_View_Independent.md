# ViewModel Field Names/Types are View Independent

## Summary
The names and types of ViewModel fields are view independent.

## Details
The ViewModel fields shall be mostly View unaware, hence the naming and types are kept independent of the view.
The goal is that the fields are more abstract and generic, supporting reusability and flexibility regarding views.

## Resources
"Good ViewModel design dictates that a ViewModel should expose state-related data, rather than view-
specific data—both naming-wise and data type–wise. For example, instead of exposing a property named
SaveButtonEnabled, a better name would be the more generic CanSave. As another example, say you have a
details panel on your view that you want displayed only once the data has been retrieved from the server. Instead
of exposing a property named DetailsPanelVisibility of type Visibility from your ViewModel, expose a
property named AreDetailsLoaded of type boolean. The details panel in the view can then bind its Visibility
property to the AreDetailsLoaded property on the ViewModel, using a value converter to convert the value from a
boolean to a Visibility enumeration value. It may seem like more work, but following a less view-specific nam-
ing and data type strategy enables the ViewModel to be much more generic and reusable." (Anderson2012MvvmPattern)


## Relates to

* [ViewModel_Field_Names_Types_are_View_Oriented.md](ViewModel Field Names/Types are View Oriented)
* [Reusable_and_View_Unaware_ViewModel.md](Reusable and View-Unaware ViewModel)
* [Humble_View.md](Humble View)
