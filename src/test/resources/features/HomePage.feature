Feature: HomePage feature 

Background: 
Given User click on Login Button
When User is already logged  into application  	
|UserName|PassWord|
|kaushik.ku90@gmail.com|Sid@12345|
|tet11|test22|

Scenario: Verify Header of Home Page
Given User is an Home Page
Then User get Header Sections
|All Jobs|
|Work From Home|
|Covid-19 Resources|
|Contract Jobs|
|Fresher Jobs|

And Header count is 7