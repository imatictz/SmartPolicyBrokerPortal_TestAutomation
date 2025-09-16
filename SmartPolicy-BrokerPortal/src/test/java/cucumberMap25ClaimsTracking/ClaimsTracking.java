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
	        input[3] = "//*[@id='txtClaimantAmount']";
	        Hashtable<String, Object> output = SeleniumOperations.printClaimReport(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the claim report should include all relevant details like", output.get("MESSAGE").toString());
			Thread.sleep(2000);
	    }
	    
	}
}
