# Visibility/Enable Types as Booleans

## Summary
ViewModel fields for visibilities and sensitivities are using boolean types.

## Details
If the ViewModel controls visibilities or enable/disable states, then it shall not expose "Visibility" or "EnableMode" enums based on frameworks, instead it simply exposes booleans. The view is responsible to convert those to the required enums.

## Resources
See: Anderson2012MvvmPattern p514 "How Do I Enable/Disable Controls?" / "How Do I Show/Hide Controls?"


## Relates to

* [ViewModel_Independent_of_UI_Framework_Utility_Classes.md](ViewModel Independent of UI-Framework Utility Classes)
