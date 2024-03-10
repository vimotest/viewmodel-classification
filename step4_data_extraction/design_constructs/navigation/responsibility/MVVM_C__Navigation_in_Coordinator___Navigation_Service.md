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


## Relates to

* [MVVM_Controller__ViewModel_and_Controller.md](MVVM/Controller: ViewModel and Controller)
* [ViewModel_to_ViewModel_Communication_via_Messaging_Mediators.md](ViewModel to ViewModel Communication via Messaging/Mediators)
* [M_V_P_VM__Model_View_Presenter_ViewModel.md](M-V-P-VM: Model-View-Presenter-ViewModel)
