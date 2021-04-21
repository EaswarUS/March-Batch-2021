@file
Feature: Login functionality in leaftaps application


#Background:
#Given Open Chrome Browser
#And Load the application Url

Scenario Outline: TC001 Login with positive credential
Given Load the application Url
Given Enter the Username as <username>
And Enter the Password as <password>
When Click on login button
Then Home page should be displayed

Examples:
|username|password|
|'DemoCSR'|'crmsfa'|
|'Demosalesmanager'|'crmsfa'|

Scenario: TC002 Login with negative credential
Given Load the application Url
Given Enter the Username as 'DemoCSR'
And Enter the Password as 'crmsfajjj'
When Click on login button
But Error message should be displayed