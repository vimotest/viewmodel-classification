https://academy.realm.io/posts/eric-maxwell-mvc-mvp-and-mvvm-on-android/
https://blog.techchee.com/swiftui-mvvm-with-practical-examples/
https://artsy.github.io/blog/2015/09/24/mvvm-in-swift/
https://khanlou.com/2015/12/mvvm-is-not-very-good/
https://www.thirdrocktechkno.com/blog/architecture-presentation-patterns-mvc-vs-mvp-vs-mvvm/


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

https://academy.realm.io/posts/eric-maxwell-mvc-mvp-and-mvvm-on-android/
https://blog.techchee.com/swiftui-mvvm-with-practical-examples/
https://artsy.github.io/blog/2015/09/24/mvvm-in-swift/
https://khanlou.com/2015/12/mvvm-is-not-very-good/
https://www.thirdrocktechkno.com/blog/architecture-presentation-patterns-mvc-vs-mvp-vs-mvvm/

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name:**  MVC vs. MVP vs. MVVM on Android

**Content Summary:**
The article by Eric Maxwell on Realm Academy discusses the three architectural patterns: MVC, MVP, and MVVM, specifically in the context of Android development. The article provides a detailed breakdown of each pattern, explaining their components, responsibilities, and how they apply to a simple Tic-Tac-Toe game. The article aims to objectively present the value and potential issues with all three approaches, allowing developers to make an informed decision on which pattern best suits their needs.

**MVVM Section Analysis:**
- **Model** : No change from the standard definition.
- **View** : Binds to observable variables and actions exposed by the ViewModel.
- **ViewModel** : Wraps the model and prepares observable data needed by the view. Provides hooks for the view to pass events to the model. Not tied to the view.
- **Technology** : Android with Data Binding.
- **Benefits** : Easier testing and modularity. Reduces the amount of glue code. More reactive programming model.
- **Concerns** : Maintenance can be challenging as extraneous presentation logic can creep into the view over time.

**Category Determination:**
- The article provides a standard definition of MVVM in the context of Android with Data Binding.
- The article does not introduce any new benefits or drawbacks that are not mentioned in the standard definition.
- The article does not deviate from the standard definition of MVVM.
- The article is technology-specific, focusing on Android with Data Binding.

**Category:**  A*

**Type:**  Article on an educational platform (Realm Academy)

**Deviation/Extension Aspects:**  None

**New Benefits:**  None

**New Drawbacks:**  None

**Technology:**  Android with Data Binding

**View/ViewModel Cardinality:**  Not explicitly mentioned

**Reason:**  The article provides a clear and standard definition of MVVM in the context of Android with Data Binding. It adheres to the standard definition without introducing any deviations or new benefits/drawbacks.---

Let's proceed to the next website.




Used WebPilot




**Website-Name:**  SwiftUI MVVM with practical examples

**Content Summary:**
The article on TechChee discusses the MVVM architecture in the context of SwiftUI. It emphasizes the importance of MVVM in ensuring no tight coupling between the application UI, business logic, and the data layer. The article provides a detailed breakdown of the Model, ViewModel, and View components, explaining their responsibilities and how they interact with each other. The article also provides practical examples in SwiftUI, demonstrating how to implement MVVM in real-world scenarios.

**MVVM Section Analysis:**
- **Model** : Represents data from the datasource, which can be from a remote URL or local. The model reflects the data structure of the datasource.
- **ViewModel** : Acts as a bridge between the View and the Model. It prepares data from the Model for the View and updates the Model when needed. It contains business logic but is not aware of the View using it.
- **View** : Represents the UI and is dependent on the ViewModel for its states. It also informs the ViewModel about user interactions.
- **Technology** : SwiftUI
- **Benefits** : Cleaner code, better reusability, maintainability, and flexibility for future changes and growth of the app.
- **Concerns** : Not explicitly mentioned.

**Category Determination:**
- The article provides a standard definition of MVVM in the context of SwiftUI.
- The article does not introduce any new benefits or drawbacks that are not mentioned in the standard definition.
- The article does not deviate from the standard definition of MVVM.
- The article is technology-specific, focusing on SwiftUI.

**Category:**  A*

**Type:**  Blog Article

**Deviation/Extension Aspects:**  None

**New Benefits:**  None

**New Drawbacks:**  None

**Technology:**  SwiftUI

**View/ViewModel Cardinality:**  Not explicitly mentioned

**Reason:**  The article provides a clear and standard definition of MVVM in the context of SwiftUI. It adheres to the standard definition without introducing any deviations or new benefits/drawbacks.---

Let's proceed to the next website.




Used WebPilot




**Website-Name:**  MVVM in Swift

**Content Summary:**
The article by Ash Furrow on Artsy's engineering blog delves into the MVVM architectural pattern, specifically in the context of Swift. The author shares their journey of transitioning from MVC to MVVM, highlighting the challenges faced and the solutions devised. The article provides insights into the structure of a ViewModel, handling user interactions, and the benefits of testing in MVVM. The author emphasizes the separation of the ViewModel from the user interface, making it easier to test both presentation logic and the user interface.

**MVVM Section Analysis:**
- **Model** : Not explicitly detailed but implied as the data source.
- **View** : Represents the UI, notifies the view controllers of interaction events.
- **ViewModel** : Acts as a bridge between the View and the Model. It handles all presentation logic, including data formatting. It does not have access to the UI and should not import UIKit.
- **Technology** : Swift
- **Benefits** :
- Separating the ViewModel from the UI makes it easier to test presentation logic.
- Separating the view controller from the presentation logic makes it easier to test the user interface.
- **Concerns** : Challenges in structuring a ViewModel in Swift, handling user interactions, and testing.

**Category Determination:**
- The article provides a standard definition of MVVM in the context of Swift.
- The article does not introduce any new benefits or drawbacks that are not mentioned in the standard definition.
- The article does not deviate from the standard definition of MVVM.
- The article is technology-specific, focusing on Swift.

**Category:**  A*

**Type:**  Blog Article on an engineering platform (Artsy Engineering Blog)

**Deviation/Extension Aspects:**  None

**New Benefits:**  None

**New Drawbacks:**  None

**Technology:**  Swift

**View/ViewModel Cardinality:**  Acknowledges the one-to-one relationship between views and view controllers.

**Reason:**  The article provides insights into MVVM in the context of Swift, adhering to the standard definition without introducing any deviations or new benefits/drawbacks.---

Let's proceed to the next website.




Used WebPilot




**Website-Name:**  MVVM is Not Very Good

**Content Summary:**
Soroush Khanlou, in his blog post, presents a critical perspective on the MVVM architectural pattern, particularly in the context of Swift. He argues that MVVM is an anti-pattern that adds confusion rather than clarity. Khanlou points out that the term "view model" is ambiguous, leading to a lack of consensus on its responsibilities. He also highlights that MVVM doesn't fundamentally change the app's structure, merely shifting the complexity from one place to another. Drawing parallels with the Rails community's experience, Khanlou suggests that MVVM is a temporary patch to a more complex problem and advocates for a more sustainable solution.

**MVVM Section Analysis:**
- **Model** : Not explicitly detailed.
- **View** : Represents the UI, notifies the view controllers of interaction events.
- **ViewModel** : Lies between a model object and a view controller, performs data transformation for presentation, and may handle various other responsibilities.
- **Technology** : Swift
- **Benefits** : Not explicitly mentioned.
- **Concerns** :
- MVVM is poorly-named and abstract, leading to confusion.
- MVVM invites many responsibilities without clear boundaries.
- MVVM doesn't fundamentally change the app's structure.
- View models don't scale and are seen as a temporary solution.

**Category Determination:**
- The article provides a critical perspective on MVVM, highlighting its perceived shortcomings.
- The article introduces new drawbacks that are not mentioned in the standard definition.
- The article does not provide a standard definition of MVVM.
- The article is technology-specific, focusing on Swift.

**Category:**  B*/C

**Type:**  Personal Blog Article

**Deviation/Extension Aspects:**
- MVVM is seen as an anti-pattern.
- Ambiguity in the term "view model" leading to varied interpretations.
- MVVM doesn't fundamentally change the app's structure.

**New Benefits:**  None

**New Drawbacks:**
- MVVM is poorly-named and abstract.
- MVVM invites many responsibilities without clear boundaries.
- MVVM doesn't fundamentally change the app's structure.
- View models don't scale and are seen as a temporary solution.

**Technology:**  Swift

**View/ViewModel Cardinality:**  Not explicitly mentioned

**Reason:**  The article provides a critical perspective on MVVM, highlighting its perceived shortcomings and introducing new drawbacks not mentioned in the standard definition.---

Let's proceed to the next website.




Used WebPilot




**Website-Name:**  Architecture Presentation Patterns: MVC vs MVP vs MVVM

**Content Summary:**
The article on Third Rock Techkno provides a comparative analysis of three architectural patterns: MVC, MVP, and MVVM, with a focus on Android application development. The article breaks down each pattern, explaining their components and their roles. It also highlights the differences between MVC and MVVM, emphasizing the role of the controller and the ViewModel. The article concludes by suggesting the best use cases for each pattern based on the application's requirements.

**MVVM Section Analysis:**
- **Model** : Represents data and business logic of the application.
- **View** : Responsible for the presentation layer of the application.
- **ViewModel** : Acts as a bridge between the Model and the View, handling communication and data manipulation.
- **Technology** : Not explicitly mentioned but implied as Android.
- **Benefits** : Suitable for applications with complex user interactions.
- **Concerns** : Not explicitly mentioned.

**Category Determination:**
- The article provides a standard definition of MVVM.
- The article does not introduce any new benefits or drawbacks that are not mentioned in the standard definition.
- The article does not deviate from the standard definition of MVVM.
- The article is not explicitly technology-specific but implies a focus on Android.

**Category:**  A*

**Type:**  Company Blog Article

**Deviation/Extension Aspects:**  None

**New Benefits:**  None

**New Drawbacks:**  None

**Technology:**  Implied as Android

**View/ViewModel Cardinality:**  Not explicitly mentioned

**Reason:**  The article provides a comparative analysis of MVC, MVP, and MVVM, adhering to the standard definition of MVVM without introducing any deviations or new benefits/drawbacks.---

Let's proceed to the final website.


Now, I will generate an overview table with the gathered information from all the websites.



**Overview Table** Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonMVC, MVP, and MVVM on AndroidA*Blog ArticleNoneNoneNoneAndroidNot mentionedStandard definition in context of AndroidSwiftUI MVVM with Practical ExamplesA*/BTutorial- Uses Combine framework for data flow<br>- Uses `ObservableObject` and `Published` properties for data bindingNoneNoneSwiftUINot mentionedStandard definition with SwiftUI specifics and deviationsMVVM in SwiftA*Blog Article on an engineering platformNoneNoneNoneSwiftOne-to-one relationship acknowledgedStandard definition in context of SwiftMVVM is Not Very GoodB*/CPersonal Blog Article- MVVM seen as an anti-pattern<br>- Ambiguity in the term "view model"<br>- MVVM doesn't change app's structureNone- MVVM is poorly-named and abstract<br>- MVVM invites many responsibilities without clear boundaries<br>- MVVM doesn't change app's structure<br>- View models don't scaleSwiftNot mentionedCritical perspective on MVVM with new drawbacksArchitecture Presentation Patterns: MVC vs MVP vs MVVMA*Company Blog ArticleNoneNoneNoneImplied as AndroidNot mentionedStandard definition implied for Android

This table provides a concise overview of the MVVM content from the provided websites, categorized based on the given criteria.
