# MVVM/Controller: ViewModel and Controller

## Summary
MVVM with a dedicated Controller holding presentation logic.

## Details
Mix the idea of MVC and MVVM as a hybrid approach: handle user input logic in a controller, and ViewModel has the presentation logic to handle data conversions from the model.
Alternatively, the controller could also contain this data conversion logic - the main intention of this design construct is that (input and/or presentation) logic is extracted out of the ViewModel.


## Relates to

* [MVVM_C__Navigation_in_Coordinator___Navigation_Service.md](MVVM-C: Navigation in Coordinator / Navigation Service)
* [ViewModel_Composite_of_Delegates.md](ViewModel Composite of Delegates)
