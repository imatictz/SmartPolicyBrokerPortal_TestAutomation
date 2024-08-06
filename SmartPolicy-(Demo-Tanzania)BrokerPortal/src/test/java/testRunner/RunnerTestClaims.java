package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Claims/Claims.feature", 
                   tags= "@reportVehicleClaims", 
                   glue={"cucumberMap18Claims","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestClaims extends AbstractTestNGCucumberTests{

}

//Enter Risk Note Number