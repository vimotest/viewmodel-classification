# ViewModel for Model Wrappers / Proxy Property

## Summary
ViewModels wrap all Model object properties as "proxy properties".

## Details
ViewModel wraps model properties as "proxy properties". This is done for all or mostly all model properties. Then the View can use the information, but is decoupled from the model.

## Resources
> a single view may interact with multiple ViewModels. Instead of having the ViewModel exposing model objects directly to the view, some developers choose to wrap their model objects in ViewModels, abstracting the model from the view. Instead of the view binding directly to the data (i.e., the models), it will bind to a ViewModel instead.
For example, a view may populate a list box with a collection of ProductViewModel objects, with each wrapping a Product model object. These ViewModels could essentially be considered a “view of the model.” Additional properties, calculations, logic, and so on, could be added to these ViewModel objects, serving the needs of the view while saving the model from being polluted with view-related requirements.
> The big issue with the practice of wrapping all your model objects in ViewModels is the amount of overhead and additional code required to wrap each of the model objects in a ViewModel—often resulting in properties on the ViewModel that purely exist to relay property values from the model objects. Most of the time, the outcome of this practice is simply an unnecessary duplication of code. Therefore, whether you undertake this practice will generally be on a case-by-case basis. (Anderson2012MvvmPattern)

> you can consider is to create proxy properties in your view model for each model property. This technique is known as Proxy Property. The proxy properties simply pass along the model property and implement INotifyPropertyChanged (and potentially IDataErrorInfo, which will be covered in the validations chapter). The advantages of Proxy Property include simplifying the view model, as you don't need to go through an intermediate object when binding, and simplifying your models as they no longer need to worry about change notification. The main disadvantage is that it requires more code. (MvvmSurvivalGuideSiddiqi2012)


## Construct Type

**RealizationGuideline:** realization guideline for an aspect mentioned by the MVVM standard rules

**Why:** "ViewModel: Model of a View" aspect mentioned in standard definition



## Relates to

* [Aggregate_Model.md](Aggregate Model)
* [ViewModel_should_not_Expose_Model_Objects.md](ViewModel should not Expose Model Objects)
* [ViewModel_Only_Expose_Data_Needed_by_View.md](ViewModel Only Expose Data Needed by View)

## Used By
* BookChapter: Pro Business Applications with Silverlight 5: The Model-View-ViewModel (MVVM) Design Pattern
* Book: MVVM Survival Guide for Enterprise Architectures in Silverlight and WPF
* Book: Windows Phone 8 Application Development Essentials (A practical guide to creating a Windows Phone 8 application using C#, XAML, and MVVM)
* Paper: Model-View Design Patterns
* Website: Reddit - Opinions on MVVM model and separation of concerns

