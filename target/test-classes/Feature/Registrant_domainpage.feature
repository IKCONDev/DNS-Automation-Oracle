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

  Scenario Outline: Domain Page
    Then User Navigate to Domain Page
    Then User Validate Domain Page
    Then User Navigates the Domain Details page
    Then User validate the Domain Domain Details page
    And User subit the Domain Details page
