package testRunner;

import io.cucumber.testng.*;
import org.testng.Assert;
import org.testng.annotations.*;

@CucumberOptions(
    features = "src/test/resources/Quotations/Medical.feature",
    tags = "@MandatoryFieldsNoAddon",
    glue = {
        "cucumberMap12Medical",
        "MyHooks"
    },
    monochrome = true,
    dryRun = false,
    plugin = {
        "pretty",
        "summary",
        "html:target/CucumberTest/CucumberReport.html"
    }
)
@Listeners(listeners.ForceFailListener.class)
public class RunnerTestMedicalQuotation {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "scenarios")
    public void runScenario(PickleWrapper pickle, FeatureWrapper feature) {
        try {
            testNGCucumberRunner.runScenario(pickle.getPickle());
        } catch (Throwable t) {
            Assert.fail("Cucumber framework failure: " + t.getMessage(), t);
        }
    }

    @DataProvider(parallel = true) // ✅ PARALLEL ENABLED
    public Object[][] scenarios() {
    	System.setProperty("dataproviderthreadcount", "2");
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner != null) {
            testNGCucumberRunner.finish();
        }
    }
}
