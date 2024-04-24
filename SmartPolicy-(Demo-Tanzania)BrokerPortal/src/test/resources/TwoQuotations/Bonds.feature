@All
Feature: Bonds Quotation 

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
When user enter "Bonds" to search insurance type in search box
When user select Bonds as insurance type from dropdown

@MandatoryFields
Scenario: (Bonds Quotation) Verify user able to enter mandatory fields and save quotation successfully
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user click on insurer dropdown
When user enter "Alliance Insurance Company (T) Ltd." as insurer
When user select Alliance Insurance Company (T) Ltd. as insurer
When user enter "123459876501234" as cover note
When user click on insurance class dropdown
When user enter "Advance Payment Bond 1" as insurance class
When user select Advance Payment Bond one as insurance class
When user enter "2000000" as contract value
When user enter "Bonds Quotation" as description
When user click on compute button
When user click on insert button
When user click on addOn button
When user click on extension dropdown
When user enter "All Risk Cover" as extension
When user select on All Risk Cover as extension
When user enter "500000" as sum insured (AddOn)
When user enter "7" as rate%
When user enter "Bonds Quotation AddOn" as description (AddOn)
When user click on insert button (AddOn)
#When user click on broker partner name dropdown
#When user select FinalTester as broker partner name
When user click on save button
#When user click on Ok button to accept commission rate alert message
Then user able to view "Awaiting Receipt" as status



