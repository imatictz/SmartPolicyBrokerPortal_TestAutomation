package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/RiskNote-DebitNote/RiskNoteScreen.feature", 
                   tags= "@PrintAccidentRiskNote", 
                   glue={"cucumberMap22RiskNoteScreen","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestRiskNoteScreen extends AbstractTestNGCucumberTests{
	
}

