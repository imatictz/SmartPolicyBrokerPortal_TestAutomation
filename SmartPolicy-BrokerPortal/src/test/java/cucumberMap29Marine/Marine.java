package cucumberMap29Marine;

import java.util.Hashtable;

import java.util.Map;
import java.util.HashMap;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Marine {

	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws InterruptedException 
	{
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	   
	}

 
	@When("^user navigate on quotations menu$")
	public void user_navigate_on_quotations_menu() 
	{
		Object[] input8=new Object[1];
	    input8[0]="//*[@id='span_CompanySetupMapping_lc']";
	    SeleniumOperations.actionClass(input8);
	   
	}

	@When("^user click on current quotations$")
	public void user_click_on_current_quotations() throws InterruptedException 
	{
		Object[] input9=new Object[1];
	    input9[0]="//*[@id='MNU_wfFIQNM']";
	    SeleniumOperations.clickOnElement(input9);
	    Thread.sleep(2000);
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws InterruptedException  
	{
		Object[] input10=new Object[1];
	    input10[0]="//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input10);
	    Thread.sleep(8000);
	    
	}

	@When("^user select \"([^\"]*)\" as insurance type$")
	public void user_select_as_insurance_type(String insuranceType) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbPopInsuranceType')]";
		input[1]="//*[@class='select2-search__field']";
		input[2]=insuranceType;
		input[3]="//*[contains(@id,'select2-MainContent_cmbPopInsuranceType-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as insurance type",output.get("MESSAGE").toString());
		Thread.sleep(5000);
	}
	

	 static class Field {
	        String xpath;
	        String type;
	        String searchXpath;
	        String resultXpath;

	        Field(String xpath, String type) {
	            this.xpath = xpath;
	            this.type = type;
	        }

	        Field(String xpath, String type, String searchXpath, String resultXpath) {
	            this.xpath = xpath;
	            this.type = type;
	            this.searchXpath = searchXpath;
	            this.resultXpath = resultXpath;
	        }
	    }

	    private static final Map<String, Field> fieldMap = new HashMap<>();

	    static {
	        fieldMap.put("Client Name", new Field("//input[@id='MainContent_txtClientName']", "TEXT"));
	        fieldMap.put("Insurer", new Field("//select[@id='MainContent_cmbInsurer']", "DROPDOWN",
	                "//*[@class='select2-search__field']",
	                "//*[contains(@data-select2-id,'MainContent_cmbInsurer-result')]"));
	        fieldMap.put("Currency", new Field("//select[@id='MainContent_cmbCurrency']", "DROPDOWN",
	                "//*[@class='select2-search__field']",
	                "//*[contains(@data-select2-id,'MainContent_cmbCurrency-result')]"));
	        fieldMap.put("X Rate", new Field("//input[@id='MainContent_txtXrate']", "TEXT"));
	        fieldMap.put("Insurer X Rate", new Field("//input[@id='MainContent_txtInsurerXrate']", "TEXT"));
	        fieldMap.put("Insured Name", new Field("//input[@id='MainContent_txtInsuredName']", "TEXT"));
	        fieldMap.put("Address", new Field("//textarea[@id='MainContent_txtAddress']", "TEXTAREA"));
	        fieldMap.put("Business by", new Field("//select[@id='MainContent_cmbUsers']", "DROPDOWN",
	                "//*[@class='select2-search__field']",
	                "//*[contains(@data-select2-id,'MainContent_cmbUsers-result')]"));
	        fieldMap.put("Borrower Account Name", new Field("//input[@id='MainContent_txtBorrowerAccName']", "TEXT"));
	        fieldMap.put("Borrower Account Number", new Field("//input[@id='MainContent_txtBorrowerAccNum']", "TEXT"));
	        fieldMap.put("Business Type", new Field("//select[@id='MainContent_cmbBusinessType']", "DROPDOWN",
	                "//*[@class='select2-search__field']",
	                "//*[contains(@data-select2-id,'MainContent_cmbBusinessType-result')]"));
	        fieldMap.put("First Loss Payee", new Field("//input[@id='MainContent_chkFirstLossVaidate']", "CHECKBOX"));
	        fieldMap.put("Description", new Field("//textarea[@id='MainContent_txtDescription']", "TEXTAREA"));
	        fieldMap.put("Sum Insured", new Field("//input[@id='txtSumInsured']", "TEXT"));
	    }

	    @When("user enter screen details :")
	    public void user_enter_screen_details(DataTable dataTable) throws Throwable {

	        Map<String, String> data = dataTable.asMap(String.class, String.class);

	        for (Map.Entry<String, String> entry : data.entrySet()) {

	            String fieldName = entry.getKey();
	            String value = entry.getValue();

	            Field field = fieldMap.get(fieldName);
	            if (field == null) {
	                continue;
	            }

	            switch (field.type) {

	                case "TEXT":
	                case "TEXTAREA":
	                    Itl.CustomSendEvent(
	                            field.xpath,
	                            value,
	                            fieldName,
	                            "input",
	                            2);
	                    break;

	                case "DROPDOWN":
	                    Itl.CustomDropdownEvent(
	                            field.xpath,
	                            field.searchXpath,
	                            value,
	                            field.resultXpath,
	                            fieldName,
	                            "dropdown",
	                            2);
	                    break;

	                case "CHECKBOX":
	                    if ("true".equalsIgnoreCase(value)) {
	                        Itl.CustomClickEvent(
	                                field.xpath,
	                                fieldName,
	                                "checkbox",
	                                2);
	                    }
	                    break;
	            }
	        }
	    }
}
