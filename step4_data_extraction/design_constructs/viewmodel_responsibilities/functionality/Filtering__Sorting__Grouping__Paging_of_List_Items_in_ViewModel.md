# Filtering, Sorting, Grouping, Paging of List Items in ViewModel

## Summary
The responsibility of Filtering, Sorting, Grouping, Paging is logic of the ViewModel.

## Details
Filtering, Sorting, Grouping, Paging of items displayed in a list is solved by exposing an intelligent structure from the ViewModel.
In .NET, this could be `PageCollectionView`.

## Resources
> Expose the collection from the ViewModel as a collection view, such as a PagedCollectionView, as detailed in Chapter 6. This will permit you to control the filtering, sorting, grouping, and paging of the data from the ViewModel by configuring these requirements on the collection view. (Anderson2012MvvmPattern)
