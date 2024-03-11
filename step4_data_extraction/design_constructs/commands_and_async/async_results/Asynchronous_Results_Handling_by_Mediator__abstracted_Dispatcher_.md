# Asynchronous Results Handling by Mediator (abstracted Dispatcher)

## Summary
Use an abstract dispatcher as a mediator to let a ViewModel publish asynchronous results.

## Details
The ViewModel gets a mediator object injected which it can use to push asynchronous results for handling on the UI thread.

This is like an abstract Dispatcher:
```cs
public interface IDispatcherMediator
{
    // Invokes a method on the UI thread
    void InvokeOnUIThread(Action action);
```

## Resources
Resource: Hall2010ProWpf:
> Using a Mediator
> The best answer lies somewhere between the two previous examples. A mediator can be created that will fulfil all of the requirements while limiting the negative impact. The dispatcher should stay in the view layer, only one implementation is required for the entire view, and the interface is passed into all ViewModels that require cross-thread marshalling.


## Relates to

* [Asynchronous_Results_Handling_by_Aspect_Oriented_Programming__AOP_.md](Asynchronous Results Handling by Aspect Oriented Programming (AOP))
* [Encapsulate_Asynchronous_Handling_in_Helper_Classes.md](Encapsulate Asynchronous Handling in Helper Classes)

## Used By
* Book: Pro WPF and Silverlight MVVM: Effective Application Development with Model-View-ViewModel

