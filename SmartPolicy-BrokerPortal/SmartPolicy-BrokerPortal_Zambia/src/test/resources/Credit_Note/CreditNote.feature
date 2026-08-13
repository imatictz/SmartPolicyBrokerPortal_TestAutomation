@All
Feature: Credit Note

Background: Launch browser and open application

When user navigate on operation dropdown
When user navigate on billing option
Then user click on credit note option

@PrintCreditNote
Scenario: Verify user able to print credit note details successfully

#Search
When user select "01/10/2025" as date
When user enter "Client" as type
When user enter "Approved" as status
Then user click on search button
And user clicks on the actions dropdown
And user clicks on print option
And the credit note should include all relevant details like
      | Field           | 
      | Credit No       |
      | Risk Note No    |
      | Name            |
      | Amount          |
