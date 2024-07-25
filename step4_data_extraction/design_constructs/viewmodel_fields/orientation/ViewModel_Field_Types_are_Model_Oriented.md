# ViewModel Field Types are Model Oriented

## Summary
The ViewModel's fields have the type which is suitable to the model types.

## Details
ViewModel types are model oriented, which makes the interaction between the ViewModel and the model more easy.
For example, a 'double' value of the model leads to a 'double' field in the ViewModel, such that it can be simply passed to the model back.

## Resources
Example (Hall2010ProWpf):
> The Number is a simple double auto-property that is both readable and writeable by the view, which is necessary because we want to take the Number as input from the user. Note that the Number is a double, because that’s the type the model requires.

## Used By
* Book: Pro WPF and Silverlight MVVM: Effective Application Development with Model-View-ViewModel

