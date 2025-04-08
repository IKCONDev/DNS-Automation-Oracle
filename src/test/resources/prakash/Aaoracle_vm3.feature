Feature: Registrant Onboarding

  @1stStep
  Scenario Outline: Registrant Registration and login
    Given User is on Landing Page
    Then User validating the Landing Page
    When User navigate to Registration Page
    Then User Register An Account "<username>" "<password>"
    When User navigate to Login Page
    Then User enters "<username>" and "<password>"

    Examples: 
      | username                      | password | Case  |
      | prakash@quaality.com | Test@123 | Valid |
  #Scenario Outline: Onboarding Page
    #Then User enters domain page "<domain>"
    #Then User enters organisation details "<domain>" "<PIN>" "<Address>" "<Tel>" "<Mob>" "<Email>" "<GST>" "<PAN>" "<License>"
#
    #Examples: 
      #| domain           | PIN    | Address                                  | Tel        | Mob       | Email  | GST             | PAN        | License               |
      #| zwsaedmgarfullly | 500090 | CYBERTOWERS,Madhapur,HEDERABAD,Telangana | 9876542132 | 987654321 | ikcon@ | 22ABCDE0000A1J5 | ASDEE4455Q | L12345MH2023PLC000001 |
#
  #Scenario Outline: Admin Contact details
    #Then User enters admin contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"
#
    #Examples: 
      #| Name   | Tel        | Mob       | Email   | Aadhar         | PAN        | Desig   |
      #| prasad | 9685570942 | 968557894 | ikcon1@ | 1234 5678 8012 | ASDEE4455L | Manager |
#
  #Scenario Outline: Technical contact details
    #Then User enters technical contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"
#
    #Examples: 
      #| Name   | Tel        | Mob       | Email   | Aadhar         | PAN        | Desig     |
      #| srivas | 9685578903 | 968557894 | ikcon2@ | 1234 5678 7012 | ASDEE4455P | Assig Mng |
#
  #Scenario Outline: Billing contact details page
    #Then User enters billing contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"
#
    #Examples: 
      #| Name  | Tel        | Mob      | Email   | Aadhar         | PAN        | Desig    |
      #| raman | 9685578904 | 96855789 | ikcon3@ | 1234 5678 5012 | ASDEE4455P | Accounts |
#
  #Scenario Outline: Name server details
    #Then User enters name server details "<NS1>" "<IP1>" "<NS2>" "<IP2>" "<NS3>" "<IP3>" "<NS4>" "<IP4>"
#
    #Examples: 
      #| NS1     | NS2     |  | NS3     | NS4     | IP1         | IP2         | IP3         | IP4         |
      #| Office1 | office2 |  | Office3 | office4 | 19.42.21.35 | 19.43.28.36 | 19.44.29.39 | 19.45.27.38 |
#
  #Scenario Outline: Preview and Submit
    #Then User preview and submit onboarding
#
  #@2ndStep
  #Scenario Outline: Registrar Login Page
    #Given Registrar is on Landing Page1
    #Then Registrar Can Check  Textvaladations in Login Page
    #When Registrar  Enter valid UN and PWD "<username>" and "<password>" and navigate to Registrar Home Page
#
    #Examples: 
      #| username             | password | Case  |
      #| bharat@ikcontech.com | Test@123 | Valid |
#
  #Scenario Outline: Registrar Application  Page
    #Then Registrar Navigate to Application Page  check  Textvalidations
    #Then Registrar Navigate to Application Page  check Tabledata Textvalidations
    #Then Registrar Navigate to Application Page  check  OrganisationDetails Textvalidations
    #Then Registrar  check DocumentsUpload Functionalities in Applications Page
    #Then Registrar  check AdministrativeOfficier Functionalities in Applications Page
    #Then Registrar  check TechnicalOfficier Functionalities in Applications Page
    #Then Registrar  check BillingOfficier Functionalities in Applications Page
#
    #Examples: 
      #| OrgName     | ADocument Type | PDocument Type | OrgDocument Type | DomainName     |
      #| Canara Bank | Aadhaar        | PAN            | Organisation Id  | canara.bank.in |
#
  #@3rdstep
  #Scenario Outline: Registrant Registration and login
    #Given User is on Landing Page
    #Then User enters registrant credentials
#
  #Scenario Outline: DSC Verify
    #And User enters the dsc details
#
  #Scenario Outline: Registrant Application Page
    #Then User Navigate to Application Page
    #Then User payment and upload recipt
    #Then User logout  application
#
  #@4thstep
  #Scenario Outline: Registrar Login Page
    #Given Registrar is on Landing Page1
    #Then Registrar Can Check  Textvaladations in Login Page
    #When Registrar  Enter valid UN and PWD "<username>" and "<password>" and navigate to Registrar Home Page
#
    #Examples: 
      #| username             | password | Case  |
      #| bharat@ikcontech.com | Test@123 | Valid |
#
  #Scenario Outline: Application
    #Then Registrar  check Final Functionalities in Applications Page
    #Then Registrar  check Final Final Functionalities in Domains Page
    #Then Registrar check Finalstep Functionalities in Domains page
    #Then Registrar  check Final Functionalities in Invoice Page
    #Then User logout  application
#
    #Examples: 
      #| OrgName  | DomainName        | Status3              |
      #| MaxTecho | hindustan.bank.in | Approved for payment |
#
  #@5tstep
  #Scenario Outline: Registrant Registration and login
    #Given User is on Landing Page
    #Then User enters registrant credentials
#
  #Scenario Outline: DSC Verify
    #And User enters the dsc details
#
  #Scenario Outline: Registrant Invoice Page
    #Then User navigate to Invoice page
    #Then User download the invoice
    #Then User logout  application
