package cucumberMap37PolicyWordingSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class Extension_Clauses_Terms {

	@Then("user click on Extension\\/Clauses\\/Terms option")
	public void user_click_on_extension_clauses_terms_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span72']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user select {string} as Insurance Type")
	public void user_select_as_insurance_type(String InsuranceType) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsuranceType')]", 
				"//*[@class='select2-search__field']", 
				InsuranceType , 
				"(//*[contains(@data-select2-id,'MainContent_cmbInsuranceType')])[2]", 
				"user select {string} as Insurance Type", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as Insurance Class")
	public void user_select_as_insurance_class(String InsuranceClass) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsuranceClass')]", 
				"//*[@class='select2-search__field']", 
				InsuranceClass , 
				"(//*[contains(@data-select2-id,'MainContent_cmbInsuranceClass')])[2]", 
				"user select {string} as Insurance Class", 
				"DROPDOWN", 
				2000);
	}
	@When("user enter {string} as Excess")
	public void user_enter_as_excess(String Excess) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtExcess']",
				Excess, 
				"user enter {string} as Excess",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Exclusions")
	public void user_enter_as_exclusions(String Exclusions) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtExclusions']",
				Exclusions, 
				"user enter {string} as Exclusions",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Scope of Cover")
	public void user_enter_as_scope_of_cover(String ScopeofCover) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtRnHeader']",
				ScopeofCover, 
				"user enter {string} as Scope of Cover",
				"TEXTBOX", 
				2000);
	}
	@When("user enter {string} as Extensions, Terms & Clauses")
	public void user_enter_as_extensions_terms_clauses(String Clauses) throws InterruptedException {
		Object[] input = new Object[2];
		input[0]="//*[@class='wysihtml5-sandbox']";
		input[1]=Clauses;
		SeleniumOperations.iFrameEnter(input);
		Thread.sleep(2000);
	}
	@When("user select {string} as Insurance Type\\(search)")
	public void user_select_as_insurance_type1(String InsuranceType) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSrchInsuranceType')]", 
				"//*[@class='select2-search__field']", 
				InsuranceType , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSrchInsuranceType')])[2]", 
				"user select {string} as Insurance Type", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as Insurance Class\\(search)")
	public void user_select_as_insurance_class1(String InsuranceClass) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSrchInsuranceClass')]", 
				"//*[@class='select2-search__field']", 
				InsuranceClass , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSrchInsuranceClass')])[2]", 
				"user select {string} as Insurance Class", 
				"DROPDOWN", 
				2000);
	}
	@When("user clicks on edit icon")
	public void user_clicks_on_edit_option1() throws InterruptedException {
	    Itl.CustomClickEvent("(//*[@class='DisplayData fa fa-edit'])[1]",
	    		"user clicks on edit option", 
	    		"CLICK",
	    		2000);
	}
}
