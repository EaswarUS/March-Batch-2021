@file 
Feature: CreateLead testCase 

#Background:
#Given Open the chrome browser
#And Load the application url


Scenario: TC_001 Creating A Sample Lead 
	Given Load the application Url 
	Given Enter the Username as 'Demosalesmanager' 
	Given Enter the Password as 'crmsfa' 
	And Click on login button 
	And Click on CRMSFA link 
	And Click on Leads button 
	And Click on Create Leads button 
	And Enter company as TestLeaf 
	And Enter FirstName as Easwar 
	And Enter SecondName as US 
	And Enter number as 9080512768 
	When Click the Submit button 
	
	
	