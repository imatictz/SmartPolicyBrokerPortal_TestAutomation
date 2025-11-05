@All
Feature: Payment

Background: Launch browser and open application

When user navigate on operation dropdown
When user click on all receipts option
Then user click on direct payment option
When user click on add button to enter payment details

@AllFields
Scenario: (Payment)Verify user able to enter all fields and save payment details successfully
When user select "Automated Testing Company" as insurer name 
When user enter "Pravin Testing Broker" as client name
When user select Pravin Testing as client name
When user enter "210000" as amount
And user select "Bank Payment" as mode
When user select "Absa Group Limited" as issuer bank
When user select "Uchumi Commercial Bank" as collecting bank
When user enter "5481" as Cheque/ Reference Number
And user enter "Payment Done To Insurer" as notes
#When user enter "145ASW" as refrence id
Then user enter "REF5142id" as insurer payment refrence id
And user click on save button
Then user able to view "Pending" as status