# Command Layer for non-UI Triggers

If external sources want to change the model, the idea is to go to the same command layer than the ViewModel do. In our understanding, this is a use-case layer. This layer provides commands, which also notifies subscribers which information do change. We also understand it like a message bus between the ViewModel and Model layers.
"These commands provide a central mechanism to make changes to the model that can be triggered by non-UI sources.  This includes external events, other commands, and even the model itself."
The command layer allows that the models stays free from observer-mechanisms, which might only be relevant for the UI.

Resource of this idea: FirefinchDeepDiveMvvm (Requirement #2: View models are alerted to changes to the model, regardless of the source of the changes)


## Relates to

* [ViewModel_Refreshes_all_Bindings_on_Model_Change.md](ViewModel Refreshes all Bindings on Model Change)

## Used By
* Website: Firefinch Software - Deep Dive: MVVM in Real-World Applications, Part 1

