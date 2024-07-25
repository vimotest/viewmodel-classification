# ViewModel Refreshes all Bindings on Model Change

## Summary
ViewModel observes model changes and refreshes always all bindings.

## Details
If the model changes, a ViewModel does not know which exact properties are invalidated, but it simply reloads/refreshes all ViewModel properties. This simplifies the coupling of the ViewModel to the exact model properties it is based on. But, it might have negative performance impacts, since it refreshes bindings it wouldn't have to. "This risk can be mitigated with good design: small, cohesive view models and a clear separation of concerns."
"In response it will notify the view element to update all its bindings, regardless of what the actual change is."
"the behaviour is so generic it’s clearly destined for the view model base class"

## Resources
Resource of this idea: FirefinchDeepDiveMvvm (Requirement #3: View models hold as little state as possible)


## Construct Type

**ExtendsStandardDefinition:** extends standard MVVM by new rules

**Why:** aspect not addressed in standard definition



## Relates to

* [Command_Layer_for_non_UI_Triggers.md](Command Layer for non-UI Triggers)

## Used By
* Website: Firefinch Software - Deep Dive: MVVM in Real-World Applications, Part 1

