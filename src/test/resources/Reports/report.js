$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "To validate the login functionality of FootLocker",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user has to click sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill username and password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_fill_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click signin confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_click_signin_confirm_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_should_navigate_to_invalid_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});