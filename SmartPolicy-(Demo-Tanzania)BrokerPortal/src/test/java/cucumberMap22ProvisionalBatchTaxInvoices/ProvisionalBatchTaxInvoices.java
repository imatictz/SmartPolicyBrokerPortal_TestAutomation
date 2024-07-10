package cucumberMap22ProvisionalBatchTaxInvoices;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class ProvisionalBatchTaxInvoices {

	@When("user navigate on operation dropdown menu")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    
	      Object[] input = new Object[2];
	      input[0]="//*[@id='MOD_OPERATIONS']";
	      SeleniumOperations.actionClass(input);
	}
	@When("user click on Provisional Batch Tax Invoices option")
	public void user_click_on_provisional_batch_tax_invoices_option() throws InterruptedException {
		Object[] input = new Object[2];
	      input[0]="//*[@id='MNU_wfBCTXN']";
	      SeleniumOperations.clickOnElement(input);
	      Thread.sleep(2000);

	}
	@When("user click on add button")
	public void user_click_on_add_button() throws InterruptedException {
		Object[] input = new Object[2];
	      input[0]="//*[@id='MainContent_btnAdd']";
	      SeleniumOperations.clickOnElement(input);
	      Thread.sleep(2000);
	}
	@When("user select {string} as insurer name")
	public void user_select_as_insurer_name(String insurerName) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbInsurer']", "//*[@class='select2-input select2-focused']", insurerName , "//*[@class='select2-match']", "user select {string} as insurer name", "DROPDOWN", 2000);
	}
	@When("user enter {string} as date from")
	public void user_enter_as_date_from(String dateFrom) throws InterruptedException {
	    Itl.CustomClearSendEvent("//*[@id='MainContent_txtFromDate']", dateFrom, "user enter {string} as date from", "TEXTBOX", 0);
	}
	@When("user select {string} as category")
	public void user_select_as_category(String category) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbCategory']", "//*[@class='select2-input select2-focused']", category , "//*[@class='select2-match']", "user select {string} as category", "DROPDOWN", 2000);

	}
	@Then("user click on fetch button")
	public void user_click_on_fetch_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='BtnFetch']", "user click on fetch button", "CLICK", 2000);
	/*Object[] input = new Object[2]; selectall BtnFetch
	input[0] = "//*[@id='MainContent_txtGrossCommission']";
			//"//*[@id='grdBatchTaxInvoice']/tbody//td[10]";
			 * MainContent_grdBatchTaxInvoice_chkUnAllocateRecpt_11
			 
	    SeleniumOperations.test(input);*/
	}
	
	@When("user click on checkbox to select commission")
	public void user_click_on_checkbox_to_select_commission() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='grdBatchTaxInvoice']/tbody/tr[1]/td[13]", "user click on checkbox to select commission", "CLICK", 7000);
	    Itl.CustomGstPercentValidation("//*[@id='MainContent_txtGrossCommission']", "//*[@id='MainContent_txtVATonCommission']", "//*[@id='MainContent_txtTotalCommission']", "GSTVALIDATION", 0);
        
	}
	
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='MainContent_btnSave']", "user click on save button", "CLICK", 18000);

	}
	
	@Then("user able to view {string} as status")
	public void user_able_to_view_as_status(String status) throws InterruptedException {
	    Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[11]", status, "user able to view {string} as status", "VALIDATION", 3000);
	}
	@When("user click on collect cash icon")
	public void user_click_on_collect_cash_icon() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[12]/button[4]", "user click on collect cash icon", "CLICK", 2000);

	}
	@When("user select {string} as mode")
	public void user_select_as_mode(String mode) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbMode']", "//*[@class='select2-input select2-focused']", mode , "//*[@class='select2-match']", "user select {string} as mode", "DROPDOWN", 2000);

	}
	@When("user select {string} as issuer bank")
	public void user_select_as_issuer_bank(String issuerBank) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbClientBank']", "//*[@class='select2-input select2-focused']", issuerBank , "//*[@class='select2-match']", "user select {string} as issuer bank", "DROPDOWN", 2000);

	}
	@When("user enter {string} as Cheque\\/ Reference Number")
	public void user_enter_as_cheque_reference_number(String refNumber) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtRefNB']", refNumber, "user enter {string} as Cheque\\\\/ Reference Number", "TEXTBOX", 0);	
	    
	}
	@When("user select {string} as collecting bank")
	public void user_select_as_collecting_bank(String collectingBank) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbInsurerBank']", "//*[@class='select2-input select2-focused']", collectingBank , "//*[@class='select2-match']", "user select {string} as collecting bank", "DROPDOWN", 2000);

	}
	@When("user enter {string} as notes")
	public void user_enter_as_notes(String notes) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtNotes']", notes, "user enter {string} as notes", "TEXTBOX", 0);	

	}
	
	@When("user click on save button \\(Receipts)")
	public void user_click_on_save_button_Receipts() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='btnSave']", "user click on save button", "CLICK", 2000);

	}




	
}
