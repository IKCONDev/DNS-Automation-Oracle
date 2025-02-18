Feature: Registrant Onboarding

  Scenario Outline: DSC clear with valid data
    And User enters the dsc certification details

  Scenario Outline: onboarding page
    Then User enters domain page "<domain>"
    Then User enters organisation details "<Name>" "<PIN>" "<Address>" "<Tel>" "<Mob>" "<Email>" "<GST>" "<PAN>" "<Lience>"

    Examples: 
      | domain  | Name    | PIN    | Address               | Tel        | Mob        | Email         | GST             | PAN        | License  |
      | zoxite6 | Orgname | 500090 | CYBERTOWERS,HEDERABAD | 9685578941 | 9685578945 | org@gmail.com | 123456789582222 | ASDEE4455Q | GRFNFNFF |

  Scenario Outline: admin contact details page
    Then User enters admin contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"

    Examples: 
      | Name      | Tel        | Mob        | Email           | Aadhar         | PAN        | Desig         |
      | Adminname | 9685578942 | 9685578946 | admin@gmail.com | 1234 5678 8012 | ASDEE4455L | Admin Officer |

  Scenario Outline: Technical contact details page
    Then User enters technical contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"

    Examples: 
      | Name     | Tel        | Mob        | Email           | Aadhar         | PAN        | Desig             |
      | Techname | 9685578943 | 9685578947 | admin@gmail.com | 1234 5678 7012 | ASDEE4455P | Technical Officer |

  Scenario Outline: Billing contact details page
    Then User enters billing contact details "<Name>" "<Tel>" "<Mob>" "<Email>" "<Aadhar>" "<PAN>" "<Desig>"

    Examples: 
      | Name     | Tel        | Mob        | Email           | Aadhar         | PAN        | Desig             |
      | Techname | 9685578954 | 9685578948 | admin@gmail.com | 1234 5678 5012 | ASDEE4455P | Technical Officer |

  Scenario Outline: Name server details page
    Then User enters name server details "<NS1>" "<IP1>" "<NS2>" "<IP2>"

    Examples: 
      | NS1     | NS2     | IP1        | IP2        |
      | Office1 | office2 | 1.10.10.10 | 1.10.10.20 |
