# Imperative vs. Reactive ViewModels

## Summary
This design construct is about ViewModels which are imperatively or reactively implemented.

## Details
Distinguishes more simple imperative viewmodels and more complex reactive viewmodels.
It is more about the implementation detail how ViewModels are realized.

## Resources
E.g., CanJS (CanJsMvvm)
Imperative:
```
increment(){
  this.count++;
},
```
Reactive: 
```
listenTo("increment", function( {value} ){
  resolve(count++);
});
```
