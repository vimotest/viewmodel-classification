https://heartbeat.comet.ml/using-viewmodels-in-android-to-preserve-your-running-apps-state-e56e63f689f3
https://cocoacasts.com/how-does-mvvm-work
https://blog.kotzilla.io/koin-android-stronger-viewmodel-api/
https://voyager.adriel.cafe/android-viewmodel
https://www.valueof.io/blog/stateflow-sharedflow-flow-viewmodel-lifecycle


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

https://heartbeat.comet.ml/using-viewmodels-in-android-to-preserve-your-running-apps-state-e56e63f689f3
https://cocoacasts.com/how-does-mvvm-work
https://blog.kotzilla.io/koin-android-stronger-viewmodel-api/
https://voyager.adriel.cafe/android-viewmodel
https://www.valueof.io/blog/stateflow-sharedflow-flow-viewmodel-lifecycle

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name:**  heartbeat.comet.ml (Medium Article)

**Content Summary:**
The article discusses the use of ViewModels in Android to preserve the state of an app, especially when the phone's orientation changes. The author highlights the problem of app restarts when the orientation changes, leading to loss of the app's current state. The solution proposed is the use of ViewModels, which are designed to store and manage UI-related data in a lifecycle-aware manner. The article provides a step-by-step guide on how to implement ViewModels in Android, emphasizing that ViewModels should not store Android-specific components to avoid memory leaks.

**Analysis:**
- **Category:**  B* (Deviation or Stricter Version of the Standard Definition with a specific technology context)
- **Type:**  Personal Blog Article
- **Deviation/Extension Aspects:**
- Emphasis on using ViewModels to preserve the state of an app during orientation changes.
- Detailed steps on implementing ViewModels in Android.
- Caution against storing Android-specific components in ViewModels.
- **New Benefits:**  None mentioned beyond the standard definition.
- **New Drawbacks:**  None mentioned beyond the standard definition.
- **Technology:**  Android
- **View/ViewModel Cardinality:**  Not explicitly mentioned.
- **Reason:**  The article provides a specific use case for ViewModels in Android, focusing on preserving app state during orientation changes. It offers a detailed guide on implementing ViewModels in Android, which is a deviation from the standard definition. The technology-specific context (Android) is evident throughout the article.---

Next, I will analyze the second website URL provided.




Used WebPilot




**Website-Name:**  cocoacasts.com

**Content Summary:**
The article delves into the internals of the Model-View-ViewModel (MVVM) pattern, exploring its structure and how it functions. It emphasizes the distinction between the Model-View-Controller (MVC) and MVVM patterns. The article lists several advantages of MVVM over MVC, including better separation of concerns, improved testability, and transparent communication between components. The article also outlines six basic rules that define the MVVM pattern, emphasizing the relationships and responsibilities of each component in the pattern.

**Analysis:**
- **Category:**  A* (Standard Definition of MVVM with a specific technology context)
- **Type:**  Tutorial
- **Deviation/Extension Aspects:**  None. The article adheres to the standard definition of MVVM.
- **New Benefits:**
- Transparent communication between the four components or layers of your application.
- **New Drawbacks:**  None mentioned beyond the standard definition.
- **Technology:**  Swift (iOS development)
- **View/ViewModel Cardinality:**  Not explicitly mentioned.
- **Reason:**  The article provides a clear and concise explanation of the MVVM pattern, aligning with the standard definition. It offers insights into the advantages of MVVM over MVC and outlines the basic rules that define the MVVM pattern. The context of Swift for iOS development is evident throughout the article.---

Next, I will analyze the third website URL provided.




Used WebPilot




**Website-Name:**  The Kotzilla Blog (blog.kotzilla.io)

**Content Summary:**
The article announces the release of `koin-android` and `koin-androidx-compose` in version 3.3.0, focusing on ViewModel API updates. It provides a detailed overview of how ViewModel features have been enhanced in this version. The article discusses the evolution of the Android ViewModel library and its integration with various Android components. It emphasizes the simplicity of using Koin for ViewModel declaration and instantiation. The article also touches upon the use of `SavedStateHandle` in ViewModels and how it has been simplified in the new version. The article concludes by mentioning that the updates have been ported to the `koin-androidx-compose` project, making it ready for Android Jetpack Compose.

**Analysis:**
- **Category:**  B* (Deviation or Stricter Version of the Standard Definition with a specific technology context)
- **Type:**  Company Blog Article
- **Deviation/Extension Aspects:**
- Detailed discussion on the use of `SavedStateHandle` in ViewModels.
- Emphasis on the simplicity of using Koin for ViewModel declaration and instantiation.
- Mention of the ability to share the same ViewModel instance between an Activity and its Fragments.
- **New Benefits:**
- Simplified use of `SavedStateHandle` in ViewModels.
- Easier ViewModel declaration and instantiation using Koin.
- **New Drawbacks:**  None mentioned beyond the standard definition.
- **Technology:**  Android, Koin, Android Jetpack Compose
- **View/ViewModel Cardinality:**  Not explicitly mentioned.
- **Reason:**  The article provides a detailed overview of ViewModel features in the context of the Koin library for Android. It offers insights into the enhancements made in the new version, focusing on the use of `SavedStateHandle` and the simplicity of using Koin for ViewModel operations. The technology-specific context (Android, Koin, Android Jetpack Compose) is evident throughout the article.---

Next, I will analyze the fourth website URL provided.




Used WebPilot




**Website-Name:**  voyager.adriel.cafe

**Content Summary:**
The webpage provides guidance on using the AndroidScreen with the Voyager library. It emphasizes that if developers are using ViewModel from AndroidX, they should utilize AndroidScreen or implement the ScreenLifecycleProvider interface. The page provides code snippets to demonstrate how to use AndroidScreen and how it offers its own LocalViewModelStoreOwner and LocalSavedStateRegistryOwner. This ensures that developers can create ViewModels without relying on Activity or Fragment. The page also introduces the ScreenModel, which functions similarly to ViewModel but is compatible with Compose Multiplatform. Additionally, the page offers guidance on manual integration for those who do not wish to inherit from an abstract class.

**Analysis:**
- **Category:**  B* (Deviation or Stricter Version of the Standard Definition with a specific technology context)
- **Type:**  Tutorial
- **Deviation/Extension Aspects:**
- Introduction of AndroidScreen and its capabilities.
- Emphasis on the ScreenModel, which is similar to ViewModel but compatible with Compose Multiplatform.
- Guidance on manual integration for ViewModel compatibility.
- **New Benefits:**  None mentioned beyond the standard definition.
- **New Drawbacks:**  None mentioned beyond the standard definition.
- **Technology:**  Android, Voyager, AndroidX, Compose Multiplatform
- **View/ViewModel Cardinality:**  Not explicitly mentioned.
- **Reason:**  The webpage provides specific guidance on using AndroidScreen with the Voyager library in the context of Android development. It introduces concepts like ScreenModel and offers insights into manual integration for ViewModel compatibility. The technology-specific context (Android, Voyager, AndroidX, Compose Multiplatform) is evident throughout the content.---

Next, I will analyze the fifth and final website URL provided.




Used WebPilot




**Website-Name:**  valueof.io

**Content Summary:**
The article on valueof.io focuses on the use of StateFlow, SharedFlow, and Flow in the context of ViewModel and lifecycle in Android development. It begins by explaining the challenges developers face when managing UI state and how StateFlow can help. The article then delves into the differences between StateFlow and LiveData, highlighting the benefits of StateFlow. It provides code examples to demonstrate how to use StateFlow with ViewModel. The article also introduces SharedFlow, which is similar to StateFlow but can have multiple subscribers. It provides guidance on when to use StateFlow vs. SharedFlow. The article concludes by discussing the benefits of using Flow with ViewModel, emphasizing its advantages over LiveData.

**Analysis:**
- **Category:**  B* (Deviation or Stricter Version of the Standard Definition with a specific technology context)
- **Type:**  Blog Article
- **Deviation/Extension Aspects:**
- Detailed explanation of StateFlow and its benefits over LiveData.
- Introduction of SharedFlow and guidance on when to use it over StateFlow.
- Emphasis on the advantages of using Flow with ViewModel in Android development.
- **New Benefits:**
- StateFlow offers better performance and less boilerplate code compared to LiveData.
- Flow with ViewModel provides more flexibility and better performance than LiveData.
- **New Drawbacks:**  None mentioned beyond the standard definition.
- **Technology:**  Android, StateFlow, SharedFlow, Flow, LiveData
- **View/ViewModel Cardinality:**  Not explicitly mentioned.
- **Reason:**  The article provides a deep dive into the use of StateFlow, SharedFlow, and Flow with ViewModel in Android development. It offers insights into the benefits of these technologies over LiveData and provides code examples to demonstrate their usage. The technology-specific context (Android, StateFlow, SharedFlow, Flow, LiveData) is evident throughout the content.---

Now, I will generate an overview table with the extracted information from all the analyzed websites.



**Overview Table** Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonheartbeat.comet.mlB*Blog ArticleFocus on ViewModel's role in preserving app state in AndroidViewModel helps in preserving app state during configuration changesNone mentioned beyond the standard definitionAndroid, ViewModelNot explicitly mentionedEmphasis on ViewModel's role in preserving app state in Androidcocoacasts.comA*TutorialNoneNoneNoneSwift, iOSNot explicitly mentionedStandard MVVM definition in the
