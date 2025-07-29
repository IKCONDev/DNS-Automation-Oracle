Feature: Registrar Operations

  
  Scenario Outline: Registrar Login Page
  Given Registrar is on Landing Page1
  Then Registrar Can Check  Textvaladations in Login Page
  When Registrar  Enter valid UN and PWD "<username>" and "<password>" and navigate to Registrar Home Page
  
  Examples:
  | username             | password | Case  |
  | bharat@ikcontech.com | Test@123 | Valid |
  
  Scenario Outline: Registrar validatetext and Functionalities in Home Page
  Then Registrar  check  fields  in  Home Page
  Then Registrar  check textvaladations in Home Page
  Then Registrar  check  Create ApplicationQuee TextValidations in Home Page
  
  Examples:
  |APPorgname | OrgName    |
  |Information| Canara Bank|
  
  
  
  Scenario Outline: Registrar Application  Page
  Then Registrar Navigate to Application Page  check  Textvalidations
  Then Registrar Navigate to Application Page  check Tabledata Textvalidations
  Then Registrar Navigate to Application Page  check  OrganisationDetails Textvalidations
  Then Registrar  check DocumentsUpload Functionalities in Applications Page
  Then Registrar  check AdministrativeOfficier Functionalities in Applications Page
  Then Registrar  check TechnicalOfficier Functionalities in Applications Page
  Then Registrar  check BillingOfficier Functionalities in Applications Page
  
  Examples:
  | OrgName    | ADocument Type | PDocument Type | OrgDocument Type |DomainName    |
  | Canara Bank| Aadhaar        | PAN            | Organisation Id  |canara.bank.in|
  
  Scenario Outline: Registrar  Domain Page
  Then Registrar can Navigate to Domain Page can check Textvalidations
  Then Registrar  check DomaintableData Textvalidations
  #Then Registrar  check AllFieldsData "<Status>" Textvalidations in Domain Page
  
  Examples:
  | OrgName    |DomainName    |InvoiceStatus       |
  | Canara Bank|canara.bank.in|Approved for payment|
  
  
  
  
  Scenario Outline: Registrar Invoice  Page
  Then Registrar can Navigate to Invoice Page  check Textvalidations
  
  Examples:
  | DomainName    |
  | canara.bank.in|
  
  
  
  
  Scenario Outline: Registrar  DR User Management Settings Page
  Then Registrar navigate to Settings Page  check "<UserId>" DRUserManagement  Textvalidations and all fields functionalities
  
  Examples:
  |UserId              |
  |bharat@ikcontech.com|
  
  Scenario Outline: Registrant User Management Page
  Then Registrar  check RegistrantUserManagement Textvalidations and functionalities in Settings Page
  
  Examples:
  | OrgName    |
  | Canara Bank|
  
  Scenario Outline: Registrant Officers Details  Settings  Page
  Then Registrar  check RegistrantOfficerDetails "<OrgName>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>" Textvalidations and functionalities in Settings Page
  Examples:
  | OrgName   | ADocument Type | PDocument Type | OrgDocument Type |
  |Canara Bank| Aadhaar        | PAN            | Organisation Id  |
  
  
  Scenario Outline: Registrar Roles Settings  Page
  
  Then Registrar  check RegistrarRolesSearch "<RoleName>" Textvalidations and functionalities in Settings Page
  
  Examples:
  | RoleName   |
  | IDRBTADMIN |
  
  
  Scenario Outline: Registrar  Department Settings  Page
  
  Then Registrar can RegistrarDepartmentSearch "<DepartmentName>"   Textvalidations and functionalities in Settings Page
  Examples:
  |DepartmentName|
  |Banking       |
  
  Scenario Outline: Registrar Login Page
    Given Registrar is on Landing Page1
    Then Registrar Can Check  Textvaladations in Login Page
    When Registrar  Enter valid UN and PWD "<username>" and "<password>" and navigate to Registrar Home Page

    Examples: 
      | username             | password | Case  |
      | bharat@ikcontech.com | Test@123 | Valid |

  #4th step
  Scenario Outline: Application
    Then Registrar  check Final Functionalities in Applications Page
    #Then Registrar check Final Functionalities in Domain Page
  Then Registrar  check Final Functionalities in Invoice Page
  
  Examples:
  | OrgName |DomainName       |
  | MaxTecho|hindustan.bank.in|
  
  #logout
  Scenario Outline: Registrar with valid credentials
    Given Registrar is on Landing Page1
    Then Registrar Can Check  Textvaladations in Login Page
    When Registrar  Enter valid UN and PWD "<username>" and "<password>" and navigate to Registrar Home Page
    Then Registrar Can Check  logout funcionality

    Examples: 
      | username             | password | Case  |
      | bharat@ikcontech.com | Test@123 | Valid |
