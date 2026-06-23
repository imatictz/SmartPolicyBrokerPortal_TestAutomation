package cucumberMap36CurrencyManagement;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class CurrencyMaster {

	@When("user navigate on Setup dropdown")
	public void user_navigate_on_setup_dropdown() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_SETUP']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@When("user navigate on currency management option")
	public void user_navigate_on_currency_management_option() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='span129']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@Then("user click on currency maintainance option")
	public void user_click_on_currency_maintainance_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span62']";
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
	@When("user select {string} as currency name")
	public void user_select_as_currency_name(String currencyName) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCurrencyName')]", 
				"//*[@class='select2-search__field']", 
				currencyName , 
				"(//*[contains(@data-select2-id,'MainContent_cmbCurrencyName')])[2]", 
				"user select {string} as currency name", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as account name")
	public void user_select_as_account_name(String accountName) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbAccount')]", 
				"//*[@class='select2-search__field']", 
				accountName , 
				"(//*[contains(@data-select2-id,'MainContent_cmbAccount')])[2]", 
				"user select {string} as account name", 
				"DROPDOWN", 
				2000);
	}
	@When("user enter {string} as Ccy Rate")
	public void user_enter_as_ccy_rate(String ccyRate) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtCcyRate']",
				ccyRate, 
				"user enter {string} as Ccy Rate",
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
        		0);
	}
	@When("user enter {string} as code")
	public void user_enter_as_vode(String code) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchCcyCode']",
				code, 
				"user enter {string} as code",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as name")
	public void user_enter_as_name(String name) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchCcyName']",
				name, 
				"user enter {string} as name",
				"TEXTBOX", 
				0);
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
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[5]/*[2]", "user clicks on the actions dropdown", "CLICK", 2000);
	}
	@When("user clicks on edit option")
	public void user_clicks_on_edit_option1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[5]/*[2]/*[2]/*[1]", "user clicks on edit option", "CLICK", 2000);
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
