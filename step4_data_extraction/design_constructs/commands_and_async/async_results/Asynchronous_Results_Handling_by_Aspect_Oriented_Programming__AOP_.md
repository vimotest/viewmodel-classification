# Asynchronous Results Handling by Aspect Oriented Programming (AOP)

## Summary
Use Aspect Oriented Programming to make ViewModel methods asynchronous.

## Details
If a programming language supports AOP (e.g., attributes in C#), then an method attribute can be implemented which statically knows the UI-Thread Dispatcher and then can invoke a method body on the UI-thread automatically.

## Resources
Example Hall2010ProWpf:
```cs
using System.Windows.Threading;
 
using PostSharp.Aspects;
 
namespace DispatcherFailure
{
    [Serializable]
    public class ExecuteOnUIThreadAttribute : MethodInterceptionAspect
    {
        public static Dispatcher Dispatcher { get; set; }
 
        public override void OnInvoke(MethodInterceptionArgs args)
        {
            if (Dispatcher != null && !Dispatcher.CheckAccess())
            {
                Dispatcher.Invoke((Action)delegate { args.Proceed(); });
            }
            else
            {
                args.Proceed();
            }
        }
    }
}
...
[ExecuteOnUIThread]
void TimerElapsed(object sender, ElapsedEventArgs e)
{
    Messages.Add("Timer fired!");
}
```
> The attribute’s static Dispatcher property can then be set at application startup. It is probably best that the reference be factored out into an interface as in the previous examples so that the decorated methods can be run in a unit testing environment with no ill effects.


## Relates to

* [Static_UI_Thread_Dispatcher.md](Static UI Thread Dispatcher)
* [Asynchronous_Results_Handling_by_Mediator__abstracted_Dispatcher_.md](Asynchronous Results Handling by Mediator (abstracted Dispatcher))

## Used By
* Book: Pro WPF and Silverlight MVVM: Effective Application Development with Model-View-ViewModel

