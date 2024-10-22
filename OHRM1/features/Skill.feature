
Feature: Add Edit Delete Skill

	Background:
	Given User Launch chrome Browser
	When  User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
   
  Scenario: Add Skill
#	Given User Launch chrome Browser
#	When  User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And User enter email as "Admin" and password as "admin123"
	And User click on Login
	And User should have his name in welcome note
	When  User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSkills"
	And user click on Add
	And User Enters skill name
	And User click on save button
	Then Skill should be added skill button
	
	Scenario Outline: Edit Skill
	
#	Given User Launch chrome Browser
#	When  User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And User enter email as "<username>" and password as "<password>"
	And User click on Login
	And User should have his name in welcome note
	When  User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSkills"
	And select skill for edit
	And clear the the textbox field
	And enter the new data
	Then Skill should be edited
	
	Examples: 
      | username  | password | 
      | Admin |     admin123 |
	
	
	
	Scenario: Delete Skill
#	Given User Launch chrome Browser
#	When  User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Admin user should be login with valid data
	|username|password|
		|Admin|admin123|
	And User click on Login
	And User should have his name in welcome note
	When  User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSkills"
	And select skill for delete
	And click on Yes delete option
	Then Deleted skill succsefully 
  
  