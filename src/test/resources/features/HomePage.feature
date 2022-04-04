Feature: HomePage feature 

Background: 
Given User click on Login Button
When User is already logged  into application  	
|UserName|PassWord|
|kaushik.ku90@gmail.com|Sid@12345|

Scenario: Verify Header of Home Page
Given User is an Home Page
Then User get Header Sections
|as|

And Header count is 7