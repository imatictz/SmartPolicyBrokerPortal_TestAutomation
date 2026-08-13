package cucumberMap39CommissionManagement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class IncentivePercentage {

	@Then("user click on Incentive Percentage option")
	public void user_click_on_commission_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span66']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user select {string} as date to")
	public void user_select_as_date_to(String date) throws InterruptedException {
		Itl.ClickEvent("//*[@id='MainContent_txtDateTo']", "CLICK", 0);
		Itl.CustomClearEvent("//*[@id='MainContent_txtDateTo']", "CLEAR", 1000);
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtDateTo']",
				date, 
				"user select {string} as date to",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Zone %")
	public void user_enter_as_zone(String Zone) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtZonePer']",
				Zone, 
				"user enter {string} as Zone %",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Region %")
	public void user_enter_as_region(String Region) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtRegionPer']",
				Region, 
				"user enter {string} as Region %",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Branch %")
	public void user_enter_as_branch(String Branch) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtBrnmPer']",
				Branch, 
				"user enter {string} as Branch %",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Sales Officer %")
	public void user_enter_as_sales_officer(String Officer) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtThppPer']",
				Officer, 
				"user enter {string} as Sales Officer %",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Head Office %")
	public void user_enter_as_head_office(String Office) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtHeadOffPer']",
				Office, 
				"user enter {string} as Head Office %",
				"TEXTBOX", 
				0);
	}
	@Then("user able to view {string} as status\\(Incentive Percentage)")
	public void user_able_to_view_as_status_incentive_percentage(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]",
        		status, 
        		"user able to view {string} as status\\\\(Incentive Percentage)",
        		"VALIDATION",
        		2000);
	}
}
