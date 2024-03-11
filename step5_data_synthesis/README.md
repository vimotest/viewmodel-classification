# Step 5: Data Synthesis

In the final step, we synthesise the data from the literature review:

* we cluster the 76 design constructs into 29 design aspects
* we categorized the 29 design aspects into 11 aspect categories
* we analyzed the design aspects
* we analyzed the 16 benefits and 15 drawbacks
* we answer the research questions

## Statistics

We implemented MPS helper classes to print statistics about the results of the MLR.

Execute in MPS console:

* `LiteratureSourceAspectOverview.printToplevelAspectOverview(#instances(LiteratureReview).first)`
  * store as `aspect_source_statistics.csv`
* `LiteratureSourceUniqueIdeaOverview.printUniqueIdeaOverview(#instances(LiteratureReview).first)`
  * store as `unique_designconstructs_per_sourcetype.csv`
* `TradeoffsOverview.printTradeoffsOverview(#instances(LiteratureReview).first)`
  * store as `tradeoffs_usage_statistics.csv`
