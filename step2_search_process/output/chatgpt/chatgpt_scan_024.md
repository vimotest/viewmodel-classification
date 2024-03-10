https://canjs.com/doc/can-component.prototype.ViewModel.html
https://appdevnotes.com/android-viewmodel-tutorial-for-beginners-in-kotlin/
https://dev.to/vtsen/recommended-ways-to-create-viewmodel-or-androidviewmodel-5e7k
https://docs.sencha.com/extjs/6.5.3/modern/Ext.app.ViewModel.html
https://pspdfkit.com/blog/2019/using-viewmodels-to-retain-state-on-android/


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

https://canjs.com/doc/can-component.prototype.ViewModel.html
https://appdevnotes.com/android-viewmodel-tutorial-for-beginners-in-kotlin/
https://dev.to/vtsen/recommended-ways-to-create-viewmodel-or-androidviewmodel-5e7k
https://docs.sencha.com/extjs/6.5.3/modern/Ext.app.ViewModel.html
https://pspdfkit.com/blog/2019/using-viewmodels-to-retain-state-on-android/

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name** : CanJS
**Content Summary** :
- The website discusses the `ViewModel` in the context of CanJS, a JavaScript library.
- The `ViewModel` is defined as a class used to provide values and methods to the component’s view. It is initialized with values specified by the component element’s data bindings.
- The website provides examples of how to set up a `ViewModel` and how it interacts with the view.
- The site emphasizes the importance of writing maintainable and testable `ViewModels` and introduces two styles: imperative and reactive.
- The site also discusses communication between the view and `ViewModel` and between multiple `ViewModels`.

**Analysis** :
- **Category** : B* (Deviation or Stricter Version of the Standard Definition with a specific technology context)
- **Type** : API Documentation
- **Deviation/Extension Aspects** :
- The website focuses on how `ViewModel` is implemented in CanJS, which might not be the standard MVVM definition.
- The site introduces two styles of writing `ViewModels`: imperative and reactive.
- **New Benefits** : Not mentioned
- **New Drawbacks** : Not mentioned
- **Technology** : CanJS
- **View/ViewModel Cardinality** : Not explicitly mentioned
- **Reason** : The website provides a specific way of implementing `ViewModel` in the context of CanJS, which deviates from the standard MVVM definition.

Next, I will analyze the second website.




Used WebPilot




**Website-Name** : AppDevNotes
**Content Summary** :
- The article provides a tutorial on how Android Jetpack ViewModel works using Kotlin. It begins by showing an app without using a ViewModel, highlighting the problems associated with it.
- The tutorial then introduces the ViewModel and demonstrates how to implement it in the app to solve the identified problems.
- The article also touches upon the ViewModelFactory and the difference between AndroidViewModel and ViewModel.
- The tutorial emphasizes the importance of ViewModel in preserving data during configuration changes, such as screen rotation.

**Analysis** :
- **Category** : A* (Standard Definition of MVVM with a specific technology context)
- **Type** : Tutorial
- **Deviation/Extension Aspects** : None
- **New Benefits** :
- ViewModel preserves data during configuration changes like screen rotation.
- Reduces the need to make repeated API calls during configuration changes, saving data and system resources.
- **New Drawbacks** : Not mentioned
- **Technology** : Android Jetpack ViewModel, Kotlin
- **View/ViewModel Cardinality** : Not explicitly mentioned
- **Reason** : The website provides a standard definition of ViewModel in the context of Android Jetpack using Kotlin. It emphasizes the importance of ViewModel in preserving data during configuration changes.

Next, I will analyze the third website.




Used WebPilot




**Website-Name** : DEV Community (Article by Vincent Tsen)
**Content Summary** :
- The article provides Kotlin examples to demonstrate different ways to create ViewModel and AndroidViewModel in Android.
- It highlights the importance of using ViewModelProvider to ensure that the ViewModel survives configuration changes, such as screen rotation.
- The article also discusses the differences between ViewModel and AndroidViewModel and provides examples of how to use each.
- It touches upon the topic of custom constructor parameters for ViewModel and the need for custom ViewModel factories.
- The author shares their personal practices and preferences when working with ViewModel in Android.

**Analysis** :
- **Category** : B* (Deviation or Stricter Version of the Standard Definition with a specific technology context)
- **Type** : Personal Blog Article
- **Deviation/Extension Aspects** :
- The article focuses on the specific ways to create ViewModel and AndroidViewModel in Android using Kotlin, which might not align with the standard MVVM definition.
- It discusses custom constructor parameters and the need for custom ViewModel factories.
- **New Benefits** :
- ViewModel survives configuration changes, such as screen rotation, preventing data loss.
- ViewModel allows sharing data across different fragments, saving time in passing data between fragments.
- **New Drawbacks** : Not mentioned
- **Technology** : Android, Kotlin
- **View/ViewModel Cardinality** : Not explicitly mentioned
- **Reason** : The article provides specific ways of implementing ViewModel in the context of Android using Kotlin, which deviates from the standard MVVM definition.

Next, I will analyze the fourth website.




Used WebPilot




**Website-Name** : Sencha Docs (Ext JS 6.5.3)
**Content Summary** :
- The documentation provides a detailed explanation of the ViewModel in the context of Ext JS, a JavaScript framework.
- It describes the ViewModel as a class that manages data for a component and its descendants.
- The documentation explains how data binding works in Ext JS, including the use of bind configs and formulas.
- It also discusses the concept of "stubs" and how they are used to manage data in the ViewModel.
- The documentation provides examples of how to use the ViewModel in Ext JS, including binding data to components and using formulas to compute values.

**Analysis** :
- **Category** : B* (Deviation or Stricter Version of the Standard Definition with a specific technology context)
- **Type** : Official Documentation
- **Deviation/Extension Aspects** :
- The documentation focuses on the specific implementation of ViewModel in the context of Ext JS, which might not align with the standard MVVM definition.
- It introduces the concept of "stubs" to manage data in the ViewModel.
- It explains the use of bind configs and formulas for data binding in Ext JS.
- **New Benefits** : Not mentioned
- **New Drawbacks** : Not mentioned
- **Technology** : Ext JS (JavaScript framework)
- **View/ViewModel Cardinality** : Not explicitly mentioned
- **Reason** : The documentation provides a specific implementation of ViewModel in the context of Ext JS, which deviates from the standard MVVM definition.

Next, I will analyze the fifth and final website.




Used WebPilot




**Website-Name** : PSPDFKit
**Content Summary** :
- The article discusses the use of ViewModels in Android to retain state, especially during configuration changes like screen rotation.
- It highlights the limitations of default state restoration in Android and introduces ViewModel as a solution.
- The article provides examples of how to use ViewModel and LiveData to retain state and manage data in Android apps.
- It emphasizes the importance of separating business logic from the UI and delivering data to the UI using the observer pattern.
- The article concludes by emphasizing the broader role of ViewModels in apps beyond just state restoration.

**Analysis** :
- **Category** : A* (Standard Definition of MVVM with a specific technology context)
- **Type** : Company Blog Article
- **Deviation/Extension Aspects** : None
- **New Benefits** :
- ViewModel provides easier state restoration.
- ViewModel separates business logic from the UI and delivers data using the observer pattern.
- ViewModel is aware of the lifecycle of UI components, making it a powerful tool for retaining objects and processes related to a UI component.
- **New Drawbacks** : Not mentioned
- **Technology** : Android, Kotlin, LiveData
- **View/ViewModel Cardinality** : Not explicitly mentioned
- **Reason** : The article provides a standard definition of ViewModel in the context of Android, emphasizing its role in retaining state and separating business logic from the UI.

Now, I will generate the overview table with the analyzed websites.



Here's the overview table based on the analysis of the provided websites:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonCanJSB*Official Documentation- Custom properties- Not mentionedNot mentionedCanJSNot mentionedWebsite provides a specific implementation of ViewModel in the context of CanJS, deviating from the standard.AppDevNotesA*TutorialNone- ViewModel preserves data during configuration changes. - Reduces repeated API calls during changes.Not mentionedAndroid Jetpack ViewModel, KotlinNot mentionedProvides a standard definition of ViewModel in the context of Android Jetpack using Kotlin.DEV Community (Vincent Tsen)B*Personal Blog Article- Custom ViewModel factories- ViewModel survives configuration changes. - ViewModel allows sharing data across different fragments.Not mentionedAndroid, KotlinNot mentionedProvides specific ways of implementing ViewModel in Android using Kotlin, deviating from the standard.Sencha Docs (Ext JS 6.5.3)B*Official Documentation- "stubs" for data managementNot mentionedNot mentionedExt JS (JavaScript framework)Not mentionedProvides a specific implementation of ViewModel in the context of Ext JS, deviating from the standard.PSPDFKitA*Company Blog ArticleNone- Easier state restoration. - Separates business logic from UI. - ViewModel retains objects & processes.Not mentionedAndroid, Kotlin, LiveDataNot mentionedProvides a standard definition of ViewModel in the context of Android, emphasizing its role in retaining state.

This table summarizes the findings from the provided websites based on the criteria you've set.
