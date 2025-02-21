
Feature: Login Registrar

  Scenario Outline: Registrar with valid credentials
    Given Registrar is on Landing Page1
    Then Registrar Can Check  Textvaladations in Login Page
    When Registrar  Enter valid UN and PWD "<username>" and "<password>" and navigate to Registrar Home Page

    Examples: 
      | username             | password | Case  |
      | bharat@ikcontech.com | Test@123 | Valid |

#Feature:  Registrar Invoice Page



 Scenario Outline: Registrar validatetext and Functionalities in Invoice  Page
   Then Registrar can Navigate to Invoice Page  check "<Domain>" Textvalidations

    Examples: 
      | Domain            |
      | rohantech.bank.in |