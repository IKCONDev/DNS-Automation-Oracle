Feature: Registrar Domain Page

  Scenario Outline: Registrar  Domain Page
    Then Registrar can Navigate to Domain Page can check Textvalidations
    Then Registrar  check DomaintableData Textvalidations
    Then Registrar  check AllFieldsData  "<IP2>" "<IP1>" Textvalidations in Domain Page
    Then Registrar  check Final "<Status2>" Functionalities in Domains Page

    Examples: 
      | IP2          | IP1          | Status2          |
      | 199.20.12.23 | 199.20.12.24 | Payment Not Done |
