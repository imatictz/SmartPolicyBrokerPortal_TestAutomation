package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/RiskNote-DebitNote/RiskNoteDebitNote.feature", 
                   tags= "@All", 
                   glue={"cucumberMap16RiskNoteDebitNote","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestRiskNote_DebitNote extends AbstractTestNGCucumberTests{

}

