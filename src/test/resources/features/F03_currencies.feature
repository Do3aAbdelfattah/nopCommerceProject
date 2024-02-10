
Feature: Currencies Feature
  Scenario: verify that Euro Symbol is shown on products when it is selected from currency dropdown list
    When user Select Euro currency from the dropdown list in home page
    Then Euro Symbol (€) is shown on the four products displayed in Home page