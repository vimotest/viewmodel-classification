# Framework-Independent Command Implementation Overhead

Either we can use a UI-framework specific command class, or we have to implement MVVM commands by hand to stay framework independent. This 

From WinPhone8Essentials2013
> The biggest disadvantage in MVVM pattern, in my point of view, is the lack of the Command class that will handle bound actions. When developers decide to not use any framework, they are forced to implement some mechanisms on their own. In turn, MVVM Light has this huge advantage as it provides the RelayCommand class out of the box. This class is responsible for representing commands in our ViewModel, and it implements and handles the ICommand interface features. Why is it so good? Because we can create any command we want in a very convenient way without going under a glass and thinking of very deep implementation.

