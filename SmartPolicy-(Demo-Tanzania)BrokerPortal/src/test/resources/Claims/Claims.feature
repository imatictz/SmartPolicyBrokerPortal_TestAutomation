@All
Feature: Claims

Background: 
 
When user navigate on operation dropdown menu
When user Click on risk note menu
When user select "01/01/2024" as from date
When user enter "37701" as risk note number
When user click on search button
When user click on options button
When user click on report claim umbrella like button

@reportBondsClaims
Scenario: (Report Bond Claim) Verify user able to report claim successfully

#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "01/07/2024" as date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user select "Accidental Damage" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents


@reportAccidentalDamageClaims
Scenario: (Report Accidental Damage Claim) Verify user able to report claim successfully

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "01/07/2024" as date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Email" as reported type
When user select "Accidental Damage" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Accident Loss" as circumstances of accidents

@reportBurglaryClaims
Scenario: (Report Burglary Claim) Verify user able to report claim successfully

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "01/07/2024" as date of loss/Accident
And user select "Burglary" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Email" as reported type
When user select "Theft of Parts" as nature of loss/claim type
When user select "Pedestrian" as claimant circumstances
When user enter "150000" as claimant amount
When user enter "Burglary Loss" as circumstances of accidents

@reportCreditLifeClaims
Scenario: (Report Credit Life Claim) Verify user able to report claim successfully

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

@reportFidelityClaims
Scenario: (Report Fidelity Claim) Verify user able to report claim successfully

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

@reportFire&BurglaryClaims
Scenario: (Report Fire&Burglary Claim) Verify user able to report claim successfully

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

@reportFireClassClaims
Scenario: (Report Fire Class Claim) Verify user able to report claim successfully

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "01/07/2024" as date of loss/Accident
And user select "Fire" as cause of loss/Accident
Then user enter "City Mall" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user select "Others" as nature of loss/claim type
When user select "Owner" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Fire Class Loss" as circumstances of accidents

@reportGATravelInsuranceClaims
Scenario: (Report GA Travel Insurance Claim) Verify user able to report claim successfully

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

@reportGroupLifeClaims
Scenario: (Report Group Life Claim) Verify user able to report claim successfully

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "01/07/2024" as date of death/illnes/others
And user select "Hospital Expenses" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others

#Claimant Details
When user select "Email" as reported type
When user select "Critical Illness(CI)" as nature of loss/claim type
When user select "passenger" as claimant circumstances
When user enter "2000000" as claimant amount
When user enter "Group Life Loss" as circumstances of accidents

@reportMedicalClaims
Scenario: (Report Medical Claim) Verify user able to report claim successfully

#Loss Event Details
When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user enter "01/07/2024" as date of death/illnes/others
And user select "Hospital Expenses" as cause of claim
Then user enter "City Hospital" as place of death/illnes/others

#Claimant Details
When user select "Email" as reported type
When user select "Critical Illness(CI)" as nature of loss/claim type
When user select "passenger" as claimant circumstances
When user enter "450000" as claimant amount
When user enter "Medical Loss" as circumstances of accidents

@reportMoneyInsuranceCoverClaims
Scenario: (Report Money Insurance Cover Claim) Verify user able to report claim successfully

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
When user enter "Money Insurance Cover Loss" as circumstances of accidents

@reportPackagePolicyClaims
Scenario: (Report Package Policy Claim) Verify user able to report claim successfully

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
When user enter "Package Policy Loss" as circumstances of accidents

@reportPensionClaims
Scenario: (Report Pension Claim) Verify user able to report claim successfully

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
When user enter "Pension Loss" as circumstances of accidents

@reportVehicleClaims
Scenario: (Report Vehicle Claim) Verify user able to report claim successfully

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
When user enter "Vehicle Loss" as circumstances of accidents


