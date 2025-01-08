@All
Feature: Verify user able to edit client details

Scenario: Edit Client Details

When user click on client menu
When user search "Shabeena" as name 
Then user click on search button
When user select edit icon
And user enter "Address" as address
And user click on update button
Then user navigate on client screen