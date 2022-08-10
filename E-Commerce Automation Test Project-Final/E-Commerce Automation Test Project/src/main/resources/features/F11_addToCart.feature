@smoke
Feature: F11_addToCart | Logged user can add different products to shopping cart

  Scenario: User add products to cart
    Given user can select a product
    When user can add product to shipping cart
    And product added to cart successfully

  Scenario: User edit shopping cart
    Given user open shopping cart
    When User can change product quantity in shipping cart
    Then User can delete product from shipping cart