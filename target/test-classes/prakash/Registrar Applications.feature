Feature: Registrar Application Page


  Scenario Outline: Registrar validatetext and Functionalities in Application  Page
    Then Registrar Navigate to Application Page  check  Textvalidations
    Then Registrar Navigate to Application Page  check "<OrgName>" Tabledata Textvalidations
    Then Registrar Navigate to Application Page  check  OrganisationDetails Textvalidations
    Then Registrar  check DocumentsUpload Functionalities in Applications Page
    Then Registrar  check AdministrativeOfficier "<OrgName>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>"  Functionalities in Applications Page
    Then Registrar  check TechnicalOfficier Functionalities in Applications Page
    Then Registrar  check BillingOfficier Functionalities in Applications Page

    Examples: 
      | OrgName    | ADocument Type | PDocument Type | OrgDocument Type |
      | Rohan Tech | Aadhaar        | PAN            | Organisation Id  |