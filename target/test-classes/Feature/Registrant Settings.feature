Feature: Registrant Onboarding

  Scenario Outline: Login valid credentials
    Given User is on Landing Page
    Then User enters "<username>" and "<password>"

    Examples: 
      | username                    | password | Case  |
      | venkateshl@ikcontech.com | Test@123 | Valid |
 
 		Scenario Outline: DSC clear with valid data
    And User enters the dsc details
    
     Scenario Outline: User Management
    Then User navigate to user management page
    Then User Validate the user management page
         
    Scenario Outline: Officer Details Management
    Then User navigate to officer details management page
    Then User Validate the officer details management page
    
    
    
    