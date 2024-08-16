@All
Feature: AccidentalDamage Quotation 

Background: 
Given user provide browser name and exe location
Given user enter url 
When user enter username
When user enter password
And user click on login button 
When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations
When user click on add button
When user click on select insurance type dropdown
When user enter "Accidental Damage" to search insurance type in search box
When user select Accidental Damage as insurance type from dropdown

@MandatoryFields
Scenario: (Accidental Damage Quotation) Verify user able to enter mandatory fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing as client name
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer
When user select Alliance Insurance Company (T) Ltd. as insurer
When user click on insurance class dropdown
When user enter "Standard Rate" as insurance class
When user select Standard Rate as insurance class
When user enter "100000" as sum insured
When user enter "5" % as override%
When user enter "Accidental Damage Quotation Testing" as description
When user click on compute button
When user click on insert button
When user click on addOn button
When user click on extension dropdown
When user enter "All Risk Cover" as extension
When user select on All Risk Cover as extension
When user enter "200000" as sum insured (AddOn)
When user enter "4" as rate%
When user enter "Accidental Damage Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
When user click on save button
When user click on Ok button to accept commission alert
Then user able to view "Awaiting Receipt" as status


