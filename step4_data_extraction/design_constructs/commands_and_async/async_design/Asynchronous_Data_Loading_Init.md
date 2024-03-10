# Asynchronous Data Loading Init

## Summary
Design construct about the idea to load data for a ViewModel asynchronously on load/init/ctor time.

## Details
For asynchronous dta loading, the ViewModel can use an asynchronous Task/Thread to to the loading and keep a loading flag while waiting for the response.

In WPF this can also be achieved with "IsAsync"+"FallbackValue" bindings, and `<ObjectDataProvider IsAsynchronous="True"...` mechanisms.


## Relates to

* [Static_UI_Thread_Dispatcher.md](Static UI Thread Dispatcher)
* [Busy_Flag_for_Asynchronous_Operations.md](Busy Flag for Asynchronous Operations)
