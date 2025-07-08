package cucumberMap18Claims;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Claims {
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws InterruptedException {
		Object[] input7=new Object[1];
		input7[0]="//*[@id='MOD_OPERATIONS']";
		SeleniumOperations.actionClass(input7);
		Thread.sleep(2000); 
	}
	 
	@When("^user Click on risk note menu$")
	public void user_Click_on_risk_note_menu() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@id='MNU_wfICNM']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as from date$")
	public void user_select_as_date_from(String dateFrom) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSrchFromDate']";
		input[1]=dateFrom;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \"01/01/2023\" as from date",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When("^user enter \"([^\"]*)\" as risk note number$")
	public void user_enter_as_risk_note_number(String riskNote) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtRiskNote']";
		 input[1]=riskNote;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as risk note number$",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @When("^user click on search button$")
	 public void user_click_on_search_button() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_btnSearch']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on actions button$")
	 public void user_click_on_options_button() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_repICNM_lblActions_0']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on options button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on report claim umbrella like button$")
	 public void user_click_on_report_claim_umbrella_like_button() throws Throwable {
		    Itl.CustomClickEvent("//*[@id='MainContent_repICNM_lblReportClaim_0']", "user click on report claim umbrella like button", "CLICK", 5000);
	        SeleniumOperations.scrolldown();
	        Thread.sleep(4000);
	 }

	 @When("user enter {string} as date of loss\\/Accident")
	 public void user_enter_as_date_of_loss_accident(String dateFrom) throws InterruptedException {
		    Itl.CustomSendEvent("//*[@id='MainContent_txtAcciDate']", dateFrom, "user enter {string} as date of loss\\\\/Accident", "TEXTBOX", 0);	

	 }
	 @When("user select {string} as country")
	 public void user_select_as_country(String country) {
		    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCountryofLoss')]", "(//*[@class='select2-search__field'])[2]", country , "(//*[contains(@data-select2-id,'MainContent_cmbCountryofLoss')])[2]", "user select {string} as country", "DROPDOWN", 3000);

	 }
	 @When("user select {string} as region\\/City of loss")
	 public void user_select_as_region_city_of_loss(String cityOfLoss) {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbRegion')])[1]", "(//*[@class='select2-search__field'])[2]", cityOfLoss , "(//*[contains(@data-select2-id,'MainContent_cmbRegion')])[3]", "user select {string} as region\\\\/City of loss", "DROPDOWN", 3000);

	 }
	 @When("user select {string} as district of loss")
	 public void user_select_as_district_of_loss(String districtOfLoss) {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbDistrict')])[1]", "(//*[@class='select2-search__field'])[2]", districtOfLoss , "(//*[contains(@data-select2-id,'MainContent_cmbDistrict')])[3]", "user select {string} as district of loss", "DROPDOWN", 2000);

	 }
	 @When("user select {string} as cause of loss\\/Accident")
	 public void user_select_as_cause_of_loss_accident(String causeOfLossAccident) {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbClmmCauses')])[1]", "(//*[@class='select2-search__field'])[2]", causeOfLossAccident , "(//*[contains(@data-select2-id,'MainContent_cmbClmmCauses')])[2]", "user select {string} as cause of loss\\\\/Accident", "DROPDOWN", 2000);

	 }
	 @Then("user enter {string} as place of loss\\/Accident")
	 public void user_enter_as_place_of_loss_accident(String placeOfLossAccident) throws InterruptedException {
		    Itl.CustomSendEvent("//*[@id='MainContent_txtAcciPlace']", placeOfLossAccident, "user enter {string} as place of loss\\\\/Accident", "TEXTBOX", 0);	

	 }
	 @When("user select {string} as reported type")
	 public void user_select_as_reported_type(String reportedType) {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbIntimationType')])[1]", "(//*[@class='select2-search__field'])[2]", reportedType , "(//*[contains(@data-select2-id,'MainContent_cmbIntimationType')])[2]", "user select {string} as reported type", "DROPDOWN", 2000);

	 }
	 @When("user select {string} as nature of loss\\/claim type")
	 public void user_select_as_nature_of_loss_claim_type(String natureOfLossClaimType) {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbLossType')])[1]", "(//*[@class='select2-search__field'])[2]", natureOfLossClaimType , "(//*[contains(@data-select2-id,'MainContent_cmbLossType')])[2]", "user select {string} as nature of loss\\\\/claim type", "DROPDOWN", 2000);

	 }
	 @When("user select {string} as claimant circumstances")
	 public void user_select_as_claimant_circumstances(String claimantCircumstances) {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbInjured')])[1]", "(//*[@class='select2-search__field'])[2]", claimantCircumstances , "(//*[contains(@data-select2-id,'MainContent_cmbInjured')])[2]", "user select {string} as claimant circumstances", "DROPDOWN", 2000);

	 }
	 @When("user enter {string} as claimant amount")
	 public void user_enter_as_claimant_amount(String claimantAmount) throws InterruptedException {
		    Itl.CustomSendEvent("//*[@id='txtClaimantAmount']", claimantAmount, "user enter {string} as claimant amount", "TEXTBOX", 0);	

	 }
	 @When("user enter {string} as circumstances of accidents")
	 public void user_enter_as_circumstances_of_accidents(String circumstancesOfAccidents) throws InterruptedException {
		    Itl.CustomSendEvent("//*[@id='MainContent_txtCircums']", circumstancesOfAccidents, "user enter {string} as circumstances of accidents", "TEXTBOX", 0);	

	 }


     @When("user select {string} as cause of claim")
     public void user_select_as_cause_of_claim(String causeOfClaim) {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbClmmCauses')])[1]", "(//*[@class='select2-search__field'])[2]", causeOfClaim , "(//*[contains(@data-select2-id,'MainContent_cmbClmmCauses')])[2]", "user select {string} as cause of claim", "DROPDOWN", 2000);

     }
     @Then("user enter {string} as place of death\\/illnes\\/others")
     public void user_enter_as_place_of_death_illnes_others(String placeOfDeath) throws InterruptedException {
		    Itl.CustomSendEvent("//*[@id='MainContent_txtAcciPlace']", placeOfDeath, "user enter {string} as place of death\\\\/illnes\\\\/others", "TEXTBOX", 0);	

     }
     @When("user enter {string} as date of death\\/illnes\\/others")
     public void user_enter_as_date_of_death_illnes_others(String dateOfDeathIllnesOthers) throws InterruptedException {
		    Itl.CustomSendEvent("//*[@id='MainContent_txtAcciDate']", dateOfDeathIllnesOthers, "user enter {string} as date of death\\\\/illnes\\\\/others", "TEXTBOX", 0);	

     }
     @When("user click on save button")
     public void user_click_on_save_button() throws InterruptedException {
         Itl.CustomClickEvent("//*[@id='MainContent_btnSave']", "user click on save button", "CLICK", 2000);
     }
     @Then("user able to view {string} as status")
     public void user_able_to_view_as_status(String status) throws InterruptedException {
         Itl.CustomValidationEvent("//*[@id='MainContent_gridCLMGDetails_Label2_1']", status, "user able to view {string} as status", "VALIDATION", 0);
     }
     @When("user click on options menu")
     public void user_click_on_options_menu() throws InterruptedException {
         Itl.CustomClickEvent("(//*[@class='removeclass btn btn-light btn-active-light-primary btn-center btn-sm'])[1]", "user click on options menu", "CLICK", 2000);

     }
     @When("user click on report to insurer option")
     public void user_click_on_report_to_insurer_option() throws InterruptedException {
         Itl.CustomClickEvent("//*[@id='MainContent_gridCLMGDetails_btnReqIns_1']", "user click on report to insurer option", "CLICK", 2000);

     }
     @When("user click on yes,report button for confirmation")
     public void user_click_on_yes_report_button_for_confirmation() throws InterruptedException {
         Itl.CustomClickEvent("//*[@id='btnIntimateToInsurer']", "user click on yes,report button for confirmation", "CLICK", 2000);

     }
     @Then("user able to view {string} as status after reporting to insurer")
     public void user_able_to_view_as_status1(String status) throws InterruptedException {
         Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]", status, "user able to view {string} as status after reporting to insurer", "VALIDATION", 0);
     }
     @When("^user click on fetch button$")
	 public void user_click_on_fetch_button() throws Throwable {
         Itl.CustomClickEvent("//*[@id='btnFetch']", "user click on fetch button", "CLICK", 4000);

	 }

}
