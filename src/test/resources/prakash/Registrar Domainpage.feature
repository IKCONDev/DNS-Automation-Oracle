Feature:  Registrar Domain Page

 Scenario Outline: Registrar validatetext and Functionalities in Domain Page
    Then Registrar can Navigate to Domain Page can check Textvalidations
    Then Registrar  check DomaintableData "<OrgName>" Textvalidations
    Then Registrar  check AllFieldsData Textvalidations in Domain Page

    Examples: 
      | OrgName    |
      | Rohan Tech |