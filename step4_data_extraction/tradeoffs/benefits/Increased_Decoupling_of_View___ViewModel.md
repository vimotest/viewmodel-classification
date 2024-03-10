# Increased Decoupling of View / ViewModel

View and ViewModel are more decoupled. In "pure MVVM", it can also reached that the view is even independent of the concrete ViewModel-type.

See: MvvmSurvivalGuideSiddiqi2012
> Increased decoupling: When using the pure approach, you no longer need to have the view and mediator (view model, presenter, or controller) be explicitly aware of each other. The view does have a reference to the view model via its DataContext property. However, under pure MVVM, it's not necessary for the view to be aware of the type of the view model.

