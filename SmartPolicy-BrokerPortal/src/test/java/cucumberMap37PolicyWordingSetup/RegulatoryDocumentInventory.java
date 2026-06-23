package cucumberMap37PolicyWordingSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class RegulatoryDocumentInventory {

	@Then("user click on Regulatory Document Inventory option")
	public void user_click_on_extension_clauses_terms_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span55']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	
	@When("user enter {string} as book number")
	public void user_enter_as_book_number(String bookNumber) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtBookNb']",
				bookNumber, 
				"user enter {string} as book number",
				"TEXTBOX", 
				0);
	}
	@When("user select {string} as insurer")
	public void user_select_as_insurer(String insurer) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsurer')]", 
				"//*[@class='select2-search__field']", 
				insurer , 
				"(//*[contains(@data-select2-id,'MainContent_cmbInsurer')])[2]", 
				"user select {string} as insurer", 
				"DROPDOWN", 
				2000);
	}
	@When("user enter {string} as Sequence From")
	public void user_enter_as_sequence_from(String From) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtSeqFrom']",
				From, 
				"user enter {string} as Sequence From",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as to")
	public void user_enter_as_to(String to) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtSeqTo']",
				to, 
				"user enter {string} as to",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as book number\\(search)")
	public void user_enter_as_book_number_search(String bookNumber) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchBookNb']",
				bookNumber, 
				"user enter {string} as book number\\\\(search)",
				"TEXTBOX", 
				0);
	}
	@When("user clicks on the actions dropdown\\(for Regulatory Document Inventory)")
	public void user_clicks_on_the_actions_dropdown_for_regulatory_document_inventory() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[2]", 
	    		"user clicks on the actions dropdown\\\\(for Regulatory Document Inventory)", 
	    		"CLICK",
	    		2000);
	}
	@When("user clicks on edit option\\(for Regulatory Document Inventory)")
	public void user_clicks_on_edit_option_for_regulatory_document_inventory() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[2]/*[2]/*[1]", 
	    		"user clicks on edit option\\\\(for Regulatory Document Inventory)", 
	    		"CLICK",
	    		2000);
	}
}
