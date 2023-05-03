Feature: To validate the login functionality of FootLocker

  Background: 
  #  Given The user should be in FootLocker page

  @smoke
  Scenario: To validate login functionality with invalid credentials
    When The user has to click sign in button
    And The user has to fill username and password
      | niranjan | kumar |
      | sugan    | nagus |
    And The user has to click signin confirm button
    Then The user should navigate to invalid login page

  @regression
  Scenario: To validate login functionality with invalid credentials
    When The user has to click sign in button
    And The user has to fill "kumar@yahoo.com" and "Kumar31"
    And The user has to click signin confirm button
    Then The user should navigate to invalid login page
