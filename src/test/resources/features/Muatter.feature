

Feature: About Functionality


Scenario: About Us From About Dropdown
 
    Given hover over on the about button
   	When click on the About Us button
   	Then Cheap-as-Chips About Us page will be navigated to. 
   	

Scenario: Buy Now Pay Later From Dropdown After Pay
 
    Given hover over on the about button
   	When click on the Buy Now Play Later button
   	Then click on afterpay
   	Then click on apple afterpay download
   	Then new afterpay window opens 
   	
   	
Scenario: Buy Now Pay Later From Dropdown Zip
 
    Given hover over on the about button
   	When click on the Buy Now Play Later button
   	Then click on Zip
   	Then click on apple zip download
   	Then new zip window opens 
 
Scenario: Terms and Condition From Dropdown
 
    Given hover over on the about button
   	When click on the Legal T&Cs button
   	Then click on Chippie Reward Bar
   	Then click on Product Recall
   	Then click on Disclaimer
   	Then click on Privacy Policy  
   	
Scenario: Shipping and Delivery Information From Dropdown
 
 		Given Search A Production 
 		When click on the production 
 		And Add for Home Delivery then quit
    Given hover over on the about button
   	When click on Shipping and Delivery Information button
   	Then click on the change button
