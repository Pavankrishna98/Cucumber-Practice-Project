Feature: login page verifiying with valid and and invalid data

  Scenario Outline: verify login page
    Given open any browser of choice
    When pass the url of page to be opened
    And enter "<username>" and "<password>" into respective fields
    And press login button
    And verify bi taking screenshot and print statement
    And close the browser

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | asdf     | ghjkl    |
      |          |          |
