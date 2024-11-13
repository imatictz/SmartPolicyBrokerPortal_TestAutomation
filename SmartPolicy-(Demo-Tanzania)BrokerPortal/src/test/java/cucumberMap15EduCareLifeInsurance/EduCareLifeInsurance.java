package cucumberMap15EduCareLifeInsurance;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class EduCareLifeInsurance {
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() {
		Object[] input7=new Object[1];
	    input7[0]="//*[@id='MOD_OPERATIONS']";
	    SeleniumOperations.actionClass(input7);
	}

	@When("^user navigate on quotations menu$")
	public void user_navigate_on_quotations_menu() {
		Object[] input8=new Object[1];
	    input8[0]="(//*[text()='Quotations '])[1]";
	    SeleniumOperations.actionClass(input8);
	}

	@When("^user click on current quotations$")
	public void user_click_on_current_quotations() {
		Object[] input9=new Object[1];
	    input9[0]="(//*[text()='Current Quotations'])[1]";
	    SeleniumOperations.clickOnElement(input9);
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws InterruptedException  {
		Object[] input10=new Object[1];
	    input10[0]="//*[@class='bold'][text()='Add']";
	    SeleniumOperations.clickOnElement(input10);
	    Thread.sleep(8000);
	}

	@When("^user click on select insurance type dropdown$")
	public void user_click_on_select_insurance_type_dropdown() throws InterruptedException  {    
		Object[] input11=new Object[1];
		input11[0]="(//*[text()='Select Insurance Type'])[1]";
		SeleniumOperations.clickOnElement(input11);  
		Thread.sleep(3000);
	}

	@When("^user enter \"([^\"]*)\" to search insurance type in search box$")
	public void enterInsuranceType(String insuranceType) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=insuranceType;
	    SeleniumOperations.sendKeys(input);
	    Thread.sleep(2000);
	}
	
	@When ("^user select Educare Life Insurance as insurance type from dropdown$")
	public void selectInsuranceTypeResult() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		SeleniumOperations.clickOnElement(input11);
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as client name$")
	public void enterClientName(String clientName) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtClient']";
	    input[1]=clientName;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
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
	
	@When("^user click on place of birth dropdown$")
	public void clickOnPlaceBirthDropdown() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[4]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on place of birth dropdown",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as place of birth$")
	public void enterPlaceOfBirth(String placeOfBirth) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=placeOfBirth;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"South Africa\" as place of birth",output.get("MESSAGE").toString()); 
	}

	@When("^user select South Africa as place of birth$")
	public void clickOnPlaceOfBirthResult() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select South Africa as place of birth",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as P\\.O\\. Box$")
	public void enterPOBox(String poBox) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPoBox']";
		input[1]=poBox;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"121\" as P.O. Box",output.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as street$")
	public void enterStreet(String street) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtStreet']";
		input[1]=street;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Road\" as street",output.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as suburb$")
	public void enterSuburb(String suburb) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOSuburb']";
		input[1]=suburb;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Village\" as suburb",output.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as town$")
	public void enterTown(String town) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOTwon']";
		input[1]=town;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"City\" as town",output.get("MESSAGE").toString());  
	}

	@When("^user enter \"([^\"]*)\" as region$")
	public void enterRegion(String region) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtRegion']";
		input[1]=region;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Country\" as region",output.get("MESSAGE").toString());  
	}

	@When("^user click on citizen dropdown$")
	public void clickCitizenDropdown() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@CLASS='select2-chosen'])[1]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on citizen dropdown",output.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as citizen$")
	public void enterCitizen(String citizen) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=citizen;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tanzania\" as citizen",output.get("MESSAGE").toString());   
	}

	@When("^user select Tanzania as citizen$")
	public void selectCitizenResult() throws Throwable{
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Tanzania as citizen",output.get("MESSAGE").toString()); 
	}

	@When ("^user click on marital status dropdown$")
	public void clickOnMaritalStatus(){
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[2]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on marital status dropdown",output.get("MESSAGE").toString()); 
	}
	
	@When ("^user enter \"(.*)\" as marital status$")
	public void enterMaritalStatus(String maritalStatus){
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=maritalStatus;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Single\" as marital status",output.get("MESSAGE").toString());   
	}
	
	@When ("^user select single as marital status$")
	public void selectMaritalStatusResult(){
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select single as marital status",output.get("MESSAGE").toString()); 
	}
	
	@When("^user enter \"([^\"]*)\" as employer name$")
	public void enterEmployerName(String employerName) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOEmployerName']";
		input[1]=employerName;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Pravin Testing\" as employer name",output.get("MESSAGE").toString());   
	}

	@When("^user enter \"([^\"]*)\" as employee number /national ID$")
	public void enterEmployeeNumberNationalID(String employeeNumberNationalID) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOEmployeeNumber']";
		input[1]=employeeNumberNationalID;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"5214EDRGno51\" as employee number /national ID",output.get("MESSAGE").toString());   
	}

	@When("^user enter \"([^\"]*)\" as occupation$")
	public void enterOccupation(String occupation) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOOccupation']";
		input[1]=occupation;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Worker\" as occupation",output.get("MESSAGE").toString());   
	}

	@When("^user click on tax payer country dropdown$")
	public void clickTaxPayerCountryDropdown() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@CLASS='select2-chosen'])[5]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on tax payer country dropdown",output.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as tax payer country$")
	public void enterTaxPayerCountry(String taxPayerCountry) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=taxPayerCountry;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"tanzania\" as tax payer country",output.get("MESSAGE").toString());    
	}

	@When("^user select tanzania as tax payer country$")
	public void selectTaxPayerCountryResult() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select tanzania as tax payer country",output.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as employment date$")
	public void enterEmploymentDate(String employmentDate) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPOEmployementDate']";
		input[1]=employmentDate;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
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
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Beneficiary 1\" as name of beneficiary (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Beneficiary one\\)$")
	public void user_enter_as_date_of_birth_For_Beneficiary_one(String dateOfBirth1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB1Dob']";
		input[1]=dateOfBirth1;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"15/05/1988\" as date of birth (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user click on gender dropdown \\(For Beneficiary one\\)$")
	public void user_click_on_gender_dropdown_For_Beneficiary_one() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[6]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on gender dropdown (For Beneficiary one)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as gender \\(For Beneficiary one\\)$")
	public void user_enter_as_gender_For_Beneficiary_one(String gender1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=gender1;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Male\" as gender (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user select Male as gender \\(For Beneficiary one\\)$")
	public void user_select_Male_as_gender_For_Beneficiary_one() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-result-label'])[2]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Male as gender (For Beneficiary one)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user click on relationship to owner dropdown \\(For Beneficiary one\\)$")
	public void user_click_on_relationship_to_owner_dropdown_For_Beneficiary_one() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[7]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on relationship to owner dropdown (For Beneficiary one)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as relationship to owner \\(For Beneficiary one\\)$")
	public void user_enter_as_relationship_to_owner_For_Beneficiary_one(String relation1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=relation1;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Self\" as relationship to owner (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user select self as relationship to owner \\(For Beneficiary one\\)$")
	public void user_select_self_as_relationship_to_owner_For_Beneficiary_one() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select self as relationship to owner (For Beneficiary one)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Beneficiary one\\)$")
	public void user_enter_as_telephone_For_Beneficiary_one(String telephone1) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB1Tel']";
		input[1]=telephone1;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"6595544202\" as telephone (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as percent of life benefit given \\(For Beneficiary one\\)$")
	public void user_enter_as_percent_of_life_benefit_given_For_Beneficiary_one(String percent1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB1Percent']";
		input[1]=percent1;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"15\" as percent of life benefit given (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Beneficiary one\\)$")
	public void user_enter_as_address_For_Beneficiary_one(String address1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB1Address']";
		input[1]=address1;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Address No 1\" as address (For Beneficiary one)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as name of beneficiary \\(For Beneficiary Two\\)$")
	public void user_enter_as_name_of_beneficiary_For_Beneficiary_Two(String name2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Name']";
		input[1]=name2;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Beneficiary 2\" as name of beneficiary (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Beneficiary Two\\)$")
	public void user_enter_as_date_of_birth_For_Beneficiary_Two(String dateOfBirth2) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Dob']";
		input[1]=dateOfBirth2;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"01/02/1990\" as date of birth (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("^user click on gender dropdown \\(For Beneficiary Two\\)$")
	public void user_click_on_gender_dropdown_For_Beneficiary_Two() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[8]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on gender dropdown (For Beneficiary Two)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as gender \\(For Beneficiary Two\\)$")
	public void user_enter_as_gender_For_Beneficiary_Two(String gender2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=gender2;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Female\" as gender (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("^user select female as gender \\(For Beneficiary Two\\)$")
	public void user_select_female_as_gender_For_Beneficiary_Two() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-result-label'])";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select female as gender (For Beneficiary Two)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user click on relationship to owner dropdown \\(For Beneficiary Two\\)$")
	public void user_click_on_relationship_to_owner_dropdown_For_Beneficiary_Two() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[9]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on relationship to owner dropdown (For Beneficiary Two)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as relationship to owner \\(For Beneficiary Two\\)$")
	public void user_enter_as_relationship_to_owner_For_Beneficiary_Two(String relation2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=relation2;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"employee\" as relationship to owner (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("^user select employee as relationship to owner \\(For Beneficiary Two\\)$")
	public void user_select_employee_as_relationship_to_owner_For_Beneficiary_Two() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select employee as relationship to owner (For Beneficiary Two)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Beneficiary Two\\)$")
	public void user_enter_as_telephone_For_Beneficiary_Two(String telephone2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Tel']";
		input[1]=telephone2;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"6595544202\" as telephone (For Beneficiary Two)",output.get("MESSAGE").toString());       
	}

	@When("^user enter \"([^\"]*)\" as percent of life benefit given \\(For Beneficiary Two\\)$")
	public void user_enter_as_percent_of_life_benefit_given_For_Beneficiary_Two(String percent2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Percent']";
		input[1]=percent2;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"30\" as percent of life benefit given (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Beneficiary Two\\)$")
	public void user_enter_as_address_For_Beneficiary_Two(String address2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB2Address']";
		input[1]=address2;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Address No 2\" as address (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as name of beneficiary \\(For Beneficiary Three\\)$")
	public void user_enter_as_name_of_beneficiary_For_Beneficiary_Three(String name3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB3Name']";
		input[1]=name3;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Beneficiary 3\" as name of beneficiary (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Beneficiary Three\\)$")
	public void user_enter_as_date_of_birth_For_Beneficiary_Three(String dateOfBirth3) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtLB3Dob']";
		 input[1]=dateOfBirth3;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"20/12/1998\" as date of birth (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user click on gender dropdown \\(For Beneficiary Three\\)$")
	public void user_click_on_gender_dropdown_For_Beneficiary_Three() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[10]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on gender dropdown (For Beneficiary Three)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as gender \\(For Beneficiary Three\\)$")
	public void user_enter_as_gender_For_Beneficiary_Three(String gender3) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=gender3;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"other\" as gender (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user select other as gender \\(For Beneficiary Three\\)$")
	public void user_select_other_as_gender_For_Beneficiary_Three() throws Throwable{
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-result-label'])";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select other as gender (For Beneficiary Three)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user click on relationship to owner dropdown \\(For Beneficiary Three\\)$")
	public void user_click_on_relationship_to_owner_dropdown_For_Beneficiary_Three() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[11]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on relationship to owner dropdown (For Beneficiary Three)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as relationship to owner \\(For Beneficiary Three\\)$")
	public void user_enter_as_relationship_to_owner_For_Beneficiary_Three(String relation3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=relation3;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"son\" as relationship to owner (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user select son as relationship to owner \\(For Beneficiary Three\\)$")
	public void user_select_son_as_relationship_to_owner_For_Beneficiary_Three() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select son as relationship to owner (For Beneficiary Three)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Beneficiary Three\\)$")
	public void user_enter_as_telephone_For_Beneficiary_Three(String telephone3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB3Tel']";
	    input[1]=telephone3;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"6595544202\" as telephone (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as percent of life benefit given \\(For Beneficiary Three\\)$")
	public void user_enter_as_percent_of_life_benefit_given_For_Beneficiary_Three(String percent3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB3Percent']";
		input[1]=percent3;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"35\" as percent of life benefit given (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Beneficiary Three\\)$")
	public void user_enter_as_address_For_Beneficiary_Three(String address3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB3Address']";
		input[1]=address3;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Address No 3\" as address (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as name of beneficiary \\(For Beneficiary Four\\)$")
	public void user_enter_as_name_of_beneficiary_For_Beneficiary_Four(String name4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Name']";
		input[1]=name4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Beneficiary 4\" as name of beneficiary (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Beneficiary Four\\)$")
	public void user_enter_as_date_of_birth_For_Beneficiary_Four(String dateOfBirth4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Dob']";
		input[1]=dateOfBirth4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"06/05/2010\" as date of birth (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user click on gender dropdown \\(For Beneficiary Four\\)$")
	public void user_click_on_gender_dropdown_For_Beneficiary_Four() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[12]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on gender dropdown (For Beneficiary Four)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as gender \\(For Beneficiary Four\\)$")
	public void user_enter_as_gender_For_Beneficiary_Four(String gender4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=gender4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Male\" as gender (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user select male as gender \\(For Beneficiary Four\\)$")
	public void user_select_male_as_gender_For_Beneficiary_Four() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-result-label'])";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select male as gender (For Beneficiary Four)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user click on relationship to owner dropdown \\(For Beneficiary Four\\)$")
	public void user_click_on_relationship_to_owner_dropdown_For_Beneficiary_Four() throws Throwable {
        Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[13]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on relationship to owner dropdown (For Beneficiary Four)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as relationship to owner \\(For Beneficiary Four\\)$")
	public void user_enter_as_relationship_to_owner_For_Beneficiary_Four(String relation4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=relation4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"brother\" as relationship to owner (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user select brother as relationship to owner \\(For Beneficiary Four\\)$")
	public void user_select_brother_as_relationship_to_owner_For_Beneficiary_Four() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select brother as relationship to owner (For Beneficiary Four)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Beneficiary Four\\)$")
	public void user_enter_as_telephone_For_Beneficiary_Four(String telephone4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Tel']";
		input[1]=telephone4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"6595544202\" as telephone (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as percent of life benefit given \\(For Beneficiary Four\\)$")
	public void user_enter_as_percent_of_life_benefit_given_For_Beneficiary_Four(String percent4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Percent']";
		input[1]=percent4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"20\" as percent of life benefit given (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Beneficiary Four\\)$")
	public void user_enter_as_address_For_Beneficiary_Four(String address4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLB4Address']";
		input[1]=address4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Address No 4\" as address (For Beneficiary Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as name of guardian/Parent \\(For Guardian Four\\)$")
	public void user_enter_as_name_of_guardian_Parent_For_Guardian_Four(String nameGuardian4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLBG4GuardianName']";
		input[1]=nameGuardian4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Tester Testing Guardian 4\" as name of guardian/Parent (For Guardian Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as date of birth \\(For Guardian Four\\)$")
	public void user_enter_as_date_of_birth_For_Guardian_Four(String dateOfBirthGuardian4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLBG4Dob']";
		input[1]=dateOfBirthGuardian4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"06/04/1995\" as date of birth (For Guardian Four)",output.get("MESSAGE").toString());     
	    Thread.sleep(2000);
	}

	@When("^user click on gender dropdown \\(For Guardian Four\\)$")
	public void user_click_on_gender_dropdown_For_Guardian_Four() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[17]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on gender dropdown (For Guardian Four)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as gender \\(For Guardian Four\\)$")
	public void user_enter_as_gender_For_Guardian_Four(String genderGuardian4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=genderGuardian4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Female\" as gender (For Guardian Four)",output.get("MESSAGE").toString());     
	}

	@When("^user select Female as gender \\(For Guardian Four\\)$")
	public void user_select_Female_as_gender_For_Guardian_Four() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Female as gender (For Guardian Four)",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as telephone \\(For Guardian Four\\)$")
	public void user_enter_as_telephone_For_Guardian_Four(String telephoneGuardian4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLBG4Telno']";
		input[1]=telephoneGuardian4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"659544202\" as telephone (For Guardian Four)",output.get("MESSAGE").toString());     
	}

	@When("^user enter \"([^\"]*)\" as address \\(For Guardian Four\\)$")
	public void user_enter_as_address_For_Guardian_Four(String addressGuardian4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtLBG4Address']";
		input[1]=addressGuardian4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Guardian Address 4\" as address (For Guardian Four)",output.get("MESSAGE").toString());     
	}

	
	
	@When ("user select {string} as life beneficiary \\(For Beneficiary One)")
	public void selectLifeBeneficiary(String lifeBeneficiary) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbCopyLifeBenef1']", "//*[@class='select2-input select2-focused']", 
	    		lifeBeneficiary, "//*[@class='select2-match']", "user select {string} as life beneficiary \\\\(For Beneficiary One)", "DROPDOWN", 0);
	}
	
	

	@When("^user enter \"([^\"]*)\" as percent of savings benefit given \\(For Beneficiary One\\)$")
	public void user_enter_as_percent_of_savings_benefit_given_For_Beneficiary_One(String percentOfSavingBenefit1) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSB1Per']";
		input[1]=percentOfSavingBenefit1;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"25\" as percent of savings benefit given (For Beneficiary One)",output.get("MESSAGE").toString());     
	}
	
	
	
	@When("user select {string} as life beneficiary \\(For Beneficiary Two)")
	public void user_select_as_supplier_name(String supplierName) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbCopyLifeBenef2']", "//*[@class='select2-input select2-focused']", 
	    supplierName, "//*[@class='select2-match']", "user select {string} as life beneficiary (For Beneficiary Two)", "DROPDOWN", 0);
	}

	

	@When("^user enter \"([^\"]*)\" as percent of savings benefit given \\(For Beneficiary Two\\)$")
	public void user_enter_as_percent_of_savings_benefit_given_For_Beneficiary_Two(String percentOfSavingBenefit2) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSB2Per']";
		input[1]=percentOfSavingBenefit2;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"25\" as percent of savings benefit given (For Beneficiary Two)",output.get("MESSAGE").toString());     
	}
	
	
	
	@When ("user select {string} as life beneficiary \\(For Beneficiary Three)")
	public void user_select_as_supplier_name_Three(String supplierName) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbCopyLifeBenef3']", "//*[@class='select2-input select2-focused']", 
	    supplierName, "//*[@class='select2-match']", "user select {string} as life beneficiary (For Beneficiary Three)", "DROPDOWN", 0);
	}

	

	@When("^user enter \"([^\"]*)\" as percent of savings benefit given \\(For Beneficiary Three\\)$")
	public void user_enter_as_percent_of_savings_benefit_given_For_Beneficiary_Three(String percentOfSavingBenefit3) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSB3Per']";
		input[1]=percentOfSavingBenefit3;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"25\" as percent of savings benefit given (For Beneficiary Three)",output.get("MESSAGE").toString());     
	}
	
	

	@When ("user select {string} as life beneficiary \\(For Beneficiary Four)")
	public void user_select_as_supplier_name_Four(String supplierName) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbCopyLifeBenef4']", "//*[@class='select2-input select2-focused']", 
	    supplierName, "//*[@class='select2-match']", "user select {string} as life beneficiary (For Beneficiary Four)", "DROPDOWN", 0);
	}
	
	

	@When("^user enter \"([^\"]*)\" as percent of savings benefit given \\(For Beneficiary Four\\)$")
	public void user_enter_as_percent_of_savings_benefit_given_For_Beneficiary_Four(String percentOfSavingBenefit4) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSB4Per']";
		input[1]=percentOfSavingBenefit4;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"25\" as percent of savings benefit given (For Beneficiary Four)",output.get("MESSAGE").toString());     
	    Thread.sleep(2000);
	}
	
	

	@When ("^user click on next button \\(Second Page\\)$")
	public void clickOnNextButtonSecond() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='btnNextScrn2']",  "user click on next button \\\\(Second Page\\\\)","CLICK", 2000);

	}
	@When("^user click on plan dropdown$")
	public void user_click_on_plan_dropdown() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="(//*[@class='select2-chosen'])[37]";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on plan dropdown",output.get("MESSAGE").toString()); 	
	}

	@When("^user enter \"([^\"]*)\" as plan$")
	public void user_enter_as_plan(String plan) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=plan;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Option 5\" as plan",output.get("MESSAGE").toString());       
	}

	@When("^user click on option Five as plan$")
	public void user_click_on_option_Five_as_plan() throws Throwable{
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on option Five as plan",output.get("MESSAGE").toString()); 	 
	}

	@When("^user enter \"([^\"]*)\" as terms\\(Year\\)$")
	public void user_enter_as_terms_Year(String terms) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtPolicyTerm']";
		input[1]=terms;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"10\" as terms(Year)",output.get("MESSAGE").toString());       
	}

	

	@When ("^user select \"(.*)\" as payment method$")
	public void paymnetMethod(String supplierName) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbPaymentMode']", "//*[@class='select2-input select2-focused']", 
	    supplierName, "//*[@class='select2-match']", "user select \\\"(.*)\\\" as payment method", "DROPDOWN", 0);
	}
	

	@When("^user enter \"([^\"]*)\" as saving premium$")
	public void user_enter_as_saving_premium(String savingPremium) throws Throwable{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSavingPremium']";
		input[1]=savingPremium;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
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

	
	
	@When ("^user select \"(.*)\" as payment frequency$")
	public void paymentFrequency(String supplierName) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbFrequency']", "//*[@class='select2-input select2-focused']", 
	    supplierName, "//*[@class='select2-match']", "user select \\\"(.*)\\\" as payment frequency", "DROPDOWN", 0);
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
	    Itl.CustomClickEvent("//*[@id='MainContent_btnSave']",  "user click on save button","CLICK", 2000);

	}
}
