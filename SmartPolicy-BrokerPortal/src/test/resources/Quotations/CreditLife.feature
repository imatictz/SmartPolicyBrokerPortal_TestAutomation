@All
Feature: Credit Life Quotation

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
 

@MandatoryFields
Scenario: (Credit Life Quotation)Verify user able to enter mandatory fields and save quotation successfully
When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Group-Life Business        |
    | Insurance Type   | Credit Life Insurance      |
#When user select "Credit life" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user enter "15244-51654-84125" as cover note number
When user enter "Pravin Testing" as insured name
When user select "01/01/2000"date of birth
When user enter "2000000" as loan amount
When user enter "180" as period in month
When user select "Business Banking" as client type
When user enter "1200" as adjust premium
When user click on compute button
When user click on insert button
#AddOn
When user click on addOn button
When user click on extension dropdown
When user enter "Terrorism" as extension
When user select on Terrorism as extension
When user enter "Credit Life Quotation AddOn" as description (AddOn)
When user enter "100000" as sum insured (AddOn)
When user enter "2.5" as rate%
When user click on insert button (AddOn)
When user click on save button
When user click on Ok button to accept commission rate alert message
Then user able to view "Awaiting Receipt" as status

@MandatoryFieldsNoAddon
Scenario: (Credit Life Quotation)Verify user able to enter mandatory fields and save quotation successfully
When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Group-Life Business        |
    | Insurance Type   | Credit Life Insurance      |

#When user select "Credit life" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user enter "15244-51654-84125" as cover note number
When user enter "Pravin Testing" as insured name
When user select "01/01/2000"date of birth
When user enter "2000000" as loan amount
When user enter "180" as period in month
When user select "Business Banking" as client type
When user enter "1200" as adjust premium
When user click on compute button
When user click on insert button
When user click on save button
When user click on Ok button to accept commission rate alert message
Then user able to view "Awaiting Receipt" as status


@AllFields
Scenario: (Credit Life Quotation)Verify user able to enter all fields and save quotation successfully
When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Group-Life Business        |
    | Insurance Type   | Credit Life Insurance      |

#When user select "Credit life" as insurance type
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
When user enter "123459876501234" as cover note
#Policy Information
When user enter "Pravin Testing" as insured name
When user select "01/01/2000"date of birth
When user enter "YES" as collateral given
When user enter "Bahi" as branch name
When user enter "Birth Certificate" as ID type
When user enter "YTG1220S02" as ID number
When user enter "120324520RACC05" as loan account number
When user enter "1200000" as annual salary
When user enter "W2151512151ACCb" as member account number
When user enter "2000000" as loan amount
When user enter "10" as interest%
When user enter "Active" as loan status
When user enter "180" as period in month
When user select "Business Banking" as client type
#When user enter "2.25" as override% 
When user enter "5" as override% for Retrenchment Rate %
When user enter "1200" as adjust premium
When user click on compute button
When user click on insert button
#AddOn
When user click on addOn button
When user click on extension dropdown
When user enter "Terrorism" as extension
When user select on Terrorism as extension
When user enter "100000" as sum insured (AddOn)
When user enter "2.5" as rate%
When user enter "5" as commission rate%
When user enter "Credit Life Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user enter "502.3" as other fee
When user enter "50" as discount on commission %
When user click on save button
When user click on Ok button to accept commission rate alert message
Then user able to view "Awaiting Receipt(Compliance Issues)" as status

@PrintQuote
 Scenario: User prints the Credit life Insurance quote
   When user select "01/09/2025" as from date
   When user enter "Credit life Insurance" as Insurance Type
   When user click on search button to find "Credit life Insurance" quote
   When user enter quote number to search "Credit life Insurance" quote
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
 Scenario: Verify user able to edit an existing Credit life Insurance quote successfully
   When user select "15/09/2025" as from date
   When user enter "Credit life Insurance" as Insurance Type
   When user click on search button to find "Credit life Insurance" quote
   When user enter quote number to search "Credit life Insurance" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on edit option
   
   #Non-Financial Change
   When user enter "Pravin Edit Test" as client name
   And user select "Pravin Edit Test" as client name
   When user select "Automated Testing Company" as insurer
   
   #Financial Change
   When user click on select icon to edit details
   When user enter "Pravin Testing" as insured name
   When user select "01/01/2000"date of birth
   When user enter "1000000" as loan amount
   When user enter "120" as period in month
   When user select "Commercial Banking" as client type
   When user enter "1500" as adjust premium
   When user click on compute button
   When user click on update button to save policy information
   When user click on update button
   When user click on Ok button to accept commission alert
