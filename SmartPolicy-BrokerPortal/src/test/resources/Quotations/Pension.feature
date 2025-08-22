@All
Feature: Pension Quotation 

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
 

@MandatoryFields
Scenario: (Pension Quotation) Verify user able to enter mandatory fields and save quotation successfully

When user click on add button
When user select "Pension" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user Select "Automated Testing Company" as insurer
When user enter "15244-51654-84125" as cover note number
When user enter "Pravin Testing" as insured name
When user enter "01/01/2000" as date of birth
When user enter "3500000" as sum assured
When user enter "420000" as premium
When user click on insert button
#Addon
When user click on addOn button
When user select "Others" as extension
When user enter "950000" as sum insured (AddOn)
When user enter "2.4" as rate%
When user enter "Pension Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
Then user able to view "Awaiting Receipt(Compliance Issues)" as status

@MandatoryFieldsNoAddon
Scenario: (Pension Quotation) Verify user able to enter mandatory fields and save quotation successfully

When user click on add button
When user select "Pension" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user Select "Automated Testing Company" as insurer
When user enter "15244-51654-84125" as cover note number
When user enter "Pravin Testing" as insured name
When user enter "01/01/2000" as date of birth
When user enter "3500000" as sum assured
When user enter "420000" as premium
When user click on insert button
When user click on save button
Then user able to view "Awaiting Receipt" as status


@AllFields
Scenario: (Pension Quotation) Verify user able to enter all fields and save quotation successfully

When user click on add button
When user select "Pension" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user Select "Automated Testing Company" as insurer
#When user click on business by dropdown
#Then user select Demo User as business by
When user select on non-renewabale checkbox
When user enter "Manager654123" as contact person
When user select on RI per class checkbox
When user Select on first loss payee checkbox
Then user enter "Payee101" as first loss payee
When user enter "Covering Details 10250 + Health CARE" as covering details
When user enter "Description of Risk 21582 +RISK COVERED" as description of risk
When user enter "123459876501234" as cover note
When user click on loss ratio forecast dropdown
When user enter "Profit making" as loss ratio forecast
Then user select Profit making as loss ratio forecast

#Policy Information
When user enter "Pravin Testing" as insured name
When user enter "01/01/2000" as date of birth
When user enter "3500000" as sum assured
When user enter "420000" as premium
When user enter "Birth Certificate" as ID type
When user enter "YTG1220S02" as ID number
When user enter "1200000" as annual salary
When user click on insert button

#AddOn
When user click on addOn button
When user click on extension dropdown
When user enter "Others" as extension
When user select on Others as extension
When user enter "950000" as sum insured (AddOn)
When user enter "2.4" as rate%
When user enter "5" as commission rate%
When user enter "Pension Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user enter "502.3" as other fee
When user enter "50" as discount on commission %
#Then user click on Re-Compute premium
When user click on save button
Then user able to view "Awaiting Receipt(Compliance Issues)" as status

@PrintQuote
 Scenario: User prints the Pension quote
   When user select "01/01/2025" as from date
   When user enter "Pension" as Insurance Type
   When user click on search button to find "Pension" quote
   When user enter quote number to search "Pension" quote
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