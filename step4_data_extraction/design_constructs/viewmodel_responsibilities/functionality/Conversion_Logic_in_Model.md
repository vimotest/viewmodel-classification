# Conversion Logic in Model

## Summary
Conversion logic which the ViewModel uses for formatting values is part of the model.

## Details
Conversion logic could be placed as helper classes in the model, such that the ViewModel can simply use them and stays more simple. Conversion logic is then also re-usable across ViewModels.

## Resources
Resource: WeissenbergModelViewDesignPatterns2019
> Thus, the Model handles these object conversions by introducing a new simple object, like a POCO, which inherits these conversions. It wraps the API to allow the ViewModel to have a uniform access to the different class objects
> Since there are converters in place for converting classes of the same kind to different objects, this overhead is moved away from the ViewModel classes.
