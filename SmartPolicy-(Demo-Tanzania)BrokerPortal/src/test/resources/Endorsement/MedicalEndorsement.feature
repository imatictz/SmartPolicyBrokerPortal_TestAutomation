@All
Feature: Medical Endorsement 

Background: 

When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "Medical Endorsement" as endorsement type
When user select Medical Endorsement as endorsement type

#Medical Quotation
@UpgradeMedicalPolicy
Scenario: (Medical Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "37238" risk note number
When user click on fetch button
#When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of total premium
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user enter "37238" as risk note 
Then user click on search button
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


@DownGradeMedicalPolicy
Scenario: (Medical Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37154" risk note number
When user click on fetch button
#When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of total premium
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37154" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

