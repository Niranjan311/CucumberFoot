$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Amazon.feature");
formatter.feature({
  "name": "validate login feature on Amazon.in",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate login using valid and invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Amazon"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon.user_is_in_login_screen()"
});
