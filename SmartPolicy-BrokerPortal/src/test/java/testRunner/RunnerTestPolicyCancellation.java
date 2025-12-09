package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/PolicyCancellation/PolicyCancel.feature", 
                   tags= "@FullPaymentCancel", 
                   glue={"cucumberMap28PolicyCancel","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )


public class RunnerTestPolicyCancellation extends AbstractTestNGCucumberTests {

}

