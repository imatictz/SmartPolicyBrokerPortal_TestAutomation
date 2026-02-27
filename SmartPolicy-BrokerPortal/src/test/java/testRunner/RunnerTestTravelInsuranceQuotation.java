package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Quotations/TravelInsurance.feature", 
                   tags= "@MandatoryFieldsNoAddon", 
                   glue={"cucumberMap11TravelInsurance","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )



public class RunnerTestTravelInsuranceQuotation extends AbstractTestNGCucumberTests{

}

//No quote available on testproject user