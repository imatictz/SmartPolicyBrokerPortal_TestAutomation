package cucumberMap38CompanyManagement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class ManageSequences {

	@Then("user click on Manage Sequences option")
	public void user_click_on_company_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span43']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	@When("user enter {string} as Client Number")
	public void user_enter_as_client_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtClient']",
				number, 
				"user enter {string} as Client Number",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Quote Number")
	public void user_enter_as_quote_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtQuote']",
				number, 
				"user enter {string} as Quote Number",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Debit Note Number")
	public void user_enter_as_debit_note_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtDebitNo']",
				number, 
				"user enter {string} as Debit Note Number",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Payment Number")
	public void user_enter_as_payment_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtPayment']",
				number, 
				"user enter {string} as Payment Number",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Receipt Number")
	public void user_enter_as_receipt_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtPayment']",
				number, 
				"user enter {string} as Receipt Number",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Risk Note Number")
	public void user_enter_as_risk_note_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtRiskNote']",
				number, 
				"user enter {string} as Risk Note Number",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Credit Note Number")
	public void user_enter_as_credit_note_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtCredit']",
				number, 
				"user enter {string} as Credit Note Number",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Claim Number")
	public void user_enter_as_claim_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtCredit']",
				number, 
				"user enter {string} as Claim Number",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Customer Tax Invoice")
	public void user_enter_as_customer_tax_invoice(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtCustomerNb']",
				number, 
				"user enter {string} as Customer Tax Invoice",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Insurer Tax Invoice")
	public void user_enter_as_insurer_tax_invoice(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtInsurerNb']",
				number, 
				"user enter {string} as Insurer Tax Invoice",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Voucher Number")
	public void user_enter_as_voucher_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtInsurerNb']",
				number, 
				"user enter {string} as Voucher Number",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Purchase Order")
	public void user_enter_as_purchase_order(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtInsurerNb']",
				number, 
				"user enter {string} as Purchase Order",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Purchase Invoice")
	public void user_enter_as_purchase_invoice(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtPurchaseInvoice']",
				number, 
				"user enter {string} as Purchase Invoice",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as General Ledger")
	public void user_enter_as_general_ledger(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtGeneralLedger']",
				number, 
				"user enter {string} as General Ledger",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Supplier Number")
	public void user_enter_as_supplier_number(String number) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtsupplierNb']",
				number, 
				"user enter {string} as Supplier Number",
				"TEXTBOX", 
				0);
	}
}
