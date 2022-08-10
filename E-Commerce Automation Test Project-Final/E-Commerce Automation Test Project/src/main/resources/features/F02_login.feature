@smoke
Feature: F02_login | Users can use login functionality to open their accounts
Background: navigate to browser

  Scenario: User could login with valid email and password
    Given user go to login page
    When user login with valid email and password
    And user press on login button
    Then user login to the system successfully

  Scenario Outline: User can Follow using "<site>"
    When click on follow us "<site>"
    Then "<url>" opened successfully
    Examples:
    |site|url|
    | facebook   |  https://www.facebook.com/nopCommerce |
    |   twitter         | https://twitter.com/nopCommerce  |
    |      youtube      |  https://www.youtube.com/user/nopCommerce   |


