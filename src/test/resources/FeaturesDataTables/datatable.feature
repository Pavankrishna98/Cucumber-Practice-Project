Feature: datatable

  Scenario: datatable Testdata for OHRM
    Given open  browser with datatble
    And url passing
    When testdata for username and password
      | username | password |
      | Admin    |    12345 |
      | Admin    |    12345 |
    Then close window
