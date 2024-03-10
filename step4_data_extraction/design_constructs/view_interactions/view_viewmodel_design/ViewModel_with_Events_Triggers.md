# ViewModel with Events/Triggers

## Summary
ViewModels have events which trigger different functionalities in the View.

## Details
The ViewModel can "talk" to the view by firing events/triggers, instead of updating dedicated boolean-flags.

## Resources
Example C#:
If the ViewModel controls the focus of a "OK button", then it can have a "FocusOkButton" event/trigger, instead of a "ShouldFocusOkButton" flag or a View-Interface with a "FocusOkButton()" method.
Note: In other languages like Java, this could be realized by a simple observer/listener pattern.


## Relates to

* [Input_and_Output_Callback_Interfaces.md](Input and Output/Callback Interfaces)
* [MessageBox_by_Interaction_Service.md](MessageBox by Interaction Service)
* [Navigation_Trigger_by_ViewModel_Event.md](Navigation Trigger by ViewModel Event)
* [ViewModel_with_View_Interface.md](ViewModel with View Interface)
* [MessageBox_by_Event.md](MessageBox by Event)
