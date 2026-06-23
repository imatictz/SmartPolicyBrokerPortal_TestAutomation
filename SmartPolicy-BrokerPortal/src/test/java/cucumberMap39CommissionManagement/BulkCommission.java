package cucumberMap39CommissionManagement;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class BulkCommission {

	@When("user navigate on Setup dropdown")
	public void user_navigate_on_setup_dropdown() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_SETUP']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@When("user navigate on commission management option")
	public void user_navigate_on_commissionoption() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='span87']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@Then("user click on Bulk Commission option")
	public void user_click_on_commission_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='span_bulkCom_lc']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user select {string} as from insurer")
	public void user_select_as_from_insurer(String insurer) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbFromInsurer')]", 
				"//*[@class='select2-search__field']", 
				insurer , 
				"(//*[contains(@data-select2-id,'MainContent_cmbFromInsurer')])[2]", 
				"user select {string} as from insurer", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as to insurer")
	public void user_select_as_to_insurer(String insurer) throws InterruptedException {
		Itl.CustomClearSendEvent("(//*[@class='search-input form-control'])[1]",
				insurer, 
				"user select {string} as to insurer",
				"TEXTBOX", 
				2000);
		
		Itl.ClickEvent("//*[@id='52693-selectable']", "CLICK", 2000);
	}
	@When("user click on transfer button")
	public void user_click_on_transfer_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='button_btnTransfer_lc']", 
	    		"user click on transfer button", 
	    		"CLICK",
	    		2000);
	}
	@When("user click on Ok button to accept delete existing commission alert message")
	public void user_click_on_ok_button_to_accept_delete_existing_commission_alert_message() throws InterruptedException {
		   Hashtable<String,Object> output= SeleniumOperations.alert();
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Ok button to accept commission rate alert message",output.get("MESSAGE").toString());
		   Thread.sleep(1000);
	}
	@When("user able to view {string} as message")
	public void user_able_to_view_as_message(String status) throws InterruptedException {
		 Itl.CustomValidationEvent("(//*[@class='messenger-message-inner'])[1]",
	        		status, 
	        		"user able to view {string} as message",
	        		"VALIDATION",
	        		2000);
	}
}
