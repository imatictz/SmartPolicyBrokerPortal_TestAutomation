package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Endorsement/GeneralEndorsement.feature", 
                   tags= "@UpgradeMotorPolicy", 
                   glue={"cucumberMap17Endorsement","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestEndorsement extends AbstractTestNGCucumberTests{

}

//   FeatureFile
//   GeneralEndorsement   Note:Enter Risk Note no
//   MedicalEndorsement