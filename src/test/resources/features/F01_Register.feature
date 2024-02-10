@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user can register with valid data successfully
    Given user goes to register page
    When user selects gender type
    And user enters first name "automation" and last name "tester"
    And user enters date of birth
    And user enters email field "test@example.com"
    And user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And user clicks on register button
    Then success message is displayed
