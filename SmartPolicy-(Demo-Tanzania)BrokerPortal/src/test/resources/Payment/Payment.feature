@All
Feature: Payment

Background: Launch browser and open application

When user navigate on operation dropdown
When user navigate on payment option
Then user click on payment option
When user click on add button to enter payment details

@AllFields
Scenario: (Payment)Verify user able to enter all fields and save payment details successfully
When user click on insurer name dropdown 
And user enter "Alliance Insurance Company (T) Ltd" as insurer name 
Then user select Alliance Insurance Company (T) Ltd as insurer name 
When user enter "210000" as amount
When user click on mode dropdown
And user enter "Card Payment" as mode
Then user select Card Payment as mode
When user enter "5481" as Cheque/ Reference Number
And user enter "Payment Done To Insurer" as notes
When user click on bank details dropdown
And user enter "UBL Bank (TZS)" as bank details
Then user select UBL Bank (TZS) as bank details
When user enter "145ASW" as refrence id
Then user enter "REF5142id" as insurer payment refrence id
And user click on save button
Then user able to view "Pending" as status