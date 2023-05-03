Feature: validate login feature on Amazon.in

  @Amazon
  Scenario: validate login using valid and invalid credentials
    Given user is in login screen
    When user enter username and password and click login
      | 8056113675 | Niranjan@13 |
      | Niranjan | Najanrin@13 |
      | sugan | Sugan |
@Amazon
  Scenario Outline: validate login using valid and invalid credentials
    Given user is in login screen
    When user enter "<username>" and "<password>" and click login

    Examples: 
      | username   | password    |
      | 8148641606 | Najanrin@13 |
      | 8056113675 | Niranjan@13 |
      | 9688674637 | Sugan |
