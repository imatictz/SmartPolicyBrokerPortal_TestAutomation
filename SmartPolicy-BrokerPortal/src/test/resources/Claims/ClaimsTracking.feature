@All
Feature: ClaimsTracking

Background: 
 
When user navigate on operation dropdown menu
And user navigate on claims management
Then user click on manage claim

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







@reportCreditLifeClaims
Scenario: (Report Credit Life Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "3" as risk note number
When user click on search button
When user click on options button
When user click on report claim umbrella like button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "01/07/2024" as date of loss/Accident
And user select "Natural Death" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others

#Claimant Details
When user select "Email" as reported type
When user select "Death" as nature of loss/claim type
When user select "Owner" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Death Loss" as circumstances of accidents

@reportFire&BurglaryClaims
Scenario: (Report Fire&Burglary Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "3" as risk note number
When user click on search button
When user click on options button
When user click on report claim umbrella like button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "01/07/2024" as date of loss/Accident
And user select "Loss of Rental Income" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others

#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Owner" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Fidelity Loss" as circumstances of accidents


@reportGATravelInsuranceClaims
Scenario: (Report GA Travel Insurance Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "3" as risk note number
When user click on search button
When user click on options button
When user click on report claim umbrella like button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "01/07/2024" as date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "WestRoad" as place of loss/Accident

#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "1240000" as claimant amount
When user enter "GA Travel Insurance Loss" as circumstances of accidents