Feature: To validate contact details

  Background: 
 #   Given The user should be in FootLocker page

  @retest
  Scenario: To validate contact us phone number
    When The user has to click sign in button
    And The user has to fill username and password
    And The user has to click signin confirm button
    And The user has to click contact us link
    And The user has to click How do I reach you by phone?
    Then The user has to naviagate to correct page
