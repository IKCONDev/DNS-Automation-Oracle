Feature: Forgot Password

  Scenario Outline: Forgot password
    Given User is on Landing Page
    Then User navigate to Forgot password page
    Then User enters "<username>" and get otp
    Then User enters the OTP
    Then User entes the new "<password>" and confirm "<password>"
    Then User navigate to Login Page
    
    Examples: 
      | username                      | password | Case  |
      | venkatesh.udaru@ikcontech.com | Test@123 | Valid |
