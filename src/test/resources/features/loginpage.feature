Feature: Login functionality for Ajkerpatrika
  
  Scenario: forgot password link and register link should be there
		Given I have entered login page
		Then register link should be there
		And forgot password link should be there
	
	
	
	Scenario: Successful login with valid credentials
		Given I have entered login page
		When I enter email and password
		Then I should be logged in successfully
		
		
		
	 	