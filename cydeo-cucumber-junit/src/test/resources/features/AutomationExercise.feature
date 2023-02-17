@Automation_Exercise
Feature: Contact Us Form

  Scenario: Go to website and test Contact Us Form

    Given Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    And Click on 'Contact Us' button
    And Verify 'GET IN TOUCH' is visible
    Then Enter name, email, subject and message
    And Upload file
    When Click 'Submit' button
    Then Click OK button
    And Verify success message 'Success! Your details have been submitted successfully.' is visible
    Then Click 'Home' button and verify that landed to home page successfully

