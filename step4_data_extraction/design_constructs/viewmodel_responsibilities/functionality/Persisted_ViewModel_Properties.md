# Persisted ViewModel Properties

## Summary
ViewModel properties are persisted and can be restored.

## Details
ViewModel properties are persisted into a key-value storage (e.g., Android's SaveStateHandle). The properties provide a getter which reads the persisted value from the storage by name, while a setter is used to persist values.

## Resources
Example (ZsmbEarlyLookAtViewModelSaveState)
```kotlin
class MyViewModel(private val handle: SavedStateHandle) : ViewModel() {
    var name: String?
        get() = handle.get<String>("name")
        set(value) {
            handle.set("name", value)
        }
}
```


## Construct Type

**ExtendsStandardDefinition:** extends standard MVVM by new rules

**Why:** "persistence" aspect not addressed in standard definition



## Relates to

* [Application_Lifecycle_Aware_ViewModels.md](Application Lifecycle Aware ViewModels)

## Used By
* Website: zsmb.co - An Early Look at ViewModel SavedState
* BookChapter: Windows 8 MVVM Patterns Revealed: Implementing the ViewModel

