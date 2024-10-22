
Feature: Login to OHRM Functionlity
 

  @Regression
  Scenario: Succsesfully Login with valid gredintial
	Given User Launch chrome Browser
	When  User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And User enter email as "Admin" and password as "admin123"
	And User click on Login
	And User should have his name in welcome note
	And close Browser
	
	@Smoke
	Scenario: Verify Login with Invalid gredintial
	Given User Launch chrome Browser
	When  User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And User enter email as "Admin" and password as "admin1234"
	And User click on Login
	And User should have get errMsg
  And close Browser
  
  