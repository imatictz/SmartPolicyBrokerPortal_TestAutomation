@All
Feature: Insurance Referral Sales Team

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on commission management option
Then user click on Insurance Referral Sales Team option


@AllFields
Scenario: Verify user able to enter Insurance Referral Sales Team details
When user click on add button to enter details
When user enter "06" as Member Id
When user enter "Pravin Test" as Member Name
When user enter "621234567" as mobile
When user enter "pravin1232@gmail.com" as email
When user select "Insurance Company" as Type 
And user click on save button
And user able to view "1001-New information recorded successfully" as message
Then user able to view "Created" as status(Insurance Referral Sales Team)

@Edit
Scenario: Verify user able to edit Insurance Referral Sales Team details
#Search
When user enter "05" as Member Id(search)
When user enter "Pravin Test" as Member Name(search)
And user click on search button(Insurance Referral Sales Team)
And user clicks on the actions dropdown
And user clicks on edit option

When user enter "Pravin Test" as Member Name
When user enter "621234567" as mobile
When user enter "pravin1232@gmail.com" as email
When user select "Insurance Company" as Type
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit
Then user able to view "Modified" as status(Insurance Referral Sales Team)

