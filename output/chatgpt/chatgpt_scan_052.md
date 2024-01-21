https://developer.android.com/topic/architecture
https://dzone.com/refcardz/mvvm-design-pattern-formula
https://tech.olx.com/clean-architecture-and-mvvm-on-ios-c9d167d9f5b3
https://www.nuget.org/packages/CommunityToolkit.Mvvm
https://www.mvvmcross.com/


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

https://developer.android.com/topic/architecture
https://dzone.com/refcardz/mvvm-design-pattern-formula
https://tech.olx.com/clean-architecture-and-mvvm-on-ios-c9d167d9f5b3
https://www.nuget.org/packages/CommunityToolkit.Mvvm
https://www.mvvmcross.com/

Finally, generate an overview table with columns: Website-Name, Category, Type, Deviation/Extension Aspects, New Benefits, New Drawbacks, Technology, View/ViewModel Cardinality, Reason

ChatGPT:
- Used WebPilot




**Website-Name** : Android Developers - Guide to app architecture

**Content Summary** :
The Android Developers' guide to app architecture provides a comprehensive overview of best practices and recommended architecture for building robust Android apps. It emphasizes the importance of separation of concerns, driving UI from data models, and having a single source of truth. The guide also introduces the concept of Unidirectional Data Flow (UDF) and highlights the significance of having a well-defined app architecture. The architecture is divided into UI, data, and domain layers, with each layer having specific responsibilities. The guide also touches upon dependency management and the benefits of having a good architecture.

**Analysis** :
- **Category** : A (Standard Definition of MVVM)
- **Type** : Official Documentation
- **Deviation/Extension Aspects** :
- Emphasis on Unidirectional Data Flow (UDF)
- Introduction of domain layer as an optional layer between UI and data layers
- **New Benefits** :
- App can scale with more contributors without many code conflicts
- Faster onboarding for new team members due to consistent architecture
- Easier bug investigation with well-defined processes
- **New Drawbacks** : None mentioned specifically related to MVVM.
- **Technology** : Android
- **View/ViewModel Cardinality** : Not explicitly mentioned
- **Reason** : The website provides a standard definition of MVVM with some extensions, especially the emphasis on UDF and the introduction of the domain layer. It also lists benefits of having a good architecture, some of which are not mentioned in the standard definition.

I will now proceed to the next website.




Used WebPilot




**Website-Name** : DZone - MVVM Design Pattern Formula

**Content Summary** :
DZone's MVVM Design Pattern Formula provides a concise overview of the MVVM pattern. It discusses the three main components: Model, View, and ViewModel. The article emphasizes the importance of data binding and how it facilitates communication between the View and ViewModel. It also touches upon the role of commands in MVVM and how they can be used to handle user interactions. The article provides code examples to illustrate the concepts discussed. Additionally, it highlights the benefits of using MVVM, such as better separation of concerns, improved testability, and more maintainable code.

**Analysis** :
- **Category** : A (Standard Definition of MVVM)
- **Type** : Tutorial/Reference Card
- **Deviation/Extension Aspects** : None detected.
- **New Benefits** :
- Improved maintainability of code
- **New Drawbacks** : None mentioned.
- **Technology** : Not technology-specific, general MVVM pattern.
- **View/ViewModel Cardinality** : Not explicitly mentioned.
- **Reason** : The website provides a standard definition of MVVM with emphasis on data binding and commands. It also lists benefits of MVVM, including one not mentioned in the standard definition (improved maintainability).

I will now proceed to the next website.




Used WebPilot




**Website-Name** : OLX Tech - Clean Architecture and MVVM on iOS

**Content Summary** :
The article on OLX Tech discusses the importance of architectural patterns in software development, emphasizing mobile software engineering. It highlights the MVVM, Clean Architecture, and Redux patterns as the most widely used in mobile software engineering. The article then delves into how MVVM and Clean Architecture can be applied in an iOS app. The Clean Architecture is visualized as an onion with different layers, including Presentation, Domain, and Data layers. The Domain Layer, representing business logic, is the innermost part and is isolated from other layers. The Presentation Layer contains the UI, coordinated by ViewModels.

**Analysis** :
- **Category** : B* (Deviation or Stricter Version of the Standard Definition)
- **Type** : Company Blog Article
- **Deviation/Extension Aspects** :
- Emphasis on Clean Architecture in conjunction with MVVM.
- Introduction of the Domain Layer as an isolated layer.
- Mention of the Dependency rule in Clean Architecture.
- **New Benefits** : None mentioned.
- **New Drawbacks** : None mentioned.
- **Technology** : iOS (UIKit, SwiftUI)
- **View/ViewModel Cardinality** : Not explicitly mentioned.
- **Reason** : The website provides a deviation from the standard definition of MVVM by integrating it with Clean Architecture. It introduces the concept of the Domain Layer and emphasizes its isolation from other layers. The article also touches upon the Dependency rule in Clean Architecture.

I will now proceed to the next website.




Used WebPilot




**Website-Name** : NuGet - CommunityToolkit.Mvvm 8.2.1

**Content Summary** :
The NuGet package, CommunityToolkit.Mvvm 8.2.1, offers a .NET MVVM library with various helpers. These include:
- `ObservableObject`: A base class for objects implementing the `INotifyPropertyChanged` interface.
- `ObservableRecipient`: A base class for observable objects supporting the `IMessenger` service.
- `ObservableValidator`: A base class for objects implementing the `INotifyDataErrorInfo` interface.
- `RelayCommand`: A simple delegate command implementing the `ICommand` interface.
- `AsyncRelayCommand`: A delegate command that supports asynchronous operations and cancellation.
- `WeakReferenceMessenger`: A messaging system for exchanging messages between loosely-coupled objects.
- `StrongReferenceMessenger`: A high-performance messaging system that prioritizes speed over weak references.
- `Ioc`: A helper class for configuring dependency injection service containers.

**Analysis** :
- **Category** : D* (No useful definition of MVVM found on the whole website)
- **Type** : Package Repository
- **Deviation/Extension Aspects** : None detected.
- **New Benefits** : None mentioned.
- **New Drawbacks** : None mentioned.
- **Technology** : .NET
- **View/ViewModel Cardinality** : Not explicitly mentioned.
- **Reason** : The website provides a package that offers MVVM helpers for .NET, but it doesn't provide a meaningful definition or discussion about the MVVM pattern itself.

I will now proceed to the next website.




Used WebPilot




**Website-Name** : MvvmCross

**Content Summary** :
MvvmCross is a convention-based MVVM framework designed specifically for Xamarin and the mobile ecosystem. It aims to help developers build clean, pixel-perfect, native UIs while sharing behavior and business logic across supported platforms. The framework leverages the Model-View-ViewModel (MVVM) design pattern and supports various platforms, including Xamarin.iOS, Xamarin.Android, Xamarin.Mac, Xamarin.Forms, Universal Windows Platform (UWP), and Windows Presentation Framework (WPF). Over 5000 companies use MvvmCross, and it has a strong community with over 250 contributors on GitHub.

**Analysis** :
- **Category** : A* (Standard Definition of MVVM)
- **Type** : Framework Website
- **Deviation/Extension Aspects** : None detected.
- **New Benefits** : None mentioned.
- **New Drawbacks** : None mentioned.
- **Technology** : Xamarin, UWP, WPF
- **View/ViewModel Cardinality** : Not explicitly mentioned.
- **Reason** : The website provides a standard definition of MVVM in the context of the MvvmCross framework for Xamarin and other platforms. It emphasizes the benefits of sharing behavior and business logic across platforms using the MVVM design pattern.

I will now compile the information from all websites into an overview table.



Here's the overview table based on the analysis of the provided websites:Website-NameCategoryTypeDeviation/Extension AspectsNew BenefitsNew DrawbacksTechnologyView/ViewModel CardinalityReasonAndroid Developers - Guide to app architectureAOfficial DocumentationEmphasis on Unidirectional Data Flow (UDF), Introduction of domain layerApp scalability, Faster onboarding, Easier bug investigationNoneAndroidNot mentionedStandard definition with emphasis on UDF and domain layer. Additional benefits not in standard definition.DZone - MVVM Design Pattern FormulaATutorial/Reference CardNoneImproved maintainability of codeNoneGeneral MVVMNot mentionedStandard definition with emphasis on data binding and commands. Additional benefit not in standard definition.OLX Tech - Clean Architecture and MVVM on iOSB*Company Blog ArticleEmphasis on Clean Architecture, Introduction of the Domain Layer, Dependency rule in Clean ArchitectureNoneNoneiOS (UIKit, SwiftUI)Not mentionedDeviation from standard definition by integrating MVVM with Clean Architecture. Emphasis on Domain Layer and Dependency rule.NuGet - CommunityToolkit.Mvvm 8.2.1D*Package RepositoryNoneNoneNone.NETNot mentionedNo meaningful definition or discussion about MVVM. Provides MVVM helpers for .NET.MvvmCrossA*Framework WebsiteNoneNoneNoneXamarin, UWP, WPFNot mentionedStandard definition of MVVM in the context of MvvmCross framework for Xamarin and other platforms.

This table provides a concise summary of the MVVM definitions, deviations, benefits, and drawbacks found on each website, along with the reasons for categorizing them as such.
