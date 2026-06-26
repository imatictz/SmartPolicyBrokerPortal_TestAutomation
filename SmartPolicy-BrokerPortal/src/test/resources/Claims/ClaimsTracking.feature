@All
Feature: ClaimsTracking

Background: 
 
When user navigate on operation dropdown menu
And user navigate on claims options
Then user click on manage claim

@PrintAccidentClaim   @print
 Scenario: User print claim report for Accident Cover policy
   When user select "01/01/2025" as from date
   When user enter "Accident Cover" as Cover Information
   When user click on search button to find "Accident Cover" claim ID
   When user enter claim ID to search "Accident Cover" claim record
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
 
 @PrintBondsClaim    @print
 Scenario: User print claim report for Bonds policy
   When user select "01/01/2025" as from date
   When user enter "Bonds" as Cover Information
   When user click on search button to find "Bonds" claim ID
   When user enter claim ID to search "Bonds" claim record
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
 
 @PrintBurglaryTheftClaim   @print
 Scenario: User print claim report for Burglary/Theft policy
   When user select "01/01/2025" as from date
   When user enter "Burglary/Theft" as Cover Information
   When user click on search button to find "Burglary/Theft" claim ID
   When user enter claim ID to search "Burglary/Theft" claim record
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
 
 @PrintCreditlifeClaim   @print
 Scenario: User print claim report for Credit Life Insurance policy
   When user select "01/01/2025" as from date
   When user enter "Credit Life Insurance" as Cover Information
   When user click on search button to find "Credit Life Insurance" claim ID
   When user enter claim ID to search "Credit Life Insurance" claim record
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
 
 @PrintFidelityClaim   @print
 Scenario: User print claim report for Fidelity policy
   When user select "01/01/2025" as from date
   When user enter "Fidelity" as Cover Information
   When user click on search button to find "Fidelity" claim ID
   When user enter claim ID to search "Fidelity" claim record
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
 
 @PrintFireBurglaryClaim   @print
 Scenario: User print claim report for Fire and Burglary policy
   When user select "01/01/2025" as from date
   When user enter "Fire and Burglary" as Cover Information
   When user click on search button to find "Fire and Burglary" claim ID
   When user enter claim ID to search "Fire and Burglary" claim record
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
 
 @PrintFireClassClaim   @print
 Scenario: User print claim report for Fire Class policy
   When user select "01/01/2025" as from date
   When user enter "Fire Class" as Cover Information
   When user click on search button to find "Fire Class" claim ID
   When user enter claim ID to search "Fire Class" claim record
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
 
 @PrintGroupLifeClaim   @print
 Scenario: User print claim report for Group Life policy
   When user select "01/01/2025" as from date
   When user enter "Group Life" as Cover Information
   When user click on search button to find "Group Life" claim ID
   When user enter claim ID to search "Group Life" claim record
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
 
 @PrintMedicalClaim   @print
 Scenario: User print claim report for Medical policy
   When user select "01/01/2025" as from date
   When user enter "Medical" as Cover Information
   When user click on search button to find "Medical" claim ID
   When user enter claim ID to search "Medical" claim record
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
 
 @PrintPensionClaim   @print
 Scenario: User print claim report for Pension policy
   When user select "01/01/2025" as from date
   When user enter "Pension" as Cover Information
   When user click on search button to find "Pension" claim ID
   When user enter claim ID to search "Pension" claim record
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
 
 @PrintMotorClaim   @print
 Scenario: User print claim report for Motor policy
   When user select "01/01/2025" as from date
   When user enter "Vehicle" as Cover Information
   When user click on search button to find "Vehicle" claim ID
   When user enter claim ID to search "Vehicle" claim record
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
When user enter "Accident Cover" as Cover Information
When user click on search button to find "Accident Cover" claim ID
When user enter claim ID to search "Accident Cover" claim record
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
Then user able to view "Information Modified Successfully" as message
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
Then user able to view "Information Modified Successfully" as message
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
Then user able to view "Information Modified Successfully" as message
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
Then user able to view "Information Modified Successfully" as message
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
Then user able to view "Information Modified Successfully" as message
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
Then user able to view "Information Modified Successfully" as message
Then user able to view "Active" as status

@editFireClassClaims
Scenario: (Fire Class Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Fire Class" as Cover Information
When user click on search button to find "Fire Class" claim ID
When user enter claim ID to search "Fire Class" claim record
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
Then user able to view "Information Modified Successfully" as message
Then user able to view "Active" as status

@editGroupLifeClaims
Scenario: (Group Life Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Group Life" as Cover Information
When user click on search button to find "Group Life" claim ID
When user enter claim ID to search "Group Life" claim record
When user click on search button
And user clicks on the actions dropdown
Then user click on edit option

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of death/illnes/others
When user enter police reported date
And user select "Hospital Expenses" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others
When user enter reported date

#Claimant Details
When user select "Email" as reported type
When user select "Critical Illness(CI)" as nature of loss/claim type
When user select "passenger" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Group Life Loss" as circumstances of accidents
And user click on update button
Then user able to view "Information Modified Successfully" as message
Then user able to view "Active" as status

@editMedicalClaims
Scenario: (Medical Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Medical" as Cover Information
When user click on search button to find "Medical" claim ID
When user enter claim ID to search "Medical" claim record
When user click on search button
And user clicks on the actions dropdown
Then user click on edit option

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of death/illnes/others
When user enter police reported date
And user select "Hospital Expenses" as cause of claim
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
Then user able to view "Information Modified Successfully" as message
Then user able to view "Active" as status

@editPensionClaims
Scenario: (Pension Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Pension" as Cover Information
When user click on search button to find "Pension" claim ID
When user enter claim ID to search "Pension" claim record
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
Then user enter "WestRoad" as place of loss/Accident
When user enter reported date

#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "1240000" as claimant amount
When user enter "Pension Loss" as circumstances of accidents
And user click on update button
Then user able to view "Information Modified Successfully" as message
Then user able to view "Active" as status

@editVehicleClaims
Scenario: (Vehicle Claim) Verify user able to edit and save claim successfully
When user select "01/01/2025" as from date
When user enter "Vehicle" as Cover Information
When user click on search button to find "Vehicle" claim ID
When user enter claim ID to search "Vehicle" claim record
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
Then user enter "WestRoad" as place of loss/Accident
When user enter reported date

#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "1240000" as claimant amount
When user enter "Vehicle Loss" as circumstances of accidents
And user click on update button
Then user able to view "Information Modified Successfully" as message
Then user able to view "Active" as status


