# Networking Code in Networking Layer

## Summary
Networking code is placed in an own layer, which the ViewModel can use.

## Details
Networking code has a lots of boilerplate and therefore it's better to put it in an own networking layer.
The ViewModel then is free of networking code, since it uses the networking layer whenever it has to do network operations.

## Resources
> Here, I think the culprit is the use of reactive frameworks like RxSwift and Combine. All that boilerplate code gets lost into the glue code that connects streams of data.
Resource: ManferdiniMvvmSwift


## Relates to

* [Networking_Code_in_View.md](Networking Code in View)

## Used By
* Website: Matteo Manferdini - MVVM Design Pattern in iOS with Swift

