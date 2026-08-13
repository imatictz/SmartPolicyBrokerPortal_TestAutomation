package MyHooks;

import io.cucumber.java.*;
import utility.*;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;

import com.aventstack.extentreports.ExtentTest;

public class Hookable {

    private static AtomicInteger counter = new AtomicInteger(0);
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    private static String[] usernames = {
        ConfigReader.get("user1.username"),
        ConfigReader.get("user2.username")
    };

    private static String[] passwords = {
        ConfigReader.get("user1.password"),
        ConfigReader.get("user2.password")
    };

    // 🔹 START REPORT ONCE
    @BeforeAll
    public static void beforeAllScenarios() throws UnknownHostException {
        HTMLReportGenerator.TestSuiteStart(
            "C:\\ExecuteParrallel_Zambia\\13AUG.html",
            "SmartPolicy"
        );
    }

    // 🔹 PER SCENARIO SETUP
    @Before(order = 0)
    public void beforeScenario(Scenario scenario) throws UnknownHostException {

        HTMLReportGenerator.TestCaseStart(scenario.getName());

        System.out.println("---- Scenario Start : " + scenario.getName() + " ----");

        SeleniumOperations.browserLaunch();
        SeleniumOperations.openApplication();

        int index = counter.getAndIncrement() % usernames.length;

        SeleniumOperations.sendUserIdDynamic(
            new Object[]{"//*[@id='usercode']", usernames[index]}
        );

        SeleniumOperations.sendPasswordDynamic(
            new Object[]{"//*[@id='password']", passwords[index]}
        );

        SeleniumOperations.clickOnLogin(
            new Object[]{"//*[@id='btnLogin']"}
        );
    }

    // 🔹 SCREEN CONTEXT
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

    // 🔹 PER SCENARIO TEARDOWN
    @After
    public void afterScenario(Scenario scenario) {

       // HTMLReportGenerator.logScenarioResult(scenario);
        HTMLReportGenerator.TestCaseEnd();

        // 🔥 IMPORTANT: flush after each scenario
       // HTMLReportGenerator.flush();

        SeleniumOperations.browserClose();
        ScreenContext.clear();

        System.out.println("---- Scenario End : " + scenario.getName() + " ----");
    }

    // 🔹 CLOSE REPORT ONCE
    @AfterAll
    public static void afterAll() {
    	
        HTMLReportGenerator.CloseReport();
    }
}

