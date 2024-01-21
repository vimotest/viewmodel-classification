https://en.wiktionary.org/wiki/view_model
https://www.amazon.com/MVVM-Delphi-Architecting-ViewModel-Applications/dp/148422213X
https://docs.mfractor.com/xamarin-forms/working-with-viewmodels/view-viewmodel-navigation/
https://imhoff.blog/posts/view-purity-with-mobx-viewmodels
https://engineering.mercari.com/en/blog/entry/2019-06-12-120000/


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

https://en.wiktionary.org/wiki/view_model
https://www.amazon.com/MVVM-Delphi-Architecting-ViewModel-Applications/dp/148422213X
https://docs.mfractor.com/xamarin-forms/working-with-viewmodels/view-viewmodel-navigation/
https://imhoff.blog/posts/view-purity-with-mobx-viewmodels
https://engineering.mercari.com/en/blog/entry/2019-06-12-120000/

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name:**  Wiktionary, the free dictionary
- **Category:**  D
- **Type:**  Dictionary Entry
- **Deviation/Extension Aspects:**  None
- **New Benefits:**  None
- **New Drawbacks:**  None
- **Technology:**  None
- **View/ViewModel Cardinality:**  Not mentioned
- **Reason:**  The website provides a general definition of "view model" in the context of software engineering and programming. However, it does not provide a detailed definition or explanation of the MVVM architectural pattern.

Proceeding to the next website.




Used WebPilot




**Website-Name:**  Amazon - MVVM in Delphi: Architecting and Building Model View ViewModel Applications
- **Category:**  D*
- **Type:**  Book Listing
- **Deviation/Extension Aspects:**  None
- **New Benefits:**  None
- **New Drawbacks:**  None
- **Technology:**  Delphi
- **View/ViewModel Cardinality:**  Not mentioned
- **Reason:**  The website provides a brief description of a book about MVVM in Delphi. While it mentions the MVVM pattern and its application in Delphi, it does not provide a detailed definition or explanation of the MVVM architectural pattern.

Proceeding to the next website.




Used WebPilot




**Website-Name:**  MFractor Documentation - View-ViewModel Navigation
- **Category:**  A*
- **Type:**  Documentation
- **Deviation/Extension Aspects:**  None
- **New Benefits:**  None
- **New Drawbacks:**  None
- **Technology:**  Xamarin.Forms
- **View/ViewModel Cardinality:**  Not mentioned explicitly, but implies a one-to-one relationship.
- **Reason:**  The website provides a description of the MVVM architectural pattern in the context of Xamarin.Forms. It describes the separation of Model and View logic from View declaration, mentions the three core components (View, ViewModel, and Model), and discusses the data-binding engine. It adheres to the standard definition of MVVM but does so in the context of Xamarin.Forms.

Proceeding to the next website.




Used WebPilot




**Website-Name:**  Retrofuturistic MVVM: Achieving View Purity with MobX ViewModels by Dan Imhoff
- **Category:**  A/B*
- **Type:**  Personal Blog Article
- **Deviation/Extension Aspects:**
- Introduction of "pure views" which are free of any logic that is not strictly presentational.
- Discussion of component bloat and the challenges of managing state and logic in React components.
- Emphasis on the ViewModel acting as a mediator between the model and the view, reducing the view to a stateless template.
- **New Benefits:**
- Improved readability due to a clear separation of logic and template.
- Enhanced maintainability as the relationship between ViewModel and component is not strictly 1:1.
- Better testability with ViewModel allowing unit tests to verify behavior.
- **New Drawbacks:**  None mentioned explicitly.
- **Technology:**  React, MobX
- **View/ViewModel Cardinality:**  Not explicitly mentioned, but implies a one-to-one relationship.
- **Reason:**  The article discusses the MVVM pattern, emphasizing the separation of business logic from view logic using the ViewModel. It introduces the concept of "pure views" and discusses the benefits of this approach, especially in the context of React and MobX. The article adheres to the standard definition of MVVM but introduces some deviations and extensions, especially in the context of React and MobX.

Proceeding to the next website.




Used WebPilot




**Website-Name:**  Mercari Engineering Portal - Introducing ViewModel Inputs/Outputs: a modern approach to MVVM architecture
- **Category:**  B*
- **Type:**  Company Blog Article
- **Deviation/Extension Aspects:**
- Introduction of ViewModel Inputs/Outputs as a modern approach to MVVM.
- Emphasis on the ViewModel acting as a mediator between the model and the view controller.
- ViewModel gets Inputs from the view controller and computes it into Outputs.
- Inputs can be a view controller life cycle event or any event or interaction from the view.
- Outputs are changes the ViewModel wants to update to the view.
- ViewModel acts as the functional core containing pure logic behind the view controller.
- **New Benefits:**
- Inputs/Outputs give ViewModel a clear structure.
- Keeps code style consistent across the entire codebase.
- Reduces app size and dependency on third-party frameworks.
- Increases code testability.
- Easy for team members to collaborate due to well-defined protocols, methods, and interfaces.
- **New Drawbacks:**  None mentioned explicitly.
- **Technology:**  iOS
- **View/ViewModel Cardinality:**  Not explicitly mentioned, but implies a one-to-one relationship.
- **Reason:**  The article introduces ViewModel Inputs/Outputs as a modern approach to MVVM architecture. It emphasizes the ViewModel's role as a mediator and discusses the benefits of this approach, especially in the context of iOS development. The article provides a deviation from the standard MVVM definition by introducing the concept of Inputs/Outputs.

Proceeding to generate the overview table.



Here's the overview table based on the analysis of the provided websites:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReason[Wiktionary, the free dictionary](https://en.wiktionary.org/wiki/view_model) DDictionary EntryNoneNoneNoneNoneNot mentionedProvides a general definition of "view model" but not a detailed definition of MVVM.[Amazon - MVVM in Delphi](https://www.amazon.com/MVVM-Delphi-Architecting-ViewModel-Applications/dp/148422213X) D*Book ListingNoneNoneNoneDelphiNot mentionedProvides a brief description of a book about MVVM in Delphi but not a detailed definition of MVVM.[MFractor Documentation - View-ViewModel Navigation](https://docs.mfractor.com/xamarin-forms/working-with-viewmodels/view-viewmodel-navigation/) A*DocumentationNoneNoneNoneXamarin.FormsImplies one-to-oneDescribes MVVM in the context of Xamarin.Forms, adhering to the standard definition.[Retrofuturistic MVVM by Dan Imhoff](https://imhoff.blog/posts/view-purity-with-mobx-viewmodels) A/B*Personal Blog ArticleIntroduction of "pure views", emphasis on ViewModel as mediator, discussion of component bloat and challenges in React components.Improved readability, enhanced maintainability, better testability.NoneReact, MobXImplies one-to-oneDiscusses MVVM with emphasis on separation of business logic from view logic, introduces deviations in context of React/MobX.[Mercari Engineering Portal](https://engineering.mercari.com/en/blog/entry/2019-06-12-120000/) B*Company Blog ArticleIntroduction of ViewModel Inputs/Outputs, emphasis on ViewModel as mediator between model and view controller.Clear ViewModel structure, consistent code style, reduced app size, increased testability, easy collaboration.NoneiOSImplies one-to-oneIntroduces ViewModel Inputs/Outputs as a modern approach to MVVM, provides a deviation from the standard MVVM definition.

This table provides a concise summary of the analysis for each website based on the criteria you provided.
