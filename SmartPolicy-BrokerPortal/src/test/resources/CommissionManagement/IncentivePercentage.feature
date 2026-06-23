@All
Feature: Incentive Percentage

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on commission management option
Then user click on Incentive Percentage option


@AllFields
Scenario: Verify user able to enter Incentive Percentage details
When user click on add button to enter details
When user select "09-Mar-2026" as date to
When user enter "5.2" as Zone %
When user enter "4.5" as Region %
When user enter "6.2" as Branch %
When user enter "5.65" as Sales Officer %
When user enter "5.23" as Head Office % 
And user click on save button
And user able to view "1001-New information recorded successfully" as message
#Then user able to view "Created" as status(Incentive Percentage)

@Edit
Scenario: Verify user able to edit Incentive Percentage details
#Search
When user select "09-Mar-2026" as date to
When user enter "5.2" as Zone %
When user enter "4.5" as Region %
When user enter "6.2" as Branch %
When user enter "5.65" as Sales Officer %
When user enter "5.23" as Head Office %
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit
Then user able to view "Modified" as status(Incentive Percentage)

