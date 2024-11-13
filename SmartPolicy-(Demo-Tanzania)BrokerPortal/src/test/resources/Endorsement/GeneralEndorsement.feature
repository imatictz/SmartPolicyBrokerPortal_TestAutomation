@All
Feature: General Endorsement 

Background: 

When user navigate on operation dropdown menu
When user navigate on endorsement menu
When user click on endorsement option
When user click on add button
When user click on endorsement type dropdown
When user enter "General Endorsements" as endorsement type
When user select General Endorsements as endorsement type

#Motor Quotation
@UpgradeMotorPolicy
Scenario: (Motor Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "37429" risk note number
When user click on fetch button
When user enter "45000000" as change value of sum insured
When user click on compute button
When user enter "Upgrading Policy" as endorsement details
When user select on process endorsement button
When user click on OK button to process endorsement 
#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "AL-5" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
And user navigate on pending approvals option
Then user click on endorsement approval option
When user click on display icon
Then user click on approve endorsement button
When user enter "37429" as risk note 
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


@DownGradeMotorPolicy
Scenario: (Motor Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37262" risk note number
When user click on fetch button
When user enter "45000000" as change value of sum insured
When user click on compute button
When user enter "Upgrading Policy" as endorsement details
When user select on process endorsement button
When user click on OK button to process endorsement 
When user enter "37262" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialMotorPolicy
Scenario: (Motor Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement
When user enter "37261" risk note number
When user click on fetch button
When user select non-financial endorsement
When user enter "Payeee name" to make change in firstloss payee
When user enter "Non Financial endorsement" as endorsement details
When user select on process endorsement button
When user click on OK button to process endorsement
When user enter "37261" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


#Bond Quotation
@UpgradeBondPolicy
Scenario: (Bond Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "37124" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of contract value
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37136" as risk note 
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


@DownGradeBondPolicy
Scenario: (Bond Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37136" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of contract value
When user click on compute button
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37136" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialBondPolicy
Scenario: (Bond Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement
When user enter "33998" risk note number
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
When user enter "33998" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

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

#Accidental Damage Quotation
@UpgradeAccidentalPolicy
Scenario: (Accidental Damage Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "33962" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user enter "33962" as risk note 
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


@DownGradeAccidentalPolicy
Scenario: (Accidental Damage Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37147" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37147" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialAccidentalPolicy
Scenario: (Accidental Damage Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement
When user enter "37147" risk note number
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
When user enter "37147" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Burglary/Theft Quotation
@UpgradeBurglaryPolicy
Scenario: (Burglary/Theft Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "37148" risk note number
When user click on fetch button
#When user enter "46548-12446-54984" as cover note number
When user click on select option to edit details
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user enter "37148" as risk note 
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


@DownGradeBurglaryPolicy
Scenario: (Burglary/Theft Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37151" risk note number
When user click on fetch button
#When user enter "46548-12446-54984" as cover note number
When user click on select option to edit details
When user enter "25000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37151" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialBurglaryPolicy
Scenario: (Burglary/Theft Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement
When user enter "37149" risk note number
When user click on fetch button
#When user enter "46548-12446-54984" as cover note number
When user select non-financial endorsement
When user enter "Pravin Testing Non Financial Change1" to make change in insured name
When user enter "Testing cover details" to make change in covering details
When user enter "Testing description of risk" to make change in description of risk
When user enter "Payeee name" to make change in firstloss payee
When user enter "Non Financial endorsement" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37149" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Fidelity Quotation
@UpgradeFidelityPolicy
Scenario: (Fidelity Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "37153" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user enter "37153" as risk note 
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


@DownGradeFidelityPolicy
Scenario: (Fidelity Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37154" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button 
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37154" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialFidelityPolicy
Scenario: (Fidelity Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement
When user enter "37155" risk note number
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
When user enter "37155" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Fire and Burglary Quotation
@UpgradeFirePolicy
Scenario: (Fire and Burglary Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "37153" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user enter "37153" as risk note 
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


@DownGradeFirePolicy
Scenario: (Fire and Burglary Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37154" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button 
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37154" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Pension Quotation
@UpgradePensionPolicy
Scenario: (Pension Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "37239" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user enter "37239" as risk note 
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


@DownGradePensionPolicy
Scenario: (Pension Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37240" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button 
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37240" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialPensionPolicy
Scenario: (Pension Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement
When user enter "37242" risk note number
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
When user enter "37242" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

#Credit Life Quotation
@UpgradeCreditLifePolicy
Scenario: (Credit Life Quotation Endorsement-UpgradePolicy)Verify user able to do policy upgrading for general financial endorsement

#BrokerPortal
When user enter "37243" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "45000000" as change value of sum assured
When user click on compute button
When user click on update button 
When user enter "Upgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement 
When user enter "37243" as risk note 
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


@DownGradeCreditLifePolicy
Scenario: (Credit Life Quotation Endorsement-DownGradePolicy)Verify user able to do policy downgrading for general financial endorsement
When user enter "37244" risk note number
When user click on fetch button
When user enter "46548-12446-54984" as cover note number
When user click on edit icon to make financial changes
When user enter "25000" as change value of sum assured
When user click on compute button 
When user click on update button 
When user enter "Downgrading Policy" as endorsement details
When user click on process endorsement button
When user click on OK button to process endorsement
When user enter "37244" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status

@NonFinancialCreditLifePolicy
Scenario: (Credit Life Quotation Endorsement-NonFinancial)Verify user able to do policy  general non-financial endorsement
When user enter "37245" risk note number
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
When user enter "37245" as risk note 
Then user click on search button
When user click on process endorsement icon
When user click on YES button for confirmation
Then user able to view "Issued" as status


