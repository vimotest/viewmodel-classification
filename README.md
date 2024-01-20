# ViewModel Classification

This repository contains an automatism to simplity the initial classification of the ViewModel related google search results.

## Grabbing Google Results (manually)

* change Google settings to show 100 results per page
  * https://www.google.com/preferences
* change location to United States
* used 'SEO Minion' extension in Chrome
* Google `MVVM OR ViewModel OR "Model-View-ViewModel"`
* using the extension
  * set to "Copy" and click "Go"
  * save/append in `input/<date>_<keyword>.txt`
  * go to 2nd page, repeat

### Repeated 2024-01-19

* used 'ahrefs' extension in Chrome
* Google `MVVM OR ViewModel OR "Model-View-ViewModel"`
  * range from "2023-02-07" - "2024-01-19"
* using the extension
  * in the ahrefs panel, click 'Save URLS'
  * click on the Extension icon to open popup
  * click "Saved URLs"
  * click "Copy List" and paste into txt-file

## Grabbing Paper Resources

To grab paper resources, we retrieved systematically scholar entries from GoogleScholar and SemanticScholar.
Afterward, we created a "joined.csv" with the program `PreparePaperSearchesToJoinedCsv.kt`.
Then we manually filtered the joined.csv entries by removing:
* duplicates
* non-english entries
* titles which do not really deal with "mvvm" (e.g., "view model" word combinations of other areas)
The filtered result is written to the file `relevantPapers.csv`.` 

Finally, the program `PaperLiteratureMain.kt` is used for initial classification in `site_initial_classification_papers.md`.
The program iteratively prints the next entry of `relevantPapers.csv` and we manually classify it to `REJECT`, `ACCEPT`, or `REVIEW`.

After processing the initial classification, the program `PaperStepByStepCheck.kt` is used to assist in migrating the initial accepted (`ACCEPT`) papers to "mps-literature-review".
There the attribution and in-depth analysis of the scholar entries takes place.

### Initial 2023-02-26

* use "Publish or Perish" (https://harzing.com/resources/publish-or-perish)
* searched for (max. results 1000)
  * Title words: "mvvm", Source: "GoogleScholar"
  * Title words: "view model", Source: "GoogleScholar"
  * Title words: "viewmodel", Source: "GoogleScholar"
  * Title words: "mvvm", Source: "SemanticScholar"
  * Title words: "viewmodel", Source: "SemanticScholar"
* save each results as CSV

### Repeated 2024-01-20

* use "Publish or Perish" (https://harzing.com/resources/publish-or-perish)
* searched for (max. results 1000)
  * Title words: `mvvm OR "view model" OR viewmodel`, Source: "GoogleScholar", Years from "2023" - "0"
  * Title words: "mvvm", Source: "SemanticScholar"
  * Title words: "viewmodel", Source: "SemanticScholar"
* save each results as CSV


## ViewModel Standard Definition

from original URLs:

* https://docs.microsoft.com/en-us/archive/blogs/johngossman/introduction-to-modelviewviewmodel-pattern-for-building-wpf-apps
  * original blog post
* https://docs.microsoft.com/en-us/archive/blogs/johngossman/advantages-and-disadvantages-of-m-v-vm
  * extension to original blog post
* https://learn.microsoft.com/en-us/archive/msdn-magazine/2009/february/patterns-wpf-apps-with-the-model-view-viewmodel-design-pattern
  * often cited in addition to Gossman's blog post
* https://learn.microsoft.com/en-us/dotnet/architecture/maui/mvvm
  * Microsoft's current definition of MVVM (re-write of the Xarmarin.Forms version)
* https://msdn.microsoft.com/en-us/library/hh848246.aspx
  * several cited 2012 source "The MVVM Pattern" by microsoft

### Standard definition

#### by John Gossman

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

#### by Josh Smith (extensions to John Gossman's definition)

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

#### by Mircosoft Learn (extensions to previous definitions)

* View defines structure, layout, and appearance of what the user sees on screen
  * encapsulates UI Logic
* ViewModel provides properties and commands that define the functionality to be offered by the UI
  * encapsulates Presentation Logic and State
* Model represents the app's domain model, which usually includes a data model, business and validation logic
  * encapsulates Business Logic and Data
* Tip: Keep the UI responsive with asynchronous operations.
* There is typically a one-to-many relationship between the ViewModel and the model classes
* ViewModel provides data from a model in a form that the view can easily consume
* Tip: Centralize data conversions in a conversion layer.
* View and ViewModel construction and runtime-association can be done in many approaches
  * View first composition
  * ViewModel first composition
* Tip: Keep ViewModels and views independent.

#### by The MVVM Pattern article (extensions to previous definitions)

* A common approach to instantiate a ViewModel in a view is to use a view model locator
  * means that the application has a single class that is responsible for connecting view models to views

### Standard benefits

#### by John Gossman

* abstraction of the View
* reduction of business logic or glue code stuck in code-behind
* ViewModel is easier to unit test
* ViewModel is more Model-ish, test it without awkward UI automation and interaction
* Data-binding performance is quite good

#### by Josh Smith

* development team can focus on creating robust ViewModel classes, and the design team can focus on making user-friendly Views

#### by The MVVM Pattern article

* MVVM enables a developer-designer workflow
* each MVVM component (Model, ViewModel, Model) is decoupled from each other, enabling:
  * Components to be swapped
  * Internal implementation to be changed without affecting the others
  * Components to be worked on independently

#### by Mircosoft Learn (extensions to previous definitions)

* MVVM helps cleanly separate an application's business and presentation logic from UI
* makes the application easier to test, maintain, and evolve
* ViewModel acts as an adapter for the model classes and prevents from making major changes to the model code
* UI can be redesigned without touching the view model

### Standard disadvantages

#### by John Gossman

* simple UI, M-V-VM can be overkill
* bigger cases, it can be hard to design the ViewModel up front 
* Data-binding is declarative and harder to debug
* Bindings might be heavier than the objects being bound, which can lead to more memory consumption

## Aspects not covered by Standard Definition

* statements about where navigation logic is stored.
* application lifecycle management, e.g., Android's LiveData