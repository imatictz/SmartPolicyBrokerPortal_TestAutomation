@All
Feature: Burglary Quotation 

Background: 
 
When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Burglary/Theft" to search insurance type in search box
When user select Burglary/Theft as insurance type from dropdown

@MandatoryFields
Scenario: (Burglary Quotation) Verify user able to enter mandatory fields and save quotation successfully

When user enter "Pravin Testing Broker" as client name in quotation
When user select client name as Pravin Testing
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer
When user select Alliance Insurance Company (T) Ltd. as insurer
When user select "Standard Rate" as insurance class
When user enter "2500000" as sum insured
When user enter "Burglary/Theft Quotation Testing" as description
When user click on compute button
When user click on insert button
When user click on addOn button
When user click on extension dropdown
When user enter "All Risk Cover" as extension
When user select on All Risk Cover as extension
When user enter "630000" as sum insured (AddOn)
When user enter "2" as rate%
When user enter "Burglary/Theft Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
#When user click on broker partner name dropdown
#When user enter "FinalTester" as broker partner name
#When user select FinalTester as broker partner name
When user click on save button
When user click on Ok button to accept commission rate alert message
Then user able to view "Awaiting Receipt" as status


@AllFields
Scenario: (Burglary Quotation) Verify user able to enter all fields and save quotation successfully

When user enter "Pravin Testing Broker" as client name in quotation
When user select client name as Pravin Testing
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer
When user select Alliance Insurance Company (T) Ltd. as insurer
When user click on business by dropdown
Then user select Demo User as business by
When user enter "1425DT10" as unique property identification
When user select on non-renewabale checkbox
When user enter "Manager654123" as contact person
When user select on RI per class checkbox
When user Select on first loss payee checkbox
Then user enter "Payee101" as first loss payee
When user select on borrower type check box
When user click on borrower type dropdown
And user enter "Retail Banking" as borrower type
Then user select Retail Banking as borrower type
When user enter "Covering Details 10250 + Health CARE" as covering details
When user enter "Description of Risk 21582 +RISK COVERED" as description of risk
When user click on loss ratio forecast dropdown
When user enter "Profit making" as loss ratio forecast
Then user select Profit making as loss ratio forecast
When user enter "123459876501234" as cover note
#Policy Information
When user select "Standard Rate" as insurance class
When user enter "2500000" as sum insured
When user enter "2" as sum insured rate %
When user enter "2" as override %
When user enter "500" as adjust premium
When user enter "Burglary/Theft Quotation Testing" as description
When user click on compute button
When user click on insert button
#AddOn
When user click on addOn button
When user click on extension dropdown1
When user enter "All Risk Cover" as extension
When user select on All Risk Cover as extension
When user enter "630000" as sum insured (AddOn)
When user enter "2" as rate%
When user enter "5" as commission rate%
When user enter "Burglary/Theft Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user enter "502.3" as other fee
When user enter "50" as discount on commission %
Then user click on Re-Compute premium
#When user click on broker partner name dropdown
#When user enter "FinalTester" as broker partner name
#When user select FinalTester as broker partner name
When user click on save button
#When user click on Ok button to accept commission rate alert message
Then user able to view "Required Approval" as status