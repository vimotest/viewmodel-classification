# Joint/Composite ViewModel Fields

## Summary
ViewModel uses joint and composed fields for structured data.

## Details
Instead of designing fine-grained ViewModel fields like one for a user's name and one for the user's mail, the ViewModel field shall be a composite as DisplayableUser

## Resources
Example:
> if we need to display the name and the email address of a User, rather than creating two streams for this, we create a DisplayableUser object (MediumAndroidPatternsMvvm)


## Construct Type

**ExtendsStandardDefinition:** extends standard MVVM by new rules

**Why:** "ViewModel field design" aspect not addressed in standard definition



## Relates to

* [Reusable_and_View_Unaware_ViewModel.md](Reusable and View-Unaware ViewModel)

## Used By
* Website: Medium - Android Architecture Patterns Part 3: Model-View-ViewModel
* Website: r.je - MVVM, MVC it's all just roman numerals to me

