package cucumberMap12Medical;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Medical {
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu1() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}

	@When("^user navigate on quotations menu$")
	public void user_navigate_on_quotations_menu1() throws InterruptedException {
		Object[] input8=new Object[1];
	    input8[0]="//*[@id='span_quotations_lc']";
	    SeleniumOperations.actionClass(input8);
	    Thread.sleep(2000);
	}

	@When("^user click on current quotations$")
	public void user_click_on_current_quotations1() throws InterruptedException {
		Object[] input9=new Object[1];
	    input9[0]="//*[@id='MNU_wfFIQNM']";
	    SeleniumOperations.clickOnElement(input9);
	    Thread.sleep(2000);
	}

	@When("^user click on add button$")
	public void user_click_on_add_button1() throws InterruptedException  {
		Object[] input10=new Object[1];
	    input10[0]="//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input10);
	    Thread.sleep(8000);
	}

	@When("^user select \"([^\"]*)\" as insurance type$")
	public void user_select_as_insurance_type1(String insuranceType) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbPopInsuranceType')]";
		input[1]="//*[@class='select2-search__field']";
		input[2]=insuranceType;
		input[3]="//*[contains(@id,'select2-MainContent_cmbPopInsuranceType-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as insurance type",output.get("MESSAGE").toString());
		Thread.sleep(5000);
	}

	@When("^user enter \"([^\"]*)\" as client name$")
	public void enterClientName1(String clientName) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtClientName']";
	    input[1]=clientName;
	    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Pravin Testing\" as client name",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	
	@When("^user select Pravin Testing as client name$")
	public void clickOnClientName() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_txtClientName']";
		Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Pravin Testing as client name",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}
	@When("^user click on update button$")
	 public void user_click_on_update_button1() throws Throwable
	 {
		 Object[] input7=new Object[1];
			input7[0]="//*[@id='btnSave']";
			 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button",output.get("MESSAGE").toString());
			 Thread.sleep(4000);
	 }
	@When("user click on update button to save policy information")
	 public void user_click_on_update_button_policyInformation1() throws Throwable
	 {
		 Object[] input7=new Object[1];
			input7[0]="//*[@id='btnInsert']";
			 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button to save policy information",output.get("MESSAGE").toString());
	     
	 }
	@When("user click on select icon to edit details")
	 public void user_click_on_selectIcon1() throws Throwable
	 {
		 Object[] input7=new Object[1];
			input7[0]="//*[@id='MainContent_rptMedical_btnSelect_0']";
			 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on select icon to edit details",output.get("MESSAGE").toString());
	         Thread.sleep(2000);
	 }
	@When("user clicks on edit option")
	public void user_clicks_on_edit_option1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[3]/*[2]/*[1]", "user clicks on edit option", "CLICK", 2000);
	}
	@When("user select {string} as client name")
	public void clickOnClientName1(String clientName) throws Throwable 
	{
		Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_txtClientName']";
		Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select "+clientName+" as client name",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	@When("^user click on Ok button to accept commission alert$")
	public void clickOnOKButton11() throws Throwable 
	{
		Hashtable<String,Object> output= SeleniumOperations.alert();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Ok button to accept commission alert",output.get("MESSAGE").toString());
	}

	@When ("^user select \"(.*)\" as insurer$")
	public void selectInsurer1(String insurer) throws Throwable 
	{
		Object[] input = new Object[4];
	    input[0] = "//*[contains(@aria-controls,'MainContent_cmbInsurer')]";
	    input[1] = "(//*[@class='select2-search__field'])[2]";
	    input[2] = insurer;
	    input[3] = "//*[contains(@id,'select2-MainContent_cmbInsurer-result-')]";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user Select \\\"(.*)\\\" as insurer",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When("^user enter \"([^\"]*)\" as date of birth$")
	public void enterDateOfBirth1(String dateOfBirth) throws Throwable {
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtDOBDate']";
	    input[1]=dateOfBirth;
	    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"01/01/2000\" as date of birth",output.get("MESSAGE").toString()); 
	    Thread.sleep(2000);
	}

	@When ("user select {string} as insurance class")
	public void user_select_as_insuranceClass1(String insuranceClass) throws InterruptedException {
		Object[] input = new Object[4];
	    input[0] = "//*[contains(@aria-controls,'MainContent_cmbInsuranceClass')]";
	    input[1] = "(//*[@class='select2-search__field'])[2]";
	    input[2] = insuranceClass;
	    input[3] = "//*[contains(@id,'select2-MainContent_cmbInsuranceClass-result-')]";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user Select \\\"([^\\\"]*)\\\" as insurance class",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When ("user select {string} as relationship")
	public void user_select_as_relationship1(String relationship) throws InterruptedException {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbRelationship')]", "(//*[@class='select2-search__field'])[2]", relationship , "//*[contains(@id,'select2-MainContent_cmbRelationship-result-')]", "user select {string} as relationship", "DROPDOWN", 2000);

	}
	
	
	@When("^user enter \"([^\"]*)\" as total premium$")
	public void enterTotalPremium1(String totalPremium) throws Throwable {
		Object[] input=new Object[2];
	    input[0]="//*[@id='txtTtlPremium']";
	    input[1]=totalPremium;
	    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"160000\" as total premium",output.get("MESSAGE").toString()); 
	    Thread.sleep(2000);
	}
	   
	@When("^user click on insert button$")
	public void clickOnInsertButton1() throws Throwable {
		Object[] input1=new Object[1];
		input1[0]="//*[@id='btnInsert']";
		SeleniumOperations.clickOnElement(input1);
		Thread.sleep(2000);
	   
		Object[] input=new Object[1];
	    input[0]="//*[@id='btnInsert']";
	    Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert button",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	    
	    Itl.CustomGstPercentValidation("//*[@id='MainContent_txtVATAmt']", "//*[@id='MainContent_txtTotalSum']", "//*[@id='MainContent_txtTotalGrpPremium']", "GSTVALIDATION", 0);

	    SeleniumOperations.scrollUp();
	}

	@When("^user click on addOn button$")
	public void clickOnAddon1() throws Throwable {
	    Object[] input=new Object[1];
	    input[0]="//*[text()='Add-ons']";
	    Hashtable<String,Object> output=  SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on addOn button",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as extension$")
	public void user_select_as_extension1(String extension) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbAddons')]";
		input[1]="(//*[@Class='select2-search__field'])[2]";
		input[2]=extension;
		input[3]="//*[contains(@id,'select2-MainContent_cmbAddons-result-')]";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as extension",output.get("MESSAGE").toString());
	}

	
	@When ("^user enter \"(.*)\" as rate%$")
	public void enterRate1(String rate) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='txtRateAddons']";
	    input[1]=rate;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"1.5\" as rate%",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as sum insured \\(AddOn\\)$")
	public void enterSumInsuredAddOn1(String sumInsuredAddOn) throws Throwable 
	{
	   Object[] input=new Object[2];
	   input[0]="//*[@id='txtSumInsuredAddons']";
	   input[1]=sumInsuredAddOn;
	   Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"200000\" as sum insured (AddOn)",output.get("MESSAGE").toString());
	}
	@When("^user enter \"([^\"]*)\" as description \\(AddOn\\)$")
	public void enterDescriptionAddon1(String description) throws Throwable {
		Object[] input =new Object[2];
		input[0]="//*[@id='MainContent_txtDescriptionAddons']";
		input[1]=description;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input); 
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Medical Quotation AddOn\" as description (AddOn)",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user click on insert button \\(AddOn\\)$")
	public void clickOnInsertButtonAddOn1() throws Throwable {
	    Object[] input=new Object[1];
	    input[0]="//*[@id='btnInsertAddons']";
	    Hashtable<String,Object> output=  SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert button (AddOn)",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When("user click on save button")
	public void user_click_on_save_button1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='btnSave']", "user click on save button", "CLICK", 3000);

	}
	
	@When("^user click on Ok button to accept commission alert message$")
	public void clickOnOKbuttonCommission1() throws Throwable {
        Hashtable<String,Object> output= SeleniumOperations.alert();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Ok button to accept commission rate alert message",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	
	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status1(String awaitingReceipt) throws Throwable {
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_repIQNM_lblStatus_0']";
	    input[1]=awaitingReceipt;
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \"Awaiting Receipt\" as status",output.get("MESSAGE").toString());  
	}
	
	@When ("^user click on business by dropdown$")
	public void clickOnBusinessDropdown1() throws InterruptedException{
		Object[] input50=new Object[1];
		input50[0]="//*[@class='select2-search-field']";
		Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on business by dropdown",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	} 
	
	@Then("^user select Demo User as business by$")
	public void user_enter_as_business_by1() throws Throwable {
	    Object[] input50=new Object[1];
		input50[0]="//*[@id='s2id_autogen28']";
	    Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as business by",output.get("MESSAGE").toString());  
	    Thread.sleep(2000);
	}

	@When("^user select on non-renewabale checkbox$")
	public void user_select_on_non_renewabale_checkbox1() throws Throwable {
	    Object[] input50=new Object[1];
		input50[0]="//*[@id='MainContent_chkNonRenewable']";
		Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select on non-renewabale checkbox",output50.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as contact person$")
	public void user_enter_as_contact_person1(String contactPerson) throws Throwable {
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtConPerson']";
	    input[1]=contactPerson;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as contact person",output.get("MESSAGE").toString());  
	    Thread.sleep(2000);   
	}

	@When("^user select on RI per class checkbox$")
	public void user_select_on_RI_per_class_checkbox1() throws Throwable {
	    Object[] input50=new Object[1];
		input50[0]="//*[@id='MainContent_chkRIClass']";
		Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select on RI per class checkbox",output50.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user Select on first loss payee checkbox$")
	public void user_Select_on_first_loss_payee_checkbox1() throws Throwable {
	    Object[] input50=new Object[1];
		input50[0]="//*[@id='MainContent_chkFirstLossVaidate']";
		Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user Select on first loss payee checkbox",output50.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as first loss payee$")
	public void user_enter_as_first_loss_payee1(String firstLossPayee) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtFirstLoss']";
	    input[1]=firstLossPayee;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as first loss payee",output.get("MESSAGE").toString());  
	}

	@When("^user select on borrower type check box$")
	public void user_select_on_borrower_type_check_box1() throws Throwable {
	    Object[] input50=new Object[1];
		input50[0]="//*[@id='MainContent_chkBorrower']";
		Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select on borrower type check box",output50.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user click on borrower type dropdown$")
	public void user_click_on_borrower_type_dropdown1() throws Throwable {
	   
		Object[] input50=new Object[1];
		   input50[0]="//*[contains(@aria-controls,'MainContent_cmbBorrower')]";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on borrower type dropdown",output50.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as borrower type$")
	public void user_enter_as_borrower_type1(String borrowerType) throws Throwable {
	  
		Object[] input=new Object[2];
	    input[0]="(//*[@Class='select2-search__field'])[2]";
	    input[1]=borrowerType;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as borrower type",output.get("MESSAGE").toString());  
	
	}

	@Then("^user select Retail Banking as borrower type$")
	public void user_select_Retail_Banking_as_borrower_type1() throws Throwable {
	   
		Object[] input50=new Object[1];
		   input50[0]="(//*[contains(@data-select2-id,'MainContent_cmbBorrower-result')])";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select Retail Banking as borrower type",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user click on loss ratio forecast dropdown$")
	public void user_click_on_loss_ratio_forecast_dropdown1() throws Throwable {
	 
		Object[] input50=new Object[1];
		   input50[0]="//*[contains(@aria-controls,'MainContent_cmbLRF')]";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on loss ratio forecast dropdown",output50.get("MESSAGE").toString());
	
	}

	@When("^user enter \"([^\"]*)\" as loss ratio forecast$")
	public void user_enter_as_loss_ratio_forecast1(String lossRatioForecast) throws Throwable {
	   
		Object[] input=new Object[2];
	    input[0]="(//*[@Class='select2-search__field'])[2]";
	    input[1]=lossRatioForecast;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as loss ratio forecast",output.get("MESSAGE").toString());  
	}

	@Then("^user select Profit making as loss ratio forecast$")
	public void user_select_Profit_making_as_loss_ratio_forecast1() throws Throwable {
	   
		Object[] input50=new Object[1];
		   input50[0]="(//*[contains(@data-select2-id,'MainContent_cmbLRF-result')])";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select Profit making as loss ratio forecast",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as covering details$")
	public void user_enter_as_covering_details1(String coveringDetails) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtCovering']";
	    input[1]=coveringDetails;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as covering details",output.get("MESSAGE").toString());  
	}

	@When("^user enter \"([^\"]*)\" as description of risk$")
	public void user_enter_as_description_of_risk1(String descriptionOfRisk) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtDescRisk']";
	    input[1]=descriptionOfRisk;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as description of risk",output.get("MESSAGE").toString());  
	}

    @When("^user enter \"([^\"]*)\" as commission rate%$")
	public void user_enter_as_commission_rate1(String commissionRate) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='txtCommissionRateAddons']";
	    input[1]=commissionRate;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as commission rate%",output.get("MESSAGE").toString());  
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as other fee$")
	public void user_enter_as_other_fee1(String otherFee) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtOtherFee']";
	    input[1]=otherFee;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as other fee",output.get("MESSAGE").toString());  
    }

	@When("^user enter \"([^\"]*)\" as discount on commission %$")
	public void user_enter_as_discount_on_commission1(String discountOnCommission) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtDiscountCommRate']";
	    input[1]=discountOnCommission;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as discount on commission %",output.get("MESSAGE").toString());  
    }
	
	@When("^user enter \"([^\"]*)\" as cover note number$")
	public void enterCoverNote1(String coverNote) throws Throwable{
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtGridICN']";
	    input[1]=coverNote;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"123459876501234\" as cover note number",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
    @When("^user select \"([^\"]*)\" as ID type$")
	public void user_enter_as_ID_type1(String idType) throws Throwable {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbaIDType')]", "(//*[@Class='select2-search__field'])[2]", idType , "(//*[contains(@data-select2-id,'MainContent_cmbaIDType-result')])", "user select \\\"([^\\\"]*)\\\" as ID type", "DROPDOWN", 3000);

	}

	@When("^user enter \"([^\"]*)\" as ID number$")
	public void user_enter_as_ID_number1(String idNumber) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='txtIdNb']";
	    input[1]=idNumber;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as ID number",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

		
	@When("^user enter \"([^\"]*)\" as sum assured$")
	public void user_enter_as_sum_assured1(String sumAssured) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='txtSumInsured']";
		input50[1]=sumAssured;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as sum assured",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as pre existing condition$")
	public void user_enter_as_pre_existing_condition1(String preExistingCondition) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtPreExisting']";
		input50[1]=preExistingCondition;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as pre existing condition",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as inpatient limit$")
	public void user_enter_as_inpatient_limit1(String inpatientLimit) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtInpatientLimit']";
		input50[1]=inpatientLimit;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as inpatient limit",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as inpatient premium$")
	public void user_enter_as_inpatient_premium1(String inpatientPremium) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtInpatientPrem']";
		input50[1]=inpatientPremium;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as inpatient premium",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as outpatient limit$")
	public void user_enter_as_outpatient_limit1(String outpatientLimit) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtOutpatientLimit']";
		input50[1]=outpatientLimit;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as outpatient limit",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as outpatient premium$")
	public void user_enter_as_outpatient_premium1(String outpatientPremium) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtOutpatientPrem']";
		input50[1]=outpatientPremium;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as outpatient premium",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as last expense limit$")
	public void user_enter_as_last_expense_limit1(String expenseLimit) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtLastExpenseLimit']";
		input50[1]=expenseLimit;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as last expense limit",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as last expense premium$")
	public void user_enter_as_last_expense_premium1(String expensePremium) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtLastExpensePrem']";
		input50[1]=expensePremium;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as last expense premium",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as personal accident limit$")
	public void user_enter_as_personal_accident_limit1(String accidentLimit) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtPersonalAccidentLimit']";
		input50[1]=accidentLimit;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as personal accident limit",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as personal accident premium$")
	public void user_enter_as_personal_accident_premium1(String accidentPremium) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtPersonalAccidentPrem']";
		input50[1]=accidentPremium;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as personal accident premium",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as dental limit$")
	public void user_enter_as_dental_limit1(String dentalLimit) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtDentalLimit']";
		input50[1]=dentalLimit;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as dental limit",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as dental premium$")
	public void user_enter_as_dental_premium1(String dentalPremium) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtDentalPrem']";
		input50[1]=dentalPremium;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as dental premium",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as optical limit$")
	public void user_enter_as_optical_limit1(String opticalLimit) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtOpticalLimit']";
		input50[1]=opticalLimit;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as optical limit",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as optical premium$")
	public void user_enter_as_optical_premium1(String opticalPremium) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtOpticalPrem']";
		input50[1]=opticalPremium;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as optical premium",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
    }

	@When("^user enter \"([^\"]*)\" as maternity limit$")
	public void user_enter_as_maternity_limit1(String maternityLimit) throws Throwable {
	    Object[] input50=new Object[2];
		input50[0]="//*[@id='MainContent_txtMaternityLimit']";
		input50[1]=maternityLimit;
		Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as maternity limit",output50.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	@When("^user click on extension dropdown$")
	public void clickOnExtensionDropdown1()
	{
		Object[] input11=new Object[1];
		input11[0]="//*[contains(@aria-controls,'MainContent_cmbAddons')]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on extension dropdown",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as extension$")
	public void enterExtension1(String extension)
	{
		Object[] input=new Object[2];
	    input[0]="//*[@class='select2-search__field']";
	    input[1]=extension;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"All Risk Cover\" as extension",output.get("MESSAGE").toString());
	}

	@When("^user select on All Risk Cover as extension$")
	public void selectExtension1() throws Throwable 
	{
	   Object[] input=new Object[1];
	   input[0]="//*[contains(@id,'select2-MainContent_cmbAddons-result-')]";
	   Hashtable<String,Object> output=  SeleniumOperations.clickOnElement(input);
	   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select on All Risk Cover as extension",output.get("MESSAGE").toString());
	}
	
	@When("^user select \"([^\"]*)\" as from date$")
	 public void user_select_as_date_from1(String dateFrom) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtSrchFromDate']";
		 input[1]=dateFrom;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \"01/01/2023\" as from date",output.get("MESSAGE").toString());
		 Thread.sleep(4000);
	 }
	
	@When("user enter {string} as Insurance Type")
	public void user_enter_as_insuranceType1(String insuranceType) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtInsuranceType']", insuranceType, "user enter {string} as Insurance Type", "TEXTBOX", 0);
	    Itl.CustomClearEvent("//*[@id='MainContent_txtUserId']", "CLEAR", 0);
	}
	
	@When ("user click on search button to find {string} quote")
	 public void user_click_on_search_button_quoteNo1(String quoteName) throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='button_btnSearch_lc']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(5000);
		 SeleniumOperations.getQuote(quoteName);
		 Thread.sleep(4000);
	 }
	
	@When ("user enter quote number to search {string} quote")
	public void user_enter_as_quote_number1(String quoteName) throws InterruptedException {
		String quoteNo = SeleniumOperations.getQuote(quoteName);
		Itl.CustomSendEvent("//*[@id='MainContent_txtSrchQuote']", quoteNo, "user enter {string} as quote number", "TEXTBOX", 1000);
		Thread.sleep(4000);
	}
	
	@When ("user click on search button")
	 public void user_click_on_search_button_quoteNo1() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='button_btnSearch_lc']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	
	@When("user clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[3]", "user clicks on the actions dropdown", "CLICK", 2000);

	}
	@When("user clicks on print quotation option")
	public void user_clicks_on_print_quotation_option1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[3]/*[2]/*[3]", "user clicks on print quotation option", "CLICK", 2000);

	}
	@When("the quote should include all relevant details like")
	public void the_quote_should_include_all_relevant_details1(DataTable dataTable) throws IOException, InterruptedException {
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
	@When ("user enter {string} as borrower account name")
	public void user_enter_as_borrower_account_name1(String borrowerName) throws InterruptedException {
		Itl.CustomSendEvent("//*[@id='MainContent_txtBorrowerAccName']", borrowerName, "user enter {string} as borrower account name", "TEXTBOX", 0);
	}
	@When ("user enter {string} as borrower account number")
	public void user_enter_as_borrower_account_number1(String borrowerNumber) throws InterruptedException {
		Itl.CustomSendEvent("//*[@id='MainContent_txtBorrowerAccNum']", borrowerNumber, "user enter {string} as borrower account number", "TEXTBOX", 0);
	}
	@Then ("user able to view {string} message")
	public void validation(String validation) throws InterruptedException{
		Object[] input=new Object[2];
		input[0]="//*[text()='1003-Information modified successfully']";
		input[1]=validation;
		Hashtable<String,Object> output=SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view {string} message",output.get("MESSAGE").toString());
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
