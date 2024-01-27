Feature: to login into a page and display internal features

  Background: 
    Given open the browse of choice
    When enter URL and enter into login page
    And pass the credentials username and password into the provided fields
    And then enter into home page for required functionalities

  Scenario: 
    Given click leave option
    And verify and closed site

  Scenario: 
    Given click Time option
    And verify and closed this site
