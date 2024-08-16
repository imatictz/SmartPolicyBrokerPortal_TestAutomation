@All
Feature: Credit Life Quotation

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Credit life" to search insurance type in search box
When user select Credit life as insurance type from dropdown

@MandatoryFields
Scenario: (Credit Life Quotation)Verify user able to enter mandatory fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer
When user select Alliance Insurance Company (T) Ltd. as insurer
When user enter "Pravin Testing" as insured name
When user select date of birth
When user enter "2000000" as loan amount
When user enter "180" as period in month
When user click on client type dropdown
When user enter "Business Banking" as client type
When user select Business Banking as client type
When user click on compute button
When user click on insert button
#AddOn
When user click on addOn button
When user click on extension dropdown
When user enter "Terrorism" as extension
When user select on Terrorism as extension
When user enter "100000" as sum insured (AddOn)
When user enter "2.5" as rate%
When user enter "Credit Life Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
Then user able to view "Awaiting Receipt" as status


@AllFields
Scenario: (Credit Life Quotation)Verify user able to enter all fields and save quotation successfully
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
When user enter "Pravin Testing" as insured name
When user select date of birth
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
When user click on client type dropdown
When user enter "Business Banking" as client type
When user select Business Banking as client type
When user enter "2.25" as override% 
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
Then user able to view "Required Approval" as status