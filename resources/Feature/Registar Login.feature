Feature: Login Registrant

  Scenario Outline: Register with valid credentials
    Given User is on Registar Landing Page
    Then User validating the Landing Page
    Then User enters "<username>" and "<password>"

    Examples: 
      | username             | password | Case  |
      | bharat@ikcontech.com | Test@123 | Valid |
