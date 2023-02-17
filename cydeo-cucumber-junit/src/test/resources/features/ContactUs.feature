
@Contact
Feature: Contact Us Test

  Scenario: Go to website and test Contact Us Page

    Given Navigate to website
    Then Click on contact us button
    And Type Name
    And Type Email
    Then Type Subject
    And Type a Message
    When Click on Submit button
    Then Verify success message