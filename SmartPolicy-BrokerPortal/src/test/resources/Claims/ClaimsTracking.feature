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
 
@editAccidentalDamageClaims
Scenario: (Accidental Damage Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Cover Information
When user click on search button to find "Individual Personal Accident" claim ID
When user enter claim ID to search "Individual Personal Accident" claim record
When user click on search button
And user clicks on the actions dropdown
Then user click on edit option

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
When user enter police reported date
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident
When user enter reported date

#Claimant Details
When user select "Email" as reported type
When user select "Accidental Damage" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "200000" as claimant amount
When user enter "Accident Loss" as circumstances of accidents
And user click on update button
Then user able to view ", information modified successfully0000" as message
Then user able to view "Active" as status

@editBondsClaims
Scenario: (Bond Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Bonds" as Cover Information
When user click on search button to find "Bonds" claim ID
When user enter claim ID to search "Bonds" claim record
When user click on search button
And user clicks on the actions dropdown
Then user click on edit option

#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
When user enter police reported date
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident
When user enter reported date

#Claimant Details
When user select "Phone" as reported type
When user select "Accidental Damage" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "200000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents
And user click on update button
Then user able to view ", information modified successfully0000" as message
Then user able to view "Active" as status

@editBurglaryClaims
Scenario: (Burglary Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Cover Information
When user click on search button to find "Burglary/Theft" claim ID
When user enter claim ID to search "Burglary/Theft" claim record
When user click on search button
And user clicks on the actions dropdown
Then user click on edit option

#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
When user enter police reported date
And user select "Burglary" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident
When user enter reported date


#Claimant Details
When user select "Email" as reported type
When user select "Theft of Parts" as nature of loss/claim type
When user select "Pedestrian" as claimant circumstances
When user enter "150000" as claimant amount
When user enter "Burglary Loss" as circumstances of accidents
And user click on update button
Then user able to view ", information modified successfully0000" as message
Then user able to view "Active" as status

@editCreditLifeClaims
Scenario: (Credit Life Insurance Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Cover Information
When user click on search button to find "Credit Life Insurance" claim ID
When user enter claim ID to search "Credit Life Insurance" claim record
When user click on search button
And user clicks on the actions dropdown
Then user click on edit option

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of death/illnes/others
When user enter police reported date
And user select "Death" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others
When user enter reported date

#Claimant Details
When user select "Email" as reported type
When user select "Critical Illness(CI)" as nature of loss/claim type
When user enter date of death/illnes/others
When user select "passenger" as claimant circumstances
When user enter "450000" as claimant amount
When user enter "Medical Loss" as circumstances of accidents
And user click on update button
Then user able to view ", information modified successfully0000" as message
Then user able to view "Active" as status

@editFidelityClaims
Scenario: (Fidelity Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Fidelity" as Cover Information
When user click on search button to find "Fidelity" claim ID
When user enter claim ID to search "Fidelity" claim record
When user click on search button
And user clicks on the actions dropdown
Then user click on edit option

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
When user enter police reported date
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident
When user enter reported date

#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Owner" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Fidelity Loss" as circumstances of accidents
And user click on update button
Then user able to view ", information modified successfully0000" as message
Then user able to view "Active" as status

@editFireBurglaryClaims
Scenario: (Fire and Burglary Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Cover Information
When user click on search button to find "Fire and Burglary" claim ID
When user enter claim ID to search "Fire and Burglary" claim record
When user click on search button
And user clicks on the actions dropdown
Then user click on edit option

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
When user enter police reported date
And user select "Fire" as cause of loss/Accident
Then user enter "City Mall" as place of loss/Accident
When user enter reported date

#Claimant Details
When user select "Phone" as reported type
When user select "Others" as nature of loss/claim type
When user select "Owner" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Fire Class Loss" as circumstances of accidents
And user click on update button
Then user able to view ", information modified successfully0000" as message
Then user able to view "Active" as status




