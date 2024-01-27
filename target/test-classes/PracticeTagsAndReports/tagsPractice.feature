Feature: 

  Background: open browser and url
    Given open the required browser
    When pass the url to be opened

  @valid_test
  Scenario: to pass valid credentials and click login
    Given pass the valid credentials and click login

  @invalid_test
  Scenario: to pass invalid credentials and login
    Given pass the invalid credentials and click login

  @null_test
  Scenario: to pass null and click login
    Given pass the null credentials and click login

