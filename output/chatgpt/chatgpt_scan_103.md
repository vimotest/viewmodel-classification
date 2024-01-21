https://www.geeksforgeeks.org/how-a-view-model-works-in-vue-js/
https://www.apptension.com/blog-posts/mvc-vs-mvvm-vs-mvp
https://www.youtube.com/watch?v=Xg_WMBV6cWM
https://www.iamkel.net/posts/2-mvvm-guidelines-uikit
https://uchet-jkh.ru/i/mvvm-cto-eto-i-kak-eto-rabotaet/

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

https://www.geeksforgeeks.org/how-a-view-model-works-in-vue-js/
https://www.apptension.com/blog-posts/mvc-vs-mvvm-vs-mvp
https://www.youtube.com/watch?v=Xg_WMBV6cWM
https://www.iamkel.net/posts/2-mvvm-guidelines-uikit
https://uchet-jkh.ru/i/mvvm-cto-eto-i-kak-eto-rabotaet/

After writing the bullet points for each website, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason
So to summarize:
- you visit a website
- you write the bullet points
- you proceed with the next website
- if you processed all websites, you generate the overview table

ChatGPT:
- Used WebPilot

### GeeksforGeeks: How a View-model works in Vue.js

- **Website Name**: GeeksforGeeks
- **Category**: A* (Standard Definition with a specific technology focus)
- **Type**: Tutorial/Article
- **Deviation/Extension Aspects**: None specific beyond the standard definition, but focuses on Vue.js implementation.
- **New Benefits**: Not mentioned beyond standard benefits.
- **New Drawbacks**: Not mentioned beyond standard drawbacks.
- **Technology**: Vue.js
- **View/ViewModel Cardinality**: Not explicitly mentioned, but implies a one-to-many relationship through the use of Vue instances.
- **Reason**: The article provides a clear explanation of the MVVM pattern within the context of Vue.js, adhering to the standard definition of MVVM but with a focus on Vue.js specific implementation details such as the use of Vue instances and directives like `v-model` for data binding. It does not introduce new benefits or drawbacks outside of those commonly associated with MVVM, nor does it deviate from the standard definition of the pattern.

Proceeding to the next website.

- Used WebPilot

### Apptension: MVC vs MVVM vs MVP

- **Website Name**: Apptension
- **Category**: A* (Standard Definition with a specific technology focus)
- **Type**: Guide/Article
- **Deviation/Extension Aspects**: None specific beyond the standard definition, but focuses on Android app development.
- **New Benefits**: Not mentioned beyond standard benefits.
- **New Drawbacks**: Not mentioned beyond standard drawbacks.
- **Technology**: Android
- **View/ViewModel Cardinality**: Not explicitly mentioned, but the discussion implies a flexible relationship adaptable to Android app development needs.
- **Reason**: The article provides a comprehensive guide to Android architecture patterns, including MVVM, and compares it with MVC and MVP. It adheres to the standard definition of MVVM within the context of Android development, emphasizing the pattern's benefits for managing UI logic and data binding. The focus is on guiding developers in choosing the most suitable architecture for their projects, without introducing new benefits or drawbacks specific to MVVM beyond those commonly associated with the pattern.

Proceeding to the next website.

- Used WebPilot

### YouTube: Introduction to MVVM Architecture in Hindi - Model View ViewModel Tutorial #1

- **Website Name**: YouTube
- **Category**: A* (Standard Definition with a specific technology focus)
- **Type**: Video Tutorial
- **Deviation/Extension Aspects**: None specific beyond the standard definition, but focuses on Android app development.
- **New Benefits**: Not mentioned beyond standard benefits.
- **New Drawbacks**: Not mentioned beyond standard drawbacks.
- **Technology**: Android
- **View/ViewModel Cardinality**: Not explicitly mentioned, but the explanation implies a standard relationship between View and ViewModel.
- **Reason**: The video provides an introduction to the MVVM architecture, focusing on its application in Android app development. It explains the core principles of MVVM, including the roles and interactions of the Model, View, and ViewModel components. The content adheres to the standard definition of MVVM, with a specific emphasis on enhancing app structure and development skills within the Android platform. It does not introduce new benefits or drawbacks outside of those commonly associated with MVVM, nor does it deviate from the standard definition of the pattern.

Proceeding to the next website.

- Used WebPilot

### iamkel.net: MVVM Guidelines (UIKit)

- **Website Name**: iamkel.net
- **Category**: A* (Standard Definition with a specific technology focus)
- **Type**: Guidelines/Article
- **Deviation/Extension Aspects**: None specific beyond the standard definition, but focuses on iOS development using UIKit.
- **New Benefits**: Not mentioned beyond standard benefits.
- **New Drawbacks**: Not mentioned beyond standard drawbacks.
- **Technology**: iOS (UIKit)
- **View/ViewModel Cardinality**: Not explicitly mentioned, but the guidelines imply a standard relationship between View and ViewModel.
- **Reason**: The article provides guidelines for implementing the MVVM pattern in iOS app development with a focus on UIKit. It adheres to the standard definition of MVVM, emphasizing the separation of program logic and user interface controls. The content is tailored to iOS development, discussing the roles and interactions of the Model, View, and ViewModel components within the context of UIKit. It does not introduce new benefits or drawbacks outside of those commonly associated with MVVM, nor does it deviate from the standard definition of the pattern.

Proceeding to the next website.

- Used WebPilot

### uchet-jkh.ru: Что такое MVVM (Model-View-ViewModel)

- **Website Name**: uchet-jkh.ru
- **Category**: A* (Standard Definition with a specific technology focus)
- **Type**: Article
- **Deviation/Extension Aspects**: None specific beyond the standard definition, but focuses on .NET applications (WPF, Xamarin).
- **New Benefits**: Not mentioned beyond standard benefits.
- **New Drawbacks**: Not mentioned beyond standard drawbacks.
- **Technology**: .NET (WPF, Xamarin)
- **View/ViewModel Cardinality**: Not explicitly mentioned, but the explanation implies a standard relationship between View and ViewModel.
- **Reason**: The article provides a detailed explanation of the MVVM pattern, focusing on its application in .NET-based applications such as WPF and Xamarin. It adheres to the standard definition of MVVM, emphasizing the separation of the Model, View, and ViewModel components and their respective responsibilities. The content is tailored to .NET development, discussing the roles and interactions of the components within the context of .NET technologies. It does not introduce new benefits or drawbacks outside of those commonly associated with MVVM, nor does it deviate from the standard definition of the pattern.

---

### Overview Table

| Website Name | Category | Type | Deviation/Extension Aspects | New Benefits | New Drawbacks | Technology | View/ViewModel Cardinality | Reason |
|--------------|----------|------|-----------------------------|--------------|---------------|------------|---------------------------|--------|
| GeeksforGeeks | A* | Tutorial/Article | None | None | None | Vue.js | Not mentioned | Standard definition with Vue.js focus |
| Apptension | A* | Guide/Article | None | None | None | Android | Not mentioned | Standard definition with Android focus |
| YouTube | A* | Video Tutorial | None | None | None | Android | Not mentioned | Standard definition with Android focus |
| iamkel.net | A* | Guidelines/Article | None | None | None | iOS (UIKit) | Not mentioned | Standard definition with iOS/UIKit focus |
| uchet-jkh.ru | A* | Article | None | None | None | .NET (WPF, Xamarin) | Not mentioned | Standard definition with .NET focus |

This table summarizes the findings from the analysis of the provided websites, categorizing them based on their adherence to the standard definition of MVVM, the type of content they offer, and the specific technology focus they have.