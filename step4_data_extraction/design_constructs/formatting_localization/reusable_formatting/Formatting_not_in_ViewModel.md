# Formatting not in ViewModel

## Summary
Formatting of information into the concrete presentation is done outside the ViewModel.

## Details
The ViewModel does not format information into the final presentation. E.g., a number is provided as an integer, not as the final string which is displayed in a label.

## Resources
ViewModel class shall not do data formatting, like (ManferdiniMvvmSwift):
* The numbers for upvotes and comments need decimal separators;
* We only need to show the domain name for a story, not its full URL;
* A story doesn’t have a date but shows how much time has passed since its submission.
> Some proponents of MVVM think that formatting code should go into view models. But that’s a mistake.

It shall be placed in a separate helper module to increase reusability. Then the view can use the simple helpers to format.


## Construct Type

**DivergentConstruct:** divergents an intention/tip of a standard MVVM rule

**Why:** "data-transformers" are intended in the ViewModel by standard definition



## Relates to

* [Localization_in_View.md](Localization in View)
* [Humble_View.md](Humble View)
* [Date_Formatting_in_ViewModel.md](Date Formatting in ViewModel)
* [Localization_in_ViewModel.md](Localization in ViewModel)
* [Number_Formatting_in_ViewModel.md](Number Formatting in ViewModel)

## Used By
* Website: Matteo Manferdini - MVVM Design Pattern in iOS with Swift
* Thesis: A comparison of native and multiplatform development of mobile applications following the MVVM pattern

