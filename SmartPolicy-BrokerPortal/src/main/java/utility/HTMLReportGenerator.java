package utility;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.Scenario;

public class HTMLReportGenerator {

    // 🔹 Singleton ExtentReports
    private static ExtentReports testsuiteobj = null;

    // 🔹 Thread-safe ExtentTest per scenario
    private static ThreadLocal<ExtentTest> testcase = new ThreadLocal<>();

    // ✅ Initialize report ONLY ONCE
    public static synchronized void TestSuiteStart(String path, String project)
            throws UnknownHostException {

        if (testsuiteobj == null) {

            ExtentSparkReporter spark = new ExtentSparkReporter(path);
            testsuiteobj = new ExtentReports();
            testsuiteobj.attachReporter(spark);

            ConfigReader config = new ConfigReader();

            testsuiteobj.setSystemInfo("Host Name",
                    InetAddress.getLocalHost().getHostName());
            testsuiteobj.setSystemInfo("Environment", "QA");
            testsuiteobj.setSystemInfo("Browser", config.getBrowserName());
        }
    }

    // ✅ Start test for each scenario
    public static void TestCaseStart(String name) {
        ExtentTest test = testsuiteobj.createTest(name);
        testcase.set(test);
    }

    // 🔹 Log each step
    public static void StepDetails(String status, String step, String details) {

        ExtentTest test = testcase.get();

        if (status.equalsIgnoreCase("pass"))
            test.log(Status.PASS, step + " : " + details);
        else if (status.equalsIgnoreCase("fail"))
            test.log(Status.FAIL, step + " : " + details);
        else
            test.log(Status.INFO, step + " : " + details);
    }

    // ✅ Scenario result logging
    public static void logScenarioResult(Scenario scenario) {

        ExtentTest test = testcase.get();

        if (scenario.isFailed()) {
            test.log(Status.FAIL,
                    "Scenario failed: " + scenario.getName());
        } else {
            test.log(Status.PASS,
                    "Scenario passed: " + scenario.getName());
        }
    }

    // ✅ End scenario (no endTest in Extent 5)
    public static void TestCaseEnd() {
        testcase.remove();
    }

    // ✅ Flush after each scenario
    public static synchronized void flush() {
        if (testsuiteobj != null) {
            testsuiteobj.flush();
        }
    }

    // ✅ Close report once after suite
    public static synchronized void CloseReport() {
        if (testsuiteobj != null) {
            testsuiteobj.flush();
            testsuiteobj = null;
        }
    }
}
/*package utility;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;


import io.cucumber.java.Scenario;

public class HTMLReportGenerator {

    // 🔹 Singleton ExtentReports for entire execution
    private static ExtentReports testsuiteobj = null;

    // 🔹 One ExtentTest per scenario (thread-safe)
    private static ThreadLocal<ExtentTest> testcase = new ThreadLocal<>();

    // ✅ Initialize report ONLY ONCE
    public static synchronized void TestSuiteStart(String path, String project)
            throws UnknownHostException {

        if (testsuiteobj == null) {
            testsuiteobj = new ExtentReports(path, false, NetworkMode.OFFLINE);

            ConfigReader config = new ConfigReader();
            testsuiteobj
                .addSystemInfo("Host Name", InetAddress.getLocalHost().getHostName())
                .addSystemInfo("Environment", "QA")
                .addSystemInfo("Browser", config.getBrowserName());
        }
    }

    // ✅ Start ExtentTest for each scenario
    public static void TestCaseStart(String name) {
        ExtentTest test = testsuiteobj.startTest(name);
        testcase.set(test);
    }

    // 🔹 Log each step
    public static void StepDetails(String status, String step, String details) {

        ExtentTest test = testcase.get();

        if (status.equalsIgnoreCase("pass"))
            test.log(LogStatus.PASS, step, details);
        else if (status.equalsIgnoreCase("fail"))
            test.log(LogStatus.FAIL, step, details);
        else
            test.log(LogStatus.INFO, step, details);
    }

    // ✅ Correct scenario result logging
    public static void logScenarioResult(Scenario scenario) {

        ExtentTest test = testcase.get();

        if (scenario.isFailed()) {
            test.log(LogStatus.FAIL, "Scenario Status",
                    "Scenario failed: " + scenario.getName());
        } else {
            test.log(LogStatus.PASS, "Scenario Status",
                    "Scenario passed: " + scenario.getName());
        }
    }

    // ✅ End scenario test safely
    public static void TestCaseEnd() {
        testsuiteobj.endTest(testcase.get());
        testcase.remove();
    }

    // ✅ REQUIRED FIX: Flush after each scenario
    public static synchronized void flush() {
        if (testsuiteobj != null) {
            testsuiteobj.flush();
        }
    }

    // ⚠️ Deprecated – kept to avoid breaking existing calls
    public static synchronized void TestSuiteEnd() {
        if (testsuiteobj != null) {
            testsuiteobj.flush();
        }
    }

    // ✅ Close report ONLY ONCE (AfterAll)
    public static synchronized void CloseReport() {
        if (testsuiteobj != null) {
            testsuiteobj.flush();
            testsuiteobj.close();
            testsuiteobj = null;
        }
    }
}*/

