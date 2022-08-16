Feature: Sign in feature

  @Smoke
  Scenario: Sign in into monster job portal
    Given User is in login Page
    When User click on jobseeker login button
    When User enter credential
      | Value | Email          | Password |
      |     0 | Test@gmail.com | Cap      |
    When User enter enabled login button.
