# ViewModel Only Expose Data Needed by View

## Summary
A ViewModel does only expose data which the View really needs.

## Details
This mainly aligns with the idea of a View-aware ViewModel. The ViewModel has the logical mockup in sense, and provides exactly the data the View needs to realize the mockup. This means, that Model entities are not simply exposed, but only if the View really requires their information.

## Resources
> the view model should only expose data that is directly needed by the view; therefore, you need to understand what the view needs. In many cases, you will be creating the view model and the view in parallel, refactoring the view model when the view has new requirements (MvvmInSilverlight)


## Construct Type

**DivergentConstruct:** divergents an intention/tip of a standard MVVM rule

**Why:** Contradicts the idea of ViewModel provides an "abstract representation for reusable parts"



## Relates to

* [View_and_ViewModel_are_a_Tandem__one_to_one_relationship_.md](View and ViewModel are a Tandem (one-to-one relationship))
* [ViewModel_should_not_Expose_Model_Objects.md](ViewModel should not Expose Model Objects)
* [ViewModel_for_Model_Wrappers___Proxy_Property.md](ViewModel for Model Wrappers / Proxy Property)
* [Aggregate_Model.md](Aggregate Model)
* [Humble_View.md](Humble View)

## Used By
* TechnicalReport: Model-View-ViewModel In Silverlight 2 Apps
* Paper: Applicability of the ViMoTest Approach for Automated GUI Testing: A Field Study

