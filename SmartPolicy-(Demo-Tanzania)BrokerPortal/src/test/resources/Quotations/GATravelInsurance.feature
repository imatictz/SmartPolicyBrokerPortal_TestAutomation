@All
Feature: GA Travel Insurance Quotation 

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Travel Insurance" to search insurance type in search box
When user select GA Travel Insurance as insurance type from dropdown

@MandatoryFields
Scenario: (GA Travel Insurance Quotation) Verify user able to enter mandatory fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user Select "Alliance Insurance Company (T) Ltd." as insurer
When user click on country travelling to dropdown
When user enter "South Africa" as country travelling to
When user select Sounth Africa as country travelling to
When user click on plan dropdown
When user enter "Medical Only" as plan
When user select Plan Africa as plan
When user enter "25428Af111" as passport number
When user enter "01/01/2000" as date of birth
When user enter "25/04/2024" as expiry date
When user click on relationship dropdown
When user enter "Direct" as relationship
When user select self as realtionship
#When user click on compute button
When user click on insert button
When user click on addOn button
When user click on extension dropdown
When user enter "Others" as extension
When user select on Others as extension
When user enter "590000" as sum insured (AddOn)
When user enter "4" as rate%
When user enter "GA Travel Insurance Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
When user click on Ok button to accept commission alert message
Then user able to view "Awaiting Receipt" as status



@AllFields
Scenario: (GA Travel Insurance Quotation) Verify user able to enter all fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user Select "Alliance Insurance Company (T) Ltd." as insurer
When user click on country travelling to dropdown
When user enter "South Africa" as country travelling to
When user select Sounth Africa as country travelling to
When user enter "ByAIR1025-BUS842@#$1206" as route information
When user click on plan dropdown
When user enter "Medical Only" as plan
When user select Plan Africa as plan
When user click on business by dropdown
Then user select Demo User as business by
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
#Policy Information
When user enter "25428Af111" as passport number
When user enter "01/01/2000" as date of birth
When user enter "25/04/2024" as expiry date
When user click on relationship dropdown
When user enter "Direct" as relationship
When user select self as realtionship
When user enter "TravellingTOAFrica12032" as pre existing condition
When user enter "-962.3" as adjust premium
#When user click on compute button
When user click on insert button
#AddOn
When user click on addOn button
When user click on extension dropdown
When user enter "Others" as extension
When user select on Others as extension
When user enter "590000" as sum insured (AddOn)
When user enter "4" as rate%
When user enter "5" as commission rate%
When user enter "GA Travel Insurance Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user enter "502.3" as other fee
When user enter "50" as discount on commission %
Then user click on Re-Compute premium
When user click on save button
When user click on Ok button to accept commission alert message
Then user able to view "Awaiting Receipt(Compliance Issues)" as status