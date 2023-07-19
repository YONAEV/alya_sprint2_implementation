@B29G3-302
Feature: Search file and view file details

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee85" and password as "Employee123"


  @B29G3-299
  Scenario: User searches for a file and views file details
   #User can search file typing its name through the magnifying glass icon
     # inside any Module and see the details side page of the file when clicked on it.
    When the user navigates to "Deck" module page
    And the user clicks the magnifying glass icon
    And the user enters "Talk" in the search input field inside any Module
    And the user clicks "Talk" under the file options
    Then the user should see the "Talk" details side page

  @B29G3-300
  Scenario: User can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page

    When user click the App icon
    Then  user should see "Dashboard - Symund - QA" in title