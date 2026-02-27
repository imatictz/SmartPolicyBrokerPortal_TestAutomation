@All
Feature: Collateral Feedback

Background: 

When user navigate on operation dropdown menu
When user navigate on customer management menu
When user click on collateral master

  @AllFields
Scenario: (Collateral Feedback)Enter details with all fields only

  When user click on add button

  When user enter Security Information details :
    | Field Name                | Value                     |
    | Owner's Name              | Pravin Testing Broker     |
    | Security Owner            | Owned                     |
    | Place Of Birth            | Tanzania                  |
    | Security Type             | Commercial Real Estate    |
    | Security Value            | 100000                    |
    | Land Registration No      | 1520236                   |
    | Security Address          | House No 123,ABB Colony,XYZ |
    | Deed Tenure (Years)       | 10                        |
    | Deed Date of Issue        | Today                     |
    | Expiry Date               | 01/01/2028                |
    | Google Location           | Dar es Salaam             |
    | Valuation Date            | Today                     |
    | Market Value              | 200000                    |
    | Forced Sale Value         | 150000                    |
    | Encumbrance Status        | Pending                   |
    | Security Tax Paid Date    | Today                     |

  When user select Security Tax Paid checkbox
  When user select Land Rent Paid checkbox
  When user select Submitted Annual Return checkbox

  When user enter Borrower Information details :
    | Field Name        | Value                  |
    | Name              | Pravin Testing Broker  |
    | Loan Account No   | 1254025                |
    | Loan Amount       | 80000                  |
    | Loan Product      | Agri                   |

  When user enter Insurance Details details :
    | Field Name          | Value                       |
    | Insurance Company   | Automated Testing Company   |
    | Insurance Type      | Bonds                       |
    | Policy No           | 125620                      |
    | Risk Note No        | 12560                       |
    | From Date           | Today                       |
    | To Date             | 01/01/2027                  |
    | Sum Assured         | 150000                      |
    | Premium             | 30000                       |

  When user click on insert button
  And user click on save button
  
  @Edit
Scenario: (Collateral Feedback) Edit details with all fields only

  When user enter "01/01/2026" as Date From
  When user select "Approved" as Record Status
  And user click on search button
  And user clicks on the actions dropdown
  And user clicks on edit option

  When user enter Security Information details :
    | Field Name                | Value                     |
    | Owner's Name              | Pravin Testing Broker     |
    | Security Owner            | Owned                     |
    | Place Of Birth            | Tanzania                  |
    | Security Type             | Commercial Real Estate    |
    | Security Value            | 100000                    |
    | Land Registration No      | 1520236                   |
    | Security Address          | House No 123,ABB Colony,XYZ |
    | Deed Tenure (Years)       | 10                        |
    | Deed Date of Issue        | Today                     |
    | Expiry Date               | 01/01/2028                |
    | Google Location           | Dar es Salaam             |
    | Valuation Date            | Today                     |
    | Market Value              | 200000                    |
    | Forced Sale Value         | 150000                    |
    | Encumbrance Status        | Pending                   |
    | Security Tax Paid Date    | Today                     |

  When user select Security Tax Paid checkbox
  When user select Land Rent Paid checkbox
  When user select Submitted Annual Return checkbox

  When user enter Borrower Information details :
    | Field Name        | Value                  |
    | Name              | Pravin Testing Broker  |
    | Loan Account No   | 1254025                |
    | Loan Amount       | 80000                  |
    | Loan Product      | Agri                   |

  When user click on select icon to edit details
  When user enter Insurance Details details :
  
    | Field Name          | Value                       |
    | Insurance Company   | Automated Testing Company   |
    | Insurance Type      | Bonds                       |
    | Policy No           | 125620                      |
    | Risk Note No        | 12560                       |
    | From Date           | Today                       |
    | To Date             | 01/01/2027                  |
    | Sum Assured         | 150000                      |
    | Premium             | 30000                       |
  When user click on update button to save insurance details
  When user click on update button
  Then user able to view "1003-Information modified successfully" as message


  