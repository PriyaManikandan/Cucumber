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
Feature: To test add customer page
 
  @tag1
  Scenario: To test the add customer page with all the fields as empty
    Given The Customer is in add customer page
    When The user click the submit button without filling any fields
    Then The user should get the alert message
    
   @tag2
   Scenario:To test the add customer page with invalid fields
   Given The Customer is in add customer page
   When The user click the submit button with invalid data's
   Then The user should get the error message
   