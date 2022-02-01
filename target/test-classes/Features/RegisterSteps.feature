Feature: To validate the register functionality

  Background: 
    #Given The user should be in FootLocker page
  @sanity
  Scenario: To validate register functionality using invalid credentials
    When The user has to click sign in button and Create button
    And The user has to fill firstname, lastname and other fields
    And The user has to click Signup button
    Then The user should receive error
