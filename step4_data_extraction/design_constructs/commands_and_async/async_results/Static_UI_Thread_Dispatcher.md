# Static UI Thread Dispatcher

## Summary
This design construct is about the idea to use a static UI thread dispatcher which the ViewModel can simply access to publish asynchronous results.

## Details
If a ViewModel receives data from background threads, use a (static) dispatcher helper class which knows how to call into the UI thread's queue. Then, the ViewModel can ensure that the property-changed events are fired on the right UI thread. The view prepares the dispatcher helper on initialization on the main thread.

## Resources
Resource: MsdnMultithreadingMvvm


## Relates to

* [Asynchronous_Commands_Requirements.md](Asynchronous Commands Requirements)
* [Asynchronous_Data_Loading_Init.md](Asynchronous Data Loading Init)
* [Asynchronous_Results_Handling_by_Aspect_Oriented_Programming__AOP_.md](Asynchronous Results Handling by Aspect Oriented Programming (AOP))

## Used By
* Website: Microsoft MSDN Magazine - Multithreading and Dispatching in MVVM Applications

