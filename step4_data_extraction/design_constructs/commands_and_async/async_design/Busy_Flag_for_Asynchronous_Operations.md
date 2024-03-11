# Busy Flag for Asynchronous Operations

## Summary
Introduce a busy flag in the ViewModel to visualize that a long-running operation is running.

## Details
The busy flag can be used to visualize to a user, that a usecase/operation takes time. Actions can be disabled based on the busy flag to indicate that no conflicting operations shall be triggered, until the result is handled.

## Resources
From Anderson2012MvvmPattern
"How Do I Prevent the User from Doing Anything While an Asynchronous Operation is in Progress?
Generally, you will expose a property from the ViewModel named IsBusy. This is a Boolean value that your ViewModel can set to true when an asynchronous operation is in progress. You can then bind this IsBusy property to the IsBusy property on a BusyIndicator control in your View, which results in the BusyIndicator control appearing in the View when the ViewModel’s IsBusy property is set to true. The BusyIndicator control serves two purposes: to inform the user that something is happening and to block the user from interacting with the View until the operation is complete. See Chapter 6 for more details on the BusyIndicator control."


## Relates to

* [Asynchronous_Commands_Requirements.md](Asynchronous Commands Requirements)
* [Asynchronous_Data_Loading_Init.md](Asynchronous Data Loading Init)

## Used By
* BookChapter: Pro Business Applications with Silverlight 5: The Model-View-ViewModel (MVVM) Design Pattern
* Book: Developer's Guide to Microsoft Prism 4: Building Modular MVVM Applications with Windows Presentation Foundation and Microsoft Silverlight

