@All
Feature: Travel Insurance Quotation 

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
 

@MandatoryFields
Scenario: (Travel Insurance Quotation) Verify user able to enter mandatory fields and save quotation successfully
When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Travel Insurance           |
    | Insurance Type   | Travel Insurance           |
#When user select "Travel Insurance" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user select "South Africa" as country travelling to
When user select "Complete Package" as plan
When user enter "15244-51654-84125" as cover note number
When user enter "25428Af111" as passport number
When user enter "01-Jan-2000" as date of birth
When user enter "25/11/2024" as expiry date
When user select "SELF" as relationship
When user enter "5000" as adjust premium
When user click on compute button
When user click on insert button
#Addon
When user click on addOn button
When user click on extension dropdown
When user enter "Others" as extension
When user select on Others as extension
When user enter "590000" as sum insured (AddOn)
When user enter "4" as rate%
When user enter "Travel Insurance Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
When user click on Ok button to accept commission alert message
Then user able to view "Awaiting Receipt(Compliance Issues)" as status

@MandatoryFieldsNoAddon
Scenario: (Travel Insurance Quotation) Verify user able to enter mandatory fields and save quotation successfully
When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Travel Insurance           |
    | Insurance Type   | Travel Insurance           |
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user select "Complete Package" as plan
When user select "South Africa" as country travelling to
When user enter "15244-51654-84125" as cover note number
When user enter "25428Af111" as passport number
When user enter "01-Jan-2000" as date of birth
When user enter "25/11/2024" as expiry date
When user select "SELF" as relationship
When user enter "621234568" as mobile number
When user enter "962.3" as adjust premium
When user click on compute button
When user click on insert button
When user click on save button
When user click on Ok button to accept commission alert message
Then user able to view "Awaiting Receipt" as status



@AllFields
Scenario: (Travel Insurance Quotation) Verify user able to enter all fields and save quotation successfully
When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Travel Insurance           |
    | Insurance Type   | Travel Insurance           |
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
#When user click on country travelling to dropdown
When user select "South Africa" as country travelling to
When user enter "ByAIR1025-BUS842@#$1206" as route information
When user select "Complete Package" as plan
Then user select Demo User as business by
When user enter "Manager654123" as contact person
#When user select on RI per class checkbox
When user Select on first loss payee checkbox
Then user enter "Payee101" as first loss payee
When user select on borrower type check box
When user click on borrower type dropdown
And user enter "Retail Banking" as borrower type
Then user select Retail Banking as borrower type
When user enter "Pravin Test Acc" as borrower account name
When user enter "9541203288" as borrower account number
When user enter "15244-51654-84125" as cover note number
When user click on loss ratio forecast dropdown
When user enter "Profit making" as loss ratio forecast
Then user select Profit making as loss ratio forecast
#Policy Information
When user enter "25428Af111" as passport number
When user enter "01-Jan-2000" as date of birth
When user enter "25/12/2024" as expiry date
When user select "SELF" as relationship
When user enter "TravellingTOAFrica12032" as pre existing condition
When user enter "62101" as adjust premium
When user click on compute button
When user click on insert button
#AddOn
When user click on addOn button
When user click on extension dropdown
When user enter "Others" as extension
When user select on Others as extension
When user enter "590000" as sum insured (AddOn)
When user enter "4" as rate%
When user enter "5" as commission rate%
When user enter "Travel Insurance Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user enter "502.3" as other fee
When user enter "50" as discount on commission %
Then user click on Re-Compute premium
When user click on save button
When user click on Ok button to accept commission alert message
Then user able to view "Required Approval" as status


@Edit
Scenario: (Travel Insurance Quotation) Verify user able to enter mandatory fields and save quotation successfully
When user select "01-Jan-2026" as from date
When user enter "Travel Insurance" as Insurance Type
When user click on search button to find "Travel Insurance" quote
When user enter quote number to search "Travel Insurance" quote
When user click on search button
And user clicks on the actions dropdown
And user clicks on edit option
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "South Africa" as country travelling to
When user select "Complete Package" as plan
When user enter "15244-51654-84125" as cover note number
When user enter "25428Af111" as passport number
When user enter "01-Jan-2000" as date of birth
When user enter "25/11/2024" as expiry date
When user select "SELF" as relationship
When user click on update button to save policy information
When user click on update button
When user click on Ok button to accept commission alert
Then user able to view "1003-Information modified successfully" as message
