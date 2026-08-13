package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/CustomerManagement/CollateralFeedback.feature", 
                   tags= "@All", 
                   glue={"cucumberMap32CollateralFeedback","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestCollateralFeedback extends AbstractTestNGCucumberTests{
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
	    System.setProperty("dataproviderthreadcount", "2");
	    return super.scenarios();
	}
}
