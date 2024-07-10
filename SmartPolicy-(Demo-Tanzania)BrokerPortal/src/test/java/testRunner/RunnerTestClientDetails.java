package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
        features="src/test/resources/Business_Logic/ClientDetails.feature",     
        tags= "@Corporate", 
        glue={"cucumberMap","MyHooks"}, 
        monochrome=true,   
        plugin= {"pretty",   	
                "html:target/CucumberTest/CucumbetReport.html"},   
        dryRun=false  
      )

public class RunnerTestClientDetails extends AbstractTestNGCucumberTests
{     

}
