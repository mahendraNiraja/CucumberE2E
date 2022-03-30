Feature: Login page feature
Scenario: Login page title
Given  User is in login Page
When  User get Title of Page
Then  Page title shoul be "an?"

Scenario: Login with currect credential
Given Login page title
When  User enter Username
And  user enter password
And  Click on login button
Then  User get Title of Page
Then  Page title shoul be "an?"
