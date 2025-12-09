package cucumberMap28PolicyCancel;

import java.time.LocalDate;

import PolicyData.BasePolicyData;
import PolicyData.MotorPolicyData;
import io.cucumber.java.en.Given;
import itl.Itl;
import utility.SeleniumOperations;
import utility.TestDataLoader;

public class PolicyCancel {
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
	    SeleniumOperations.selectDateFromCalendar(startDate);

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
	            "DROPDOWN", 4000);
	    }
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

