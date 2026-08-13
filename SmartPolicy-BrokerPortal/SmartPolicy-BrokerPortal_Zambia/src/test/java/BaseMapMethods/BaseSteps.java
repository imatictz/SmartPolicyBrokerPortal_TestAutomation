package BaseMapMethods;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;
import utility.ScreenContext;

public class BaseSteps {

	// Screen → (Element Name → XPath OR Dropdown Map)
	private static Map<String, Map<String, Object>> elementXPaths = new HashMap<>();

	static {

	    // CLIENT SCREEN
	    Map<String, Object> client = new HashMap<>();

	    // Normal elements
	    client.put("add button", "//*[@id='MainContent_btnAdd']");
	    client.put("save button", "//*[@id='btnSaveClient']");
	    client.put("client icon", "//*[@id='MNU_WFCLNT_2']");

	    // Dropdown element
	    Map<String, String> titleDropdown = new HashMap<>();
	    titleDropdown.put("click", "//*[contains(@aria-controls,'MainContent_cmbTitle')]");
	    titleDropdown.put("search", "//*[@class='select2-search__field']");
	    titleDropdown.put("select", "//*[contains(@id,'select2-MainContent_cmbTitle-result')]");

	    client.put("title dropdown", titleDropdown);

	    elementXPaths.put("CLIENT", client);
	

        // MEDICAL SCREEN
        Map<String, Object> medical = new HashMap<>();
        medical.put("add button", "//*[@id='MainContent_btnAdd']");
        medical.put("save button", "//*[@id='btnSaveMedical']");
        medical.put("insert button", "//*[@id='btnInsert']");
        medical.put("ok button", "//*[@id='btnOk']");
        elementXPaths.put("MEDICAL", medical);

        // VEHICLE SCREEN
        Map<String, Object> vehicle = new HashMap<>();
        vehicle.put("add button", "//*[@id='btnAddVehicle']");
        vehicle.put("save button", "//*[@id='btnSaveVehicle']");
        elementXPaths.put("VEHICLE", vehicle);
    }

    // 🔹 Central XPath resolver
    private String getXpath(String elementName) {

        String screen = ScreenContext.getScreen();

        if (screen == null) {
            throw new RuntimeException("Screen is not set in Hookable");
        }

        Map<String, Object> screenLocators = elementXPaths.get(screen);

        if (screenLocators == null) {
            throw new RuntimeException("No locator map found for screen: " + screen);
        }

        String xpath = (String) screenLocators.get(elementName.toLowerCase());

        if (xpath == null) {
            throw new RuntimeException(
                "No XPath found for element '" + elementName + "' in screen " + screen
            );
        }

        return xpath;
    }

    // 🔹 CLICK
    @When("^user click on (.+)$")
    public void clickOnElement(String elementName) throws InterruptedException {

        String xpath = getXpath(elementName);

        Object[] input = new Object[]{ xpath };
        Hashtable<String, Object> output =
                SeleniumOperations.clickOnElement(input);

        HTMLReportGenerator.StepDetails(
                output.get("STATUS").toString(),
                "user click on " + elementName,
                output.get("MESSAGE").toString()
        );

        Thread.sleep(2000);
    }

    // 🔹 SEND KEYS
    @When("^user enter \"([^\"]*)\" in (.+)$")
    public void sendKeysToElement(String value, String elementName) throws InterruptedException {

        String xpath = getXpath(elementName);

        Object[] input = new Object[]{ xpath, value };
        Hashtable<String, Object> output =
                SeleniumOperations.sendKeys(input);

        HTMLReportGenerator.StepDetails(
                output.get("STATUS").toString(),
                "user enter \"" + value + "\" in " + elementName,
                output.get("MESSAGE").toString()
        );

        Thread.sleep(2000);
    }
    
 // 🔹 SELECT FROM DROPDOWN
    @When("^user select \"([^\"]*)\" in (.+) dropdown$")
    public void selectFromDropdown(String value, String elementName) throws InterruptedException {

        // Resolve XPath dynamically based on screen
        String dropdownXpath = getXpath(elementName);

        // Prepare input for SeleniumOperations.dropdown
        Object[] input = new Object[3];
        input[0] = dropdownXpath;     // Dropdown click xpath
        input[1] = value;             // Value to select
        input[2] = elementName;       // Just for logging (optional)

        Hashtable<String, Object> output =
                SeleniumOperations.dropdown(input);

        HTMLReportGenerator.StepDetails(
                output.get("STATUS").toString(),
                "user select \"" + value + "\" in " + elementName + " dropdown",
                output.get("MESSAGE").toString()
        );

        Thread.sleep(2000);
    }

}
