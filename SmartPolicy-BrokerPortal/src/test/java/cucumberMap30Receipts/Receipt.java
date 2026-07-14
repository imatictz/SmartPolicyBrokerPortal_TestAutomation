

	package cucumberMap30Receipts;

	import java.util.Hashtable;
import java.util.Map;

	import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

	public class Receipt {

		@When("^user navigate on operation dropdown menu$")
		public void user_navigate_on_operation_dropdown_menu1() throws InterruptedException {
			Object[] input7=new Object[1];
		    input7[0]="//*[@id='MOD_OPERATIONS']";
		    SeleniumOperations.actionClass(input7);
		    Thread.sleep(2000);
		}

			@When("^user navigate on all receipts menu$")
			public void user_navigate_on_quotations_menu() throws InterruptedException 
			{
				Object[] input8=new Object[1];
			   input8[0]="//*[@id='span_allReceipts_lc']";
			    SeleniumOperations.actionClass(input8);
			  Thread.sleep(2000); 
			}

			@When("^user click on receipts$")
			public void user_click_on_current_quotations() throws InterruptedException 
			{
				Object[] input9=new Object[1];
			     input9[0]="//*[@id='span_receipts_lc']";
			     SeleniumOperations.clickOnElement(input9);
			     Thread.sleep(4000);
			    
			}

			@When("^user click on add button$")
			public void user_click_on_add_button() throws InterruptedException  
			{
				Object[] input10=new Object[1];
			input10[0]="//*[@id='MainContent_btnAdd']";
			SeleniumOperations.clickOnElement(input10);
			Thread.sleep(5000);
			
			    
			}
	    @When("user enter screen details :")
	    public void user_enter_screen_details(DataTable dataTable) throws Throwable {

	        Map<String, String> data = dataTable.asMap(String.class, String.class);

	        // Client Name
	        if (data.get("Client Name") != null) {
	            itl.Itl.CustomSendEvent(
	                    "//input[@id='MainContent_txtClientName']",
	                    data.get("Client Name"),
	                    "User enter Client Name",
	                    "TEXTBOX",
	                    5000
	                    
	            );
	            SeleniumOperations.actionDownEnter();
	        }
			
	        // Amount
	        if (data.get("Amount") != null) {
	            itl.Itl.CustomClearSendEvent(
	                    "//input[@id='MainContent_txtAmount']",
	                    data.get("Amount"),
	                    "User enter Amount",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        // Currency Dropdown
	        if (data.get("Currency") != null) {
	            itl.Itl.CustomDropdownEvent(
	                    "//*[contains(@aria-controls,'MainContent_cmbCurrency')]",
	                    "//*[@class='select2-search__field']",
	                    data.get("Currency"),
	                    "(//*[contains(@data-select2-id,'MainContent_cmbCurrency-result')])",
	                    "User select Currency",
	                    "DROPDOWN",
	                    2000
	            );
	        }

	        // Mode Dropdown
	        if (data.get("Mode") != null) {
	            itl.Itl.CustomDropdownEvent(
	                    "//*[contains(@aria-controls,'MainContent_cmbMode')]",
	                    "//*[@class='select2-search__field']",
	                    data.get("Mode"),
	                    "(//*[contains(@data-select2-id,'MainContent_cmbMode-result')])",
	                    "User select Mode",
	                    "DROPDOWN",
	                    2000
	            );
	        }

	        // Issuer Bank Dropdown
	        if (data.get("Issuer Bank") != null) {
	            itl.Itl.CustomDropdownEvent(
	                    "//*[contains(@aria-controls,'MainContent_cmbInsurerBank')]",
	                    "//*[@class='select2-search__field']",
	                    data.get("Issuer Bank"),
	                    "(//*[contains(@data-select2-id,'MainContent_cmbInsurerBank-result')])",
	                    "User select Issuer Bank",
	                    "DROPDOWN",
	                    2000
	            );
	        }

	        // Collecting Bank Dropdown
	        if (data.get("Collecting Bank") != null) {
	            itl.Itl.CustomDropdownEvent(
	                    "//*[contains(@aria-controls,'MainContent_cmbClientBank')]",
	                    "//*[@class='select2-search__field']",
	                    data.get("Collecting Bank"),
	                    "(//*[contains(@data-select2-id,'MainContent_cmbClientBank-result')])",
	                    "User select Collecting Bank",
	                    "DROPDOWN",
	                    2000
	            );
	        }

	        // Cheque / Reference Number
	        if (data.get("Cheque/ Reference Number") != null) {
	            itl.Itl.CustomSendEvent(
	                    "//input[@id='MainContent_txtRefNB']",
	                    data.get("Cheque/ Reference Number"),
	                    "User enter Cheque/ Reference Number",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        // Notes
	        if (data.get("Notes") != null) {
	            itl.Itl.CustomSendEvent(
	                    "//*[@id='MainContent_txtNotes']",
	                    data.get("Notes"),
	                    "User enter Notes",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        // Refrence Id
	        if (data.get("Refrence Id") != null) {
	            itl.Itl.CustomSendEvent(
	                    "//input[@id='MainContent_txtAcctRefId']",
	                    data.get("Refrence Id"),
	                    "User enter Refrence Id",
	                    "TEXTBOX",
	                    0
	            );
	        }
	    }

	    @When("user click on save button")
	    public void user_click_on_save_button() throws Throwable {
	        itl.Itl.CustomClickEvent(
	                "//*[@id='btnSave']",
	                "User click on Save button",
	                "CLICK",
	                5000
	        );
	    }
	    @Then("^user able to view \"([^\"]*)\" as status$")
		public void user_able_to_view_as_status(String status) throws Throwable {
		    Object[] input=new Object[2];
			input[0]="//*[@id='sort_table']/tbody/tr[1]/td[8]";
			input[1]=status;
			Hashtable<String,Object> output= SeleniumOperations.validation(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"([^\\\"]*)\\\" as status",output.get("MESSAGE").toString());
		}
	}


