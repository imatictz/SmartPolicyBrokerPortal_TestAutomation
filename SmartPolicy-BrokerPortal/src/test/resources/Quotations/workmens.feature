@All
Feature: Workmens Screen

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
 

@MandatoryFields
Scenario: (Workmens Quotation) Verify user able to enter mandatory fields and save quotation successfully
    When user click on add button
    When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Liability Insurance        |
    | Insurance Type   | Workmens (With Liability)  |
    #When user select "Workmens (With Liability)" as insurance type
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
Then user able to view "Awaiting Receipt" as status

@MandatoryFieldsNoAddon
Scenario: (Workmens Quotation) Verify user able to enter mandatory fields with NoAddon and save quotation successfully
    When user click on add button
    When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Liability Insurance        |
    | Insurance Type   | Workmens (With Liability)  |
   # When user select "Workmens (With Liability)" as insurance type
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
   When user select "01-Jan-2026" as from date
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
   #Then user able to view "1003-Information modified successfully" as message

@PrintQuote
 Scenario: User prints the Individual Personal Accident quote
   When user select "01-Jan-2026" as from date
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
  