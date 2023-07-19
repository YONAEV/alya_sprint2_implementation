@B29G3-276
Feature: US-005 Deck Module Functionality

		#@B29G3-271
  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee75" and password as "Employee123"
    And the user navigates to "Deck" module page
    And the user clicks on deck menu button

  @B29G3-272
  Scenario: US-005 AC1 TC Verify that User can create a new board
    When the user clicks on Add board button
    And the user types in "School" in the Board name text field
    And the user clicks on Submit Arrow Button in Board Menu
    Then newly created board "School" should be displayed under All boards

  @B29G3-273
  Scenario: US-005 AC2 TC Verify that User can create a new list of card/task under any board
    When user clicks on board with a name "School"
    And user clicks on Add list button
    And user types "high school" in text field
    And user clicks on addListButtonArrow
    Then user can see newly created list "high school"

  @B29G3-274
  Scenario: US-005 AC3 TC Verify that User can add a new card/task on any list on the current board
    When user clicks on board with a name "School"
    And user clicks on Add card button
    And user types "New Card" in Card Name text field
    And user clicks submit arrow button on Card Menu
    Then user can see "New Card" field on the left side
    Then user can see Details of New Card on the right side

  @B29G3-275
  Scenario: US-005 AC4 TC Verify that User can assign any card/task to himself/herself by using the three dots on the related card
    When user clicks on board with a name "School"
    And user clicks on the three dots menu
    And user clicks on Assign to me option
    Then user profile icon should be displayed near the three dots icon
