package cucumberMap33workmens;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Workmens {
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws InterruptedException 
	{
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	   
	}

 
	@When("^user navigate on quotations menu$")
	public void user_navigate_on_quotations_menu() 
	{
		Object[] input8=new Object[1];
	    input8[0]="//*[@id='span_quotations_lc']";
	    SeleniumOperations.actionClass(input8);
	   
	}

	@When("^user click on current quotations$")
	public void user_click_on_current_quotations() throws InterruptedException 
	{
		Object[] input9=new Object[1];
	    input9[0]="//*[@id='MNU_wfFIQNM']";
	    SeleniumOperations.clickOnElement(input9);
	    Thread.sleep(2000);
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws InterruptedException  
	{
		Object[] input10=new Object[1];
	    input10[0]="//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input10);
	    Thread.sleep(8000);
	    
	}

	@When("^user select \"([^\"]*)\" as insurance type$")
	public void user_select_as_insurance_type(String insuranceType) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbPopInsuranceType')]";
		input[1]="//*[@class='select2-search__field']";
		input[2]=insuranceType;
		input[3]="//*[contains(@id,'select2-MainContent_cmbPopInsuranceType-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as insurance type",output.get("MESSAGE").toString());
		Thread.sleep(5000);
	}
	@When("user enter screen details :")
	public void user_enter_screen_details(DataTable dataTable) throws Throwable {

	    Map<String, String> data = dataTable.asMap(String.class, String.class);

	    if (data.get("Client Name") != null) {
	        Itl.CustomClearSendEvent(
	                "//input[@id='MainContent_txtClientName']",
	                data.get("Client Name"),
	                "Enter Client Name",
	                "TEXTBOX",
	                5000
	        );
	        SeleniumOperations.actionDownEnter();
	    }

	    if (data.get("Insurer") != null) {
	        Itl.CustomDropdownEvent(
	                "//*[contains(@aria-controls,'MainContent_cmbInsurer')]",
	                "(//*[@class='select2-search__field'])[2]",
	                data.get("Insurer"),
	                "(//*[contains(@data-select2-id,'MainContent_cmbInsurer-result')])",
	                "Select Insurer",
	                "DROPDOWN",
	                2000
	        );
	    }

	    

	    if (data.get("Cover Number") != null) {
	        Itl.CustomClearSendEvent(
	                "//input[@id='MainContent_txtGridICN']",
	                data.get("Cover Number"),
	                "Enter Cover Number",
	                "TEXTBOX",
	                0
	        );
	    }

	    if (data.get("Insurance Class") != null) {
	        Itl.CustomDropdownEvent(
	                "//*[contains(@aria-controls,'MainContent_cmbInsuranceClass')]",
	                "(//*[@class='select2-search__field'])",
	                data.get("Insurance Class"),
	                "(//*[contains(@data-select2-id,'MainContent_cmbInsuranceClass-result')])",
	                "Select Insurance Class",
	                "DROPDOWN",
	                2000
	        );
	    }

	    if (data.get("No of Employees") != null) {
	        Itl.CustomClearSendEvent(
	                "//input[@id='txtNoofEmp']",
	                data.get("No of Employees"),
	                "Enter No of Employees",
	                "TEXTBOX",
	                0
	        );
	    }

	    if (data.get("Annual Salary/Limit of Liability") != null) {
	        Itl.CustomClearSendEvent(
	                "//input[@id='txtAnnualSalary']",
	                data.get("Annual Salary/Limit of Liability"),
	                "Enter Annual Salary/Limit of Liability",
	                "TEXTBOX",
	                0
	        );
	    }
	}
	@When("user continue to enter screen details :")
	public void user_continueenter_screen_details(DataTable dataTable) throws Throwable {

	    Map<String, String> data = dataTable.asMap(String.class, String.class);

	    

	    if (data.get("Insurance Class") != null) {
	        Itl.CustomDropdownEvent(
	                "//*[contains(@aria-controls,'MainContent_cmbInsuranceClass')]",
	                "(//*[@class='select2-search__field'])",
	                data.get("Insurance Class"),
	                "(//*[contains(@data-select2-id,'MainContent_cmbInsuranceClass-result')])",
	                "Select Insurance Class",
	                "DROPDOWN",
	                2000
	        );
	    }

	    if (data.get("No of Employees") != null) {
	        Itl.CustomClearSendEvent(
	                "//input[@id='txtNoofEmp']",
	                data.get("No of Employees"),
	                "Enter No of Employees",
	                "TEXTBOX",
	                0
	        );
	    }

	    if (data.get("Annual Salary/Limit of Liability") != null) {
	        Itl.CustomClearSendEvent(
	                "//input[@id='txtAnnualSalary']",
	                data.get("Annual Salary/Limit of Liability"),
	                "Enter Annual Salary/Limit of Liability",
	                "TEXTBOX",
	                0
	        );
	    }
	}
	@When("^user click on addOn button$")
	public void clickOnAddon() throws Throwable 
	{
	    Object[] input=new Object[1];
	    input[0]="//*[text()='Add-ons']";
	    Hashtable<String,Object> output=  SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on addOn button",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as extension$")
	public void user_select_as_extension(String extension) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbAddons')]";
		input[1]="(//*[@class='select2-search__field'])";
		input[2]=extension;
		input[3]="//*[contains(@id,'select2-MainContent_cmbAddons-result-')]";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as extension",output.get("MESSAGE").toString());
	}

	
	@When("^user enter \"([^\"]*)\" as sum insured \\(AddOn\\)$")
	public void enterSumInsuredAddOn(String sumInsuredAddOn) throws Throwable 
	{
	   Object[] input=new Object[2];
	   input[0]="//*[@id='txtSumInsuredAddons']";
	   input[1]=sumInsuredAddOn;
	   Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"200000\" as sum insured (AddOn)",output.get("MESSAGE").toString());
	}

	
	@When ("^user enter \"(.*)\" as rate%$")
	public void enterRate(String rate) throws Throwable 
	{
	   Object[] input=new Object[2];
	   input[0]="//*[@id='txtRateAddons']";
	   input[1]=rate;
	   Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"5\" as rate%",output.get("MESSAGE").toString());
	   Thread.sleep(2000);
	}

	
	
	@When("^user enter \"([^\"]*)\" as description \\(AddOn\\)$")
	public void enterDescriptionAddon(String description) throws Throwable 
	{
		Object[] input =new Object[2];
		input[0]="//*[@id='MainContent_txtDescriptionAddons']";
		input[1]=description;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input); 
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Accidental Damage Quotation AddOn\" as description (AddOn)",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user click on insert button \\(AddOn\\)$")
	public void clickOnInsertButtonAddOn() throws Throwable 
	{
	    Object[] input=new Object[1];
	    input[0]="//*[@id='btnInsertAddons']";
	    Hashtable<String,Object> output=  SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert button (AddOn)",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	
	
	@When("^user click on save button$")
	public void clickOnSaveButton() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='btnSave']",  "user click on save button","CLICK", 4000);

	}

	@When("^user click on Ok button to accept commission alert$")
	public void clickOnOKButton() throws Throwable 
	{
		Hashtable<String,Object> output= SeleniumOperations.alert();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Ok button to accept commission alert",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status(String awaitingReceipt) throws Throwable 
	{
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_repIQNM_lblStatus_0']";
	    input[1]=awaitingReceipt;
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \"Awaiting Receipt\" as status",output.get("MESSAGE").toString());  
	}
	@When("^user click on compute button$")
	public void clickOnComputeButton() throws Throwable 
	{
	 Object[] input=new Object[1];
	 input[0]="//*[@id='btnCompute']";
	 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
	 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on compute button",output.get("MESSAGE").toString());
	}

	@When("^user click on insert button$")
	public void clickOnInsertButton() throws Throwable
	{
	   Object[] input=new Object[1];
	   input[0]="//*[@id='btnInsert']";
	   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
	   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert button",output.get("MESSAGE").toString());
	    Itl.CustomGstPercentValidation("//*[@id='MainContent_txtVATAmt']", "//*[@id='MainContent_txtTotalSum']", "//*[@id='MainContent_txtTotalGrpPremium']", "GSTVALIDATION", 0);

	}
	@When("^user click on update button$")
	 public void user_click_on_update_button() throws Throwable
	 {
		 Object[] input7=new Object[1];
			input7[0]="//*[@id='btnSave']";
			 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button",output.get("MESSAGE").toString());
			 Thread.sleep(2000);
	 }
	@When("user click on update button to save policy information")
	 public void user_click_on_update_button_policyInformation() throws Throwable
	 {
		 Object[] input7=new Object[1];
			input7[0]="//*[@id='btnInsert']";
			 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button to save policy information",output.get("MESSAGE").toString());
	     
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
	    Itl.CustomClearEvent("//*[@id='MainContent_txtUserId']", "CLEAR", 0);
	}
	
	@When ("user click on search button to find {string} quote")
	 public void user_click_on_search_button_quoteNo1(String quoteName) throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='button_btnSearch_lc']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
		 SeleniumOperations.getQuote(quoteName);
		 Thread.sleep(4000);
	 }
	
	@When ("user enter quote number to search {string} quote")
	public void user_enter_as_quote_number(String quoteName) throws InterruptedException {
		String quoteNo = SeleniumOperations.getQuote(quoteName);
		Itl.CustomSendEvent("//*[@id='MainContent_txtSrchQuote']", quoteNo, "user enter {string} as quote number", "TEXTBOX", 0);
		Thread.sleep(4000);
	}
	
	@When ("user click on search button")
	 public void user_click_on_search_button_quoteNo() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='button_btnSearch_lc']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	
	@When("user clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[3]", "user clicks on the actions dropdown", "CLICK", 2000);

	}
	
	@When("user clicks on print quotation option")
	public void user_clicks_on_print_quotation_option() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[3]/*[2]/*[3]", "user clicks on print quotation option", "CLICK", 2000);

	}
	@When("user clicks on edit option")
	public void user_clicks_on_edit_option() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[3]/*[2]/*[1]", "user clicks on edit option", "CLICK", 2000);
	}

	@When("the quote should include all relevant details like")
	public void the_quote_should_include_all_relevant_details(DataTable dataTable) throws IOException, InterruptedException {
		 List<String> rawFields = dataTable.asList(String.class);
		    List<String> fields = new ArrayList<>(rawFields); // ✅ make it modifiable

		    // Remove header row if present
		    if (!fields.isEmpty() && fields.get(0).equalsIgnoreCase("Field")) {
		        fields.remove(0);
		    }
	    for (String field : fields) {
	        Object[] input = new Object[1];
	        input[0] = field.trim();
	        Hashtable<String, Object> output = SeleniumOperations.printQuote(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the quote should include all relevant details like", output.get("MESSAGE").toString());
			Thread.sleep(2000);
	    }
	    
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

	@When ("user enter {string} as borrower account name")
	public void user_enter_as_borrower_account_name(String borrowerName) throws InterruptedException {
		Itl.CustomSendEvent("//*[@id='MainContent_txtBorrowerAccName']", borrowerName, "user enter {string} as borrower account name", "TEXTBOX", 0);
	}
	@When ("user enter {string} as borrower account number")
	public void user_enter_as_borrower_account_number(String borrowerNumber) throws InterruptedException {
		Itl.CustomSendEvent("//*[@id='MainContent_txtBorrowerAccNum']", borrowerNumber, "user enter {string} as borrower account number", "TEXTBOX", 0);
	}
	@When("user click on select icon to edit details")
	 public void user_click_on_selectIcon() throws Throwable
	 {
		 Object[] input7=new Object[1];
			input7[0]="//*[@id='MainContent_rptWorks_btnSelect_0']";
			 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on select icon to edit details",output.get("MESSAGE").toString());
	         Thread.sleep(2000);
	 }
	@When("user enter product discovery details :")
	public void user_enter_product_discovery_details(DataTable dataTable) throws Throwable {

	    Map<String, String> data = dataTable.asMap(String.class, String.class);

	    // Select Insurer
	    if (data.get("Select Insurer") != null) {
	        Itl.CustomDropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbInsurerName')]",
	            "(//*[@class='select2-search__field'])[1]",
	            data.get("Select Insurer"),
	            "(//*[contains(@data-select2-id,'MainContent_cmbInsurerName-result')])",
	            "user select Insurer",
	            "DROPDOWN",
	            0
	        );
	    }

	    // Policy Category
	    if (data.get("Policy Category") != null) {
	        Itl.CustomDropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbPolicyCategory')]",
	            "(//*[@class='select2-search__field'])[1]",
	            data.get("Policy Category"),
	            "(//*[contains(@data-select2-id,'MainContent_cmbPolicyCategory-result')])",
	            "user select Policy Category",
	            "DROPDOWN",
	            0
	        );
	    }

	    // Insurance Type
	    if (data.get("Insurance Type") != null) {
	        Itl.CustomDropdownEvent1(
	            "//*[contains(@aria-controls,'MainContent_cmbPopInsuranceType')]",
	            "(//*[@class='select2-search__field'])[1]",
	            data.get("Insurance Type"),
	            "(//*[contains(@data-select2-id,'MainContent_cmbPopInsuranceType-result')])",
	            "user select Insurance Type",
	            "DROPDOWN",
	            4000
	        );
	    }
	}
}
