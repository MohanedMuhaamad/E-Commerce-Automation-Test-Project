@smoke
Feature: F04_search | Logged User can search for any product

  Scenario: User can search for product using his/her full name
    When user clicks on search field
    And user search with name of product
    Then user could find relative results

  Scenario: User could make advanced search
    Given user choose advanced search
    When user choose specific category
    Then user choose manufacturer
    And user click on search button
