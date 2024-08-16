@All
Feature: Package Policy Quotation

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Package Policy" to search insurance type in search box
When user select Package Policy as insurance type from dropdown

@MandatoryFields
Scenario: (Package Policy Quotation)Verify user able to enter mandatory fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer
When user select Alliance Insurance Company (T) Ltd. as insurer
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user enter " Pravin Testing" as insured name
When user select "2 Wheel Comprehensive (Private)" as insurance class
When user enter "15641A56BIKE" as registration number
When user enter "TVS" as vehicle make
When user select TVS as vehicle make
When user enter "SCOOTY" as vehicle model
When user select "BIKE" as vehicle type
When user enter "2015" as manufacture year
When user enter "WHITE" as color
When user enter "1200000" as sum insured
When user click on compute button
When user click on insert button
When user scroll up to click on addOn button
When user click on addOn button
When user click on extension dropdown
When user enter "Terrorism" as extension
When user select Terrorism as extension
When user enter "720000" as sum insured (AddOn)
When user enter "3" as rate %
When user enter "Testing Package Policy" as description
When user click on insert button (AddOn)
When user click on save button
Then user able to view "Awaiting Receipt" as status



@AllFields
Scenario: (Package Policy Quotation)Verify user able to enter all fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer
When user select Alliance Insurance Company (T) Ltd. as insurer
When user click on business by dropdown
Then user select Demo User as business by
When user select on non-renewabale checkbox
When user enter "Manager654123" as contact person
When user select highest sum insured checkbox
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
When user select "2 Wheelers/ 3 Wheelers" as insurance type
#(EXCESS/BENEFITS)
#When user select excess buy-back checkbox
Then user enter "5" as excess buy-back
When user select geographical extension checkbox
Then user enter "2" as geographical extension
When user select loss of use check box
Then user enter "250000" as loss of use
When user select increased TPPD checkbox
Then user enter "3" as increased TPPD
When user select excess protector checkbox
Then user enter "0.22" as excess protector
#When user select excess PVT checkbox
Then user enter "0.21" as excess PVT
When user select accident checkbox
Then user enter "0.2" as accident
#(DISCOUNTS)
#When user select membership discount checkbox
Then user enter "2.5" as membership discount
When user select GPS tracking installed checkbox 
Then user enter "4.5" as GPS tracking installed
When user enter "1" as fleet/claim%
Then user enter "2.1" as additional discount%
When user enter " Pravin Testing" as insured name
When user select "2 Wheel Comprehensive (Private)" as insurance class
Then user enter "Vehicle DETAILS-215ASDD020sd" as other description
When user enter "15641A56BIKE" as registration number
When user enter "TVS" as vehicle make
When user select TVS as vehicle make
When user enter "SCOOTY" as vehicle model
When user select "BIKE" as vehicle type
Then user enter "412ENGINEnoteAE33" as engine No
When user enter "REFDF55615jpYT2" as chassis No
Then user enter "510kg" as gross weight
When user click on fuel type dropdown
When user enter "Petrol" as fuel type
Then user select Petrol as fuel type
When user enter "2015" as manufacture year
When user enter "2016" as registration year
When user enter "2" as seat
When user enter "125" as CC 
When user enter "WHITE" as color
When user select enable checkbox
Then user enter "15200" as windscreen sum insured
And user enter "15156" as accessories sum insured
Then user enter "Accessories INFO 1252ACCIoiy" as accessories information
When user enter "1200000" as sum insured
Then user enter "2.3" as override%
When user enter "98500" as TPPD free limit
When user enter "120000" as TPPD increase limit
When user enter "500000" as TPPD sum insured
When user enter "4120" as adjust premium
Then user enter "23" as sticker No
When user click on compute button
When user click on insert button
#AddOn
When user scroll up to click on addOn button
When user click on addOn button
When user click on extension dropdown
When user enter "Terrorism" as extension
When user select Terrorism as extension
When user enter "720000" as sum insured (AddOn)
When user enter "3" as rate %
When user enter "5" as commission rate%
When user enter "Testing Package Policy" as description
When user click on insert button (AddOn)
When user enter "502.3" as other fee
When user enter "50" as discount on commission %
When user click on save button
Then user able to view "Required Approval" as status