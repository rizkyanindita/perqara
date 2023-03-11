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
Feature: Register
  
  Scenario: Register ini
  	Given start apps
    When I Want to click button Lanjutkan in onboarding pages
    And I Want to click button Lewati in onboarding pages
    And click button Registrasi
    And click button Nama_Lengkap
    And input text in Nama_Lengkap with Rizky Anindita
    
    Then capture image
    #Then Close application
   