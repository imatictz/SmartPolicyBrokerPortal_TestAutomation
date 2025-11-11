@All
Feature: Claims

Background: 
 
When user navigate on operation dropdown menu
When user Click on risk note menu

@reportAccidentalDamageClaims
Scenario: (Report Accidental Damage Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user click on search button to find "Individual Personal Accident" risk note
#When user enter risk note number to search "Individual Personal Accident" risk note
#When user click on search button
#When user click on actions button
#When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Email" as reported type
When user select "Accidental Damage" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Accident Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer


@reportBondsClaims
Scenario: (Report Bond Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Bonds" as Insurance Type
When user click on search button to find "Bonds" risk note
When user click on fetch button
#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user select "Accidental Damage" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer


@reportBurglaryClaims
Scenario: (Report Burglary Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user click on search button to find "Burglary/Theft" risk note
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
And user select "Burglary" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Email" as reported type
When user select "Theft of Parts" as nature of loss/claim type
When user select "Pedestrian" as claimant circumstances
When user enter "150000" as claimant amount
When user enter "Burglary Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer

@reportCreditLifeClaims
Scenario: (Report Credit Life Insurance Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user click on search button to find "Credit Life Insurance" risk note
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of death/illnes/others
And user select "Death" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others

#Claimant Details
When user select "Email" as reported type
When user select "Critical Illness(CI)" as nature of loss/claim type
When user enter date of death/illnes/others
When user select "passenger" as claimant circumstances
When user enter "450000" as claimant amount
When user enter "Medical Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer



@reportFidelityClaims
Scenario: (Report Fidelity Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Fidelity" as Insurance Type
When user click on search button to find "Fidelity" risk note
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
And user select "Loss of Rental Income" as cause of claim
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Owner" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Fidelity Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer

@reportFireBurglaryClaims
Scenario: (Report Fire and Burglary Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user click on search button to find "Fire and Burglary" risk note
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
And user select "Fire" as cause of loss/Accident
Then user enter "City Mall" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user select "Others" as nature of loss/claim type
When user select "Owner" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Fire Class Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer

@reportFireClassClaims
Scenario: (Report Fire Class Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Fire Class" as Insurance Type
When user click on search button to find "Fire Class" risk note
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
And user select "Fire" as cause of loss/Accident
Then user enter "City Mall" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user select "Others" as nature of loss/claim type
When user select "Owner" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Fire Class Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer



@reportGroupLifeClaims
Scenario: (Report Group Life Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Group Life" as Insurance Type
When user click on search button to find "Group Life" risk note
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of death/illnes/others
And user select "Hospital Expenses" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others

#Claimant Details
When user select "Email" as reported type
When user select "Critical Illness(CI)" as nature of loss/claim type
When user select "passenger" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Group Life Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer

@reportMedicalClaims
Scenario: (Report Medical Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Medical" as Insurance Type
When user click on search button to find "Medical" risk note
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of death/illnes/others
And user select "Hospital Expenses" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others

#Claimant Details
When user select "Email" as reported type
When user select "Critical Illness(CI)" as nature of loss/claim type
When user enter date of death/illnes/others
When user select "passenger" as claimant circumstances
When user enter "450000" as claimant amount
When user enter "Medical Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer







@reportPensionClaims
Scenario: (Report Pension Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Pension" as Insurance Type
When user click on search button to find "Pension" risk note
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "WestRoad" as place of loss/Accident


#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "1240000" as claimant amount
When user enter "Pension Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer

@reportVehicleClaims
Scenario: (Report Vehicle Claim) Verify user able to report claim successfully
When user select "01/09/2025" as from date
When user enter "Motor" as Insurance Type
When user click on search button to find "Motor" risk note
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "WestRoad" as place of loss/Accident

#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "1240000" as claimant amount
When user enter "Vehicle Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer


