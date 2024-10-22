Feature: Login to OHRM Functionlity
 

  @Regression
  Scenario: Succsesfully Login with valid gredintial
	Given User Launch chrome Browser
	When  User open URL 
	And Admin user should be login with valid data
	|username|password|
		|Admin|admin123|
	And User click on Login
	And User should have his name in welcome note
	And close Browser