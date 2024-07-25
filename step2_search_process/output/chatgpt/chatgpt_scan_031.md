https://schibsted.com/blog/android-databinding-goodbye-presenter-hello-viewmodel/
https://www.jondjones.com/learn-episerver-cms/episerver-developers-tutorials/episerver-mvc/what-should-the-mvc-viewmodel-be-used-for-in-episerver/
https://riggaroo.dev/android-architecture-components-looking-viewmodels-part-2/
https://ajkueterman.dev/posts/android-viewmodel-manual-dependency-injection-made-easy/
https://engineering.q42.nl/compose/


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

https://schibsted.com/blog/android-databinding-goodbye-presenter-hello-viewmodel/
https://www.jondjones.com/learn-episerver-cms/episerver-developers-tutorials/episerver-mvc/what-should-the-mvc-viewmodel-be-used-for-in-episerver/
https://riggaroo.dev/android-architecture-components-looking-viewmodels-part-2/
https://ajkueterman.dev/posts/android-viewmodel-manual-dependency-injection-made-easy/
https://engineering.q42.nl/compose/

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**[object Object]**
- **Website-Name** : Schibsted
- **Type** : Company blog article

**Content Analysis** :
- The article discusses the transition from using Presenters to ViewModels in Android development.
- It mentions the use of Android's DataBinding library.
- The article provides a brief introduction to MVVM and its components.
- It emphasizes the benefits of using MVVM with Android's DataBinding.
- The article provides code examples specific to Android development.
- It mentions the ViewModel's responsibility to expose data for the UI and handle UI-related logic.
- The article does not delve deep into the standard definition of MVVM but focuses on its application in Android development with DataBinding.

**Category Determination** :
- **Category** : A* (Standard Definition of MVVM in the context of Android's DataBinding)
- **Technology** : Android's DataBinding
- **Deviation/Extension Aspects** : None detected.
- **New Benefits** : None detected.
- **New Drawbacks** : None detected.
- **View/ViewModel Cardinality** : Not explicitly mentioned.
- **Reason** : The article provides a brief introduction to MVVM and its application in Android development using the DataBinding library. It does not deviate from the standard definition but focuses on the practical application in a specific technology context.---

I will now proceed to analyze the next website.


[Android Databinding: Goodbye Presenter, hello ViewModel! | Schibsted
schibsted.com](https://schibsted.com/blog/android-databinding-goodbye-presenter-hello-viewmodel/)




Used WebPilot




**[object Object]**
- **Website-Name** : Jon D Jones
- **Type** : Tutorial

**Content Analysis** :
- The article discusses the purpose and use of the ViewModel in the context of Episerver CMS with MVC.
- It provides an overview of MVC and how it relates to Episerver.
- The article emphasizes the distinction between the page-type and block-type objects in Episerver and the ViewModel.
- It mentions the ViewModel as a filter between properties defined in the CMS and the data exposed to the front-end view.
- The article provides code examples specific to Episerver.
- It discusses various reasons and scenarios for using a ViewModel in Episerver, including reducing code, resolving URLs, CSS logic, concatenating elements, and handling image alt tags.
- The article concludes by emphasizing the separation of presentation and business logic.

**Category Determination** :
- **Category** : B* (Deviation or Stricter Version of the Standard Definition in the context of Episerver)
- **Technology** : Episerver CMS
- **Deviation/Extension Aspects** :
- Emphasis on the ViewModel as a filter between CMS properties and front-end view.
- Discussion on the base ViewModel to reduce code.
- Mention of specific use cases like URL resolving, CSS logic, and image alt tags.
- **New Benefits** : None detected.
- **New Drawbacks** : None detected.
- **View/ViewModel Cardinality** : Not explicitly mentioned.
- **Reason** : The article provides a detailed discussion on the use of ViewModel in the context of Episerver CMS. It emphasizes specific patterns and practices related to Episerver, which deviates from the standard MVVM definition.---

I will now proceed to analyze the next website.




Used WebPilot




**[object Object]**
- **Website-Name** : Rebecca Franks - @riggaroo
- **Type** : Personal blog article

**Content Analysis** :
- The article discusses Android Architecture components, specifically focusing on ViewModels.
- It provides a brief history of the ViewModel concept, tracing its origin to the MVVM pattern designed by Microsoft.
- The article emphasizes the benefits of using ViewModel in Android, such as retaining state across Activity configuration changes and sharing data across Fragments.
- It provides code examples specific to Android development, showcasing how to create and use ViewModels.
- The article mentions the use of LiveData, Room, and Dagger in conjunction with ViewModels.
- It discusses the separation of concerns, where the ViewModel is responsible for preparing and exposing data for the View.
- The article concludes by highlighting the ease of handling screen rotation using ViewModel and ViewModelProvider.

**Category Determination** :
- **Category** : A* (Standard Definition of MVVM in the context of Android's Architecture Components)
- **Technology** : Android's Architecture Components (LiveData, Room, Dagger)
- **Deviation/Extension Aspects** : None detected.
- **New Benefits** :
- ViewModel can retain its state across Activity configuration changes.
- ViewModel allows easy sharing of data across Fragments.
- ViewModel outlives specific Activity or Fragment instances.
- **New Drawbacks** : None detected.
- **View/ViewModel Cardinality** : Not explicitly mentioned.
- **Reason** : The article provides a detailed discussion on the use of ViewModel in the context of Android's Architecture Components. It aligns with the standard definition of MVVM and emphasizes its application in Android development.---

I will now proceed to analyze the next website.




Used WebPilot




**[object Object]**
- **Website-Name** : AJ Kueterman
- **Type** : Personal blog article

**Content Analysis** :
- The article discusses manual dependency injection in Android ViewModels.
- It mentions Android's support for Dependency Injection frameworks like Dagger and Hilt.
- The article provides a guide to manual dependency injection for ViewModels in Android.
- It introduces the Android Lifecycle ViewModel Kotlin Extensions library for easier ViewModel instantiation.
- The article provides code examples showcasing how to manually inject dependencies into Android Activity & Fragment ViewModels.
- It emphasizes the benefits of using ViewModel in Android, such as retaining state across Activity configuration changes.
- The article concludes by presenting a library for easy ViewModel creation and Dependency Injection.

**Category Determination** :
- **Category** : A* (Standard Definition of MVVM in the context of Android's ViewModel and Dependency Injection)
- **Technology** : Android's ViewModel, Kotlin Extensions, Dagger, Hilt
- **Deviation/Extension Aspects** : None detected.
- **New Benefits** :
- ViewModel can retain its state across Activity configuration changes.
- ViewModel allows easy sharing of data across Fragments.
- ViewModel outlives specific Activity or Fragment instances.
- **New Drawbacks** : None detected.
- **View/ViewModel Cardinality** : Not explicitly mentioned.
- **Reason** : The article provides a detailed discussion on the use of ViewModel in the context of Android's ViewModel and Dependency Injection. It aligns with the standard definition of MVVM and emphasizes its application in Android development.---

I will now proceed to analyze the last website.




Used WebPilot




**[object Object]**
- **Website-Name** : Q42 Engineering
- **Type** : Company blog article

**Content Analysis** :
- The article discusses the challenge of scoping a ViewModel per Composable in Android.
- It introduces the concept of "rememberScoped", a library built to support ViewModel scoping in Compose.
- The article provides examples of how to use "rememberScoped" to create a ViewModel for each Composable.
- It emphasizes the benefits of having a ViewModel for each Composable, allowing for more modular and reusable components.
- The article also touches upon the evolution of Android development, from the days of the "God Activity" to the current state of Compose and ViewModel scoping.
- It mentions the use of Jetpack libraries and the challenges of connecting UI components with business logic.
- The article concludes by highlighting the potential impact of this approach on app architectures like Server Driven UI.

**Category Determination** :
- **Category** : A* (Standard Definition of MVVM in the context of Android's Compose and ViewModel scoping)
- **Technology** : Android's Compose, rememberScoped library
- **Deviation/Extension Aspects** : None detected.
- **New Benefits** :
- ViewModel per Composable allows for more modular and reusable components.
- Reduces the need for large "glue" classes or screen's ViewModel.
- **New Drawbacks** : None detected.
- **View/ViewModel Cardinality** : Not explicitly mentioned.
- **Reason** : The article provides a detailed discussion on the use of ViewModel in the context of Android's Compose and the challenge of scoping a ViewModel per Composable. It aligns with the standard definition of MVVM and emphasizes its application in Android development.---

I will now generate an overview table with the analyzed websites.


[Every Composable deserves a ViewModel
q42.nl](https://engineering.q42.nl/compose/)



**Overview Table** Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonSchibstedA*Company blog articleNone detectedNone detectedNone detectedAndroid's DataBindingNot mentionedStandard MVVM definition in context of Android's DataBindingJon D JonesB*TutorialViewModel as a filter between CMS properties and front-end view; Base ViewModel to reduce code; Specific use cases like URL resolving, CSS logicNone detectedNone detectedEpiserver CMSNot mentionedDeviation from standard MVVM definition in context of EpiserverRebecca Franks - @riggarooA*Personal blog articleNone detectedViewModel retains state across Activity configuration changes; ViewModel allows data sharing across FragmentsNone detectedAndroid's Architecture Components (LiveData, Room, Dagger)Not mentionedStandard MVVM definition in context of Android's Architecture ComponentsAJ KuetermanA*Personal blog articleNone detectedViewModel retains state across Activity configuration changes; ViewModel allows data sharing across FragmentsNone detectedAndroid's ViewModel, Kotlin Extensions, Dagger, HiltNot mentionedStandard MVVM definition in context of Android's ViewModel and Dependency InjectionQ42 EngineeringA*Company blog articleNone detectedViewModel per Composable allows for more modular and reusable componentsNone detectedAndroid's Compose, rememberScoped libraryNot mentionedStandard MVVM definition in context of Android's Compose and ViewModel scoping

This table provides a concise summary of the analysis of the provided websites in relation to the MVVM pattern and its application in various contexts.
