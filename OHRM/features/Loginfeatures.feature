Feature:Login

   
	Scenario: Succsesfully Login with valid gredintial
	Given User Launch chrome Browser
	When  User open URL "http://admin-demo.nopcommerce.com/login"
	And User enter email as "admin@yourstore.com" and password as "admin"
	And User click on Login


