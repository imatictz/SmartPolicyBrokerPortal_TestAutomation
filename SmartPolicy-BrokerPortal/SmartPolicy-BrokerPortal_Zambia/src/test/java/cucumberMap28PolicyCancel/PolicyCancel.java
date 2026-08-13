package cucumberMap28PolicyCancel;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import PolicyData.BasePolicyData;
import PolicyData.FirePolicyData;
import PolicyData.MotorPolicyData;
import PolicyData.PaymentData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.PaymentDataLoader;
import utility.SeleniumOperations;
import utility.TestDataLoader;

public class PolicyCancel {
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
		input9[0]="//*[@id='span6']";
		SeleniumOperations.clickOnElement(input9);
		Thread.sleep(4000);
	}
	
	@Given ("user navigate on {string} quotation screen")
	public void quotationScreen(String insuranceType) throws Throwable {
		Itl.NavigateAction("//*[@id='MOD_OPERATIONS']", "NAVIGATE", 2000);
		Itl.NavigateAction("//*[@id='span_CompanySetupMapping_lc']", "NAVIGATE", 2000);
		Itl.ClickEvent("//*[@id='MNU_wfFIQNM']", "CLICK", 2000);
		Itl.ClickEvent("//*[@id='MainContent_btnAdd']", "CLICK", 8000);
		Itl.DropdownEvent("//*[contains(@aria-controls,'MainContent_cmbPopInsuranceType')]", "//*[@class='select2-search__field']", 
			insuranceType, "(//*[contains(@data-select2-id,'-MainContent_cmbPopInsuranceType')])[3]", "DROPDOWN", 5000);
		
		
	}
	
	@Given("user creates {string} cover with start date {string}")
	public void createCover(String policyType, String startDateType) throws Throwable {

	    BasePolicyData data = TestDataLoader.getPolicyData(policyType);

	    LocalDate startDate = SeleniumOperations.resolveDate(startDateType);

	    // Client name
	    Itl.SendEvent("//*[@id='MainContent_txtClientName']", 
	                  data.getClientName(), "TEXTBOX", 2000);
	    Itl.ActionDownEnterEvent("//*[@id='MainContent_txtClientName']", "ENTER", 4000);

	    // Insurer
	    Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbInsurer')]",
	            "//*[@class='select2-search__field']",
	            data.getInsurer(),
	            "//*[contains(@id,'select2-MainContent_cmbInsurer-result-')]",
	            "DROPDOWN", 4000
	    );

	    // Date selection
	    SeleniumOperations.selectDateFromCalendarEvent("MainContent_txtFromDate","//th[@class='datepicker-switch']",
	    		"//th[@class='prev']","//th[@class='next']","DATE",startDateType);

	    // If Motor → handle motorType
	    if (data instanceof MotorPolicyData) {
	        MotorPolicyData motor = (MotorPolicyData) data;

	        //motorType
	        Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbMotorType')]",
	            "//*[@class='select2-search__field']",
	            motor.getMotorType(),
	            "//*[contains(@data-select2-id,'select2-MainContent_cmbMotorType')]",
	            "DROPDOWN", 2000);
	       //insuranceType
	        Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbFltCoverType')]",
	            "//*[@class='select2-search__field']",
	            motor.getInsuranceType(),
	            "(//*[contains(@data-select2-id,'-MainContent_cmbFltCoverType')])[2]",
	            "DROPDOWN", 5000);
	      //insuranceClass
	        Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbFltClassType')]",
	            "//*[@class='select2-search__field']",
	            motor.getInsuranceClass(),
	            "(//*[contains(@data-select2-id,'-MainContent_cmbFltClassType')])[2]",
	            "DROPDOWN", 5000);
	      //ownerCategory
	        Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbOwnerCat')]",
	            "//*[@class='select2-search__field']",
	            motor.getOwnerCategory(),
	            "(//*[contains(@data-select2-id,'-MainContent_cmbOwnerCat')])[2]",
	            "DROPDOWN", 2000);
	      //motorUsage
	        Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbMotorUsage')]",
	            "//*[@class='select2-search__field']",
	            motor.getMotorUsage(),
	            "(//*[contains(@data-select2-id,'-MainContent_cmbMotorUsage')])[2]",
	            "DROPDOWN", 2000);
	      //registrationNumber
	        Itl.SendDynamicValuesEvent("//*[@id='txtFltRegno']", motor.getRegistrationNumber(), "TEXTBOX", 2000);
	      //chasisNumber
	        Itl.ClickEvent("//*[@id='txtChasisNo']", "CLICK", 6000);
	        Itl.SendEvent("//*[@id='txtChasisNo']", motor.getChasisNumber(), "TEXTBOX", 0);
	      //vehicleMake
		    Itl.SendEvent("//*[@id='MainContent_txtFltMake']", 
		    		motor.getVehicleMake(), "TEXTBOX", 0);
		    Itl.ActionDownEnterEvent("//*[@id='MainContent_txtFltMake']", "ENTER", 0);
		  //vehicleModel
		    Itl.SendEvent("//*[@id='MainContent_txtFltModel']", 
		    		motor.getVehicleModel(), "TEXTBOX", 0);
		    Itl.ActionDownEnterEvent("//*[@id='MainContent_txtFltModel']", "ENTER", 0);
		  //vehicleType
	        Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbFltType')]",
	            "//*[@class='select2-search__field']",
	            motor.getVehicleType(),
	            "(//*[contains(@data-select2-id,'-MainContent_cmbFltType')])[2]",
	            "DROPDOWN", 2000);
	     // model number – TEXTBOX
	        Itl.SendEvent("//*[@id='MainContent_txtModelNum']",
	                motor.getModelNumber(), "TEXTBOX", 2000);

	        // engine number – TEXTBOX
	        Itl.SendEvent("//*[@id='txtEngineNo']",
	                motor.getEngineNumber(), "TEXTBOX", 2000);

	        // fuel type – DROPDOWN
	        Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbFuelType')]",
	            "//*[@class='select2-search__field']",
	            motor.getFuelType(),
	            "(//*[contains(@data-select2-id,'-MainContent_cmbFuelType')])[2]",
	            "DROPDOWN", 2000);

	        // manufacture year – TEXTBOX
	        Itl.SendEvent("//*[@id='txtFltYear']",
	                motor.getManufactureYear(), "TEXTBOX", 2000);

	        // seat – TEXTBOX
	        Itl.SendEvent("//*[@id='txtFltSeat']",
	                motor.getSeat(), "TEXTBOX", 2000);

	        // CC – TEXTBOX
	        Itl.SendEvent("//*[@id='txtFltCC']",
	                motor.getCc(), "TEXTBOX", 2000);

	        // color – TEXTBOX
	        Itl.SendEvent("//*[@id='txtColor']",
	                motor.getColor(), "TEXTBOX", 2000);

	        // gross weight – TEXTBOX
	        Itl.SendEvent("//*[@id='MainContent_txtGrossWeight']",
	                motor.getGrossWeight(), "TEXTBOX", 2000);

	        // tare weight – TEXTBOX
	        Itl.SendEvent("//*[@id='MainContent_txtTareWeeight']",
	                motor.getTareWeight(), "TEXTBOX", 2000);

	        // number of axel – TEXTBOX
	        Itl.SendEvent("//*[@id='txtNoOfAxel']",
	                motor.getNumberOfAxel(), "TEXTBOX", 2000);

	        // axel distance – TEXTBOX
	        Itl.SendEvent("//*[@id='txtAxelDistance']",
	                motor.getAxelDistance(), "TEXTBOX", 2000);

	        // sum insured – TEXTBOX
	        Itl.SendEvent("//*[@id='txtFltSumInsured']",
	                motor.getSumInsured(), "TEXTBOX", 2000);
	        
	        //Compute
	        Itl.ClickEvent("//*[@id='btnCompute']", "CLICK", 2000);
	        SeleniumOperations.scrollUp();
	        
	        //insert
	        Itl.ClickEvent("//*[@id='btnInsert']", "CLICK", 2000);
	        
	        //alert
	        SeleniumOperations.alert();
	        
	        //Compute
	        Itl.ClickEvent("//*[@id='btnCompute']", "CLICK", 2000);
	        
	        //save
	        Itl.ClickEvent("//*[@id='btnSave']", "CLICK", 6000);
	        
	        
	        //validation
	        Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]", motor.getValidation(),"user creates {string} cover with start date {string}", "VALIDATION", 2000);

	        SeleniumOperations.scrollUp();
	        //Search Quote to issue risk note
		    SeleniumOperations.selectDateFromCalendarEvent("MainContent_txtSrchFromDate","//th[@class='datepicker-switch']",
		    		"//th[@class='prev']","//th[@class='next']","DATE",startDateType);
		    
		    //click on search
	        Itl.ClickEvent("//*[@id='button_btnSearch_lc']", "CLICK", 2000);
	        
			SeleniumOperations.getQuote("Motor");
			Thread.sleep(4000);
			 
			String quoteNo = SeleniumOperations.getQuote("Motor");
			Itl.SendEvent("//*[@id='MainContent_txtSrchQuote']", quoteNo, "TEXTBOX", 2000);
			
			Itl.ClickEvent("//*[@id='button_btnSearch_lc']", "CLICK", 2000);
			
			
	    }
	}
	
	//@Given("user creates \\(Fire Class\\) {string} cover with start date {string}")
	public void createCoverFireClass(String policyType, String startDateType) throws Throwable {

	    BasePolicyData data = TestDataLoader.getPolicyData(policyType);

	    LocalDate startDate = SeleniumOperations.resolveDate(startDateType);

	    // Client name
	    Itl.SendEvent(
	            "//*[@id='MainContent_txtClientName']",
	            data.getClientName(),
	            "TEXTBOX", 2000
	    );
	    Itl.ActionDownEnterEvent("//*[@id='MainContent_txtClientName']", "ENTER", 4000);

	    // Insurer
	    Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbInsurer')]",
	            "//*[@class='select2-search__field']",
	            data.getInsurer(),
	            "//*[contains(@id,'select2-MainContent_cmbInsurer-result-')]",
	            "DROPDOWN", 4000
	    );

	    // Date selection
	    SeleniumOperations.selectDateFromCalendarEvent(
	            "MainContent_txtFromDate",
	            "//th[@class='datepicker-switch']",
	            "//th[@class='prev']",
	            "//th[@class='next']",
	            "DATE",
	            startDateType
	    );

	    if (data instanceof FirePolicyData) {

	        FirePolicyData fire = (FirePolicyData) data;

	        // Cover Note Number
	        Itl.SendEvent(
	                "//*[@id='txtFirePolicyDataNo']",
	                fire.getCoverNoteNumber(),
	                "TEXTBOX",
	                2000
	        );

	        // Insurance Class
	        Itl.DropdownEvent(
	                "//*[contains(@aria-controls,'MainContent_cmbInsuranceClass')]",
	                "//*[@class='select2-search__field']",
	                fire.getInsuranceClass(),
	                "(//*[contains(@id,'select2-MainContent_cmbInsuranceClass-result-')])[1]",
	                "DROPDOWN",
	                3000
	        );

	        // Sum Insured
	        Itl.SendEvent(
	                "//*[@id='txtSumInsured']",
	                fire.getSumInsured(),
	                "TEXTBOX",
	                2000
	        );

	        // Description
	        Itl.SendEvent(
	                "//*[@id='MainContent_txtDescription']",
	                fire.getDescription(),
	                "TEXTBOX",
	                2000
	        );

	        // Compute
	        Itl.ClickEvent("//*[@id='btnCompute']", "CLICK", 2000);
	        SeleniumOperations.scrollUp();

	        // Insert
	        Itl.ClickEvent("//*[@id='btnInsert']", "CLICK", 2000);

	        // Alert
	        SeleniumOperations.alert();

	        // Save
	        Itl.ClickEvent("//*[@id='btnSave']", "CLICK", 6000);

	        // Validation
	        Itl.CustomValidationEvent(
	                "//*[@id='sort_table']/tbody/tr[1]/td[8]",
	                fire.getValidation(),
	                "user creates {string} cover with start date {string}",
	                "VALIDATION",
	                2000
	        );

	        SeleniumOperations.scrollUp();

	        // Search Quote to issue risk note
	        SeleniumOperations.selectDateFromCalendarEvent(
	                "MainContent_txtSrchFromDate",
	                "//th[@class='datepicker-switch']",
	                "//th[@class='prev']",
	                "//th[@class='next']",
	                "DATE",
	                startDateType
	        );

	        // Click search
	        Itl.ClickEvent("//*[@id='button_btnSearch_lc']", "CLICK", 2000);

	        SeleniumOperations.getQuote(policyType);
	        Thread.sleep(4000);

	        String quoteNo = SeleniumOperations.getQuote(policyType);

	        Itl.SendEvent(
	                "//*[@id='MainContent_txtSrchQuote']",
	                quoteNo,
	                "TEXTBOX",
	                2000
	        );

	        Itl.ClickEvent("//*[@id='button_btnSearch_lc']", "CLICK", 2000);
	    }
	}



	@When("user makes {string} payment")
	public void payment(String paymentType) throws InterruptedException {

	    PaymentData payment = PaymentDataLoader.getPaymentData(paymentType);

	    // Click receipt
	    Itl.ClickEvent("//*[@id='MainContent_repIQNM_btnAppTeller_0']", "CLICK", 3000);

	    // Mode
	    Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbMode')]",
	            "//*[@class='select2-search__field']",
	            payment.getMode(),
	            "(//*[contains(@data-select2-id,'MainContent_cmbMode')])[2]",
	            "DROPDOWN", 2000);

	    // Issuer Bank
	    Itl.DropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbClientBank')]",
	            "//*[@class='select2-search__field']",
	            payment.getIssuerBank(),
	            "(//*[contains(@data-select2-id,'MainContent_cmbClientBank')])[2]",
	            "DROPDOWN", 2000);

	    // Collecting Bank (only FULL)
	    if (payment.getCollectingBank() != null && !payment.getCollectingBank().isEmpty()) {
	        Itl.DropdownEvent(
	                "//*[contains(@aria-controls,'MainContent_cmbInsurerBank')]",
	                "//*[@class='select2-search__field']",
	                payment.getCollectingBank(),
	                "(//*[contains(@data-select2-id,'MainContent_cmbInsurerBank')])[2]",
	                "DROPDOWN", 2000);
	    }

	    // Reference No
	    Itl.SendEvent("//*[@id='MainContent_txtTRReciptNb']", 
	                  payment.getReferenceNo(), 
	                  "TEXTBOX", 
	                  2000);


	    // Submit
	    Itl.ClickEvent("//*[@id='btnProceed']", "CLICK", 4000);
	    
	    //issue risk note option
	    Itl.ClickEvent("//*[@id='btnRisknote']", "CLICK", 2000);
	    
	    //OK
	    Itl.ClickEvent("//*[@id='btnProcedeRiskNote']", "CLICK", 6000);
	    
	    //validation
        Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]", payment.getValidation(),"user makes {string} payment", "VALIDATION", 2000);
        
        //Go to risk note
        Itl.ClickEvent("//*[@id='btnRisknoteScreen']", "CLICK", 15000);
	}

	@When("user enter details to cancels the cover:")
	public void user_enter_details_fields(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		//click on actions option
        Itl.ClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[6]", "CLICK", 2000);
        
        //click on cancel option
        Itl.ClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[6]/*[2]/*[2]", "CLICK", 2000);
		
		List<Map<String, String>> userList =  (List<Map<String, String>>) dataTable.asMaps(String.class, String.class);
	 	   
		//notes
	    Itl.SendEvent("//*[@id='MainContent_txtCancelNotes']",userList.get(0).get("Value"), "TEXTBOX", 0);
	    
	    //preview
        Itl.ClickEvent("//*[@id='btnPreview']", "CLICK", 4000);
        
        Itl.CustomValidationPolicyCancellationCalculationEvent("user able to view policy cancellation amount details", "VALIDATION", 2000);

        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


