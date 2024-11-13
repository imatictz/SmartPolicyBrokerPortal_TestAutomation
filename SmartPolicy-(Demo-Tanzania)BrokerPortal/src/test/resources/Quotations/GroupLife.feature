@All
Feature: Group Life Quotation 

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Group Life" to search insurance type in search box
When user select Group Life as insurance type from dropdown

@MandatoryFields
Scenario: (Group Life Quotation) Verify user able to enter mandatory fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user enter "Pravin Testing" as insured name
When user enter "01/01/2000" as date of birth
When user enter "5000000" as sum assured
When user enter "620000" as premium
When user click on relationship dropdown
When user enter "self" as relationship
When user select self as realtionship
When user click on insert button
When user click on addOn button
When user click on extension dropdown
When user enter "Others" as extension
When user select on Others as extension
When user enter "230000" as sum insured (AddOn)
When user enter "3.5" as rate%
When user enter "Group Life Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
Then user able to view "Awaiting Receipt" as status



@AllFields
Scenario: (Group Life Quotation) Verify user able to enter all fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
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
When user enter "15244-51654-84125" as cover note number
When user click on loss ratio forecast dropdown
When user enter "Profit making" as loss ratio forecast
Then user select Profit making as loss ratio forecast
When user enter "Covering Details 10250 + Health CARE" as covering details
When user enter "Description of Risk 21582 +RISK COVERED" as description of risk
#Policy Information

When user select "Standard Rate" as insurance class
When user enter "Pravin Testing" as insured name
When user enter "01/01/2000" as date of birth
When user enter "Birth Certificate" as ID type
When user enter "YTG1220S02" as ID number
When user enter "Bahi" as branch name
When user enter "120324520RACC05" as account number
When user enter "1200000" as annual salary
When user enter "02/08/2023" as transaction date
When user enter "5000000" as sum assured
#When user enter "620000" as premium
When user click on relationship dropdown
When user enter "self" as relationship
When user select self as realtionship
When user enter "2300" as monthly fee
When user enter "152620"as premium
When user click on insert button
#AddOn
When user click on addOn button
When user click on extension dropdown
When user enter "Others" as extension
When user select on Others as extension
When user enter "230000" as sum insured (AddOn)
When user enter "3.5" as rate%
When user enter "5" as commission rate%
When user enter "Group Life Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user enter "502.3" as other fee
When user enter "50" as discount on commission %
Then user click on Re-Compute premium
When user click on save button
Then user able to view "Awaiting Receipt" as status
