package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Reports/Report.feature",     
                   tags= "@105", 
                   glue={"cucumberMap21Reports","MyHooks"}, 
                   monochrome=true,   
                   plugin= {"pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},  
                   dryRun=false  
                 )

public class RunnerTestMoneyInsuranceQuotation extends AbstractTestNGCucumberTests
{     
	
}

//         feature                               |      glue                        |        tags
//  1)Login (ID-Password)                        | cucumberMap                      | @SmokeTest @RegressionTest                     
//  2)ClientDetails (ClientName,accNo,IDNo,eMail)| cucumberMap                      | @MandatoryFields
//  3)MoneyInsuranceCover                        | cucumberMap1MoneyInsuranceCover  | @MandatoryFields
//  4)Vehicle   (RegistrationNumber)             | cucumberMap2Vehicle              | @MandatoryFields
//  5)AccidentalDamage                           | cucumberMap3AccidentalDamage     | @MandatoryFields
//  6)Fire&Burglary                              | cucumberMap4FireAndBurglary      | @MandatoryFields
//  7)Bonds                                      | cucumberMap5Bonds                | @MandatoryFields
//  8)Burglary                                   | cucumberMap6Burglary             | @MandatoryFields
//  9)Fidelity                                   | cucumberMap7Fidelity             | @MandatoryFields
// 10)CreditLife                                 | cucumberMap8CreditLife           | @MandatoryFields
// 11)PackagePolicy                              | cucumberMap9PackagePolicy        | @MandatoryFields
// 12)FireClassI                                 | cucumberMap10FireClassI          | @MandatoryFields
// 13)GATravelInsurance                          | cucumberMap11GATravelInsurance   | @MandatoryFields
// 14)Medical                                    | cucumberMap12Medical             | @MandatoryFields
// 15)GroupLife                                  | cucumberMap13GroupLife           | @MandatoryFields
// 16)Pension                                    | cucumberMap14Pension             | @MandatoryFields 
// 17)EduCareLifeInsurance                       | cucumberMap15EduCareLifeInsurance| @MandatoryFields 
// 18)RiskNoteDebitNote   /RiskNoteScreen        | cucumberMap16RiskNoteDebitNote   | @IssueRiskNote  /@icons
// 19)Endorsement (Enter RiskNote)(Bonds)        | cucumberMap17Endorsement         | @UpgradePolicy  @DownGradePolicy @NonFinancial
// 20)Claims      (Enter RiskNoteNo)             | cucumberMap18Claims              | @reportClaims   
// 21)Payment                                    | cucumberMap19Payment             | @AllFields
// 22)RenewPolicy   (Enter RiskNoteNo)           | cucumberMap20RenewPolicy         | @All
// 23)Reports                                    | cucumberMap21Reports             | @All


//NO compute button present in travel insurance quotation   - which Insurer to select 
//Group Life when user click on recompute button it get stuck 
//Educare life insurance no present in insurance type










