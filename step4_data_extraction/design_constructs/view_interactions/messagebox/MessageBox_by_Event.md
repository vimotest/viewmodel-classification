# MessageBox by Event

## Summary
If ViewModel wants to show a messagebox, modify a field and trigger an observable event.

## Details
A ViewModel defines a field like "bool ShowMessage" and "string Message", which control if the View shall show a message box. When the flag "ShowMessage" is set to true, then the View can observe the change and use it as the trigger. 
Alternatively, the ViewModel could directly define an event if the programming language supports it (e.g., C# event), where the ViewModel can pass the message as an event argument and trigger it, while the view describes to the event.


## Relates to

* [MessageBox_by_Interaction_Service.md](MessageBox by Interaction Service)
* [ViewModel_with_Events_Triggers.md](ViewModel with Events/Triggers)
* [Navigation_Trigger_by_ViewModel_Event.md](Navigation Trigger by ViewModel Event)
