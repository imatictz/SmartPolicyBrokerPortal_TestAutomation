package cucumberMap22PolicyCancellation;

import java.util.Hashtable;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class PolicyCancellation {

	
	@When("^user select \"([^\"]*)\" as from date$")
	 public void user_select_as_date_from(String dateFrom) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtSrchFromDate']";
		 input[1]=dateFrom;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \"01/01/2023\" as from date",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() 
	{
		Object[] input7=new Object[1];
	input7[0]="//*[@id='MOD_OPERATIONS']";
	SeleniumOperations.actionClass(input7);
	   
	}
	
	@Then("^user select risk note menu$")
	public void user_select_risk_note_menu() throws Throwable {
	    Object[] input9=new Object[1];
		input9[0]="(//*[text()='Risk Note '])[1]";
		SeleniumOperations.clickOnElement(input9);
	}
	
	@And ("^user click on login button$")
	 public void clickOnLoginButton()
	 {
		 Object[] input4=new Object[1];
	      input4[0]="//*[text()='Login']";
	  SeleniumOperations.clickOnElement(input4);
	 }

	 @When("^user enter \"([^\"]*)\" as risk note number$")
	 public void user_enter_as_risk_note_number(String riskNote) throws Throwable{
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtRiskNote']";
		 input[1]=riskNote;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as risk note number$",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
		 Itl.CustomClear("//*[@id='MainContent_txtUserId']", "CLICK", 0);
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
	    Itl.CustomClickEvent("//*[@id='btnApprove']", "user click on accept button", "CLICK", 5000);
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
	
	@Then ("^user able to view \"(.*)\" as status after proceed cancellation$")
	public void statusAfterProceed(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@class='Status']",status , "user able to view \\\"(.*)\\\" as status after proceed cancellation$","VALIDATION", 2000);
	}
	
	@Then ("^user able to view \"(.*)\" as status for risk note no$")
	public void statusAtInsurer(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='MainContent_repICNM_lblstatus_0']",status , "user able to view \\\"(.*)\\\" as status for risk note no","VALIDATION", 2000);
	}
	
	@Then ("^user able to view \"(.*)\" as status after internal approval$")
	public void statusAtBrokerAfterInternalApproval(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='MainContent_repICNM_lblstatus_0']",status , "user able to view \\\"(.*)\\\" as status for risk note no","VALIDATION", 2000);
	}
}
