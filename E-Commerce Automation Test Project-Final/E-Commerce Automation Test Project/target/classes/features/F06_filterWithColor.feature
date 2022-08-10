@smoke

Feature: F06_filterWithColor | Logged user could filter with color

  Scenario: User filter products with specific color
    Given user go to category page
    When user select sub-category
    Then user filter products by color
