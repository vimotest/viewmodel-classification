# Dedicated Layout Presenters in View-Layer

## Summary
The view-layer contains layout presenters, which control View/ViewModel compositions.

## Details
In the view-layer there is a dedicated layout presenter component, which contain the logic of layouting a screen via specific views and their ViewModels.
Note: the idea of __layout presenter__ has nothing to do with the MVP's presenter component.

## Resources
from: UsingMvvmEnhancedCrossPlatformRock2015
> providing advanced functionality to show multiple Views in different ways on the screen is to introduce presenters. These presenters have nothing to do with the presenter of the Model View Presenter (MVP) pattern. Presenters, as described in this document, are responsible for abstracting the way that Views are placed on the screen.

Such a "presenter" is UI-framework dependent and is used to layout/arrange multiple nested/parallel view into a main layout.

## Used By
* Thesis: Using MVVM for enhanced cross platform development of mobile and desktop applications

