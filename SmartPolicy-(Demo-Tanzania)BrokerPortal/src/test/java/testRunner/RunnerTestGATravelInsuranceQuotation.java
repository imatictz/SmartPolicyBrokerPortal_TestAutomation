package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Quotations/GATravelInsurance.feature", 
                   tags= "@MandatoryFields", 
                   glue={"cucumberMap11GATravelInsurance","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestGATravelInsuranceQuotation extends AbstractTestNGCucumberTests{

}

