Feature: Workgroup function

  User story:
  As a user,I should be able to login with valid credentials.
  User should not be able to join a group without sending a request


  ##Background: Then user should see "Request has been sent" message

  @APCRM-296
  Scenario: User should not be able to join a group without sending a request
    Given user is enter "hr1@cybertekschool.com" and "UserUser"
    And user should see home page
    Then user should click the Workgroups button
    When user click the join button under New Corporate Identity project
    When user click the join button under New company web site development
    When user click the join button under New product development
    When user click the join button under PR and advertising
    When user click the join button under Sales
    When user click the join button under Technology


  @APCRM-340
  Scenario:  Users should be able to sort groups.
    Given user is enter "hr1@cybertekschool.com" and "UserUser"
    And user should see home page
    Then user should click the Workgroups button
    Then user should click the SortBy button
    Then user can click ABC order button
    Then user can click Last viewed button
    Then user can click Time joined button
    Then user can click Number of members button
    Then user can click Last active button
    Then user can click Time created button




