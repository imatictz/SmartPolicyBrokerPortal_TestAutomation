@All
Feature: Marine Quotation 

Background: 

When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations

  @Mandatory
  Scenario: (Marine Quotation) Verify user able to enter mandatory fields and save quotation successfully
  When user click on add button
  When user select "Marine - Containerized ICC Clause (A)(Less Than 500M)" as insurance type
  When user enter screen details :
      | Field Name               |          Value            |
      | Client Name              | Pravin Testing Broker     |
      | Insured Name             | Automated Testing Company |
      | Business by              |        |
      | Borrower Account Name    | Borrower Name |
      | Borrower Account Number  | 123456789 |
      | Business Type            |        |
      | Insured Status           |        |
      | Gender                   |        |
      | ID Type                  |        |
      | ID Number:               | ID12345 |
      | Nationality              |        |
      | Insurance Class          |        |
      | Insurance Sub Class      |        |
      | Description              | Cargo insurance |
      | Sum Insured              | 100000 |
    Then data should be entered successfully on Show Policy screen

  @AllFields
  Scenario: Verify Show Policy screen with all fields
    When user enters all details on Show Policy screen
      | Field Name             | Value |
      | Show Policy           | POL-002 |
      | X Rate                | 1.2 |
      | Insurer X Rate        | 1.1 |
      | Date From             | 01/01/2026 |
      | Date To               | 31/12/2026 |
      | Days                  | 365 |
      | VAT %                 | 18 |
      | Address               | Mumbai |
      | Cover Note Number     | CN123 |
      | Contact Person        | Tester |
      | Bill of Lading / Invoice # | BL001 |
      | Container Number      | CONT123 |
      | Per Transit Maximum Amount | 50000 |
      | Description of Risk   | General Cargo |
      | Loading %             | 2 |
      | Rate %                | 0.5 |
      | Override %            | 1 |
      | Actual Premium        | 2000 |
      | Adjust Premium        | 100 |
      | Total Premium         | 2100 |
      | Commission Rate %     | 10 |
      | Broker Commission     | 200 |
      | VAT on Commission     | 36 |
      | Insurer Settlement    | 1800 |
      | Discount Premium      | 50 |
      | Total Receivable      | 2050 |
    Then data should be entered successfully on Show Policy screen
