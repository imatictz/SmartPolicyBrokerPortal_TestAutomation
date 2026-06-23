package cucumberMap38CompanyManagement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class UserMaintenance {

	@Then("user click on User Maintenance option")
	public void user_click_on_company_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span44']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
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
	public void user_select_as_search_criteria(String search_criteria) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSearchCriteria')]", 
				"//*[@class='select2-search__field']", 
				search_criteria , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSearchCriteria')])[2]", 
				"user select {string} as Search Criteria", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='MainContent_btnSearch']", 
	    		"user click on search button", 
	    		"CLICK",
	    		2000);
	}
	@When("user select edit icon")
	public void user_select_edit_icon() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[6]/*[2]", 
	    		"user select edit icon", 
	    		"CLICK",
	    		2000);
	}
}
