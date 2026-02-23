@All
Feature: Receipts 

Background: 

When user navigate on operation dropdown menu
When user navigate on all receipts menu
When user click on receipts
When user click on add button

 @AllFields
Scenario: Enter receipt details with all fields
  When user enter screen details :
    | Field Name                   | Value                          |
    | Client Name                  | Pravin Testing broker          |
    | Amount                       | 50000                          |
    | Currency                     | Tanzanian Shillings            |
    | Mode                         | Electronic Funds Transfer (EFT)|
    | Issuer Bank                  | Amana Bank Limited             |
    | Collecting Bank              | Advans Bank (Tanzania) Limited |
    | Cheque/ Reference Number     | 65214                          |
    | Notes                        | Test notes                     |
    | Refrence Id                  | REF47812                       |
  And user click on save button
  Then user able to view "Pending" as status


  