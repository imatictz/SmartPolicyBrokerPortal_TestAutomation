@All
Feature: Renew Policy

Background: Launch browser and open application

When user navigate on operation dropdown
And user navigate on policy renewals option
Then user click on renew policy option

@AllFields
Scenario: (RenewPolicy) Verify user able to create the quotation for the renewing policy successfully
#Renew (Bonds Quote)
When user enter "01/01/2024" as expiry from date
And user enter "31883" as risk note
Then user click on search button
When user click on renew option
Then user click on renew button for renewal confirmation

#New Quote (Bonds)
When user click on quotations menu
When user click on options icon
And user click on edit option
When user enter "56189-41518-41215" as cover note
When user click on select option
When user click on insurance class dropdown
When user enter "Advance Payment Bond 1" as insurance class
When user select Advance Payment Bond one as insurance class
And user enter "5000000" as contract value 
And user click on compute button
Then user click on update button to insert policy information
Then user click on update button

#Issue Risk Note
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