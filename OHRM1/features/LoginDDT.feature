
Feature: Login to OHRM Functionlity
  @Sanity @Regression
  Scenario Outline: Succsesfully Login with valid gredintial
  Given User Launch chrome Browser
	When  User open URL 
	And User enter email as "<username>" and password as "<password>"
	And User click on Login
	And close Browser
    

    Examples: 
      | username  | password | 
      | Admin |     admin123 | 
      | Admin |    admin1234 |
