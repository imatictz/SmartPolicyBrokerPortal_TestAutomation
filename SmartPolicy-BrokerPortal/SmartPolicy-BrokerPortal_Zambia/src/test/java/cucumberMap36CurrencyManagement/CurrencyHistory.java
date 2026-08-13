package cucumberMap36CurrencyManagement;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class CurrencyHistory {

	@Then("user click on currency history option")
	public void user_click_on_currency_history_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='span_currencyHistory_lc']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user select {string} as currency")
	public void user_select_as_currency(String currency) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCurrency')]", 
				"//*[@class='select2-search__field']", 
				currency , 
				"(//*[contains(@data-select2-id,'MainContent_cmbCurrency')])[2]", 
				"user select {string} as currency", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as currency to search")
	public void user_select_as_currency_search(String currency) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSrchCcy')]", 
				"//*[@class='select2-search__field']", 
				currency , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSrchCcy')])[2]", 
				"user select {string} as currency to search", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as date")
	 public void user_select_as_date(String date) throws Throwable {
		Itl.CustomClearEvent("//*[@id='MainContent_txtDate']", "CLEAR", 0);
		Itl.ClickEvent("//*[@id='MainContent_txtDate']", "CLICK", 0);
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtDate']",
				date, 
				"user select {string} as date",
				"TEXTBOX", 
				0);
	 }
	@When("user select {string} as from date")
	public void user_enter_as_ccy_rate(String date) throws InterruptedException {
		//Itl.CustomClearEvent("//*[@id='MainContent_txtSrchFromDate']", "CLEAR", 0);
		//Itl.ClickEvent("//*[@id='MainContent_txtSrchFromDate']", "CLICK", 0);
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchFromDate']",
				date, 
				"user select {string} as from date",
				"TEXTBOX", 
				0);
	}
	@When("user clicks on edit icon")
	public void user_clicks_on_edit_option1() throws InterruptedException {
	    Itl.CustomClickEvent("(//*[@class='DisplayData fa fa-edit'])[1]",
	    		"user clicks on edit option", 
	    		"CLICK",
	    		2000);
	}
}
