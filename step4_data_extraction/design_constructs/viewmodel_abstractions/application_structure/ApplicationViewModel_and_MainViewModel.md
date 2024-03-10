# ApplicationViewModel and MainViewModel

## Summary
An ApplicationViewModel which is created on application startup is provided to all views. It can contain initialization logic for the application.

## Details
All views can access the ApplicationViewModel on certain events and use it as an global entrypoint to our application. The ApplicationViewModel might provide a dedicated MainViewModel, which represents the MainView/MainWindow.

The MainViewModel might contain information about toolbars, menus, or tabbed-windows. It also might be splitted into several child ViewModels ToolBarViewModel, MenuViewModel, or TabbedWindowsViewModel.

## Resources
Example Hall2010ProWpf:
> We have a private ApplicationViewModel that is set to refer to the instance declared in the XAML file. We could have constructed an ApplicationViewModel manually but, as previously mentioned, we declare it as a resource so it can be referenced in all other XAML files in the project. Finding a resource by key is very simple; we just index the dictionary with the string key we supplied in the XAML and cast the returned object to an ApplicationViewModel.
> Once we have a valid ApplicationViewModel instance, we call its Startup() method to pass on the message that the application has started. We could stop here if we wanted, with no further contextual data passed to the ViewModel. Or, we could pass in extra arguments to inform the ApplicationViewModel of various relevant view-related states. One common addition would be to pass in any command-line arguments that may have been supplied if the application was executed from the console or a shortcut. The StartupEventArgs supplied to the Application_Startup event handler contains an Args property, which is a string array of the supplied arguments.
> It is likely that your Main window will be split into a number of different sections, each with its own ViewModel. This avoids the maintenance effort of one monolithic ViewModel with a number of disparate responsibilities that can all too easily become unwieldy. Instead, the main ViewModel will hold other ViewModels that service distinct sections of the view—such as a dedicated ToolBarViewModel, MenuViewModel, or TabbedWindowsViewModel.

```cs
namespace MvvmWpfApp.ViewModel
{
    public class ApplicationViewModel
    {
        public void Startup()
        {
            // Place application intialization code here
        }
    }
}
...
private void Application_Startup(object sender, StartupEventArgs e)
        {
            _appViewModel = Resources["applicationViewModel"] as ApplicationViewModel;
            if (_appViewModel != null)
            {
                _appViewModel.Startup();
             
                MainViewModel mainViewModel = _appViewModel.CreateMainViewModel();
                MainWindow mainWindow = new MainWindow();
                mainWindow.DataContext = mainViewModel;
                this.MainWindow = mainWindow;
                this.MainWindow.Show();
            }
        }
```
