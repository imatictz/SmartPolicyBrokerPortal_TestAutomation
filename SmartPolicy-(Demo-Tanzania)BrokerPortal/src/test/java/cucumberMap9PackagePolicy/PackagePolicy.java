package cucumberMap9PackagePolicy;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class PackagePolicy 
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
		{
			Object[] input9=new Object[1];
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

		@When ("user select {string} as insurance class")
		public void user_select_as_insuranceClass(String insuranceClass) {
		    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbFltClassType']", "//*[@class='select2-input select2-focused']", insuranceClass , "//*[@class='select2-match']", "user select {String} as insurance class", "DROPDOWN", 2000);

		}
		@When("^user click on select insurance type dropdown$")
		public void user_click_on_select_insurance_type_dropdown() throws InterruptedException  
		{    
			
			Object[] input11=new Object[1];
			input11[0]="(//*[text()='Select Insurance Type'])[1]";
			SeleniumOperations.clickOnElement(input11);  
			Thread.sleep(3000);
		    
		}

		@When("^user enter \"([^\"]*)\" to search insurance type in search box$")
		public void enterInsuranceType(String insuranceType) throws Throwable 
		{
		    Object[] input=new Object[2];
		    input[0]="//*[@class='select2-input select2-focused']";
		    input[1]=insuranceType;
		    SeleniumOperations.sendKeys(input);
		    Thread.sleep(2000);
		}
		
		@When ("^user select Package Policy as insurance type from dropdown$")
		public void selectInsuranceTypeResult() throws Throwable 
		{
		  
			SeleniumOperations.actionDownEnter();
			Thread.sleep(5000);
		}

		@When("^user enter \"([^\"]*)\" as client name$")
		public void enterClientName(String clientName) throws Throwable 
		{
		   Object[] input=new Object[2];
		   input[0]="//*[@id='MainContent_txtClientName']";
		   input[1]=clientName;
		   Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Pravin Testing\" as client name",output.get("MESSAGE").toString());
		   Thread.sleep(5000);
		}

		@When("^user select Pravin Testing as client name$")
		public void clickOnClientName() throws Throwable 
		{
			//Object[] input=new Object[1];
			//input[0]="//*[@id='MainContent_txtClientName']";
			Hashtable<String,Object> output1= SeleniumOperations.actionDownEnter();
			HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"user select Pravin Testing as client name",output1.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user click on insurer dropdown$")  
		public void clickOnInsurerDropdown() throws Throwable 
		{
		   Object[] input=new Object[1];
		   input[0]="(//*[@class='select2-chosen'])[1]";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insurer dropdown",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
		}

		@When("^user enter \"([^\"]*)\" as insurer$")
		public void enterInsurer(String insurer) throws Throwable 
		{
		    Object[] input=new Object[2];
		    input[0]="//*[@class='select2-input select2-focused']";
		    input[1]=insurer;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Alliance Insurance Company (T) Ltd.\" as insurer",output.get("MESSAGE").toString());
		}

		@When("^user select Alliance Insurance Company \\(T\\) Ltd\\. as insurer$")
		public void selectInsurer() throws Throwable 
		{
		   Object[]input=new Object[1];
		   input[0]="//*[@class='select2-match']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Alliance Insurance Company (T) Ltd. as insurer",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
		}
		
		@When ("user select {string} as insurance type")
		public void user_select_as_insuranceType(String insuranceType) {
		    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbInsuranceType']", "//*[@class='select2-input select2-focused']", insuranceType , "//*[@class='select2-match']", "user select {String} as insurance type", "DROPDOWN", 2000);

		}
		
		@When("^user enter \"([^\"]*)\" as insured name$")
		public void enterInsuredName(String insuredName) throws Throwable
		{
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtInsuredNameVehicle']";
		    input[1]=insuredName;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \" Pravin Testing\" as insured name",output.get("MESSAGE").toString());   
		    Thread.sleep(2000);
		}

		
		
		@When("^user enter \"([^\"]*)\" as registration number$")
		public void enterRegistrationNumber(String registrationNumber) throws Throwable 
		{
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtFltRegno']";
		    input[1]=registrationNumber;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"15641A56BIKE\" as registration number",output.get("MESSAGE").toString());   
		}

		@When("^user enter \"([^\"]*)\" as vehicle make$")
		public void enterVehicleMake(String vehicleMake) throws Throwable 
		{
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtFltMake']";
		    input[1]=vehicleMake;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"TVS\" as vehicle make",output.get("MESSAGE").toString());   
		}

		@When ("^user select TVS as vehicle make$")
		public void selectVehicleMakeResult() throws Throwable 
		{
		    Hashtable<String,Object> output = SeleniumOperations.actionDownEnter();
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select TVS as vehicle make",output.get("MESSAGE").toString());
		}

		@When("^user enter \"([^\"]*)\" as vehicle model$")
		public void enterVehicleMode(String vehicleModel) throws Throwable 
		{
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtFltModel']";
		    input[1]=vehicleModel;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"SCOOTY\" as vehicle model",output.get("MESSAGE").toString());   
		Thread.sleep(2000);
		}

		@When ("user select {string} as vehicle type")
		public void user_select_as_vehicleType(String vehicleType) {
		    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbFltType']", "//*[@class='select2-input select2-focused']", vehicleType , "//*[@class='select2-match']", "user select {string} as vehicle type", "DROPDOWN", 2000);

		}
		

		@When("^user enter \"([^\"]*)\" as manufacture year$")
		public void enterManufactureYear(String manufactureYear) throws Throwable 
		{
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtFltYear']";
		    input[1]=manufactureYear;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"2015\" as manufacture year",output.get("MESSAGE").toString());   
		}

		@When("^user enter \"([^\"]*)\" as color$")
		public void enterColor(String color) throws Throwable 
		{
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtColor']";
		    input[1]=color;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"WHITE\" as color",output.get("MESSAGE").toString());     
		}

		@When("^user enter \"([^\"]*)\" as sum insured$")
		public void enterSumInsured(String sumInsured) throws Throwable 
		{
			Object[] input=new Object[2];
		    input[0]="//*[@ID='txtFltSumInsured']";
		    input[1]=sumInsured;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"1200000\" as sum insured",output.get("MESSAGE").toString());      
		}

		@When ("^user click on compute button$")
		public void clickOnComputeButton() throws Throwable
		{
			Object[]input=new Object[1];
			   input[0]="//*[@id='btnVehicleCompute']";
			   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
			   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on compute button",output.get("MESSAGE").toString());   
			   Thread.sleep(2000);
		}

		@When("^user click on insert button$")
		public void clickOnInsertButton() throws Throwable 
		{
			Object[]input=new Object[1];
			   input[0]="//*[@id='btnVehicleInsert']";
			   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
			   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert button",output.get("MESSAGE").toString());   
			   Thread.sleep(2000);
		}

		@When("^user scroll up to click on addOn button$")
		public void scrollUp() throws Throwable
		{
		    Hashtable<String,Object> output=SeleniumOperations.scrollUp450();
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user scroll up to click on addOn button",output.get("MESSAGE").toString());
		    Thread.sleep(2000);
		}

		@When("^user click on addOn button$")
		public void clickOnAddon() throws Throwable 
		{
		    Object[] input=new Object[1];
		    input[0]="//*[@id='li2']";
		    Hashtable<String,Object> output=  SeleniumOperations.clickOnElement(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on addOn button",output.get("MESSAGE").toString());
		    Thread.sleep(2000);
		}

		@When("^user click on extension dropdown$")
		public void clickOnExtensionDropdown() throws Throwable 
		{
			
		   Object[] input=new Object[1];
		   input[0]="//*[@id='s2id_MainContent_cmbAddons']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on extension dropdown",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
		   Object[] input1=new Object[1];
		   input1[0]="//*[@id='s2id_MainContent_cmbAddons']";
		  SeleniumOperations.clickOnElement(input1);
		  Thread.sleep(2000);
		}

		@When("^user enter \"([^\"]*)\" as extension$")
		public void enterExtension(String extension) throws Throwable
		{
		    Object[] input=new Object[2];
		    input[0]="//*[@class='select2-input select2-focused']";
		    input[1]=extension;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Terrorism\" as extension",output.get("MESSAGE").toString());
	         Thread.sleep(2000);
		}
		

		@When("^user select Terrorism as extension$")
		public void selectExtension() throws Throwable 
		{
		   Object[] input=new Object[1];
		   input[0]="//*[@class='select2-match']";
		   Hashtable<String,Object> output=  SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select on Terrorism as extension",output.get("MESSAGE").toString());
		Thread.sleep(2000);
		}
		
		
		@When("^user enter \"([^\"]*)\" as sum insured \\(AddOn\\)$")
		public void enterSumInsuredAddOn(String sumInsuredAddOn) throws Throwable 
		{
		   Object[] input=new Object[2];
		   input[0]="//*[@id='txtSumInsuredAddons']";
		   input[1]=sumInsuredAddOn;
		   Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"720000\" as sum insured (AddOn)",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
		}

		
		@When ("^user enter \"(.*)\" as rate %$")
		public void enterRate(String rate) throws Throwable 
		{
		   Object[] input=new Object[2];
		   input[0]="//*[@id='txtRateAddons']";
		   input[1]=rate;
		   Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"3\" as rate%",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
		}
	
		@When("^user enter \"([^\"]*)\" as description$")
		public void enterDescriptionAddon(String description) throws Throwable 
		{
			Object[] input =new Object[2];
			input[0]="//*[@id='MainContent_txtDescriptionAddons']";
			input[1]=description;
			Hashtable<String,Object> output= SeleniumOperations.sendKeys(input); 
			   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Testing Package Policy\" as description",output.get("MESSAGE").toString());
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

		@When("user click on save button")
		public void user_click_on_save_button() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='btnSave']", "user click on save button", "CLICK", 3000);

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

		@When ("^user select highest sum insured checkbox$")
		public void highestSumInsured()
		{
			Object[] input=new Object[1];
			input[0]="//*[@id='MainContent_chkHighSuminsured']";
			Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select highest sum insured checkbox",output.get("MESSAGE").toString());
		}
		
		@When("^user select on RI per class checkbox$")
		public void user_select_on_RI_per_class_checkbox() throws Throwable {
		 
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='MainContent_chkRIClass']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select on RI per class checkbox",output50.get("MESSAGE").toString());
		       Thread.sleep(2000);
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

		}
		
		@When("^user enter \"([^\"]*)\" as cover note number$")
		public void enterCoverNote(String coverNote) throws Throwable
		{
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtICNNB']";
		    input[1]=coverNote;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"123459876501234\" as cover note number",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}
		
		@When("^user select excess buy-back checkbox$")
		public void user_select_excess_buy_back_checkbox() throws Throwable {
		   
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chkExcess']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select excess buy-back checkbox",output50.get("MESSAGE").toString());
		}

		@Then("^user enter \"([^\"]*)\" as excess buy-back$")
		public void user_enter_as_excess_buy_back(String excessBuyBack) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtExcess']";
		    input[1]=excessBuyBack;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as excess buy-back",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user select geographical extension checkbox$")
		public void user_select_geographical_extension_checkbox() throws Throwable {
		   
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chkGeographical']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select geographical extension checkbox",output50.get("MESSAGE").toString());
		
		}

		@Then("^user enter \"([^\"]*)\" as geographical extension$")
		public void user_enter_as_geographical_extension(String geographicalExtension) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtGeographical']";
		    input[1]=geographicalExtension;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as geographical extension",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user select loss of use check box$")
		public void user_select_loss_of_use_check_box() throws Throwable {
		    
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chkLossOfUse']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select loss of use check box",output50.get("MESSAGE").toString());
		
		}

		@Then("^user enter \"([^\"]*)\" as loss of use$")
		public void user_enter_as_loss_of_use(String lossOfUse) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtLossOfUse']";
		    input[1]=lossOfUse;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as loss of use",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user select increased TPPD checkbox$")
		public void user_select_increased_TPPD_checkbox() throws Throwable {
		   
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chkIncrTPPD']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select increased TPPD checkbox",output50.get("MESSAGE").toString());
		
		}

		@Then("^user enter \"([^\"]*)\" as increased TPPD$")
		public void user_enter_as_increased_TPPD(String increasedTPPD) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtIncrTPPD']";
		    input[1]=increasedTPPD;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as increased TPPD",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user select excess protector checkbox$")
		public void user_select_excess_protector_checkbox() throws Throwable {
		    
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chkProtector']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select excess protector checkbox",output50.get("MESSAGE").toString());
		
		}

		@Then("^user enter \"([^\"]*)\" as excess protector$")
		public void user_enter_as_excess_protector(String excessProtector) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtProtector']";
		    input[1]=excessProtector;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as excess protector",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user select excess PVT checkbox$")
		public void user_select_excess_PVT_checkbox() throws Throwable {
		   
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chkPVT']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select excess PVT checkbox",output50.get("MESSAGE").toString());
		
		}

		@Then("^user enter \"([^\"]*)\" as excess PVT$")
		public void user_enter_as_excess_PVT(String excessPVT) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtExcessPVT']";
		    input[1]=excessPVT;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as excess PVT",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user select accident checkbox$")
		public void user_select_accident_checkbox() throws Throwable {
		    
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='ChkAccident']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select accident checkbox",output50.get("MESSAGE").toString());
		
		}

		@Then("^user enter \"([^\"]*)\" as accident$")
		public void user_enter_as_accident(String accident) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtAccident']";
		    input[1]=accident;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as accident",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user select membership discount checkbox$")
		public void user_select_membership_discount_checkbox() throws Throwable {
		    
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chktmbrDisc']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select membership discount checkbox",output50.get("MESSAGE").toString());
		
		}

		@Then("^user enter \"([^\"]*)\" as membership discount$")
		public void user_enter_as_membership_discount(String membershipDiscount) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txttmbrDisc']";
		    input[1]=membershipDiscount;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as membership discount",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user select GPS tracking installed checkbox$")
		public void user_select_GPS_tracking_installed_checkbox() throws Throwable {
		   
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chkTracking']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select GPS tracking installed checkbox",output50.get("MESSAGE").toString());
		
		}

		@Then("^user enter \"([^\"]*)\" as GPS tracking installed$")
		public void user_enter_as_GPS_tracking_installed(String gpsTrackingInstalled) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtGPSIns']";
		    input[1]=gpsTrackingInstalled;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as GPS tracking installed",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user enter \"([^\"]*)\" as fleet/claim%$")
		public void user_enter_as_fleet_claim(String fleetClaim) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtfleetDisc']";
		    input[1]=fleetClaim;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as fleet/claim%",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@Then("^user enter \"([^\"]*)\" as additional discount%$")
		public void user_enter_as_additional_discount(String additionalDiscount) throws Throwable {
		 
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtAddDisc']";
		    input[1]=additionalDiscount;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as additional discount%",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@Then("^user enter \"([^\"]*)\" as other description$")
		public void user_enter_as_other_description(String otherDescription) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtOthrDescription']";
		    input[1]=otherDescription;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as other description",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@Then("^user enter \"([^\"]*)\" as engine No$")
		public void user_enter_as_engine_No(String engineNo) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtEngineNo']";
		    input[1]=engineNo;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as engine No",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user enter \"([^\"]*)\" as chassis No$")
		public void user_enter_as_chassis_No(String chassisNo) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtChasisNo']";
		    input[1]=chassisNo;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as chassis No",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@Then("^user enter \"([^\"]*)\" as gross weight$")
		public void user_enter_as_gross_weight(String grossWeight) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtGrossWeight']";
		    input[1]=grossWeight;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as gross weight",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@When("^user click on fuel type dropdown$")
		public void user_click_on_fuel_type_dropdown() throws Throwable {
		    
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='s2id_MainContent_cmbFuelType']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on fuel type dropdown",output50.get("MESSAGE").toString());
		       Thread.sleep(2000);
		}

		@When("^user enter \"([^\"]*)\" as fuel type$")
		public void user_enter_as_fuel_type(String fuelType) throws Throwable {
		 
			Object[] input=new Object[2];
		    input[0]="//*[@class='select2-input select2-focused']";
		    input[1]=fuelType;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as fuel type",output.get("MESSAGE").toString());   
		
		}

		@Then("^user select Petrol as fuel type$")
		public void user_select_Petrol_as_fuel_type() throws Throwable {
		   
			Object[] input50=new Object[1];
			   input50[0]="(//*[@class='select2-match'])";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select Petrol as fuel type",output50.get("MESSAGE").toString());
		       Thread.sleep(2000);
		}

		@When("^user enter \"([^\"]*)\" as registration year$")
		public void user_enter_as_registration_year(String registrationYear) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtRegYear']";
		    input[1]=registrationYear;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as registration year",output.get("MESSAGE").toString());   
		
		}

		@When("^user enter \"([^\"]*)\" as seat$")
		public void user_enter_as_seat(String seat) throws Throwable {
		 
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtFltSeat']";
		    input[1]=seat;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as seat",output.get("MESSAGE").toString());   
		
		}

		@When("^user enter \"([^\"]*)\" as CC$")
		public void user_enter_as_CC(String cc) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtFltCC']";
		    input[1]=cc;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as CC",output.get("MESSAGE").toString());   
		
		}

		@When("^user select enable checkbox$")
		public void user_select_enable_checkbox() throws Throwable {
		   
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chkEnableWindscreen']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select enable checkbox",output50.get("MESSAGE").toString());
		       Thread.sleep(2000);
		}

		@Then("^user enter \"([^\"]*)\" as windscreen sum insured$")
		public void user_enter_as_windscreen_sum_insured(String windscreenSumInsured) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtFltWindSumAssured']";
		    input[1]=windscreenSumInsured;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as windscreen sum insured",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@Then("^user enter \"([^\"]*)\" as accessories sum insured$")
		public void user_enter_as_accessories_sum_insured(String accessoriesSumInsured) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtAccessSumAssured']";
		    input[1]=accessoriesSumInsured;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as accessories sum insured",output.get("MESSAGE").toString());   
		
		}

		@Then("^user enter \"([^\"]*)\" as accessories information$")
		public void user_enter_as_accessories_information(String accessoriesInformation) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtAccessInfo']";
		    input[1]=accessoriesInformation;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as accessories information",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@Then("^user enter \"([^\"]*)\" as override%$")
		public void user_enter_as_override(String override) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtFltOverRate']";
		    input[1]=override;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as override%",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@When("^user enter \"([^\"]*)\" as TPPD free limit$")
		public void user_enter_as_TPPD_free_limit(String tppdFreeLimit) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtTPPDFreeLimit']";
		    input[1]=tppdFreeLimit;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as TPPD free limit",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@When("^user enter \"([^\"]*)\" as TPPD increase limit$")
		public void user_enter_as_TPPD_increase_limit(String tppdIncreaseLimit) throws Throwable {
		    
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtfltTPPDIncreaseLimit']";
		    input[1]=tppdIncreaseLimit;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as TPPD increase limit",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@When("^user enter \"([^\"]*)\" as TPPD sum insured$")
		public void user_enter_as_TPPD_sum_insured(String tppdSumInsured) throws Throwable {
		  
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtfltTPPDSumAssured']";
		    input[1]=tppdSumInsured;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as TPPD sum insured",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@When("^user enter \"([^\"]*)\" as adjust premium$")
		public void user_enter_as_adjust_premium(String adjustPremium) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtfltAddTtlPremium']";
		    input[1]=adjustPremium;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as adjust premium",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@Then("^user enter \"([^\"]*)\" as sticker No$")
		public void user_enter_as_sticker_No(String stickerNo) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtStickerNo']";
		    input[1]=stickerNo;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as sticker No",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}


		
		
		
		
		
		
}
