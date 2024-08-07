https://www.reddit.com/r/csharp/comments/ttih4e/what_is_mvvm/
https://dev.to/vtsen/mvc-vs-mvp-vs-mvvm-design-patterns-443n
https://proandroiddev.com/understanding-mvvm-pattern-for-android-in-2021-98b155b37b54
https://docs.oracle.com/en/middleware/developer-tools/jet/13.1/mvvm.html
https://www.pluralsight.com/courses/wpf-mvvm-in-depth


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

https://www.reddit.com/r/csharp/comments/ttih4e/what_is_mvvm/
https://dev.to/vtsen/mvc-vs-mvp-vs-mvvm-design-patterns-443n
https://proandroiddev.com/understanding-mvvm-pattern-for-android-in-2021-98b155b37b54
https://docs.oracle.com/en/middleware/developer-tools/jet/13.1/mvvm.html
https://www.pluralsight.com/courses/wpf-mvvm-in-depth

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name:**  Reddit (r/csharp) - "What is MVVM?"

**Category:**  B*

**Type:**  Forum Discussion

**Deviation/Extension Aspects:**
- MVVM is not just for WPF.
- ViewModel is written with no knowledge of what the front end will be.
- ViewModel should be in a separate project.
- MVVM is all about UI, and it helps structure the UI, not the entire project.
- MVVM is about separation of UI and business logic.

**New Benefits:**
- MVVM allows for vertical scaling, enabling the implementation of one feature at a time.
- MVVM helps tighten the domain at each phase, creating a bottleneck between the front end and the backend.

**New Drawbacks:**  None mentioned.

**Technology:**  WPF, Xamarin, Maui

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The discussion provides insights into MVVM, emphasizing its role in separating UI and business logic.
- Some comments discuss the MVVM pattern in the context of specific technologies like WPF, Xamarin, and Maui.
- The discussion touches upon the core principles of MVVM but also introduces some deviations or extensions to the standard definition.---

Now, I'll proceed to the next website.




Used WebPilot




**Website-Name:**  DEV Community - "MVC vs MVP vs MVVM Design Patterns" by Vincent Tsen

**Category:**  A/B*

**Type:**  Blog Article

**Deviation/Extension Aspects:**
- MVVM is highlighted for its unidirectional data flow, making the architecture cleaner.
- The article mentions that the Activity/Fragment has been moved up to View in MVVM.
- The dependency and data flow in MVVM are unidirectional.
- MVVM is described as better than MVC/MVP due to its unidirectional data and dependency flow.

**New Benefits:**
- MVVM's unidirectional data and dependency flow make it easier to decouple components when needed.
- MVVM is easier for testing.

**New Drawbacks:**  None mentioned.

**Technology:**  Android, Kotlin

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The article provides a comparison between MVC, MVP, and MVVM, highlighting the differences and benefits of each.
- MVVM is discussed in the context of Android development, with a focus on its unidirectional data flow.
- The article mentions some deviations from the standard definition, especially regarding the unidirectional nature of MVVM.---

I'll now proceed to the next website.




Used WebPilot




**Website-Name:**  ProAndroidDev - "Understanding MVVM pattern for Android in 2021" by Christopher Elias

**Category:**  B*

**Type:**  Blog Article

**Deviation/Extension Aspects:**
- Emphasis on the unidirectional data flow in MVVM.
- The article challenges the common understanding of "Model" in MVVM, suggesting that the Model should represent the current state of the view.
- The Model can represent states like loading, success, or failure, and the view should render the UI based on this state.

**New Benefits:**  None mentioned.

**New Drawbacks:**  None mentioned.

**Technology:**  Android

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The article provides a detailed understanding of MVVM, especially in the context of Android development.
- It emphasizes the role of the Model in representing the current state of the view.
- The article introduces some deviations from the standard definition, especially regarding the role and representation of the Model in MVVM.---

I'll now proceed to the next website.




Used WebPilot




**Website-Name:**  Oracle Help Center - "Oracle JET 13.1.0 - MVVM"

**Category:**  A*

**Type:**  Official Documentation

**Deviation/Extension Aspects:**  None mentioned.

**New Benefits:**  None mentioned.

**New Drawbacks:**  None mentioned.

**Technology:**  Oracle JET (JavaScript Extension Toolkit)

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The documentation provides a brief description of the MVVM architecture in the context of Oracle JET.
- It states that Oracle JET supports the MVVM design pattern where the Model represents the application data, the View is the presentation of the data, and the ViewModel exposes data from the Model to the view while maintaining the application's state.
- The description aligns with the standard definition of MVVM.---

I'll now proceed to the next website.




Used WebPilot




**Website-Name:**  Pluralsight - "WPF MVVM in Depth" by Brian Noyes

**Category:**  A*

**Type:**  Online Course

**Deviation/Extension Aspects:**  None mentioned.

**New Benefits:**  None mentioned.

**New Drawbacks:**  None mentioned.

**Technology:**  WPF

**View/ViewModel Cardinality:**  Not explicitly mentioned.

**Reason:**
- The course provides comprehensive coverage of the MVVM pattern, especially in the context of WPF applications.
- It discusses the fundamental concepts of MVVM, how to apply it to various scenarios, and how to hook up Views and ViewModels.
- The course content aligns with the standard definition of MVVM, with a focus on its application in WPF.---

I'll now generate the overview table with the collected information.



Here's the overview table based on the analysis of the provided websites:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonReddit (r/csharp)B*Forum DiscussionMVVM not just for WPF, ViewModel in separate project, MVVM about UI structuringAllows vertical scaling, tightens domainNoneWPF, Xamarin, MauiNot mentionedDiscussion on MVVM's role in UI and business logic separationDEV CommunityA/B*Blog ArticleEmphasis on unidirectional data flow, Activity/Fragment as ViewEasier decoupling, easier testingNoneAndroid, KotlinNot mentionedMVVM's unidirectional data flow in Android contextProAndroidDevB*Blog ArticleEmphasis on unidirectional data flow, Model represents view stateNoneNoneAndroidNot mentionedRole of Model in representing view stateOracle Help CenterA*Official DocumentationNoneNoneNoneOracle JETNot mentionedBrief description of MVVM in Oracle JET contextPluralsightA*Online CourseNoneNoneNoneWPFNot mentionedComprehensive coverage of MVVM in WPF context

This table provides a concise summary of the information extracted from each website regarding the MVVM pattern.
