@All
Feature: Provisional Batch Tax Invoices 

Background: 

When user navigate on operation dropdown menu
When user navigate on billing option
When user click on Provisional Batch Tax Invoices option
When user click on add button

@Test
Scenario: Verify user able to create Provisional Batch Tax Invoices successfully
When user select "Automated Testing Company" as insurer name
When user enter "01-Dec-2025" as date from
When user enter "12-Dec-2026" as date to
And user select "General" as category
Then user click on fetch button


#Scenario:
When user click on checkbox to select commission
When user click on save button
Then user able to view "Pending" as status
And user clicks on the actions dropdown


When user click on collect cash icon
When user select "Bank payment" as mode
When user select "Bank Of Tanzania" as issuer bank
When user enter "21540" as Cheque/ Reference Number
When user select "Absa Group Limited" as collecting bank
When user enter "Collecting commission payment from insurer" as notes
And user click on save button (Receipts)