# ViewModel Classification

This repository contains an automatism to simplity the initial classification of the ViewModel related google search results.

## Grabbing Google Results (manually)

* change Google settings to show 100 results per page
  * https://www.google.com/preferences
* change location to United States
* used 'SEO Minion' extension in Chrome
* Google "MVVM", "ViewModel"
* using the extension
  * set to "Copy" and click "Go"
  * save/append in `input/<date>_<keyword>.txt`
  * go to 2nd page, repeat

## ViewModel Standard Definition

from original URLs:

* https://docs.microsoft.com/en-us/archive/blogs/johngossman/introduction-to-modelviewviewmodel-pattern-for-building-wpf-apps
* https://docs.microsoft.com/en-us/archive/blogs/johngossman/advantages-and-disadvantages-of-m-v-vm
* https://learn.microsoft.com/en-us/archive/msdn-magazine/2009/february/patterns-wpf-apps-with-the-model-view-viewmodel-design-pattern

### Standard definition

TODO

### Standard benefits

* abstraction of the View
* reduction of business logic or glue code stuck in code-behind
* ViewModel is easier to unit test
* ViewModel is more Model-ish, test it without awkward UI automation and interaction
* Data-binding performance is quite good

### Standard disadvantages

* simple UI, M-V-VM can be overkill
* bigger cases, it can be hard to design the ViewModel up front 
* Data-binding is declarative and harder to debug
* Bindings might be heavier than the objects being bound, which can lead to more memory consumption
