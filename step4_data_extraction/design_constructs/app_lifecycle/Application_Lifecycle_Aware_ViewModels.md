# Application Lifecycle Aware ViewModels

## Summary
ViewModels are aware of application lifecycle aspects.

## Details
E.g., a ViewModel has methods to initialize, load or unload. It might also have methods to explicitly save the state to a bundle, or reload state back from a bundle.

## Resources
Resource MvvmCross: (MvvmCrossDocumentationViewModelLifecycle)
Uses a Construction-Init-ReloadState-Start flow for building ViewModels.
> ReloadFromBundle: Time to get your saved data (more probably the initial parameters) back.
> Prepare: Only the parameterless version of Prepare will be called. It is your responsibility to save the used parameters and restore them (using SaveStateToBundle / ReloadFromBundle).
> Initialize: Initialize will be called as normal. InitializeTask will watch the task and fire property changes.
> After SaveStateToBundle is returned to the caller, the IMvxBundle will be stored by MvvmCross.
```
void ViewCreated();
void ViewAppearing();
void ViewAppeared();
void ViewDisappearing();
void ViewDisappeared();
void ViewDestroy (bool viewFinishing = true);
```


## Relates to

* [Persisted_ViewModel_Properties.md](Persisted ViewModel Properties)

## Used By
* Website: TechYourChance - You Don't Need Android ViewModel, Here is Why
* Website: Styling Android - Architecture Components: ViewModel
* Website: zsmb.co - An Early Look at ViewModel SavedState
* TechnicalReport: Modern Approaches to Android APP Architecture: MVVM, MVP, VIPER
* Website: MvvmCross Documentation on ViewModel Lifecycle

