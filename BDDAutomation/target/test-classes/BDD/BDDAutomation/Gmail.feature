#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Amazon.in login chk

@tag1
Scenario: Amazon.in login
Given Open Amazon.in login page
Then Enter userid
And click on continue button
Then Enter password
And click on  Login button	
Then click on sign out link

@tag2
Scenario: Check title of Amazon.in 
Given Open Amazon.in login page
Then Get the title of page
And Verify title of page


