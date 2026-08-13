package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ForceFailListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {

        // 🔴 If Cucumber printed errors but TestNG says PASS → FORCE FAIL
        if (result.getThrowable() != null) {
            result.setStatus(ITestResult.FAILURE);
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // nothing needed
    }
}
