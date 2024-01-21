https://insert-koin.io/docs/reference/koin-android/viewmodel
https://android.googlesource.com/platform/frameworks/support/+/refs/heads/androidx-main/lifecycle/lifecycle-viewmodel/src/main/java/androidx/lifecycle/ViewModel.java
https://blog.mindorks.com/android-viewmodels-under-the-hood
https://docs.oracle.com/en/middleware/developer-tools/jet/12/develop/define-viewmodel.html
https://www.techyourchance.com/you-dont-need-android-viewmodel/


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

https://insert-koin.io/docs/reference/koin-android/viewmodel
https://android.googlesource.com/platform/frameworks/support/+/refs/heads/androidx-main/lifecycle/lifecycle-viewmodel/src/main/java/androidx/lifecycle/ViewModel.java
https://blog.mindorks.com/android-viewmodels-under-the-hood
https://docs.oracle.com/en/middleware/developer-tools/jet/12/develop/define-viewmodel.html
https://www.techyourchance.com/you-dont-need-android-viewmodel/

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name:**  Koin - Android ViewModel & Navigation

**Content Summary:**
The Koin Android documentation introduces the `viewModel` DSL keyword to declare a ViewModel component and bind it to an Android Component lifecycle. It provides various ways to declare and inject ViewModel instances in Android components like Activities and Fragments. The documentation also touches upon shared ViewModels, passing parameters to ViewModel constructors, and SavedStateHandle injection. Additionally, it mentions the ability to scope a ViewModel instance to a Navigation graph and provides some "under the hood" API details.

**Analysis:**
- **Category:**  B* (Deviation or Stricter Version of the Standard Definition with a specific technology context)
- **Type:**  Tutorial/Documentation
- **Deviation/Extension Aspects:**
- Focuses on the declaration and injection of ViewModel in Android components.
- Discusses shared ViewModel instances between Fragments and their host Activity.
- Mentions SavedStateHandle injection for handling ViewModel state.
- Introduces Navigation Graph ViewModel scoping.
- **New Benefits:**  None mentioned explicitly.
- **New Drawbacks:**  None mentioned explicitly.
- **Technology:**  Koin for Android
- **View/ViewModel Cardinality:**  Not explicitly mentioned.
- **Reason:**  The website provides a technology-specific (Koin for Android) approach to MVVM, focusing on ViewModel declaration and injection. It does not provide a comprehensive definition of MVVM but offers specific methods and techniques related to ViewModel in the context of Android.---

I will now proceed to the next website.




Used WebPilot




**Website-Name:**  Android Open Source Project - ViewModel.java

**Content Summary:**
The provided link is a source code file for the `ViewModel` class in the AndroidX library. The `ViewModel` class is described as being responsible for preparing and managing data for an Android Activity or Fragment. It also handles the communication between the Activity/Fragment and the rest of the application, such as calling business logic classes. The `ViewModel` is designed to survive configuration changes like screen rotations. The primary purpose of the `ViewModel` is to acquire and retain information necessary for an Activity or Fragment. It should never access the view hierarchy or hold references to the Activity or Fragment. The documentation provides code examples of typical usage from both an Activity and ViewModel standpoint. It also touches upon the use of ViewModels for communication between different Fragments of an Activity.

**Analysis:**
- **Category:**  A* (Standard Definition of MVVM with a specific technology context)
- **Type:**  Source Code/Documentation
- **Deviation/Extension Aspects:**  None observed.
- **New Benefits:**  None mentioned explicitly.
- **New Drawbacks:**  None mentioned explicitly.
- **Technology:**  AndroidX ViewModel
- **View/ViewModel Cardinality:**  Not explicitly mentioned, but implies a one-to-one relationship between an Activity/Fragment and its ViewModel.
- **Reason:**  The website provides a technology-specific (AndroidX ViewModel) approach to MVVM. It aligns with the standard definition of MVVM, focusing on the ViewModel's role in managing data and its lifecycle in relation to Android components.---

I will now proceed to the next website.




Used WebPilot




**Website-Name:**  MindOrks - Android ViewModels: Under the hood

**Content Summary:**
The article delves into the internals of the `ViewModel` component, which is part of Android Architecture Components. It begins by explaining the purpose of the `ViewModel` class, emphasizing its role in storing and managing UI-related data in a lifecycle-conscious manner. The article highlights the advantages of using the `ViewModel` class, such as handling configuration changes, lifecycle awareness, data sharing between fragments, and Kotlin-Coroutines support. The main focus of the article is on how `ViewModel` retains its state during configuration changes, like screen rotations. It provides a detailed walkthrough of the underlying mechanisms, including the role of `ViewModelStore`, `ViewModelProvider`, and `NonConfigurationInstances`.

**Analysis:**
- **Category:**  A* (Standard Definition of MVVM with a specific technology context)
- **Type:**  Personal Blog Article
- **Deviation/Extension Aspects:**  None observed.
- **New Benefits:**
- Handle configuration changes: ViewModel objects are automatically retained during activity recreation due to configuration changes.
- Lifecycle Awareness: ViewModel objects are lifecycle-aware and are cleared when the observed lifecycle is permanently destroyed.
- Data Sharing: Data can be easily shared between fragments in an activity using ViewModels.
- Kotlin-Coroutines support: ViewModel includes support for Kotlin-Coroutines, facilitating asynchronous processing.
- **New Drawbacks:**  None mentioned explicitly.
- **Technology:**  Android ViewModel
- **View/ViewModel Cardinality:**  Not explicitly mentioned, but implies a one-to-one relationship between an Activity/Fragment and its ViewModel.
- **Reason:**  The article provides a technology-specific (Android ViewModel) approach to MVVM. It aligns with the standard definition of MVVM, emphasizing the ViewModel's role in managing data, its lifecycle, and its retention during configuration changes.---

I will now proceed to the next website.




Used WebPilot




**Website-Name:**  Oracle Help Center - Developing Oracle JET Apps Using MVVM Architecture

**Content Summary:**
The Oracle documentation provides a guide on developing Oracle JET (JavaScript Extension Toolkit) applications using the MVVM architecture. The focus is on defining the ViewModel. The documentation explains how to identify the data source for an application and create the ViewModel. It provides an example of a REST service output and how to parse this data. The documentation then delves into the process of defining the data model using `Model.extend()` and the collection using `Collection.extend()`. The documentation also touches upon populating the collection with data by calling `Collection.fetch()`. The guide is technical and provides code snippets to help developers understand the implementation details.

**Analysis:**
- **Category:**  A* (Standard Definition of MVVM with a specific technology context)
- **Type:**  Official Documentation
- **Deviation/Extension Aspects:**  None observed.
- **New Benefits:**  None mentioned explicitly.
- **New Drawbacks:**  None mentioned explicitly.
- **Technology:**  Oracle JET (JavaScript Extension Toolkit)
- **View/ViewModel Cardinality:**  Not explicitly mentioned.
- **Reason:**  The documentation provides a technology-specific (Oracle JET) approach to MVVM. It aligns with the standard definition of MVVM, focusing on the ViewModel's role in managing data and its lifecycle.---

I will now proceed to the last website.




Used WebPilot




**Website-Name:**  TechYourChance - You Don't Need Android ViewModel, Here is Why

**Content Summary:**
The article critically evaluates the use of the `ViewModel` component in Android development. The author argues that while `ViewModel` is popular, it might not be necessary for many Android projects. The article discusses several aspects of `ViewModel`, including its role in separation of concerns, preserving state on configuration changes, auto-clearing when leaving the logical screen, and auto-managed coroutine scope. The author suggests that there are alternative solutions and approaches that can be used instead of `ViewModel` and that the component brings unnecessary complexity into the codebase. The article concludes by predicting that `ViewModel` might eventually become obsolete, similar to the fate of Android Loaders.

**Analysis:**
- **Category:**  C (New Benefits/Drawbacks)
- **Type:**  Personal Blog Article
- **Deviation/Extension Aspects:**  None observed.
- **New Benefits:**  None mentioned explicitly.
- **New Drawbacks:**
- `ViewModel` brings unnecessary complexity into the codebase.
- Potential for tricky bugs with the management of `viewModelScope` inside `ViewModel`.
- Using `viewModelScope` can lead to user data loss in certain scenarios.
- **Technology:**  Android ViewModel
- **View/ViewModel Cardinality:**  Not explicitly mentioned.
- **Reason:**  The article provides a critical perspective on the use of `ViewModel` in Android development. It does not strictly adhere to the standard definition of MVVM but offers alternative viewpoints and potential drawbacks of using the `ViewModel` component.---

I will now generate an overview table with the analyzed websites.



Here's the overview table based on the analysis of the provided websites:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonKoin - Android ViewModel & NavigationB*Tutorial/DocumentationDeclaration and injection of ViewModel, Shared ViewModel instances, SavedStateHandle injection, Navigation Graph ViewModel scopingNoneNoneKoin for AndroidNot mentionedTechnology-specific approach to MVVM, focusing on ViewModel declaration and injectionAndroid Open Source Project - ViewModel.javaA*Source Code/DocumentationNoneNoneNoneAndroidX ViewModelImplies one-to-oneTechnology-specific approach to MVVM, focusing on ViewModel's role in managing data and its lifecycleMindOrks - Android ViewModels: Under the hoodA*Personal Blog ArticleNoneHandle configuration changes, Lifecycle Awareness, Data Sharing, Kotlin-Coroutines supportNoneAndroid ViewModelImplies one-to-oneTechnology-specific approach to MVVM, emphasizing ViewModel's role in managing data, its lifecycle, and retention during configuration changesOracle Help Center - Developing Oracle JET Apps Using MVVM ArchitectureA*Official DocumentationNoneNoneNoneOracle JETNot mentionedTechnology-specific approach to MVVM, focusing on ViewModel's role in managing data and its lifecycleTechYourChance - You Don't Need Android ViewModel, Here is WhyCPersonal Blog ArticleNoneNoneBrings unnecessary complexity, Potential for tricky bugs, User data loss with viewModelScopeAndroid ViewModelNot mentionedCritical perspective on ViewModel, offering alternative viewpoints and potential drawbacks

This table provides a concise summary of the analysis for each website in relation to the MVVM pattern, its definition, deviations, benefits, drawbacks, and the technology context.
