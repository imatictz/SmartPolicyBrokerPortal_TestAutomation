package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Quotations/Pension.feature", 
                   tags= "@MandatoryFields", 
                   glue={"cucumberMap14Pension","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestPensionQuotation extends AbstractTestNGCucumberTests{

}

