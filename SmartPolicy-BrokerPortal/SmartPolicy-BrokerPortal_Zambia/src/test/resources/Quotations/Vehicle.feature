@All
Feature: Vehicle Quotation

Background: 
 
When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations

 
@MandatoryFields
Scenario: (Vehicle)Verify user able to enter mandatory fields and save quotation successfully

When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Motor Insurance            |
    | Insurance Type   | Vehicle                    |
#When user select "Vehicle" as insurance types
When user enter "Pravin Testing Broker" as client name in vehicle quotation
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user click on motor type dropdown
When user enter "Registered" as motor type 
When user click on Registered as motor type
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "2 Wheel Comprehensive (Private)" as insurance class
When user select "Sole Proprietor" as owner category
When user select "Private" as motor usage
When user enter "CODE" as registration number
When user enter "632541A" as chasis number
When user enter "TVS" as vehicle make
When user select TVS as vehicle make
When user enter "SCOOTY" as vehicle model
When user select SCOOTY as vehicle model
When user click on vehicle type dropdown
When user enter "BIKE" as vehicle type
When user click on BIKE as vehicle type
When user enter "6523SCOOTY125" as model number
When user enter "524789931EN" as engine number
When user click on fuel type dropdown
When user enter "CNG" as fuel type
When user click on CNG as fuel type
When user enter "2015" as manufacture year
When user enter "2" as seat
When user enter "125" as CC
When user enter "White" as color
When user enter "101" as gross weight
When user enter "97" as tare weight
When user enter "2" as number of axel
When user enter "1" as axel distance
When user enter "1500000" as sum insured
When user click on compute button
When user click on insert button (Policy Information)
When user click on OK button for commission alert
When user click on compute button
#When user click on compute button to update record
#When user click on addon button
#When user select "Earthquake"as extension
#When user enter sum insured as "100000"
#When user enter "10" as rate%
#When user enter "Testing Vehicle" as description
#When user click on insert button
When user click on save button
When user click on OK button to accept commission rate alert
Then user able to view "Awaiting Receipt" as status

@MandatoryFieldsNoAddon
Scenario: (Vehicle)Verify user able to enter mandatory fields and save quotation successfully

When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Motor Insurance            |
    | Insurance Type   | Vehicle                    |
#When user select "Vehicle" as insurance types
When user enter "Pravin Testing Broker" as client name in vehicle quotation
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
When user click on motor type dropdown
When user enter "Registered" as motor type 
When user click on Registered as motor type
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "2 Wheel Comprehensive (Private)" as insurance class
When user select "Sole Proprietor" as owner category
When user select "Private" as motor usage
When user enter "CODE" as registration number
When user enter "632541Al" as chasis number
When user enter "TVS" as vehicle make
When user select TVS as vehicle make
When user enter "SCOOTY" as vehicle model
When user select SCOOTY as vehicle model
When user click on vehicle type dropdown
When user enter "BIKE" as vehicle type
When user click on BIKE as vehicle type
When user enter "6523SCOOTY125" as model number
When user enter "524789931EN" as engine number
When user click on fuel type dropdown
When user enter "CNG" as fuel type
When user click on CNG as fuel type
When user enter "2015" as manufacture year
When user enter "2" as seat
When user enter "125" as CC
When user enter "White" as color
When user enter "101" as gross weight
When user enter "97" as tare weight
When user enter "2" as number of axel
When user enter "1" as axel distance
When user enter "150000" as sum insured
When user click on compute button
When user click on insert button (Policy Information)
When user click on OK button for commission alert
When user click on compute button
When user click on save button
When user click on OK button to accept commission rate alert
Then user able to view "Awaiting Receipt" as status



@AllFields
Scenario: (Vehicle)Verify user able to enter all fields and save quotation successfully

When user click on add button
When user enter product discovery details :
    | Field            | Value                      |
    | Select Insurer   | Automated Testing Company  |
    | Policy Category  | Motor Insurance            |
    | Insurance Type   | Vehicle                    |
#When user select "Vehicle" as insurance types
When user enter "Pravin Testing Broker" as client name in vehicle quotation
When user select Pravin Testing as client name
When user select "Automated Testing Company" as insurer
And user select "90 days" as period
When user click on motor type dropdown
When user enter "Registered" as motor type 
When user click on Registered as motor type
#When user click on business by dropdown
#Then user select Demo User as business by
When user enter "FILE50@ty20" as file No
When user select on non-renewabale checkbox
When user enter "Manager654123" as business contact person
When user Select on first loss payee checkbox
Then user enter "Payee101" as first loss payee
When user select on borrower type check box
When user click on borrower type dropdown
And user enter "Retail Banking" as borrower type
Then user select Retail Banking as borrower type
When user enter "Pravin Test Acc" as borrower account name
When user enter "9541203288" as borrower account number
When user click on loss ratio forecast dropdown
When user enter "Profit making" as loss ratio forecast
Then user select Profit making as loss ratio forecast
#Policy Information
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
When user select excess PVT checkbox
Then user enter "0.21" as excess PVT
When user select accident checkbox
Then user enter "0.2" as accident
#When user select family extension checkbox
Then user enter "0.2" as family extension
When user click on claim excess type dropdown
And user enter "ON SUM ASSURED" as claim excess
Then user select ON SUM ASSURED as claim excess
When user enter "6.3" as claim excess percent
#(DISCOUNTS)
When user enter "1" as fleet/claim%
When user click on by percent/amount dropdown
And user enter "By Percent" as by percent/amount
Then user select By Percent as by percent/amount
When user enter "1200" as stamp duty
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "2 Wheel Comprehensive (Private)" as insurance class
When user select "Sole Proprietor" as owner category
When user select "Private" as motor usage
When user enter "CODE" as registration number
When user enter "632541A" as chasis number
When user enter "TVS" as vehicle make
When user select TVS as vehicle make
When user enter "SCOOTY" as vehicle model
When user select SCOOTY as vehicle model
When user click on vehicle type dropdown
When user enter "BIKE" as vehicle type
When user click on BIKE as vehicle type
When user enter "6523SCOOTY125" as model number
When user enter "524789931EN" as engine number
When user click on fuel type dropdown
When user enter "CNG" as fuel type
When user click on CNG as fuel type
When user enter "2015" as manufacture year
When user enter "2016" as registration year
When user enter "2" as seat
When user enter "125" as CC
When user enter "White" as color
When user enter "101" as gross weight
When user enter "97" as tare weight
When user select enable checkbox
Then user enter "15200" as windscreen sum insured
And user enter "15156" as accessories sum insured
Then user enter "Accessories INFO 1252ACCIoiy" as accessories information
When user enter "2" as number of axel
When user enter "1" as axel distance
When user enter "150000" as sum insured
Then user enter "15" as override%
When user enter "98500" as TPPD free limit
When user enter "120000" as TPPD increase limit
When user enter "500000" as TPPD sum insured
When user enter "4120" as adjust premium
#Then user enter "23" as sticker/other fee
#When user enter "2102" as PH /Guaranty Fund			
When user click on compute button
When user click on insert button (Policy Information)
When user click on OK button for commission alert
When user click on compute button
When user click on save button
When user click on OK button to accept commission rate alert
Then user able to view "Awaiting Receipt(Compliance Issues)" as status

@PrintQuote
 Scenario: User prints the Motor quote
   When user select "01-Jan-2026" as from date
   When user enter "Motor" as Insurance Type
   When user click on search button to find "Motor" quote
   When user enter quote number to search "Motor" quote
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
  
@EditQuote
 Scenario: Verify user able to edit an existing Motor quote successfully
   When user select "01-Jan-2026" as from date
   When user enter "Motor" as Insurance Type
   When user click on search button to find "Motor" quote
   When user enter quote number to search "Motor" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on edit option
   
   #Non-Financial Change
   When user enter "Pravin Edit Test" as client name in vehicle quotation
   And user select "Pravin Edit Test" as client name
   When user select "Automated Testing Company" as insurer
   
   #Financial Change
   When user click on select icon to edit details
   When user click on motor type dropdown
When user enter "Registered" as motor type 
When user click on Registered as motor type
When user select "Private Vehicle" as insurance type
When user select "comprehensive" as insurance class
When user select "Corporate" as owner category
When user select "Private" as motor usage
When user enter "CODE" as registration number
When user enter "632541B" as chasis number
When user enter "TVS KING" as vehicle make
When user select TVS as vehicle make
When user enter "TVS-5" as vehicle model
When user select SCOOTY as vehicle model
When user click on vehicle type dropdown
When user enter "BIKE" as vehicle type
When user click on BIKE as vehicle type
When user enter "6523SCOOTY127" as model number
When user enter "524789325EN" as engine number
When user click on fuel type dropdown
When user enter "CNG" as fuel type
When user click on CNG as fuel type
When user enter "2024" as manufacture year
When user enter "2" as seat
When user enter "250" as CC
When user enter "Red" as color
When user enter "110" as gross weight
When user enter "90" as tare weight
When user enter "5" as number of axel
When user enter "10" as axel distance
When user enter "2000000" as sum insured
   When user click on compute button
   When user click on update button to save policy information
   When user click on Ok button to accept commission alert
   When user click on update button
   
   @Positive
   Scenario: Upload a file below size limit (1999 KB)
   When user select "15/09/2025" as from date
   When user enter "Motor" as Insurance Type
   When user click on search button to find "Motor" quote
   When user enter quote number to search "Motor" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on attach documents option
   When the user selects a file "ValidDocument_1999KB.pdf" of size 1998 KB
   Then the selected file "ValidDocument_1999KB.pdf" should be displayed in the upload field
   And clicks on the Upload button
   Then the uploaded file "ValidDocument_1999KB.pdf" should be displayed in the uploaded files list
   And the user able to view "2001-Document uploaded successfully" as upload status

   @Boundary
   Scenario: Upload a file at exact size limit (2000 KB)
   When user select "15/09/2025" as from date
   When user enter "Motor" as Insurance Type
   When user click on search button to find "Motor" quote
   When user enter quote number to search "Motor" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on attach documents option
   When the user selects a file "ExactLimit_2000KB.pdf" of size 1999 KB
   Then the selected file "ExactLimit_2000KB.pdf" should be displayed in the upload field
   And clicks on the Upload button
   Then the uploaded file "ExactLimit_2000KB.pdf" should be displayed in the uploaded files list
   And the user able to view "2001-Document uploaded successfully" as upload status

   @Negative
   Scenario: Upload a file exceeding size limit (2001 KB)
   When user select "15/09/2025" as from date
   When user enter "Motor" as Insurance Type
   When user click on search button to find "Motor" quote
   When user enter quote number to search "Motor" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on attach documents option
   When the user selects a file "OverLimit_2001KB.pdf" of size 2000 KB
   And clicks on the Upload button
   Then the user able to view "2001-Document uploaded successfully" as error message
   


