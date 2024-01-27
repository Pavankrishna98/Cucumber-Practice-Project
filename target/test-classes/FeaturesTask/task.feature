Feature: Login Feature

  Scenario Outline: Login with Valid, Invalid, and Null Credentials
    Given I am on the login page
    When I enter credentials "<username>" and "<password>"
    Then I should "<expectedOutcome>" be logged in

    Examples: 
      | username     | password    | expectedOutcome |
      | Admin        | admin123    | should          |
      | invalidUser1 | invalidPass | should not      |
      |              |             | should not      |
