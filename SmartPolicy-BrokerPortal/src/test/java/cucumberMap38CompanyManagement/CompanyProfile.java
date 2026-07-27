package cucumberMap38CompanyManagement;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class CompanyProfile {

	@When("user navigate on Setup dropdown")
	public void user_navigate_on_setup_dropdown() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_SETUP']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}
	@When("user navigate on company management option")
	public void user_navigate_on_companyoption() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='span_companyManagement_lc']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(4000);
	}
	@Then("user click on company profile option")
	public void user_click_on_company_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='span_companyProfile_lc']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	
	@When("user enter {string} as company name")
	public void user_enter_as_company_name(String companyName) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtCompName']",
				companyName, 
				"user enter {string} as company name",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as for name")
	public void user_enter_as_for_name(String name) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtForName']",
				name, 
				"user enter {string} as for name",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Telephone 1")
	public void user_enter_as_telephone(String Telephone) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtCompTel1']",
				Telephone, 
				"user enter {string} as Telephone 1",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Address 1")
	public void user_enter_as_address(String Address) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtAddress1']",
				Address, 
				"user enter {string} as Address 1",
				"TEXTBOX", 
				0);
	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@ID='btnSave']", 
	    		"user click on save button", 
	    		"CLICK",
	    		2000);
	}
	@Then("user able to view {string} as message after edit")
	public void user_able_to_view_as_message_after_edit(String validation) throws InterruptedException {
			Object[] input=new Object[2];
			input[0]="(//*[@class='messenger-message-inner'])[1]";
			input[1]=validation;
			Hashtable<String,Object> output=SeleniumOperations.validation(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view {string} message",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}
	}

