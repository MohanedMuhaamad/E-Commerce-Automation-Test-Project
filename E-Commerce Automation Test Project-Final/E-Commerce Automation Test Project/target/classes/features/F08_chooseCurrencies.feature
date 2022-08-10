@smoke
Feature:F08_chooseCurrencies | Logged User can choose between currencies

  Scenario: User can choose between currencies Euro/US
    When user click on currencies list
    Then user change the currency
    And currency changed successfully