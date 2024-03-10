# Asynchronous Commands Requirements

## Summary
This design construct is about requirements which developers should have in mind to implement asynchronous commands.

## Details
Commands that process an asynchronous action. It has some requirements
a) update has to be performed on UI thread
b) triggering multiple times while processing shall be avoided
c) update progress information for UI
d) cancel a running asynchronous command


## Relates to

* [Static_UI_Thread_Dispatcher.md](Static UI Thread Dispatcher)
* [Busy_Flag_for_Asynchronous_Operations.md](Busy Flag for Asynchronous Operations)
* [MessageBox_by_Interaction_Service.md](MessageBox by Interaction Service)
