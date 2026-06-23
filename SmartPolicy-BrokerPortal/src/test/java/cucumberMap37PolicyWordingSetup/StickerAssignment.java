package cucumberMap37PolicyWordingSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class StickerAssignment {

	@Then("user click on Sticker Assignment option")
	public void user_click_on_extension_clauses_terms_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span56']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	
	@When("user select {string} as book number")
	public void user_select_as_book_number(String booknumber) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBookNumber')]", 
				"//*[@class='select2-search__field']", 
				booknumber , 
				"(//*[contains(@data-select2-id,'MainContent_cmbBookNumber')])[2]", 
				"user select {string} as book number", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as branch name")
	public void user_select_as_branch_name(String branchname) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBranchName')]", 
				"//*[@class='select2-search__field']", 
				branchname , 
				"(//*[contains(@data-select2-id,'MainContent_cmbBranchName')])[2]", 
				"user select {string} as branch name", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as insurer\\(search)")
	public void user_select_as_insurer_search(String insurer) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSrchInsurer')]", 
				"//*[@class='select2-search__field']", 
				insurer , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSrchInsurer')])[2]", 
				"user select {string} as insurer\\\\(search)", 
				"DROPDOWN", 
				2000);
	}
	@When("user clicks on the actions dropdown\\(for Sticker Assignment)")
	public void user_clicks_on_the_actions_dropdown_for_sticker_assignment() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[11]/*[2]", 
	    		"user clicks on the actions dropdown\\\\(for Sticker Assignment)", 
	    		"CLICK",
	    		2000);
	}
	@When("user clicks on edit option\\(for Sticker Assignment)")
	public void user_clicks_on_edit_option_for_sticker_assignment() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[11]/*[2]/*[2]/*[1]", 
	    		"user clicks on edit option\\\\(for Sticker Assignment)", 
	    		"CLICK",
	    		2000);
	}
}
