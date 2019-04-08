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
Feature: To test add customer

 
  @tag1
  Scenario: To test customer ID generation
    Given The user is in add customer page
    
    When The user fill in the customer details
    |fname|lname|email|addr|telephno|
    |priya|mani|test@gmail.com|chennai|3635383|
    |mani|priya|test1@gmail.com|chennai-omr|6276323|
    |hello|world|test2@gmail.com|chennai-tbm|6782632|
     
     When The user clicks the submit button
    Then The user should see the Customer ID generated

  