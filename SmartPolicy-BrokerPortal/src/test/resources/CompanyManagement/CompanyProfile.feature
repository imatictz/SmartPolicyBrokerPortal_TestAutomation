@All
Feature: Company Profile

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on company management option
Then user click on company profile option

@Edit
Scenario: Verify user able to edit Company Profile details
When user enter "TestProject" as company name
When user enter "TestProject" as for name
When user enter "621234560" as Telephone 1
When user enter "House No.12 XYZ World" as Address 1
And user click on save button
Then user able to view "1003-Information modified successfully" as message after edit