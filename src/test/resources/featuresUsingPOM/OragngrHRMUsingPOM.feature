Feature: to login into home page of orange HRM by passing cretentials

  Scenario Outline: 
    Given open any browser(chrome)
    When open page using URL
    And pass credentials "<uname>" and "<pwd>"
    And click login button on page used pom
    And click my_info
    And close site

    Examples: 
      | uname | pwd      |
      | Admin | admin123 |
      | Admin | admin123 |
