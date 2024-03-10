# ViewModel has One View

## Summary
ViewModel has one View

## Details
A ViewModel does only have one View. This implies that it is not reused for different Views, especially not with different UI information layouts. However, we do still see the case that a ViewModel has one View, and the View is later reworked to another UI framework (see examples of "ViewModel has Many Views").

Note: this design construct does not restrict how many ViewModels the View can have.

## Resources
> Typically, one ViewModel is for one View, and this is the most common situation but not the only one allowed. (WinPhone8Essentials2013)


## Relates to

* [View_has_One_ViewModel.md](View has One ViewModel)
* [ViewModel_has_Many_Views.md](ViewModel has Many Views)
* [View_and_ViewModel_are_a_Tandem__one_to_one_relationship_.md](View and ViewModel are a Tandem (one-to-one relationship))
