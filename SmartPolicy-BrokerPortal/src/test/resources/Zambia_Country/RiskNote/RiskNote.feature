@All
Feature: Issue Risk Note

Background: 
 
When user navigate on operation dropdown menu
When user navigate on quotations menu
When user click on current quotations


@IssueAccidentalRiskNote
Scenario: (Issue Risk Note-AccidentalDamageQuote) Verify user able to issue risk note of accidental damage quotation successfully
When user select "01-Jan-2026" as from date
When user enter "Accident Cover" as Insurance Type
When user click on search button to find "Accident Cover" quote with status "Pending"
When user enter quote number to search "Accident Cover" quote
When user click on search button
When user click on issue risk note option(Zambia)
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status


@IssueBondsRiskNote
Scenario: (Issue Risk Note-BondQuote) Verify user able to issue risk note of bonds quotation successfully
When user select "01-Jan-2026" as from date
When user enter "Bonds" as Insurance Type
When user click on search button to find "Bonds" quote with status "Pending"
When user enter quote number to search "Bonds" quote
When user click on search button
When user click on issue risk note option(Zambia)
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status



@IssueBurglaryRiskNote
Scenario: (Issue Risk Note-BurglaryQuote) Verify user able to issue risk note of burglary quotation successfully

When user select "01-Jan-2026" as from date
When user enter "Burglary/Theft" as Insurance Type
When user click on search button to find "Burglary/Theft" quote with status "Pending"
When user enter quote number to search "Burglary/Theft" quote
When user click on search button
When user click on issue risk note option(Zambia)
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status

@IssueCreditLifeRiskNote
Scenario: (Issue Risk Note-CreditLifeQuote) Verify user able to issue risk note of creditlife quotation successfully
When user select "01-Jan-2026" as from date
When user enter "Credit Life" as Insurance Type
When user click on search button to find "Credit Life" quote with status "Pending"
When user enter quote number to search "Credit Life" quote
When user click on search button
When user click on issue risk note option(Zambia)
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status

@IssueFidelityRiskNote
Scenario: (Issue Risk Note-FidelityQuote) Verify user able to issue risk note of fidelity quotation successfully
When user select "01-Jan-2026" as from date
When user enter "Fidelity" as Insurance Type
When user click on search button to find "Fidelity" quote with status "Pending"
When user enter quote number to search "Fidelity" quote
When user click on search button
When user click on issue risk note option(Zambia)
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status



@IssueFireClassIRiskNote
Scenario: (Issue Risk Note-FireClassIQuote) Verify user able to issue risk note of fire class I quotation successfully
When user select "01-Jan-2026" as from date
When user enter "Fire Class" as Insurance Type
When user click on search button to find "Fire Class" quote with status "Pending"
When user enter quote number to search "Fire Class" quote
When user click on search button
When user click on issue risk note option(Zambia)
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status



@IssueMedicalRiskNote
Scenario: (Issue Risk Note-MedicalQuote) Verify user able to issue risk note of medical quotation successfully
When user select "01-Jan-2026" as from date
When user enter "medical" as Insurance Type
When user click on search button to find "medical" quote with status "Pending"
When user enter quote number to search "medical" quote
When user click on search button
When user click on issue risk note option(Zambia)
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status



@IssueVehicleRiskNote
Scenario: (Issue Risk Note-VehicleQuote) Verify user able to issue risk note of vehicle quotation successfully
When user select "01-Jan-2026" as from date
When user enter "Motor" as Insurance Type
When user click on search button to find "Motor" quote with status "Pending"
When user enter quote number to search "Motor" quote
When user click on search button
When user click on issue risk note option(Zambia)
When user click on Yes button for confirmation
Then user able to view "Risk Note Issued" as status

