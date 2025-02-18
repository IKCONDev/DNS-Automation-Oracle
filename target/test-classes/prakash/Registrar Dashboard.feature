
Feature:  Registrar Dashboardpage


 Scenario Outline: Registrar validatetext and Functionalities in Home Page
    Then Registrar check all fields in  Home Page
    Then Registrar can check textvaladations in Home Page
    Then Registrar can check  Create ApplicationQuee "<OrgName>" TextValidations in Home Page

    Examples: 
      | OrgName    |
      | Rohan Tech |