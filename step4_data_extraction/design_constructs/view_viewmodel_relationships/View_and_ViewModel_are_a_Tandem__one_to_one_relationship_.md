# View and ViewModel are a Tandem (one-to-one relationship)

## Summary
View and ViewModel are developed and maintained together, in a 1:1 relationship.

## Details
View knows the public interface of a ViewModel and is kept together, developed together. This leads to a coupling between the View and ViewModel, such that the ViewModel cannot be re-used for other views.

## Resources
Resource: LinkedInMvvmTrend
> don’t try to create a ViewModel with a thought toward being able to reuse it for some other View (BeginningWin8AppXamlMvvm)


## Relates to

* [Reusable_and_View_Unaware_ViewModel.md](Reusable and View-Unaware ViewModel)
* [ViewModel_Only_Expose_Data_Needed_by_View.md](ViewModel Only Expose Data Needed by View)
* [View_has_One_ViewModel.md](View has One ViewModel)
* [ViewModel_has_One_View.md](ViewModel has One View)
