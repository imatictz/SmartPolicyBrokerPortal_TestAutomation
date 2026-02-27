@All
Feature: Endorsement Screen

Background: 
 
When user navigate on operation dropdown menu
And user navigate on endorsement options
Then user click on endorsement

@PrintAccidentEndorsement   @print
 Scenario: User print endorsement report for Individual Personal Accident policy
   When user select "01/01/2025" as from date
   When user enter "Individual Personal Accident" as Insurance Type
   When user click on search button to find "Individual Personal Accident" endorsement no
   When user enter endorsement no to search "Individual Personal Accident" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      | 
      
   @PrintBondsEndorsement   @print
   Scenario: User print endorsement report for Bonds policy
   When user select "01/01/2025" as from date
   When user enter "Bonds" as Insurance Type
   When user click on search button to find "Bonds" endorsement no
   When user enter endorsement no to search "Bonds" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      | 
      
   @PrintBurglaryTheftEndorsement   @print
   Scenario: User print endorsement report for Burglary/Theft policy
   When user select "01/01/2025" as from date
   When user enter "Burglary/Theft" as Insurance Type
   When user click on search button to find "Burglary/Theft" endorsement no
   When user enter endorsement no to search "Burglary/Theft" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the Burglary/Theft endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      |
      
   @PrintCreditlifeEndorsement   @print
   Scenario: User print endorsement report for Credit Life Insurance policy
   When user select "01/01/2025" as from date
   When user enter "Credit Life Insurance" as Insurance Type
   When user click on search button to find "Credit Life Insurance" endorsement no
   When user enter endorsement no to search "Credit Life Insurance" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      |  
      
   @PrintFidelityEndorsement   @print
   Scenario: User print endorsement report for Fidelity policy
   When user select "01/01/2025" as from date
   When user enter "Fidelity" as Insurance Type
   When user click on search button to find "Fidelity" endorsement no
   When user enter endorsement no to search "Fidelity" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      |
      
   @PrintFireBurglaryEndorsement   @print
   Scenario: User print endorsement report for Fire and Burglary policy
   When user select "01/01/2025" as from date
   When user enter "Fire and Burglary" as Insurance Type
   When user click on search button to find "Fire and Burglary" endorsement no
   When user enter endorsement no to search "Fire and Burglary" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      |
      
   @PrintFireClassEndorsement   @print
   Scenario: User print endorsement report for Fire Class policy
   When user select "01/01/2025" as from date
   When user enter "Fire Class" as Insurance Type
   When user click on search button to find "Fire Class" endorsement no
   When user enter endorsement no to search "Fire Class" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      |
      
   @PrintGroupLifeEndorsement   @print
   Scenario: User print endorsement report for Group Life policy
   When user select "01/01/2025" as from date
   When user enter "Group Life" as Insurance Type
   When user click on search button to find "Group Life" endorsement no
   When user enter endorsement no to search "Group Life" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the life endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      |
      
   @PrintMedicalEndorsement   @print
   Scenario: User print endorsement report for Medical policy
   When user select "01/01/2025" as from date
   When user enter "Medical" as Insurance Type
   When user click on search button to find "Medical" endorsement no
   When user enter endorsement no to search "Medical" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the medical endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      |  
      
   @PrintPensionEndorsement   @print
   Scenario: User print endorsement report for Pension policy
   When user select "01/01/2025" as from date
   When user enter "Pension" as Insurance Type
   When user click on search button to find "Pension" endorsement no
   When user enter endorsement no to search "Pension" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      | 
      
   @PrintMotorEndorsement   @print
   Scenario: User print endorsement report for Motor policy
   When user select "01/01/2025" as from date
   When user enter "Vehicle" as Insurance Type
   When user click on search button to find "Motor" endorsement no
   When user enter endorsement no to search "Motor" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the vehicle endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      |
      
      @PrintWorkmensEndorsement   @print
   Scenario: User print endorsement report for Workmens policy
   When user select "01/01/2025" as from date
   When user enter "Workmens (With Liability)" as Insurance Type
   When user click on search button to find "Workmens (With Liability)" endorsement no
   When user enter endorsement no to search "Workmens (With Liability)" endorsement record
   When user click on search button
   And user clicks on the actions dropdown
   And user clicks on print option
   And the vehicle endorsement report should include all relevant details like
      | Field              | 
      | Endorsement No     |
      | Risk Note No       |
      | Branch             |
      | Date               |
      | Insured Name       |
      | Insurance Company  |
      | New Premium        |
      | Actual Premium     |
      | VAT Amount         |
      | Total Premium      |   
      
