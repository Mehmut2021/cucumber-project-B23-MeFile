
@wip
Feature: Google Search

  As a user ,
  I should be able to search by keyword
  and get my result

  Background:
    Given user is at home page

  Scenario: User search by keyword
    When user search for keyword "selenium"
    Then we should see result page
    And the title should start with "selenium"


  Scenario: User search by keyword
    When user search for keyword "Space"
    Then we should see result page
    And the title should start with "Space"