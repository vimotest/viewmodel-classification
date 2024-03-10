https://stackoverflow.com/questions/tagged/mvvm
https://startup-house.com/blog/mvvm-vs-mvc-comparison
https://careerpath-gs.com/model-view-viewmodel-mvvm/
https://levelup.gitconnected.com/demystifying-web-development-architectural-patterns-mvc-vs-mvvm-ca79ee5df228
https://blog.stackademic.com/understanding-mvc-mvvm-and-mvp-a-comprehensive-comparison-324fd6e3c730

You shall be a scientific expert in GUI architectural patterns. The target audience are software engineering researchers in context of software architecture.

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

In one joint answer, Loop over following 5 website URLs and extract Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason (why you chose the category).
Notice information concisely with bullet-points (not in the final overview table directly!).

https://stackoverflow.com/questions/tagged/mvvm
https://startup-house.com/blog/mvvm-vs-mvc-comparison
https://careerpath-gs.com/model-view-viewmodel-mvvm/
https://levelup.gitconnected.com/demystifying-web-development-architectural-patterns-mvc-vs-mvvm-ca79ee5df228
https://blog.stackademic.com/understanding-mvc-mvvm-and-mvp-a-comprehensive-comparison-324fd6e3c730

After writing the bullet points for each website, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason
So to summarize:
- you visit a website
- you write the bullet points
- you proceed with the next website
- if you processed all websites, you generate the overview table

ChatGPT:
- Used WebPilot

### Stack Overflow - MVVM Questions

- **Website Name**: Stack Overflow
- **Category**: D*
- **Type**: Forum
- **Technology**: Various (C#, XAML, Android, Flutter, iOS, SwiftUI)
- **Reason**: The site contains a wide range of questions and answers related to MVVM across different technologies but does not provide a cohesive or standard definition of MVVM. It's more about specific issues or implementations rather than defining the pattern itself.

Proceeding to the next website for analysis.

- Used WebPilot

### Startup House - MVVM vs MVC Comparison

- **Website Name**: Startup House
- **Category**: A
- **Type**: Company Blog Article
- **Deviation/Extension Aspects**: None detected
- **New Benefits**: None beyond standard
- **New Drawbacks**: None beyond standard
- **Technology**: Mentioned WPF and AngularJS in context but not as a primary focus
- **View/ViewModel Cardinality**: Not specifically discussed
- **Reason**: The article provides a comprehensive comparison between MVVM and MVC, sticking closely to the standard definitions of both patterns without introducing deviations or new benefits/drawbacks. It mentions specific technologies (WPF, AngularJS) but does so in a way that illustrates the application of MVVM rather than focusing on the technology itself, hence not marked with '*'.

Proceeding to the next website for analysis.

- Used WebPilot

### CareerPath GS - Model View ViewModel (MVVM)

- **Website Name**: CareerPath GS
- **Category**: A*
- **Type**: Educational Article
- **Technology**: XAML, C#
- **Reason**: The article provides a detailed explanation of the MVVM pattern, focusing on the separation of UI and business logic, which aligns with the standard definition. It specifically mentions the use of XAML for the view and C# for the code-behind, indicating a technology-specific context (hence the '*') but does not deviate from the standard definition of MVVM.

Proceeding to the next website for analysis.

- Used WebPilot

### Level Up - Demystifying Web Development Architectural Patterns: MVC vs. MVVM

- **Website Name**: Level Up (Medium)
- **Category**: A
- **Type**: Educational Article
- **Deviation/Extension Aspects**: None detected
- **New Benefits**: None beyond standard
- **New Drawbacks**: None beyond standard
- **Technology**: Not specified
- **View/ViewModel Cardinality**: Not specifically discussed
- **Reason**: The article aims to clarify the MVC and MVVM patterns for web developers, providing practical code examples. It adheres to the standard definitions of both patterns without introducing deviations or new benefits/drawbacks. The focus is on explaining the roles of Model, View, and Controller in MVC and comparing it with MVVM, making it a straightforward educational piece on these architectural patterns.

Proceeding to the next website for analysis.

- Used WebPilot

### Stackademic - Understanding MVC, MVVM, and MVP

- **Website Name**: Stackademic
- **Category**: A
- **Type**: Educational Article
- **Deviation/Extension Aspects**: None detected
- **New Benefits**: None beyond standard
- **New Drawbacks**: None beyond standard
- **Technology**: Not specified
- **View/ViewModel Cardinality**: Not specifically discussed
- **Reason**: The article provides a comprehensive overview of MVC, MVVM, and MVP architectural patterns, sticking to the standard definitions and principles of each. It highlights the key components, advantages, and use cases without introducing deviations or new benefits/drawbacks. The focus is on explaining these patterns in a way that is accessible to developers, making it an educational piece on architectural patterns in software development.

---

### Overview Table

| Website-Name | Category | Type                | Deviation/Extension Aspects | New Benefits | New Drawbacks | Technology | View/ViewModel Cardinality | Reason                                                                                          |
|--------------|----------|---------------------|-----------------------------|--------------|---------------|------------|----------------------------|-------------------------------------------------------------------------------------------------|
| Stack Overflow | D*       | Forum               | N/A                         | N/A          | N/A           | Various    | N/A                        | Site contains questions and answers, no cohesive definition of MVVM.                            |
| Startup House | A        | Company Blog Article| None                        | None         | None          | WPF, AngularJS | N/A                    | Provides comparison between MVVM and MVC, sticking to standard definitions.                     |
| CareerPath GS | A*       | Educational Article | None                        | None         | None          | XAML, C#   | N/A                        | Detailed explanation of MVVM, focusing on separation of UI and business logic.                  |
| Level Up      | A        | Educational Article | None                        | None         | None          | Not specified | N/A                    | Clarifies MVC and MVVM patterns with practical code examples, adhering to standard definitions. |
| Stackademic   | A        | Educational Article | None                        | None         | None          | Not specified | N/A                    | Comprehensive overview of MVC, MVVM, and MVP, sticking to standard definitions.                 |

This table summarizes the findings from the analysis of each website, categorizing them based on their adherence to the standard definition of MVVM, the presence of deviations or extensions, and the type of content they provide.
