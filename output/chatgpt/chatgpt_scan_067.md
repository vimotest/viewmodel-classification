https://skillbox.ru/media/code/mvvm_proektirovanie_prilozheniy_dlya_windows/
https://angular.io/guide/architecture
https://ebikes-carwitz.de/uwp-xaml.html
https://elitesec-group.de/xaml-in-c.html
https://en-academic.com/dic.nsf/enwiki/11756555


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

https://skillbox.ru/media/code/mvvm_proektirovanie_prilozheniy_dlya_windows/
https://angular.io/guide/architecture
https://ebikes-carwitz.de/uwp-xaml.html
https://elitesec-group.de/xaml-in-c.html
https://en-academic.com/dic.nsf/enwiki/11756555

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name:**  skillbox.ru
**Content Summary:**
The article on skillbox.ru discusses the MVVM (Model-View-ViewModel) design pattern, emphasizing its utility in creating applications that are easy to test and maintain. The article breaks down the three functional parts of MVVM: Model (main logic of the program), View (user interface), and ViewModel (serves as a layer between View and Model). The separation of these components accelerates development and enhances the maintainability of the software. The article further illustrates the MVVM pattern using a real-world analogy involving a celebrity (Model), PR-manager (ViewModel), and the press (View). The article also provides code examples in the context of a WPF application, showcasing data binding and the interaction between the components. The article concludes by highlighting the advantages of MVVM, such as focusing on interface creation or application logic without manually scripting event handlers, as seen in MVC. However, the article also mentions the complexity of mastering MVVM due to the need for data binding, commands, and potential challenges in implementing certain actions without creating additional classes or methods.

**Category:**  A*
**Type:**  Company Blog Article
**Deviation/Extension Aspects:**  None
**New Benefits:**  None
**New Drawbacks:**  Complexity of mastering MVVM due to the need for data binding, commands, and potential challenges in implementing certain actions.
**Technology:**  WPF
**View/ViewModel Cardinality:**  Not explicitly mentioned
**Reason:**  The article provides a standard definition of MVVM with examples in the context of WPF, making it fall under category A*. The content aligns with the standard definition provided, and the technology-specific mention is WPF.---

Next, I will analyze the content from the second website: "[https://angular.io/guide/architecture](https://angular.io/guide/architecture) ".




Used WebPilot




**Website-Name:**  angular.io
**Content Summary:**
The article on angular.io introduces the architectural concepts of Angular, a platform and framework for building single-page client applications using HTML and TypeScript. The primary building blocks of Angular are components organized into NgModules. Components define views, which are sets of screen elements that Angular can modify based on program logic and data. Components also use services for specific functionalities not directly related to views. The article discusses the role of templates, directives, and data binding in Angular. It also touches upon services, dependency injection, and routing. The router service in Angular helps define navigation paths among views. The article does not specifically delve into MVVM but discusses the architectural components of Angular.

**Category:**  D*
**Type:**  Official Documentation
**Deviation/Extension Aspects:**  None
**New Benefits:**  None
**New Drawbacks:**  None
**Technology:**  Angular
**View/ViewModel Cardinality:**  Not mentioned
**Reason:**  The article focuses on Angular's architecture but does not provide a clear definition or discussion on MVVM. The context is specific to Angular, hence the D* category.---

Next, I will analyze the content from the third website: "[https://ebikes-carwitz.de/uwp-xaml.html](https://ebikes-carwitz.de/uwp-xaml.html) ".




Used WebPilot




It seems there was an issue accessing the content from the website "[https://ebikes-carwitz.de/uwp-xaml.html](https://ebikes-carwitz.de/uwp-xaml.html) ".

I will proceed to the next website, "[https://elitesec-group.de/xaml-in-c.html](https://elitesec-group.de/xaml-in-c.html) ", and analyze its content.




Used WebPilot




It appears there was also an issue accessing the content from the website "[https://elitesec-group.de/xaml-in-c.html](https://elitesec-group.de/xaml-in-c.html) ".

I will move on to the final website, "[https://en-academic.com/dic.nsf/enwiki/11756555](https://en-academic.com/dic.nsf/enwiki/11756555) ", and analyze its content.




Used WebPilot




**Website-Name:**  en-academic.com
**Content Summary:**
The article on en-academic.com provides an overview of the Model View ViewModel (MVVM) architectural pattern. It describes MVVM as originating from Microsoft as a specialization of the Presentation Model design pattern introduced by Martin Fowler. The pattern is largely based on the Model-view-controller (MVC) pattern and is targeted at modern UI development platforms like Windows Presentation Foundation (WPF) and Silverlight. The article delves into the history of MVVM, its pattern description, and its implementation. It also touches upon criticisms of the pattern, mentioning that MVVM can be "overkill" for simple UI operations. The article lists various open-source, free, and commercial MVVM frameworks.

**Category:**  A*
**Type:**  Encyclopedia Entry
**Deviation/Extension Aspects:**  None
**New Benefits:**  None
**New Drawbacks:**  MVVM can be "overkill" for simple UI operations. Generalizing the View layer for larger applications can be challenging.
**Technology:**  WPF, Silverlight
**View/ViewModel Cardinality:**  Not mentioned
**Reason:**  The article provides a standard definition of MVVM in the context of WPF and Silverlight, hence the A* category.---

I will now generate an overview table with the analyzed websites:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonskillbox.ruA*TutorialNoneNoneNoneWPFNot mentionedStandard definition of MVVM in the context of WPF.angular.ioD*Official DocumentationNoneNoneNoneAngularNot mentionedFocuses on Angular's architecture without a clear definition of MVVM.ebikes-carwitz.de-------Unable to access content.elitesec-group.de-------Unable to access content.en-academic.comA*Encyclopedia EntryNoneNoneMVVM can be "overkill" for simple UI operations. Generalizing the View layer for larger applications can be challenging.WPF, SilverlightNot mentionedProvides a standard definition of MVVM in the context of WPF and Silverlight.

Note: The "-" indicates that the information was not available or could not be accessed.

This table provides a concise overview of the analyzed websites based on the criteria you provided.
