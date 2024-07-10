package cucumberMap2Vehicle;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Vehicle 
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
		Thread.sleep(5000);
		    
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
		Thread.sleep(4000);
		}
	 @When("^user select vehicle as insurance type from dropdown$")
		public void selectVehicleAsInsuranceType() throws Throwable
		{
		   Object[] input1=new Object[1];
		   input1[0]="(//*[@class='select2-match'])[1]";
		   SeleniumOperations.clickOnElement(input1);
			
			
		}

	 @When("^user enter \"([^\"]*)\" as client name in vehicle quotation$")
		public void enterClientName(String name) throws Throwable 
		{
			Thread.sleep(3000);
			Object[] input=new Object[2];
			input[0]="//*[@id='MainContent_txtClientName']";
			input[1]=name;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Pravin Testing\" as client name in vehicle quotation",output.get("MESSAGE").toString());
		}
		
	 @When("^user select Pravin Testing as client name$")
		public void selectClientName() throws Throwable
		{
			Thread.sleep(2000);
			   Object[] input1=new Object[1];
			   input1[0]="//*[@id='MainContent_txtClientName']";
			   Hashtable<String, Object> output = SeleniumOperations.actionDownEnter();
			   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Pravin Testing as client name",output.get("MESSAGE").toString());
			   Thread.sleep(2000);
		}

	 @When ("^user click on insurer dropdown$")
	 public void selectInsurer() throws InterruptedException
	 {
		 Object[] input1=new Object[1];
		   input1[0]="(//*[@class='select2-chosen'])[2]";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insurer dropdown",output.get("MESSAGE").toString());
		   Thread.sleep(5000);
			 
	 }
	
	 @When("^user enter \"([^\"]*)\" as insurer$")
	 public void enterInsurer(String insurer) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="(//*[@class='select2-input select2-focused'])";
			input[1]=insurer;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Alliance Insurance Company (T) Ltd.\" as insurer",output.get("MESSAGE").toString());
			Thread.sleep(2000);
	 }

	 @When("^user click on Alliance Insurance Company \\(T\\) Ltd\\. as insurer$")
	 public void clickOnInsurerCompany() throws Throwable
	 {
		 Object[] input1=new Object[1];
		   input1[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Alliance Insurance Company (T) Ltd. as insurer",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
	 }

	 @When("^user click on motor type dropdown$")
	 public void clickOnMotorTypeDropdown() throws Throwable
	 {
		 Object[] input1=new Object[1];
		   input1[0]="//*[@id='s2id_MainContent_cmbMotorType']";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on motor type dropdown",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as motor type$")
	 public void enterMotorType(String motorType) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@class='select2-input select2-focused']";
			input[1]=motorType; 
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Registered\" as motor type",output.get("MESSAGE").toString());
	 }

	 @When("^user click on Registered as motor type$")
	 public void clickOnMotorTypeResult() throws Throwable 
	 {
		 Object[] input1=new Object[1];
		   input1[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Registered as motor type",output.get("MESSAGE").toString());
	 }

	    @When ("user select {string} as insurance type")
		public void user_select_as_insuranceType(String insuranceType) {
		    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbFltCoverType']", "//*[@class='select2-input select2-focused']", insuranceType , "//*[@class='select2-match']", "user select {String} as insurance type", "DROPDOWN", 3000);

		}
	

	 @When ("user select {string} as insurance class")
		public void user_select_as_insuranceClass(String insuranceClass) {
		    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbFltClassType']", "//*[@class='select2-input select2-focused']", insuranceClass , "//*[@class='select2-match']", "user select {String} as insurance class", "DROPDOWN", 3000);

		}
	 
	 @When ("user select {string} as owner category")
		public void user_select_as_ownerCategory(String ownerCategory) {
		    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbOwnerCat']", "//*[@class='select2-input select2-focused']", ownerCategory , "//*[@class='select2-match']", "user select {string} as owner category", "DROPDOWN", 2000);

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

	 @When("^user enter \"([^\"]*)\" as chasis number$")
	 public void enterChasisNumber(String chasisNumber) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtChasisNo']";
			input[1]=chasisNumber;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"632541A\" as chasis number",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as vehicle make$")
	 public void enterVehicleMake(String vehicleMake) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='MainContent_txtFltMake']";
			input[1]=vehicleMake;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"TVS\" as vehicle make",output.get("MESSAGE").toString());
			
	 }
	 @When("^user select TVS as vehicle make$")
	 public void selectVehicleMakeResult() throws Throwable 
	 {
	     Object[] input=new Object[1];
	     input[0]="//*[@id='MainContent_txtFltMake']";
	     Hashtable<String, Object> output = SeleniumOperations.actionDownEnter();
	     HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select TVS as vehicle make",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as vehicle model$")
	 public void enterVehicleModel(String vehicleModel) throws Throwable
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='MainContent_txtFltModel']";
			input[1]=vehicleModel;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"SCOOTY\" as vehicle model",output.get("MESSAGE").toString());

	 }

	 @When("^user select SCOOTY as vehicle model$")
	 public void selectVehicleModelResult() throws Throwable 
	 {
	    Object[] input=new Object[1];
	    input[0]="//*[@id='MainContent_txtFltModel']";
	    Hashtable<String, Object> output = SeleniumOperations.actionDownEnter();
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select SCOOTY as vehicle model",output.get("MESSAGE").toString());
	 }
	 @When("^user click on vehicle type dropdown$")
	 public void clickOnVehicleTypeDropdown() throws Throwable 
	 {
		 Object[] input1=new Object[1];
		   input1[0]="(//*[@class='select2-chosen'])[25]";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on vehicle type dropdown",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as vehicle type$")
	 public void enterVehicleType(String vehicleType) throws Throwable
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@class='select2-input select2-focused']";
			input[1]=vehicleType;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"BIKE\" as vehicle type",output.get("MESSAGE").toString());
			Thread.sleep(2000);
	 }

	 @When("^user click on BIKE as vehicle type$")
	 public void clickOnVehicleTypeResult() throws Throwable 
	 {
		 Object[] input1=new Object[1];
		   input1[0]="(//*[@class='select2-match'])[1]";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on BIKE as vehicle type",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as model number$")
	 public void enterModelNumber(String modelNumber) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='MainContent_txtModelNum']";
			input[1]=modelNumber;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"6523SCOOTY125\" as model number",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as engine number$")
	 public void enterEngineNumber(String engineNumber) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtEngineNo']";
			input[1]=engineNumber;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"524789931EN\" as engine number",output.get("MESSAGE").toString());
			Thread.sleep(2000);
	 }

	 @When("^user click on fuel type dropdown$")
	 public void clickOnFuelTypeDropdown() throws Throwable 
	 {
		 Object[] input1=new Object[1];
		   input1[0]="(//*[@class='select2-chosen'])[27]";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on fuel type dropdown",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as fuel type$")
	 public void enterFuelType(String fuelType) throws Throwable
	 {
		 Object[] input=new Object[2];
			input[0]="(//*[@class='select2-input select2-focused'])";
			input[1]=fuelType;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"CNG\" as fuel type",output.get("MESSAGE").toString());
	 }

	 @When("^user click on CNG as fuel type$")
	 public void clickOnFuelTypeResult() throws Throwable
	 {

		 Object[] input1=new Object[1];
		   input1[0]="//*[@class='select2-match']";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on CNG as fuel type",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as manufacture year$")
	 public void enterManufactureYear(String manufactureYear) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtFltYear']";
			input[1]=manufactureYear;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"2015\" as manufacture year",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as seat$")
	 public void enterSeat(String seat) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtFltSeat']";
			input[1]=seat;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"2\" as seat",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as CC$")
	 public void enterCC(String CC) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtFltCC']";
			input[1]=CC;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"125\" as CC",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as color$")
	 public void entercolor(String color) throws Throwable
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtColor']";
			input[1]=color;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"White\" as color",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as gross weight$")
	 public void enterGrossWeight(String grossWeight) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='MainContent_txtGrossWeight']";
			input[1]=grossWeight;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"101\" as gross weight",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as tare weight$")
	 public void enterTareWeight(String tareWeight) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='MainContent_txtTareWeeight']";
			input[1]=tareWeight;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"97\" as tare weight",output.get("MESSAGE").toString());
	 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as number of axel$")
	 public void enterNumberOfAxel(String numberOfAxel) throws Throwable
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtNoOfAxel']";
			input[1]=numberOfAxel;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input); 
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"2\" as number of axel",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as axel distance$")
	 public void enterAxelDistance(String axelDistance) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtAxelDistance']";
			input[1]=axelDistance;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input); 
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"1\" as axel distance",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as sum insured$")
	 public void enterSumInsured(String sumInsured) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtFltSumInsured']";
			input[1]=sumInsured;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"100000\" as sum insured",output.get("MESSAGE").toString());
	 }

	 @When("^user click on compute button$")
	 public void clickOnComputeButton() throws Throwable
	 {

		 Object[] input1=new Object[1];
		   input1[0]="//*[@id='btnCompute']";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on compute button",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
	 }

	 @When ("^user click on insert button \\(Policy Information\\)$")
	 public void clickOnInsertButton() throws Throwable
	 {
		 Object[] input1=new Object[1];
		   input1[0]="//*[@id='btnInsert']";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert button (Policy Information)",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
		   
	 }
	 
	 @When ("^user click on OK button for commission alert$")
	 
	 public void clickOnOk() throws InterruptedException
	 {
		 Hashtable<String, Object> output = SeleniumOperations.alert();
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on OK button for commission alert",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on compute button to update record$")
	 public void clickOnComputeButtonUpdate() throws Throwable 
	 {

		 Object[] input1=new Object[1];
		   input1[0]="//*[@id='btnCompute']";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on compute button to update record",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
		   SeleniumOperations.scrollUp();
		   Thread.sleep(2000);
	 }
	 @When("^user click on broker partner name dropdown$")
		public void clickOnBrokerPartnerDropdown() throws InterruptedException
		{
			Object[] input=new Object[1];
		    input[0]="(//*[@class='select2-chosen'])[28]";
		    Hashtable<String,Object> output=  SeleniumOperations.clickOnElement(input);
			   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on broker partner name dropdown",output.get("MESSAGE").toString());
			   Thread.sleep(2000); 
		}
		@When("^user select FinalTester as broker partner name$")
		public void selectBrokerPartnerResult() throws InterruptedException
		{
			Object[] input=new Object[1];
		    input[0]="(//*[@value='571'])[2]";
		    Hashtable<String,Object> output=  SeleniumOperations.clickOnElement(input);
			   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select FinalTester as broker partner name",output.get("MESSAGE").toString());
			   Thread.sleep(2000);  
		}
		@When("^user click on Ok button to accept broker partner alert message$")
		public void clickOnOKButtonBrokerPartner() throws Throwable 
		{
			
			   Hashtable<String,Object> output= SeleniumOperations.alert();
			   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Ok button to accept broker partner alert message",output.get("MESSAGE").toString());
			   Thread.sleep(2000);
		}
	 @When("^user scroll up to click on addon$")
	 public void scrollUp() throws Throwable 
	 {
		 Hashtable<String, Object> output = SeleniumOperations.scrollUp450();
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user scroll up to click on addon",output.get("MESSAGE").toString());
	     Thread.sleep(4000);
	 }

	 @When("^user click on addon button$")
	 public void clickOnAddOnButton() throws Throwable 
	 {
		 Object[] input1=new Object[1];
		   input1[0]="(//*[@id='li2'])[1]";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on addon button",output.get("MESSAGE").toString());
	 Thread.sleep(2000);
	 }
	 @When ("user select {string}as extension")
		public void user_select_as_extension(String extension) {
		    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbAddons']", "//*[@class='select2-input select2-focused']", extension , "//*[@class='select2-match']", "user select {string} as extension", "DROPDOWN", 2000);

		}
	 
	 @When ("^user enter sum insured as \"(.*)\"$")
	 public void enterSumInsuredAddOn(String sumInsured) throws InterruptedException
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtSumInsuredAddons']";
			input[1]=sumInsured;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter sum insured as \"100000\"",output.get("MESSAGE").toString());
	 Thread.sleep(2000);
	 }
	 
	 @When("^user enter \"([^\"]*)\" as rate%$")
	 public void enterRate(String rate) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='txtRateAddons']";
			input[1]=rate;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input); 
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"10\" as rate%",output.get("MESSAGE").toString());
			Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as description$")
	 public void enterDescrioption(String description) throws Throwable 
	 {
		 Object[] input=new Object[2];
			input[0]="//*[@id='MainContent_txtDescriptionAddons']";
			input[1]=description;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input); 
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Testing Vehicle\" as description",output.get("MESSAGE").toString());
	 Thread.sleep(2000);
	 }

	 @When("^user click on insert button$")
	 public void clickOnInsertButtonAddOn() throws Throwable 
	 {
		 Object[] input1=new Object[1];
		   input1[0]="//*[@id='btnInsertAddons']";
		   Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input1);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert button",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
		   
	 }

	 @When("user click on save button")
		public void user_click_on_save_button() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='btnSave']", "user click on save button", "CLICK", 5000);

		}

	/* @When("^user click on OK button to accept commission rate alert$")
	 public void clickOnOkButton() throws Throwable 
	 {
		 Hashtable<String, Object> output = SeleniumOperations.alert();
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on OK button to accept commission rate alert",output.get("MESSAGE").toString());
	 }*/


	 @Then("^user able to view \"([^\"]*)\" as status$")
		public void user_able_to_view_as_status(String awaitingReceipt) throws Throwable 
		{
			Object[] input=new Object[2];
		    input[0]="//*[@id='sort_table']/tbody/tr[1]/td[8]";
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
			   input50[0]="//*[@id='chkNonRenewable']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select on non-renewabale checkbox",output50.get("MESSAGE").toString());
		       Thread.sleep(2000);
		}

		@When("^user enter \"([^\"]*)\" as business contact person$")
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
	
	
		@When("^user click on period dropdown$")
		public void user_click_on_period_dropdown() throws Throwable {
		    
			Object[] input50=new Object[1];
			   input50[0]="(//*[@class='select2-chosen'])[4]";
			   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on period dropdown",output50.get("MESSAGE").toString());
			   Thread.sleep(2000);
		}

		@When("^user enter \"([^\"]*)\" as period$")
		public void user_enter_as_period(String period) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="(//*[@class='select2-input select2-focused'])";
		    input[1]=period;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as period",output.get("MESSAGE").toString());  
		
		}

		@Then("^user select days$")
		public void user_select_days() throws Throwable {
		    
			Object[] input50=new Object[1];
			   input50[0]="//*[@class='select2-match']";
			   Hashtable<String, Object> output50 =SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select days",output50.get("MESSAGE").toString());
			   Thread.sleep(2000);
		}

		@When("^user enter \"([^\"]*)\" as file No$")
		public void user_enter_as_file_No(String fileNo) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='txtGridFile']";
		    input[1]=fileNo;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as file No",output.get("MESSAGE").toString());  
		    Thread.sleep(1000);
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

		@Then("^user enter \"([^\"]*)\" as other description$")
		public void user_enter_as_other_description(String otherDescription) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtOthrDescription']";
		    input[1]=otherDescription;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as other description",output.get("MESSAGE").toString());
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

		@Then("^user enter \"([^\"]*)\" as sticker/other fee$")
		public void user_enter_as_sticker_No(String stickerNo) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtOtherFee']";
		    input[1]=stickerNo;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as sticker No",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@When("^user select family extension checkbox$")
		public void user_select_family_extension_checkbox() throws Throwable {
		   
			Object[] input50=new Object[1];
			   input50[0]="//*[@id='chkFamilyExtesion']";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select family extension checkbox",output50.get("MESSAGE").toString());
			   Thread.sleep(1000);
		}

		@Then("^user enter \"([^\"]*)\" as family extension$")
		public void user_enter_as_family_extension(String familyExtension) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtFamilyExtesion']";
		    input[1]=familyExtension;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);  
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as family extension",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@When("^user click on claim excess type dropdown$")
		public void user_click_on_claim_excess_type_dropdown() throws Throwable {
		    
			Object[] input50=new Object[1];
			   input50[0]="(//*[@class='select2-chosen'])[14]";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on claim excess type dropdown",output50.get("MESSAGE").toString());
		
		}

		@When("^user enter \"([^\"]*)\" as claim excess$")
		public void user_enter_as_claim_excess(String claimExcess) throws Throwable {
		    
			Object[] input=new Object[2];
			input[0]="//*[@class='select2-input select2-focused']";
			input[1]=claimExcess;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as claim excess",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@Then("^user select ON SUM ASSURED as claim excess$")
		public void user_select_ON_SUM_ASSURED_as_claim_excess() throws Throwable {
		 
			Object[] input50=new Object[1];
			   input50[0]="(//*[@class='select2-match'])";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select ON SUM ASSURED as claim excess",output50.get("MESSAGE").toString());
		
		}

		@When("^user enter \"([^\"]*)\" as claim excess percent$")
		public void user_enter_as_claim_excess_percent(String excessPercent) throws Throwable {
		   
			Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtCEP']";
		    input[1]=excessPercent;
		    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);  
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as claim excess percent",output.get("MESSAGE").toString());   
		    Thread.sleep(1000);
		}

		@When("^user click on by percent/amount dropdown$")
		public void user_click_on_by_percent_amount_dropdown() throws Throwable {
		   
			Object[] input50=new Object[1];
			   input50[0]="(//*[@class='select2-chosen'])[15]";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user click on by percent/amount dropdown",output50.get("MESSAGE").toString());
		
		}

		@When("^user enter \"([^\"]*)\" as by percent/amount$")
		public void user_enter_as_by_percent_amount(String percentAmount) throws Throwable {
		   
			Object[] input=new Object[2];
			input[0]="//*[@class='select2-input select2-focused']";
			input[1]=percentAmount;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as by percent/amount",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		@Then("^user select By Percent as by percent/amount$")
		public void user_select_By_Percent_as_by_percent_amount() throws Throwable {
		    
			Object[] input50=new Object[1];
			   input50[0]="(//*[@class='select2-match'])";
			   Hashtable<String, Object> output50 = SeleniumOperations.clickOnElement(input50);
			   HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"user select By Percent as by percent/amount",output50.get("MESSAGE").toString());
		
		}

		@When("^user enter \"([^\"]*)\" as stamp duty$")
		public void user_enter_as_stamp_duty(String stampDuty) throws Throwable {
		   
			Object[] input=new Object[2];
			input[0]="//*[@id='MainContent_txtSDRateORAmount']";
			input[1]=stampDuty;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as stamp duty",output.get("MESSAGE").toString());
			Thread.sleep(2000);
			

		}

		@When("^user enter \"([^\"]*)\" as PH /Guaranty Fund$")
		public void user_enter_as_PH_Guaranty_Fund(String guarantyFund) throws Throwable {
		    
			Object[] input=new Object[2];
			input[0]="//*[@id='MainContent_txtPHFAmount']";
			input[1]=guarantyFund;
			Hashtable<String, Object> output = SeleniumOperations.clearAndEnter(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as PH /Guaranty Fund",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}
		
		@When ("user click on OK button to accept commission rate alert")
		public void clickOnOKbuttonCommission() throws Throwable 
		{

			   Hashtable<String,Object> output= SeleniumOperations.alert();
			   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Ok button to accept commission rate alert message",output.get("MESSAGE").toString());
			   Thread.sleep(3000);
		}

	
	
	
	
	

}
