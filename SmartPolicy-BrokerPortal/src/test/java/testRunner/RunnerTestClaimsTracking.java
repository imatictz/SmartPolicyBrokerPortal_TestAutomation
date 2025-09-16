package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Claims/ClaimsTracking.feature", 
                   tags= "@All", 
                   glue={"cucumberMap25ClaimsTracking","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestClaimsTracking extends AbstractTestNGCucumberTests{

}

