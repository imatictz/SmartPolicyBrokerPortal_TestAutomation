package cucumberMap3AccidentalDamage;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class AccidentalDamage 
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
		{
			Object[] input10=new Object[1];
		    input10[0]="//*[@class='bold'][text()='Add']";
		    SeleniumOperations.clickOnElement(input10);
		    Thread.sleep(4000);
		    
		}

		@When("^user select \"([^\"]*)\" as insurance type$")
		public void user_select_as_insurance_type(String insuranceType) throws Throwable {
			Object[] input= new Object[4];
			input[0]="(//*[text()='Select Insurance Type'])[1]";
			input[1]="//*[@class='select2-input select2-focused']";
			input[2]=insuranceType;
			input[3]="//*[@class='select2-match']";
			Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as insurance type",output.get("MESSAGE").toString());
			
			Thread.sleep(18000);
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
			Object[] input=new Object[1];
			input[0]="//*[@id='MainContent_txtClientName']";
			Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Pravin Testing as client name",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

		

		@When ("^user Select \"(.*)\" as insurer$")
		public void selectInsurer(String insurer) throws Throwable 
		{
			Object[] input= new Object[4];
			input[0]="(//*[@class='select2-chosen'])[1]";
			input[1]="//*[@class='select2-input select2-focused']";
			input[2]=insurer;
			input[3]="//*[@class='select2-match']";
			Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user Select \\\"(.*)\\\" as insurer",output.get("MESSAGE").toString());
			
		}

		@When("^user Select \"([^\"]*)\" as insurance class$")
		public void user_Select_as_insurance_class(String insuranceClass) throws Throwable {
			
			Object[] input= new Object[4];
			input[0]="//*[@id='s2id_MainContent_cmbInsuranceClass']";
			input[1]="//*[@class='select2-input select2-focused']";
			input[2]=insuranceClass;
			input[3]="//*[@class='select2-match']";
			Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user Select \\\"([^\\\"]*)\\\" as insurance class",output.get("MESSAGE").toString());
		}
		
		
		

		
		@When("^user enter \"([^\"]*)\" as sum insured$")
		public void enterSumInsured(String sumInsured) throws Throwable 
		{
		   Object[] input=new Object[2];
		   input[0]="//*[@id='txtSumInsured']";
		   input[1]=sumInsured;
		   Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"100000\" as sum insured",output.get("MESSAGE").toString());
		}

		@When ("^user enter \"(.*)\" % as override%$")
		public void enterOverride(String overRide)
		{
			Object[] input=new Object[2];
			input[0]="//*[@id='txtOverride']";
			input[1]=overRide;
			Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"5\" % as override%",output.get("MESSAGE").toString());
			
		}
		
		@When("^user enter \"([^\"]*)\" as description$")
		public void enterDescription(String description) throws Throwable 
		{
		    Object[] input=new Object[2];
		    input[0]="//*[@id='MainContent_txtDescription']";
		    input[1]=description;
		    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Accidental Damage Quotation Testing\" as description",output.get("MESSAGE").toString());
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
			input[0]="(//*[@class='select2-chosen'])[15]";
			input[1]="//*[@class='select2-input select2-focused']";
			input[2]=extension;
			input[3]="//*[@class='select2-match']";
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
		    Itl.CustomDoubleClickEvent("//*[@id='btnSave']",  "user click on save button","CLICK", 4000);

		}

		@When("^user click on Ok button to accept commission alert$")
		public void clickOnOKButton() throws Throwable 
		{
			Hashtable<String,Object> output= SeleniumOperations.alert();
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Ok button to accept commission alert",output.get("MESSAGE").toString());
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
			   Thread.sleep(2000);
			   
			  
			
		}

		

		
	

		
		
		
		
		
		
		
		
		
		
		

}
