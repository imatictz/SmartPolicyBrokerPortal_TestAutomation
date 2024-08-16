package cucumberMap19Payment;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Payment {
	@When ("^user navigate on operation dropdown$")
 	public void user_navigate_on_operation_dropdown_menu() {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	}

	@When ("^user navigate on payment option$")
	public void PaymentOption() {
		Object[] input = new Object[1];
		input[0]="//*[@id='MNU_PAYMENT']";
		SeleniumOperations.actionClass(input);
	}
	
 	@Then("^user click on payment option$")
 	public void user_click_on_payment_option() throws Throwable {
 	    Object[] input4=new Object[1];
	    input4[0]="//*[@id='MNU_wfCTXN_PAY']";
	    SeleniumOperations.clickOnElement(input4);
 	}

 	@When("^user click on add button to enter payment details$")
 	public void user_click_on_add_button_to_enter_payment_details() throws Throwable {
 	    Object[] input4=new Object[1];
	    input4[0]="//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input4);
 	}

 	@When("^user click on insurer name dropdown$")
 	public void user_click_on_insurer_name_dropdown() throws Throwable {
 	    Object[] input=new Object[1];
		input[0]="(//*[@class='select2-chosen'])[2]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insurer name dropdown",output.get("MESSAGE").toString());
		Thread.sleep(2000);
 	}

 	@When("^user enter \"([^\"]*)\" as insurer name$")
 	public void user_enter_as_insurer_name(String insurerName) throws Throwable {
 	    Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=insurerName;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as insurer name",output.get("MESSAGE").toString());
	}

 	@Then("^user select Alliance Insurance Company \\(T\\) Ltd as insurer name$")
 	public void user_select_Alliance_Insurance_Company_T_Ltd_as_insurer_name() throws Throwable {
 	    Object[]input=new Object[1];
		input[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Alliance Insurance Company \\\\(T\\\\) Ltd as insurer name",output.get("MESSAGE").toString());
		Thread.sleep(2000);
 	}

 	@When("^user enter \"([^\"]*)\" as amount$")
 	public void user_enter_as_amount(String amount) throws Throwable {
 	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtAmount']";
	    input[1]=amount;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as amount",output.get("MESSAGE").toString());
	}

 	@When("^user click on mode dropdown$")
 	public void user_click_on_mode_dropdown() throws Throwable {
 	    Object[] input=new Object[1];
		input[0]="(//*[@class='select2-chosen'])[4]";
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
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as mode",output.get("MESSAGE").toString());
	}

 	@Then("^user select Card Payment as mode$")
 	public void user_select_Card_Payment_as_mode() throws Throwable {
 	    Object[]input=new Object[1];
		input[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Card Payment as mode",output.get("MESSAGE").toString());
		Thread.sleep(2000);
 	}

 	@When("^user enter \"([^\"]*)\" as Cheque/ Reference Number$")
 	public void user_enter_as_Cheque_Reference_Number(String chequeRefNo) throws Throwable {
 	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtRefNB']";
	    input[1]=chequeRefNo;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Cheque/ Reference Number",output.get("MESSAGE").toString());
	}

 	@When("^user enter \"([^\"]*)\" as notes$")
 	public void user_enter_as_notes(String notes) throws Throwable {
 	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtNotes']";
	    input[1]=notes;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as notes",output.get("MESSAGE").toString());
	}

 	@When("^user click on bank details dropdown$")
 	public void user_click_on_bank_details_dropdown() throws Throwable {
 	    Object[] input=new Object[1];
		input[0]="(//*[@class='select2-chosen'])[5]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on bank details dropdown",output.get("MESSAGE").toString());
		Thread.sleep(2000);
 	}

 	@When("^user enter \"([^\"]*)\" as bank details$")
 	public void user_enter_as_bank_details(String bankDetails) throws Throwable {
 	    Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=bankDetails;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as bank details",output.get("MESSAGE").toString());
	}

 	@Then("^user select UBL Bank \\(TZS\\) as bank details$")
 	public void user_select_UBL_Bank_TZS_as_bank_details() throws Throwable {
 	    Object[]input=new Object[1];
		input[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select UBL Bank \\\\(TZS\\\\) as bank details",output.get("MESSAGE").toString());
		Thread.sleep(2000);
 	}

 	@When("^user enter \"([^\"]*)\" as refrence id$")
 	public void user_enter_as_refrence_id(String refrenceId) throws Throwable {
 	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtAcctRefId']";
	    input[1]=refrenceId;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as refrence id",output.get("MESSAGE").toString());
	}

 	@Then("^user enter \"([^\"]*)\" as insurer payment refrence id$")
 	public void user_enter_as_insurer_payment_refrence_id(String insurerPayRefrenceId) throws Throwable {
 	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtInsurerPaymetId']";
	    input[1]=insurerPayRefrenceId;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as insurer payment refrence id",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
 	}

 	@Then("^user click on save button$")
 	public void user_click_on_save_button() throws Throwable {
 	    Object[]input=new Object[1];
		input[0]="//*[@id='btnSave']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on save button",output.get("MESSAGE").toString());
		Thread.sleep(2000);
 	}
 	
 	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status(String status) throws Throwable {
	    Object[] input=new Object[2];
		input[0]="(//*[text()='Pending'])[2]";
		input[1]=status;
		Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"([^\\\"]*)\\\" as status",output.get("MESSAGE").toString());
	}
}
