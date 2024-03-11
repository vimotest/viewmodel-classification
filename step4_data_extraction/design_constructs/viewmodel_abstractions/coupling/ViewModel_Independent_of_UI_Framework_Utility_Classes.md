# ViewModel Independent of UI-Framework Utility Classes

## Summary
ViewModels are kept free of UI-Framework specific Utility Classes.

## Details
As a stronger decoupling, the ViewModel shall be independent of any UI-framework dependent utility classes.
Example: ViewModel does not use WPF's ICommand or RelayCommand classes.
Motivation: the ViewModel is really independent of UI frameworks and those can be exchanged.

Example: this includes WPF-specific helper classes, which prevent a ViewModel to be reused for other UI-Frameworks, without modifying them.


## Relates to

* [Commands_Alternative_by_EventHandlers_ViewModel_Method_Calls.md](Commands Alternative by EventHandlers/ViewModel Method Calls)
* [Visibility_Enable_Types_as_Booleans.md](Visibility/Enable Types as Booleans)

## Used By
* Website: Reddit - "What is MVVM?"
* BookChapter: iOS Code Testing: The MVVM Architectural Pattern
* Paper: Applicability of the ViMoTest Approach for Automated GUI Testing: A Field Study

