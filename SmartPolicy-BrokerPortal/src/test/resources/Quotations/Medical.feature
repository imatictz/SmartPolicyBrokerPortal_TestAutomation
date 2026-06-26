@All @QUOTE @MEDICAL
Feature: Medical Quotation 

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
 

@MandatoryFields @MEDICAL
Scenario: (Medical Quotation) Verify user able to enter mandatory fields and save quotation successfully

When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Health Insurance           |
    | Insurance Type   | Medical Insurance          |
#When user select "Medical" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user enter "15244-51654-84125" as cover note number
When user select "Plan A" as insurance class
When user enter "01/01/2000" as date of birth
When user select "Self" as relationship
When user enter "160000" as total premium
When user click on insert button
#Addon
When user click on addOn button
When user select "All Risk Cover" as extension
When user enter "320000" as sum insured (AddOn)
When user enter "1.5" as rate%
When user enter "Medical Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
When user click on Ok button to accept commission alert message
Then user able to view "Awaiting Receipt(Compliance Issues)" as status

@MandatoryFieldsNoAddon  @MEDICAL
Scenario: (Medical Quotation) Verify user able to enter mandatory fields and save quotation successfully

When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Health Insurance           |
    | Insurance Type   | Medical Insurance          |
#When user select "Medical" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user enter "15244-51654-84125" as cover note number
When user select "Plan A" as insurance class
When user enter "01/01/2000" as date of birth
When user select "Self" as relationship
When user enter "160000" as total premium
When user click on insert button
When user click on save button
When user click on Ok button to accept commission alert message
Then user able to view "Awaiting Receipt" as status


@AllFields @MEDICAL
Scenario: (Medical Quotation) Verify user able to enter all fields and save quotation successfully

When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Health Insurance           |
    | Insurance Type   | Medical Insurance          |
#When user select "Medical" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
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
#When user enter "15244-51654-84125" as cover note number
When user click on loss ratio forecast dropdown
When user enter "Profit making" as loss ratio forecast
Then user select Profit making as loss ratio forecast
When user enter "Covering Details 10250 + Health CARE" as covering details
When user enter "Description of Risk 21582 +RISK COVERED" as description of risk
#Policy Information
When user select "Plan A" as insurance class
When user enter "01/01/2000" as date of birth
When user select "Birth Certificate" as ID type
When user enter "YTG1220S02" as ID number
When user select "Self" as relationship
When user enter "600000" as sum assured
When user enter "TravellingTOAFrica12032" as pre existing condition
#Limits & Premiums
When user enter "100000" as inpatient limit
Then user enter "2000" as inpatient premium
When user enter "200000" as outpatient limit
Then user enter "3200" as outpatient premium
When user enter "300000" as last expense limit
Then user enter "541" as last expense premium
When user enter "400000" as personal accident limit
Then user enter "954" as personal accident premium
When user enter "125000" as dental limit
Then user enter "321" as dental premium
When user enter "50000" as optical limit
Then user enter "451" as optical premium
When user enter "130000" as maternity limit
#When user enter "160000" as total premium
When user click on insert button
#AddOn
When user click on addOn button
When user click on extension dropdown
When user enter "All Risk Cover" as extension
When user select on All Risk Cover as extension
When user enter "320000" as sum insured (AddOn)
When user enter "1.5" as rate%
When user enter "5" as commission rate%
When user enter "Medical Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user enter "702.3" as other fee
When user enter "10" as discount on commission %
When user click on save button
When user click on Ok button to accept commission alert message
Then user able to view "Awaiting Receipt" as status

@PrintQuote  @MEDICAL
 Scenario: User prints the Medical quote
   When user select "01/09/2025" as from date
   When user enter "Medical Insurance" as Insurance Type
   When user click on search button to find "Medical Insurance" quote
   When user enter quote number to search "Medical Insurance" quote
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
  
@EditQuote  @MEDICAL
 Scenario: Verify user able to edit an existing Medical quote successfully
   When user select "15/09/2025" as from date
   When user enter "Medical Insurance" as Insurance Type
   When user click on search button to find "Medical Insurance" quote
   When user enter quote number to search "Medical Insurance" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on edit option
   
   #Non-Financial Change
   When user enter "Pravin Edit Test" as client name
   And user select "Pravin Edit Test" as client name
   When user select "Automated Testing Company" as insurer
   
   #Financial Change
   When user click on select icon to edit details
   When user select "Plan A" as insurance class
   When user enter "01/01/2005" as date of birth
   When user select "Self" as relationship
   When user enter "120000" as total premium
   When user click on update button to save policy information
   When user click on update button
   When user click on Ok button to accept commission alert
   Then user able to view "1003-Information modified successfully" as message
   
   
   
   
 

  