@All
Feature: Educare Life Insurance Quotation 

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations


@MandatoryFields
Scenario: (Educare Life Insurance Quotation) Verify user able to enter mandatory fields and save quotation successfully
When user click on add button
When user select "Educare Life Insurance" as insurance type
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user enter "121" as P.O. Box
When user select "South Africa" as place of birth
When user enter "Road" as street
When user enter "Village" as suburb
When user enter "City" as town
When user enter "Country" as region
When user select "Tanzania" as citizen
When user select "Single" as marital status
When user enter "Pravin Testing" as employer name
When user enter "5214EDRGno51" as employee number /national ID
When user enter "Worker" as occupation
When user select "tanzania" as tax payer country
When user enter "15/04/2023" as employment date
When user click on next button (First Page)

#Beneficiary 1

When user enter "Tester Testing Beneficiary 1" as name of beneficiary (For Beneficiary one)
When user enter "15/05/1988" as date of birth (For Beneficiary one)
When user select "Male" as gender (For Beneficiary one)
When user select "Self" as relationship to owner (For Beneficiary one)
When user enter "659544202" as telephone (For Beneficiary one)
When user enter "15" as percent of life benefit given (For Beneficiary one)
When user enter "Address No 1" as address (For Beneficiary one)

#Beneficiary 2

When user enter "Tester Testing Beneficiary 2" as name of beneficiary (For Beneficiary Two)
When user enter "01/02/1990" as date of birth (For Beneficiary Two)
When user select "Female" as gender (For Beneficiary Two)
When user select "employee" as relationship to owner (For Beneficiary Two)
When user enter "659544202" as telephone (For Beneficiary Two)
When user enter "30" as percent of life benefit given (For Beneficiary Two)
When user enter "Address No 2" as address (For Beneficiary Two)

#Beneficiary 3

When user enter "Tester Testing Beneficiary 3" as name of beneficiary (For Beneficiary Three)
When user enter "20/12/1998" as date of birth (For Beneficiary Three)
When user select "other" as gender (For Beneficiary Three)
When user select "son" as relationship to owner (For Beneficiary Three)
When user enter "659544202" as telephone (For Beneficiary Three)
When user enter "35" as percent of life benefit given (For Beneficiary Three)
When user enter "Address No 3" as address (For Beneficiary Three)

#Beneficiary 4

When user enter "Tester Testing Beneficiary 4" as name of beneficiary (For Beneficiary Four)
When user enter "06/05/2010" as date of birth (For Beneficiary Four)
When user select "Male" as gender (For Beneficiary Four)
When user select "brother" as relationship to owner (For Beneficiary Four)
When user enter "659544202" as telephone (For Beneficiary Four)
When user enter "20" as percent of life benefit given (For Beneficiary Four)
When user enter "Address No 4" as address (For Beneficiary Four)

#Guardian 4

When user enter "Tester Testing Guardian 4" as name of guardian/Parent (For Guardian Four)
When user enter "06/04/1995" as date of birth (For Guardian Four)
When user select "Female" as gender (For Guardian Four)
When user enter "659544202" as telephone (For Guardian Four)
When user enter "Guardian Address 4" as address (For Guardian Four)

#Beneficiary 1

When user select "Life Beneficiary One" as life beneficiary (For Beneficiary One)
When user enter "25" as percent of savings benefit given (For Beneficiary One)

#Beneficiary 2

When user select "Life Beneficiary Two" as life beneficiary (For Beneficiary Two)
When user enter "25" as percent of savings benefit given (For Beneficiary Two)

#Beneficiary 3

When user select "Life Beneficiary Three" as life beneficiary (For Beneficiary Three)
When user enter "25" as percent of savings benefit given (For Beneficiary Three)

#Beneficiary 4

When user select "Life Beneficiary Four" as life beneficiary (For Beneficiary Four)
When user enter "25" as percent of savings benefit given (For Beneficiary Four)
When user click on next button (Second Page)

#Cover Details

When user select "Option 5" as plan
When user enter "10" as terms(Year)

#Payment Details 
When user select "Cash" as payment method
#Premium Details
When user enter "594200" as saving premium
When user click on compute button
When user select "Yearly" as payment frequency
When user click on calculate schedule button
When user click on save button
Then user able to view "Awaiting Receipt" as status

@PrintQuote
 Scenario: User prints the Educare Life Insurance quote
   When user select "01/09/2025" as from date
   When user enter "Educare Life Insurance" as Insurance Type
   When user click on search button to find "Educare Life Insurance" quote
   When user enter quote number to search "Educare Life Insurance" quote
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
 Scenario: Verify user able to edit an existing Educare Life Insurance quote successfully
   When user select "15/09/2025" as from date
   When user enter "Educare Life Insurance" as Insurance Type
   When user click on search button to find "Educare Life Insurance" quote
   When user enter quote number to search "Educare Life Insurance" quote
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on edit option
   
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user enter "121" as P.O. Box
When user select "South Africa" as place of birth
When user enter "Road" as street
When user enter "Village" as suburb
When user enter "City" as town
When user enter "Country" as region
When user select "Tanzania" as citizen
When user select "Single" as marital status
When user enter "Pravin Testing" as employer name
When user enter "5214EDRGno51" as employee number /national ID
When user enter "Worker" as occupation
When user select "tanzania" as tax payer country
When user enter "15/04/2023" as employment date
When user click on next button (First Page)

#Beneficiary 1

When user enter "Tester Testing Beneficiary 1" as name of beneficiary (For Beneficiary one)
When user enter "15/05/1988" as date of birth (For Beneficiary one)
When user select "Male" as gender (For Beneficiary one)
When user select "Self" as relationship to owner (For Beneficiary one)
When user enter "659544202" as telephone (For Beneficiary one)
When user enter "15" as percent of life benefit given (For Beneficiary one)
When user enter "Address No 1" as address (For Beneficiary one)

#Beneficiary 2

When user enter "Tester Testing Beneficiary 2" as name of beneficiary (For Beneficiary Two)
When user enter "01/02/1990" as date of birth (For Beneficiary Two)
When user select "Female" as gender (For Beneficiary Two)
When user select "employee" as relationship to owner (For Beneficiary Two)
When user enter "659544202" as telephone (For Beneficiary Two)
When user enter "30" as percent of life benefit given (For Beneficiary Two)
When user enter "Address No 2" as address (For Beneficiary Two)

#Beneficiary 3

When user enter "Tester Testing Beneficiary 3" as name of beneficiary (For Beneficiary Three)
When user enter "20/12/1998" as date of birth (For Beneficiary Three)
When user select "other" as gender (For Beneficiary Three)
When user select "son" as relationship to owner (For Beneficiary Three)
When user enter "659544202" as telephone (For Beneficiary Three)
When user enter "35" as percent of life benefit given (For Beneficiary Three)
When user enter "Address No 3" as address (For Beneficiary Three)

#Beneficiary 4

When user enter "Tester Testing Beneficiary 4" as name of beneficiary (For Beneficiary Four)
When user enter "06/05/2010" as date of birth (For Beneficiary Four)
When user select "Male" as gender (For Beneficiary Four)
When user select "brother" as relationship to owner (For Beneficiary Four)
When user enter "659544202" as telephone (For Beneficiary Four)
When user enter "20" as percent of life benefit given (For Beneficiary Four)
When user enter "Address No 4" as address (For Beneficiary Four)

#Guardian 4

When user enter "Tester Testing Guardian 4" as name of guardian/Parent (For Guardian Four)
When user enter "06/04/1995" as date of birth (For Guardian Four)
When user select "Female" as gender (For Guardian Four)
When user enter "659544202" as telephone (For Guardian Four)
When user enter "Guardian Address 4" as address (For Guardian Four)

#Beneficiary 1

When user select "Life Beneficiary One" as life beneficiary (For Beneficiary One)
When user enter "25" as percent of savings benefit given (For Beneficiary One)

#Beneficiary 2

When user select "Life Beneficiary Two" as life beneficiary (For Beneficiary Two)
When user enter "25" as percent of savings benefit given (For Beneficiary Two)

#Beneficiary 3

When user select "Life Beneficiary Three" as life beneficiary (For Beneficiary Three)
When user enter "25" as percent of savings benefit given (For Beneficiary Three)

#Beneficiary 4

When user select "Life Beneficiary Four" as life beneficiary (For Beneficiary Four)
When user enter "25" as percent of savings benefit given (For Beneficiary Four)
When user click on next button (Second Page)

#Cover Details

When user select "Option 5" as plan
When user enter "10" as terms(Year)

#Payment Details 
When user select "Cash" as payment method
#Premium Details
When user enter "594200" as saving premium
When user click on compute button
When user select "Yearly" as payment frequency
When user click on calculate schedule button
When user click on save button
Then user able to view "Awaiting Receipt" as status
   