@All
Feature: Product Mapping

Background: Launch browser and open application

When user navigate on operation dropdown
When user navigate on integration monitoring option
Then user click on product mapping option


@AllFields
Scenario: Verify user able to enter product mapping details
When user click on add button to enter details
When user select "General" as Insurance Category
When user select "CIB" as Customer Type
When user enter "PRODUCT145" as Finance System Product Code
When user select Direct Type checkbox
And user click on save button
Then user able to view "1001-New information recorded successfully" as message

@Edit
Scenario: Verify user able to edit product mapping details
#Search
When user enter "CIB" as Customer Type
#When user enter "Created" as status
And user click on search button
And user clicks on the actions dropdown
And user clicks on edit option

When user select "General" as Insurance Category
When user select "CIB" as Customer Type
When user enter "PRODUCT145" as Finance System Product Code
When user select Direct Type checkbox
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit