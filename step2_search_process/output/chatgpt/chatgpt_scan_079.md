https://www.zkoss.org/wiki/ZK%20Developer's%20Reference/MVVM
http://books.zkoss.org/zk-mvvm-book/9.5/
https://upday.github.io/blog/mvvm_rx_common_mistakes/
http://csharperimage.jeremylikness.com/2010/04/model-view-viewmodel-mvvm-explained.html
https://medium.com/@ankit.sinhal/mvc-mvp-and-mvvm-design-pattern-6e169567bbad


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

https://www.zkoss.org/wiki/ZK%20Developer's%20Reference/MVVM
http://books.zkoss.org/zk-mvvm-book/9.5/
https://upday.github.io/blog/mvvm_rx_common_mistakes/
http://csharperimage.jeremylikness.com/2010/04/model-view-viewmodel-mvvm-explained.html
https://medium.com/@ankit.sinhal/mvc-mvp-and-mvvm-design-pattern-6e169567bbad

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name** : ZK Developer's Reference

**Content Summary** :
- The article provides an introduction to the MVVM (Model-View-ViewModel) design pattern, which originated from Microsoft. It is a specialization of the Presentation Model introduced by Martin Fowler and is a variant of the MVC pattern.
- The article describes the three roles in MVVM: View, Model, and ViewModel. The ViewModel acts as a special Controller for the View, responsible for exposing data from the Model to the View and providing action and logic for user requests from the View.
- The key strength of MVVM is the separation of data and logic from presentation. The ViewModel knows nothing about the View's visual elements, ensuring a one-way dependency from the View to the ViewModel. This separation brings several advantages, including suitability for design-by-contract programming, loose coupling with the View, better reusability, and better testability.
- The article also touches upon the data binding mechanism provided by ZK 6, called ZK Bind, which serves as the infrastructure of the MVVM design pattern. The binder plays a crucial role in operating the mechanism, acting as a broker responsible for communication between the View and ViewModel.

**Category Determination** :
- **Standard Definition of MVVM** : The article provides a standard definition of MVVM, explaining its origin, the roles of View, Model, and ViewModel, and the key characteristics of the MVVM pattern.
- **Strength of MVVM** : The article lists the advantages of using MVVM, such as separation of data and logic from presentation, loose coupling with the View, better reusability, and testability.
- **MVVM & ZK Bind** : The article introduces the data binding mechanism provided by ZK 6, highlighting its importance in the MVVM design pattern.

**Category** : A*

**Type** : Documentation

**Deviation/Extension Aspects** :
- The article does not provide any significant deviations or extensions from the standard MVVM definition.

**New Benefits** :
- Suitable for design-by-contract programming.
- Loose coupling with View allows for easy UI design changes without modifying the ViewModel.
- Better reusability across different devices.
- Better testability due to ViewModel's separation from the UI.

**New Drawbacks** :
- No new drawbacks mentioned.

**Technology** : ZK 6 (ZK Bind)

**View/ViewModel Cardinality** :
- Not explicitly mentioned.

**Reason** :
- The article provides a standard definition of MVVM, explains its strengths, and introduces the ZK Bind data binding mechanism. It aligns with the standard definition of MVVM, with no significant deviations or extensions. The mention of ZK 6 (ZK Bind) makes it technology-specific.---

I will now proceed to analyze the next website.




Used WebPilot




**Website-Name** : ZK MVVM Book 9.5 - Introduction of MVVM

**Content Summary** :
- The page provides an introduction to the MVVM (Model-View-ViewModel) design pattern, which originated from Microsoft. It is described as a specialization of the Presentation Model introduced by Martin Fowler and is a variant of the MVC pattern.
- The MVVM pattern consists of three roles: View, Model, and ViewModel. While the View and Model play the same roles as in MVC, the ViewModel acts as a special Controller for the View. It is responsible for exposing data from the Model to the View and handling user requests from the View.
- The ViewModel is an abstraction of the View, containing its state and behavior. Importantly, the ViewModel should have no reference to UI components and should be unaware of the View's visual elements. This separation between the View and ViewModel is a key characteristic of the MVVM pattern. The View can be seen as a UI projection of the ViewModel.

**Category Determination** :
- **Standard Definition of MVVM** : The content provides a standard definition of MVVM, explaining its origin, the roles of View, Model, and ViewModel, and the separation between the View and ViewModel.

**Category** : A*

**Type** : Documentation

**Deviation/Extension Aspects** :
- No significant deviations or extensions from the standard MVVM definition are mentioned.

**New Benefits** :
- Not mentioned in this section.

**New Drawbacks** :
- Not mentioned in this section.

**Technology** : Not explicitly mentioned, but the context suggests ZK.

**View/ViewModel Cardinality** :
- Not explicitly mentioned.

**Reason** :
- The content provides a standard definition of MVVM, aligning with the standard definition provided by the user. The mention of ZK in the broader context suggests it is technology-specific.---

I will now proceed to analyze the next website.




Used WebPilot




**Website-Name** : upday blog - MVVM + RxJava: Common Mistakes

**Content Summary** :
- The article discusses common mistakes made when combining MVVM with RxJava in app architecture. It emphasizes the importance of exposing states instead of events and ensuring that everything goes through the view model.
- The author provides examples to illustrate the issues. One example highlights the problems of exposing two parallel streams with events, leading to race conditions. The solution is to expose one stream per view that emits states instead of events.
- Another example discusses the handling of push notifications. The author stresses that even trivial operations should go through the view model to maintain the integrity of the MVVM architecture.

**Category Determination** :
- **MVVM + RxJava** : The article focuses on the combination of MVVM with RxJava and the potential pitfalls. It does not provide a full definition of MVVM but rather discusses specific scenarios and mistakes related to its implementation with RxJava.

**Category** : B*

**Type** : Blog Article

**Deviation/Extension Aspects** :
- The article emphasizes the importance of exposing states instead of events in MVVM when combined with RxJava.
- It discusses the potential issues of not routing everything through the view model, leading to inconsistencies in the MVVM architecture.

**New Benefits** :
- Not mentioned in this article.

**New Drawbacks** :
- Race conditions can arise when exposing parallel streams with events.
- Not routing everything through the view model can lead to inconsistencies.

**Technology** : RxJava

**View/ViewModel Cardinality** :
- Not explicitly mentioned.

**Reason** :
- The article focuses on specific scenarios and mistakes related to the implementation of MVVM with RxJava. It provides insights into deviations from the standard MVVM pattern when combined with RxJava.---

I will now proceed to analyze the next website.




Used WebPilot




**Website-Name** : The C#er : IMage - Model-View-ViewModel (MVVM) Explained

**Content Summary** :
- The article provides an introduction to the MVVM pattern, explaining its components and their interactions.
- The author describes MVVM as a pattern that separates the concerns of the UI from the business logic.
- The article mentions that MVVM is a natural evolution of earlier patterns like MVC and MVP.
- The View is described as the UI, the Model as the business logic, and the ViewModel as the bridge between the two.
- The author emphasizes the importance of data-binding in MVVM and how it allows the ViewModel to be decoupled from the View.
- The article provides a simple example to illustrate the MVVM pattern in practice.
- The author also touches upon the benefits of MVVM, such as testability and separation of concerns.

**Category Determination** :
- **MVVM Overview** : The article provides a clear and concise overview of the MVVM pattern, explaining its components and their interactions. It aligns closely with the standard definition of MVVM.

**Category** : A

**Type** : Blog Article

**Deviation/Extension Aspects** :
- None mentioned.

**New Benefits** :
- Not mentioned beyond the standard benefits.

**New Drawbacks** :
- Not mentioned in this article.

**Technology** :
- Not explicitly tied to a specific technology.

**View/ViewModel Cardinality** :
- Not explicitly mentioned.

**Reason** :
- The article provides a clear and concise overview of the MVVM pattern, aligning closely with the standard definition.---

I will now proceed to analyze the next website.




Used WebPilot




**Website-Name** : Medium - MVC, MVP and MVVM Design Pattern by Ankit Sinhal

**Content Summary** :
- The article provides an overview of three popular design patterns in software development: MVC, MVP, and MVVM.
- For MVVM, the article describes it as a pattern that supports two-way data binding between View and ViewModel. This allows automatic propagation of changes within the state of ViewModel to the View.
- The ViewModel is responsible for exposing methods, commands, and other properties that help maintain the state of the view, manipulate the model as a result of actions on the view, and trigger events in the view itself. The ViewModel has no information about the View, and there can be a many-to-one relationship between Views and ViewModel. The ViewModel is completely independent of Views.
- The bi-directional data binding ensures that models and properties in the ViewModel are in sync with the view. MVVM is well-suited for applications that require support for bi-directional data binding.

**Category Determination** :
- **MVVM Overview** : The article provides an overview of the MVVM pattern, emphasizing the two-way data binding between View and ViewModel and the responsibilities of the ViewModel.

**Category** : A

**Type** : Blog Article

**Deviation/Extension Aspects** :
- None mentioned.

**New Benefits** :
- The bi-directional data binding ensures synchronization between the view and the ViewModel.

**New Drawbacks** :
- Not mentioned in this article.

**Technology** :
- The article discusses the patterns in the context of Android as a platform but does not tie MVVM to a specific technology.

**View/ViewModel Cardinality** :
- Many-to-one relationship between View and ViewModel.

**Reason** :
- The article provides an overview of the MVVM pattern, aligning with the standard definition provided by the user.---


I will now generate an overview table with the analyzed websites.



Here's the overview table based on the analysis of the provided websites:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonZK Developer's Reference/MVVMA*DocumentationNoneNoneNoneZKNot mentionedStandard definition of MVVM in the context of ZK.ZK MVVM Book 9.5 - Introduction of MVVMA*DocumentationNoneNoneNoneZKNot mentionedStandard definition of MVVM in the context of ZK.upday blog - MVVM + RxJava: Common MistakesB*Blog ArticleExposing states vs eventsNoneRace conditionsRxJavaNot mentionedFocus on MVVM with RxJava and potential pitfalls.The C#er : IMage - Model-View-ViewModel (MVVM) ExplainedABlog ArticleNoneNoneNoneNoneNot mentionedClear and concise overview of MVVM pattern.Medium - MVC, MVP and MVVM Design Pattern by Ankit SinhalABlog ArticleNoneBi-directional data bindingNoneAndroidMany-to-oneOverview of MVVM pattern emphasizing two-way data binding and ViewModel responsibilities.

Note: The "Deviation/Extension Aspects", "New Benefits", and "New Drawbacks" columns are populated based on the content of the websites. If no deviations, new benefits, or new drawbacks were mentioned, "None" is indicated in the respective columns.
