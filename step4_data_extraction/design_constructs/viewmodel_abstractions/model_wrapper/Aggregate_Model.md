# Aggregate Model

## Summary
The ViewModel aggregates model objects.

## Details
Idea is to let ViewModel expose model objects directly to the view.

## Resources
> Decision Point: Exposing the Model through the View Model In our current design, we are aggregating our model in our view model and then binding to the model in the UI. I call this approach Aggregate Model. (MvvmSurvivalGuideSiddiqi2012)


## Construct Type

**ConfirmingConstruct:** confirms/substantiates/clarifies an intention/tip of a standard MVVM rule

**Why:** Confirms the idea of "view is data bound directly to the model"



## Relates to

* [ViewModel_for_Model_Wrappers___Proxy_Property.md](ViewModel for Model Wrappers / Proxy Property)
* [Model_shall_provide_Binding_Capabilities.md](Model shall provide Binding-Capabilities)
* [ViewModel_Only_Expose_Data_Needed_by_View.md](ViewModel Only Expose Data Needed by View)
* [ViewModel_should_not_Expose_Model_Objects.md](ViewModel should not Expose Model Objects)

## Used By
* Book: MVVM Survival Guide for Enterprise Architectures in Silverlight and WPF

