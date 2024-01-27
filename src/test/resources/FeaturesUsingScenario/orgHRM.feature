Feature: orange hrm login validaion with valid data

  Scenario: verify login page by passing username, password and login button
    Given open browser
    When open website by using URL
    And pass valid credentials to username and password
    And click login button
