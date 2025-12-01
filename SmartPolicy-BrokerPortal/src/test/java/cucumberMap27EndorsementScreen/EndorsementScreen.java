package cucumberMap27EndorsementScreen;

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

public class EndorsementScreen {
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@When("user navigate on endorsement options")
	public void user_navigate_on_endorsement_options() {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='span100']";
	    SeleniumOperations.actionClass(input7);
	}
	@Then("user click on endorsement")
	public void user_click_on_endorsement() throws InterruptedException {
		Object[] input9=new Object[1];
		input9[0]="//*[@id='span101']";
		SeleniumOperations.clickOnElement(input9);
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
	
	@When("user enter {string} as Insurance Type")
	public void user_enter_as_insuranceType(String insuranceType) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtInsuranceType']", insuranceType, "user enter {string} as Insurance Type", "TEXTBOX", 0);
	}
	
	@When ("user click on search button to find {string} endorsement no")
	 public void user_click_on_search_button_quoteNo1(String endorsement) throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_btnSearch']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(3000);
		 SeleniumOperations.getEndorsementNo(endorsement);
		 Thread.sleep(4000);
	 }
	
	@When ("user enter endorsement no to search {string} endorsement record")
	public void user_enter_as_quote_number(String endorsement) throws InterruptedException {
		String risknoteNo = SeleniumOperations.getEndorsementNo(endorsement);
		Itl.CustomSendEvent("//*[@id='MainContent_txtID']", risknoteNo, "user enter endorsement no to search {string} endorsement record", "TEXTBOX", 0);
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
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[11]/*[2]", "user clicks on the actions dropdown", "CLICK", 2000);

	}
	
	@When("user clicks on print option")
	public void user_clicks_on_print_quotation_option() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@class='PrintQuote grid_btnSpace']", "user clicks on print option", "CLICK", 0);
	    //Thread.sleep(4000);

	}
	@When("the endorsement report should include all relevant details like")
	public void the_quote_should_include_all_relevant_details(DataTable dataTable) throws IOException, InterruptedException {
		 List<String> rawFields = dataTable.asList(String.class);
		    List<String> fields = new ArrayList<>(rawFields); // ✅ make it modifiable

		    // Remove header row if present
		    if (!fields.isEmpty() && fields.get(0).equalsIgnoreCase("Field")) {
		        fields.remove(0);
		    }
	    for (String field : fields) {
	        Object[] input = new Object[5];
	        input[0] = field.trim();
	        input[1] = "//*[@id='sort_table_details']/tbody/tr[1]/td[11]";
	        input[2] = "//*[@id='MainContent_txtNewPremium']";
	        input[3] = "//*[@id='MainContent_txtVATAmt']";
	        input[4] = "//*[@id='MainContent_txtTotalReceivable']";
	        Hashtable<String, Object> output = SeleniumOperations.printEndorsementReport(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the endorsement report should include all relevant details like", output.get("MESSAGE").toString());
			Thread.sleep(2000);
	    }
	    
	}
	@When("the Burglary\\/Theft endorsement report should include all relevant details like")
	public void the_report_should_include_all_relevant_details(DataTable dataTable) throws IOException, InterruptedException {
		 List<String> rawFields = dataTable.asList(String.class);
		    List<String> fields = new ArrayList<>(rawFields); // ✅ make it modifiable

		    // Remove header row if present
		    if (!fields.isEmpty() && fields.get(0).equalsIgnoreCase("Field")) {
		        fields.remove(0);
		    }
	    for (String field : fields) {
	        Object[] input = new Object[5];
	        input[0] = field.trim();
	        input[1] = "//*[@id='sort_table_Burglery']/tbody/tr[1]/td[10]";
	        input[2] = "//*[@id='MainContent_txtNewPremium']";
	        input[3] = "//*[@id='MainContent_txtVATAmt']";
	        input[4] = "//*[@id='MainContent_txtTotalPrm']";
	        Hashtable<String, Object> output = SeleniumOperations.printEndorsementReport(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the endorsement report should include all relevant details like", output.get("MESSAGE").toString());
			Thread.sleep(2000);
	    }
	}
	    
	    @When("the life endorsement report should include all relevant details like")
		public void the_report1_should_include_all_relevant_details(DataTable dataTable) throws IOException, InterruptedException {
			 List<String> rawFields = dataTable.asList(String.class);
			    List<String> fields = new ArrayList<>(rawFields); // ✅ make it modifiable

			    // Remove header row if present
			    if (!fields.isEmpty() && fields.get(0).equalsIgnoreCase("Field")) {
			        fields.remove(0);
			    }
		    for (String field : fields) {
		        Object[] input = new Object[5];
		        input[0] = field.trim();
		        input[1] = "//*[@id='sort_table_EndorseLife']/tbody/tr[1]/td[7]";
		        input[2] = "//*[@id='MainContent_txtNewPremium']";
		        input[3] = "//*[@id='MainContent_txtVATAmt']";
		        input[4] = "//*[@id='MainContent_txtTotalPrm']";
		        Hashtable<String, Object> output = SeleniumOperations.printEndorsementReport(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the endorsement report should include all relevant details like", output.get("MESSAGE").toString());
				Thread.sleep(2000);
		    }
	    
	}
	    
	    @When("the vehicle endorsement report should include all relevant details like")
		public void the_report2_should_include_all_relevant_details(DataTable dataTable) throws IOException, InterruptedException {
			 List<String> rawFields = dataTable.asList(String.class);
			    List<String> fields = new ArrayList<>(rawFields); // ✅ make it modifiable

			    // Remove header row if present
			    if (!fields.isEmpty() && fields.get(0).equalsIgnoreCase("Field")) {
			        fields.remove(0);
			    }
		    for (String field : fields) {
		        Object[] input = new Object[5];
		        input[0] = field.trim();
		        input[1] = "//*[@id='txtfltNewPremiumVehicle']";
		        input[2] = "//*[@id='txtFltSumInsured']";
		        input[3] = "//*[@id='txtVATAmtVehicle']";
		        input[4] = "//*[@id='txtTotalPremiumVehicle']";
		        Hashtable<String, Object> output = SeleniumOperations.printEndorsementReport(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the endorsement report should include all relevant details like", output.get("MESSAGE").toString());
				Thread.sleep(2000);
		    }
	    
	}
}
