package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Quotations/Bonds.feature", 
                   tags= "@All", 
                   glue={"cucumberMap5Bonds","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )


public class RunnerTestBondsQuotation extends AbstractTestNGCucumberTests{
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
	    System.setProperty("dataproviderthreadcount", "2");

	    Object[][] original = super.scenarios();

	    int repeatCount = 1; // 🔁 Number of times you want to run

	    Object[][] modified = new Object[original.length * repeatCount][2];

	    int index = 0;
	    for (int i = 0; i < repeatCount; i++) {
	        for (Object[] scenario : original) {
	            modified[index++] = scenario;
	        }
	    }

	    return modified;
	}
}

