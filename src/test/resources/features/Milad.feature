Feature: Search Functionality

Background:
    Given the user is on the Home page for Search Functionality
      When the user write the desired item on search box
        

#
          Scenario: search for an item
      And click on the desired item
      Then the user should be able to see the item
      
      
      Scenario: select specific category
      When the user gets the search result
      And mark the desired category
      And click on the desired item
      Then the user should be able to see the result of seleced category
      
      
      Scenario: select specific Brand
      When the user gets the search result
      And mark the desired brand
      And click on the desired item
      Then the user should be able to see the result of seleced brand
      
      Scenario: slider test for search
      When the user adjust the slider to specific price
      Then the user should be able to see the result for selected price