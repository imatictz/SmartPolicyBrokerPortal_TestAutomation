package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/Business_Logic/ClientDetails.feature",
    		   "src/test/resources/Quotations/Medical.feature"},
    glue = {
        "cucumberMap",
        "cucumberMap12Medicals",
        "BaseMapMethods",
        "MyHooks"
    },
    plugin = {"pretty"},
    monochrome = true
)
public class ParallelRunner extends AbstractTestNGCucumberTests {

	@DataProvider(parallel = true)
	public Object[][] scenarios() {
	    System.setProperty("dataproviderthreadcount", "2");
	    return super.scenarios();
	}


}
