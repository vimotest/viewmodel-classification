# Using UI-Framework Features on View-layer Decreases Testability

Using UI-Framework Features like WPF triggers decrease testability.

Example (BuldingEnterpriseAppsWpfMvvm):
> But first, a word of caution regarding the use of triggers in WPF and Silverlight when you implement the MVVM pattern: they should not be heavily used because they can easily incorporate presentation logic that can’t be tested . The logic is not available in the ViewModel but it is exposed in the View with the trigger .

