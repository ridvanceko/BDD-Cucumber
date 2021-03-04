Feature: Ebay search functionality

  Scenario: Search for iMac 2021
    Given user is on ebay home page
    When user searches for iMac 2021
    Then user sees results about iMac only
    And there are more than 3 pages of results

