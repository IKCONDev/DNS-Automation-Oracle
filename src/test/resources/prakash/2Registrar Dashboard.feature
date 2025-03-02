
  
Feature:  Registrar Dashboardpage


 Scenario Outline: Registrar validatetext and Functionalities in Home Page 
    Then Registrar  check  fields  in  Home Page
    Then Registrar  check textvaladations in Home Page
    Then Registrar  check  Create ApplicationQuee TextValidations in Home Page

    Examples: 
      |APPorgname | OrgName    |
      |Information| Canara Bank|