package TanzaniaHooks;

import io.cucumber.java.*;
import utility.*;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;

import com.aventstack.extentreports.ExtentTest;

public class TanzaniaHookable {

    private static AtomicInteger counter = new AtomicInteger(0);
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    private static String[] usernames = {
    	    CountryConfigReader.get("Tanzania", "user1.username"),
    	    CountryConfigReader.get("Tanzania", "user2.username")
    	};

    	private static String[] passwords = {
    	    CountryConfigReader.get("Tanzania", "user1.password"),
    	    CountryConfigReader.get("Tanzania", "user2.password")
    	};

    // =========================================================
    // START REPORT ONCE
    // =========================================================

    @BeforeAll
    public static void beforeAllScenarios() throws UnknownHostException {

        HTMLReportGenerator.TestSuiteStart(
            "C:\\ExecuteParrallel_Jenkins\\Tanzania.html",
            "SmartPolicy Tanzania"
        );
    }

    // =========================================================
    // PER SCENARIO SETUP
    // =========================================================

    @Before(order = 0)
    public void beforeScenario(Scenario scenario)
            throws UnknownHostException {

        HTMLReportGenerator.TestCaseStart(
            scenario.getName()
        );

        System.out.println(
            "---- Tanzania Scenario Start : "
            + scenario.getName()
            + " ----"
        );

        SeleniumOperations.browserLaunch();

        SeleniumOperations.openApplication();

        // -----------------------------------------------------
        // Select Tanzania parallel user
        // -----------------------------------------------------

        int index = counter.getAndIncrement() % usernames.length;

        System.out.println(
            "Tanzania Login User : user" + (index + 1)
        );

        SeleniumOperations.sendUserIdDynamic(
            new Object[]{
                "//*[@id='usercode']",
                usernames[index]
            }
        );

        SeleniumOperations.sendPasswordDynamic(
            new Object[]{
                "//*[@id='password']",
                passwords[index]
            }
        );

        SeleniumOperations.clickOnLogin(
            new Object[]{
                "//*[@id='btnLogin']"
            }
        );
    }

    // =========================================================
    // SCREEN CONTEXT
    // =========================================================

    @Before(order = 1)
    public void setScreenContext(Scenario scenario) {

        if (scenario.getSourceTagNames().contains("@CLIENT")) {

            ScreenContext.setScreen("CLIENT");

        } else if (scenario.getSourceTagNames().contains("@MEDICAL")) {

            ScreenContext.setScreen("MEDICAL");

        } else if (scenario.getSourceTagNames().contains("@VEHICLE")) {

            ScreenContext.setScreen("VEHICLE");
        }
    }

    // =========================================================
    // PER SCENARIO TEARDOWN
    // =========================================================

    @After
    public void afterScenario(Scenario scenario) {

        HTMLReportGenerator.TestCaseEnd();

        SeleniumOperations.browserClose();

        ScreenContext.clear();

        System.out.println(
            "---- Tanzania Scenario End : "
            + scenario.getName()
            + " ----"
        );
    }

    // =========================================================
    // CLOSE REPORT ONCE
    // =========================================================

    @AfterAll
    public static void afterAll() {

        HTMLReportGenerator.CloseReport();
    }
}
