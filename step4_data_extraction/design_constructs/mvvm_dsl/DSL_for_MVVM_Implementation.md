# DSL for MVVM Implementation

## Summary
A DSL is build and used to ensure that MVVM is implemented consistently in a team.

## Details
By using an internal DSL, the MVVM implementation can be simplified. The DSL helps in a team that developers apply the pattern more systematically.
For example, this idea can be realized by a builder-pattern as an internal DSL.

## Resources
From BuldingEnterpriseAppsWpfMvvm:
> You might need to implement a custom DSL language in your application to avoid mistakes or improper implementations by other colleagues . For example, you might have a small MVVM framework that needs to be implemented in a specific order, and you would like to avoid changes in the call stack order . When a DSL is built for an internal use, it takes the name fluent interface, which is a term that was first coined by Martin Fowler and Eric Evans when they were writing about Enterprise patterns.
```cs
var mvvmView = FluentEngine
   .BuildCommands()
   .BuildData()
   .InitView()
   .Create();
```


## Relates to

* [DSL_for_Specifying_ViewModel_API.md](DSL for Specifying ViewModel API)
