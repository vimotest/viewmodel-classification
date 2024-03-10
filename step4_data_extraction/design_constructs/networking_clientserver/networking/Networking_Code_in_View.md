# Networking Code in View

## Summary
Networking code is placed in the view, not in the ViewModel.

## Details
The view is responsible to process networking code. Therefore the ViewModel stays independent of networking.
Contra: this puts logic into the view, which is not testable within the ViewModel.

## Resources
> error scenarios can directly be handled by the view which can allow view to display errors to the user or retry the action again. If a View model wants to keep the networking code to make it abstracted from the view, it needs to respond back to the view with the errors, in which case the extra layer of abstraction is added (MediumIOSPatternMvcMvpMvvm)


## Relates to

* [Networking_Code_in_Networking_Layer.md](Networking Code in Networking Layer)
