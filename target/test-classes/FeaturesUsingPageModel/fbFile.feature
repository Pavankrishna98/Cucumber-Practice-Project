Feature: login to fb page using crdentials

  Scenario Outline: to pass uasename and password and click login
    Given open any browser
    When login to fb page using URL
    And pass "<username>" and "<password>" to respective fields
    And click Login button
    And close browser

    Examples: 
      | username | password  |
      | user1    | user1@abc |
      | user2    | user2@abc |
