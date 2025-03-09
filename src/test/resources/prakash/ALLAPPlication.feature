Feature: Registrant Onboarding

  Scenario Outline: Registrant Registration and login
    Given User is on Landing Page
    #Then User validating the Landing Page
    #When User navigate to Registration Page
    #Then User Register An Account "<username>" "<password>"
    #When User navigate to Login Page
    Then User enters "<username>" and "<password>"

    Examples: 
      | username          | password | Case  |
      | bhanu@camenol.com | Test@123 | Valid |

  Scenario Outline: DSC Verify
    And User enters the dsc details
    Then User logout the application

  Scenario Outline: Onboarding Page
    Then User enters domain page "<domain>"
    Then User enters organisation details "<domain>" "<PIN>" "<Address>" "<Tel>" "<Mob>" "<Email>" "<GST>" "<PAN>" "<License>"

    Examples: 
      | domain | PIN    | Address                                  | Tel        | Mob        | Email    | GST             | PAN        | License               |
      | cashie | 500090 | CYBERTOWERS,Madhapur,HEDERABAD,Telangana | 9685578941 | 9685578945 | camenol@ | 22ABCDE0000A1J5 | ASDEE4455Q | L12345MH2023PLC000001 |

  Scenario Outline: Admin Contact details
    Then User enters admin contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"

    Examples: 
      | Name   | Tel        | Mob        | Email     | Aadhar         | PAN        | Desig   |
      | prasad | 9685578942 | 9685578946 | camenol1@ | 1234 5678 8012 | ASDEE4455L | Manager |

  Scenario Outline: Technical contact details
    Then User enters technical contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"

    Examples: 
      | Name   | Tel        | Mob        | Email    | Aadhar         | PAN        | Desig     |
      | srivas | 9685578943 | 9685578947 | cameno2@ | 1234 5678 7012 | ASDEE4455P | Assig Mng |

  Scenario Outline: Billing contact details page
    Then User enters billing contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"

    Examples: 
      | Name  | Tel        | Mob        | Email     | Aadhar         | PAN        | Desig    |
      | raman | 9685578954 | 9685578948 | camenol3@ | 1234 5678 5012 | ASDEE4455P | Accounts |

  Scenario Outline: Name server details
    Then User enters name server details "<NS1>" "<IP1>" "<NS2>" "<IP2>"

    Examples: 
      | NS1     | NS2     | IP1         | IP2         |
      | Office1 | office2 | 193.0.21.21 | 193.0.12.12 |

  Scenario Outline: Preview and Submit
    Then User preview and submit onboarding

  Scenario Outline: Registrant Application Page
    Then User Navigate to Application Page
    Then User Validate Application Page
    Then User Validate Application data
    Then User Navigates the Domain Applications Details page
    Then User validate the Domain Applications Details page
    And User subit the Domain Applications Details page

  Scenario Outline: Registrant Domain Page
    Then User Navigate to Domain Page
    Then User Validate Domain Page
    Then User Validate Domain data
    Then User Navigates the Domain Details page
    Then User validate the Domain Domain Details page "<NS1>" "<IP1>" "<NS2>" "<IP2>"
    And User subit the Domain Details page

    Examples: 
      | NS1     | NS2     | IP1        | IP2        |
      | Office1 | office2 | 1.10.71.10 | 1.10.81.10 |

  Scenario Outline: Registrnt User Management
    Then User navigate to user management page
    Then User Validate the user management page

  Scenario Outline: Registrant Officer Details Management
    Then User navigate to officer details management page
    Then User Validate the officer details management page
    Then User logout the application

  @2ndStep
  Scenario Outline: Registrar Login Page
    Given Registrar is on Landing Page1
    Then Registrar Can Check  Textvaladations in Login Page
    When Registrar  Enter valid UN and PWD "<username>" and "<password>" and navigate to Registrar Home Page

    Examples: 
      | username             | password | Case  |
      | bharat@ikcontech.com | Test@123 | Valid |

  Scenario Outline: Registrar Functionalities in Dashboard Page
    Then Registrar  check  fields  in  Home Page
    Then Registrar  check textvaladations in Home Page
    Then Registrar  check  Create ApplicationQuee TextValidations in Home Page

    Examples: 
      | APPorgname  | OrgName     |
      | Information | Canara Bank |

  Scenario Outline: Registrar Application  Page
    Then Registrar Navigate to Application Page  check  Textvalidations
    Then Registrar Navigate to Application Page  check Tabledata Textvalidations
    Then Registrar Navigate to Application Page  check  OrganisationDetails Textvalidations
    Then Registrar  check DocumentsUpload Functionalities in Applications Page
    Then Registrar  check AdministrativeOfficier Functionalities in Applications Page
    Then Registrar  check TechnicalOfficier Functionalities in Applications Page
    Then Registrar  check BillingOfficier Functionalities in Applications Page

    Examples: 
      | OrgName     | ADocument Type | PDocument Type | OrgDocument Type | DomainName     |
      | Canara Bank | Aadhaar        | PAN            | Organisation Id  | canara.bank.in |

  Scenario Outline: Registrar  Domain Page
    Then Registrar can Navigate to Domain Page can check Textvalidations
    Then Registrar  check DomaintableData Textvalidations
    Then Registrar  check AllFieldsData  "<IP2>" "<IP1>" Textvalidations in Domain Page
    Then Registrar  check Final  Functionalities in Domains Page

    Examples: 
      | IP2          | IP1          | Status2          |
      | 199.20.12.23 | 199.20.12.24 | Payment Not Done |

  Scenario Outline: Registrar Invoice  Page
    Then Registrar can Navigate to Invoice Page  check Textvalidations

    Examples: 
      | DomainName     |
      | canara.bank.in |

  Scenario Outline: Registrar  DR User Management Settings Page
    Then Registrar navigate to Settings Page  check "<UserId>" DRUserManagement  Textvalidations and all fields functionalities

    Examples: 
      | UserId               |
      | bharat@ikcontech.com |

  Scenario Outline: Registrant User Management Page
    Then Registrar  check RegistrantUserManagement Textvalidations and functionalities in Settings Page

    Examples: 
      | OrgName     |
      | Canara Bank |

  Scenario Outline: Registrant Officers Details  Settings  Page
    Then Registrar  check RegistrantOfficerDetails "<OrgName>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>" Textvalidations and functionalities in Settings Page

    Examples: 
      | OrgName     | ADocument Type | PDocument Type | OrgDocument Type |
      | Canara Bank | Aadhaar        | PAN            | Organisation Id  |

  Scenario Outline: Registrar Roles Settings  Page
    Then Registrar  check RegistrarRolesSearch "<RoleName>" Textvalidations and functionalities in Settings Page

    Examples: 
      | RoleName   |
      | IDRBTADMIN |

  Scenario Outline: Registrar  Department Settings  Page
    Then Registrar can RegistrarDepartmentSearch "<DepartmentName>"   Textvalidations and functionalities in Settings Page
    Then Registrar Can Check  logout funcionality

    Examples: 
      | DepartmentName |
      | Banking        |

  @3rdstep
  Scenario Outline: Registrant Registration and login
    Given User is on Landing Page
    Then User enters "<username>" and "<password>"

    Examples: 
      | username          | password | Case  |
      | bhanu@camenol.com | Test@123 | Valid |

  Scenario Outline: DSC Verify
    And User enters the dsc details

  Scenario Outline: Registrant Application Page
    Then User Navigate to Application Page
    Then User Validate Application Page
    Then User payment and upload recipt
    Then User logout the application
  Scenario Outline: Registrant Registration and login
    Given User is on Landing Page
    Then User validating the Landing Page
    When User navigate to Registration Page
    Then User Register An Account "<username>" "<password>"
    When User navigate to Login Page
    Then User enters "<username>" and "<password>"

    Examples: 
      | username        | password | Case  |
      | venkat@cbse.com | Test@123 | Valid |

  Scenario Outline: DSC Verify
    And User enters the dsc details

  Scenario Outline: Onboarding Page
    Then User enters domain page "<domain>"
    Then User enters organisation details "<domain>" "<PIN>" "<Address>" "<Tel>" "<Mob>" "<Email>" "<GST>" "<PAN>" "<License>"

    Examples: 
      | domain | PIN    | Address                                  | Tel        | Mob        | Email  | GST             | PAN        | License               |
      | cbse   | 500090 | CYBERTOWERS,Madhapur,HEDERABAD,Telangana | 9685578941 | 9685578945 | ikcon@ | 22ABCDE0000A1J5 | ASDEE4455Q | L12345MH2023PLC000001 |

  Scenario Outline: Admin Contact details
    Then User enters admin contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"

    Examples: 
      | Name   | Tel        | Mob        | Email   | Aadhar         | PAN        | Desig   |
      | prasad | 9685578942 | 9685578946 | ikcon1@ | 1234 5678 8012 | ASDEE4455L | Manager |

  Scenario Outline: Technical contact details
    Then User enters technical contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"

    Examples: 
      | Name   | Tel        | Mob        | Email   | Aadhar         | PAN        | Desig     |
      | srivas | 9685578943 | 9685578947 | ikcon2@ | 1234 5678 7012 | ASDEE4455P | Assig Mng |

  Scenario Outline: Billing contact details page
    Then User enters billing contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"

    Examples: 
      | Name  | Tel        | Mob        | Email   | Aadhar         | PAN        | Desig    |
      | raman | 9685578954 | 9685578948 | ikcon3@ | 1234 5678 5012 | ASDEE4455P | Accounts |

  Scenario Outline: Name server details
    Then User enters name server details "<NS1>" "<IP1>" "<NS2>" "<IP2>"

    Examples: 
      | NS1     | NS2     | IP1       | IP2       |
      | Office1 | office2 | 1.0.28.21 | 1.0.61.12 |

  Scenario Outline: Preview and Submit
    Then User preview and submit onboarding

  Scenario Outline: Registrant Application Page
    Then User Navigate to Application Page
    Then User Validate Application Page
    Then User Validate Application data
    Then User Navigates the Domain Applications Details page
    Then User validate the Domain Applications Details page
    And User subit the Domain Applications Details page

  Scenario Outline: Registrant Domain Page
    Then User Navigate to Domain Page
    Then User Validate Domain Page
    Then User Validate Domain data
    Then User Navigates the Domain Details page
    Then User validate the Domain Domain Details page "<NS1>" "<IP1>" "<NS2>" "<IP2>"
    And User subit the Domain Details page

    Examples: 
      | NS1     | NS2     | IP1        | IP2        |
      | Office1 | office2 | 1.10.71.11 | 1.10.81.11 |

  Scenario Outline: Registrnt User Management
    Then User navigate to user management page
    Then User Validate the user management page

  Scenario Outline: Registrant Officer Details Management
    Then User navigate to officer details management page
    Then User Validate the officer details management page
    Then User logout the application

  @2ndStep
  Scenario Outline: Registrar Login Page
    Given Registrar is on Landing Page1
    Then Registrar Can Check  Textvaladations in Login Page
    When Registrar  Enter valid UN and PWD "<username>" and "<password>" and navigate to Registrar Home Page

    Examples: 
      | username             | password | Case  |
      | bharat@ikcontech.com | Test@123 | Valid |

  Scenario Outline: Registrar Functionalities in Dashboard Page
    Then Registrar  check  fields  in  Home Page
    Then Registrar  check textvaladations in Home Page
    Then Registrar  check  Create ApplicationQuee TextValidations in Home Page

    Examples: 
      | APPorgname  | OrgName     |
      | Information | Canara Bank |

  Scenario Outline: Registrar Application  Page
    Then Registrar Navigate to Application Page  check  Textvalidations
    Then Registrar Navigate to Application Page  check Tabledata Textvalidations
    Then Registrar Navigate to Application Page  check  OrganisationDetails Textvalidations
    Then Registrar  check DocumentsUpload Functionalities in Applications Page
    Then Registrar  check AdministrativeOfficier Functionalities in Applications Page
    Then Registrar  check TechnicalOfficier Functionalities in Applications Page
    Then Registrar  check BillingOfficier Functionalities in Applications Page

    Examples: 
      | OrgName     | ADocument Type | PDocument Type | OrgDocument Type | DomainName     |
      | Canara Bank | Aadhaar        | PAN            | Organisation Id  | canara.bank.in |

  Scenario Outline: Registrar  Domain Page
    Then Registrar can Navigate to Domain Page can check Textvalidations
    Then Registrar  check DomaintableData Textvalidations
    Then Registrar  check AllFieldsData  "<IP2>" "<IP1>" Textvalidations in Domain Page
    Then Registrar  check Final  Functionalities in Domains Page

    Examples: 
      | IP2          | IP1          | Status2          |
      | 199.20.12.23 | 199.20.12.24 | Payment Not Done |

  Scenario Outline: Registrar Invoice  Page
    Then Registrar can Navigate to Invoice Page  check Textvalidations

    Examples: 
      | DomainName     |
      | canara.bank.in |

  Scenario Outline: Registrar  DR User Management Settings Page
    Then Registrar navigate to Settings Page  check "<UserId>" DRUserManagement  Textvalidations and all fields functionalities

    Examples: 
      | UserId               |
      | bharat@ikcontech.com |

  Scenario Outline: Registrant User Management Page
    Then Registrar  check RegistrantUserManagement Textvalidations and functionalities in Settings Page

    Examples: 
      | OrgName     |
      | Canara Bank |

  Scenario Outline: Registrant Officers Details  Settings  Page
    Then Registrar  check RegistrantOfficerDetails "<OrgName>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>" Textvalidations and functionalities in Settings Page

    Examples: 
      | OrgName     | ADocument Type | PDocument Type | OrgDocument Type |
      | Canara Bank | Aadhaar        | PAN            | Organisation Id  |

  Scenario Outline: Registrar Roles Settings  Page
    Then Registrar  check RegistrarRolesSearch "<RoleName>" Textvalidations and functionalities in Settings Page

    Examples: 
      | RoleName   |
      | IDRBTADMIN |

  Scenario Outline: Registrar  Department Settings  Page
    Then Registrar can RegistrarDepartmentSearch "<DepartmentName>"   Textvalidations and functionalities in Settings Page
    Then Registrar Can Check  logout funcionality

    Examples: 
      | DepartmentName |
      | Banking        |

  @3rdstep
  Scenario Outline: Registrant Registration and login
    Given User is on Landing Page
    Then User enters registrant credentials

  Scenario Outline: DSC Verify
    And User enters the dsc details

  Scenario Outline: Registrant Application Page
    Then User Navigate to Application Page
    Then User payment and upload recipt
    Then User logout the application

  @4thstep
  Scenario Outline: Registrar Login Page
    Given Registrar is on Landing Page1
    When Registrar  Enter valid UN and PWD "<username>" and "<password>" and navigate to Registrar Home Page

    Examples: 
      | username             | password | Case  |
      | bharat@ikcontech.com | Test@123 | Valid |

  Scenario Outline: Application
    Then Registrar  check Final Functionalities in Applications Page
    Then Registrar  check Final Final Functionalities in Domains Page
    Then Registrar check Finalstep Functionalities in Domains page
    Then Registrar  check Final Functionalities in Invoice Page
    Then Registrar Can Check  logout funcionality

    Examples: 
      | OrgName  | DomainName        | Status3              |
      | MaxTecho | hindustan.bank.in | Approved for payment |