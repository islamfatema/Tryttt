$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("shoeSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Shoe search validations",
  "description": "",
  "id": "shoe-search-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Shoe search possitive scenarios",
  "description": "",
  "id": "shoe-search-validations;shoe-search-possitive-scenarios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Chrome Browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Select \"\u003cAcron\u003e\" from list",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Validate Acron\u0027s shoes",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoeSearchStep.open_Chrome_Browser_with_url()"
});
formatter.result({
  "duration": 8783972934,
  "status": "passed"
});
formatter.match({
  "location": "ShoeSearchStep.click_on_search_button()"
});
formatter.result({
  "duration": 5455829,
  "error_message": "java.lang.NullPointerException\n\tat java.util.Objects.requireNonNull(Objects.java:203)\n\tat org.openqa.selenium.interactions.Actions.\u003cinit\u003e(Actions.java:66)\n\tat shoeSearchPage.ShoeSearchPage.clickOnsearchButton(ShoeSearchPage.java:28)\n\tat stepdefinition.ShoeSearchStep.click_on_search_button(ShoeSearchStep.java:34)\n\tat ✽.When Click on search button(shoeSearch.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cAcron\u003e",
      "offset": 8
    }
  ],
  "location": "ShoeSearchStep.select_from_list(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoeSearchStep.click_on_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoeSearchStep.validate_Acron_s_shoes()"
});
formatter.result({
  "status": "skipped"
});
});