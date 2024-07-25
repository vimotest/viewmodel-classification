# MessageBox by Messaging/Mediators

## Summary
ViewModel can publish a message via messaging to let the view show a message box.

## Details
Provide a Mediator (or Messaging, or Pub/Sub) which the ViewModel can use to publish a message to indicate showing a message box.
The View subscribes to such messages and uses it to show the actual messagebox.


## Construct Type

**ExtendsStandardDefinition:** extends standard MVVM by new rules

**Why:** "messagebox handling" aspect not addressed in standard definition



## Relates to

* [MessageBox_by_Interaction_Service.md](MessageBox by Interaction Service)
* [ViewModel_to_View_Communication_via_Messaging.md](ViewModel to View Communication via Messaging)

## Used By
* Book: Building enterprise applications with Windows Presentation Foundation and the model view ViewModel Pattern
* Book: MVVM in Delphi
* Book: MVVM Survival Guide for Enterprise Architectures in Silverlight and WPF

