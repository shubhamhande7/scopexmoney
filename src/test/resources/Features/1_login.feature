Feature: User Login

  @smoke
  Scenario: : Successful Login
    Given User Launch Chrome browser
    When User opens URL "https://scopex.money/Login"
    And User enters Email as "handeshubham29@gmail.com" and Password as "Yaass@123"
    Then Click on Login
