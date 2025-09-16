@All
Feature: ClaimsTracking

Background: 
 
When user navigate on operation dropdown menu
And user navigate on claims options
Then user click on manage claim

@PrintAccidentClaim
 Scenario: User print claim report for Individual Personal Accident policy
   When user select "01/01/2025" as from date
   When user enter "Individual Personal Accident" as Cover Information
   When user click on search button to find "Individual Personal Accident" claim ID
   When user enter claim ID to search "Individual Personal Accident" claim record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print claim report option
   And the claim report should include all relevant details like
      | Field              | 
      | System Claim No    |
      | Risk Note No       |
      | CoverNote No       |
      | Claimant Name      |
      | Type Of Policy     |
      | Policy No          | 
      | Sum Insured        | 
 # And the user should be able to send the risk note to the printer
@uploadDocuments
Scenario: (uploadDocuments against Claim) Verify user able to uploadDocuments against Claim successfully
When user select "01/01/2023" as from date
When user enter "33828" as risk note number
When user click on branch dropdown
And user enter "All" as branch
Then user select All as branch
When user click on search button
When user click on options button
When user click on attach documents button
When user click on attachment type dropdown
And user enter "TEST DOC" as document
Then user select document to be attach
When user click on select file button
When user select document received checkbox for attach document

@sendDocuments
Scenario: (send documents to insurer) Verify user able to send documents to insurer successfully
When user select "01/01/2023" as from date
When user enter "33828" as risk note number
When user click on branch dropdown
And user enter "All" as branch
Then user select All as branch
When user click on search button
When user click on options button
When user click on email option
When user click on to insurer option
And user enter ",pravin.wagh@itl.co.tz" as email
Then user click on send email button

@recordFeedback
Scenario: (Record feedback from the insurer) Verify user able to record feedback from the insurer successfully
When user select "01/01/2023" as from date
When user enter "33828" as risk note number
When user click on branch dropdown
And user enter "All" as branch
Then user select All as branch
When user click on search button
When user click on options button
When user click on feedback option
When user enter "Document checked" as feedback/Comments
And user enter "12/09/2023" follow-up date
Then user click on insert button
When user enter "claim checked" as feedback/Comments
And user enter "13/09/2023" follow-up date
Then user click on insert button
When user enter "claim settled checked" as feedback/Comments
When user click on status dropdown
And user enter "Claim settled" as status
Then user select Claim settled as status
And user enter "14/09/2023" follow-up date
Then user click on insert button





