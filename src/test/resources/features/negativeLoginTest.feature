Feature: Negative Login Test - The user should NOT be able to login with invalid credentials

  Background: Go to home page login
    Given The user is on the login page

  @negativeScenario
  Scenario Outline: Negative Scenario-User should NOT be able to login with invalid credentials
    When The user enters "<invalidUsername>" and "<invalidPassword>" and click login button
    Then verify that invalid "<message>"

    Examples:
      | invalidUsername | invalidPassword | message                                |
      | htcm            |                 | Please fill out Username and Password. |
      |                 | test123         | Please fill out Username and Password. |
      |                 | invalidPassword | Please fill out Username and Password. |
      |                 |                 | Please fill out Username and Password. |
      | htcm            | invalidPassword | Wrong password.                        |
      | notExistUser    | invalidPassword | User does not exist.                   |
      | ktn21           | test123         | User does not exist.                   |