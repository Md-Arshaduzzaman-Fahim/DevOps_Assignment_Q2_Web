Feature: Search functionality test

	Scenario: Search bar should work
		Given I am present on home page
		When I search something
		Then I should go to the search page
		
		
	Scenario: Search page weblist number should match expected
		Given I am on search page
		Then Web list number should match expected
		
		
	Scenario: Image tab should be there
		Given I am on search page
		Then there should be an image tab 		