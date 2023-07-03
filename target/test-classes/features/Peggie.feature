Feature: Login Functionality for Chip As Cheap E-commerce Website

  As a user of the Chip As Cheap website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders

  Background:
    Given I am on the Chip As Cheap home page
    When user clicks on Login

  Scenario: I register the account
    Given I have entered valid information
    And Check the checkbox in the end and press enter to login
    Then User should be logged in and redirected to the home page


  Scenario: Successful login with valid credentials
    Given I have entered a valid username and password
    When I click on the login button
    Then I should be logged in successfully

  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I click on the login button
    Then I should see an error message indicating "<error_message>"

    Examples:
      | username          | password        | error_message                                         |
      | invalid@email.com | invalidPassword | Warning: No match for E-Mail Address and/or Password. |
      | abcccc            | validPassword   | Warning: No match for E-Mail Address and/or Password. |
      | valid@email.com   | abccc           | Warning: No match for E-Mail Address and/or Password. |

  Scenario: Navigating to the forgotten password page
    Given I click on forgot the password? and enter an valid email
    When I click on submit button
    Then I should be redirected to the login page
