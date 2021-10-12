Feature: Demonstrating the data table feature of cucumber

  Scenario: Petting zoo
    Given I have a "horse"
    And I have a "dog"
    And I have a "turtle"
    And I have a "zebra"
    When I call their names
    Then They come to me

  Scenario: Pettig zoo with table
    Given I have a following animals

      | horse  |
      | dog    |
      | turtle |
      | zebra  |
    When I call their names
    Then they come to me.

