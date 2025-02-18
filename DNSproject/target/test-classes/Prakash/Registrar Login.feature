Feature: Login Registrant

  Scenario Outline: Registrar with valid credentials
    Given Registrar is on Landing Page
    Then Registrar Can Check Textvaladations in Login Page
    When Registrar  enter "<username>" and "<password>" and navigate to Registrar Home Page

    Examples: 
      | username             | password | Case  |
      | bharat@ikcontech.com | Test@123 | Valid |

  Scenario Outline: Registrar validatetext and Functionalities in Home Page
    Then Registrar check all fields in  Home Page
    Then Registrar can check textvaladations in Home Page
    Then Registrar can check  Create ApplicationQuee "<Org Name>" TextValidations in Home Page

    Examples: 
      | Org Name           |
      | Ikcontech solutions|

  Scenario Outline: Registrar validatetext and Functionalities in Application  Page
    Then Registrar Navigate to Application Page can check  Textvalidations
    Then Registrar Navigate to Application Page can check "<Org Name>" Tabledata Textvalidations
    Then Registrar Navigate to Application Page can check  OrganisationDetails Textvalidations
    Then Registrar can check DocumentsUpload Functionalities in Applications Page
    Then Registrar can check AdministrativeOfficier "<Org Name>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>"  Functionalities in Applications Page
    Then Registrar can check TechnicalOfficier Functionalities in Applications Page
    Then Registrar can check BillingOfficier Functionalities in Applications Page

    Examples: 
      | Org Name            | ADocument Type | PDocument Type | OrgDocument Type |
      | Ikcontech solutions | Aadhaar        | PAN            | Organisation Id  |

  Scenario Outline: Registrar validatetext and Functionalities in Domain Page
    Then Registrar Navigate to Domain Page can check Textvalidations
    Then Registrar can check DomaintableData "<Org Name>" Textvalidations
    Then Registrar can check AllFieldsData Textvalidations in Domain Page

    Examples: 
      | Org Name            |
      | Ikcontech solutions |

  Scenario Outline: Registrar validatetext and Functionalities in Invoice  Page
    Then Registrar Navigate to Invoice Page can check Textvalidations

    Examples: 
      | Org Name            |
      | Ikcontech solutions |

  Scenario Outline: Registrar validatetext and Functionalities in Reports Page
    Then Registrar Navigate to Reports Page can check Textvalidations

  Scenario Outline: Registrar validatetext and Functionalities in Settings  Page
    Then Registrar navigate to Settings Page can check "<UserId>" DRUserManagement  Textvalidations and all fields functionalities
    Then Registrar can check RegistrantUserManagement "<UserID>" Textvalidations and functionalities in Settings Page
    Then Registrar can check RegistrantOfficerDetails "<Org Name>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>" Textvalidations and functionalities in Settings Page
    Then Registrar can check RegistrarRolesSearch "<RoleName>" Textvalidations and functionalities in Settings Page
    Then Registrar can check RegistrarDepartmentSearch "<DepartmentName>"  Textvalidations and functionalities in Settings Page

    Examples: 
      | UserID                | RoleName   | UserId               | DepartmentName | Org Name            | ADocument Type | PDocument Type | OrgDocument Type |
      | prakash@ikcontech.com | IDRBTADMIN | bharat@ikcontech.com | IT             | Ikcontech solutions | Aadhaar        | PAN            | Organisation Id  |
