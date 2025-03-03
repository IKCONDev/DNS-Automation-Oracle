Feature: Registrar Domain Page

  Scenario Outline: Registrar  Domain Page
    Then Registrar can Navigate to Domain Page can check Textvalidations
    Then Registrar  check DomaintableData Textvalidations
    Then Registrar  check AllFieldsData "<Status>" "<IP1>" "<IP2>" Textvalidations in Domain Page

    Examples: 
      | IP2         | IP1            | Status               |
      | Canara Bank | canara.bank.in | Approved for payment |
