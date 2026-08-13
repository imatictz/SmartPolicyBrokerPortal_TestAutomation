package cucumberMap32CollateralFeedback;

import java.util.Hashtable;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class CollateralFeedback {

	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws InterruptedException 
	{
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	   
	}

 
	@When("^user navigate on customer management menu$")
	public void user_navigate_on_quotations_menu() 
	{
		Object[] input8=new Object[1];
	    input8[0]="//*[@id='span_customerManagementLc']";
	    SeleniumOperations.actionClass(input8);
	   
	}

	@When("^user click on collateral master$")
	public void user_click_on_current_quotations() throws InterruptedException 
	{
		Object[] input9=new Object[1];
	    input9[0]="//*[@id='span_collateralMaster_lc']";
	    SeleniumOperations.clickOnElement(input9);
	    Thread.sleep(2000);
	}
	
	@When("^user click on add button$")
	public void user_click_on_add_button() throws InterruptedException  
	{
		Object[] input10=new Object[1];
	    input10[0]="//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input10);
	    Thread.sleep(4000);
	    
	}
	

	    // ===========================
	    // SECURITY INFORMATION
	    // ===========================
	    @When("user enter Security Information details :")
	    public void user_enter_security_information_details(DataTable dataTable) throws Throwable {

	    	Map<String, String> data = dataTable.asMap(String.class, String.class);

	        if (data.get("Owner's Name") != null) {
	            Itl.CustomClearSendEvent(
	                    "//*[@id='MainContent_txtName']",
	                    data.get("Owner's Name"),
	                    "Enter Owner Name",
	                    "TEXTBOX",
	                    5000
	            );
	            SeleniumOperations.actionDownEnter();
	        }

	        if (data.get("Security Owner") != null) {
	            Itl.CustomDropdownEvent(
	                    "//*[contains(@aria-controls,'MainContent_cmbPropSts')]",
	                    "//*[@class='select2-search__field']",
	                    data.get("Security Owner"),
	                    "(//*[contains(@data-select2-id,'MainContent_cmbPropSts-result')])",
	                    "Select Security Owner",
	                    "DROPDOWN",
	                    2000
	            );
	        }if (data.get("Place Of Birth") != null) {
	            Itl.CustomDropdownEvent(
	                    "//*[contains(@aria-controls,'MainContent_cmbPOB')]",
	                    "//*[@class='select2-search__field']",
	                    data.get("Place Of Birth"),
	                    "(//*[contains(@data-select2-id,'MainContent_cmbPOB-result')])",
	                    "Select Place Of Birth",
	                    "DROPDOWN",
	                    2000
	            );
	        }
	        if (data.get("Security Type") != null) {
	            Itl.CustomDropdownEvent(
	                    "//*[contains(@aria-controls,'MainContent_cmbPropType')]",
	                    "//*[@class='select2-search__field']",
	                    data.get("Security Type"),
	                    "(//*[contains(@data-select2-id,'MainContent_cmbPropType-result')])",
	                    "Select Security Type",
	                    "DROPDOWN",
	                    2000
	            );
	        }
	        
	        

	        if (data.get("Security Value") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtPropertyVal']",
	                    data.get("Security Value"),
	                    "Enter Security Value",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Land Registration No") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtLandRegNo']",
	                    data.get("Land Registration No"),
	                    "Enter Land Registration No",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Security Address") != null) {
	            Itl.CustomClearSendEvent(
	                    "//*[@id='txtPropertyAdd']",
	                    data.get("Security Address"),
	                    "Enter Security Address",
	                    "TEXTAREA",
	                    0
	            );
	        }

	        if (data.get("Deed Tenure (Years)") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtDeedTenure']",
	                    data.get("Deed Tenure (Years)"),
	                    "Enter Deed Tenure",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Deed Date of Issue") != null) {
	            Itl.CustomSendTodaysDateEvent(
	                    "//input[@id='txtDtofExpiry']",
	                    data.get("Deed Date of Issue"),
	                    "Enter Deed Date of Issue",
	                    "TEXTBOX",
	                    0
	            );
	        }
	        if (data.get("Expiry Date") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtDtofExpiry']",
	                    data.get("Expiry Date"),
	                    "Enter Expiry Date",
	                    "TEXTBOX",
	                    0
	            );
	        }
	        if (data.get("Google Location") != null) {
	            Itl.CustomClearSendEvent(
	                    "//*[@id='txtGoogleLoc']",
	                    data.get("Google Location"),
	                    "Enter Google Location",
	                    "TEXTBOX",
	                    0
	            );
	        }
	        if (data.get("Valuation Date") != null) {
	            Itl.CustomSendTodaysDateEvent(
	                    "//*[@id='txtValuation']",
	                    data.get("Valuation Date"),
	                    "Enter Valuation Date",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Market Value") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtMarketValue']",
	                    data.get("Market Value"),
	                    "Enter Market Value",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Forced Sale Value") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtForcedSaleValue']",
	                    data.get("Forced Sale Value"),
	                    "Enter Forced Sale Value",
	                    "TEXTBOX",
	                    0
	            );
	        }
	        
	        if (data.get("Encumbrance Status") != null) {
	            Itl.CustomClearSendEvent(
	                    "//*[@id='txtEncumbranceSts']",
	                    data.get("Encumbrance Status"),
	                    "Enter Encumbrance Status",
	                    "TEXTBOX",
	                    0
	            );
	        }
	        if (data.get("Security Tax Paid Date") != null) {
	            Itl.CustomSendTodaysDateEvent(
	                    "//*[@id='txtTxPaidDate']",
	                    data.get("Security Tax Paid Date"),
	                    "Enter Security Tax Paid Date",
	                    "TEXTBOX",
	                    0
	            );
	        }
	       
	    }

	    // ===========================
	    // CHECKBOXES
	    // ===========================
	    @When("user select Security Tax Paid checkbox")
	    public void user_select_security_tax_paid_checkbox() throws Throwable {
	        Itl.CustomClickEvent(
	                "//*[@id='chkPTP']",
	                "Select Security Tax Paid",
	                "CLICK",
	                1000
	        );
	    }

	    @When("user select Land Rent Paid checkbox")
	    public void user_select_land_rent_paid_checkbox() throws Throwable {
	        Itl.CustomClickEvent(
	                "//*[@id='chkLRP']",
	                "Select Land Rent Paid",
	                "CLICK",
	                1000
	        );
	    }

	    @When("user select Submitted Annual Return checkbox")
	    public void user_select_submitted_annual_return_checkbox() throws Throwable {
	        Itl.CustomClickEvent(
	                "//*[@id='chkSAR']",
	                "Select Submitted Annual Return",
	                "CLICK",
	                1000
	        );
	    }

	    // ===========================
	    // BORROWER INFORMATION
	    // ===========================
	    @When("user enter Borrower Information details :")
	    public void user_enter_borrower_information_details(DataTable dataTable) throws Throwable {

	        Map<String, String> data = dataTable.asMap(String.class, String.class);

	        if (data.get("Name") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtBrwName']",
	                    data.get("Name"),
	                    "Enter Borrower Name",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Loan Account No") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtLnAccount']",
	                    data.get("Loan Account No"),
	                    "Enter Loan Account",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Loan Amount") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtLnAmount']",
	                    data.get("Loan Amount"),
	                    "Enter Loan Amount",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Loan Product") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtLnProduct']",
	                    data.get("Loan Product"),
	                    "Enter Loan Product",
	                    "TEXTBOX",
	                    0
	            );
	        }
	    }

	    // ===========================
	    // INSURANCE DETAILS
	    // ===========================
	    @When("user enter Insurance Details details :")
	    public void user_enter_insurance_details_details(DataTable dataTable) throws Throwable {

	        Map<String, String> data = dataTable.asMap(String.class, String.class);

	        if (data.get("Insurance Company") != null) {
	            Itl.CustomDropdownEvent(
	                    "//*[contains(@aria-controls,'MainContent_cmbInsrComp')]",
	                    "//*[@class='select2-search__field']",
	                    data.get("Insurance Company"),
	                    "(//*[contains(@data-select2-id,'MainContent_cmbInsrComp-result')])",
	                    "Select Insurance Company",
	                    "DROPDOWN",
	                    2000
	            );
	        }

	        if (data.get("Insurance Type") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtInsrType']",
	                    data.get("Insurance Type"),
	                    "Enter Insurance Type",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Policy No") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtPolicyNB']",
	                    data.get("Policy No"),
	                    "Enter Policy No",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Risk Note No") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtRNNb']",
	                    data.get("Risk Note No"),
	                    "Enter Risk Note No",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Sum Assured") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtSumAssured']",
	                    data.get("Sum Assured"),
	                    "Enter Sum Assured",
	                    "TEXTBOX",
	                    0
	            );
	        }

	        if (data.get("Premium") != null) {
	            Itl.CustomClearSendEvent(
	                    "//input[@id='txtSumPremium']",
	                    data.get("Premium"),
	                    "Enter Premium",
	                    "TEXTBOX",
	                    0
	            );
	        }
	        if (data.get("From Date") != null) {
	            Itl.CustomSendTodaysDateEvent(
	                    "//*[@id='txtPeriodFrom']",
	                    data.get("From Date"),
	                    "Enter From Date",
	                    "TEXTBOX",
	                    0
	            );
	        }
	        if (data.get("To Date") != null) {
	            Itl.CustomClearSendEvent(
	                    "//*[@id='txtPeriodTo']",
	                    data.get("To Date"),
	                    "Enter To Date",
	                    "TEXTBOX",
	                    0
	            );
	        }
	    }

	    // ===========================
	    // INSERT BUTTON
	    // ===========================
	    @When("user click on insert button")
	    public void user_click_on_insert_button() throws Throwable {
	        Itl.CustomClickEvent(
	                "//*[@id='MainContent_btnSave_CLTI']",
	                "User click on Insert button",
	                "CLICK",
	                2000
	        );
	    }

	    // ===========================
	    // SAVE BUTTON
	    // ===========================
	    @When("user click on save button")
	    public void user_click_on_save_button() throws Throwable {
	        Itl.CustomClickEvent(
	                "//*[@id='MainContent_btnSave']",
	                "User click on Save button",
	                "CLICK",
	                2000
	        );
	    }
	    @When("user enter {string} as Date From")
	    public void enterFromDate(String date) throws Throwable {
	    	Itl.CustomClearSendEvent(
                    "//*[@id='MainContent_txtSrchFromDate']",
                    date,
                    "Enter Date From",
                    "TEXTBOX",
                    0
            );
	    	Itl.CustomClearEvent("//*[@id='MainContent_txtUserId']", "CLEAR", 0);
	    }
	    @When("user select {string} as Record Status")
	    public void selectStatus(String status) throws Throwable {
	    Itl.CustomDropdownEvent(
                "//*[contains(@aria-controls,'MainContent_cmbRecStatus')]",
                "//*[@class='select2-search__field']",
                status,
                "(//*[contains(@data-select2-id,'MainContent_cmbRecStatus-result')])",
                "Select status",
                "DROPDOWN",
                2000
        );
	    }
	    @Then("user click on search button")
	 	public void user_click_on_search_button() throws Throwable {
	 	    
	    	Itl.CustomClickEvent(
	                "//*[@id='button_btnSearch_lc']",
	                "user click on search button",
	                "CLICK",
	                2000
	        );
	 	}
	    @When("user clicks on the actions dropdown")
		public void user_clicks_on_the_actions_dropdown() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[2]", "user clicks on the actions dropdown", "CLICK", 2000);

		}
	    @When("user clicks on edit option")
		public void user_clicks_on_edit_option() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[2]/*[2]/*[1]", "user clicks on edit option", "CLICK", 2000);
		}
	    @Then("^user click on update button$")
		public void user_click_on_update_button() throws Throwable {
		    Object[] input=new Object[1];
			input[0]="//*[@id='MainContent_btnSave']";
			Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button",output.get("MESSAGE").toString());  
		    Thread.sleep(4000);
		}
	    @Then ("user able to view {string} as message")
		public void validation(String validation) throws InterruptedException{
			Object[] input=new Object[2];
			input[0]="//*[text()='1003-Information modified successfully']";
			input[1]=validation;
			Hashtable<String,Object> output=SeleniumOperations.validation(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view {string} as message",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}
	    @When("user click on select icon to edit details")
		 public void user_click_on_selectIcon() throws Throwable
		 {
			 Object[] input7=new Object[1];
				input7[0]="(//*[@class='EditDataCLTI'])[1]";
				 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
				 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on select icon to edit details",output.get("MESSAGE").toString());
		         Thread.sleep(2000);
		 }
	    @When("user click on update button to save insurance details")
		 public void user_click_on_update_button_policyInformation() throws Throwable
		 {
			 Object[] input7=new Object[1];
				input7[0]="//*[@id='MainContent_btnSave_CLTI']";
				 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
				 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button to save insurance details",output.get("MESSAGE").toString());
		     
		 }
   }

