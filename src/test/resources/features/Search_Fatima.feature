@Search
Feature: Search file and view file details

  Scenario: User searches for a file and views file details
    Given the user is already on the Dashboard page
    When the user clicks the magnifying glass icon
    Then the user enters "Readme.md" in the search input field inside any Module
    #Then the user should see the "Readme.md" details side page