package cucumberMapclientCreation;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class EditClientDetails {
	
	@When("user click on client menu")
	public void user_click_on_client_menu1() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='MNU_WFCLNT_2']", "CLICK","user click on client menu",0);
	}
	
	/*@When("user click on client menu")
	public void user_click_on_client_menu1() {
	   Object[] input = new Object[2];
	   input[0]="//*[@id='MNU_WFCLNT_2']";
	   SeleniumOperations.clickOnElement(input);
	}*/
	
	@When("user search {string} as name")
	public void user_search_as_name(String name) throws InterruptedException{
		Itl.CustomSendEvent("//*[@id='txtSrchName']",name , "TEXTBOX","user search {string} as name", 2000);
	}
	
	/*@When("user search {string} as name")
	public void user_search_as_name(String name) throws InterruptedException {
		Object[] input = new Object[2];
		input[0]="//*[@id='txtSrchName']";
		input[1]=name;
		SeleniumOperations.sendKeys(input);
		Thread.sleep(2000);
	}*/
	
	@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
	Itl.CustomClickEvent("//*[@id='MainContent_btnSearch']", "CLICK","user click on search button", 3000);
	}
	/*@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		 Object[] input = new Object[2];
		   input[0]="//*[@id='MainContent_btnSearch']";
		   SeleniumOperations.clickOnElement(input);
		   Thread.sleep(3000);
	}*/
	
	
	@When("user select edit icon")
	public void user_select_edit_icon() throws InterruptedException {
		Itl.CustomClickEvent("(//*[@class='DisplayData fa fa-edit'])[1]", "CLICK","user select edit icon", 2000);
	}
	/*@When("user select edit icon")
	public void user_select_edit_icon() throws InterruptedException {
		Object[] input = new Object[2];
		   input[0]="(//*[@class='DisplayData fa fa-edit'])[1]";
		   SeleniumOperations.clickOnElement(input);
		   Thread.sleep(2000);
	}*/
	
	@When("user enter {string} as address")
	public void user_enter_as_address(String address) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtAddress']", address, "TEXTBOX","user enter {string} as address", 0);
	}
	/*@When("user enter {string} as address")
	public void user_enter_as_address(String address) {
		Object[] input = new Object[2];
		   input[0]="//*[@id='MainContent_txtAddress']";
		   input[1]=address;
		   SeleniumOperations.clearAndEnter(input);
	}*/
	
	@When("user click on update button")
	public void user_click_on_update_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']", "CLICK","user click on update button", 0);
	}
	/*@When("user click on update button")
	public void user_click_on_update_button() {
		Object[] input = new Object[2];
		   input[0]="//*[@id='btnSave']";
		   SeleniumOperations.clickOnElement(input);
	}*/
	
	@Then("user navigate on client screen")
	public void user_navigate_on_client_screen() throws InterruptedException {
		Itl.CustomValidationEvent("//*[text()='CLIENT']", "CLIENT", "VALIDATION","user navigate on client screen", 0);
	}
	/*@Then("user navigate on client screen")
	public void user_navigate_on_client_screen() {
		Object[] input = new Object[2];
		   input[0]="//*[text()='CLIENT']";
		   input[1]="CLIENT";
		   Hashtable<String, Object> output =  SeleniumOperations.validation(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user navigate on client screen", output.get("MESSAGE").toString());
	}*/
}
