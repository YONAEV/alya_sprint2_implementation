@B29G3-297
Feature: Upload/Edit/Delete File Module Functionality

	Background:
		#@B29G3-295
		    Given the user is on the login page
		    And the user logged in with username as "Employee45" and password as "Employee123"

		


	@B29G3-283
	Scenario: AC01-TC01 Verify user can upload a file
		When user navigates on "Files" module page
		Then user clicks on add button
		And uploads file
		Then file should appear on the list	

	@B29G3-284
	Scenario: AC02-TC02 Verify user can create new folder
		When user navigates on "Files" module page
		Then user clicks on add button
		And user creates new folder
		And user name the folder
		Then new folder should appear on the list	

	@B29G3-285
	Scenario: AC03-TC03 Verify user can delete from three dots menu
		When user navigates on "Files" module page
		Then user clicks on three dots of selected item
		And  clicks on delete folder or file
		Then file should no longer be part of displayed list	


	@B29G3-286
	Scenario: AC04-TC04 Verify user can see total numbers of files and folders
		When user navigates on "Files" module page
		Then user verify number of items match displayed number of folders and files
