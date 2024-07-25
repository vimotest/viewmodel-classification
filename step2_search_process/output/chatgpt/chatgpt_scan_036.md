https://www.glureau.com/2020/05/15/Jetpack-ViewModel-ProCons/
https://www.swiftbysundell.com/articles/different-flavors-of-view-models-in-swift
https://graphql.guide/android/viewmodel/
https://rehansaeed.com/model-view-viewmodel-mvvm-part2-idisposable/
https://mobikul.com/android-room-live-data-view-model/


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

https://www.glureau.com/2020/05/15/Jetpack-ViewModel-ProCons/
https://www.swiftbysundell.com/articles/different-flavors-of-view-models-in-swift
https://graphql.guide/android/viewmodel/
https://rehansaeed.com/model-view-viewmodel-mvvm-part2-idisposable/
https://mobikul.com/android-room-live-data-view-model/

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name:**  Grégory Lureau
**Type:**  Personal Blog Article

**Content Summary:**
The article titled "Should I use Jetpack ViewModel?" by Grégory Lureau discusses the pros and cons of using Jetpack's ViewModel. The author begins by explaining the purpose of the ViewModel library introduced by Jetpack and its relation to the MVVM pattern. The article delves into the complexities of Android lifecycles and how ViewModel aims to simplify them. The author also touches upon dependency injection challenges with Android and how Jetpack ViewModel interacts with it. The article further discusses communication between views and ViewModels, providing data to ViewModel, and concludes with a comparison table highlighting the differences between using ViewModel and not using it.

**Analysis:**
- The article discusses Jetpack's ViewModel, which is a specific technology/framework related to Android development.
- The author mentions that Jetpack's ViewModel is not strictly limited to the MVVM pattern and can be used with other patterns like presenters and controllers.
- The article provides insights into the lifecycle complexities of Android and how ViewModel aims to address them.
- The article touches upon dependency injection challenges and how they interact with Jetpack ViewModel.
- The article does not provide a clear standard definition of MVVM but rather focuses on the specifics of Jetpack's ViewModel and its implications.

**Category:**  D* (No clear standard definition of MVVM found, but the article is specific to Jetpack's ViewModel, which is a technology/framework.)

**Technology:**  Jetpack ViewModel (Android)

**Reason:**  The article focuses on the specifics of Jetpack's ViewModel and its implications in Android development. It does not provide a clear standard definition of MVVM but rather discusses the pros and cons of using Jetpack's ViewModel.---

Next, I will analyze the second website: "[https://www.swiftbysundell.com/articles/different-flavors-of-view-models-in-swift](https://www.swiftbysundell.com/articles/different-flavors-of-view-models-in-swift) ".




Used WebPilot




**Website-Name:**  Swift by Sundell
**Type:**  Personal Blog Article

**Content Summary:**
The article titled "Different flavors of view models in Swift" by John Sundell discusses various ways view models can be implemented in Swift. The article emphasizes the use of view models to separate view-specific logic from model code. Sundell presents different flavors of view models, including read-only structs, performing updates, and two-way street view models. Each flavor is explained with code examples, highlighting the benefits of using view models for different tasks. The article concludes by emphasizing the flexibility of view models and their ability to adapt to different project requirements.

**Analysis:**
- The article discusses the concept of view models in the context of Swift, a specific technology/framework.
- Sundell mentions that view models were popularized by Microsoft as part of the MVVM design pattern.
- The article provides insights into different ways view models can be implemented in Swift, such as using structs for read-only views and classes for dynamic views.
- The article touches upon the benefits of using view models, such as separation of concerns, testability, and flexibility.
- The article does not provide a clear standard definition of MVVM but rather focuses on the specifics of implementing view models in Swift.

**Category:**  D* (No clear standard definition of MVVM found, but the article is specific to Swift, which is a technology/framework.)

**Technology:**  Swift

**Reason:**  The article focuses on the specifics of implementing view models in Swift. It does not provide a clear standard definition of MVVM but rather discusses the benefits and different flavors of view models in Swift.---

Next, I will analyze the third website: "[https://graphql.guide/android/viewmodel/](https://graphql.guide/android/viewmodel/) ".


[ViewModel
graphql.guide](https://graphql.guide/android/viewmodel/)




Used WebPilot




**Website-Name:**  The GraphQL Guide
**Type:**  Tutorial

**Content Summary:**
The article titled "ViewModel" on The GraphQL Guide focuses on using ViewModel classes with Apollo Android. The content emphasizes the importance of ViewModel classes to manage UI-related data in a lifecycle-conscious manner. The article discusses the challenges of data fetching directly in fragments, which can lead to inefficiencies and potential bugs. The article provides an example of how ViewModel classes can be used with Apollo Android, showcasing the use of LiveData and the Resource class to manage data states (loading, error, or success). The article also provides code snippets to demonstrate the implementation of ViewModel classes and how to observe LiveData in fragments.

**Analysis:**
- The article discusses the concept of ViewModel in the context of Apollo Android, a specific technology/framework.
- The content emphasizes the importance of ViewModel classes to manage UI-related data efficiently and avoid potential lifecycle bugs.
- The article provides insights into the use of LiveData and the Resource class to manage data states.
- The article does not provide a clear standard definition of MVVM but rather focuses on the specifics of implementing ViewModel with Apollo Android.

**Category:**  D* (No clear standard definition of MVVM found, but the article is specific to Apollo Android, which is a technology/framework.)

**Technology:**  Apollo Android

**Reason:**  The article focuses on the specifics of implementing ViewModel with Apollo Android. It does not provide a clear standard definition of MVVM but rather discusses the benefits and implementation details of using ViewModel classes with Apollo Android.---

Next, I will analyze the fourth website: "[https://rehansaeed.com/model-view-viewmodel-mvvm-part2-idisposable/](https://rehansaeed.com/model-view-viewmodel-mvvm-part2-idisposable/) ".




Used WebPilot




**Website-Name:**  Muhammad Rehan Saeed
**Type:**  Personal Blog Article

**Content Summary:**
The article titled "Model-View-ViewModel (MVVM) - Part 2 - IDisposable" by Muhammad Rehan Saeed focuses on the implementation of the `IDisposable` interface in the context of the MVVM pattern. The article discusses the importance of correctly implementing `IDisposable` and highlights the complexities associated with it. The author provides a detailed explanation of the disposable pattern, emphasizing the difference between disposing of managed and unmanaged resources. The article showcases a base class that implements the `IDisposable` interface and provides helper methods and features to simplify its implementation. The article also provides code examples demonstrating the use of the base class to dispose of both managed and unmanaged resources.

**Analysis:**
- The article discusses the concept of `IDisposable` in the context of the MVVM pattern.
- The content emphasizes the importance of correctly implementing `IDisposable` and the challenges associated with it.
- The article provides insights into the disposable pattern, including the difference between disposing of managed and unmanaged resources.
- The article does not provide a clear standard definition of MVVM but rather focuses on the specifics of implementing the `IDisposable` interface in the context of MVVM.

**Category:**  B (Deviation or Stricter Version of the Standard Definition)

**Deviation/Extension Aspects:**
- Focus on the implementation of the `IDisposable` interface in the context of MVVM.
- Detailed explanation of the disposable pattern and its complexities.
- Introduction of a base class to simplify the implementation of `IDisposable`.

**Reason:**  The article focuses on a specific aspect of MVVM, namely the implementation of the `IDisposable` interface. It provides a detailed explanation of the disposable pattern and its challenges, deviating from the standard definition of MVVM.---

Next, I will analyze the fifth website: "[https://mobikul.com/android-room-live-data-view-model/](https://mobikul.com/android-room-live-data-view-model/) ".




Used WebPilot




**Website-Name:**  Mobikul
**Type:**  Tutorial

**Content Summary:**
The article on Mobikul titled "Android Room, Live Data And View Model" delves into the use of Android Room, LiveData, and ViewModel from the Android Architecture Components. The tutorial emphasizes how these components make Android development easier and faster. The article provides insights into:
- **Room** : An Android library that simplifies database access.
- **ViewModel** : A class designed to store and manage UI-related data in a lifecycle-conscious way. It retains its state/data even during orientation changes and does not contain code related to the UI.
- **LiveData** : An observable data holder class that is lifecycle-aware. It ensures that LiveData only updates app component observers that are in an active lifecycle state.

The tutorial provides code snippets demonstrating the implementation of these components and their interactions.

**Analysis:**
- The article discusses the concept of ViewModel, LiveData, and Room in the context of Android, a specific technology/framework.
- The content emphasizes the importance of ViewModel classes to manage UI-related data efficiently and avoid potential lifecycle bugs.
- The article provides insights into the use of LiveData and its lifecycle-aware nature.
- The article does not provide a clear standard definition of MVVM but rather focuses on the specifics of implementing ViewModel, LiveData, and Room in Android.

**Category:**  D* (No clear standard definition of MVVM found, but the article is specific to Android, which is a technology/framework.)

**Technology:**  Android (Android Room, LiveData, ViewModel)

**Reason:**  The article focuses on the specifics of implementing ViewModel, LiveData, and Room in Android. It does not provide a clear standard definition of MVVM but rather discusses the benefits and implementation details of using these components in Android development.---

Now, I will generate an overview table with the analyzed websites:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonGrégory LureauD*Personal Blog Article---Jetpack ViewModel (Android)-Focus on Jetpack's ViewModel in Android development.Swift by SundellD*Personal Blog Article---Swift-Focus on implementing view models in Swift.The GraphQL GuideD*Tutorial---Apollo Android-Focus on implementing ViewModel with Apollo Android.Muhammad Rehan SaeedBPersonal Blog ArticleImplementation of `IDisposable` in MVVM----Focus on a specific aspect of MVVM, namely the implementation of the `IDisposable` interface.MobikulD*Tutorial---Android (Room, LiveData, ViewModel)-Focus on the specifics of implementing ViewModel, LiveData, and Room in Android.

This table provides a concise overview of the analyzed websites and their relation to the MVVM pattern based on the provided criteria.
