@All
Feature: New Client details

Background:

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Money Insurance Cover" to search insurance type in search box
When user select money insurance cover as insurance type from dropdown
When user click on Click here for New Client link

@RegressionTest       @MandatoryFields
Scenario: (ClientDetails) Enter new client details with mandatory fields

When user click on title dropdown
When user enter "Mr" as title in search box
When user click on Mr from dropdown
When user enter "TestAutomation102" as client name
When user click in account number field
When user enter "5412502145021002" as account number
When user click on ID type dropdown
When user enter "Birth certificate" to search ID type in search box
When user click on birth certificate as ID type from dropdown
When user enter "5412502145021002" as ID number
When user click on date of birth icon
When user click on previous button
When user select year from calender
When user select month from calender
When user click on next button
When user select day from calender
When user click on nationality dropdown
When user enter "Tanzania" to search nationality in search box
When user click on tanzania as nationality
When user enter "Bahi" as place of birth
When user click on gender dropdown
When user enter "Male" to search gender in search box
When user click on male as gender
When user click on region/province dropdown
When user enter "Dodoma" to search region/province in search box
When user click on dodoma as region/province
When user click on district dropdown
When user enter "Bahi" to search district in search box
When user click on bahi as district
When user enter "Tree" as cell/street
When user enter "House No.12 XYZ World" as address
When user enter "659544202" as mobile No One
When user enter "xxxxxxx503@gmail.com" as email id one
When user click on save button to save client details
Then user able to view "Money Insurance Cover Quotation"

@AllFields
Scenario: (ClientDetails) Enter new client details with all fields

When user click on title dropdown
When user enter "Mr" as title in search box
When user click on Mr from dropdown
When user enter "TestAutomation202" as client name
When user click in account number field
When user enter "564548465468482002" as account number
When user click on ID type dropdown
When user enter "Birth certificate" to search ID type in search box
When user click on birth certificate as ID type from dropdown
When user enter "564548465468482002" as ID number
When user enter "215112165151115" as TIN/PAN
When user enter "32189412349515" as ZRB No
When user click on date of birth icon
When user click on previous button
When user select year from calender
When user select month from calender
When user click on next button
When user select day from calender
When user click on nationality dropdown
When user enter "Tanzania" to search nationality in search box
When user click on tanzania as nationality
When user enter "Bahi" as place of birth
When user click on gender dropdown
When user enter "Male" to search gender in search box
When user click on male as gender
When user click on occupation dropdown
When user enter "Banker" as occupation
When user select banker as occupation 
When user select "None" as Disability Status 
When user select "Corporates" as Client Sub Status
Then user select related party checkbox
When user enter "TPKUT152AB" as VRN/GST
When user click on region/province dropdown
When user enter "Dodoma" to search region/province in search box
When user click on dodoma as region/province
When user click on district dropdown
When user enter "Bahi" to search district in search box
When user click on bahi as district
When user enter "Sector 5" as sector
When user enter "Tree" as cell/street
When user enter "Bahi" as village
When user enter "212-693-2377" as fax
When user enter "Person10" as profile ID
When user click on profile category dropdown
When user enter "Main" as profile category
When user select main as profile category
When user enter "Indo251TC" as screening group ID
When user enter "255-145236962" as Telephone No One
When user enter "255-145236961" as Telephone No Two
When user enter "255-145236963" as Telephone No Three
When user enter "House No.12 XYZ World" as address
When user enter "659544202" as mobile No One
When user enter "659544202" as mobile No Two
When user enter "659544202" as mobile No Three
#When user select email checkbox
When user enter "xxxxxxx102@gmail.com" as email id one
When user enter "xxxxxxx302@gmail.com" as email id two
When user enter "xxxxxxx402@gmail.com" as email id three
When user select Email checkbox
When user select tax exempted checkbox
When user select PEP customer radiobutton
When user click on AML risk category dropdown
When user enter "Medium" as AML risk category
When user select medium as AML risk category
When user enter "12/08/2023" as appointment date
When user enter "02/06/2025" as mandate expiry
When user click on save button to save client details
Then user able to view "Money Insurance Cover Quotation"


@Corporate
Scenario: (ClientDetails) Enter new client details with all fields for corporate

When user click on title dropdown
When user enter "M/S" as title in search box
When user click on Mr from dropdown
When user enter "TestAutomation302" as client name
When user click in account number field
When user enter "654851846543002" as account number
When user click on ID type dropdown
When user enter "Company Incorporation Certificate Number" to search ID type in search box
When user click on Company Incorporation Certificate Number as ID type from dropdown
When user enter "654851846543002" as ID number
When user enter "215112165151162" as TIN/PAN
When user enter "321894123495" as ZRB No
When user select "None" as Disability Status 
When user select "Corporates" as Client Sub Status
Then user select related party checkbox
When user select "Shareholders" as related party
When user select "Direct" as relationship
When user click on business type dropdown
When user enter "Automobile Manufacturing" as business type
When user select Automobile Manufacturing as business type
When user click on country of registration dropdown
When user enter "South Africa" as country of registration
When user select South Africa as country of registration
When user enter "04/08/2022" as registration date
When user enter "Manager1520" as contact person
When user enter "TPKUT152ABK" as VRN/GST
When user click on region/province dropdown
When user enter "Dodoma" to search region/province in search box
When user click on dodoma as region/province
When user click on district dropdown
When user enter "Bahi" to search district in search box
When user click on bahi as district
When user enter "Sector 5" as sector
When user enter "Tree" as cell/street
When user enter "Bahi" as village
When user enter "212-693-2377" as fax
When user enter "Person10" as profile ID
When user click on profile category dropdown
When user enter "Main" as profile category
When user select main as profile category
When user enter "Indo251TC" as screening group ID
When user enter "255-145236962" as Telephone No One
When user enter "255-145236961" as Telephone No Two
When user enter "255-145236963" as Telephone No Three
When user enter "House No.12 XYZ World" as address
When user enter "659544202" as mobile No One
When user enter "659544202" as mobile No Two
When user enter "659544202" as mobile No Three
#When user select email checkbox
When user enter "xxxxxxx502@gmail.com" as email id one
When user enter "xxxxxxx602@gmail.com" as email id two
When user enter "xxxxxxx702@gmail.com" as email id three
When user select Email checkbox
When user select tax exempted checkbox
When user select PEP customer radiobutton
When user click on AML risk category dropdown
When user enter "Medium" as AML risk category
When user select medium as AML risk category
When user enter "12/08/2023" as appointment date
When user enter "02/06/2025" as mandate expiry
When user click on save button to save client details
Then user able to view "Money Insurance Cover Quotation"

