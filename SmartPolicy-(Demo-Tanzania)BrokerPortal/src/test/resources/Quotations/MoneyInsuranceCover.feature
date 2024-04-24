@All
Feature: Money Insurance Cover Quotation 

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Money Insurance Cover" to search insurance type in search box
When user select money insurance cover as insurance type from dropdown

@MandatoryFields
Scenario: (Money Insurance Cover)Verify user able to enter mandatory fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name in quotation
When user select client name as Pravin Testing
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer name
When user click to select Alliance Insurance Company (T) Ltd.as insurer name
When user click on insurance class dropdown
When user enter "Standard Rate" as insurance class
When user click to select standard rate as insurance class
When user enter "100000" as sum insured amount in policy information
When user enter "Money Insurance Cover Testing" as description in policy information
When user click on compute button
When user click on insert button 
#AddOn
Then user click on addOn button to enter addOn details
When user click on extension dropdown
When user enter "All Risk Cover" as extension
When user click to select All Risk Cover as extension
When user enter "100000" as sum insured amount in addOn 
When user enter "10" as rate%  
When user enter "Money Insurance Cover Testing " as description in addOn
When user click on insert button addon
When user click on save button
Then user able to view "Awaiting Receipt" as status


@AllFields
Scenario: (Money Insurance Cover)Verify user able to enter all fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name in quotation
When user select client name as Pravin Testing
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer name
When user click to select Alliance Insurance Company (T) Ltd.as insurer name
When user click on business by dropdown
Then user select Demo User as business by
When user enter "1425DT10" as unique property identification
When user select on non-renewabale checkbox
When user enter "Manager654123" as contact person
When user select on RI per class checkbox     
When user select on limit of liability amount checkbox
Then user enter "1524025" as limit of liability amount
When user Select on first loss payee checkbox
Then user enter "Payee101" as first loss payee
When user select on borrower type check box
When user click on borrower type dropdown
And user enter "Retail Banking" as borrower type
Then user select Retail Banking as borrower type
When user enter "15244-51654-84125" as cover note number
When user click on loss ratio forecast dropdown
When user enter "Profit making" as loss ratio forecast
Then user select Profit making as loss ratio forecast
When user enter "Covering Details 10250 + Health CARE" as covering details
When user enter "Description of Risk 21582 +RISK COVERED" as description of risk
#Policy Information-01
When user click on insurance class dropdown
When user enter "Standard Rate" as insurance class
When user click to select standard rate as insurance class
When user enter "100000" as sum insured amount in policy information
When user enter "Main Branch" as branch name
When user enter "Money Insurance Cover Testing" as description in policy information
When user enter "12" as override%
When user enter "500" as adjust premium
When user click on compute button
When user click on insert button 
#Policy Information-02
When user click on insurance class dropdown2
When user enter "Annual Cash Carrying" as insurance class
When user click to select Annual Cash Carrying as insurance class
When user enter "200000" as sum insured amount in policy information
When user enter "Main Branch" as branch name
When user enter "Money Insurance Cover Testing" as description in policy information
When user enter "12" as override%
When user enter "500" as adjust premium
When user click on compute button
When user click on insert button 
#AddOn-01
Then user click on addOn button to enter addOn details
When user click on extension dropdown
When user enter "All Risk Cover" as extension
When user click to select All Risk Cover as extension
When user enter "100000" as sum insured amount in addOn 
When user enter "10" as rate%  
When user enter "5" as commission rate%
When user enter "Money Insurance Cover Testing " as description in addOn
When user click on insert button addon
#Addon-02
When user click on extension dropdown
When user enter "Others" as extension
When user click to select Others as extension
When user enter "100000" as sum insured amount in addOn 
When user enter "10" as rate%  
When user enter "5" as commission rate%
When user enter "Money Insurance Cover Testing " as description in addOn
When user click on insert button addon
When user enter "502.3" as other fee
When user enter "50" as discount on commission %
Then user click on Re-Compute premium
When user click on save button
Then user able to view "Required Approval" as status