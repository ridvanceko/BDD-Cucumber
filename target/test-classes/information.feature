Feature: Print personal information

#In cucumber we have only three annotation for the steps which is GIVEN, WHEN and THEN
  Scenario: Print info
    Given the user print firstname
    When the user print lastname
    Then the user should see the fullname
    And the user print city
    And the user print state
    * the user print age
    But the user should see the school name
