# Localization in ViewModel

## Summary
The localization is orchestrated by the ViewModel

## Details
The ViewModel uses an UI-framework independent dictionary service or an abstraction to localize strings. The ViewModel therefore provides localized strings which the view can directly render.
The View might implement/provide the abstracted dictionary service via dependency injection to the ViewModel. Alternatively, the ViewModel could directly use UI-framework independent dictionary services if available.


## Relates to

* [Formatting_not_in_ViewModel.md](Formatting not in ViewModel)
* [Localization_in_View.md](Localization in View)
* [Static_Text_in_ViewModel.md](Static Text in ViewModel)
