$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Automobil.feature");
formatter.feature({
  "name": "Automobile",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify subTabs of Automobil",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user access adesso homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adesso.stepdefinitions.HomePageStepdefinitions.the_user_access_adesso_homepage()"
});
