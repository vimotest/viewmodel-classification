# Step 4: Data Extraction

In this step we extract the data from the scholar entries and website entries.
We use the MPS language to efficiently structure the data into a model.

## See Model

See https://github.com/anonymized/mps-literature-review design constructs and trade-offs

## Transfer to MPS

The results of the step2 search process are transferred to the MPS-based classification scheme.
There the attribution and in-depth analysis of the scholar entries takes place.

### Multivocal

We use the program `WebsiteStepByStepCheck.kt` to assist in migrating the initial accepted (Category `B` or `C`) websites to "mps-literature-review".

### Scholar Entries

The program `PaperStepByStepCheck.kt` is used to assist in migrating the initial accepted (`ACCEPT`) papers to "mps-literature-review".

## Generate Data to Markdown

Open project in MPS and generate `LiteratureReviewLang.sandbox`/`MvvmReview`, see generated files under `<project-root>/languages/LiteratureReviewLang.sandbox/source_gen`

## Outcome

76 design constructs, 16 benefits, and 15 drawbacks.

## Next Step

See `step5_data_synthesis/README.md`
