Feature: Etsy Search Functionality

  Scenario: Validation of etsy search
    Given the user navigates to "url"
    When the user search with "searchValue"
    Then the user should see the title "titleOfThePage"

