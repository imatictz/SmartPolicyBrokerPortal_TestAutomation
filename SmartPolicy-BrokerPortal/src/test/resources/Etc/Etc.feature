
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