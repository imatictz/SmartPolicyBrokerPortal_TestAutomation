@All
Feature: Educare Life Insurance Quotation 

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Educare Life Insurance" to search insurance type in search box
When user select Educare Life Insurance as insurance type from dropdown

@MandatoryFields
Scenario: (Educare Life Insurance Quotation) Verify user able to enter mandatory fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user click on place of birth dropdown
When user enter "South Africa" as place of birth
When user select South Africa as place of birth
When user enter "121" as P.O. Box
When user enter "Road" as street
When user enter "Village" as suburb
When user enter "City" as town
When user enter "Country" as region
When user click on citizen dropdown
When user enter "Tanzania" as citizen
When user select Tanzania as citizen
When user click on marital status dropdown
When user enter "Single" as marital status
When user select single as marital status
When user enter "Pravin Testing" as employer name
When user enter "5214EDRGno51" as employee number /national ID
When user enter "Worker" as occupation
When user click on tax payer country dropdown
When user enter "tanzania" as tax payer country
When user select tanzania as tax payer country
When user enter "15/04/2023" as employment date
When user click on next button (First Page)
When user enter "Tester Testing Beneficiary 1" as name of beneficiary (For Beneficiary one)
When user enter "15/05/1988" as date of birth (For Beneficiary one)
When user click on gender dropdown (For Beneficiary one)
When user enter "Male" as gender (For Beneficiary one)
When user select Male as gender (For Beneficiary one)
When user click on relationship to owner dropdown (For Beneficiary one)
When user enter "Self" as relationship to owner (For Beneficiary one)
When user select self as relationship to owner (For Beneficiary one)
When user enter "659544202" as telephone (For Beneficiary one)
When user enter "15" as percent of life benefit given (For Beneficiary one)
When user enter "Address No 1" as address (For Beneficiary one)
When user enter "Tester Testing Beneficiary 2" as name of beneficiary (For Beneficiary Two)
When user enter "01/02/1990" as date of birth (For Beneficiary Two)
When user click on gender dropdown (For Beneficiary Two)
When user enter "Female" as gender (For Beneficiary Two)
When user select female as gender (For Beneficiary Two)
When user click on relationship to owner dropdown (For Beneficiary Two)
When user enter "employee" as relationship to owner (For Beneficiary Two)
When user select employee as relationship to owner (For Beneficiary Two)
When user enter "659544202" as telephone (For Beneficiary Two)
When user enter "30" as percent of life benefit given (For Beneficiary Two)
When user enter "Address No 2" as address (For Beneficiary Two)
When user enter "Tester Testing Beneficiary 3" as name of beneficiary (For Beneficiary Three)
When user enter "20/12/1998" as date of birth (For Beneficiary Three)
When user click on gender dropdown (For Beneficiary Three)
When user enter "other" as gender (For Beneficiary Three)
When user select other as gender (For Beneficiary Three)
When user click on relationship to owner dropdown (For Beneficiary Three)
When user enter "son" as relationship to owner (For Beneficiary Three)
When user select son as relationship to owner (For Beneficiary Three)
When user enter "659544202" as telephone (For Beneficiary Three)
When user enter "35" as percent of life benefit given (For Beneficiary Three)
When user enter "Address No 3" as address (For Beneficiary Three)
When user enter "Tester Testing Beneficiary 4" as name of beneficiary (For Beneficiary Four)
When user enter "06/05/2010" as date of birth (For Beneficiary Four)
When user click on gender dropdown (For Beneficiary Four)
When user enter "Male" as gender (For Beneficiary Four)
When user select male as gender (For Beneficiary Four)
When user click on relationship to owner dropdown (For Beneficiary Four)
When user enter "brother" as relationship to owner (For Beneficiary Four)
When user select brother as relationship to owner (For Beneficiary Four)
When user enter "659544202" as telephone (For Beneficiary Four)
When user enter "20" as percent of life benefit given (For Beneficiary Four)
When user enter "Address No 4" as address (For Beneficiary Four)
When user enter "Tester Testing Guardian 4" as name of guardian/Parent (For Guardian Four)
When user enter "06/04/1995" as date of birth (For Guardian Four)
When user click on gender dropdown (For Guardian Four)
When user enter "Female" as gender (For Guardian Four)
When user select Female as gender (For Guardian Four)
When user enter "659544202" as telephone (For Guardian Four)
When user enter "Guardian Address 4" as address (For Guardian Four)
When user select "Life Beneficiary One" as life beneficiary (For Beneficiary One)
When user enter "25" as percent of savings benefit given (For Beneficiary One)
When user select "Life Beneficiary Two" as life beneficiary (For Beneficiary Two)
When user enter "25" as percent of savings benefit given (For Beneficiary Two)
When user select "Life Beneficiary Three" as life beneficiary (For Beneficiary Three)
When user enter "25" as percent of savings benefit given (For Beneficiary Three)
When user select "Life Beneficiary Four" as life beneficiary (For Beneficiary Four)
When user enter "25" as percent of savings benefit given (For Beneficiary Four)
When user click on next button (Second Page)
When user click on plan dropdown
When user enter "Option 5" as plan
When user click on option Five as plan 
When user enter "10" as terms(Year)
When user select "Cash" as payment method
When user enter "594200" as saving premium
When user click on compute button
When user select "Yearly" as payment frequency
When user click on calculate schedule button
When user click on save button