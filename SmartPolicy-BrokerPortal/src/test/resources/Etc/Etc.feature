
Feature: All test

#Issue Risk Notes
@IssueRiskNote1
Scenario: (Issue Risk Note-GATravelInsuQuote) Verify user able to issue risk note of GA Travel Insurance quotation successfully
When user select "01/01/2024" as from date
When user enter "Bonds" as Insurance Type
When user click on search button
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
When user click on issue risk note option
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status

@IssueRiskNote1
Scenario: (Issue Risk Note-MoneyInsurnaceCoverQuote) Verify user able to issue risk note of money insurance cover quotation successfully
When user select "01/01/2024" as from date
When user enter "Money Insurance Cover" as Insurance Type
When user click on search button to find "Money Insurance Cover" quote
When user enter quote number to search "Money Insurance Cover" quote
When user click on search button
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
When user click on issue risk note option
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status

@IssueRiskNote1
Scenario: (Issue Risk Note-PackagePolicyQuote) Verify user able to issue risk note of package policy quotation successfully
When user select "01/01/2024" as from date
When user enter "Package Policy" as Insurance Type
When user click on search button
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
When user click on issue risk note option
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status



#Bond Quote Alert
@alertMessage
Scenario: Validate sequential alert messages and provide inputs
When the user clicks save button without entering mandatory fields
Then the system should display the alert message "2003-Please select Client Status"
When user enter "Pravin Testing Broker" as client name
When the user select Pravin Testing as client name
#When the user clicks save button without entering mandatory fields


#Report Claim

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
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer


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
And user clicks on the actions dropdown
When user click on report to insurer option
And user click on yes,report button for confirmation
Then user able to view "Claim Intimated to Insurer" as status after reporting to insurer

Scenario: RiskNote Screen Icons
When user click on display icon
Then user able to view bonds risk note screen
When user click on GoTo Quotation button
Then user able to navigate on quotation screen and view quote
When user click on GoTo DebitNote button
Then user able to navigate on debitnote screen and view debit No
When user click on print icon




#client screen

Scenario: (ClientDetails) Verify mandatory fields for Individual client cannot be empty
When user click on save button to save client details
Then user able to view "2001-Please specify the Client Name !" error message 

#Endorsement

#Money Insurance Cover Quotation
@UpgradeMoneyPolicy
Scenario: (Money Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "32836" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user enter "32836" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Insurer Portal
#When user open new tab
#When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
#When user enter "AL-5" as username
#When user enter "Sp@12345" as password
#When user click on login button
#When user navigate on operation dropdown menu (InsurerPortal)
#And user navigate on pending approvals option
#Then user click on endorsement approval option
#When user click on display icon
#Then user click on approve endorsement button


@DownGradeMoneyPolicy
Scenario: (Money Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37107" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37107" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialMoneyPolicy
Scenario: (Money Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement
When user enter "37143" risk note number
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
When user enter "37143" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status