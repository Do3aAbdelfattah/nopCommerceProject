
Feature: homeSliders Feature
  Scenario: first slider is clickable on home page
    When user clicks on first slider
    Then user is redirected to the first slider's URL

  Scenario: second slider is clickable on home page
    When user clicks on second slider
    Then user is redirected to the second slider's URL