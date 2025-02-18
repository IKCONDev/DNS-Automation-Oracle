Feature: Login Registrant
    

  Scenario Outline: Register with valid credentials
    Given User is on Landing Page
    Then User validating the Landing Page
    When User navigate to Registration Page
    Then User Register An Account "<username>" "<password>"
    When User navigate to Login Page
    Then User enters "<username>" and "<password>"

    Examples: 
      | username        | password | Case  |
      | dnsas@gmail.com | Test@123 | Valid | 

  