@smoke
Feature:F10_addToCompareList | Logged user can add different products to compare list

  Scenario: Add to compare list
    Given user select a product
    When user can add product to compare list
    Then product added to compare list successfully
