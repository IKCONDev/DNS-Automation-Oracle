

Feature: Login Registrar then check Registrant Officers Details

Scenario Outline: Registrant Officers Details  Settings  Page
 Then Registrar  check RegistrantOfficerDetails "<OrgName>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>" Textvalidations and functionalities in Settings Page
     Examples: 
      | OrgName   | ADocument Type | PDocument Type | OrgDocument Type |
      |Canara Bank| Aadhaar        | PAN            | Organisation Id  |