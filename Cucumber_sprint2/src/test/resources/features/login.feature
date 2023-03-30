Feature: Login function

  User story:
  As a user,I should be able to login with valid credentials to
  different accounts.

  @Valid
  Scenario Outline: User should be login with valid credentials
    Given user is enter "<login>" and "<password>"
    Then user should see home page

    Examples: Valid credentials
      | login                         | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |




  @Invalid
  Scenario Outline: User should not be login with invalid credentials
    Given user is enter "<login>" and "<password>"
    Then user should see error message

    Examples: Invalid credentials
      | login                         | password |
      | hr@cybertekschool.com         | UserUser |
      | helpdesk1@cybertekschool.com  | asdfgg   |
      | marketing1@cybertekschool.com |          |
      |                               | UserUser |

