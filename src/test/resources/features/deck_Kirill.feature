@deck
Feature:

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee75" and password as "Employee123"

  Scenario: Verify user can create anew board
    And user navigates to "Deck" module page