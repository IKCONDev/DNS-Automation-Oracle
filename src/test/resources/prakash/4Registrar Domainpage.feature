

Feature:  Registrar Domain Page

 Scenario Outline: Registrar  Domain Page
    Then Registrar can Navigate to Domain Page can check Textvalidations
    Then Registrar  check DomaintableData "<OrgName>" Textvalidations
    Then Registrar  check AllFieldsData "<DomainName>" "<Status>" Textvalidations in Domain Page

    Examples: 
      | OrgName    |DomainName    |InvoiceStatus       |
      | Canara Bank|canara.bank.in|Approved for payment|