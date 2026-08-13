@All
Feature: User Maintenance

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on company management option
Then user click on User Maintenance option

@Edit
Scenario: Verify user able to edit User Maintenance details
#Search
When user enter "TestProject" as Search Text
When user select "User Name" as Search Criteria
And user click on search button
When user select edit icon
And user click on save button
Then user able to view "1001-New information recorded successfully" as message after edit