@All
Feature: General Endorsement 

Background: 

#Get Risk Note Number
When user navigate on operation dropdown menu
Then user select risk note menu


#Motor Quotation
@UpgradeMotorPolicy
Scenario: (Motor Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Motor" as Insurance Type
When user click on search button to find "Motor" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "450000" as change value of sum insured
When user click on compute button
When user enter "Upgrading Policy" as endorsement details
When user select on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
#When user enter "Motor" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
#When user enter "Motor" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Awaiting Receipt" as status
When user click on actions button
When user click on capture receipt icon
When user select "Electronic Funds Transfer (EFT)" as mode
When user select "Absa Group Limited" as issuer bank
When user select "Uchumi Commercial Bank" as collecting bank
When user enter "1250" as reference No
When user click on proceed button
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status



@DownGradeMotorPolicy
Scenario: (Motor Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user select "01/01/2025" as from date
When user enter "Motor" as Insurance Type
When user click on search button to find "Motor" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "500" as change value of sum insured
When user click on compute button
When user enter "Downgrading Policy" as endorsement details
When user select on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
#When user enter "Motor" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
#When user enter "Motor" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen

#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


@NonFinancialMotorPolicy
Scenario: (Motor Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement

When user select "01/01/2025" as from date
When user enter "Motor" as Insurance Type
When user click on search button to find "Motor" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user select non-financial endorsement
When user enter "Payeee name" to make change in firstloss payee
When user enter "Non Financial endorsement" as endorsement details
When user select on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
#When user enter "Motor" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
#When user enter "Motor" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen

#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


#Bond Quotation
@UpgradeBondPolicy
Scenario: (Bond Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement
#BrokerPortal

When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user click on search button to find "Bonds" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of contract value
When user click on compute button
When user click on update button
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Awaiting Receipt" as status
When user click on actions button
When user click on capture receipt icon
When user select "Electronic Funds Transfer (EFT)" as mode
When user select "Absa Group Limited" as issuer bank
When user select "Uchumi Commercial Bank" as collecting bank
When user enter "1250" as reference No
When user click on proceed button
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


@DownGradeBondPolicy
Scenario: (Bond Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user click on search button to find "Bonds" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of contract value
When user click on compute button
When user click on update button
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialBondPolicy
Scenario: (Bond Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement

When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user click on search button to find "Bonds" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
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
When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status



#Accidental Damage Quotation
@UpgradeAccidentalPolicy
Scenario: (Accidental Damage Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal

When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user click on search button to find "Individual Personal Accident" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Awaiting Receipt" as status
When user click on actions button
When user click on capture receipt icon
When user select "Electronic Funds Transfer (EFT)" as mode
When user select "Absa Group Limited" as issuer bank
When user select "Uchumi Commercial Bank" as collecting bank
When user enter "1250" as reference No
When user click on proceed button
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


@DownGradeAccidentalPolicy
Scenario: (Accidental Damage Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user click on search button to find "Individual Personal Accident" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialAccidentalPolicy
Scenario: (Accidental Damage Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement

When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user click on search button to find "Individual Personal Accident" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
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
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Burglary/Theft Quotation
@UpgradeBurglaryPolicy
Scenario: (Burglary/Theft Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user click on search button to find "Burglary/Theft" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user click on select option to edit details
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Awaiting Receipt" as status
When user click on actions button
When user click on capture receipt icon
When user select "Electronic Funds Transfer (EFT)" as mode
When user select "Absa Group Limited" as issuer bank
When user select "Uchumi Commercial Bank" as collecting bank
When user enter "1250" as reference No
When user click on proceed button
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


@DownGradeBurglaryPolicy
Scenario: (Burglary/Theft Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user click on search button to find "Burglary/Theft" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user click on select option to edit details
When user enter "25000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialBurglaryPolicy
Scenario: (Burglary/Theft Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement

When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user click on search button to find "Burglary/Theft" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user select non-financial endorsement
When user enter "Pravin Testing Non Financial Change1" to make change in insured name
When user enter "Testing cover details" to make change in covering details
When user enter "Testing description of risk" to make change in description of risk
When user enter "Payeee name" to make change in firstloss payee
When user enter "Non Financial endorsement" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Fidelity Quotation
@UpgradeFidelityPolicy
Scenario: (Fidelity Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user click on search button to find "Fidelity" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Awaiting Receipt" as status
When user click on actions button
When user click on capture receipt icon
When user select "Electronic Funds Transfer (EFT)" as mode
When user select "Absa Group Limited" as issuer bank
When user select "Uchumi Commercial Bank" as collecting bank
When user enter "1250" as reference No
When user click on proceed button
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


@DownGradeFidelityPolicy
Scenario: (Fidelity Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user click on search button to find "Fidelity" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button 
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialFidelityPolicy
Scenario: (Fidelity Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement

When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user click on search button to find "Fidelity" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
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
When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Fire and Burglary Quotation
@UpgradeFirePolicy
Scenario: (Fire and Burglary Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user click on search button to find "Fire and Burglary" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Awaiting Receipt" as status
When user click on actions button
When user click on capture receipt icon
When user select "Electronic Funds Transfer (EFT)" as mode
When user select "Absa Group Limited" as issuer bank
When user select "Uchumi Commercial Bank" as collecting bank
When user enter "1250" as reference No
When user click on proceed button
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


@DownGradeFirePolicy
Scenario: (Fire and Burglary Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user click on search button to find "Fire and Burglary" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button 
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


@NonFinancialFirePolicy
Scenario: (Fire and Burglary Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement

When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user click on search button to find "Fire and Burglary" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
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
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Pension Quotation
@UpgradePensionPolicy
Scenario: (Pension Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user click on search button to find "Pension" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Awaiting Receipt" as status
When user click on actions button
When user click on capture receipt icon
When user select "Electronic Funds Transfer (EFT)" as mode
When user select "Absa Group Limited" as issuer bank
When user select "Uchumi Commercial Bank" as collecting bank
When user enter "1250" as reference No
When user click on proceed button
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


@DownGradePensionPolicy
Scenario: (Pension Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user click on search button to find "Pension" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button 
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialPensionPolicy
Scenario: (Pension Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement

When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user click on search button to find "Pension" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
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
When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Credit Life Quotation
@UpgradeCreditLifePolicy @one
Scenario: (Credit Life Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

When user select "01/10/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user click on search button to find "Credit Life Insurance" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Awaiting Receipt" as status
When user click on actions button
When user click on capture receipt icon
When user select "Electronic Funds Transfer (EFT)" as mode
When user select "Absa Group Limited" as issuer bank
When user select "Uchumi Commercial Bank" as collecting bank
When user enter "1250" as reference No
When user click on proceed button
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


@DownGradeCreditLifePolicy   @one
Scenario: (Credit Life Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement

When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user click on search button to find "Credit Life Insurance" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button 
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialCreditLifePolicy @one
Scenario: (Credit Life Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement

When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user click on search button to find "Credit Life Insurance" risk note
When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type
#BrokerPortal
When user enter risk note number to search policy
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
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user enter risk note number
When user click on search button
Then user able to view "Insurer Approval Required" as status

#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "Auto-1" as username
When user enter "Sa@123456" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user enter risk note number
When user click on search button(Insurer)
Then user able to view "Insurer Approval Required" as status(Insurer)
When user click on display icon
Then user click on approve endorsement button
Then user navigate on Endorsement Approval screen
#Return To Broker Portal

When user click on search button
Then user able to view "Pending" as status
When user click on actions button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


