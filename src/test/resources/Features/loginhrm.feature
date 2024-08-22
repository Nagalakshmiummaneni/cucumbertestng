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
Feature: login into orangehrm

  @tag1
  Scenario Outline: testing login page of orangehrm 
    Given user should open any browser
    And user should be on login page of orangehrm
    When enter <user> and <password>
    And click login button
    Then user must be on home page
    And check title of home page is correct



    Examples: 
      | user  | password | 
      | Admin |     admin123|
      | admin |     admin123 | 
      |admin1|admin123|
