https://rachelappel.com/2014/09/02/use-viewmodels-to-manage-data-amp-organize-code-in-asp-net-mvc-applications/
https://blog.devgenius.io/mvvm-architecture-viewmodel-and-livedata-d6c74ef45728
https://developer.android.com/reference/androidx/lifecycle/ViewModel
https://www.educba.com/viewmodel-in-mvc/
https://onmyway133.com/posts/how-to-use-viewmodel-and-viewmodelsproviders-in-android/


Person:
- You shall be a scientific expert in GUI architectural patterns. The target audience are software engineering researchers in context of software architecture.

For my SLR, I want to find out if websites dealing with the MVVM pattern provide the standard definition or a deviation to it.

I provide you the detailed standard definition:

* MVVM is a variation of MVC
* View is the responsibility of a designer rather than a classic developer
* Design is almost always done in a declarative form like HTML or XAML
* MVVM relies on a general mechanism for data binding
* Model is defined as in MVC: data or business logic (completely UI independent)
* View consists of visual elements (buttons, graphics, complex controls)
* View encodes control interactions with input devices like the Controller of MVC
* Simple example: view is data bound directly to the model
    * mix of two-way and one-way binding possible
    * example: boolean of model to CheckBox, string to a TextBox
* In practice: Model cannot be mapped directly to controls
    * view state like "edit/view"-mode or selection
* ViewModel: "Model of a View"
    * abstraction of the view
    * provides a specialization of the model for data-binding
    * contains data-transformers for conversion
    * contains commands for interactions
* Based on an example:
    * Selection is one of the most common components of a ViewModel
    * ViewModel might provide properties for gradient stop of brushes, converters for mapping colors to text values
    * View might changed to something radically different, ViewModel might provide abstract representation for reusable parts of a UI
* "ViewModel" is the suffix of a View's ViewModel's class
* MVVM to be a specialization of the more general PresentationModel pattern by Martin Fowler
* ViewModel does not need a reference to a view
* View never performs modifications to the model data
* View has no idea that the model classes exist
* ViewModel and model are unaware of the view
* Model is unaware of the ViewModel and view
* Through data-binding you get loose coupling between the view and the ViewModel
* A view is just an arbitrary consumer of a ViewModel
* Most ViewModel classes need the same features
    * often there is a need for a ViewModel base class
* MVVM is a set of guidelines, not rules
* The design of model classes has almost nothing to do with the MVVM pattern
* ViewModel might have additional validation logic
* Codebehind (part of view) shall only contain code that manipulates the controls and resources contained within that view
* View defines structure, layout, and appearance of what the user sees on screen (encapsulates UI Logic)
* ViewModel provides properties and commands that define the functionality to be offered by the UI (encapsulates Presentation Logic and State)
* Model represents the app's domain model, which usually includes a data model, business and validation logic (encapsulates Business Logic and Data)
* Tip: Keep the UI responsive with asynchronous operations.
* There is typically a one-to-many relationship between the ViewModel and the model classes
* ViewModel provides data from a model in a form that the view can easily consume
* Tip: Centralize data conversions in a conversion layer.
* View and ViewModel construction and runtime-association can be done in many approaches
    * View first composition
    * ViewModel first composition
* A common approach to instantiate a ViewModel in a view is to use a view model locator, means that the application has a single class that is responsible for connecting view models to views

Standard benefits:

* ViewModel is an abstraction of the View
* reduction of business logic or glue code stuck in code-behind
* ViewModel is easier to unit test
* ViewModel is more Model-ish, test it without awkward UI automation and interaction
* Data-binding performance is quite good
* development team can focus on creating robust ViewModel classes, and the design team can focus on making user-friendly Views
* MVVM enables a developer-designer workflow
* each MVVM component (Model, ViewModel, Model) is decoupled from each other, enabling: Components to be swapped, Internal implementation to be changed without affecting the others, Components to be worked on independently
* MVVM helps cleanly separate an application's business and presentation logic from UI
* makes the application easier to test, maintain, and evolve
* ViewModel acts as an adapter for the model classes and prevents from making major changes to the model code
* UI can be redesigned without touching the view model
* view model acts as an adapter for the model classes and enables you to avoid making any major changes to the model code

Standard disadvantages:

* simple UI, MVVM can be overkill
* bigger cases, it can be hard to design the ViewModel up front
* Data-binding is declarative and harder to debug
* Bindings might be heavier than the objects being bound, which can lead to more memory consumption

Carefully determine to which of the following categories each website belongs:
A: Standard Definition of MVVM
B: Deviation or Stricter Version of the Standard Definition
C: New Benefits/Drawbacks
D: No useful definition of MVVM found on the whole website
E: Undefined Category

If a website uses concrete tools or frameworks, mark the category with a '*' and notice the technology. E.g., a website stating the default definition of MVVM in context of WPF shall have the category A*. If it does not state a clear definition, but examples to a specific technology, it would be D*. There might also be combinations, e.g. if a website defines the standard definition and extended benefits, then it would be A/C. If a website defines a standard definition, and compatible extensions, it is A/B. If it has a definition which significantly deviates from standard, then it is only B.

Hints for detecting Deviations (Category B):

If a website:
- Mentions anything relevant about specific cardinalities between View/ViewModel, e.g., one-to-one mapping or one-to-many
- Discusses non-standard design variants or additional responsibilities.
- Discusses granularity of ViewModel properties (composite vs. flattened fields).
- Mentions reuse implications of View/ViewModel.
- Includes navigation logic, application lifecycle management, UI threading, or asynchronous presenter logic.

Hints what counts as New Benefits/Drawbacks (Category C):
Any benefits or drawbacks not mentioned in the standard definition.

No Useful Definition (Category D):

- If the website doesn't provide any meaningful information about MVVM or its components.
- If a website doesn't discuss the ViewModel component's design.

Technology Specific (Mark with '*'):
If a website discusses MVVM in the context of a specific tool or framework (e.g., WPF, Android, RxJava).

General Guidelines:
- Focus on framework-independent aspects.
- Focus on the ViewModel component design.
- Ignore business logic placement details.
- Code examples related to specific platforms/frameworks don't count as definition parts.
- Framework-specific standard MVVM usage counts as Standard Definition (Category A).
- Carefully regard all hints I gave you for determining categories. Try to avoid mixing categories if possible, combine categories only if it is not clear to distinguish.

Also determine the type of the website, e.g., personal blog article, company blog article, tutorial, forum, etc.

Loop over following 5 website URLs and extract Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason (why you chose the category). Notice information concisely with bullet-points.

https://rachelappel.com/2014/09/02/use-viewmodels-to-manage-data-amp-organize-code-in-asp-net-mvc-applications/
https://blog.devgenius.io/mvvm-architecture-viewmodel-and-livedata-d6c74ef45728
https://developer.android.com/reference/androidx/lifecycle/ViewModel
https://www.educba.com/viewmodel-in-mvc/
https://onmyway133.com/posts/how-to-use-viewmodel-and-viewmodelsproviders-in-android/

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name:**  Rachel Appel
**Content Summary:**
The article on Rachel Appel's website discusses the concept of the ViewModel in the context of ASP.NET MVC. It emphasizes that ViewModels allow for the shaping of multiple entities from various data models or sources into a single object optimized for the view. This leads to a cleaner separation of concerns, making the application more organized and the code more focused. The article also touches upon the benefits of using ViewModels, such as better maintainability and testability of code. It provides examples of scenarios where ViewModels might be beneficial, such as incorporating dropdown lists of lookup data into a related entity, master-detail records view, and pagination. The article also provides guidance on creating a ViewModel and how to get it to the view. Additionally, it offers tips for using ViewModels and recommends tools that can assist in generating POCOs for models and ViewModels.

**Category Determination:**
- The article mentions that the purpose of a ViewModel is for the view to have a single object to render, which aligns with the standard definition.
- It discusses the separation of concerns, which is a key principle of MVVM.
- The article provides scenarios where ViewModels might be beneficial, which can be considered as benefits of using MVVM.
- The article is specific to ASP.NET MVC, which means it's technology-specific.

**Category:**  A* (Standard Definition of MVVM in the context of ASP.NET MVC)

**Type:**  Personal Blog Article

**Deviation/Extension Aspects:**
- The article does not seem to provide any significant deviations or extensions from the standard definition of MVVM.

**New Benefits:**
- Using ViewModels in MVC for finer granularity leads to more easily maintainable and testable code.
- ViewModels provide flexibility to use data as seen fit.

**New Drawbacks:**  None mentioned.

**Technology:**  ASP.NET MVC

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The article provides a clear definition of ViewModel in the context of ASP.NET MVC, which aligns with the standard definition of MVVM.
- It emphasizes the benefits of using ViewModels, such as a cleaner separation of concerns and better maintainability and testability of code.
- The article is technology-specific, focusing on ASP.NET MVC.

I will now proceed to the next website.




Used WebPilot




**Website-Name:**  Dev Genius (Medium)

**Content Summary:**
The article on Dev Genius discusses the MVVM architecture, specifically focusing on ViewModel and LiveData in the context of Android development. MVVM is described as a software design pattern that separates program logic and user interface controls. The article breaks down the three main components of MVVM: Model, View, and ViewModel. The Model holds the application data and doesn't directly communicate with the View. The View represents the UI devoid of any application logic and observes the ViewModel. The ViewModel acts as a bridge between the Model and View, transforming data from the Model and preparing it for the View. LiveData is introduced as an observable data holder class that is lifecycle-aware. The article then delves into the advantages of using LiveData, such as ensuring UI matches data state, avoiding memory leaks, and always having up-to-date data. The article also provides examples of how LiveData is used in a messaging app, discussing the Repository layer, Model, ViewModel, and View in detail.

**Category Determination:**
- The article provides a clear definition of MVVM, which aligns with the standard definition.
- It introduces LiveData, which is specific to Android development, making the article technology-specific.
- The advantages of using LiveData can be considered as benefits of using MVVM in the context of Android development.

**Category:**  A* (Standard Definition of MVVM in the context of Android with LiveData)

**Type:**  Company Blog Article

**Deviation/Extension Aspects:**
- The article does not seem to provide any significant deviations or extensions from the standard definition of MVVM.

**New Benefits:**
- Ensures UI matches data state.
- Avoids memory leaks.
- No crashes due to stopped activities.
- No manual lifecycle handling.
- Always up-to-date data.
- Proper configuration changes.
- Sharing resources.

**New Drawbacks:**  None mentioned.

**Technology:**  Android (LiveData)

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The article provides a clear definition of MVVM in the context of Android development, which aligns with the standard definition.
- It introduces LiveData and its advantages, which are specific to Android development.
- The article emphasizes the benefits of using MVVM in conjunction with LiveData for Android development.

I will now proceed to the next website.




Used WebPilot




**Website-Name:**  Android Developers (developer.android.com)

**Content Summary:**
The page from Android Developers provides documentation for the ViewModel class, which is part of the AndroidX library. The ViewModel class is designed to store and manage UI-related data in a lifecycle-conscious way. The ViewModel class allows data to survive configuration changes such as screen rotations. The documentation explains that the ViewModel is not a replacement for the onSaveInstanceState() method, as it doesn't handle the UI state. The ViewModel should never reference a view, Lifecycle, or any class that may hold a reference to the activity context. The documentation provides methods and details about the ViewModel, including how to create and retrieve a ViewModel.

**Category Determination:**
- The documentation provides a clear definition of ViewModel in the context of Android development.
- It emphasizes the role of ViewModel in managing UI-related data and surviving configuration changes.
- The documentation is technology-specific, focusing on Android development.

**Category:**  A* (Standard Definition of ViewModel in the context of Android)

**Type:**  Official Documentation

**Deviation/Extension Aspects:**
- The documentation does not provide any significant deviations or extensions from the standard definition of ViewModel.

**New Benefits:**
- ViewModel allows data to survive configuration changes such as screen rotations.

**New Drawbacks:**  None mentioned.

**Technology:**  Android (AndroidX library)

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The documentation provides a clear definition of ViewModel in the context of Android development.
- It emphasizes the role of ViewModel in managing UI-related data and its ability to survive configuration changes.
- The documentation is specific to Android development and the AndroidX library.

I will now proceed to the next website.




Used WebPilot




**Website-Name:**  EDUCBA

**Content Summary:**
The article on EDUCBA provides an introduction to ViewModel in the context of the MVC framework. It explains that Models are basic domain objects used for operations like updation, insertion, deletion, and selection. However, in real-time applications, there's often a need to display data from multiple models and additional data not present in the available models. This is where the concept of ViewModel comes into play. ViewModel is a collection of one or more models and some additional data required to be rendered in the view section. The article provides a detailed example of implementing ViewModel in MVC, including creating basic models, creating the ViewModel, and setting up the controller and view files.

**Category Determination:**
- The article provides a clear understanding of ViewModel in the context of MVC.
- It emphasizes the role of ViewModel in combining multiple models and additional data for rendering in the view.
- The article is technology-specific, focusing on MVC.

**Category:**  A* (Standard Definition of ViewModel in the context of MVC)

**Type:**  Tutorial

**Deviation/Extension Aspects:**
- The article does not provide any significant deviations or extensions from the standard definition of ViewModel.

**New Benefits:**
- ViewModel allows for the combination of multiple models and additional data for rendering in the view.

**New Drawbacks:**  None mentioned.

**Technology:**  MVC

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The article provides a clear understanding of ViewModel in the context of MVC.
- It emphasizes the role of ViewModel in combining multiple models and additional data for rendering in the view.
- The article is specific to MVC and provides a detailed example of implementing ViewModel in MVC.

I will now proceed to the last website.




Used WebPilot




**Website-Name:**  On My Way

**Content Summary:**
The article on "On My Way" provides insights into how to use ViewModel and ViewModelsProviders in Android. It emphasizes the role of ViewModel in managing UI-related data in a lifecycle-conscious manner, allowing data to survive configuration changes such as screen rotations. The article also delves into the technical details of ViewModelProviders, explaining its role as a factory for ViewModelProvider, which depends on ViewModelFactory and a ViewModelStore. It further discusses the HolderFragment, a headless Fragment that retains the ViewModel for as long as the Activity is not destroyed. The article provides code snippets and examples to illustrate the concepts.

**Category Determination:**
- The article provides a clear understanding of ViewModel and ViewModelsProviders in the context of Android development.
- It emphasizes the role of ViewModel in managing UI-related data and surviving configuration changes.
- The article is technology-specific, focusing on Android development.

**Category:**  A* (Standard Definition of ViewModel in the context of Android)

**Type:**  Personal Blog Article

**Deviation/Extension Aspects:**
- The article does not provide any significant deviations or extensions from the standard definition of ViewModel.

**New Benefits:**
- ViewModel allows data to survive configuration changes such as screen rotations.

**New Drawbacks:**  None mentioned.

**Technology:**  Android

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The article provides a clear understanding of ViewModel and ViewModelsProviders in the context of Android development.
- It emphasizes the role of ViewModel in managing UI-related data and its ability to survive configuration changes.
- The article is specific to Android development and provides technical details and code snippets to illustrate the concepts.

I will now generate the overview table with the collected information.



Here's the overview table based on the analysis of the provided websites:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonRachel AppelA*Personal Blog ArticleNoneUsing ViewModels in MVC for finer granularity leads to more easily maintainable and testable codeNoneASP.NET MVCNot mentionedStandard definition in context of ASP.NET MVC with emphasis on benefits.Dev Genius (Medium)A*Company Blog ArticleNoneEnsures UI matches data state, avoids memory leaks, no crashes, no manual lifecycle handlingNoneAndroid (LiveData)Not mentionedStandard definition in context of Android with LiveData with emphasis on benefits.Android DevelopersA*Official DocumentationNoneViewModel allows data to survive configuration changes such as screen rotationsNoneAndroid (AndroidX
