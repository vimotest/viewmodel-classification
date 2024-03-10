# Asynchronous Data Fetching / Threading Challenges

Since UI frameworks usually force to update UI widgets on a dedicated UI thread, updating the ViewModel properties asynchronously comes with challenges.
Simply observing the ViewModel fields and updating the UI widgets might result in threading issues, if not dispatched to the UI thread correctly. 

