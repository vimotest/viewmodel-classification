# View has Many ViewModels

## Summary
One View can have many ViewModels

## Details
We see two possible alternatives here:
1) A more complex View simply uses multiple ViewModels for different parts of the View.
2) A View uses different ViewModels (not concurrently), to switch dynamic content. For example, a dynamic/generic Options View which displays generic OptionViewModels.

Note: this design construct does not restrict how many Views the ViewModel can have.


## Construct Type

**RestrictsStandardDefinition:** restricts standard MVVM rules

**Why:** Restrict "View/ViewModel relationship" aspect



## Relates to

* [View_has_One_ViewModel.md](View has One ViewModel)

## Used By
* Book: MVVM in Delphi
* Book: Windows Phone 8 Application Development Essentials (A practical guide to creating a Windows Phone 8 application using C#, XAML, and MVVM)

