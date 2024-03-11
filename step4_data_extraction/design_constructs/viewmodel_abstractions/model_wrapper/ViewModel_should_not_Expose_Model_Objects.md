# ViewModel should not Expose Model Objects

## Summary
ViewModels do not directly expose Model objects.

## Details
The ViewModel shall not expose Model objects directly, but expose its own, separate properties.

Note: here the ViewModel can still wrap a subset of the model properties, the "Proxy Property" design construct is about wrapping all.

## Resources
Example: (BuldingEnterpriseAppsWpfMvvm)
> in MVVM implementations is that they pass the Model to the View from the ViewModel, so
that (for example) the binding path of a FirstName property in the Person model would be
exposed in the View in this way:
<TextBox Grid.Column="2" Grid.Row="1" Text="{Binding PersonModel.FirstName}" />
In my opinion, rather than letting the View bind to the property from the Model directly, the
ViewModel should expose its own, separate property called FirstName that represents the
FirstName of the Person Model:
<TextBox Grid.Column="2" Grid.Row="1" Text="{Binding FirstName}" />


## Relates to

* [ViewModel_for_Model_Wrappers___Proxy_Property.md](ViewModel for Model Wrappers / Proxy Property)
* [ViewModel_Only_Expose_Data_Needed_by_View.md](ViewModel Only Expose Data Needed by View)
* [Aggregate_Model.md](Aggregate Model)

## Used By
* Book: Building enterprise applications with Windows Presentation Foundation and the model view ViewModel Pattern
* Book: Pro WPF and Silverlight MVVM: Effective Application Development with Model-View-ViewModel

