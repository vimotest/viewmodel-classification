# Hierarchy of ViewModels

## Summary
ViewModels are structured in a hierarchy.

## Details
For example, a MainViewModel is relates to a container which holds subviews with own ViewModels.

## Resources
Resource: LearnFromSakiViewModelHiearchy

> we added an abstraction for our Orders collection through OrdersViewModel and added an Orders View that contains our grid markup in XAML. We could have achieved the same result with a simpler design, however, the point of this chapter is to demonstrate organizing our presentation layer using HVM. By using the HVM approach here, we have created a self-contained control and are allowing reuse of the Orders grid in other areas of our application; all we have to do to reuse the Orders grid is to expose an OrderViewModel property in a content control. Additionally, we've encapsulated the grid functionality, and if we started expanding our grid functionality we'd have a nice clean separation in OrdersViewModel that would allow us to encapsulate that logic and state. (MvvmSurvivalGuideSiddiqi2012)
```cs
CustomerDetailsViewModel.cs:

private OrdersViewModel _orders;
public OrdersViewModel Orders
{
    get
    {
        if (Customer == null)
            return null;
        return _orders ?? (_orders
            = new OrdersViewModel(Customer.Orders));
    }
}

OrdersViewModel.cs:
    public class OrdersViewModel : ViewModelBase
    {
        public ObservableCollection<OrderViewModel>
            Orders { get; set; }

        public OrdersViewModel(
            IEnumerable<Model.Order> orders)
        {
            Orders = new ObservableCollection<OrderViewModel>(
                orders.Select(o => new OrderViewModel(o)));
        }
    }
```

## Used By
* Website: learnfromsaki - Configuring ViewModel Hierarchy
* Book: MVVM Survival Guide for Enterprise Architectures in Silverlight and WPF

