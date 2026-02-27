package cucumberMap31PaymentReceipt;


	import java.util.Hashtable;

	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import itl.Itl;
	import utility.HTMLReportGenerator;
	import utility.SeleniumOperations;

	public class PaymentReceipt {
		@When ("^user navigate on operation dropdown$")
	 	public void user_navigate_on_operation_dropdown_menu() throws InterruptedException {
			Object[] input7=new Object[1];
		    input7[0]="//*[@id='MOD_OPERATIONS']";
		    SeleniumOperations.actionClass(input7);
		    Thread.sleep(2000);
		}

		@When ("user click on Remittance option")
		public void PaymentOption() throws InterruptedException {
			Object[] input = new Object[1];
			input[0]="//*[@id='span23']";
			SeleniumOperations.clickOnElement(input);
			Thread.sleep(2000);
		}
		
	 	@Then("^user click on Payment Receipt option$")
	 	public void user_click_on_payment_option() throws Throwable {
	 	    Object[] input4=new Object[1];
		    input4[0]="//*[@id='span98']";
		    SeleniumOperations.clickOnElement(input4);
		    Thread.sleep(2000);
	 	}

	 	@When("^user click on add button to enter payment details$")
	 	public void user_click_on_add_button_to_enter_payment_details() throws Throwable {
	 	    Object[] input4=new Object[1];
		    input4[0]="//*[@id='MainContent_btnAdd']";
		    SeleniumOperations.clickOnElement(input4);
		    Thread.sleep(4000);
	 	}

	 	@When ("user select {string} as insurer name")
		public void selectInsurer(String insurer) throws Throwable 
		{
			Object[] input = new Object[4];
		    input[0] = "(//*[contains(@aria-controls,'MainContent_cmbInsurerName')])";
		    input[1] = "//*[@class='select2-search__field']";
		    input[2] = insurer;
		    input[3] = "((//*[contains(@data-select2-id,'MainContent_cmbInsurerName')]))[2]";
			Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user Select \\\"(.*)\\\" as insurer",output.get("MESSAGE").toString());
			Thread.sleep(2000);
		}

	 	@When("^user enter \"([^\"]*)\" as client name$")
		public void enterClientName(String clientName) throws Throwable {
		    
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtClientName']", clientName, "user enter \\\"([^\\\"]*)\\\" as amount", "TEXTBOX", 2000);
		}

		@When("^user select Pravin Testing as client name$")
		public void clickOnClientName() throws Throwable {
			Object[] input=new Object[1];
			input[0]="//*[@id='MainContent_txtClientName']";
			Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Pravin Testing as client name",output.get("MESSAGE").toString());
		}
	 	@When("^user enter \"([^\"]*)\" as amount$")
	 	public void user_enter_as_amount(String amount) throws Throwable {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtAmount']", amount, "user enter \\\"([^\\\"]*)\\\" as amount", "TEXTBOX", 0);
	 	}

	 	@When("user select {string} as mode")
		public void user_select_as_mode(String mode) throws InterruptedException {
		    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbMode')]", "//*[@class='select2-search__field']", mode , "(//*[contains(@data-select2-id,'MainContent_cmbMode')])[2]", "user select {string} as mode", "DROPDOWN", 2000);

		}

	 	@When("^user enter \"([^\"]*)\" as notes$")
	 	public void user_enter_as_notes(String notes) throws Throwable {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtNotes']", notes, "user enter {string} as Cheque\\\\/ Reference Number", "TEXTBOX", 0);
	 	}

	 	@When("user select {string} as issuer bank")
		public void user_select_as_issuer_bank(String issuerBank) throws InterruptedException {
		    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbClientBank')]", "//*[@class='select2-search__field']", issuerBank , "(//*[contains(@data-select2-id,'MainContent_cmbClientBank')])[2]", "user select {string} as issuer bank", "DROPDOWN", 2000);

		}
		@When("user enter {string} as Cheque\\/ Reference Number")
		public void user_enter_as_cheque_reference_number(String refNumber) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtRefNB']", refNumber, "user enter {string} as Cheque\\\\/ Reference Number", "TEXTBOX", 0);	
		    
		}
		@When("user select {string} as collecting bank")
		public void user_select_as_collecting_bank(String collectingBank) throws InterruptedException {
		    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsurerBank')]", "//*[@class='select2-search__field']", collectingBank , "(//*[contains(@data-select2-id,'MainContent_cmbInsurerBank')])[2]", "user select {string} as collecting bank", "DROPDOWN", 2000);

		}

	 	@When("^user enter \"([^\"]*)\" as refrence id$")
	 	public void user_enter_as_refrence_id(String refrenceId) throws Throwable {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtAcctRefId']", refrenceId, "user enter \\\"([^\\\"]*)\\\" as refrence id", "TEXTBOX", 2000);
	 	}

	 	@Then("^user enter \"([^\"]*)\" as insurer payment refrence id$")
	 	public void user_enter_as_insurer_payment_refrence_id(String insurerPayRefrenceId) throws Throwable {
	 	    
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtInsurerPaymetId']", insurerPayRefrenceId, "user enter \\\"([^\\\"]*)\\\" as insurer payment refrence id", "TEXTBOX", 2000);	

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
			input[0]="//*[@id='sort_table']/tbody/tr[1]/td[8]";
			input[1]=status;
			Hashtable<String,Object> output= SeleniumOperations.validation(input);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"([^\\\"]*)\\\" as status",output.get("MESSAGE").toString());
		}
	 	
	 	@When("^user select off as payment to$")
	 	public void user_select_Off() throws InterruptedException {
	 	    Object[] input4=new Object[1];
		    input4[0]="//*[@class='bootstrap-switch-label']";
		    Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input4);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select off as payment to",output.get("MESSAGE").toString());
			Thread.sleep(2000);
	 	}
	}


