# View does not Validate Inputs / is Agnostic to Input Types

## Summary
View is unaware of valid input formats.

## Details
The View does not validate what a user provides as input. E.g., a user might enter anything in a textbox where only a number is expected. The ViewModel will have the validation logic to ensure it is correct.

## Resources
Kouraklis2016:
> the View (InvoiceForm) is not (and should not be) aware of the type of data users enter; in other words, the form does not know that the quantity edit field must be a number.

## Used By
* Book: MVVM in Delphi

