Feature: Winter Warmers

Background:
	Given the user is on the Home page of the Cheap As Chips URL
	When the user clicks Winter Warmers from the navigation bar
	
	
  Scenario: Click on a product in the WInter Warmers section
  	When the user clicks on a product in the Winter Warmers
  	Then the user should be able to see only the WW product with its information.
  	
  Scenario: Click on a specific Category to view its Products	in the Winter Warmers
    When the user clicks on the Appliances Category in the Winter Warmers
    Then the user should be able to see the products from the Appliances Category in WW
  
  Scenario: Click on a specific Brand to view its Products in the Winter Warmers
	  When the user clicks on the Germanica Brand in the Winter Warmers
	  Then the user should be able to see the products from the Germanica Brand
  
   