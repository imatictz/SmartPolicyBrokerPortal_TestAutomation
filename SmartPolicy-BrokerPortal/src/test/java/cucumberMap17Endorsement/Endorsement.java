package cucumberMap17Endorsement;

import java.util.Hashtable;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
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
	 
	 @Then("^user select risk note menu$")
		public void user_select_risk_note_menu() throws Throwable {
		    Object[] input9=new Object[1];
			input9[0]="//*[@id='span_riskNote_lc']";
			SeleniumOperations.clickOnElement(input9);
		}
	 
	 @When("^user navigate on endorsement menu$")
	 public void user_navigate_on_endorsement_menu() throws Throwable {
		 Object[] input7=new Object[1];
	     input7[0]="//*[@id='span_Endorsement_lc']";
	     SeleniumOperations.actionClass(input7);
	     Thread.sleep(2000);
	 }

	 @When("^user click on endorsement option$")
	 public void user_click_on_endorsement_option() throws Throwable {
		 Object[] input7=new Object[1];
	     input7[0]="//*[@id='span_EndrosementL_lc']";
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
		 input7[0]="//*[contains(@aria-controls,'MainContent_cmbPopEndorsementType')]";
		 SeleniumOperations.clickOnElement(input7);
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as endorsement type$")
	 public void user_enter_as_endorsement_type(String endorsementType) throws Throwable {
	     Object[] input=new Object[2];
	     input[0]="//*[@class='select2-search__field']";
	     input[1]=endorsementType;
	     SeleniumOperations.sendKeys(input);
	     Thread.sleep(2000);
	 }

	 @When("^user select General Endorsements as endorsement type$")
	 public void user_select_General_Endorsements_as_endorsement_type() throws Throwable {
		 Object[] input7=new Object[1];
		 input7[0]="(//*[contains(@data-select2-id,'-MainContent_cmbPopEndorsementType')])[2]";
		 SeleniumOperations.clickOnElement(input7);
		 Thread.sleep(2000); 
	 }
	 
	 @When("^user select educare Endorsements as endorsement type$")
	 public void user_select_educare_Endorsements_as_endorsement_type() throws Throwable {
		 Object[] input7=new Object[1];
		 input7[0]="(//*[contains(@data-select2-id,'-MainContent_cmbPopEndorsementType')])[2]";
		 SeleniumOperations.clickOnElement(input7);
		 Thread.sleep(2000); 
	 }
	 
	 @When ("^user select Medical Endorsement as endorsement type$")
	 public void user_select_Medical_Endorsements_as_endorsement_type() throws Throwable {
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
		    Itl.CustomClickEvent("//*[@id='btnEdit']", "user click on edit icon to make financial changes", "CLICK", 2000);

	 }
	 
	 @When ("^user click on select option to edit details$")
	 public void user_click_on_select_icon_to_make_financial_changes() throws Throwable {
		    Itl.CustomClickEvent("//*[@class='DisplayData fa fa-edit']", "user click on select option to edit details", "CLICK", 2000);

	 }
	 @When("user enter {string} as change value of Annual Salary\\/Limit of Liability")
	 public void user_enter_as_change_value_of_annual_salary_limit_of_liability(String amount) throws InterruptedException {
		 Itl.CustomClearSendEvent(
	                "//input[@id='MainContent_txtAnnualSalary']",
	                amount,
	                "Enter Annual Salary/Limit of Liability",
	                "TEXTBOX",
	                0
	        );
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
	 Thread.sleep(2000);
	 }

	 @When("^user click on process endorsement button$")
	 public void user_click_on_process_endorsement_button() throws Throwable {
		Itl.CustomClickEvent("//*[@id='btnSave']", "user click on process endorsement button", "CLICK", 2000);
		Thread.sleep(2000);
	 }
	 
	 @When("^user select on process endorsement button$")
	 public void user_select_on_process_endorsement_button() throws Throwable {
		Itl.CustomClickEvent("//*[@id='MainContent_btnSave']", "user select on process endorsement button", "CLICK", 2000);
		Thread.sleep(2000);
	 }

	 @When("^user click on OK button to process endorsement$")
	 public void user_click_on_OK_button_to_process_endorsement() throws Throwable {
		 Hashtable<String,Object> output= SeleniumOperations.alert();
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on OK button to process endorsement",output.get("MESSAGE").toString());
	     Thread.sleep(2000);
	 }

	 
	 
	 	 
	 @When("^user click on actions button$")
	 public void user_click_on_options_button() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='sort_table']/tbody/tr[1]/td[11]/*[2]";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on options button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on capture receipt icon$")
		public void user_click_on_capture_receipt_icon() throws Throwable {
			Object[] input=new Object[1];
			input[0]="//*[@id='sort_table']/tbody/tr[1]/td[11]/*[2]/*[2]/*[2]";
			Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on capture receipt icon",output.get("MESSAGE").toString());
			Thread.sleep(3000);
		}
		
	
			
		@When("user select {string} as mode")
		public void user_select_as_mode(String mode) throws InterruptedException {
		    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbMode')]", "//*[@class='select2-search__field']", mode , "(//*[contains(@data-select2-id,'MainContent_cmbMode')])[2]", "user select {string} as mode", "DROPDOWN", 2000);

		}
		@When("user select {string} as issuer bank")
		public void user_select_as_issuer_bank(String issuerBank) throws InterruptedException {
		    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbClientBank')]", "//*[@class='select2-search__field']", issuerBank , "(//*[contains(@data-select2-id,'MainContent_cmbClientBank')])[2]", "user select {string} as issuer bank", "DROPDOWN", 2000);

		}
		@When("user enter {string} as Cheque\\/ Reference Number")
		public void user_enter_as_cheque_reference_number(String refNumber) throws InterruptedException {
		    Itl.CustomSendEvent("//*[@id='MainContent_txtRefNB']", refNumber, "user enter {string} as Cheque\\\\/ Reference Number", "TEXTBOX", 0);	
		    
		}
		@When("user select {string} as collecting bank")
		public void user_select_as_collecting_bank(String collectingBank) throws InterruptedException {
		    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsurerBank')]", "//*[@class='select2-search__field']", collectingBank , "(//*[contains(@data-select2-id,'MainContent_cmbInsurerBank')])[2]", "user select {string} as collecting bank", "DROPDOWN", 2000);

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
		    Thread.sleep(2000);
		}

	 @When("^user click on process endorsement icon$")
	 public void user_click_on_process_endorsement_icon() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@class='IssueRiskNote grid_btnSpace']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on process endorsement icon",output.get("MESSAGE").toString()); 
	 Thread.sleep(2000);
	 }

	 @When("^user click on YES button for confirmation$")
	 public void user_click_on_YES_button_for_confirmation() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='btnProcedeRiskNote']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on YES button for confirmation",output.get("MESSAGE").toString()); 
		 Thread.sleep(6000);
	 }

	 

	 //Non Financial Endorsement
	 
	 @When ("^user select non-financial endorsement$")
	 public void selectNonFinancialEndorsement() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@id='chkNofinancial']", "user select non-financial endorsement", "CLICK", 2000);
		 SeleniumOperations.scrollUp();
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
	 
	 @When ("^user open new tab$")
		public void tab() throws InterruptedException {
			SeleniumOperations.tab();
			Thread.sleep(2000);
		}
	 
	 @When ("^user enter \"(.*)\" as url$")
		public void sendPassword1(String password) {
			Object[] input2=new Object[1];
		    input2[0]=password;
		    SeleniumOperations.openApplicationinsurer(input2);
		}
	 
	 @When ("^user enter \"(.*)\" as username$")
		public void sendUserName(String username){
			Object[] input2=new Object[2];
		    input2[0]="//*[@id='usercode']";
		    input2[1]=username;
		    SeleniumOperations.sendKeys(input2);
		}
		
		@When ("^user enter \"(.*)\" as password$")
		public void sendPassword(String password){
			Object[] input2=new Object[2];
		    input2[0]="//*[@id='password']";
		    input2[1]=password;
		    SeleniumOperations.sendKeys(input2);
		}
		
		@And ("^user click on login button$")
		 public void clickOnLoginButton()
		 {
			 Object[] input4=new Object[1];
		      input4[0]="//*[@id='btnLogin']";
		  SeleniumOperations.clickOnElement(input4);
		 }
		
		@When ("^user navigate on operation dropdown menu \\(InsurerPortal\\)$")
		public void operationMenu(){
			Object[] input2=new Object[2];
		    input2[0]="//*[@id='MOD_INS_OPERATIONS']";
		    Hashtable<String, Object> output2 = SeleniumOperations.actionClass(input2);
		    HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user navigate on operation dropdown menu //(InsurerPortal//)",output2.get("MESSAGE").toString());
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
		
		
		@When("user navigate on pending approvals option")
		public void user_navigate_on_pending_approvals_option() throws Throwable {
		    Itl.CustomClickEvent("//*[@id='MNU_APPROVAL']", "user navigate on pending approvals option", "CLICK", 2000);

		}
		@Then("user click on endorsement approval option")
		public void user_click_on_endorsement_approval_option() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='span_endorApprv_lc']", "user click on endorsement approval option", "CLICK", 4000);
		}
		@When("user click on display icon")
		public void user_click_on_display_icon() throws InterruptedException {
		    Itl.CustomClickEvent("(//*[@class='DisplayData fa fa-desktop'])[1]", "user click on display icon", "CLICK", 2000);

		}
		@Then("user click on approve endorsement button")
		public void user_click_on_approve_endorsement_button() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='btnApproveEndorse']", "user click on approve endorsement button", "CLICK", 5000);
            
		}
		@When ("^user enter \"(.*)\" as change value of sum assured$")
		public void enterSumAssured(String sumAssured) throws InterruptedException {
            Itl.CustomClearSendEvent("//*[@id='MainContent_txtSumInsured']",sumAssured ,"user enter \\\"(.*)\\\" as change value of sum assured", "TEXTBOX", 2000);
		}
		
		@When ("^user enter \"(.*)\" as change value of sum insured$")
		public void enterSumInsurred(String sumInsured) throws InterruptedException {
            Itl.CustomClearSendEvent("//*[@id='MainContent_txtFltSumInsured']",sumInsured ,"user enter \\\"(.*)\\\" as change value of sum assured", "TEXTBOX", 2000);
		}
		
		
		@When ("^user enter \"(.*)\" as change value of total premium$")
		public void enterTotalPremium(String totalPremium) throws InterruptedException {
            Itl.CustomClearSendEvent("//*[@id='MainContent_txtGrossPremium']",totalPremium ,"user enter \\\"(.*)\\\" as change value of total premium", "TEXTBOX", 2000);
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
		
		@When ("user click on search button to find {string} risk note")
		 public void user_click_on_search_button_quoteNo1(String risknote) throws Throwable {
			 Object[] input=new Object[1];
			 input[0]="//*[@id='button_btnSearch_lc']";
			 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
			 Thread.sleep(3000);
			 SeleniumOperations.getRiskNote(risknote);
			 Thread.sleep(4000);
		 }
		
		@When ("user click on search button")
		 public void user_click_on_search_button_quoteNo() throws Throwable {
			 Object[] input=new Object[1];
			 input[0]="//*[@id='span_btnSearch_lc']";
			 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
			 Thread.sleep(3000);
		 }
		
		@When ("user click on search button\\(Insurer)")
		public void user_click_on_search_button() throws Throwable {
			 Object[] input=new Object[1];
			 input[0]="//*[@id='button_btnSearch_lc']";
			 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
			 Thread.sleep(3000);
		 }
		
		@When ("user enter risk note number to search policy")
		public void user_enter_as_quote_number() throws InterruptedException {
			String risknoteNo = SeleniumOperations.getStoredRiskNote();
			Itl.CustomSendEvent("//*[@id='txtRiskNote']", risknoteNo, "user enter risk note number to search policy", "TEXTBOX", 0);
			Thread.sleep(4000);
		}
		
		
		@When ("user enter risk note number")
		public void user_enter_as_risk_number() throws InterruptedException {
			String risknoteNo = SeleniumOperations.getStoredRiskNote();
			Itl.CustomSendEvent("//*[@id='MainContent_txtRiskNote']", risknoteNo, "user enter risk note number", "TEXTBOX", 0);
			Thread.sleep(4000);
		}
		
		@Then ("user able to view {string} as status")
		public void statusAtInsurer(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]",status , "user able to view {string} as status","VALIDATION", 2000);
		}
		
		@Then("user able to view {string} as status\\(Insurer)")
		public void user_able_to_view_as_status_insurer(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]",status , "user able to view {string} as status\\\\(Insurer)","VALIDATION", 2000);

		}
		
		@Then ("user navigate on Endorsement Approval screen")
		public void user_navigate_on_screen() throws InterruptedException {
			Itl.CustomValidationEvent("//*[@id='h4_lblEndorsement_lc']", "Endorsement", "user navigate on Endorsement Approval screen", "VALIDATION", 2000);
			SeleniumOperations.transfer();
			Thread.sleep(4000);
		}
}
