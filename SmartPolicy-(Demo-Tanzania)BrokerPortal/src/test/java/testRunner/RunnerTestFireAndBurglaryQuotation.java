package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Quotations/FireAndBurglary.feature", 
                   tags= "@AllFields", 
                   glue={"cucumberMap4FireAndBurglary","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestFireAndBurglaryQuotation extends AbstractTestNGCucumberTests{

}

