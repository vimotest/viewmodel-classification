# Server Provides Remote ViewModel

## Summary
The ViewModel is created on server side and then transmitted to the clients.

## Details
We assume that the idea is to avoid a whole recreation of a viewmodel on subsequent requests for the same client-View instance. E.g., the client view is created (a new viewmodel from scratch on the server), and if a check-box is checked, then the server reuses the viewmodel and only processes the new delta.
This has positive impacts on the battery consumption of applications.

## Resources
Main idea from RMVRVM: (SinghRmvrvm2022)
> RMVRVM paradigm moves both model and view model of the application on to server-side aka cloud application that provides the REST API that the application running on the device is using
> Since the request is for data about a specific page on the UI side, the server-side code must identify the viewmodel corresponding to the UI page. Query Processor does this task.
> The view model created by the query processor component is now responsible for fetching data from its model.
> The primary role converters play is to transform the data from the data model to its view model. A converter is entirely owned by its view model
> View Model Proxies. Each UI page has a view model proxy. The difference between a view model proxy and a view model proper is that the proxy does not have any behavior.
> The client-side has a JSON to View Model converter object that transforms the incoming response in JSON to the structure of the view model proxy. The response object already has a field that identifies which view model proxy needs to be updated.


## Construct Type

**ExtendsStandardDefinition:** extends standard MVVM by new rules

**Why:** "client/server distribution" aspect not addressed in standard definition



## Relates to

* [Web_Client_Contains_MVVM.md](Web Client Contains MVVM)

## Used By
* Paper: RMVRVM – A Paradigm for Creating Energy Efficient User Applications Connected to Cloud through REST API

