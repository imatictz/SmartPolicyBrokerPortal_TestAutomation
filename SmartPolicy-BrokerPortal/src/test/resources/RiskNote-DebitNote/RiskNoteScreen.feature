@All
Feature: Risk note screen

Background: 

When user navigate on operation dropdown menu
Then user select risk note menu

#@PrintAccidentRiskNote
 Scenario: User prints risk note for Individual Personal Accident 
   When user select "01/09/2025" as from date
   When user enter "Individual Personal Accident" as Insurance Type
   When user click on search button to find "Individual Personal Accident" risk note
   When user enter risk note number to search "Individual Personal Accident" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable|
  # And the user should be able to send the risk note to the printer
  
@PrintBondsRiskNote
 Scenario: User prints risk note for Bonds 
   When user select "01/09/2025" as from date
   When user enter "Bonds" as Insurance Type
   When user click on search button to find "Bonds" risk note
   When user enter risk note number to search "Bonds" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
  
@PrintBurglaryRiskNote
 Scenario: User prints risk note for Burglary/Theft 
   When user select "01/09/2025" as from date
   When user enter "Burglary/Theft" as Insurance Type
   When user click on search button to find "Burglary/Theft" risk note
   When user enter risk note number to search "Burglary/Theft" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
  
@PrintCreditlifeRiskNote
 Scenario: User prints risk note for Credit life Insurance
   When user select "01/09/2025" as from date
   When user enter "Credit Life Insurance" as Insurance Type
   When user click on search button to find "Credit Life Insurance" risk note
   When user enter risk note number to search "Credit Life Insurance" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
  
@PrintFidelityRiskNote
 Scenario: User prints risk note for Fidelity Insurance
   When user select "01/09/2025" as from date
   When user enter "Fidelity" as Insurance Type
   When user click on search button to find "Fidelity" risk note
   When user enter risk note number to search "Fidelity" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
  
@PrintFireBurglaryRiskNote
 Scenario: User prints risk note for Fire and Burglary Insurance
   When user select "01/09/2025" as from date
   When user enter "Fire and Burglary" as Insurance Type
   When user click on search button to find "Fire and Burglary" risk note
   When user enter risk note number to search "Fire and Burglary" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
  
@PrintFireClassRiskNote
 Scenario: User prints risk note for Fire Class Insurance
   When user select "01/09/2025" as from date
   When user enter "Fire Class" as Insurance Type
   When user click on search button to find "Fire Class" risk note
   When user enter risk note number to search "Fire Class" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
  
@PrintGroupLifeRiskNote
 Scenario: User prints risk note for Group Life Insurance
   When user select "01/09/2025" as from date
   When user enter "Group Life" as Insurance Type
   When user click on search button to find "Group Life" risk note
   When user enter risk note number to search "Group Life" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
  
@PrintMedicalRiskNote
 Scenario: User prints risk note for Medical Insurance
   When user select "01/09/2025" as from date
   When user enter "Medical" as Insurance Type
   When user click on search button to find "Medical" risk note
   When user enter risk note number to search "Medical" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
  
@PrintPensionRiskNote
 Scenario: User prints risk note for Pension Insurance
   When user select "01/09/2025" as from date
   When user enter "Pension" as Insurance Type
   When user click on search button to find "Pension" risk note
   When user enter risk note number to search "Pension" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
  
#@PrintMotorRiskNote
 Scenario: User prints risk note for Motor Insurance
   When user select "01/09/2025" as from date
   When user enter "Motor" as Insurance Type
   When user click on search button to find "Motor" risk note
   When user enter risk note number to search "Motor" risk note
   When user click on search button
   And user clicks on print risk note option
   And the risk note should include all relevant details like
      | Field           | 
      | Risk Note No    |
      | Cover Note No   |
      | Date Of Issue   |
      | Policy No       |
      | Insurer         |
      | Insured Name    | 
      | Insurance Type  | 
      | Premium         |
      | VAT Amount      |
      | Total Receivable| 
  # And the user should be able to send the risk note to the printer
 



				
