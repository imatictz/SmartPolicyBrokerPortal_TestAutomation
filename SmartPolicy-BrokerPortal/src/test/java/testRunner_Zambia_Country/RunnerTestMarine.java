package testRunner_Zambia_Country;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Zambia_Country/Quotations/Marine.feature", 
                   tags= "@Mandatory", 
                   glue={"cucumberMap29Marine","ZambiaHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestMarine extends AbstractTestNGCucumberTests{
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
	    System.setProperty("dataproviderthreadcount", "2");
	    return super.scenarios();
	}
}
