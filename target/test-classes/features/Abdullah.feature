Feature: Products

Background:
	Given the user is on the Home page
	When the user hovers over Products in Navigation Bar
	
	
  Scenario: Change Store and Click and Collect elements
  	When the user clicks on Clothing section and selects the clothing Item
  	And clicks on the Change Store and Changes their location
  	And Click & Collect Item for their designated location
  	Then the user should be able to see their store location on the top right.
   
  
  Scenario: Add and remove an item from cart
    When the user clicks on Clothing section and selects the clothing Item
    And the user adds the item to their cart and then close the popup
  	And views the cart and then removes the item from there
  	Then the user should see a message that the Cart is empty
  	
    
   Scenario: View items in Grocery Section from only Grocery Category and Cavendish and Harvey Brand
    When the user clicks on Grocery section
    And the user selects Grocery from the Category
  	And the user selects Cavendish and Harvey from the brand
  	Then the user should see the Products only from the selected options
  	
  	
  Scenario: Slider Test in Electrical section of Products
    When the user clicks on Electrical section
    And the user uses the Slider and the max/min prices textboxes to adjust the high and low Price
  	Then the user should see the Products only from the selected price range
  		 