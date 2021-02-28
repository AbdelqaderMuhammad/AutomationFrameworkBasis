$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchInGoogle.feature");
formatter.feature({
  "line": 3,
  "name": "feature to test search in google",
  "description": "I want to search for something in google bar",
  "id": "feature-to-test-search-in-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@googleSearchFeature"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "User registration",
  "description": "",
  "id": "feature-to-test-search-in-google;user-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@googleSearchTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is in the home page.",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I send the search word.",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on search bar.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the results are displayed successfully.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});