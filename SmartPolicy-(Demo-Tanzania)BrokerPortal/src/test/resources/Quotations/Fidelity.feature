@All
Feature: Fidelity Quotation 

Background: 
 
When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Fidelity" to search insurance type in search box
When user select Fidelity as insurance type from dropdown

@MandatoryFields
Scenario: (Fidelity Quotation) Verify user able to enter mandatory fields and save quotation successfully

When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer
When user select Alliance Insurance Company (T) Ltd. as insurer
When user click on insurance class dropdown
When user enter "Standard Rate" as insurance class
When user select Standard Rate as insurance class
When user enter "4500000" as sum insured
When user enter "11" as No of employees
When user enter "Fidelity Quotation Testing" as description
When user click on compute button
When user click on insert button
When user click on addOn button
When user click on extension dropdown
When user enter "Third party and public liability" as extension
When user select on Third party and public liability as extension
When user enter "720000" as sum insured (AddOn)
When user enter "2" as rate%
When user enter "Fidelity Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
Then user able to view "Awaiting Receipt" as status


@AllFields
Scenario: (Fidelity Quotation) Verify user able to enter all fields and save quotation successfully

When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer
When user select Alliance Insurance Company (T) Ltd. as insurer
When user click on business by dropdown
Then user select Demo User as business by
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
When user click on insurance class dropdown
When user enter "Standard Rate" as insurance class
When user select Standard Rate as insurance class
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
When user click on save button
Then user able to view "Awaiting Receipt" as status