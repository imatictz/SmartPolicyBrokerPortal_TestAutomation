package cucumberMap16RiskNoteDebitNote;

import java.util.Hashtable;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class RiskNoteDebitNote {
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	}

	@When("^user navigate on quotations menu$")
	public void user_navigate_on_quotations_menu() {
		Object[] input8=new Object[1];
	    input8[0]="(//*[text()='Quotations '])[1]";
	    SeleniumOperations.actionClass(input8);
	}

	@Then("^user select risk note menu$")
	public void user_select_risk_note_menu() throws Throwable {
	    Object[] input9=new Object[1];
		input9[0]="(//*[text()='Risk Note '])[1]";
		SeleniumOperations.clickOnElement(input9);
	}

	@When("^user click on current quotations$")
	public void user_click_on_current_quotations() {
		Object[] input9=new Object[1];
	    input9[0]="(//*[text()='Current Quotations'])[1]";
	    SeleniumOperations.clickOnElement(input9);
	}
	
	@When("^user click on capture receipt icon$")
	public void user_click_on_capture_receipt_icon() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repIQNM_btnAppTeller_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on capture receipt icon",output.get("MESSAGE").toString());
		
	}
	
	@When("^user click on mode dropdown$")
	public void user_click_on_mode_dropdown() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@id='s2id_MainContent_cmbMode']";
		SeleniumOperations.wait(input);
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

	@When("^user click on issue risk note option$")
	public void user_click_on_issue_risk_note_option() throws Throwable{
		Object[] input=new Object[1];
		input[0]="//*[@id='btnRisknote']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on issue risk note option",output.get("MESSAGE").toString()); 
	}

	@When("^user click on Yes button for confirmation$")
	public void user_click_on_Yes_button_for_confirmation() throws Throwable{
		Object[] input=new Object[1];
		input[0]="//*[@id='btnProcedeRiskNote']";
	    Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Yes button for confirmation",output.get("MESSAGE").toString());  
	}

	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status(String riskNoteIssued) throws Throwable {
		Object[] input=new Object[2];
	    input[0]="(//*[text()='Risk Note Issued '])[1]";
	    input[1]=riskNoteIssued;
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \"Risk Note Issued\" as status",output.get("MESSAGE").toString());  
	}

    @When("^user click on display icon$")
	public void user_click_on_display_icon() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_btnDisplay_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on display icon",output.get("MESSAGE").toString());  
	}

	@Then("^user able to view bonds risk note screen$")
	public void user_able_to_view_bonds_risk_note_screen() throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="(//*[text()='Risk Note Issued '])[1]";
	    input[1]="Risk Note";
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view bonds risk note screen",output.get("MESSAGE").toString());  
	    Thread.sleep(4000);
	    
	    Object[] input1=new Object[1];
	    input1[0]="//*[@id='btnCancel']";
        SeleniumOperations.clickOnElement(input1);
	    Thread.sleep(2000);
	}
	
    @When("^user click on print icon$")
	public void user_click_on_print_icon() throws Throwable {
	    Object[] input=new Object[1];
	    input[0]="//*[@id='MainContent_repICNM_btnPrint_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on print icon",output.get("MESSAGE").toString());  
	}

	@When("^user click on GoTo Quotation button$")
	public void user_click_on_GoTo_Quotation_button() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_btnQuotationScreen_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on GoTo Quotation button",output.get("MESSAGE").toString());  
	}

	@Then("^user able to navigate on quotation screen and view quote$")
	public void user_able_to_navigate_on_quotation_screen() throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_repIQNM_lblSrchQuoteNb_0']";
	    input[1]="220209316";
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to navigate on quotation screen and view quote",output.get("MESSAGE").toString());  
	    SeleniumOperations.navigateBack();
	    Thread.sleep(2000);
	}
	
    @When("^user click on GoTo DebitNote button$")
	public void user_click_on_GoTo_DebitNote_button() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_btnDebitnoteScreen_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on GoTo DebitNote button",output.get("MESSAGE").toString());  
	}

	@Then("^user able to navigate on debitnote screen and view debit No$")
	public void user_able_to_navigate_on_debitnote_screen() throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_repIQNM_lblSrchQuoteNb_0']";
	    input[1]="18241";
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to navigate on quotation screen and view debit No",output.get("MESSAGE").toString());  
	    SeleniumOperations.navigateBack();
	    Thread.sleep(2000);
	}

    @When("^user click on options icon$")
	public void user_click_on_options_icon() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_GroupBTN_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on options icon",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@When("^user click on edit option$")
	public void user_click_on_edit_option() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_btnEdit_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on edit option",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@Then("^user click on update button$")
	public void user_click_on_update_button() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='btnSave']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button",output.get("MESSAGE").toString());  
	    Thread.sleep(4000);
	}

	@When("^user click on information option$")
	public void user_click_on_information_option() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_GroupBTN_0']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(1000);
		   
		Object[] input1=new Object[1];
		input1[0]="//*[@id='MainContent_repICNM_btnInfo_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on information option",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@Then("^user click on reprocess button$")
	public void user_click_on_reprocess_button() throws Throwable {
	    Object[] input1=new Object[1];
		input1[0]="//*[@id='btnReProcessMot']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on reprocess button",output.get("MESSAGE").toString());  
	    Thread.sleep(8000);
	}

	@When("^user click on email cover notes option$")
	public void user_click_on_email_cover_notes_option() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_GroupBTN_0']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(1000);
		
		Object[] input1=new Object[1];
		input1[0]="//*[@id='MainContent_repICNM_btnEmail_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on email cover notes option",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@When("^user enter \"([^\"]*)\" as email$")
	public void user_enter_as_email(String email) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtEmail']";
	    input[1]=email;
	    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as email",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}
	
    @Then("^user click on send email button$")
	public void user_click_on_send_email_button() throws Throwable {
	    Object[] input1=new Object[1];
		input1[0]="//*[@id='btnSendEmail']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on send email button",output.get("MESSAGE").toString());  
	    Thread.sleep(10000);
	}

	@When("^user click on co-insurance option$")
	public void user_click_on_co_insurance_option() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_GroupBTN_0']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(1000);
		
		Object[] input1=new Object[1];
		input1[0]="//*[@id='MainContent_repICNM_btnAllocation_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on co-insurance option",output.get("MESSAGE").toString());  
		Thread.sleep(1000);
		   
		Object[] input3=new Object[1];
		input3[0]="//*[@id='btnExitCoIns']";
		SeleniumOperations.clickOnElement(input3);
		Thread.sleep(2000);
	}

	@When("^user click on update commission option$")
	public void user_click_on_update_commission_option() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_GroupBTN_0']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(1000);
		
		Object[] input1=new Object[1];
		input1[0]="//*[@id='MainContent_repICNM_btnEditComm_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update commission option",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@When("^user enter \"([^\"]*)\" to update commission rate%$")
	public void user_enter_to_update_commission_rate(String commission) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='txtCommRate']";
	    input[1]=commission;
	    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" to update commission rate%",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@Then("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
	    Object[] input1=new Object[1];
		input1[0]="//*[@id='btnSaveCommission']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on save button",output.get("MESSAGE").toString());  
	    Thread.sleep(5000);
	}

	@When("^user click on collection reminder option$")
	public void user_click_on_collection_reminder_option() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_GroupBTN_0']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(1000);
		
		Object[] input1=new Object[1];
		input1[0]="//*[@id='MainContent_repICNM_btnDocIntimation_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on collection reminder option",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@Then("^user click on send SMS button$")
	public void user_click_on_send_SMS_button() throws Throwable {
	    Object[] input1=new Object[1];
		input1[0]="//*[@id='btnDocIntimationSAVE']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on send SMS button",output.get("MESSAGE").toString());  
	    Thread.sleep(10000);
	}

	@When("^user click on individual risknote print option$")
	public void user_click_on_individual_risknote_print_option() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_GroupBTN_0']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(1000);
		
		Object[] input1=new Object[1];
		input1[0]="//*[@id='MainContent_repICNM_btnIndRiskPrint_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on individual risknote print option",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@When("^user click on select insurer name to print$")
	public void user_click_on_select_insurer_name_to_print() throws Throwable {
		Object[] input1=new Object[1];
		input1[0]="(//*[@class='select2-chosen'])[50]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on select insurer name to print",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@When("^user enter \"([^\"]*)\" in search box$")
	public void user_enter_in_search_box(String insurerName) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=insurerName;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" in search box",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}
	
    @When("^user select ALL as insurer name$")
	public void user_select_ALL_as_insurer_name() throws Throwable {
	    Object[] input1=new Object[1];
		input1[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select ALL as insurer name",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@Then("^user click on print button$")
	public void user_click_on_print_button() throws Throwable {
	    Object[] input1=new Object[1];
		input1[0]="//*[@id='btnPrintriskNote']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on print button",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
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

	 @When("^user enter \"([^\"]*)\" as risk note number$")
	 public void user_enter_as_risk_note_number(String riskNote) throws Throwable{
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtRiskNote']";
		 input[1]=riskNote;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as risk note number$",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @And ("^user enter \"(.*)\" as risk note number \\(BrokerPortal\\)$")
	 public void user_enter_as_risk_note_number1(String riskNote) throws Throwable{
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtRiskNote']";
		 input[1]=riskNote;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"(.*)\\\" as risk note number \\\\(BrokerPortal\\\\)",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }
	 
	 @Then ("^user click on search button for the respective Risk Note for cancellation$")
	 public void user_click_on_search_button() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_btnSearch']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on options button$")
	 public void user_click_on_options_button() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@class='btn default dropdown-toggle']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on options button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	 
	@Then("^user click on cancel button to cancel the Risk note$")
	public void user_click_on_cancel_button_to_cancel_the_Risk_note() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_btnCancel_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on cancel button to cancel the Risk note",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user select Cancel & Issue credit note button$")
	public void user_select_Cancel_Issue_credit_note_button() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='rdlCreditNote']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Cancel & Issue credit note button",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as cancellation notes$")
	public void user_enter_as_cancellation_notes(String notes) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtCancelNotes']";
	    input[1]=notes;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as cancellation notes",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@Then ("^user able to view \"(.*)\" as status1$")
    public void user_enter_as_cancellation_notes1(String notes) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_repICNM_lblstatus_0']";
	    input[1]=notes;
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"(.*)\\\" as status1",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}
	
	@Then ("^user able to view \"(.*)\" as status2$")
    public void user_enter_as_cancellation_notes2(String notes) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[text()='Cancelled']";
	    input[1]=notes;
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"(.*)\\\" as status2",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}
	
	@When("^user click on preview button$")
	public void user_click_on_preview_button() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='rdlCreditNote']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on preview button",output.get("MESSAGE").toString());
		Thread.sleep(5000);
	}

	@When("^user enter \"([^\"]*)\" as refund to customer$")
	public void user_enter_as_refund_to_customer(String refundCustomer) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtRefundManualPolicyAmount']";
	    input[1]=refundCustomer;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as refund to customer",output.get("MESSAGE").toString());  
	    Thread.sleep(1000);
	}

	@When("^user click on proceed cancellation button$")
	public void user_click_on_proceed_cancellation_button() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='btnProceed']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on proceed cancellation button",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

    @Then ("^user able to view status as \"(.*)\"$")
	public void user_able_to_view_as_status2(String cancel) throws Throwable {
		Object[] input=new Object[2];
	    input[0]="//*[text()='Cancellation Approval Required']";
	    input[1]=cancel;
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view status as \\\"(.*)\\\"",output.get("MESSAGE").toString());  
	}
	
	@When ("^user enter \"(.*)\" as username$")
	public void sendUserName(String username){
		 Object[] input2=new Object[2];
	     input2[0]="//*[@id='usercode']";
	     input2[1]=username;
	     Hashtable<String, Object> output2 = SeleniumOperations.sendKeys(input2);
	     HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user enter username$",output2.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as password$")
	public void sendPassword(String password){
		 Object[] input2=new Object[2];
	     input2[0]="//*[@id='password']";
	     input2[1]=password;
	     Hashtable<String, Object> output2 = SeleniumOperations.sendKeys(input2);
	     HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user enter password$",output2.get("MESSAGE").toString());
	}

	@When ("^user navigate on operation dropdown menu \\(InsurerPortal\\)$")
	public void operationMenu(){
		Object[] input2=new Object[2];
	    input2[0]="//*[@id='MOD_INS_OPERATIONS']";
	    Hashtable<String, Object> output2 = SeleniumOperations.actionClass(input2);
	    HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user navigate on operation dropdown menu //(InsurerPortal//)",output2.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as url$")
	public void sendPassword1(String password) {
		Object[] input2=new Object[1];
	    input2[0]=password;
	    SeleniumOperations.openApplicationinsurer(input2);
	}
	
	@When("^user click on branch dropdown$")
	public void user_click_on_branch_dropdown() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="(//*[@class='select2-chosen'])[1]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on proceed cancellation button",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as branch$")
	public void user_enter_as_branch(String branch) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=branch;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Uchumi Commercial Bank\" as collecting bank",output.get("MESSAGE").toString());  
	}
	
    @Then("^user select All as branch$")
	public void user_select_All_as_branch() throws Throwable {
	    Object[] input1=new Object[1];
		input1[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select ALL as insurer name",output.get("MESSAGE").toString());  
	    Thread.sleep(2000);
	}

	@Then ("^user click on accept button$")
	public void user_select_accept() throws Throwable {
		Object[] input2=new Object[1];
	    input2[0]="//*[@id='btnApprove']";
		SeleniumOperations.clickOnElement(input2);
		
		Object[] input1=new Object[1];
		input1[0]="//*[@id='btnApprove']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on accept button",output.get("MESSAGE").toString());  
		Thread.sleep(5000);
	    SeleniumOperations.transfer();
	}
	
	@When("^user click on display icon insurer$")
	public void user_click_on_display_icon1() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_btnDisplay_0']";
		SeleniumOperations.clickOnElement(input);
	    Thread.sleep(2000);
    }
	
	@When ("^user open new tab$")
	public void tab() throws InterruptedException {
		SeleniumOperations.tab();
		Thread.sleep(2000);
	}

	@When("^user click on dropdown$")
	public void user_click_on_dropdown() throws Throwable {
	    Object[] input1=new Object[1];
		input1[0]="(//*[@class='select2-chosen'])[2]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on dropdown",output.get("MESSAGE").toString());  
	}

	@When("^user select Cancel Advice to Customer to print report$")
	public void user_select_Cancel_Advice_to_Customer_to_print_report() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@CLASS='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Cancel Advice to Customer to print report",output.get("MESSAGE").toString()); 
		Thread.sleep(2000);
	}

	@When("^user click on print option for getting complete information of policy cancellation and refund$")
	public void user_click_on_print_option_for_getting_complete_information_of_policy_cancellation_and_refund() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repICNM_btnPrint_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on print option for getting complete information of policy cancellation and refund",output.get("MESSAGE").toString()); 
		Thread.sleep(2000);
	}

	@Then("^user able to view Cancel Advice to Customer report$")
	public void user_able_to_view_Cancel_Advice_to_Customer_report() throws Throwable {
	   
	}

	@When("^user select Cancel Advice to Insurer to print report$")
	public void user_select_Cancel_Advice_to_Insurer_to_print_report() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@CLASS='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Cancel Advice to Insurer to print report",output.get("MESSAGE").toString()); 
		Thread.sleep(2000);
	}

	@Then("^user able to view Cancel Advice to Insurer report$")
	public void user_able_to_view_Cancel_Advice_to_Insurer_report() throws Throwable {
	   
	}
}

	 
	    