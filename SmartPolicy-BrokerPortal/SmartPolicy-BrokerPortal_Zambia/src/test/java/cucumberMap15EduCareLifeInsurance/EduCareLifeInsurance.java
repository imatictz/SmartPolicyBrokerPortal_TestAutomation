package cucumberMap15EduCareLifeInsurance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class EduCareLifeInsurance {
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws InterruptedException {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	    Thread.sleep(2000);
	}

	@When("^user navigate on quotations menu$")
	public void user_navigate_on_quotations_menu() {
		Object[] input8=new Object[1];
	    input8[0]="//*[@id='span_quotations_lc']";
	    SeleniumOperations.actionClass(input8);
	}

	@When("^user click on current quotations$")
	public void user_click_on_current_quotations() throws InterruptedException {
		Object[] input9=new Object[1];
	    input9[0]="//*[@id='MNU_wfFIQNM']";
	    SeleniumOperations.clickOnElement(input9);
	    Thread.sleep(2000);
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws InterruptedException  {
		Object[] input10=new Object[1];
	    input10[0]="//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input10);
	    Thread.sleep(8000);
	}
	@When ("^user select \"(.*)\" as insurer$")
	public void selectInsurer1(String insurer) throws Throwable 
	{
		Object[] input = new Object[4];
	    input[0] = "//*[contains(@aria-controls,'MainContent_cmbInsurer')]";
	    input[1] = "//*[@class='select2-search__field']";
	    input[2] = insurer;
	    input[3] = "//*[contains(@id,'select2-MainContent_cmbInsurer-result-')]";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user Select \\\"(.*)\\\" as insurer",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	@When("^user select \"([^\"]*)\" as insurance type$")
	public void user_select_as_insurance_type1(String insuranceType) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbPopInsuranceType')]";
		input[1]="//*[@class='select2-search__field']";
		input[2]=insuranceType;
		input[3]="//*[contains(@id,'select2-MainContent_cmbPopInsuranceType-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdownTest(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as insurance type",output.get("MESSAGE").toString());
		Thread.sleep(5000);
		
	}

	@When("^user enter \"([^\"]*)\" as client name$")
	public void enterClientName(String clientName) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtClientName']";
	    input[1]=clientName;
	    Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Pravin Testing\" as client name",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user select Pravin Testing as client name$")
	public void clickOnClientName() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_txtClientName']";
		Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Pravin Testing as client name",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When("user select {string} as place of birth")
	public void user_select_as_placeOfBirth(String placeOfBirth) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbPOPlaceOfBirth')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=placeOfBirth;
		input[3]="//*[contains(@id,'select2-MainContent_cmbPOPlaceOfBirth-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as place of birth",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as P\\.O\\. Box$")
	public void enterPOBox(String poBox) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPoBox']";
		input[1]=poBox;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"121\" as P.O. Box",output.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as street$")
	public void enterStreet(String street) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_EducaretxtStreet']";
		input[1]=street;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Road\" as street",output.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as suburb$")
	public void enterSuburb(String suburb) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOSuburb']";
		input[1]=suburb;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Village\" as suburb",output.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as town$")
	public void enterTown(String town) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOTwon']";
		input[1]=town;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"City\" as town",output.get("MESSAGE").toString());  
	}

	@When("^user enter \"([^\"]*)\" as region$")
	public void enterRegion(String region) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtRegion']";
		input[1]=region;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Country\" as region",output.get("MESSAGE").toString());  
	}

	@When("user select {string} as citizen")
	public void user_select_as_citizen(String citizen) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbPOCitizen')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=citizen;
		input[3]="//*[contains(@id,'select2-MainContent_cmbPOCitizen-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as citizen",output.get("MESSAGE").toString());
	}

	@When("user select {string} as marital status")
	public void user_select_as_maritalStatus(String maritalStatus) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbPOMartialSts')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=maritalStatus;
		input[3]="//*[contains(@id,'select2-MainContent_cmbPOMartialSts-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as marital status",output.get("MESSAGE").toString());
	}
	
	@When("^user enter \"([^\"]*)\" as employer name$")
	public void enterEmployerName(String employerName) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOEmployerName']";
		input[1]=employerName;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Pravin Testing\" as employer name",output.get("MESSAGE").toString());   
	}

	@When("^user enter \"([^\"]*)\" as employee number /national ID$")
	public void enterEmployeeNumberNationalID(String employeeNumberNationalID) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOEmployeeNumber']";
		input[1]=employeeNumberNationalID;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"5214EDRGno51\" as employee number /national ID",output.get("MESSAGE").toString());   
	}

	@When("^user enter \"([^\"]*)\" as occupation$")
	public void enterOccupation(String occupation) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOOccupation']";
		input[1]=occupation;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Worker\" as occupation",output.get("MESSAGE").toString());   
	}

	@When("user select {string} as tax payer country")
	public void user_select_as_taxPayerCountry(String taxPayerCountry) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbPOTaxPayer')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=taxPayerCountry;
		input[3]="//*[contains(@id,'select2-MainContent_cmbPOTaxPayer-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as tax payer country",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as employment date$")
	public void enterEmploymentDate(String employmentDate) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOEmployementDate']";
		input[1]=employmentDate;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"15/04/2023\" as employment date",output.get("MESSAGE").toString());     
	    Thread.sleep(2000);
	}

	@When ("^user click on next button \\(First Page\\)$")
	public void clickOnNextButton() throws InterruptedException{
		Object[] input11=new Object[1];
		input11[0]="//*[@id='btnNextScrn1']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on next button (First Page)",output.get("MESSAGE").toString()); 	
		Thread.sleep(2000);
	}
	
	@When("^user enter \"([^\"]*)\" as name of beneficiary \\(For Beneficiary one\\)$")
	public void user_enter_as_name_of_beneficiary_For_Beneficiary_one(String name1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB1Name']";
		input[1]=name1;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Beneficiary 1\" as name of beneficiary (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Beneficiary one\\)$")
	public void user_enter_as_date_of_birth_For_Beneficiary_one(String dateOfBirth1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB1Dob']";
		input[1]=dateOfBirth1;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"15/05/1988\" as date of birth (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("user select {string} as gender \\(For Beneficiary one)")
	public void user_select_as_genderB1(String genderB1) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbLB1Gender')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=genderB1;
		input[3]="//*[contains(@id,'select2-MainContent_cmbLB1Gender-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as gender \\\\(For Beneficiary one)",output.get("MESSAGE").toString());
	}

	@When("user select {string} as relationship to owner \\(For Beneficiary one)")
	public void user_select_as_relationshipB1(String relationship) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbLB1Relationship')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=relationship;
		input[3]="//*[contains(@id,'select2-MainContent_cmbLB1Relationship-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as relationship to owner \\\\(For Beneficiary one)",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Beneficiary one\\)$")
	public void user_enter_as_telephone_For_Beneficiary_one(String telephone1) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB1Tel']";
		input[1]=telephone1;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"6595544202\" as telephone (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as percent of life benefit given \\(For Beneficiary one\\)$")
	public void user_enter_as_percent_of_life_benefit_given_For_Beneficiary_one(String percent1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB1Percent']";
		input[1]=percent1;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"15\" as percent of life benefit given (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Beneficiary one\\)$")
	public void user_enter_as_address_For_Beneficiary_one(String address1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB1Address']";
		input[1]=address1;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Address No 1\" as address (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as name of beneficiary \\(For Beneficiary Two\\)$")
	public void user_enter_as_name_of_beneficiary_For_Beneficiary_Two(String name2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Name']";
		input[1]=name2;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Beneficiary 2\" as name of beneficiary (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Beneficiary Two\\)$")
	public void user_enter_as_date_of_birth_For_Beneficiary_Two(String dateOfBirth2) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Dob']";
		input[1]=dateOfBirth2;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"01/02/1990\" as date of birth (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("user select {string} as gender \\(For Beneficiary Two)")
	public void user_select_as_genderB2(String gender) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbLB2Gender')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=gender;
		input[3]="//*[contains(@id,'select2-MainContent_cmbLB2Gender-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as gender \\\\(For Beneficiary two)",output.get("MESSAGE").toString());
	}

	@When("user select {string} as relationship to owner \\(For Beneficiary Two)")
	public void user_select_as_relationshipB2(String relationship) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbLB2Relationship')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=relationship;
		input[3]="//*[contains(@id,'select2-MainContent_cmbLB2Relationship-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as relationship to owner \\\\(For Beneficiary two)",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Beneficiary Two\\)$")
	public void user_enter_as_telephone_For_Beneficiary_Two(String telephone2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Tel']";
		input[1]=telephone2;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"6595544202\" as telephone (For Beneficiary Two)",output.get("MESSAGE").toString());       
	}

	@When("^user enter \"([^\"]*)\" as percent of life benefit given \\(For Beneficiary Two\\)$")
	public void user_enter_as_percent_of_life_benefit_given_For_Beneficiary_Two(String percent2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Percent']";
		input[1]=percent2;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"30\" as percent of life benefit given (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Beneficiary Two\\)$")
	public void user_enter_as_address_For_Beneficiary_Two(String address2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Address']";
		input[1]=address2;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Address No 2\" as address (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as name of beneficiary \\(For Beneficiary Three\\)$")
	public void user_enter_as_name_of_beneficiary_For_Beneficiary_Three(String name3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB3Name']";
		input[1]=name3;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Beneficiary 3\" as name of beneficiary (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Beneficiary Three\\)$")
	public void user_enter_as_date_of_birth_For_Beneficiary_Three(String dateOfBirth3) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtLB3Dob']";
		 input[1]=dateOfBirth3;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"20/12/1998\" as date of birth (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("user select {string} as gender \\(For Beneficiary Three)")
	public void user_select_as_genderB3(String gender) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbLB3Gender')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=gender;
		input[3]="//*[contains(@id,'select2-MainContent_cmbLB3Gender-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as gender \\\\(For Beneficiary Three)",output.get("MESSAGE").toString());
	}

	@When("user select {string} as relationship to owner \\(For Beneficiary Three)")
	public void user_select_as_relationshipB3(String relationship) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbLB3Relationship')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=relationship;
		input[3]="//*[contains(@id,'select2-MainContent_cmbLB3Relationship-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as relationship to owner \\\\(For Beneficiary three)",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Beneficiary Three\\)$")
	public void user_enter_as_telephone_For_Beneficiary_Three(String telephone3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB3Tel']";
	    input[1]=telephone3;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"6595544202\" as telephone (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as percent of life benefit given \\(For Beneficiary Three\\)$")
	public void user_enter_as_percent_of_life_benefit_given_For_Beneficiary_Three(String percent3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB3Percent']";
		input[1]=percent3;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"35\" as percent of life benefit given (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Beneficiary Three\\)$")
	public void user_enter_as_address_For_Beneficiary_Three(String address3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB3Address']";
		input[1]=address3;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Address No 3\" as address (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as name of beneficiary \\(For Beneficiary Four\\)$")
	public void user_enter_as_name_of_beneficiary_For_Beneficiary_Four(String name4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Name']";
		input[1]=name4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Beneficiary 4\" as name of beneficiary (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Beneficiary Four\\)$")
	public void user_enter_as_date_of_birth_For_Beneficiary_Four(String dateOfBirth4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Dob']";
		input[1]=dateOfBirth4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"06/05/2010\" as date of birth (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("user select {string} as gender \\(For Beneficiary Four)")
	public void user_select_as_genderB4(String gender) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbLB4Gender')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=gender;
		input[3]="//*[contains(@id,'select2-MainContent_cmbLB4Gender-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as gender \\\\(For Beneficiary Four)",output.get("MESSAGE").toString());
	}

	@When("user select {string} as relationship to owner \\(For Beneficiary Four)")
	public void user_select_as_relationshipB4(String relationship) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbLB4Relationship')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=relationship;
		input[3]="//*[contains(@id,'select2-MainContent_cmbLB4Relationship-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as relationship to owner \\\\(For Beneficiary four)",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Beneficiary Four\\)$")
	public void user_enter_as_telephone_For_Beneficiary_Four(String telephone4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Tel']";
		input[1]=telephone4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"6595544202\" as telephone (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as percent of life benefit given \\(For Beneficiary Four\\)$")
	public void user_enter_as_percent_of_life_benefit_given_For_Beneficiary_Four(String percent4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Percent']";
		input[1]=percent4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"20\" as percent of life benefit given (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Beneficiary Four\\)$")
	public void user_enter_as_address_For_Beneficiary_Four(String address4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Address']";
		input[1]=address4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Address No 4\" as address (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as name of guardian/Parent \\(For Guardian Four\\)$")
	public void user_enter_as_name_of_guardian_Parent_For_Guardian_Four(String nameGuardian4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLBG4GuardianName']";
		input[1]=nameGuardian4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Guardian 4\" as name of guardian/Parent (For Guardian Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Guardian Four\\)$")
	public void user_enter_as_date_of_birth_For_Guardian_Four(String dateOfBirthGuardian4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLBG4Dob']";
		input[1]=dateOfBirthGuardian4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"06/04/1995\" as date of birth (For Guardian Four)",output.get("MESSAGE").toString());     
	    Thread.sleep(2000);
	}

	@When("user select {string} as gender \\(For Guardian Four)")
	public void user_select_as_genderG4(String gender) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbLBG4Gender')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=gender;
		input[3]="//*[contains(@id,'select2-MainContent_cmbLBG4Gender-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as gender \\\\(For Guardian Four)",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Guardian Four\\)$")
	public void user_enter_as_telephone_For_Guardian_Four(String telephoneGuardian4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLBG4Telno']";
		input[1]=telephoneGuardian4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"659544202\" as telephone (For Guardian Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Guardian Four\\)$")
	public void user_enter_as_address_For_Guardian_Four(String addressGuardian4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLBG4Address']";
		input[1]=addressGuardian4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Guardian Address 4\" as address (For Guardian Four)",output.get("MESSAGE").toString());     
	}

	
	
	@When ("user select {string} as life beneficiary \\(For Beneficiary One)")
	public void selectLifeBeneficiary(String lifeBeneficiary) throws InterruptedException {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbCopyLifeBenef1')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=lifeBeneficiary;
		input[3]="//*[contains(@id,'select2-MainContent_cmbCopyLifeBenef1-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as life beneficiary \\\\(For Beneficiary One)",output.get("MESSAGE").toString());
	}
	
	

	@When("^user enter \"([^\"]*)\" as percent of savings benefit given \\(For Beneficiary One\\)$")
	public void user_enter_as_percent_of_savings_benefit_given_For_Beneficiary_One(String percentOfSavingBenefit1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSB1Per']";
		input[1]=percentOfSavingBenefit1;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"25\" as percent of savings benefit given (For Beneficiary One)",output.get("MESSAGE").toString());     
	}
	
	
	
	@When("user select {string} as life beneficiary \\(For Beneficiary Two)")
	public void user_select_as_supplier_name(String supplierName) throws InterruptedException {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbCopyLifeBenef2')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=supplierName;
		input[3]="//*[contains(@id,'select2-MainContent_cmbCopyLifeBenef2-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as life beneficiary \\\\(For Beneficiary Two)",output.get("MESSAGE").toString());
	}

	

	@When("^user enter \"([^\"]*)\" as percent of savings benefit given \\(For Beneficiary Two\\)$")
	public void user_enter_as_percent_of_savings_benefit_given_For_Beneficiary_Two(String percentOfSavingBenefit2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSB2Per']";
		input[1]=percentOfSavingBenefit2;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"25\" as percent of savings benefit given (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}
	
	
	
	@When ("user select {string} as life beneficiary \\(For Beneficiary Three)")
	public void user_select_as_supplier_name_Three(String supplierName) throws InterruptedException {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbCopyLifeBenef3')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=supplierName;
		input[3]="//*[contains(@id,'select2-MainContent_cmbCopyLifeBenef3-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as life beneficiary \\\\(For Beneficiary Three)",output.get("MESSAGE").toString());
	}

	

	@When("^user enter \"([^\"]*)\" as percent of savings benefit given \\(For Beneficiary Three\\)$")
	public void user_enter_as_percent_of_savings_benefit_given_For_Beneficiary_Three(String percentOfSavingBenefit3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSB3Per']";
		input[1]=percentOfSavingBenefit3;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"25\" as percent of savings benefit given (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}
	
	

	@When ("user select {string} as life beneficiary \\(For Beneficiary Four)")
	public void user_select_as_supplier_name_Four(String supplierName) throws InterruptedException {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbCopyLifeBenef4')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=supplierName;
		input[3]="//*[contains(@id,'select2-MainContent_cmbCopyLifeBenef4-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as life beneficiary \\\\(For Beneficiary Four)",output.get("MESSAGE").toString());
	}
	
	

	@When("^user enter \"([^\"]*)\" as percent of savings benefit given \\(For Beneficiary Four\\)$")
	public void user_enter_as_percent_of_savings_benefit_given_For_Beneficiary_Four(String percentOfSavingBenefit4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSB4Per']";
		input[1]=percentOfSavingBenefit4;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"25\" as percent of savings benefit given (For Beneficiary Four)",output.get("MESSAGE").toString());     
	    Thread.sleep(2000);
	}
	
	

	@When ("^user click on next button \\(Second Page\\)$")
	public void clickOnNextButtonSecond() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='btnNextScrn2']",  "user click on next button \\\\(Second Page\\\\)","CLICK", 2000);

	}
	@When ("user select {string} as plan")
	public void user_select_as_plan(String plan) throws InterruptedException {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbInsuranceClass')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=plan;
		input[3]="//*[contains(@id,'select2-MainContent_cmbInsuranceClass-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as plan",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as terms\\(Year\\)$")
	public void user_enter_as_terms_Year(String terms) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPolicyTerm']";
		input[1]=terms;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"10\" as terms(Year)",output.get("MESSAGE").toString());       
	}

	

	@When ("user select {string} as payment method")
	public void paymentMethod(String paymentMethod) throws InterruptedException {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbPaymentMode')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=paymentMethod;
		input[3]="//*[contains(@id,'select2-MainContent_cmbPaymentMode-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as payment method",output.get("MESSAGE").toString());
	}
	

	@When("^user enter \"([^\"]*)\" as saving premium$")
	public void user_enter_as_saving_premium(String savingPremium) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSavingPremium']";
		input[1]=savingPremium;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"594200\" as saving premium",output.get("MESSAGE").toString());       
	    Thread.sleep(2000);
	}

	@When("^user click on compute button$")
	public void user_click_on_compute_button() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@id='MainContent_btnCompute']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on compute button",output.get("MESSAGE").toString()); 	 
	    Thread.sleep(2000);
	}

	
	
	@When ("user select {string} as payment frequency")
	public void paymentFrequency(String paymentFrequency) throws InterruptedException {
		Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'MainContent_cmbFrequency')]";
		input[1]="(//*[@class='select2-search__field'])[2]";
		input[2]=paymentFrequency;
		input[3]="//*[contains(@id,'select2-MainContent_cmbFrequency-result-')]";	
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as payment frequency",output.get("MESSAGE").toString());
	}


	

	@When("^user click on calculate schedule button$")
	public void user_click_on_calculate_schedule_button() throws Throwable{
		Object[] input11=new Object[1];
		input11[0]="//*[@id='MainContent_btnGenrateSch']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on calculate schedule button",output.get("MESSAGE").toString()); 	 
		
		Object[] input1=new Object[1];
		input1[0]="//*[@id='MainContent_btnGenrateSch']";
		SeleniumOperations.clickOnElement(input1);
		Thread.sleep(2000);
	}

	
	
	@When("^user click on save button$")
	public void clickOnSaveButton() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='MainContent_btnSave']",  "user click on save button","CLICK", 3000);
	    Itl.ClickEvent("//*[@id='btnBack']", "CLICK", 5000);

	}
	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status1(String awaitingReceipt) throws Throwable {
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_repIQNM_lblStatus_0']";
	    input[1]=awaitingReceipt;
	    Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \"Awaiting Receipt\" as status",output.get("MESSAGE").toString());  
	}
	@When("^user select \"([^\"]*)\" as from date$")
	 public void user_select_as_date_from1(String dateFrom) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtSrchFromDate']";
		 input[1]=dateFrom;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \"01/01/2023\" as from date",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	@When("user enter {string} as Insurance Type")
	public void user_enter_as_insuranceType1(String insuranceType) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtInsuranceType']", insuranceType, "user enter {string} as Insurance Type", "TEXTBOX", 0);
	}
	
	@When ("user click on search button to find {string} quote")
	 public void user_click_on_search_button_quoteNo1(String quoteName) throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='button_btnSearch_lc']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
		 SeleniumOperations.getQuote(quoteName);
		 Thread.sleep(4000);
	 }
	
	@When ("user enter quote number to search {string} quote")
	public void user_enter_as_quote_number1(String quoteName) throws InterruptedException {
		String quoteNo = SeleniumOperations.getQuote(quoteName);
		Itl.CustomSendEvent("//*[@id='MainContent_txtSrchQuote']", quoteNo, "user enter {string} as quote number", "TEXTBOX", 0);
		Itl.CustomClearEvent("//*[@id='MainContent_txtUserId']", "CLEAR", 0);
		Thread.sleep(4000);
	}
	
	@When ("user click on search button")
	 public void user_click_on_search_button_quoteNo1() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='button_btnSearch_lc']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	
	@When("user clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[3]", "user clicks on the actions dropdown", "CLICK", 2000);

	}
	@When("user clicks on edit option")
	public void user_clicks_on_edit_option() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[3]/*[2]/*[1]", "user clicks on edit option", "CLICK", 2000);
	}
	@When("user clicks on print quotation option")
	public void user_clicks_on_print_quotation_option1() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[3]/*[2]/*[3]", "user clicks on print quotation option", "CLICK", 2000);

	}
	@When("the quote should include all relevant details like")
	public void the_quote_should_include_all_relevant_details1(DataTable dataTable) throws IOException, InterruptedException {
		 List<String> rawFields = dataTable.asList(String.class);
		    List<String> fields = new ArrayList<>(rawFields); // ✅ make it modifiable

		    // Remove header row if present
		    if (!fields.isEmpty() && fields.get(0).equalsIgnoreCase("Field")) {
		        fields.remove(0);
		    }
	    for (String field : fields) {
	        Object[] input = new Object[1];
	        input[0] = field.trim();
	        Hashtable<String, Object> output = SeleniumOperations.printQuote(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the quote should include all relevant details like", output.get("MESSAGE").toString());
			Thread.sleep(2000);
	    }
	    
	}
	@When("user enter product discovery details :")
	public void user_enter_product_discovery_details(DataTable dataTable) throws Throwable {

	    Map<String, String> data = dataTable.asMap(String.class, String.class);

	    // Select Insurer
	    if (data.get("Select Insurer") != null) {
	        Itl.CustomDropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbInsurerName')]",
	            "(//*[@class='select2-search__field'])[1]",
	            data.get("Select Insurer"),
	            "(//*[contains(@data-select2-id,'MainContent_cmbInsurerName-result')])",
	            "user select Insurer",
	            "DROPDOWN",
	            0
	        );
	    }

	    // Policy Category
	    if (data.get("Policy Category") != null) {
	        Itl.CustomDropdownEvent(
	            "//*[contains(@aria-controls,'MainContent_cmbPolicyCategory')]",
	            "(//*[@class='select2-search__field'])[1]",
	            data.get("Policy Category"),
	            "(//*[contains(@data-select2-id,'MainContent_cmbPolicyCategory-result')])",
	            "user select Policy Category",
	            "DROPDOWN",
	            0
	        );
	    }

	    // Insurance Type
	    if (data.get("Insurance Type") != null) {
	        Itl.CustomDropdownEvent1(
	            "//*[contains(@aria-controls,'MainContent_cmbPopInsuranceType')]",
	            "(//*[@class='select2-search__field'])[1]",
	            data.get("Insurance Type"),
	            "(//*[contains(@data-select2-id,'MainContent_cmbPopInsuranceType-result')])",
	            "user select Insurance Type",
	            "DROPDOWN",
	            4000
	        );
	    }
	}
	
}
