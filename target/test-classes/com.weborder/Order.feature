Feature: WebOrder Page Food Order

  Scenario: Validation of Food Order For Office
    Given the user is on weborder home page
    Then the user select the office option
    And the user is on the group order page
    Then the user sen invitees note "Test"
    And the user send invite list "kushal@gmail.com" and "priyanka@gmail.com
    And the user validate "View Group Order" text