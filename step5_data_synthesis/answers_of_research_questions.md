# Answers to Research Questions

## RQ1: MVVM Design Variants

```
RQ1: Which design variants are people using when implementing MVVM?
```

In our multivocal literature review, we identified 76 additional design constructs grouped into 29 design aspects.

Here is the list of all Design Aspects grouped into topics:

| Topic                          | Aspect                           | Design Constructs |
|--------------------------------|----------------------------------|-------------------|
| _Commands and Async_           | **Async Design**                 | 3                 |
| _Commands and Async_           | **Commands Design**              | 3                 |
| _Commands and Async_           | **Async Results**                | 4                 |
| _View Interactions_            | **View ViewModel Design**        | 4                 |
| _View Interactions_            | **MessageBox**                   | 3                 |
| _App Lifecycle_                | **App Lifecycle**                | 1                 |
| _Navigation_                   | **ViewBased**                    | 3                 |
| _Navigation_                   | **Composition**                  | 3                 |
| _Navigation_                   | **Responsibility**               | 2                 |
| _Networking ClientServer_      | **Networking**                   | 2                 |
| _Networking ClientServer_      | **ClientServer**                 | 2                 |
| _View ViewModel Relationships_ | **View ViewModel Relationships** | 5                 |
| _Formatting Localization_      | **Localization**                 | 2                 |
| _Formatting Localization_      | **Reusable Formatting**          | 1                 |
| _Formatting Localization_      | **String Representation**        | 3                 |
| _Formatting Localization_      | **Coloring**                     | 2                 |
| _ViewModel Abstractions_       | **Coupling**                     | 3                 |
| _ViewModel Abstractions_       | **Design**                       | 3                 |
| _ViewModel Abstractions_       | **Humble Reusable**              | 2                 |
| _ViewModel Abstractions_       | **Model Wrapper**                | 3                 |
| _ViewModel Abstractions_       | **Application Structure**        | 1                 |
| _ViewModel Fields_             | **Orientation**                  | 3                 |
| _ViewModel Fields_             | **Design**                       | 3                 |
| _ViewModel Responsibilities_   | **Bindings**                     | 2                 |
| _ViewModel Responsibilities_   | **Modularisation**               | 2                 |
| _ViewModel Responsibilities_   | **Functionality**                | 3                 |
| _ViewModel Responsibilities_   | **Validation**                   | 3                 |
| _ViewModel Responsibilities_   | **Data**                         | 2                 |
| _MVVM DSL_                     | **MVVM DSL**                     | 3                 |

The entire list of all 76 design constructs with links to more details can be found here: [Design Constructs and Tradeoffs](../step4_data_extraction/data_extraction_overview.md) 

## RQ2: Mentioned Trade-offs

```
RQ2: Which trade-offs do people mention when applying MVVM?
```

In our multivocal literature review, we identified 16 additional benefits and 15 additional drawbacks of the MVVM pattern.

**Benefits**

* Easier Reuse of Components (e.g., the ViewModel)                           
* Better Application Performance compared to MVC/MVP                         
* Increased Decoupling of View / ViewModel                                   
* Less Boilerplate by Library                                                
* New UI Requirements more Quickly or Easily Adapted                         
* View Easily Replaced/Extended                                              
* N-Tier: ViewModel can Expose Parts of Model for better Security/Performance
* View Layer with Different UI Technologies                                  
* Development Speed Increased                                                
* Easier to Cache View-state                                                 
* Easier Debugging of Components                                             
* Less Imperative Code in View-Layer (Code-behind)                           
* Well-organized Design                                                      
* Reduced Energy Consumption                                                 
* Reduced CPU Usage                                                          
* Easier to Maintain Application Lifecycle

**Drawbacks**

* ViewModel with many Responsibilities                                             
* Lot of Boilerplate                                                               
* High Learning Curve to Efficiently Apply MVVM                                    
* Difficult Testability                                                            
* Separation of Developer-Designer Workflows does not work                         
* Lack of Guidance of MVVM Pattern                                                 
* Asynchronous Data Fetching / Threading Challenges                                
* Poor Reusability of ViewModels                                                   
* Increase Number of Classes/Components                                            
* Repeated Code in ViewModels leading to Maintainance Challenges                   
* Using UI-Framework Features on View-layer Decreases Testability                  
* User Interactions are Complexer to Implement                                     
* Usage of Third-Party Libraries affect Application Size/Performance/Learning Curve
* Framework-Independent Command Implementation Overhead                            
* ViewModel Conversions have Higher CPU Consumption

The entire list of all trade-offs with links to more details can be found here: [Design Constructs and Tradeoffs](../step4_data_extraction/data_extraction_overview.md) 
