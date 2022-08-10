@smoke
Feature:F05_addToWishlist | Logged user could add different products to wishlist

  Scenario: Add to wishlist
    Given user could select a product
    When user can add product to Wishlist
    Then product added to Wishlist successfully
