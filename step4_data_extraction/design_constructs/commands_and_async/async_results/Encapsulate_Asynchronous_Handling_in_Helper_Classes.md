# Encapsulate Asynchronous Handling in Helper Classes

## Summary
This design construct is about placing asynchronous handling not in the ViewModel directly, but separate helper classes.

## Details
Try to hide the asynchronous nature of API calls from the ViewModels by handling the thread-details in a separate component/class. We understand this idea that the helper class know the UI thread dispatcher (e.g., by dependency injection) and provide an API to the ViewModel which take a asynchronous callback. This asynchronous callback is then always called on the UI thread, such that the ViewModel has not to deal with multi-threading, while the helper class does the real asynchronous API call.

## Resources
Resource: WeissenbergModelViewDesignPatterns2019
> The services of the API are channeled in manager classes. These classes implement asynchronous function calls, to utilize a parallel processing of the GUI and the API. Having all services of the same nature in one class improves the debugging of this services. [..] As mentioned in section 4 it is necessary to switch to the current GUI process to change a property which is visualized. One could argue that it is a potential problem for all ViewModel and therefore all these properties should handle switching to the current GUI process. However the cause of the problem is subject of asynchronous functions and thus should be handled in them. Because all asynchronous tasks are collected in the manager classes, they should be responsible for the switch of processes.


## Construct Type

**RealizationGuideline:** realization guideline for an aspect mentioned by the MVVM standard rules

**Why:** "asynchronous operation" aspect mentioned in standard definition



## Relates to

* [Asynchronous_Results_Handling_by_Mediator__abstracted_Dispatcher_.md](Asynchronous Results Handling by Mediator (abstracted Dispatcher))

## Used By
* Paper: Model-View Design Patterns

