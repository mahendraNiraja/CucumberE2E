Feature: Login page feature

@Smoke
Scenario: Login page title
Given  User is in login Page
When  User get Title of Page
Then  Page title shoul be "Job Vacancy - Latest Job Openings - Job Search Online - Monster India"
@Regression
Scenario: Login with currect credential
Given User is in login Page
When User click on Login Button
When  User enter Username "kaushik.ku90@gmail.com"
And  user enter password "Sid@12345"
And  Click on login button
Then  User get Title of Page
Then  Page title shoul be "Job Vacancy - Latest Job Openings - Job Search Online - Monster India"
