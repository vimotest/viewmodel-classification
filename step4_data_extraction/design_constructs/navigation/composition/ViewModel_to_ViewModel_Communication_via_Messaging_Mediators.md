# ViewModel to ViewModel Communication via Messaging/Mediators

## Summary
If a ViewModel needs to communicate with another one, then messaging/mediators can be used.

## Details
The ViewModel has a dependency on a mediator/messaging component, which it can use to publish messages which other ViewModels subscribe to for handling.

Note: We see this design construct relevant in the context of composing/coordinating ViewModels.

## Resources
Concrete framework realizations: Prism's EventAggregator, MVVM Light's Messenger


## Relates to

* [MessageBox_by_Interaction_Service.md](MessageBox by Interaction Service)
* [MVVM_C__Navigation_in_Coordinator___Navigation_Service.md](MVVM-C: Navigation in Coordinator / Navigation Service)

## Used By
* BookChapter: Pro Business Applications with Silverlight 5: The Model-View-ViewModel (MVVM) Design Pattern
* Book: Windows Phone 8 Application Development Essentials (A practical guide to creating a Windows Phone 8 application using C#, XAML, and MVVM)
* Thesis: Using MVVM for enhanced cross platform development of mobile and desktop applications
* BookChapter: Windows 8 MVVM Patterns Revealed: Implementing the ViewModel

