See https://github.com/Fumapps/mps-literature-review

Execute in MPS console:

* `LiteratureSourceAspectOverview.printToplevelAspectOverview(#instances(LiteratureReview).first)`
  * store as `aspect_source_statistics.csv`
* `LiteratureSourceUniqueIdeaOverview.printUniqueIdeaOverview(#instances(LiteratureReview).first)`
  * store as `unique_designconstructs_per_sourcetype.csv`
* `TradeoffsOverview.printTradeoffsOverview(#instances(LiteratureReview).first)`
  * store as `tradeoffs_usage_statistics.csv`
