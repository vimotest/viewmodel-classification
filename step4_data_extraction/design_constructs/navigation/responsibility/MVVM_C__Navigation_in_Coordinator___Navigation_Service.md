# MVVM-C: Navigation in Coordinator / Navigation Service

## Summary
MVVM with a dedicated coordinator / navigation service for routing ViewModels.

## Details
There is a separate component "Coordinator" which deals with navigation/routing and initialization of views.

## Resources
> the main lack of MVVM is the routing management (MarcoSantaDevMvvmCSwift)
> Its responsibility is to show a new view and to inject the dependencies which the View and ViewModel need. (MarcoSantaDevMvvmCSwift)

> The Coordinator must provide a start method to create the MVVM layers and add View in the view hierarchy. (MarcoSantaDevMvvmCSwift)
> You may often have a list of Coordinator childs since in your current view you may have subviews (MarcoSantaDevMvvmCSwift)

MVVM plus with a router solves also the problem of missing coordination responsibility. There is a Flow Coordinator which does the flow navigation (RealmIOSMvvmMvcViper).

> The navigation system works on a key/ID basis (the ID is an object and not a specific type). In order to create the keys, we define them within the ViewModelLocator: (UsingMvvmLightXamarinFirstMvvmApp)
```cs
var nav = new NavigationService();
nav.Initialize(this.Window.RootViewController as UINavigationController);
nav.Configure(ViewModelLocator.MainPageKey, "MainPage");
nav.Configure(ViewModelLocator.MapPageKey, "MapPage");
...
navigationService.NavigateTo(ViewModelLocator.MapPageKey, new List<double>{Latitude, Longitude});
```


## Construct Type

**ExtendsStandardDefinition:** extends standard MVVM by new rules

**Why:** "navigation" aspect not addressed in standard definition



## Relates to

* [MVVM_Controller__ViewModel_and_Controller.md](MVVM/Controller: ViewModel and Controller)
* [ViewModel_to_ViewModel_Communication_via_Messaging_Mediators.md](ViewModel to ViewModel Communication via Messaging/Mediators)
* [M_V_P_VM__Model_View_Presenter_ViewModel.md](M-V-P-VM: Model-View-Presenter-ViewModel)

## Used By
* Website: Nick's .NET Travels - ViewModel to ViewModel Navigation in a Xamarin.Forms Application with Prism and MvvmCross
* Website: Marco Santa Dev
* Website: Realm - Good iOS Application Architecture: MVVM vs. MVC vs. VIPER
* Book: MVVM Survival Guide for Enterprise Architectures in Silverlight and WPF
* Book: Windows Phone 8 Application Development Essentials (A practical guide to creating a Windows Phone 8 application using C#, XAML, and MVVM)
* Book: Developer's Guide to Microsoft Prism 4: Building Modular MVVM Applications with Windows Presentation Foundation and Microsoft Silverlight
* BookChapter: Using MVVM Light with your Xamarin Apps: Installing MVVM Light
* BookChapter: Using MVVM Light with your Xamarin Apps: Your First MVVM Light Mobile App
* BookChapter: Windows 8 MVVM Patterns Revealed: Implementing the ViewModel
* Book: iOS Architecture Patterns: MVC, MVP, MVVM, VIPER, and VIP in Swift
* Website: MvvmCross Documentation on ViewModel Lifecycle

