package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/ProvisionalBatchTaxInvoices/ProvisionalBatchTaxInvoices.feature", 
                   tags= "@All", 
                   glue={"cucumberMap22ProvisionalBatchTaxInvoices","MyHooks"}, 
                   monochrome=true,   
                   plugin= { "pretty",   	
                           "html:target/CucumberTest/CucumbetReport.html"},
                   dryRun=false  
                 )


public class RunnerTestProvisionalBatchTaxInvoices extends AbstractTestNGCucumberTests {

}
