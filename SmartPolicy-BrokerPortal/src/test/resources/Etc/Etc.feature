
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

@workman
Scenario: Verify user able to enter all fields
    When user enter screen details :
      | Field Name                     | Value                    |
      | Show Policy                    | POL67890                 |
      | Insurer                        | Alliance Insurance       |
      | Currency                       | TZS                      |
      | X Rate                         | 1.00                     |
      | Insurer X Rate                 | 1.00                     |
      | Insured Name                   | XYZ Traders Ltd          |
      | Date From                      | 01/01/2026               |
      | - To -                         | 31/12/2026               |
      | Contact Person                 | Michael John             |
      | VAT %                          | 18                       |
      | Address                        | Dar es Salaam Tanzania   |
      | Branch                         | Head Office              |
      | Cover Note Number              | CN123456                 |
      | Business Type                  | Renewal                  |
      | Business by                    | Underwriter User         |
      | (For TRA Purpose Only)         | 123456789                |
      | VRN No.                        | VRN987654                |
      | Policy Type                    | Comprehensive            |
      | Loss Ratio Forecaste           | Low                      |
      | First Loss Payee               | true                     |
      | Bind to Collateral             | Yes                      |
      | Collateral Name                | Property Collateral      |
      | Borrower Type                  | true                     |
      | Borrower Account Name          | Jane Smith               |
      | Borrower Account Number        | 9876543210               |
      | Non-Renewable                  | true                     |
      | Covering Details               | Full building coverage   |
      | Description of Risk            | Fire and Allied Perils   |
      | Insured Status                 | Active                   |
      | Gender                         | Female                   |
      | ID Type                        | Passport                 |
      | ID Number:                     | P1234567                 |
      | Nationality                    | Kenyan                   |
      | Date of Birth                  | 01/01/1990               |
      | Insurance Class                | Marine Insurance         |
      | Description                    | Marine cargo policy      |
      | No of Employees                | 50                       |
      | Monthly Salary                 | 2000000                  |
      | Annual Salary/Limit of Liability | 75000000               |
      | Rate %                         | 2.5                      |
      | Override %                     | 1.5                      |
      | Annual Premium                 | 1500000                  |
      | Emp Liability %                | 5                        |
      | Actual Premium                 | 1550000                  |
      | Adjust Premium                 | 50000                    |
      | Total Premium                  | 1600000                  |
      | Other Taxes                    | 20000                    |
      | Other Fee                      | 10000                    |
      | VAT Amount                     | 288000                   |
      | Policy Holders Fund            | 5000                     |
      | Training/Insurance Levy        | 3000                     |
      | Stamp Duty                     | 1000                     |
      | Withhold Tax                   | 2000                     |
      | Commission Rate %              | 10                       |
      | Broker Commission              | 160000                   |
      | VAT on Commission              | 28800                    |
      | Insurer Settlement             | 1300000                  |
      | Administration Charges         | 5000                     |
      | Discount on Commission %       | 2                        |
      | Discount Commission            | 3000                     |
      | Discount on Premium %          | 1                        |
      | Discount Premium               | 15000                    |
      | Addon Premium                  | 25000                    |
      | Total Receivable               | 1700000                  |
      | Scope Of Cover                 | Standard fire cover      |
      | Reject Description             | N/A                      |
      
      
      
      
      
      #Beneficiary 2

When user enter "Tester Testing Beneficiary 2" as name of beneficiary (For Beneficiary Two)
When user enter "01/02/1990" as date of birth (For Beneficiary Two)
When user select "Female" as gender (For Beneficiary Two)
When user select "employee" as relationship to owner (For Beneficiary Two)
When user enter "659544202" as telephone (For Beneficiary Two)
When user enter "30" as percent of life benefit given (For Beneficiary Two)
When user enter "Address No 2" as address (For Beneficiary Two)

#Beneficiary 3

When user enter "Tester Testing Beneficiary 3" as name of beneficiary (For Beneficiary Three)
When user enter "20/12/1998" as date of birth (For Beneficiary Three)
When user select "other" as gender (For Beneficiary Three)
When user select "son" as relationship to owner (For Beneficiary Three)
When user enter "659544202" as telephone (For Beneficiary Three)
When user enter "35" as percent of life benefit given (For Beneficiary Three)
When user enter "Address No 3" as address (For Beneficiary Three)

#Beneficiary 4

When user enter "Tester Testing Beneficiary 4" as name of beneficiary (For Beneficiary Four)
When user enter "06/05/2010" as date of birth (For Beneficiary Four)
When user select "Male" as gender (For Beneficiary Four)
When user select "brother" as relationship to owner (For Beneficiary Four)
When user enter "659544202" as telephone (For Beneficiary Four)
When user enter "20" as percent of life benefit given (For Beneficiary Four)
When user enter "Address No 4" as address (For Beneficiary Four)



#Guardian 4

When user enter "Tester Testing Guardian 4" as name of guardian/Parent (For Guardian Four)
When user enter "06/04/1995" as date of birth (For Guardian Four)
When user select "Female" as gender (For Guardian Four)
When user enter "659544202" as telephone (For Guardian Four)
When user enter "Guardian Address 4" as address (For Guardian Four)

#Beneficiary 2

When user select "Life Beneficiary Two" as life beneficiary (For Beneficiary Two)
When user enter "25" as percent of savings benefit given (For Beneficiary Two)

#Beneficiary 3

When user select "Life Beneficiary Three" as life beneficiary (For Beneficiary Three)
When user enter "25" as percent of savings benefit given (For Beneficiary Three)

#Beneficiary 4

When user select "Life Beneficiary Four" as life beneficiary (For Beneficiary Four)
When user enter "25" as percent of savings benefit given (For Beneficiary Four)