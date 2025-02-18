Feature: Login Registrant

  Scenario Outline: Register with valid credentials
    Given User is on Landing Page
    #Then User validating the Landing Page
    #When User navigate to Registration Page
    #Then User Register An Account "<username>" "<password>"
    #When User navigate to Login Page
    Then User enters "<username>" and "<password>"

    Examples: 
      | username                 | password | Case  |
      | venkateshl@ikcontech.com | Test@123 | Valid |

  Scenario Outline: DSC clear with valid data
    And User enters the dsc details

  Scenario Outline: Application Page
    Then User Navigate to Application Page
    Then User Validate Application Page
    Then User Navigates the Domain Applications Details page
    Then User validate the Domain Applications Details page
    And User subit the Domain Applications Details page
