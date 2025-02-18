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
    Then Registrar can check  Create ApplicationQuee "<OrgName>" TextValidations in Home Page

    Examples: 
      | OrgName    |
      | Rohan Tech |

  Scenario Outline: Registrar validatetext and Functionalities in Application  Page
    Then Registrar Navigate to Application Page can check  Textvalidations
    Then Registrar Navigate to Application Page can check "<OrgName>" Tabledata Textvalidations
    Then Registrar Navigate to Application Page can check  OrganisationDetails Textvalidations
    Then Registrar can check DocumentsUpload Functionalities in Applications Page
    Then Registrar can check AdministrativeOfficier "<OrgName>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>"  Functionalities in Applications Page
    Then Registrar can check TechnicalOfficier Functionalities in Applications Page
    Then Registrar can check BillingOfficier Functionalities in Applications Page

    Examples: 
      | OrgName    | ADocument Type | PDocument Type | OrgDocument Type |
      | Rohan Tech | Aadhaar        | PAN            | Organisation Id  |

  Scenario Outline: Registrar validatetext and Functionalities in Domain Page
    Then Registrar Navigate to Domain Page can check Textvalidations
    Then Registrar can check DomaintableData "<OrgName>" Textvalidations
    Then Registrar can check AllFieldsData Textvalidations in Domain Page

    Examples: 
      | OrgName    |
      | Rohan Tech |

  Scenario Outline: Registrar validatetext and Functionalities in Invoice  Page
   Then Registrar Navigate to Invoice Page can  check "<Domain>" Textvalidations

    Examples: 
      | Domain            |
      | rohantech.bank.in |

  Scenario Outline: Registrar validatetext and Functionalities in Reports Page
    Then Registrar Navigate to Reports Page can check Textvalidations

  Scenario Outline: Registrar validatetext and Functionalities in Settings  Page
    Then Registrar navigate to Settings Page can check "<UserId>" DRUserManagement  Textvalidations and all fields functionalities
    Then Registrar can check RegistrantUserManagement "<UserID>" Textvalidations and functionalities in Settings Page
    Then Registrar can check RegistrantOfficerDetails "<OrgName>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>" Textvalidations and functionalities in Settings Page
    Then Registrar can check RegistrarRolesSearch "<RoleName>" Textvalidations and functionalities in Settings Page
    Then Registrar can check RegistrarDepartmentSearch "<DepartmentName>"  Textvalidations and functionalities in Settings Page

    Examples: 
      | UserID       | RoleName   | UserId               | DepartmentName | OrgName   | ADocument Type | PDocument Type | OrgDocument Type |
      |ramesh@123.com| IDRBTADMIN | bharat@ikcontech.com | Banking        | Rohan Tech| Aadhaar        | PAN            | Organisation Id  |
