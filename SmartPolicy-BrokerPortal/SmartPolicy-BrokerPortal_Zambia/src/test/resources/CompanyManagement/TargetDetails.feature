@All
Feature: Target Details

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on company management option
Then user click on Target Details option


@AllFields
Scenario: Verify user able to enter Target Details details
When user click on add button to enter details
When user select "Head Office" as Branch Name
When user select "General Insurance" as Product
When user select "Tanzanian Shillings" as Currency
#When user select "2021" as Year
When user enter "1.2" as X Rate
When user select "Business Banking" as Customer Type
When user enter "1001" as Target Amount and "1" as Count(JANUARY)
When user enter "1001" as Target Amount and "1" as Count(FEBRUARY)
When user enter "1001" as Target Amount and "1" as Count(MARCH)
When user enter "1001" as Target Amount and "1" as Count(APRIL)
When user enter "1001" as Target Amount and "1" as Count(MAY)
When user enter "1001" as Target Amount and "1" as Count(JUNE)
When user enter "1001" as Target Amount and "1" as Count(JULY)
When user enter "1001" as Target Amount and "1" as Count(AUGUST)
When user enter "1001" as Target Amount and "1" as Count(SEPTEMBER)
When user enter "1001" as Target Amount and "1" as Count(OCTOBER)
When user enter "1001" as Target Amount and "1" as Count(NOVEMBER)
When user enter "1001" as Target Amount and "1" as Count(DECEMBER)
And user click on save button
And user able to view "1001-New information recorded successfully" as message
Then user able to view "Created" as status

@Edit
Scenario: Verify user able to edit Target Details details
#Search

When user select "Head Office" as Branch Name(Search)
When user select "General Insurance" as Product(Search)
#When user select "2021" as Year(Search)
When user click on search button
And user clicks on the actions dropdown
And user clicks on edit option
 
When user select "Head Office" as Branch Name
When user select "General Insurance" as Product
When user select "Tanzanian Shillings" as Currency
#When user select "2021" as Year
When user enter "1.2" as X Rate
When user select "Business Banking" as Customer Type
When user enter "1001" as Target Amount and "1" as Count(JANUARY)
When user enter "1001" as Target Amount and "1" as Count(FEBRUARY)
When user enter "1001" as Target Amount and "1" as Count(MARCH)
When user enter "1001" as Target Amount and "1" as Count(APRIL)
When user enter "1001" as Target Amount and "1" as Count(MAY)
When user enter "1001" as Target Amount and "1" as Count(JUNE)
When user enter "1001" as Target Amount and "1" as Count(JULY)
When user enter "1001" as Target Amount and "1" as Count(AUGUST)
When user enter "1001" as Target Amount and "1" as Count(SEPTEMBER)
When user enter "1001" as Target Amount and "1" as Count(OCTOBER)
When user enter "1001" as Target Amount and "1" as Count(NOVEMBER)
When user enter "1001" as Target Amount and "1" as Count(DECEMBER)
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit
Then user able to view "Modified" as status

