package cucumberMap35ProductMapping;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ProductMapping {

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
	@Then("user click on product mapping option")
	public void user_click_on_gl_batch_posting_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span58']";
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
	@When("user select {string} as Insurance Category")
	public void user_select_as_insurance_category(String InsuranceCategory) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsuCate')]", 
				"//*[@class='select2-search__field']", 
				InsuranceCategory , 
				"(//*[contains(@data-select2-id,'MainContent_cmbInsuCate')])[2]", 
				"user select {string} as Insurance Category", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as Customer Type")
	public void user_select_as_customer_type(String customerType) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbClntType')]", 
				"//*[@class='select2-search__field']", 
				customerType , 
				"(//*[contains(@data-select2-id,'MainContent_cmbClntType')])[2]", 
				"user select {string} as Customer Type", 
				"DROPDOWN", 
				2000);
	}
	@When("user enter {string} as Finance System Product Code")
	public void user_enter_as_finance_system_product_code(String code) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtProductCode']",
				code, 
				"user enter {string} as Finance System Product Code",
				"TEXTBOX", 
				0);
	}
	@When("user select Direct Type checkbox")
	public void user_select_direct_type_checkbox() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@ID='chkDirectType']", 
	    		"user select Direct Type checkbox", 
	    		"CLICK",
	    		2000);

	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='btnSave']", 
	    		"user click on save button", 
	    		"CLICK",
	    		2000);
	}
	@Then("user able to view {string} as status")
	public void user_able_to_view_as_status(String status) {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSrchSts']";
		input[1]=status;
		Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view {string} as status",output.get("MESSAGE").toString());
	}
	@Then ("user able to view {string} as message")
	public void validation(String status) throws InterruptedException{
        Itl.CustomValidationEvent("//*[@class='messenger-message-inner']",
        		status, 
        		"user able to view {string} as message",
        		"VALIDATION",
        		0);
	}
	
	@When ("user click on search button")
	 public void user_click_on_search_button_quoteNo() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_btnSearch']";
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
	@When("user enter {string} as Customer Type")
	public void user_enter_as_customerType(String customerType) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchClntType']",
				customerType, 
				"user enter {string} as Customer Type",
				"TEXTBOX", 
				0);
	}
	@When("user click on edit button")
	public void user_click_on_edit_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='btnSave']", 
	    		"user click on edit button", 
	    		"CLICK",
	    		2000);
	}
}
