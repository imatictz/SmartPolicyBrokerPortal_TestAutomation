package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Quotations/CreditLife.feature", 
                   tags= "@All", 
                   glue={"cucumberMap8CreditLife","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestCreditLifeQuotation extends AbstractTestNGCucumberTests{

}

