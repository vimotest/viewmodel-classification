# Asynchronous Data Loading Init

## Summary
Design construct about the idea to load data for a ViewModel asynchronously on load/init/ctor time.

## Details
For asynchronous dta loading, the ViewModel can use an asynchronous Task/Thread to to the loading and keep a loading flag while waiting for the response.

In WPF this can also be achieved with "IsAsync"+"FallbackValue" bindings, and `<ObjectDataProvider IsAsynchronous="True"...` mechanisms.


## Construct Type

**RealizationGuideline:** realization guideline for an aspect mentioned by the MVVM standard rules

**Why:** "asynchronous operation" aspect mentioned in standard definition



## Relates to

* [Static_UI_Thread_Dispatcher.md](Static UI Thread Dispatcher)
* [Busy_Flag_for_Asynchronous_Operations.md](Busy Flag for Asynchronous Operations)

## Used By
* Website: Damir's Corner - Avoid async calls in view model constructors
* Book: MVVM Survival Guide for Enterprise Architectures in Silverlight and WPF
* BookChapter: Windows 8 MVVM Patterns Revealed: Implementing the ViewModel

