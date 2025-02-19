Feature: Login Registrar

  Scenario Outline: Registrar with valid credentials
    Given Registrar is on Landing Page
    Then Registrar Can Check Textvaladations in Login Page
    When Registrar  enter "<username>" and "<password>" and navigate to Registrar Home Page

    Examples: 
      | username             | password | Case  |
      | bharat@ikcontech.com | Test@123 | Valid |