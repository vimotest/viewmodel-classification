https://zsmb.co/an-early-look-at-viewmodel-savedstate/
https://www.linkedin.com/pulse/mvvm-architecture-viewmodel-livedata-part-1-hazem-saleh
https://prosettings.net/players/niko/
https://www.cs.ubc.ca/~gregor/teaching/papers/4+1view-architecture.pdf
https://climbtheladder.com/10-model-view-viewmodel-mvvm-best-practices/


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

https://zsmb.co/an-early-look-at-viewmodel-savedstate/
https://www.linkedin.com/pulse/mvvm-architecture-viewmodel-livedata-part-1-hazem-saleh
https://prosettings.net/players/niko/
https://www.cs.ubc.ca/~gregor/teaching/papers/4+1view-architecture.pdf
https://climbtheladder.com/10-model-view-viewmodel-mvvm-best-practices/

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name:**  zsmb.co - An Early Look at ViewModel SavedState

**Category:**  B*

**Type:**  Personal Blog Article

**Deviation/Extension Aspects:**
- The article focuses on the SavedState support for Android Architecture Component ViewModels.
- It discusses how ViewModels can contribute to savedstate using the new `SavedStateVMFactory`.
- The article provides a detailed walkthrough on how to use this library with example code.
- It emphasizes the importance of separating concerns and provides a pattern for storing a private `MutableLiveData` instance in the ViewModel.
- The article also touches upon potential issues with reusing the same type of ViewModel class for multiple screens.

**New Benefits:**  None mentioned.

**New Drawbacks:**  None mentioned.

**Technology:**  Android (specifically AndroidX and LiveData)

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**  The article provides a detailed discussion on a specific aspect of ViewModel in the context of Android, which is the SavedState support. While it does not provide a comprehensive definition of MVVM, it offers a deviation by focusing on a specific feature of ViewModel in Android. The technology-specific context (Android) is also evident throughout the article.---

Next, I will analyze the second website provided: "[https://www.linkedin.com/pulse/mvvm-architecture-viewmodel-livedata-part-1-hazem-saleh](https://www.linkedin.com/pulse/mvvm-architecture-viewmodel-livedata-part-1-hazem-saleh) ".




Used WebPilot




**Website-Name:**  LinkedIn - MVVM architecture, ViewModel and LiveData (Part 1) by Hazem Saleh

**Category:**  A*

**Type:**  Personal Blog Article

**Deviation/Extension Aspects:**  None mentioned.

**New Benefits:**
- LiveData respects the lifecycle state of your app components (activities, fragments, services) and handles object life cycle management which ensures that LiveData objects do not leak.
- LiveData does not invoke its observer callback unless the LiveData host (activity or fragment) is in an active state.
- LiveData will also automatically remove the observer when its host receives `onDestroy()`.

**New Drawbacks:**  None mentioned.

**Technology:**  Android (specifically LiveData and ViewModel)

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**  The article provides a clear definition of MVVM in the context of Android, focusing on the LiveData and ViewModel components. It adheres to the standard definition of MVVM, emphasizing the separation of concerns and the roles of Model, ViewModel, and View. The article also provides a sample app to illustrate the concepts discussed. The technology-specific context (Android) is evident throughout the article, especially with the focus on LiveData and ViewModel.---

Next, I will analyze the third website provided: "[https://prosettings.net/players/niko/](https://prosettings.net/players/niko/) ".




Used WebPilot




**Website-Name:**  ProSettings - NiKo

**Category:**  D*

**Type:**  Player Profile Page

**Deviation/Extension Aspects:**  N/A

**New Benefits:**  N/A

**New Drawbacks:**  N/A

**Technology:**  Not related to MVVM but mentions gaming setups.

**View/ViewModel Cardinality:**  N/A

**Reason:**  The website is a player profile page for a gamer named NiKo. It does not provide any information related to the MVVM pattern. The content is focused on the player's gaming setup, settings, and equipment. There is no mention or discussion of MVVM or its components.---

Next, I will analyze the fourth website provided: "[https://www.cs.ubc.ca/~gregor/teaching/papers/4+1view-architecture.pdf](https://www.cs.ubc.ca/~gregor/teaching/papers/4+1view-architecture.pdf) ".




Used WebPilot




**Website-Name:**  UBC - 4+1 View Architecture

**Category:**  D

**Type:**  Academic Paper

**Deviation/Extension Aspects:**  N/A

**New Benefits:**  N/A

**New Drawbacks:**  N/A

**Technology:**  N/A

**View/ViewModel Cardinality:**  N/A

**Reason:**  The document is an academic paper discussing the "4+1 View Architecture" model. It does not provide any information related to the MVVM pattern. The content is focused on the 4+1 view model of software architecture, which is a different topic altogether. There is no mention or discussion of MVVM or its components.---

Lastly, I will analyze the fifth website provided: "[https://climbtheladder.com/10-model-view-viewmodel-mvvm-best-practices/](https://climbtheladder.com/10-model-view-viewmodel-mvvm-best-practices/) ".




Used WebPilot




I apologize, but I encountered an error while trying to access the content of the website "[https://climbtheladder.com/10-model-view-viewmodel-mvvm-best-practices/](https://climbtheladder.com/10-model-view-viewmodel-mvvm-best-practices/) ". The website returned a "410 - Gone" status, which means the content is no longer available or has been removed.

Given this, I cannot provide an analysis for this particular website.---

Here's the overview table based on the websites I was able to analyze:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonzsmb.coB*Personal Blog ArticleFocus on SavedState support for Android Architecture Component ViewModelsNoneNoneAndroid (AndroidX and LiveData)Not mentionedDetailed discussion on SavedState support for AndroidLinkedIn - Hazem SalehA*Personal Blog ArticleNoneLiveData respects lifecycle, LiveData handles object life cycle, LiveData does not invoke its observer callback unless activeNoneAndroid (LiveData and ViewModel)Not mentionedStandard MVVM definition in the context of AndroidProSettings - NiKoD*Player Profile PageN/AN/AN/AGaming setupsN/APlayer profile page with no MVVM contentUBC - 4+1 View ArchitectureDAcademic PaperN/AN/AN/AN/AN/AAcademic paper on 4+1 View Architecture with no MVVM contentclimbtheladder.comN/AN/AN/AN/AN/AN/AN/AUnable to access content

I hope this helps with your SLR. If you have any other questions or need further assistance, please let me know.
