# Nested ViewModel by Parent ViewModel Factory Method

## Summary
Nested ViewModels in a hierarchy are created by a factory method of the parent ViewModel.

## Details
A ViewModel which can be a parent of other ViewModels provides a method to create the child ViewModels.
For example, a PersonsViewModel provides a method accepting a person-ID `createDetailViewModel(id)`, which then returns a PersonDetailViewModel.

## Resources
E.g. (MishraMvvm2017)
```
MasterViewModel:
func viewModelForSelectedRow() -> ColorDetailViewModel? {}
...
MasterView:
let detailViewModel = viewModel.viewModelForSelectedRow()
```

## Used By
* Book: Pro WPF and Silverlight MVVM: Effective Application Development with Model-View-ViewModel
* Book: MVVM Survival Guide for Enterprise Architectures in Silverlight and WPF
* BookChapter: iOS Code Testing: The MVVM Architectural Pattern

