package MyHooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class StepFailureHook {

    @AfterStep
    public void afterEachStep(Scenario scenario) {

        // 🔴 Catch undefined / ambiguous / aborted steps immediately
        if (scenario.isFailed()) {
            throw new AssertionError(
                "Step failed / undefined / ambiguous in scenario: "
                + scenario.getName()
            );
        }
    }
}
