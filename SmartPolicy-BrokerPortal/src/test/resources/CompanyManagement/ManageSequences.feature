@All
Feature: Manage Sequences

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on company management option
Then user click on Manage Sequences option

@Edit
Scenario: Verify user able to edit Manage Sequences details

When user enter "0" as Client Number
When user enter "0" as Quote Number
When user enter "0" as Debit Note Number
When user enter "0" as Payment Number
When user enter "0" as Receipt Number
When user enter "0" as Risk Note Number
When user enter "0" as Credit Note Number
When user enter "0" as Claim Number
When user enter "0" as Customer Tax Invoice
When user enter "0" as Insurer Tax Invoice
When user enter "0" as Voucher Number
When user enter "0" as Purchase Order
When user enter "0" as Purchase Invoice
When user enter "0" as General Ledger
When user enter "0" as Supplier Number
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit
