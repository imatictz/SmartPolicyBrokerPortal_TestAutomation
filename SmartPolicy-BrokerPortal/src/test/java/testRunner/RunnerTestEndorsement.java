package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Endorsement/GeneralEndorsement.feature", 
                   tags= "@All", 
                   glue={"cucumberMap17Endorsement","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestEndorsement extends AbstractTestNGCucumberTests{
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
	    System.setProperty("dataproviderthreadcount", "2");
	    return super.scenarios();
	}
}

//   FeatureFile
//   GeneralEndorsement   Note:Enter Risk Note no
//   MedicalEndorsement