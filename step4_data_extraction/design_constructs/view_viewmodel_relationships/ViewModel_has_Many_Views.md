# ViewModel has Many Views

## Summary
ViewModel can have many Views.

## Details
A ViewModel can have many Views. In our interpretation, this means:
The ViewModel is more abstract (reusable) and can be used for different Views.
An example would be wizards, where one wizard ViewModel is used for different wizard-pages.

It could also mean, that a View is used on two different UI frameworks (e.g., Android and iOS), but with the very same information structure (i.e., same mockup realized on two UI frameworks). This is similar to a situation, where a View is reworked in a new UI framework, while the ViewModel stays the same (e.g., a WinForms GUI is reworked to an equivalent WPF GUI). 

Note: this design construct does not restrict how many ViewModels the View can have.

## Resources
> In some scenarios, you may have one ViewModel that serves multiple views, such as a wizard. In this
case, the ViewModel-first approach might be best. (Anderson2012MvvmPattern)


## Relates to

* [ViewModel_as_State_Share.md](ViewModel as State Share)
* [ViewModel_has_One_View.md](ViewModel has One View)
* [Reusable_and_View_Unaware_ViewModel.md](Reusable and View-Unaware ViewModel)
