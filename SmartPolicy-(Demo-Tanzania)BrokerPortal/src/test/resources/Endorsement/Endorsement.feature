@All
Feature: Endorsement 

Background: 

When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type

@UpgradePolicy
Scenario: (Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

When user enter "36961" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of contract value
When user click on compute button
When user click on update button 
When user enter "Upgrading endorsement" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user click on capture receipt icon
When user click on mode dropdown
When user enter "Electronic Funds Transfer (EFT)" as mode
When user select Electronic Funds Transfer (EFT) as mode
When user click on issuer bank dropdown
When user enter "Absa Group Limited" as issuer bank
When user select Absa Group Limited as issuer bank
When user click on collecting bank dropdown
When user enter "Uchumi Commercial Bank" as collecting bank
When user select Uchumi Commercial Bank as collecting bank
When user enter "1250" as reference No
When user click on proceed button 
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@DownGradePolicy
Scenario: (Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "36962" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of contract value
When user click on compute button
When user click on update button 
When user enter "Downgrading endorsement" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancial
Scenario: (Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement
When user enter "36962" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user select non-financial endorsement
When user enter "Pravin Testing Non Financial Change1" to make change in insured name
When user enter "Testing cover details" to make change in covering details
When user enter "Testing description of risk" to make change in description of risk
When user enter "Payeee name" to make change in firstloss payee
When user enter "Non Financial endorsement" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


