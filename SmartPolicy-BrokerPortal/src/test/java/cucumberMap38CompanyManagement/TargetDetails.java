package cucumberMap38CompanyManagement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class TargetDetails {

	@Then("user click on Target Details option")
	public void user_click_on_company_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span64']";
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
	@When("user select {string} as Branch Name")
	public void user_select_as_branch_name(String BranchName) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBranch')]", 
				"//*[@class='select2-search__field']", 
				BranchName , 
				"(//*[contains(@data-select2-id,'MainContent_cmbBranch')])[2]", 
				"user select {string} as Branch Name", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as Product")
	public void user_select_as_product(String Product) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbProduct')]", 
				"//*[@class='select2-search__field']", 
				Product , 
				"(//*[contains(@data-select2-id,'MainContent_cmbProduct')])[2]", 
				"user select {string} as Product", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as Currency")
	public void user_select_as_currency(String Currency) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCurrency')]", 
				"//*[@class='select2-search__field']", 
				Currency , 
				"(//*[contains(@data-select2-id,'MainContent_cmbCurrency')])[2]", 
				"user select {string} as Currency", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as Year")
	public void user_select_as_year(String Year) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'select2-yearpicker-container')]", 
				"//*[@class='select2-search__field']", 
				Year , 
				"(//*[contains(@data-select2-id,'select2-data')])[29]", 
				"user select {string} as Year", 
				"DROPDOWN", 
				2000);
	}
	@When("user enter {string} as X Rate")
	public void user_enter_as_x_rate(String rate) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtXrate']",
				rate, 
				"user enter {string} as X Rate",
				"TEXTBOX", 
				2000);
	}
	@When("user select {string} as Customer Type")
	public void user_select_as_customer_type(String CustomerType) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCustType')]", 
				"//*[@class='select2-search__field']", 
				CustomerType , 
				"(//*[contains(@data-select2-id,'MainContent_cmbCustType')])[2]", 
				"user select {string} as Customer Type", 
				"DROPDOWN", 
				2000);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(JANUARY)")
	public void user_enter_as_target_amount_and_as_count_january(String targetAmount, String count) throws InterruptedException {

	    Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtJan']", targetAmount,
	            "//*[@id='MainContent_txtJanCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(FEBRUARY)")
	public void user_enter_as_target_amount_and_as_count_february(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtFeb']", targetAmount,
	            "//*[@id='MainContent_txtFebCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(MARCH)")
	public void user_enter_as_target_amount_and_as_count_march(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtMarch']", targetAmount,
	            "//*[@id='MainContent_txtMarchCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(APRIL)")
	public void user_enter_as_target_amount_and_as_count_april(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtApr']", targetAmount,
	            "//*[@id='MainContent_txtAprCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(MAY)")
	public void user_enter_as_target_amount_and_as_count_may(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtMay']", targetAmount,
	            "//*[@id='MainContent_txtMayCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(JUNE)")
	public void user_enter_as_target_amount_and_as_count_june(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtJun']", targetAmount,
	            "//*[@id='MainContent_txtJunCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(JULY)")
	public void user_enter_as_target_amount_and_as_count_july(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtJul']", targetAmount,
	            "//*[@id='MainContent_txtJulCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(AUGUST)")
	public void user_enter_as_target_amount_and_as_count_august(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtAug']", targetAmount,
	            "//*[@id='MainContent_txtAugCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(SEPTEMBER)")
	public void user_enter_as_target_amount_and_as_count_september(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtSep']", targetAmount,
	            "//*[@id='MainContent_txtSepCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(OCTOBER)")
	public void user_enter_as_target_amount_and_as_count_october(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtOct']", targetAmount,
	            "//*[@id='MainContent_txtOctCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(NOVEMBER)")
	public void user_enter_as_target_amount_and_as_count_november(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtNov']", targetAmount,
	            "//*[@id='MainContent_txtNovCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@When("user enter {string} as Target Amount and {string} as Count\\(DECEMBER)")
	public void user_enter_as_target_amount_and_as_count_december(String targetAmount, String count) throws InterruptedException {
		Itl.CustomClearSend2Event(
	            "//*[@id='MainContent_txtDec']", targetAmount,
	            "//*[@id='MainContent_txtDecCount']", count,
	            "User entered Target Amount: " + targetAmount + " and Count: " + count,
	            "TEXTBOX", 0);
	}
	@Then ("user able to view {string} as message")
	public void validation(String status) throws InterruptedException{
        Itl.CustomValidationEvent("//*[@class='messenger-message-inner']",
        		status, 
        		"user able to view {string} as message",
        		"VALIDATION",
        		0);
	}
	@Then ("user able to view {string} as status")
	public void validation1(String status) throws InterruptedException{
        Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[7]",
        		status, 
        		"user able to view {string} as status",
        		"VALIDATION",
        		0);
	}
	@When("user clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]/*[2]", "user clicks on the actions dropdown", "CLICK", 2000);
	}
	@When("user clicks on edit option")
	public void user_clicks_on_edit_option1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]/*[2]/*[2]/*[1]", "user clicks on edit option", "CLICK", 2000);
	}
	@When("user select {string} as Branch Name\\(Search)")
	public void user_select_as_branch_name_search(String branch_name) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSrchBranch')]", 
				"//*[@class='select2-search__field']", 
				branch_name , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSrchBranch')])[2]", 
				"user select {string} as Branch Name\\\\(Search)", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as Product\\(Search)")
	public void user_select_as_product_search(String product) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSrchProduct')]", 
				"//*[@class='select2-search__field']", 
				product , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSrchProduct')])[2]", 
				"user select {string} as Product\\\\(Search)", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as Year\\(Search)")
	public void user_select_as_year_search(String year) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbProduct')]", 
				"//*[@class='select2-search__field']", 
				year , 
				"(//*[contains(@data-select2-id,'MainContent_cmbProduct')])[2]", 
				"user select {string} as Year\\\\(Search)", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on edit button")
	public void user_click_on_edit_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='btnSave']", 
	    		"user click on edit button", 
	    		"CLICK",
	    		2000);
	}
}
