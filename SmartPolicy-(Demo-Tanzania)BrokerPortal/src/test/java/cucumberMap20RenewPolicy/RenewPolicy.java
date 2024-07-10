package cucumberMap20RenewPolicy;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class RenewPolicy {

	
 	
 	@When ("^user navigate on operation dropdown$")
 	public void user_navigate_on_operation_dropdown_menu() 
	{
		Object[] input7=new Object[1];
	input7[0]="//*[@id='MOD_OPERATIONS']";
	SeleniumOperations.actionClass(input7);
	   
	}
	
 	@When("^user navigate on policy renewals option$")
 	public void user_navigate_on_policy_renewals_option() throws Throwable {
 	    
 		Object[] input7=new Object[1];
 		input7[0]="//*[@id='MNU_wfRENEWAL']";
 		SeleniumOperations.actionClass(input7);
 	}

 	@Then("^user click on renew policy option$")
 	public void user_click_on_renew_policy_option() throws Throwable {
 	    
 		Object[] input4=new Object[1];
	      input4[0]="(//*[text()='Renew Policy'])[1]";
	  SeleniumOperations.clickOnElement(input4);
 	}

 	@When("^user enter \"([^\"]*)\" as expiry from date$")
 	public void user_enter_as_expiry_from_date(String date) throws Throwable {
 	    
 		Object[] input4=new Object[2];
	      input4[0]="//*[@id='MainContent_txtSrchFromDate']";
	      input4[1]=date;
	  Hashtable<String, Object>output=SeleniumOperations.clearAndEnter(input4);
	  HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as expiry from date", output.get("MESSAGE").toString());
 	}

 	@When("^user enter \"([^\"]*)\" as risk note$")
 	public void user_enter_as_risk_note(String riskNote) throws Throwable {
 		Object[] input4=new Object[2];
	      input4[0]="//*[@id='MainContent_txtRiskNote']";
	      input4[1]=riskNote;
	  Hashtable<String, Object>output=SeleniumOperations.sendKeys(input4);
	  HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as risk note", output.get("MESSAGE").toString());
	Thread.sleep(2000);
 	}
 	

 	@Then("^user click on search button$")
 	public void user_click_on_search_button() throws Throwable {
 	    
 		Object[] input4=new Object[1];
	      input4[0]="//*[@id='MainContent_btnSearch']";
	  Hashtable<String, Object>output=SeleniumOperations.clickOnElement(input4);
	  HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on search button", output.get("MESSAGE").toString());
	Thread.sleep(5000);
 	}

 	@When ("^user click on renew option$")
 	public void user_click_on_renew_option() throws Throwable {
 	    
 		Object[] input4=new Object[1];
	      input4[0]="//*[@id='MainContent_rptRenewal_lblRenew_0']";
	  Hashtable<String, Object>output=SeleniumOperations.clickOnElement(input4);
	  HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on renew option", output.get("MESSAGE").toString());
 	}

 	
 	@Then ("^user click on renew button for renewal confirmation$")
 	public void user_click_on_renew_button() throws Throwable {
 	    
 		Object[] input4=new Object[1];
	      input4[0]="//*[@id='btnRenew']";
	  Hashtable<String, Object>output=SeleniumOperations.clickOnElement(input4);
	  HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on renew button for renewal confirmation", output.get("MESSAGE").toString());
	Thread.sleep(5000);
 	}
 	
 	@When ("^user click on quotations menu$")
 	public void user_click_on_Quotation_Menu() throws Throwable {
 	    
 		Object[] input4=new Object[1];
	      input4[0]="//*[@id='MNU_WFFIQNM_2']";
	  Hashtable<String, Object>output=SeleniumOperations.clickOnElement(input4);
	  HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on quotations menu", output.get("MESSAGE").toString());
	Thread.sleep(4000);
 	}
 	
 	
 	@When("^user click on options icon$")
	public void user_click_on_options_icon() throws Throwable {
	    
		Object[] input=new Object[1];
		   input[0]="(//*[@class='btn default dropdown-toggle removeclass'])[1]";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on options icon",output.get("MESSAGE").toString());  
	     Thread.sleep(1000);
	}

	@When("^user click on edit option$")
	public void user_click_on_edit_option() throws Throwable {
	    
		Object[] input=new Object[1];
		   input[0]="//*[@id='MainContent_repIQNM_btnEdit_0']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on edit option",output.get("MESSAGE").toString());  
	     Thread.sleep(4000);
	}
 	
	@When ("^user enter \"(.*)\" as cover note$")
	public void enterCoverNote(String coverNote) throws Throwable
	{
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtGridICN']";
	    input[1]=coverNote;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"(.*)\\\" as cover note",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When ("^user click on select option$")
	public void user_click_on_select_option() throws Throwable {
	    
		Object[] input1=new Object[1];
		   input1[0]="//*[@id='MainContent_rptBond_btnSelect_0']";
		   SeleniumOperations.clickOnElement(input1);
		Object[] input=new Object[1];
		   input[0]="//*[@id='MainContent_rptBond_btnSelect_0']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on select option",output.get("MESSAGE").toString());  
	      Thread.sleep(4000);
	     
	}
	
	@When("^user click on insurance class dropdown$")
	public void clickOnInsuranceClassDropdown() throws Throwable 
	{
		Object[] input12=new Object[1];
		input12[0]="//*[@id='s2id_MainContent_cmbInsuranceClass']";
		SeleniumOperations.clickOnElement(input12);
		Object[] input11=new Object[1];
		input11[0]="//*[@id='s2id_MainContent_cmbInsuranceClass']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insurance class dropdown",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as insurance class$")
	public void enterInsuranceClass(String insuranceClass) throws Throwable 
	{
		Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=insuranceClass;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Advance Payment Bond 1\" as insurance class",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user select Advance Payment Bond one as insurance class$")
	public void selectInsuranceClassResult() throws Throwable 
	{
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Advance Payment Bond one as insurance class",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as contract value$")
	public void enterContractValue(String contractValue) throws Throwable 
	{
		Object[] input=new Object[2];
	    input[0]="//*[@id='txtContractVal']";
	    input[1]=contractValue;
	    Hashtable<String,Object> output=  SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as contract value",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}
	
	@When("^user click on compute button$")
	public void clickOnComputeButton() throws Throwable 
	{
		Object[] input11=new Object[1];
		input11[0]="//*[@id='btnCompute']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on compute button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	
	@Then ("^user click on update button to insert policy information$")
	public void clickOnUpdateButton() throws Throwable 
	{
		Object[] input12=new Object[1];
		input12[0]="//*[@id='btnInsert']";
		SeleniumOperations.clickOnElement(input12);
		Thread.sleep(2000);
		Object[] input11=new Object[1];
		input11[0]="//*[@id='btnInsert']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button to insert policy information",output.get("MESSAGE").toString());
		 
	}
	
	@When("^user click on update button$")
	 public void user_click_on_update_button() throws Throwable
	 {
		Object[] input8=new Object[1];
	     input8[0]="//*[@id='btnSave']";
		 SeleniumOperations.clickOnElement(input8);
		  Thread.sleep(2000);
		 Object[] input7=new Object[1];
			input7[0]="//*[@id='btnSave']";
			 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button",output.get("MESSAGE").toString());
	     
	 }
 	
	@When("^user click on capture receipt icon$")
	public void user_click_on_capture_receipt_icon() throws Throwable 
	{
		Object[] input=new Object[1];
		   input[0]="//*[@id='MainContent_repIQNM_btnAppTeller_0']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on capture receipt icon",output.get("MESSAGE").toString());
	}
	
	@When("^user click on mode dropdown$")
	public void user_click_on_mode_dropdown() throws Throwable 
	{
		Object[] input=new Object[1];
		   input[0]="//*[@id='s2id_MainContent_cmbMode']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on mode dropdown",output.get("MESSAGE").toString());
	Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as mode$")
	public void user_enter_as_mode(String mode) throws Throwable 
	{
		Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=mode;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Electronic Funds Transfer (EFT)\" as mode",output.get("MESSAGE").toString());  
	}

	@When("^user select Electronic Funds Transfer \\(EFT\\) as mode$")
	public void user_select_Electronic_Funds_Transfer_EFT_as_mode() throws Throwable 
	{
		Object[] input=new Object[1];
		   input[0]="//*[@CLASS='select2-match']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Electronic Funds Transfer (EFT) as mode",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user click on issuer bank dropdown$")
	public void user_click_on_issuer_bank_dropdown() throws Throwable 
	{
		Object[] input=new Object[1];
		   input[0]="//*[@id='s2id_MainContent_cmbClientBank']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on issuer bank dropdown",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as issuer bank$")
	public void user_enter_as_issuer_bank(String issuerBank ) throws Throwable 
	{
		Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=issuerBank;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Absa Group Limited\" as issuer bank",output.get("MESSAGE").toString());  
	}

	@When("^user select Absa Group Limited as issuer bank$")
	public void user_select_Absa_Group_Limited_as_issuer_bank() throws Throwable 
	{
		Object[] input=new Object[1];
		   input[0]="//*[@CLASS='select2-match']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Absa Group Limited as issuer bank",output.get("MESSAGE").toString()); 
		   Thread.sleep(2000);
	}

	@When("^user click on collecting bank dropdown$")
	public void user_click_on_collecting_bank_dropdown() throws Throwable 
	{
		Object[] input=new Object[1];
		   input[0]="//*[@id='s2id_MainContent_cmbInsurerBank']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on collecting bank dropdown",output.get("MESSAGE").toString());
		   Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as collecting bank$")
	public void user_enter_as_collecting_bank(String collectingBank) throws Throwable 
	{
		Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=collectingBank;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Uchumi Commercial Bank\" as collecting bank",output.get("MESSAGE").toString());  
	}

	@When("^user select Uchumi Commercial Bank as collecting bank$")
	public void user_select_Uchumi_Commercial_Bank_as_collecting_bank() throws Throwable 
	{
		Object[] input=new Object[1];
		   input[0]="//*[@CLASS='select2-match']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Uchumi Commercial Bank as collecting bank",output.get("MESSAGE").toString()); 
		   Thread.sleep(2000);
	}


	
	@When("^user enter \"([^\"]*)\" as reference No$")
	public void user_enter_as_reference_No(String referenceNo) throws Throwable 
	{
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtTRReciptNb']";
	    input[1]=referenceNo;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"1250\" as reference No",output.get("MESSAGE").toString());  
	}

	@When("^user click on proceed button$")
	public void user_click_on_proceed_button() throws Throwable 
	{
		Object[] input=new Object[1];
		   input[0]="//*[@id='btnProceed']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on proceed button",output.get("MESSAGE").toString()); 
	}

	@When("^user click on issue risk note option$")
	public void user_click_on_issue_risk_note_option() throws Throwable
	{
		Object[] input=new Object[1];
		   input[0]="//*[@id='btnRisknote']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on issue risk note option",output.get("MESSAGE").toString()); 
	}

	@When("^user click on Yes button for confirmation$")
	public void user_click_on_Yes_button_for_confirmation() throws Throwable
	{
		Object[] input=new Object[1];
		   input[0]="//*[@id='btnProcedeRiskNote']";
		   Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Yes button for confirmation",output.get("MESSAGE").toString());  
	}

	
 	
	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status1(String awaitingReceipt) throws Throwable 
	{
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_repIQNM_lblStatus_0']";
	    input[1]=awaitingReceipt;
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \"Awaiting Receipt\" as status",output.get("MESSAGE").toString());  
	}
 	
 	
}
