package cucumberMap1MoneyInsuranceCover;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class MoneyInsuranceCoverQuotation 
{   
	
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() 
	{
		Object[] input7=new Object[1];
	input7[0]="//*[@id='MOD_OPERATIONS']";
	SeleniumOperations.actionClass(input7);
	   
	}

	@When("^user navigate on quotations menu$")
	public void user_navigate_on_quotations_menu() 
	{
		Object[] input8=new Object[1];
	input8[0]="(//*[text()='Quotations '])[1]";
	SeleniumOperations.actionClass(input8);
	   
	}

	@When("^user click on current quotations$")
	public void user_click_on_current_quotations() 
	{Object[] input9=new Object[1];
	input9[0]="(//*[text()='Current Quotations'])[1]";
	SeleniumOperations.clickOnElement(input9);
	    
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws InterruptedException  
	{Object[] input10=new Object[1];
	input10[0]="//*[@class='bold'][text()='Add']";
	SeleniumOperations.clickOnElement(input10);
	Thread.sleep(4000);
	    
	}

	@When("^user click on select insurance type dropdown$")
	public void user_click_on_select_insurance_type_dropdown() throws InterruptedException  
	{    
		
		Object[] input11=new Object[1];
		input11[0]="(//*[text()='Select Insurance Type'])[1]";
		SeleniumOperations.clickOnElement(input11);  
		Thread.sleep(4000);
	    
	}

	@When("^user enter \"([^\"]*)\" to search insurance type in search box$")
	public void user_enter_to_search_insurance_type_in_search_box(String insuranceType) throws InterruptedException 
	{Object[] input12=new Object[2];
	input12[0]="//*[@class='select2-input select2-focused']";
	input12[1]=insuranceType;
	SeleniumOperations.sendKeys(input12);
	Thread.sleep(2000);
	    
	}

	@When("^user select money insurance cover as insurance type from dropdown$")
	public void user_select_money_insurance_cover_as_insurance_type_from_dropdown() 
	{Object[] input13=new Object[1];
	input13[0]="//*[@class='select2-result-label']";
	SeleniumOperations.clickOnElement(input13);
	    
	}
	
	@When("^user enter \"([^\"]*)\" as client name in quotation$")
	public static void enterClientName(String name) throws InterruptedException  
	{
		Thread.sleep(3000);
		Object[] input50=new Object[2];
		input50[0]="//*[@name='ctl00$MainContent$txtClientName']";
		input50[1]=name;
		Hashtable<String, Object> output50 = SeleniumOperations.sendKeys(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \"Pravin Testing\" as client name in quotation",output50.get("MESSAGE").toString());
		
	}

	@When("^user select client name as Pravin Testing$")
	public static void selectClientName() throws InterruptedException
	{
		Thread.sleep(6000);
		Object[] input50=new Object[2];
		input50[0]="//*[@name='ctl00$MainContent$txtClientName']";
		Hashtable<String, Object> output50 =SeleniumOperations.actionDownEnter();
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select client name as Pravin Testing",output50.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}
	
	@When("^user click on insurer dropdown$")
	public void clickOnInsurer() throws Throwable 
	{
		Object[] input50=new Object[1];
		input50[0]="(//*[@class='select2-chosen'])[1]";
		             
		Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on insurer dropdown",output50.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as insurer name$")
	public void enterInsurer(String insurerName) throws Throwable 
	{
	   Object[] input50=new Object[2];
	   input50[0]="//*[@class='select2-input select2-focused']";
	   input50[1]=insurerName;
	   Hashtable<String, Object> output50 = SeleniumOperations.sendKeys(input50);
	   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \"Alliance Insurance Company (T) Ltd.\" as insurer name",output50.get("MESSAGE").toString());
	   Thread.sleep(2000);
		
	}

	@When("^user click to select Alliance Insurance Company \\(T\\) Ltd\\.as insurer name$")
	public void clickToInsurer() throws Throwable
	{
		   Object[] input50=new Object[1];
		   input50[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click to select Alliance Insurance Company (T) Ltd.as insurer name",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}


	

	@When("^user click on insurance class dropdown$")
	public void clickOnInsurance() throws Throwable 
	{
		
		Object[] input51=new Object[1];
		   input51[0]="(//*[@class='select2-chosen'])[14]";
		  SeleniumOperations.clickOnElement(input51);
		   Object[] input50=new Object[1];
		   input50[0]="(//*[@class='select2-chosen'])[14]";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on insurance class dropdown",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}
	
	@When("^user click on insurance class dropdown2$")
	public void clickOnInsurance1() throws Throwable 
	{
		   Object[] input50=new Object[1];
		   input50[0]="(//*[@class='select2-chosen'])[14]";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on insurance class dropdown",output50.get("MESSAGE").toString());
		   Object[] input51=new Object[1];
		   input51[0]="(//*[@class='select2-chosen'])[14]";
		  SeleniumOperations.clickOnElement(input51);
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as insurance class$")
	public void enterInsuranceClass(String name) throws Throwable 
	{
		Object[] input50=new Object[2];
		   input50[0]="//*[@class='select2-input select2-focused']";
		   input50[1]=name;
		   Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \"Standard Rate\" as insurance class",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user click to select standard rate as insurance class$")
	public void clickToSelect() throws Throwable 
	{
		   Object[] input50=new Object[1];
		   input50[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click to select standard rate as insurance class",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}
	
	@When ("^user click to select Annual Cash Carrying as insurance class$")
	public void clickToSelectannual() throws Throwable 
	{
		   Object[] input50=new Object[1];
		   input50[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click to select Annual Cash Carrying as insurance class",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}
	@When("^user enter \"([^\"]*)\" as sum insured amount in policy information$")
	public void enterSumInsured(String amount) throws Throwable 
	{
		   Object[] input50=new Object[2];
		   input50[0]="//*[@id='txtSumInsured']";
		   input50[1]=amount;
		   Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \"100000\" as sum insured amount in policy information",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as branch name$")
	public void user_enter_as_branch_name(String branchName) throws Throwable {
	    
		Object[] input=new Object[2];
	    input[0]="//*[@id='txtBranchname']";
	    input[1]=branchName;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as branch name",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	@When("^user enter \"([^\"]*)\" as description in policy information$")
	public void enterDescription(String note) throws Throwable 
	{
		  Object[] input50=new Object[2];
		   input50[0]="//*[@id='MainContent_txtDescription']";
		   input50[1]=note;
		   Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \"Money Insurance Cover Testing\" as description in policy information",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user click on compute button$")
	public void clickCompute() throws Throwable 
	{
		  Object[] input50=new Object[1];
		   input50[0]="//*[@id='btnCompute']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on compute button",output50.get("MESSAGE").toString());
		   Thread.sleep(5000);
	
	}

	
	
	@When("^user click on insert button$")
	public void clickOnInsert() throws Throwable 
	{
		   Object[] input50=new Object[1];
		   input50[0]="//*[@id='btnInsert']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on insert button",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	   
	}

	@Then("^user click on addOn button to enter addOn details$")
	public void clickAddOn() throws Throwable 
	{
		   Object[] input50=new Object[1];
		   input50[0]="//*[text()='Add-ons']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on addOn button to enter addOn details",output50.get("MESSAGE").toString());
		   Thread.sleep(3000);
	    
	}

	@When("^user click on extension dropdown$")
	public void clickOnDropdown() throws Throwable 
	{
		 Object[] input50=new Object[1];
		   input50[0]="(//*[@class='select2-chosen'])[15]";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on extension dropdown",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as extension$")
	public void enterExtension(String exten) throws Throwable 
	{
		 Object[] input50=new Object[2];
		   input50[0]="(//*[@class='select2-input select2-focused'])";
		   input50[1]=exten;
		   Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \"All Risk Cover\" as extension",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user click to select All Risk Cover as extension$")
	public void clickOn() throws Throwable 
	{
		Object[] input50=new Object[1];
		   input50[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click to select All Risk Cover as extension",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}
	
	@When ("^user click to select Others as extension$")
	public void clickOn1() throws Throwable 
	{
		Object[] input50=new Object[1];
		   input50[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click to select Others as extension",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as sum insured amount in addOn$")
	public void addonAmount (String amount) throws Throwable
	{
		Object[] input50=new Object[2];
		   input50[0]="//*[@id='txtSumInsuredAddons']";
		   input50[1]=amount;
		   Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \"100000\" as sum insured amount in addOn",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
		
		
	}
	
	
	@When("^user enter \"([^\"]*)\" as rate%$")
	public void enterRate(String rate) throws Throwable 
	{
		Object[] input50=new Object[2];
		   input50[0]="//*[@id='txtRateAddons']";
		   input50[1]=rate;
		   Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \"10\" as rate%",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as description in addOn$")
	public void enterDescription1(String note) throws Throwable 
	{
		 Object[] input50=new Object[2];
		   input50[0]="//*[@id='MainContent_txtDescriptionAddons']";
		   input50[1]=note;
		   Hashtable<String, Object> output50 =SeleniumOperations.sendKeys(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user enter \"Money Insurance Cover Testing \" as description in addOn",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}
	
	@When ("^user click on insert button addon$")
	public void clickInsert1() throws InterruptedException
	{
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='btnInsertAddons']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on insert button addon",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}
	
	@When("^user click on save button$")
	public void clickOnSave() throws Throwable 
	{
		Object[] input51=new Object[1];
		   input51[0]="//*[@id='btnSave']";
		 SeleniumOperations.clickOnElement(input51);
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='btnSave']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on save button",output50.get("MESSAGE").toString());
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
	
	@When ("^user click on business by dropdown$")
	public void clickOnBusinessDropdown() throws InterruptedException
	{
		Object[] input50=new Object[1];
		   input50[0]="//*[@class='select2-search-field']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on business by dropdown",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	} 
	
	@Then("^user select Demo User as business by$")
	public void user_enter_as_business_by() throws Throwable {
	   
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='s2id_autogen28']";
	    Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as business by",output.get("MESSAGE").toString());  
	Thread.sleep(2000);
	}



	@When("^user enter \"([^\"]*)\" as unique property identification$")
	public void user_enter_as_unique_property_identification(String uniqueProperty) throws Throwable {
	   
		
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='MainContent_txtUniquePropertyIdenty']";
		  SeleniumOperations.clickOnElement(input50);
		  Thread.sleep(2000);
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtUniquePropertyIdenty']";
	    input[1]=uniqueProperty;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as unique property identification",output.get("MESSAGE").toString());  
	Thread.sleep(2000);
	}

	@When("^user select on non-renewabale checkbox$")
	public void user_select_on_non_renewabale_checkbox() throws Throwable {
	    
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='MainContent_chkNonRenewable']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select on non-renewabale checkbox",output50.get("MESSAGE").toString());
	       Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as contact person$")
	public void user_enter_as_contact_person(String contactPerson) throws Throwable {
		
	 Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtConPerson']";
	    input[1]=contactPerson;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as contact person",output.get("MESSAGE").toString());  
	    Thread.sleep(2000);   
	}

	@When("^user select on RI per class checkbox$")
	public void user_select_on_RI_per_class_checkbox() throws Throwable {
	 
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='MainContent_chkRIClass']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select on RI per class checkbox",output50.get("MESSAGE").toString());
	       Thread.sleep(2000);
	}

	@When("^user select on limit of liability amount checkbox$")
	public void user_select_on_limit_of_liability_amount_checkbox() throws Throwable {
	    
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='MainContent_chkHighSuminsured']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select on limit of liability amount checkbox",output50.get("MESSAGE").toString());
	       Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as limit of liability amount$")
	public void user_enter_as_limit_of_liability_amount(String limitLiability) throws Throwable {
	    
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtLOLAmount']";
	    input[1]=limitLiability;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as limit of liability amount",output.get("MESSAGE").toString());  
	}

	@When("^user Select on first loss payee checkbox$")
	public void user_Select_on_first_loss_payee_checkbox() throws Throwable {
	    
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='MainContent_chkFirstLossVaidate']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user Select on first loss payee checkbox",output50.get("MESSAGE").toString());
	       Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as first loss payee$")
	public void user_enter_as_first_loss_payee(String firstLossPayee) throws Throwable {
	   
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtFirstLoss']";
	    input[1]=firstLossPayee;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as first loss payee",output.get("MESSAGE").toString());  
	}

	@When("^user select on borrower type check box$")
	public void user_select_on_borrower_type_check_box() throws Throwable {
	   
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='MainContent_chkBorrower']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select on borrower type check box",output50.get("MESSAGE").toString());
	       Thread.sleep(2000);
	}

	@When("^user click on borrower type dropdown$")
	public void user_click_on_borrower_type_dropdown() throws Throwable {
	   
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='s2id_MainContent_cmbBorrower']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on borrower type dropdown",output50.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as borrower type$")
	public void user_enter_as_borrower_type(String borrowerType) throws Throwable {
	  
		Object[] input=new Object[2];
	    input[0]="(//*[@class='select2-input select2-focused'])";
	    input[1]=borrowerType;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as borrower type",output.get("MESSAGE").toString());  
	
	}

	@Then("^user select Retail Banking as borrower type$")
	public void user_select_Retail_Banking_as_borrower_type() throws Throwable {
	   
		Object[] input50=new Object[1];
		   input50[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select Retail Banking as borrower type",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as cover note number$")
	public void user_enter_as_cover_note_number(String coverNoteNumber) throws Throwable {
	   
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtGridICN']";
	    input[1]=coverNoteNumber;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as cover note number",output.get("MESSAGE").toString());  
	
	
	}

	@When("^user click on loss ratio forecast dropdown$")
	public void user_click_on_loss_ratio_forecast_dropdown() throws Throwable {
	 
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='s2id_MainContent_cmbLRF']";
		   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on loss ratio forecast dropdown",output50.get("MESSAGE").toString());
	
	}

	@When("^user enter \"([^\"]*)\" as loss ratio forecast$")
	public void user_enter_as_loss_ratio_forecast(String lossRatioForecast) throws Throwable {
	   
		Object[] input=new Object[2];
	    input[0]="(//*[@class='select2-input select2-focused'])";
	    input[1]=lossRatioForecast;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as loss ratio forecast",output.get("MESSAGE").toString());  
	}

	@Then("^user select Profit making as loss ratio forecast$")
	public void user_select_Profit_making_as_loss_ratio_forecast() throws Throwable {
	   
		Object[] input50=new Object[1];
		   input50[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select Profit making as loss ratio forecast",output50.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as covering details$")
	public void user_enter_as_covering_details(String coveringDetails) throws Throwable {
	   
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtCovering']";
	    input[1]=coveringDetails;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as covering details",output.get("MESSAGE").toString());  
	
	}

	@When("^user enter \"([^\"]*)\" as description of risk$")
	public void user_enter_as_description_of_risk(String descriptionOfRisk) throws Throwable {
	  
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtDescRisk']";
	    input[1]=descriptionOfRisk;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as description of risk",output.get("MESSAGE").toString());  
	
	    
	}
	
	

	@When("^user enter \"([^\"]*)\" as override%$")
	public void user_enter_as_override(String override) throws Throwable {
	   
		Object[] input=new Object[2];
	    input[0]="//*[@id='txtOverride']";
	    input[1]=override;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as override%",output.get("MESSAGE").toString());  
	
	}

	@When("^user enter \"([^\"]*)\" as adjust premium$")
	public void user_enter_as_adjust_premium(String adjustPremium) throws Throwable {
	    
		Object[] input=new Object[2];
	    input[0]="//*[@id='txtAddPremium']";
	    input[1]=adjustPremium;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as adjust premium",output.get("MESSAGE").toString());  
	}

	@When("^user enter \"([^\"]*)\" as commission rate%$")
	public void user_enter_as_commission_rate(String commissionRate) throws Throwable {
	   
		Object[] input=new Object[2];
	    input[0]="//*[@id='txtCommissionRateAddons']";
	    input[1]=commissionRate;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as commission rate%",output.get("MESSAGE").toString());  
	Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as other fee$")
	public void user_enter_as_other_fee(String otherFee) throws Throwable {
	   
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtOtherFee']";
	    input[1]=otherFee;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as other fee",output.get("MESSAGE").toString());  
	
	
	}

	@When("^user enter \"([^\"]*)\" as discount on commission %$")
	public void user_enter_as_discount_on_commission(String discountOnCommission) throws Throwable {
	    
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtDiscountCommRate']";
	    input[1]=discountOnCommission;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as discount on commission %",output.get("MESSAGE").toString());  
	    Thread.sleep(2000);
	}

	@Then("^user click on Re-Compute premium$")
	public void user_click_on_Re_Compute_premium() throws Throwable {
	   
		Object[] input50=new Object[1];
		   input50[0]="//*[@id='btnReCompute']";
		   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
		   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on Re-Compute premium",output50.get("MESSAGE").toString());
		   Thread.sleep(4000);
		   
		
	}

	

	
}
