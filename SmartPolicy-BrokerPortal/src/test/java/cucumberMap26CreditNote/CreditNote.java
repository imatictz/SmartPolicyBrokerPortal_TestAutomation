package cucumberMap26CreditNote;

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

public class CreditNote {
	@When ("^user navigate on operation dropdown$")
 	public void user_navigate_on_operation_dropdown_menu() {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	}
	@When("user navigate on billing option")
	public void user_navigate_on_billing_option() {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='span128']";
	    SeleniumOperations.actionClass(input7);
	}
	@Then("user click on credit note option")
	public void user_click_on_credit_note_option() throws InterruptedException {
	    Itl.ClickEvent("//*[@id='span96']", "CLICK", 2000);
	}
	@When("user select {string} as date")
	public void user_select_as_date(String date) throws InterruptedException {
	    Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchFromDate1']", date, "user select {string} as date", "TEXTBOX", 0);
	}
	@When("user enter {string} as type")
	public void user_enter_as_type(String type) throws InterruptedException {
	    Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchType']", type, "user enter {string} as type", "TEXTBOX", 0);
	}
	@When("user enter {string} as status")
	public void user_enter_as_status(String status) throws InterruptedException {
	    Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchStatus']", status, "user enter {string} as status", "TEXTBOX", 0);
	}
	@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='button_btnSearch_lc']", "user click on search button", "CLICK", 4000);
	}
	@When("user clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[11]/*[2]", "user clicks on the actions dropdown", "CLICK", 0);
	    Thread.sleep(1000);
	}
	@When("user clicks on print option")
	public void user_clicks_on_print_quotation_option() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='btnPrint']", "user clicks on print option", "CLICK", 4000);
	}
	@When("the credit note should include all relevant details like")
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
	        Hashtable<String, Object> output = SeleniumOperations.printCreditNote(input);
	        String status = output.get("STATUS").toString();
	        String message = output.get("MESSAGE").toString();

	        // 🧠 Build more descriptive step name and message
	        String stepName = "Verify Credit Note field: '" + field.trim() + "'";
	        String detailedMessage =
	                "Field Verified: <b>" + field + "</b><br>" +
	                "Result: " + message + "<br>" +
	                "Status: " + status + "<br>";

	        // ✅ Log richer details in HTML report
	        HTMLReportGenerator.StepDetails(status, stepName, detailedMessage);
			//HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the credit note should include all relevant details like", output.get("MESSAGE").toString());
			Thread.sleep(2000);
	    }
	    
	}
}
