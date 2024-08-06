package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Quotations/Burglary.feature", 
                   tags= "@MandatoryFields", 
                   glue={"cucumberMap6Burglary","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestBurglaryQuotation extends AbstractTestNGCucumberTests{

}

