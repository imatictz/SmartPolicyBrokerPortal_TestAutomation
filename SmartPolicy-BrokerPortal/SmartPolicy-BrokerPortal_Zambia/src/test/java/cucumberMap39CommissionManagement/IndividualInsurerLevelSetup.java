package cucumberMap39CommissionManagement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class IndividualInsurerLevelSetup {

	@Then("user click on Individual Insurer Level Setup option")
	public void user_click_on_commission_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span68']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user select {string} as Insurance Company")
	public void user_select_as_individual_insurer_level_setup(String Company) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsuranceComp')]", 
				"//*[@class='select2-search__field']", 
				Company , 
				"(//*[contains(@data-select2-id,'MainContent_cmbInsuranceComp')])[2]", 
				"user select {string} as Individual Insurer Level Setup", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on fetch button")
	public void user_click_on_fetch_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='button_btnSearch_lc']", 
	    		"user click on fetch button", 
	    		"CLICK",
	    		2000);
	}
	@When("user select {string} as Insurance Type")
	public void user_select_as_insurance_type(String insurance_type) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSrchInsType')]", 
				"//*[@class='select2-search__field']", 
				insurance_type , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSrchInsType')])[2]", 
				"user select {string} as Insurance Type", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='button_btnSrchInsType_lc']", 
	    		"user click on search button", 
	    		"CLICK",
	    		2000);
	}
	@When("user click on edit icon")
	public void user_click_on_edit_icon() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[5]/*[1]", 
	    		"user click on edit icon", 
	    		"CLICK",
	    		2000);
	}
	@When("user enter {string} as New Commission Rate %")
	public void user_enter_as_new_commission_rate(String Rate) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtNewcommission']",
				Rate, 
				"user enter {string} as New Commission Rate %",
				"TEXTBOX", 
				0);
	}
	@When("user click on update button")
	public void user_click_on_update_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']", 
	    		"user click on update button", 
	    		"CLICK",
	    		2000);
	}
	@Then("user able to view {string} as status")
	public void user_able_to_view_as_status(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[2]",
        		status, 
        		"user able to view {string} as status",
        		"VALIDATION",
        		2000);
	}
	@When("user click on approve icon")
	public void user_click_on_approve_icon() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[5]/*[2]", 
	    		"user click on approve icon", 
	    		"CLICK",
	    		2000);
	}
	@When("user click on approve button")
	public void user_click_on_approve_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']", 
	    		"user click on approve button", 
	    		"CLICK",
	    		2000);
	}
}
