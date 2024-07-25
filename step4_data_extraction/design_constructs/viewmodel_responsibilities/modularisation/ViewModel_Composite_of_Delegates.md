# ViewModel Composite of Delegates

## Summary
ViewModel's presentation logic is shifted into helper classes.

## Details
The ViewModel extracts each relevant concern into a Delegate class. This mainly has the goal to make the ViewModel class free from concrete presentation logic, since it only has to call the right Delegate (or "Mini ViewModel").

## Resources
Resource: HalfbitCompositeViewModel

> in some cases, you may want to be able to invoke commands on one or more view models from a control in a parent view in the application's UI.
Resource: LearnMicrosoftAdvancedMvvmPrism


## Construct Type

**ExtendsStandardDefinition:** extends standard MVVM by new rules

**Why:** "ViewModel modularization" aspect not addressed in standard definition



## Relates to

* [MVVM_Controller__ViewModel_and_Controller.md](MVVM/Controller: ViewModel and Controller)

## Used By
* Website: Halfbit - Composite ViewModel
* Website: Microsoft Patterns & Practices - Advanced MVVM Scenarios Using the Prism Library
* BookChapter: Windows 8 MVVM Patterns Revealed: Implementing the ViewModel

