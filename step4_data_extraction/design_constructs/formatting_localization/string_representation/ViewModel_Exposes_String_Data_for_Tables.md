# ViewModel Exposes String Data for Tables

## Summary
The ViewModel provides tabular data as formatted strings.

## Details
The ViewModel provides data to be shown in a table in such a way, that it is suitable to be presented.
I.e., mainly using strings.

## Resources
Example Kouraklis2016:
> The ViewModel is doing all the required work to prepare the data into a form suitable for presentation. Suitable in this case means that the ViewModel should present the data to the View in such way that it could be shown in the string grid of the form.
> The string grid has five columns and receives strings. There are many ways to prepare data for this constellation. I will use a set of arrays that map to the columns of the string grid. Admittedly, this is not the best way to achieve this effect, but in this case, it is adequate as a demonstration of the functionality of the ViewModel.
```delphi
TInvoiceItemsText = record
    DescriptionText,
    QuantityText,
    UnitPriceText,
    PriceText,
    IDText: array of string;
    InvoiceRunningBalance,
    InvoiceTotalBalance: string;
  end;
```

## Used By
* Book: MVVM in Delphi

