package cucumberMap25ClaimsTracking;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ClaimsTracking {
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='MOD_OPERATIONS']", "user navigate on operation dropdown menu", "NAVIGATE", 2000);
	}
	@When("user navigate on claims options")
	public void user_navigate_on_claims_management() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='MNU_CLAIM']", "user navigate on claims options", "NAVIGATE", 2000);
	}
	@Then("user click on manage claim")
	public void user_click_on_manage_claim() throws InterruptedException {
        Itl.CustomClickEvent("//*[@id='MNU_WFCLMM']", "user click on manage claim", "CLICK", 2000);
	}
	@When("^user select \"([^\"]*)\" as from date$")
	 public void user_select_as_date_from(String dateFrom) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtSrchFromDate1']";
		 input[1]=dateFrom;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \"01/01/2023\" as from date",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	
	@When("user enter {string} as Cover Information")
	public void user_enter_as_insuranceType(String CoverInformation) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtSrchCoverType']", CoverInformation, "user enter {string} as Cover Information", "TEXTBOX", 0);
	    Itl.CustomClearEvent("//*[@id='MainContent_txtUserId']", "CLEAR", 0);
	}
	
	@When ("user click on search button to find {string} claim ID")
	 public void user_click_on_search_button_quoteNo1(String risknote) throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_btnSearch']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(3000);
		 SeleniumOperations.getClaimId(risknote);
		 Thread.sleep(4000);
	 }
	
	@When ("user enter claim ID to search {string} claim record")
	public void user_enter_as_quote_number(String claimId) throws InterruptedException {
		String claimIdNo = SeleniumOperations.getClaimId(claimId);
		Itl.CustomSendEvent("//*[@id='MainContent_txtSrchClaimId']", claimIdNo, "user enter claim ID to search {string} claim record", "TEXTBOX", 0);
		Thread.sleep(4000);
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
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]", "user clicks on the actions dropdown", "CLICK", 2000);

	}
	
	@When("user clicks on print claim report option")
	public void user_clicks_on_print_quotation_option() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[6]", "user clicks on print quotation option", "CLICK", 4000);

	}
	@When("the claim report should include all relevant details like")
	public void the_quote_should_include_all_relevant_details(DataTable dataTable) throws IOException, InterruptedException {
		 List<String> rawFields = dataTable.asList(String.class);
		    List<String> fields = new ArrayList<>(rawFields); // ✅ make it modifiable

		    // Remove header row if present
		    if (!fields.isEmpty() && fields.get(0).equalsIgnoreCase("Field")) {
		        fields.remove(0);
		    }
	    for (String field : fields) {
	        Object[] input = new Object[4];
	        input[0] = field.trim();
	        input[1] = "//*[@id='select2-MainContent_cmbInsuranceType-container']";
	        input[2] = "//*[@id='MainContent_txtPolicyNb']";
	        input[3] = "//*[@id='MainContent_txtSumInsured']";
	        Hashtable<String, Object> output = SeleniumOperations.printClaimReport(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the claim report should include all relevant details like", output.get("MESSAGE").toString());
			Thread.sleep(2000);
	    }
	    
	}
	 @When("user enter date of loss\\/Accident")
	 public void user_enter_as_date_of_loss_accident() throws InterruptedException {
          Itl.CustomSendTodaysDateEvent("//*[@id='MainContent_txtAcciDate']","Today", "user enter date of loss\\\\/Accident", "TEXTBOX", 0);
	 }
	 @When("user enter reported date")
	 public void user_enter_as_reportDate() throws InterruptedException {
          Itl.CustomSendTodaysDateEvent("//*[@id='MainContent_txtReportedDate']","Today", "user enter reported date", "TEXTBOX", 0);
	 }
	 @When("user enter police reported date")
	 public void user_enter_as_policereportDate() throws InterruptedException {
          Itl.CustomSendTodaysDateEvent("//*[@id='MainContent_txtPSPD']","Today", "user enter police reported date", "TEXTBOX", 0);
	 }
	 @When("user enter date of death\\/illnes\\/others")
	 public void user_enter_as_date_of_death_illnes_others() throws InterruptedException {
          Itl.CustomSendTodaysDateEvent("//*[@id='MainContent_txtAcciDate']","Today", "user enter date of death\\\\/illnes\\\\/others", "TEXTBOX", 0);
	 }
	 @When("user select {string} as country")
	 public void user_select_as_country(String country) throws InterruptedException {
		    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCountryofLoss')]", "(//*[@class='select2-search__field'])[2]", country , "(//*[contains(@data-select2-id,'MainContent_cmbCountryofLoss')])[2]", "user select {string} as country", "DROPDOWN", 3000);

	 }
	 @When("user select {string} as region\\/City of loss")
	 public void user_select_as_region_city_of_loss(String cityOfLoss) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbRegion')])[1]", "(//*[@class='select2-search__field'])[2]", cityOfLoss , "(//*[contains(@data-select2-id,'MainContent_cmbRegion')])[3]", "user select {string} as region\\\\/City of loss", "DROPDOWN", 0);
            Thread.sleep(4000);
	 }
	 @When("user select {string} as district of loss")
	 public void user_select_as_district_of_loss(String districtOfLoss) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbDistrict')])[1]", "(//*[@class='select2-search__field'])[2]", districtOfLoss , "(//*[contains(@data-select2-id,'MainContent_cmbDistrict')])[3]", "user select {string} as district of loss", "DROPDOWN", 2000);

	 }
	 @When("user select {string} as cause of loss\\/Accident")
	 public void user_select_as_cause_of_loss_accident(String causeOfLossAccident) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbClmmCauses')])[1]", "(//*[@class='select2-search__field'])[2]", causeOfLossAccident , "(//*[contains(@data-select2-id,'MainContent_cmbClmmCauses')])[2]", "user select {string} as cause of loss\\\\/Accident", "DROPDOWN", 2000);

	 }
	 @Then("user enter {string} as place of loss\\/Accident")
	 public void user_enter_as_place_of_loss_accident(String placeOfLossAccident) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtAcciPlace']", placeOfLossAccident, "user enter {string} as place of loss\\\\/Accident", "TEXTBOX", 0);	

	 }
	 @When("user select {string} as reported type")
	 public void user_select_as_reported_type(String reportedType) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbIntimationType')])[1]", "(//*[@class='select2-search__field'])[2]", reportedType , "(//*[contains(@data-select2-id,'MainContent_cmbIntimationType')])[2]", "user select {string} as reported type", "DROPDOWN", 2000);

	 }
	 @When("user select {string} as nature of loss\\/claim type")
	 public void user_select_as_nature_of_loss_claim_type(String natureOfLossClaimType) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbLossType')])[1]", "(//*[@class='select2-search__field'])[2]", natureOfLossClaimType , "(//*[contains(@data-select2-id,'MainContent_cmbLossType')])[2]", "user select {string} as nature of loss\\\\/claim type", "DROPDOWN", 2000);

	 }
	 @When("user select {string} as claimant circumstances")
	 public void user_select_as_claimant_circumstances(String claimantCircumstances) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbInjured')])[1]", "(//*[@class='select2-search__field'])[2]", claimantCircumstances , "(//*[contains(@data-select2-id,'MainContent_cmbInjured')])[2]", "user select {string} as claimant circumstances", "DROPDOWN", 2000);

	 }
	 @When("user enter {string} as claimant amount")
	 public void user_enter_as_claimant_amount(String claimantAmount) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='txtClaimantAmount']", claimantAmount, "user enter {string} as claimant amount", "TEXTBOX", 0);	

	 }
	 @When("user enter {string} as circumstances of accidents")
	 public void user_enter_as_circumstances_of_accidents(String circumstancesOfAccidents) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtCircums']", circumstancesOfAccidents, "user enter {string} as circumstances of accidents", "TEXTBOX", 0);	

	 }
    @When("user select {string} as cause of claim")
    public void user_select_as_cause_of_claim(String causeOfClaim) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbClmmCauses')])[1]", "(//*[@class='select2-search__field'])[2]", causeOfClaim , "(//*[contains(@data-select2-id,'MainContent_cmbClmmCauses')])[2]", "user select {string} as cause of claim", "DROPDOWN", 2000);

    }
    @Then("user enter {string} as place of death\\/illnes\\/others")
    public void user_enter_as_place_of_death_illnes_others(String placeOfDeath) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtAcciPlace']", placeOfDeath, "user enter {string} as place of death\\\\/illnes\\\\/others", "TEXTBOX", 0);	

    }
    @When("user enter {string} as date of death\\/illnes\\/others")
    public void user_enter_as_date_of_death_illnes_others(String dateOfDeathIllnesOthers) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtAcciDate']", dateOfDeathIllnesOthers, "user enter {string} as date of death\\\\/illnes\\\\/others", "TEXTBOX", 0);	

    }
    @When("user click on save button")
    public void user_click_on_save_button() throws InterruptedException {
        Itl.CustomClickEvent("//*[@id='MainContent_btnSave']", "user click on save button", "CLICK", 2000);
    }
    
    @When("user click on edit option")
	public void user_click_on_edit_option() throws Throwable {
        Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[2]", "user click on edit option", "CLICK", 2000);
	}
    @Then ("user able to view {string} as message")
	public void validation(String status) throws InterruptedException{
        Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", status, "user able to view {string} as status", "VALIDATION", 0);
	}
    @When("user click on update button")
	 public void user_click_on_update_button() throws Throwable{
        Itl.CustomClickEvent("//*[@id='MainContent_btnSave']", "user click on update button", "CLICK", 2000);
	}
    @Then("user able to view {string} as status")
    public void user_able_to_view_as_status1(String status) throws InterruptedException {
        Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]", status, "user able to view {string} as status", "VALIDATION", 0);
    }

}
