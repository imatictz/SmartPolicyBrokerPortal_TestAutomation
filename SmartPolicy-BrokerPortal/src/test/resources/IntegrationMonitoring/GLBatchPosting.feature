@All
Feature: GL Batch Posting

Background: Launch browser and open application

When user navigate on operation dropdown
When user navigate on integration monitoring option
Then user click on GL Batch Posting option


@GLBatch
Scenario: Verify user able to enter GL Batch Posting details
When user click on add button to enter details
When user select "Daily" as posting type
When user select "03/01/2026" posting date
And user click on create posting date
Then user able to view "Pending" as status

@Edit
Scenario: Verify user able to edit GL Batch Posting details
#Search
When user select "01/01/2026" as from date
When user enter "Pending" as status
And user click on search button
And user clicks on the actions dropdown
And user clicks on edit option

#edit details
When user select "Daily" as posting type
When user select "03-Jan-2026" posting date
And user click on create posting date
Then user able to view "1003-Information modified successfully" as message