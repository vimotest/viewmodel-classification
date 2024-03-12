# Step 2: Search Process

The second step of the MLR is about the search process.
It has two main parts:
* Grabbing Google Entries (Websites)
* Grabbing Scholar Entries

## Grabbing Google Results (manually)

To grab google results, we retrieved systematically website URLs from Google.
We use the Chrome browser to search for relevant keywords, and then extract the found URLs to txt-files.

Those txt-files are then used as an input for the program `MultiVocalLiteratureMain.kt` (argument "chatgpt-next-chunk") to compute URL chunks of 5.
Those chunks are then used as input for ChatGPT with the plugin "WebPilot" to let it automatically classify for our literature search.
The results are then manually pasted in the automatically created files "output/chatgpt/chatgpt_scan_<chunknumber>.md".

Afterward, the program `MultiVocalLiteratureMain.kt` (argument "chatgpt-scan-results") is used for creating a file "chatgpt_scans.csv" which contains the results of the initial classification by ChatGPT.

### Initial 2023-02-07

* change Google settings to show 100 results per page
    * https://www.google.com/preferences
* change location to United States
* used 'SEO Minion' extension in Chrome
* Google `MVVM OR ViewModel OR "Model-View-ViewModel"`
* using the extension
    * set to "Copy" and click "Go"
    * save/append in `input/<date>_<keyword>.txt`
    * go to 2nd page, repeat

### Repeated 2024-01-19

* used 'ahrefs' extension in Chrome
* Google `MVVM OR ViewModel OR "Model-View-ViewModel"`
    * range from "2023-02-07" - "2024-01-19"
* using the extension
    * in the ahrefs panel, click 'Save URLS'
    * click on the Extension icon to open popup
    * click "Saved URLs"
    * click "Copy List" and paste into txt-file

### Meta-Check ChatGPT Scan Results

Sometimes ChatGPT was not sure what to classify and wrote something about its decision. We searched for those decisions systematically (e.g., by noticable terms like "additional").
We re-checked the chatgpt scans not classified as `B` or `C` by systematically searching all analysis texts for indications, see `MultiVocalLiteratureMain.kt` (argument "chatgpt-unsure-check").

## Grabbing Scholar Entries

To grab scholar entries, we retrieved systematically scholar entries from GoogleScholar and SemanticScholar.
Afterward, we created a "joined.csv" with the program `PaperLiteratureMain.kt` (argument "join-search-results").
Then we manually filtered the joined.csv entries by removing:
* duplicates
* non-english entries
* titles which do not really deal with "mvvm" (e.g., "view model" word combinations of other areas)
  The filtered result is written to the file `relevantPapers.csv`.`

Finally, the program `PaperLiteratureMain.kt` (argument "initial-classification") is used for initial classification in `site_initial_classification_papers.md`.
The program iteratively prints the next entry of `relevantPapers.csv` and we manually classify it to `REJECT`, `ACCEPT`, or `REVIEW`.

### Initial 2023-02-26

* use "Publish or Perish" (https://harzing.com/resources/publish-or-perish)
* searched for (max. results 1000)
    * Title words: "mvvm", Source: "GoogleScholar"
    * Title words: "view model", Source: "GoogleScholar"
    * Title words: "viewmodel", Source: "GoogleScholar"
    * Title words: "mvvm", Source: "SemanticScholar"
    * Title words: "viewmodel", Source: "SemanticScholar"
* save each results as CSV

### Repeated 2024-01-20

* use "Publish or Perish" (https://harzing.com/resources/publish-or-perish)
* searched for (max. results 1000)
    * Title words: `mvvm OR "view model" OR viewmodel`, Source: "GoogleScholar", Years from "2023" - "0"
    * Title words: "mvvm", Source: "SemanticScholar"
    * Title words: "viewmodel", Source: "SemanticScholar"
* save each results as CSV

### By Keywords

Search for keywords "mvvm" and "viewmodel" if not included in title. (title is found by Google Scholar)

* `dl.acm.org`
    * [Keywords: mvvm] OR [Keywords: viewmodel]
    * [Title: mvvm] OR [Title: viewmodel]
    * [Abstract: mvvm] OR [Abstract: viewmodel]
    * https://dl.acm.org/action/doSearch?fillQuickSearch=false&target=advanced&expand=dl&AllField=Keyword%3A%28mvvm+OR+viewmodel%29+AND+Title%3A%28-mvvm+AND+-viewmodel%29
    * ...
* `ieeexplore.ieee.org`
    * `("Author Keywords":mvvm OR "Author Keywords":viewmodel) OR ("Abstract":mvvm OR "Abstract":viewmodel) OR ("Publication Title":mvvm OR "Publication Title":viewmodel) OR ("Document Title":mvvm OR "Document Title":viewmodel)`
    * https://ieeexplore.ieee.org/search/searchresult.jsp?action=search&newsearch=true&matchBoolean=true&queryText=(%22Author%20Keywords%22:mvvm%20OR%20%22Author%20Keywords%22:viewmodel)%20OR%20(%22Abstract%22:mvvm%20OR%20%22Abstract%22:viewmodel)%20OR%20(%22Publication%20Title%22:mvvm%20OR%20%22Publication%20Title%22:viewmodel)%20OR%20(%22Document%20Title%22:mvvm%20OR%20%22Document%20Title%22:viewmodel)

## Outcome

An initial pool of 520 scholar entries 522 website entries.
They are scanned/voted to filer out 38 scholar entries and 125 website entries for the next step.

## Next Step

See `step3_attribute_classification_design/README.md`
