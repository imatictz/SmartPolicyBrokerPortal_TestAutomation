package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Quotations/AccidentalDamage.feature", 
                   tags= "@AllFields", 
                   glue={"cucumberMap3AccidentalDamage","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestAccidentalDamageQuotation extends AbstractTestNGCucumberTests{

}
