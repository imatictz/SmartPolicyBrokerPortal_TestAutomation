package cucumberMap34GLBatchPosting;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class GLBatchPosting {
	@When ("^user navigate on operation dropdown$")
 	public void user_navigate_on_operation_dropdown_menu() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@When("user navigate on integration monitoring option")
	public void user_navigate_on_integration_monitoring_option() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='span126']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@Then("user click on GL Batch Posting option")
	public void user_click_on_gl_batch_posting_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='span40']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user click on add button to enter details")
	public void user_click_on_add_button_to_enter_details() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='MainContent_btnAdd']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user select {string} as posting type")
	public void user_select_as_posting_type(String postingType) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbType')]", 
				"//*[@class='select2-search__field']", 
				postingType , 
				"(//*[contains(@data-select2-id,'MainContent_cmbType')])[2]", 
				"user select {string} as posting type", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} posting date")
	public void user_user_select_posting_date(String postingDate) throws InterruptedException {
		Itl.CustomClearEvent("//*[@id='MainContent_txtPostingDate']", "CLEAR", 0);
		Itl.ClickEvent("//*[@id='MainContent_txtPostingDate']", "CLICK", 0);
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtPostingDate']",
				postingDate, 
				"user user select {string} posting date",
				"TEXTBOX", 
				0);
	}
	@When("user click on create posting date")
	public void user_click_on_create_posting_date() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@ID='btnSave']", "user click on create posting date", "CLICK", 2000);
	}
	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status(String status) throws Throwable {
	    Object[] input=new Object[2];
		input[0]="//*[@id='sort_table']/tbody/tr[1]/td[8]";
		input[1]=status;
		Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"([^\\\"]*)\\\" as status",output.get("MESSAGE").toString());
	}
	@When ("user click on search button")
	 public void user_click_on_search_button_quoteNo() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_btnSearch']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	
	@When("^user select \"([^\"]*)\" as from date$")
	 public void user_select_as_date_from1(String dateFrom) throws Throwable {
		Itl.CustomClearEvent("//*[@id='MainContent_txtSrchFromDate']", "CLEAR", 0);
		Itl.ClickEvent("//*[@id='MainContent_txtSrchFromDate']", "CLICK", 0);
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtSrchFromDate']";
		 input[1]=dateFrom;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as from date",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	@When("user enter {string} as status")
	public void user_enter_as_status(String status) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchStatus']",
				status, 
				"user enter {string} as status",
				"TEXTBOX", 
				0);
	}
	@When("user clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]", "user clicks on the actions dropdown", "CLICK", 2000);
	}
	@When("user clicks on edit option")
	public void user_clicks_on_edit_option1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[1]", "user clicks on edit option", "CLICK", 2000);
	}
	@Then ("user able to view {string} as message")
	public void validation(String validation) throws InterruptedException{
		Object[] input=new Object[2];
		input[0]="//*[text()='1003-Information modified successfully']";
		input[1]=validation;
		Hashtable<String,Object> output=SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view {string} message",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
}
