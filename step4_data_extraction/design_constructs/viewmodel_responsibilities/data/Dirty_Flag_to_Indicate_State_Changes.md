# Dirty Flag to Indicate State Changes

## Summary
ViewModel uses a "dirty flag" to indicate if the state changed.

## Details
To get the information that a ViewModel's state has changed, a Dirty-Flag can be used which is set to true in every setter of other properties.

## Resources
ProCsWpf2017:
> dirty tracking (tracking when one or more of an object’s values have changed) is trivial. Add a bool property named IsChanged to the Inventory class. Make sure to call OnPropertyChanged() just like the other properties in the Inventory class.
