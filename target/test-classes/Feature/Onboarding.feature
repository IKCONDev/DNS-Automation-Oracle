Feature: Registrant Onboarding

  Scenario Outline: Register with valid credentials
    Given User is on Landing Page
    #Then User validating the Landing Page
    #When User navigate to Registration Page
    #Then User Register An Account "<username>" "<password>"
    #When User navigate to Login Page
    Then User enters "<username>" and "<password>"

    Examples: 
      | username             | password | Case  |
      | sravan@ikcontech.com | Test@123 | Valid |

  Scenario Outline: DSC clear with valid data
    And User enters the dsc details

  #Scenario Outline: onboarding page
    #Then User enters domain page "<domain>"
    #Then User enters organisation details "<Name>" "<PIN>" "<Address>" "<Tel>" "<Mob>" "<Email>" "<GST>" "<PAN>" "<License>"
#
    #Examples: 
      #| domain | Name  | PIN    | Address               | Tel        | Mob        | Email          | GST             | PAN        | License               |
      #| teslao  | tesla | 500090 | CYBERTOWERS,HEDERABAD | 9685578941 | 9685578945 | foya@gmail.com | 22ABCDE0000A1J5 | ASDEE4455Q | L12345MH2023PLC000001 |
#
  #Scenario Outline: admin contact details page
    #Then User enters admin contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"
#
    #Examples: 
      #| Name   | Tel        | Mob        | Email          | Aadhar         | PAN        | Desig   |
      #| prasad | 9685578942 | 9685578946 | hoya@gmail.com | 1234 5678 8012 | ASDEE4455L | Manager |
#
  #Scenario Outline: Technical contact details page
    #Then User enters technical contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"
#
    #Examples: 
      #| Name   | Tel        | Mob        | Email          | Aadhar         | PAN        | Desig     |
      #| srivas | 9685578943 | 9685578947 | poya@gmail.com | 1234 5678 7012 | ASDEE4455P | Assig Mng |
#
  #Scenario Outline: Billing contact details page
    #Then User enters billing contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"
#
    #Examples: 
      #| Name  | Tel        | Mob        | Email           | Aadhar         | PAN        | Desig    |
      #| raman | 9685578954 | 9685578948 | tooya@gmail.com | 1234 5678 5012 | ASDEE4455P | Accounts |
#
  #Scenario Outline: Name server details page
    #Then User enters name server details "<NS1>" "<IP1>" "<NS2>" "<IP2>"
#
    #Examples: 
      #| NS1     | NS2     | IP1        | IP2        |
      #| Office1 | office2 | 1.10.10.10 | 1.10.10.20 |
#
  #Scenario Outline: Preview and Submit
    #Then User preview and submit onboarding

  Scenario Outline: Application Page
    Then User Navigate to Application Page
    Then User Validate Application Page
    Then User Navigates the Domain Applications Details page
    Then User validate the Domain Applications Details page
    And User subit the Domain Applications Details page

  Scenario Outline: Domain Page
    Then User Navigate to Domain Page
    Then User Validate Domain Page
    Then User Navigates the Domain Details page
    Then User validate the Domain Domain Details page
    And User subit the Domain Details page

  Scenario Outline: User Management
    Then User navigate to user management page
    Then User Validate the user management page

  Scenario Outline: Officer Details Management
    Then User navigate to officer details management page
    Then User Validate the officer details management page
