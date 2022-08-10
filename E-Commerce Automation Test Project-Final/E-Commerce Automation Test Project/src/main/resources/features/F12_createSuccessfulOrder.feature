  @smoke
Feature: F12_createSuccessfulOrder | Logged user can create successful order

  Scenario: User can create successful order
    Given go to shopping cart
    And accept the terms of service
    When click on check out button
    And Update address information
    Then confirm order
    And order completed successfully
