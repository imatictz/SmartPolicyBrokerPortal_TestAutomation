@All
Feature: Claims

Background: 
 
When user navigate on operation dropdown menu
When user Click on risk note menu


@reportBondsClaims
Scenario: (Report Bond Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "382" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
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
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer



@reportAccidentalDamageClaims
Scenario: (Report Accidental Damage Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "180" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "02/04/2025" as date of loss/Accident
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
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status


@reportBurglaryClaims
Scenario: (Report Burglary Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "285" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "08/04/2025" as date of loss/Accident
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
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status



@reportFidelityClaims
Scenario: (Report Fidelity Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "286" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "08/04/2025" as date of loss/Accident
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
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status



@reportFireClassClaims
Scenario: (Report Fire Class Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "249" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "02/04/2025" as date of loss/Accident
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
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status



@reportGroupLifeClaims
Scenario: (Report Group Life Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "252" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "02/04/2025" as date of death/illnes/others
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
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status

@reportMedicalClaims
Scenario: (Report Medical Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "287" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "08/04/2025" as date of death/illnes/others
And user select "Hospital Expenses" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others

#Claimant Details
When user select "Email" as reported type
When user select "Critical Illness(CI)" as nature of loss/claim type
When user select "passenger" as claimant circumstances
When user enter "450000" as claimant amount
When user enter "Medical Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status

@reportMoneyInsuranceCoverClaims
Scenario: (Report Money Insurance Cover Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "49" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "02/04/2025" as date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "WestRoad" as place of loss/Accident

#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "1240000" as claimant amount
When user enter "Money Insurance Cover Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status



@reportPackagePolicyClaims
Scenario: (Report Package Policy Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "46" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "02/04/2025" as date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "WestRoad" as place of loss/Accident

#Claimant Details
When user select "Email" as reported type
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "1240000" as claimant amount
When user enter "Package Policy Loss" as circumstances of accidents
And user click on save button
Then user able to view "Claim Reported" as status
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status

@reportPensionClaims
Scenario: (Report Pension Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "254" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "02/04/2025" as date of loss/Accident
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
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status

@reportVehicleClaims
Scenario: (Report Vehicle Claim) Verify user able to report claim successfully
When user select "01/01/2024" as from date
When user enter "255" as risk note number
When user click on search button
When user click on actions button
When user click on report claim umbrella like button
When user click on fetch button
#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "02/04/2025" as date of loss/Accident
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
When user click on options menu
When user click on report to insurer option
And user click on yes,report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status


