# ViewModel Field Names/Types are View Oriented

## Summary
ViewModel fields shall be view oriented, not model oriented.

## Details
ViewModel field names and types are designed with the view in mind. This means, that the fields are view oriented.
For example: instead of naming 'isLoading', use the more view-oriented name 'showLoading'.

## Resources
> Please notice that we’re not saying for example – isLoading – but showLoading. It’s not the same. Remember that we’re trying to make the screen know as little as possible. The screen shouldn’t care if we’re fetching data from API or DB. Its only concern is whether Progress should be rendered or not! It’s important.

Reference: FiveDotTwelveFlutterMvvm


## Relates to

* [ViewModel_Field_Names_Types_are_View_Independent.md](ViewModel Field Names/Types are View Independent)
