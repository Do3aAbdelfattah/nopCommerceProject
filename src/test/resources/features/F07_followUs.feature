
Feature: F07_followUs | users could open followUs links
  Background:
    When user is in home page

  Scenario: user opens facebook link
    When user clicks on facebook follow up icon
    Then "https://www.facebook.com/nopCommerce" is opened in new tab

  Scenario: user opens twitter link
    When user clicks on twitter follow up icon
    Then "https://twitter.com/nopCommerce" is opened in new tab

  Scenario: user opens youtube link
    When user clicks on rss follow up icon
    Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

  Scenario: user opens youtube link
    When user clicks on youtube follow up icon
    Then "https://www.youtube.com/user/nopCommerce" is opened in new tab

