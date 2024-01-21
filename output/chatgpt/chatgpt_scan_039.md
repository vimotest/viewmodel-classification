https://codelabs.developers.google.com/
https://www.gamersdecide.com/articles/csgo-best-viewmodel-settings
https://creatronix.de/how-to-use-viewmodel/
https://startandroid.ru/ru/courses/architecture-components/27-course/architecture-components/527-urok-4-viewmodel.html
https://www.damirscorner.com/blog/posts/20221021-AvoidAsyncCallsInViewmodelConstructors.html


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

https://codelabs.developers.google.com/
https://www.gamersdecide.com/articles/csgo-best-viewmodel-settings
https://creatronix.de/how-to-use-viewmodel/
https://startandroid.ru/ru/courses/architecture-components/27-course/architecture-components/527-urok-4-viewmodel.html
https://www.damirscorner.com/blog/posts/20221021-AvoidAsyncCallsInViewmodelConstructors.html

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name** : Google Codelabs

**Content Summary** :
Google Developers Codelabs provide a guided, tutorial, hands-on coding experience. Most codelabs guide users through the process of building a small application or adding a new feature to an existing application. They cover a wide range of topics, including Android Wear, Google Compute Engine, ARCore, and Google APIs on iOS.

**Analysis** :
The website is primarily focused on providing coding tutorials and hands-on experiences for various Google-related technologies. There is no direct mention or discussion of the MVVM pattern in the provided content.

**Category** : D*

**Type** : Tutorial

**Technology** : Various Google-related technologies

**Reason** : The website doesn't provide any meaningful information about MVVM or its components. The focus is on coding tutorials for Google technologies.---

Next, I will analyze the second website: "[https://www.gamersdecide.com/articles/csgo-best-viewmodel-settings](https://www.gamersdecide.com/articles/csgo-best-viewmodel-settings) ".




Used WebPilot




**Website-Name** : GamersDecide.com

**Content Summary** :
The article titled "[Top 10] CSGO Best Viewmodel Settings Used By Pros" discusses the ViewModel settings used by professional CSGO players. In the context of the game, a ViewModel refers to the character model a player sees, including the positioning of hands, guns, and other elements. The article emphasizes how tweaking these settings can impact gameplay and provides specific ViewModel settings used by ten professional players.

**Analysis** :
The website discusses the term "ViewModel" in the context of the game CSGO, specifically referring to the visual representation of the player's character and weapons. This definition deviates from the standard MVVM architectural pattern definition provided earlier.

**Category** : B*

**Type** : Personal Blog Article

**Technology** : CSGO (Counter-Strike: Global Offensive)

**Deviation/Extension Aspects** :
- The term "ViewModel" is used to describe the visual representation of the player's character in the game.
- The article discusses the positioning of hands, guns, and other elements as part of the ViewModel.
- The focus is on how tweaking these settings can impact gameplay.

**Reason** : The website discusses the term "ViewModel" in the context of a game, which is a deviation from the standard MVVM architectural pattern definition.---

Next, I will analyze the third website: "[https://creatronix.de/how-to-use-viewmodel/](https://creatronix.de/how-to-use-viewmodel/) ".


[How to use ViewModel in Android - Creatronix
creatronix.de](https://creatronix.de/how-to-use-viewmodel/)




Used WebPilot




**Website-Name** : Creatronix

**Content Summary** :
The article titled "How to use ViewModel in Android" provides a cheatsheet on how to implement the ViewModel in Android applications. It includes dependencies required for the ViewModel, the ViewModel class and LiveData, and how to use it within a Fragment. The article also touches upon the Observer pattern and how to update the ViewModel.

**Analysis** :
The website discusses the ViewModel in the context of Android development. It provides a practical guide on how to implement and use the ViewModel with LiveData in Android applications. While it does touch upon the ViewModel concept, it is specifically tailored to Android development and does not delve into the broader MVVM architectural pattern in depth.

**Category** : A*

**Type** : Tutorial

**Technology** : Android

**Reason** : The website provides a standard definition of ViewModel in the context of Android development. It does not provide a comprehensive definition of the MVVM architectural pattern but focuses on the ViewModel component within Android.---

Next, I will analyze the fourth website: "[https://startandroid.ru/ru/courses/architecture-components/27-course/architecture-components/527-urok-4-viewmodel.html](https://startandroid.ru/ru/courses/architecture-components/27-course/architecture-components/527-urok-4-viewmodel.html) ".


[startandroid.ru](https://startandroid.ru/ru/courses/architecture-components/27-course/architecture-components/527-urok-4-viewmodel.html)




Used WebPilot




**Website-Name** : StartAndroid

**Content Summary** :
The article titled "Урок 4. ViewModel" is written in Russian and provides a tutorial on how to use the ViewModel in Android applications. The article discusses the purpose of the ViewModel, its lifecycle, and how it can be used to store and manage UI-related data. It provides code examples and explanations on how to create and use a ViewModel in Android. The article also touches upon the LiveData class and how it can be used in conjunction with the ViewModel.

**Analysis** :
The website discusses the ViewModel in the context of Android development. It provides a practical guide on how to implement and use the ViewModel in Android applications. The article is tailored to Android development and does not provide a comprehensive definition of the MVVM architectural pattern. However, it does provide insights into the ViewModel's purpose and its lifecycle within Android.

**Category** : A*

**Type** : Tutorial

**Technology** : Android

**Reason** : The website provides a standard definition of ViewModel in the context of Android development. It focuses on the ViewModel component and its usage within Android, without delving into the broader MVVM architectural pattern.---

Lastly, I will analyze the fifth website: "[https://www.damirscorner.com/blog/posts/20221021-AvoidAsyncCallsInViewmodelConstructors.html](https://www.damirscorner.com/blog/posts/20221021-AvoidAsyncCallsInViewmodelConstructors.html) ".


[Avoid async calls in view model constructors
damirscorner.com](https://www.damirscorner.com/blog/posts/20221021-AvoidAsyncCallsInViewmodelConstructors.html)




Used WebPilot




**Website-Name** : Damir's Corner

**Content Summary** :
The article titled "Avoid async calls in view model constructors" discusses the pitfalls of making blocking asynchronous calls in the constructor of a ViewModel, especially in the context of MVVM. The article emphasizes the dangers of potential deadlocks and the unresponsiveness of applications. It provides code examples and solutions on how to properly handle asynchronous operations in the ViewModel, including using an asynchronous initialization method and handling errors. The article also touches upon the use of the .NET MAUI Community Toolkit for handling asynchronous initialization in XAML.

**Analysis** :
The website provides insights into the MVVM pattern, specifically focusing on the ViewModel component and its interaction with asynchronous operations. It offers practical advice and solutions for handling asynchronous calls in the ViewModel, emphasizing the importance of avoiding blocking calls in the constructor.

**Category** : A/B*

**Type** : Personal Blog Article

**Technology** : .NET MAUI

**Deviation/Extension Aspects** :
- Emphasizes the dangers of making blocking asynchronous calls in the ViewModel constructor.
- Provides solutions for handling asynchronous operations in the ViewModel, including using an asynchronous initialization method.
- Discusses the use of the .NET MAUI Community Toolkit for handling asynchronous initialization in XAML.

**Reason** : The website provides insights into the MVVM pattern with a focus on the ViewModel component. It offers practical advice that aligns with the standard definition but also provides additional insights and solutions, marking it as a deviation or extension.---

Now, I will generate the overview table with the collected information.



**Overview Table** :Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonGoogle CodelabsD*Tutorial---Various Google-related technologies-No meaningful information about MVVMGamersDecide.comB*Personal Blog ArticleViewModel used to describe visual representation in CSGO--CSGO-Deviation from standard MVVM definitionCreatronixA*Tutorial---Android-Standard definition of ViewModel in context of AndroidStartAndroidA*Tutorial---Android-Standard definition of ViewModel in context of AndroidDamir's CornerA/B*Personal Blog ArticleDangers of blocking async calls in ViewModel constructor, solutions for handling async operations in ViewModel--.NET MAUI-Insights into MVVM with focus on ViewModel and additional insights and solutions

This table provides a concise summary of the analysis of the provided websites in relation to the MVVM architectural pattern based on the given standard definition and guidelines.
