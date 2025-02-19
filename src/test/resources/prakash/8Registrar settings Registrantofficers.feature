Feature: Login Registrar then check Registrant Officers Details

Scenario Outline: Registrar validatetext and Functionalities in Settings  Page
 Then Registrar  check RegistrantOfficerDetails "<OrgName>" "<ADocument Type>"  "<PDocument Type>"  "<OrgDocument Type>" Textvalidations and functionalities in Settings Page
     Examples: 
      | OrgName   | ADocument Type | PDocument Type | OrgDocument Type |
      | Rohan Tech| Aadhaar        | PAN            | Organisation Id  |