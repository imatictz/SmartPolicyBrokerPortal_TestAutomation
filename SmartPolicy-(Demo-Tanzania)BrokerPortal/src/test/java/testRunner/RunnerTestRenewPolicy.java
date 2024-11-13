package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/RenewPolicy/RenewPolicy.feature", 
                   tags= "@All", 
                   glue={"cucumberMap20RenewPolicy","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestRenewPolicy extends AbstractTestNGCucumberTests{

}


