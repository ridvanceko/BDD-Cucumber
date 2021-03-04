Feature: Print Info

  Scenario: Validate Information
    And the user print firstname
    * the user print lastname
    * the user should see the fullname
    And the user print the city