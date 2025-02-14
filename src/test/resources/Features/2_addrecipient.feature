Feature: AddRecipient

  @smoke
  Scenario: : AddRecipient
    Given User click on Recipients Dropdown and click on Recipient list
    When click on AddRecipient
    And the user enters the Recipient Name "shubham"
    And the user enters the Recipient Nick Name "shubham"
    And the user enters the Bank Account Number "1234567891234567891"
    And the user enters the IFSC Code "SBIN0040288"
    Then the click on Submit button

  @smoke
  Scenario: : Logout
    Given Click on profile
    When User click on logout button
    Then User should be logout
