package cucumberMap37PolicyWordingSetup;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class SetupClauses {

	@When("user navigate on Setup dropdown")
	public void user_navigate_on_setup_dropdown() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_SETUP']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@When("user navigate on policy wordings setup option")
	public void user_navigate_on_policywordingsoption() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='span88']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@Then("user click on setup clauses option")
	public void user_click_on_setupClauses_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span70']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user click on add button to enter details")
	public void user_click_on_add_button_to_enter_details() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='button_btnAdd_lc']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user select {string} as type")
	public void user_select_as_type(String type) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbType')]", 
				"//*[@class='select2-search__field']", 
				type , 
				"(//*[contains(@data-select2-id,'MainContent_cmbType')])[2]", 
				"user select {string} as type", 
				"DROPDOWN", 
				2000);
	}
	@When("user enter {string} as name")
	public void user_enter_as_name(String name) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtName']",
				name, 
				"user enter {string} as name",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as description")
	public void user_enter_as_description(String description) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtParmDesc']",
				description, 
				"user enter {string} as description",
				"TEXTBOX", 
				0);
	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='btnSave']", 
	    		"user click on save button", 
	    		"CLICK",
	    		2000);
	}
	@Then ("user able to view {string} as message")
	public void validation(String status) throws InterruptedException{
        Itl.CustomValidationEvent("//*[@class='messenger-message-inner']",
        		status, 
        		"user able to view {string} as message",
        		"VALIDATION",
        		2000);
	}
	@Then("user able to view {string} as status")
	public void user_able_to_view_as_status(String awaitingReceipt) throws Throwable 
	{
		Object[] input=new Object[2];
	    input[0]="//*[@id='sort_table']/tbody/tr[1]/td[3]";
	    input[1]=awaitingReceipt;
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view {string} as status",output.get("MESSAGE").toString());  
	}
	@When("user enter {string} as Search Text")
	public void user_enter_as_search_text(String SearchText) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSearchCriteria']",
				SearchText, 
				"user enter {string} as Search Text",
				"TEXTBOX", 
				0);
	}
	@When("user select {string} as Search Criteria")
	public void user_select_as_search_criteria(String Criteria) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSearchCriteria')]", 
				"//*[@class='select2-search__field']", 
				Criteria , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSearchCriteria')])[2]", 
				"user select {string} as Search Criteria", 
				"DROPDOWN", 
				2000);
	}
	@When ("user click on search button")
	 public void user_click_on_search_button_quoteNo() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='button_btnSearch_lc']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	@When("user clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[4]/*[2]", 
	    		"user clicks on the actions dropdown", 
	    		"CLICK",
	    		2000);
	}
	@When("user clicks on edit option")
	public void user_clicks_on_edit_option1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[4]/*[2]/*[2]/*[1]", "user clicks on edit option", "CLICK", 2000);
	}
	@Then ("user able to view {string} as message after edit")
	public void validation1(String validation) throws InterruptedException{
		Object[] input=new Object[2];
		input[0]="//*[text()='1003-Information modified successfully']";
		input[1]=validation;
		Hashtable<String,Object> output=SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view {string} message",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	@When("user click on edit button")
	public void user_click_on_edit_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='btnSave']", 
	    		"user click on edit button", 
	    		"CLICK",
	    		2000);
	}
}
