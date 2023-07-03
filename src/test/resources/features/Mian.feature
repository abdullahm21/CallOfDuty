Feature: My Account and Login

Background:
    Given the user is on the Home page of the website
    When the user clicks on Login


      Scenario: Create an Account
      When enters the required information
      And selects the checkbox in the end of info entered and press enter to login
      Then the user should be logged in and redirected to the home page

      Scenario: Login the account
      When the user enters the valid email
      And the user enters a valid password and press enter to login
      Then the user should be logged in and redirected to the Account Info Page

      Scenario: Login the Account with invalid email
      When the user enters an invalid email
      And the user enters a valid password and press enter to login
      Then the user should see an error message saying Invalid email or password