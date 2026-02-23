@All
Feature: Fidelity Quotation 

Background: 
 
When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
 

@MandatoryFields @one
Scenario: (Fidelity Quotation) Verify user able to enter mandatory fields and save quotation successfully

When user click on add button
When user select "Fidelity" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user enter "15244-51654-84125" as cover note number
When user select "Standard Rate" as insurance class
When user enter "4500000" as sum insured
When user enter "11" as No of employees
When user enter "Fidelity Quotation Testing" as description
When user click on compute button
When user click on insert button
#Addon
When user click on addOn button
When user click on extension dropdown
When user enter "Third party and public liability" as extension
When user select on Third party and public liability as extension
When user enter "720000" as sum insured (AddOn)
When user enter "2" as rate%
When user enter "Fidelity Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
When user click on Ok button to accept commission alert
Then user able to view "Awaiting Receipt(Compliance Issues)" as status

@MandatoryFieldsNoAddon @one
Scenario: (Fidelity Quotation) Verify user able to enter mandatory fields and save quotation successfully

When user click on add button
When user select "Fidelity" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user enter "15244-51654-84125" as cover note number
When user select "Standard Rate" as insurance class
When user enter "4500000" as sum insured
When user enter "11" as No of employees
When user enter "Fidelity Quotation Testing" as description
When user click on compute button
When user click on insert button
When user click on save button
When user click on Ok button to accept commission alert
Then user able to view "Awaiting Receipt" as status


@AllFields
Scenario: (Fidelity Quotation) Verify user able to enter all fields and save quotation successfully

When user click on add button
When user select "Fidelity" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
#When user click on business by dropdown
#Then user select Demo User as business by
When user select on non-renewabale checkbox
When user enter "Manager654123" as contact person
When user select on RI per class checkbox
When user Select on first loss payee checkbox
Then user enter "Payee101" as first loss payee
When user select on borrower type check box
When user click on borrower type dropdown
And user enter "Retail Banking" as borrower type
Then user select Retail Banking as borrower type
When user enter "Pravin Test Acc" as borrower account name
When user enter "9541203288" as borrower account number
When user enter "Covering Details 10250 + Health CARE" as covering details
When user enter "Description of Risk 21582 +RISK COVERED" as description of risk
When user click on loss ratio forecast dropdown
When user enter "Profit making" as loss ratio forecast
Then user select Profit making as loss ratio forecast
When user enter "15244-51654-84125" as cover note number
#Policy Information
When user select "Standard Rate" as insurance class
When user enter "4500000" as sum insured
When user enter "11" as No of employees
When user enter "Fidelity Quotation Testing" as description
When user enter "1500" as adjust premium
When user click on compute button
When user click on insert button
#AddOn
When user click on addOn button
When user click on extension dropdown
When user enter "Third party and public liability" as extension
When user select on Third party and public liability as extension
When user enter "720000" as sum insured (AddOn)
When user enter "2" as rate%
When user enter "5" as commission rate%
When user enter "Fidelity Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user enter "502.3" as other fee
When user enter "50" as discount on commission %
Then user click on Re-Compute premium
When user click on save button
When user click on Ok button to accept commission alert
Then user able to view "Awaiting Receipt(Compliance Issues)" as status


@PrintQuote
 Scenario: User prints the Fidelity quote
   When user select "01/09/2025" as from date
   When user enter "Fidelity" as Insurance Type
   When user click on search button to find "Fidelity" quote
   When user enter quote number to search "Fidelity" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print quotation option
   And the quote should include all relevant details like
      | Field           | 
      | Client Name     |
      | Quote Number    | 
      | Premium Amount  | 
      | Insurance Type  | 
  # And the user should be able to send the quote to the printer
  
@EditQuote
 Scenario: Verify user able to edit an existing Fidelity quote successfully
   When user select "15/09/2025" as from date
   When user enter "Fidelity" as Insurance Type
   When user click on search button to find "Fidelity" quote
   When user enter quote number to search "Fidelity" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on edit option
   
   #Non-Financial Change
   When user enter "Pravin Edit Test" as client name
   And user select "Pravin Edit Test" as client name
   When user select "Automated Testing Company" as insurer
   
   #Financial Change
   When user click on select icon to edit details
   When user select "Standard Rate" as insurance class
   When user enter "4500000" as sum insured
   When user enter "12" as No of employees
   When user enter "Fidelity Quotation Testing" as description
   When user click on compute button
   When user click on update button to save policy information
   When user click on update button
   When user click on Ok button to accept commission alert