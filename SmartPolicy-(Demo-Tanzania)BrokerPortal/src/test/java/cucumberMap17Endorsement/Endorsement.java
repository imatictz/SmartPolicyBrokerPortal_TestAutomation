package cucumberMap17Endorsement;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Endorsement {
	
	 @When("^user navigate on operation dropdown menu$")
	 public void user_navigate_on_operation_dropdown_menu() throws InterruptedException {
	     Object[] input7=new Object[1];
		 input7[0]="//*[@id='MOD_OPERATIONS']";
		 SeleniumOperations.actionClass(input7);
		 Thread.sleep(2000);
	 }
	 
	 @When("^user navigate on endorsement menu$")
	 public void user_navigate_on_endorsement_menu() throws Throwable {
		 Object[] input7=new Object[1];
	     input7[0]="//*[@id='MNU_ENDORSEMENT']";
	     SeleniumOperations.actionClass(input7);
	     Thread.sleep(2000);
	 }

	 @When("^user click on endorsement option$")
	 public void user_click_on_endorsement_option() throws Throwable {
		 Object[] input7=new Object[1];
	     input7[0]="(//*[text()='Endorsement'])[1]";
	     SeleniumOperations.clickOnElement(input7);
	     Thread.sleep(2000);
	 }

	 @When("^user click on add button$")
	 public void user_click_on_add_button() throws Throwable {
		 Object[] input7=new Object[1];
	     input7[0]="//*[@id='MainContent_btnAdd']";
	     SeleniumOperations.clickOnElement(input7);
		 Thread.sleep(3000);
	 }

	 @When("^user click on endorsement type dropdown$")
	 public void user_click_on_endorsement_type_dropdown() throws Throwable{
		 Object[] input7=new Object[1];
		 input7[0]="//*[@id='s2id_MainContent_cmbPopEndorsementType']";
		 SeleniumOperations.clickOnElement(input7);
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as endorsement type$")
	 public void user_enter_as_endorsement_type(String endorsementType) throws Throwable {
	     Object[] input=new Object[2];
	     input[0]="//*[@class='select2-input select2-focused']";
	     input[1]=endorsementType;
	     SeleniumOperations.sendKeys(input);
	     Thread.sleep(2000);
	 }

	 @When("^user select General Endorsements as endorsement type$")
	 public void user_select_General_Endorsements_as_endorsement_type() throws Throwable {
		 Object[] input7=new Object[1];
		 input7[0]="//*[@class='select2-match']";
		 SeleniumOperations.clickOnElement(input7);
		 Thread.sleep(2000); 
	 }

	 @When("^user enter \"([^\"]*)\" risk note number$")
	 public void user_enter_risk_note_number(String riskNoteNo) throws Throwable {
		 Object[] input=new Object[2];
	     input[0]="//*[@id='txtRiskNote']";
	     input[1]=riskNoteNo;
	     Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	     HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"32863\" risk note number",output.get("MESSAGE").toString());
	     Thread.sleep(2000);
	 }

	 @When("^user click on fetch button$")
	 public void user_click_on_fetch_button() throws Throwable {
		 Object[] input7=new Object[1];
		 input7[0]="//*[@id='btnDetails']";
		 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on fetch button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on edit icon to make financial changes$")
	 public void user_click_on_edit_icon_to_make_financial_changes() throws Throwable {
		 Object[] input8=new Object[1];
		 input8[0]="//*[@id='btnEdit']";
		 SeleniumOperations.clickOnElement(input8);
		 
		 Object[] input7=new Object[1];
		 input7[0]="//*[@id='btnEdit']";
		 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on edit icon to make financial changes",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	
	 @When ("^user enter \"([^\"]*)\" as change value of contract value$")
	 public void enterContarctValue(String contractValue) throws Throwable {
		 Object[] input=new Object[2];
	     input[0]="//*[@id='MainContent_txtContractVal']";
	     input[1]=contractValue;
	     Hashtable<String,Object> output=SeleniumOperations.clearAndEnter(input);
	     HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"45000000\" as change value of contract value",output.get("MESSAGE").toString());
	     Thread.sleep(2000);
	 }

	 @When("^user click on compute button$")
	 public void user_click_on_compute_button() throws Throwable{
		 Object[] input7=new Object[1];
		 input7[0]="//*[@id='btnCompute']";
		 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on compute button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on update button$")
	 public void user_click_on_update_button() throws Throwable{
		 Object[] input7=new Object[1];
		 input7[0]="//*[@id='btnInsert']";
		 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as endorsement details$")
	 public void user_enter_as_endorsement_details(String endorsementDetails) throws Throwable {
		 Object[] input=new Object[2];
	     input[0]="//*[@class='form-control wysihtml5-editor']";
	     input[1]=endorsementDetails;
	     Hashtable<String,Object> output=SeleniumOperations.iFrameEnter(input);
	     HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Upgrading endorsement\" as endorsement details",output.get("MESSAGE").toString());
     }

	 @When("^user click on process endorsement button$")
	 public void user_click_on_process_endorsement_button() throws Throwable {
		 Object[] input8=new Object[1];
	     input8[0]="//*[@id='btnSave']";
	     SeleniumOperations.clickOnElement(input8);
		
	     Object[] input7=new Object[1];
	     input7[0]="//*[@id='btnSave']";
	     Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input7);
	     HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on process endorsement button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on OK button to process endorsement$")
	 public void user_click_on_OK_button_to_process_endorsement() throws Throwable {
		 Hashtable<String,Object> output= SeleniumOperations.alert();
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on OK button to process endorsement",output.get("MESSAGE").toString());
	     Thread.sleep(2000);
	 }

	 @When("^user click on capture receipt icon$")
	 public void user_click_on_capture_receipt_icon() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_repICNM_btnAppTeller_0']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on capture receipt icon",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	 
	 @When("^user click on mode dropdown$")
	 public void user_click_on_mode_dropdown() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='s2id_MainContent_cmbMode']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on mode dropdown",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as mode$")
	 public void user_enter_as_mode(String mode) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=mode;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Electronic Funds Transfer (EFT)\" as mode",output.get("MESSAGE").toString());  
	 }	

	 @When("^user select Electronic Funds Transfer \\(EFT\\) as mode$")
	 public void user_select_Electronic_Funds_Transfer_EFT_as_mode() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@CLASS='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Electronic Funds Transfer (EFT) as mode",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on issuer bank dropdown$")
	 public void user_click_on_issuer_bank_dropdown() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='s2id_MainContent_cmbClientBank']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on issuer bank dropdown",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as issuer bank$")
	 public void user_enter_as_issuer_bank(String issuerBank ) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=issuerBank;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Absa Group Limited\" as issuer bank",output.get("MESSAGE").toString());  
	 }

	 @When("^user select Absa Group Limited as issuer bank$")
	 public void user_select_Absa_Group_Limited_as_issuer_bank() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@CLASS='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Absa Group Limited as issuer bank",output.get("MESSAGE").toString()); 
		 Thread.sleep(2000);
	 }

	 @When("^user click on collecting bank dropdown$")
	 public void user_click_on_collecting_bank_dropdown() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='s2id_MainContent_cmbInsurerBank']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on collecting bank dropdown",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as collecting bank$")
	 public void user_enter_as_collecting_bank(String collectingBank) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=collectingBank;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Uchumi Commercial Bank\" as collecting bank",output.get("MESSAGE").toString());  
	 }

	 @When("^user select Uchumi Commercial Bank as collecting bank$")
	 public void user_select_Uchumi_Commercial_Bank_as_collecting_bank() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@CLASS='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Uchumi Commercial Bank as collecting bank",output.get("MESSAGE").toString()); 
		 Thread.sleep(2000);
	 }

     @When("^user enter \"([^\"]*)\" as reference No$")
	 public void user_enter_as_reference_No(String referenceNo) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtTRReciptNb']";
		 input[1]=referenceNo;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"1250\" as reference No",output.get("MESSAGE").toString());  
	 }

	 @When("^user click on proceed button$")
	 public void user_click_on_proceed_button() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='btnProceed']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on proceed button",output.get("MESSAGE").toString()); 
	 }
	 

	 @When("^user click on process endorsement icon$")
	 public void user_click_on_process_endorsement_icon() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="(//*[@class='IssueRiskNote fa fa-arrow-up'])[1]";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on process endorsement icon",output.get("MESSAGE").toString()); 
	 }

	 @When("^user click on YES button for confirmation$")
	 public void user_click_on_YES_button_for_confirmation() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='btnProcedeRiskNote']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on YES button for confirmation",output.get("MESSAGE").toString()); 
	 }

	 @Then("^user able to view \"([^\"]*)\" as status$")
	 public void user_able_to_view_as_status(String riskNoteIssued) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="(//*[text()='Issued'])[1]";
		 input[1]=riskNoteIssued;
		 Hashtable<String,Object> output= SeleniumOperations.validation(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \"Issued\" as status",output.get("MESSAGE").toString());  
	 }

	 //Non Financial Endorsement
	 
	 @When ("^user select non-financial endorsement$")
	 public void selectNonFinancialEndorsement() throws InterruptedException {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='chkNofinancial']";
		 SeleniumOperations.clickOnElement(input1);
		 
		 Object[] input=new Object[1];
		 input[0]="//*[@id='chkNofinancial']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select non-financial endorsement",output.get("MESSAGE").toString());  
	     Thread.sleep(2000);
	 }
	 
	 @When("^user enter \"([^\"]*)\" to make change in insured name$")
	 public void user_enter_to_make_change_in_insured_name(String insuredName) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtFltInsuredName']";
		 input[1]=insuredName;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Pravin Testing Non Financial Change\" to make change in insured name",output.get("MESSAGE").toString());   
	     Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" to make change in covering details$")
	 public void user_enter_to_make_change_in_covering_details(String coveringDetails) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtCovering']";
		 input[1]=coveringDetails;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Testing cover details\" to make change in covering details",output.get("MESSAGE").toString());    
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" to make change in description of risk$")
	 public void user_enter_to_make_change_in_description_of_risk(String descriptionRisk) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtDescRisk']";
		 input[1]=descriptionRisk;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Testing description of risk\" to make change in description of risk",output.get("MESSAGE").toString());    
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" to make change in firstloss payee$")
	 public void user_enter_to_make_change_in_firstloss_payee(String firstLossPayee) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtFirslossPayee']";
		 input[1]=firstLossPayee;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Payeee name\" to make change in firstloss payee",output.get("MESSAGE").toString());   
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as cover note number$")
	 public void enterCoverNote(String coverNote) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtGridICN']";
		 input[1]=coverNote;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	     HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"123459876501234\" as cover note number",output.get("MESSAGE").toString());
		 Thread.sleep(3000);
	 }
}
