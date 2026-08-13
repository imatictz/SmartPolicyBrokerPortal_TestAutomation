@All
Feature: Individual Insurer Level Setup

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on commission management option
Then user click on Individual Insurer Level Setup option


@Edit
Scenario: Verify user able to edit Individual Insurer Level Setup details
When user select "Automated Testing Company" as Insurance Company
And user click on fetch button
When user select "2 Wheelers/ 3 Wheelers" as Insurance Type
And user click on search button
When user click on edit icon
When user enter "15" as New Commission Rate %
And user click on update button
And user able to view "1018-Information recorded successfully" as message
Then user able to view "Modified" as status
When user click on approve icon
When user click on approve button
And user able to view "1018-Information recorded successfully" as message
Then user able to view "Approved" as status

