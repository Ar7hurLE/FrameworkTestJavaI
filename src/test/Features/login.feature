#Author: Arthur Lourenco Elias


Feature: feature to test login functionality

  @smoke
  Scenario Outline: Check login is successful with valid credentials

    Given user is on login page
    And user enters <username> and <password>
    When clicks on login button
    Then user is navigated to the home page

    Examples:
      |username | password|
      |test     |12345    |
      |joa      |12345    |


