@smoke
Feature:F03_resetPassword | User can reset her/his password successfully

  Scenario: Success message appear after user reset her/his password
    Given user go to account page
    And user choose change password
    When user enter new password
    And user press on change password button
    Then user changed password successfully
