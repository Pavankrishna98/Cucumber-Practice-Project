Feature: demo guru99 login validaion with valid data and multiple data

  Scenario Outline: verify guru99login page by passing username, password and login button
    Given open browser(edge)
    When open website by using page URL
    And pass valid credentials to "<username>" and "<password>" fields
    And click on login button

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mercury  | mercury  |
