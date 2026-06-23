package cucumberMap39CommissionManagement;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class InsuranceReferralSalesTeam {

	@Then("user click on Insurance Referral Sales Team option")
	public void user_click_on_commission_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span67']";
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
	@When("user enter {string} as Member Id")
	public void user_enter_as_member_id(String Member) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtMemberId']",
				Member, 
				"user enter {string} as Member Id",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Member Name")
	public void user_enter_as_member_name(String Member) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtMemberName']",
				Member, 
				"user enter {string} as Member Name",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as mobile")
	public void user_enter_as_mobile(String mobile) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtMobile']",
				mobile, 
				"user enter {string} as mobile",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as email")
	public void user_enter_as_email(String email) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtEmail']",
				email, 
				"user enter {string} as email",
				"TEXTBOX", 
				0);
	}
	@When("user select {string} as Type")
	public void user_select_as_type(String type) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbType')]", 
				"//*[@class='select2-search__field']", 
				type , 
				"(//*[contains(@data-select2-id,'MainContent_cmbType')])[2]", 
				"user select {string} as Type", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']", 
	    		"user click on save button", 
	    		"CLICK",
	    		2000);
	}
	@Then("user able to view {string} as status\\(Insurance Referral Sales Team)")
	public void user_able_to_view_as_status_insurance_referral_sales_team(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[5]",
        		status, 
        		"user able to view {string} as status\\\\(Insurance Referral Sales Team)",
        		"VALIDATION",
        		2000);
	}
	@When("user enter {string} as Member Id\\(search)")
	public void user_enter_as_member_id_search(String Member) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchMemberId']",
				Member, 
				"user enter {string} as Member Id\\\\(search)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Member Name\\(search)")
	public void user_enter_as_member_name_search(String Member) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchMemberName']",
				Member, 
				"user enter {string} as Member Name\\\\(search)",
				"TEXTBOX", 
				0);
	}
	@When("user click on search button\\(Insurance Referral Sales Team)")
	public void user_click_on_search_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='MainContent_btnSearch']", 
	    		"user click on search button", 
	    		"CLICK",
	    		2000);
	}
	@When("user clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[6]/*[2]", "user clicks on the actions dropdown", "CLICK", 2000);
	}
	@When("user clicks on edit option")
	public void user_clicks_on_edit_option1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[6]/*[2]/*[2]/*[1]", "user clicks on edit option", "CLICK", 2000);
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
