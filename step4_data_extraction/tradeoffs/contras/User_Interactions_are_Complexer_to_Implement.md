# User Interactions are Complexer to Implement

Since the ViewModel is unaware of the View, it is more challenging to implement user flows where message-boxes shall be shown to users (optionally with feedback).

See: BuldingEnterpriseAppsWpfMvvm p.14:
> The dialog approach is easy to implement but very invasive for users. Displaying a dialog forces users to click a button—such as “Yes” or “No.” Because dialogs capture all application input, until the user responds, the entire UI simply freezes. Dialogs are appropriate when you need a confirmation, such as when a user tries to delete a record, but in most other cases you should use a different approach.
> The MVVM pattern makes it more difficult to implement the dialog approach because the ViewModel doesn’t know anything about the View, so it doesn’t know how to interact with it. An easy solution to this problem is the mediator pattern. You’ll analyze this pattern in more depth in Chapter 6, “The UI Layer with MVVM.”

