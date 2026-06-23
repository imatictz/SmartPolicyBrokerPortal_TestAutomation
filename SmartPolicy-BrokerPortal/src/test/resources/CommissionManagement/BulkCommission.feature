@All
Feature: Bulk Commission Setup

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on commission management option
Then user click on Bulk Commission option


@AllFields
Scenario: Verify user able to enter Bulk Commission Setup details
When user select "Automated Testing Company" as from insurer
When user select "Automated Testing Company" as to insurer
And user click on transfer button
When user click on Ok button to accept delete existing commission alert message
And user able to view "1001-New information recorded successfully" as message

