package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Quotations/Vehicle.feature", 
                   tags= "@MandatoryFields", 
                   glue={"cucumberMap2Vehicle","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestVehicleQuotation extends AbstractTestNGCucumberTests{

}


