# Asynchronous Commands Requirements

## Summary
This design construct is about requirements which developers should have in mind to implement asynchronous commands.

## Details
Commands that process an asynchronous action. It has some requirements
a) update has to be performed on UI thread
b) triggering multiple times while processing shall be avoided
c) update progress information for UI
d) cancel a running asynchronous command


## Construct Type

**RealizationGuideline:** realization guideline for an aspect mentioned by the MVVM standard rules

**Why:** "asynchronous operation" aspect mentioned in standard definition



## Relates to

* [Static_UI_Thread_Dispatcher.md](Static UI Thread Dispatcher)
* [Busy_Flag_for_Asynchronous_Operations.md](Busy Flag for Asynchronous Operations)
* [MessageBox_by_Interaction_Service.md](MessageBox by Interaction Service)

## Used By
* Website: Evozon - Model-View-ViewModel in ReactJS
* Website: Microsoft Patterns & Practices - Implementing the MVVM Pattern Using the Prism Library
* Website: Microsoft Patterns & Practices - Advanced MVVM Scenarios Using the Prism Library
* Website: CodeProject - Commands in MVVM
* Thesis: Using MVVM for enhanced cross platform development of mobile and desktop applications

