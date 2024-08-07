# Input Validation only in Model (not in ViewModel)

## Summary
Input validation logic is only part of the model.

## Details
Input validation is not done in ViewModel, but only in model to improve reusability of validation.

## Resources
See ProCsWpf2017 "Anemic Models or Anemic View Models"


## Construct Type

**RestrictsStandardDefinition:** restricts standard MVVM rules

**Why:** Restricts "ViewModel might have additional validation logic" aspect



## Relates to

* [Input_Validation_only_in_ViewModel__not_in_Model_.md](Input Validation only in ViewModel (not in Model))

## Used By
* BookChapter: Pro C# 7: WPF Notifications, Validations, Commands, and MVVM

