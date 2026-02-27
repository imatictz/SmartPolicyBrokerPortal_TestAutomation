@All
Feature: Workmens Screen

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
 

@MandatoryFields
Scenario: (Workmens Quotation) Verify user able to enter mandatory fields and save quotation successfully
    When user click on add button
    When user select "Workmens (With Liability)" as insurance type
    When user enter screen details :
      | Field Name                       | Value                          |
      | Client Name                      | Pravin Testing Broker          |
      | Insurer                          | Automated Testing Company      |
      | Cover Number                     | 15244-51654-84125              |
      | Insurance Class                  | Employees working in premises  |
      | No of Employees                  | 10                             |
      | Annual Salary/Limit of Liability | 500000                         |
      
     When user click on compute button
     When user click on insert button
  #AddOn
  When user click on addOn button
When user select "All Risk Cover" as extension
When user enter "200000" as sum insured (AddOn)
When user enter "4" as rate%
When user enter "Workmens (With Liability)" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
When user click on Ok button to accept commission alert
Then user able to view "Awaiting Receipt(Compliance Issues)" as status

@MandatoryFieldsNoAddon
Scenario: (Workmens Quotation) Verify user able to enter mandatory fields with NoAddon and save quotation successfully
    When user click on add button
    When user select "Workmens (With Liability)" as insurance type
    When user enter screen details :
      | Field Name                       | Value                          |
      | Client Name                      | Pravin Testing Broker          |
      | Insurer                          | Automated Testing Company      |
      | Cover Number                     | 15244-51654-84125              |
      | Insurance Class                  | Employees working in premises  |
      | No of Employees                  | 10                             |
      | Annual Salary/Limit of Liability | 500000                         |
      
     When user click on compute button
     When user click on insert button
  
When user click on save button
When user click on Ok button to accept commission alert
Then user able to view "Awaiting Receipt" as status

@EditQuote
 Scenario: Verify user able to edit an existing Workmens Quotation successfully
   When user select "01/09/2025" as from date
   When user enter "Workmens (With Liability)" as Insurance Type
   When user click on search button to find "Workmens (With Liability)" quote
   When user enter quote number to search "Workmens (With Liability)" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on edit option
   
   When user enter screen details :
      | Field Name                       | Value                          |
      | Client Name                      | Pravin Testing Broker          |
      | Insurer                          | Automated Testing Company      |
      | Cover Number                     | 15244-51654-84125              |
    When user click on select icon to edit details
    When user continue to enter screen details :
      | Field Name                       | Value                          |
      | Insurance Class                  | Employees working in premises  |
      | No of Employees                  | 10                             |
      | Annual Salary/Limit of Liability | 500000                         |
      
     When user click on compute button
   When user click on update button to save policy information
   When user click on update button
   When user click on Ok button to accept commission alert
   Then user able to view "1003-Information modified successfully" as message

@PrintQuote
 Scenario: User prints the Individual Personal Accident quote
   When user select "01/09/2025" as from date
   When user enter "Workmens (With Liability)" as Insurance Type
   When user click on search button to find "Workmens (With Liability)" quote
   When user enter quote number to search "Workmens (With Liability)" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print quotation option
   And the quote should include all relevant details like
      | Field           | 
      | Client Name     |
      | Quote Number    | 
      | Premium Amount  | 
      | Insurance Type  |
  Scenario: Verify user able to enter all fields
    When user enter screen details :
      | Field Name                     | Value                    |
      | Show Policy                    | POL67890                 |
      | Insurer                        | Alliance Insurance       |
      | Currency                       | TZS                      |
      | X Rate                         | 1.00                     |
      | Insurer X Rate                 | 1.00                     |
      | Insured Name                   | XYZ Traders Ltd          |
      | Date From                      | 01/01/2026               |
      | - To -                         | 31/12/2026               |
      | Contact Person                 | Michael John             |
      | VAT %                          | 18                       |
      | Address                        | Dar es Salaam Tanzania   |
      | Branch                         | Head Office              |
      | Cover Note Number              | CN123456                 |
      | Business Type                  | Renewal                  |
      | Business by                    | Underwriter User         |
      | (For TRA Purpose Only)         | 123456789                |
      | VRN No.                        | VRN987654                |
      | Policy Type                    | Comprehensive            |
      | Loss Ratio Forecaste           | Low                      |
      | First Loss Payee               | true                     |
      | Bind to Collateral             | Yes                      |
      | Collateral Name                | Property Collateral      |
      | Borrower Type                  | true                     |
      | Borrower Account Name          | Jane Smith               |
      | Borrower Account Number        | 9876543210               |
      | Non-Renewable                  | true                     |
      | Covering Details               | Full building coverage   |
      | Description of Risk            | Fire and Allied Perils   |
      | Insured Status                 | Active                   |
      | Gender                         | Female                   |
      | ID Type                        | Passport                 |
      | ID Number:                     | P1234567                 |
      | Nationality                    | Kenyan                   |
      | Date of Birth                  | 01/01/1990               |
      | Insurance Class                | Marine Insurance         |
      | Description                    | Marine cargo policy      |
      | No of Employees                | 50                       |
      | Monthly Salary                 | 2000000                  |
      | Annual Salary/Limit of Liability | 75000000               |
      | Rate %                         | 2.5                      |
      | Override %                     | 1.5                      |
      | Annual Premium                 | 1500000                  |
      | Emp Liability %                | 5                        |
      | Actual Premium                 | 1550000                  |
      | Adjust Premium                 | 50000                    |
      | Total Premium                  | 1600000                  |
      | Other Taxes                    | 20000                    |
      | Other Fee                      | 10000                    |
      | VAT Amount                     | 288000                   |
      | Policy Holders Fund            | 5000                     |
      | Training/Insurance Levy        | 3000                     |
      | Stamp Duty                     | 1000                     |
      | Withhold Tax                   | 2000                     |
      | Commission Rate %              | 10                       |
      | Broker Commission              | 160000                   |
      | VAT on Commission              | 28800                    |
      | Insurer Settlement             | 1300000                  |
      | Administration Charges         | 5000                     |
      | Discount on Commission %       | 2                        |
      | Discount Commission            | 3000                     |
      | Discount on Premium %          | 1                        |
      | Discount Premium               | 15000                    |
      | Addon Premium                  | 25000                    |
      | Total Receivable               | 1700000                  |
      | Scope Of Cover                 | Standard fire cover      |
      | Reject Description             | N/A                      |