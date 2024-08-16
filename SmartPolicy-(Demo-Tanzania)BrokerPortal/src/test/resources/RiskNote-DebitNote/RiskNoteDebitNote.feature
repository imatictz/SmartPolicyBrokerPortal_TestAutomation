@All
Feature: Issue Risk Note

Background: 
 
When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations

@IssueRiskNote
Scenario: (Issue Risk Note) Verify user able to issue risk note successfully
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

