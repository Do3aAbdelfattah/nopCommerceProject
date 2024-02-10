
Feature: Wishlist Feature
  Scenario: verify that user can click on wishlist button of any product
    When user clicks on Add-to-wishlist icon on product "HTC One M8 Android L 5.0 Lollipop"
    Then success message "The product has been added to your wishlist" appears with green background color

    Scenario: verify that selected product added successfully in the wishlist page
      When user clicks on Add-to-wishlist icon on product "HTC One M8 Android L 5.0 Lollipop"
      And user clicks on Wishlist Tab on the top of the page
      Then user gets the added product in wishlist page