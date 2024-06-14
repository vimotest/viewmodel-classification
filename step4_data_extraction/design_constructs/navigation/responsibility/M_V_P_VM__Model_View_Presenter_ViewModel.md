# M-V-P-VM: Model-View-Presenter-ViewModel

## Summary
ViewModel provides fields, and a dedicated Presenter contains the presentation-logic.

## Details
Main idea in our interpretation is to make the ViewModel more like a data-structure, while putting presentation-logic and coordination logic to a presenter. The presenter has a direct reference to the view (which also could be a IView interface as in MVP). Therefore, the presenter can pass the ViewModel instance to the View (e.g., setting DataContext in WPF, or having a "ShowViewModel(ViewModel)" method in a IView interface).

View does still use data-binding to the ViewModel, but the presenter is responsible to pass the ViewModel instance to the view. So does the presenter also fill the ViewModel with data.

## Resources
ChatGPT:
MVPVM (Presenter-ViewModel)
Presenter's Role: In MVPVM, the Presenter takes on a more active role in both coordinating application flow and handling presentation logic. It is responsible for preparing the ViewModel with the necessary data for the View, effectively acting as an intermediary that manipulates the ViewModel directly based on the user's interactions and the application's state.
ViewModel: The ViewModel can be seen as a simpler data structure that holds the data to be displayed. While it might include basic logic for data transformation or validation, the heavy lifting of deciding what data to fetch, how to respond to user interactions, and how to update the ViewModel is often handled by the Presenter.
Data Filling and Presentation Logic: The Presenter fills the ViewModel with data and dictates the presentation logic. This setup implies a tighter coupling between the Presenter and both the View and ViewModel, as the Presenter directly manipulates the data structure the View binds to and controls the flow of the application.

Main source: MsdnMvpvm2015

Note: similar to MVVM-C, but presentation-logic also outside of ViewModel:
ChatGPT:
MVVM-C (Coordinator)
Coordinator's Role: In the MVVM-C pattern, the Coordinator is primarily responsible for navigation and the flow of the application. Coordinators decide when and how to present different Views (screens) and are typically used to decouple navigation logic from ViewModels, making the ViewModels unaware of the navigation context.
ViewModel: Remains responsible for the presentation logic and state, interacting with the Model to prepare data for the View. The ViewModel in MVVM-C can be more than just a dumb data structure; it encapsulates the logic for data transformation, validation, and interaction handling, aiming to keep the View as simple as possible.
Data Filling: The ViewModel directly or indirectly (through services or use cases) fetches and manages the data it needs to present. The Coordinator does not fill the ViewModel with data but may initiate the transition to a ViewModel that corresponds to a new part of the application flow.


## Construct Type

**ExtendsStandardDefinition:** extends standard MVVM by new rules

**Why:** "ViewModel modularization" aspect not addressed in standard definition



## Relates to

* [MVVM_C__Navigation_in_Coordinator___Navigation_Service.md](MVVM-C: Navigation in Coordinator / Navigation Service)

## Used By
* Paper: A Linked Data Model-View-* Approach for Decoupled Client-Server Applications
* Website: Microsoft MSDN - MVPVM Design Pattern - The Model-View-Presenter-ViewModel Design Pattern for WPF

