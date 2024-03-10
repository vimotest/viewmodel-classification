https://appmaster.io/glossary/mvvm-model-view-viewmodel
https://www.linkedin.com/pulse/mvvm-viewmodel-livedata-amit-nadiger
https://www.muvi.com/blogs/model-view-viewmodel-mvvm
https://itcreativelabs.com/blog/what-the-mvvm/
https://www.netguru.com/blog/mvvm-architecture

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

https://appmaster.io/glossary/mvvm-model-view-viewmodel
https://www.linkedin.com/pulse/mvvm-viewmodel-livedata-amit-nadiger
https://www.muvi.com/blogs/model-view-viewmodel-mvvm
https://itcreativelabs.com/blog/what-the-mvvm/
https://www.netguru.com/blog/mvvm-architecture

After writing the bullet points for each website, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason
So to summarize:
- you visit a website
- you write the bullet points
- you proceed with the next website
- if you processed all websites, you generate the overview table

ChatGPT:
- Used WebPilot

### AppMaster.io - MVVM (Model-View-ViewModel)

- **Website Type:** Company website
- **Category:** A*
- **Technology:** No-code platform, Go (golang), Vue3 JavaScript framework, Kotlin and Jetpack Compose for Android, SwiftUI for iOS
- **Deviation/Extension Aspects:** None specifically mentioned beyond standard definition
- **New Benefits:**
    - Modular and maintainable applications with minimal technical debt
    - Comprehensive documentation and auxiliary resources like Swagger (OpenAPI) for server endpoints and database migration scripts
- **New Drawbacks:** None mentioned
- **View/ViewModel Cardinality:** Not specifically discussed
- **Reason:** The website provides a standard definition of MVVM within the context of its no-code platform, emphasizing separation of concerns and modularity. It specifically mentions technologies used, making it a technology-specific discussion but does not deviate from the standard definition of MVVM.

Proceeding to the next website.

- Used WebPilot

### LinkedIn Article by Amit Nadiger - MVVM, ViewModel, LiveData

- **Website Type:** Personal blog article on LinkedIn
- **Category:** A/C*
- **Technology:** LiveData (Android)
- **Deviation/Extension Aspects:**
    - Emphasizes LiveData for data binding and state management.
- **New Benefits:**
    - Improved maintainability and testability of UI-driven applications.
    - Declarative UI programming reduces boilerplate code.
- **New Drawbacks:**
    - Learning curve for MVVM and associated technologies like LiveData.
    - Increased complexity in the codebase.
    - Potential overuse of observables which might impact performance and memory usage.
    - Testing challenges due to separation of concerns.
- **View/ViewModel Cardinality:** One-to-many relationship mentioned.
- **Reason:** The article adheres to the standard definition of MVVM but extends it with specific emphasis on LiveData for Android development, presenting new benefits and drawbacks related to this technology.

Proceeding to the next website.

- Used WebPilot

### Muvi.com - Model View ViewModel: Usage of MVVM in Muvi's App Architecture

- **Website Type:** Company blog article
- **Category:** A/C
- **Technology:** Not specified, but mentions Android Architecture Components
- **Deviation/Extension Aspects:**
    - Focuses on the practical application of MVVM in their specific app architecture.
- **New Benefits:**
    - Enhanced maintainability and extensibility due to compartmentalization.
    - Improved testability with more granular code.
    - Facilitates easy and quick customization and template switching.
- **New Drawbacks:** None mentioned explicitly, but the complexity of implementation could be inferred.
- **View/ViewModel Cardinality:** Not specifically discussed.
- **Reason:** The article provides a standard overview of MVVM, emphasizing its benefits in the context of their application architecture. It discusses the practical application and advantages of using MVVM for code structure, maintainability, and testability without deviating from the core principles of MVVM.

Proceeding to the next website.

- Used WebPilot

### IT Creative Labs - What is Model-View-ViewModel (MVVM)?

- **Website Type:** Company blog article
- **Category:** A/C
- **Technology:** Mentioned WPF and Silverlight but in a historical context, not as a current technology focus.
- **Deviation/Extension Aspects:**
    - Provides a historical background of MVVM, mentioning its invention by Microsoft architects for simplifying event-driven programming.
- **New Benefits:**
    - Transparent communication between application layers.
    - Extensibility and maintainability are highlighted with practical improvement suggestions.
- **New Drawbacks:**
    - Steep learning curve for new developers.
    - Increased complexity with added layers of abstraction.
    - Potential overkill for simple UIs.
    - Challenges in designing the ViewModel for larger applications.
    - Debugging complex data bindings can be difficult.
- **View/ViewModel Cardinality:** Not specifically discussed.
- **Reason:** The article provides a comprehensive overview of MVVM, including its history, key features, advantages, and disadvantages. It adheres to the standard definition of MVVM while also discussing its practical application and potential areas for improvement.

Proceeding to the next website.

- Used WebPilot

### Netguru - Getting to Grips with MVVM Architecture

- **Website Type:** Company blog article
- **Category:** A/C
- **Technology:** Android Development (DataBinding, RxJava)
- **Deviation/Extension Aspects:**
    - Compares MVVM with MVC and MVP, providing insights into the advantages of MVVM in modern app development.
- **New Benefits:**
    - Enhanced development process by segregating UI components from application code.
    - Improved code readability, modularity, and debuggability.
    - Promotes effective team collaboration.
- **New Drawbacks:**
    - Complexity and steep learning curve, especially for beginners.
    - Potential over-engineering for simpler projects.
- **View/ViewModel Cardinality:** Not specifically discussed.
- **Reason:** The article provides a detailed overview of MVVM, emphasizing its benefits in Android app development and comparing it with other architectural patterns. It discusses the practical application of MVVM, including the use of DataBinding and RxJava, and highlights the pattern's advantages in improving the development process, code maintainability, and team collaboration.

---

### Overview Table

| Website-Name        | Category | Type                | Deviation/Extension Aspects | New Benefits                                                                 | New Drawbacks                                                              | Technology              | View/ViewModel Cardinality | Reason                                                                                      |
|---------------------|----------|---------------------|-----------------------------|------------------------------------------------------------------------------|-----------------------------------------------------------------------------|-------------------------|----------------------------|---------------------------------------------------------------------------------------------|
| AppMaster.io        | A*       | Company website     | None                        | Modular applications, Comprehensive documentation                          | None                                                                          | No-code platform, Go    | Not discussed               | Standard definition within no-code platform context                                         |
| LinkedIn Article    | A/C*     | Personal blog       | LiveData emphasis           | Maintainability, Declarative UI programming                                 | Learning curve, Increased complexity, Testing challenges, Data Binding curve | LiveData (Android)      | One-to-many                 | Standard definition with emphasis on LiveData and specific Android development challenges  |
| Muvi.com            | A/C      | Company blog article | Practical application       | Enhanced maintainability and extensibility, Improved testability            | None                                                                          | Not specified           | Not discussed               | Focus on practical benefits in app architecture                                             |
| IT Creative Labs    | A/C      | Company blog article | Historical background       | Transparent communication, Extensibility, Maintainability                   | Steep learning curve, Increased complexity, Overkill for simple UIs         | WPF, Silverlight (hist.) | Not discussed               | Comprehensive overview with historical context and practical improvement suggestions       |
| Netguru            | A/C      | Company blog article | MVVM vs MVC and MVP         | Enhanced development process, Improved code readability and debuggability   | Complexity, Steep learning curve, Over-engineering                          | Android Development     | Not discussed               | Detailed comparison with MVC and MVP, focusing on Android development with DataBinding, RxJava |

This table summarizes the findings from each website, categorizing them based on their adherence to the standard definition of MVVM, deviations or extensions, new benefits and drawbacks identified, technologies mentioned, and the type of website. Each entry provides insights into how MVVM is interpreted and applied in different contexts, highlighting the pattern's flexibility and adaptability to various development needs.
