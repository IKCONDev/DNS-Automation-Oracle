
Feature: Registrar Application Page



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