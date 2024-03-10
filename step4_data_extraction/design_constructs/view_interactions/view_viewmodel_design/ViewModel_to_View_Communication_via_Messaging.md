# ViewModel to View Communication via Messaging

## Summary
ViewModel uses messaging (pub/sub) to communicate to the view.

## Details
The ViewModel has a dependency on a mediator/messaging component, which it can use to publish messages which the view subscribes to for handling.

## Resources
From Kouraklis2016:
> We developed the ProSu framework as a response to the need we identified earlier for the View (MainForm) to receive notifications in addition to its ability to initiate communication with the ViewModel.
> The ProSu framework (observer pattern) provides a way to establish bi-directional communication between the different components of the MVVM.


## Relates to

* [MessageBox_by_Messaging_Mediators.md](MessageBox by Messaging/Mediators)
