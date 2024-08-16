package cucumberMap18Claims;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Claims {
	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws InterruptedException {
		Object[] input7=new Object[1];
		input7[0]="//*[@id='MOD_OPERATIONS']";
		SeleniumOperations.actionClass(input7);
		Thread.sleep(2000); 
	}
	 
	@When("^user Click on risk note menu$")
	public void user_Click_on_risk_note_menu() throws Throwable {
		Object[] input=new Object[1];
		input[0]="(//*[text()='Risk Note '])[1]";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as from date$")
	public void user_select_as_date_from(String dateFrom) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSrchFromDate']";
		input[1]=dateFrom;
		Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \"01/01/2023\" as from date",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When("^user enter \"([^\"]*)\" as risk note number$")
	public void user_enter_as_risk_note_number(String riskNote) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtRiskNote']";
		 input[1]=riskNote;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as risk note number$",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @When("^user click on search button$")
	 public void user_click_on_search_button() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_btnSearch']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on options button$")
	 public void user_click_on_options_button() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@class='btn default dropdown-toggle']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on options button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on report claim umbrella like button$")
	 public void user_click_on_report_claim_umbrella_like_button() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='MainContent_repICNM_btnClaim_0']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on report claim umbrella like button",output.get("MESSAGE").toString());
		 Thread.sleep(10000);
	 }

	 @When("^user enter \"([^\"]*)\" as date of loss/Accident$")
	 public void user_enter_as_date_of_loss_Accident(String dateOfLoss) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtAcciDate']";
		 input[1]=dateOfLoss;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as date of loss/Accident",output.get("MESSAGE").toString());
	 }

	 @When("^user click on intimation type dropdown$")
	 public void user_click_on_intimation_type_dropdown() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='s2id_MainContent_cmbIntimationType']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on intimation type dropdown",output.get("MESSAGE").toString());
		   
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='s2id_MainContent_cmbIntimationType']";
		 SeleniumOperations.clickOnElement(input1);
	 }

	 @When("^user enter \"([^\"]*)\" as intimation type$")
	 public void user_enter_as_intimation_type(String intimationType) throws Throwable{
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=intimationType;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as intimation type",output.get("MESSAGE").toString());
	     Thread.sleep(2000);
	 }

	 @When("^user select Phone as intimation type$")
	 public void user_select_Phone_as_intimation_type() throws Throwable {
		 Object[]input=new Object[1];
		 input[0]="//*[@class='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Phone as intimation type",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
     }

	 @When("^user click on country of loss dropdown$")
	 public void user_click_on_country_of_loss_dropdown() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='s2id_MainContent_cmbCountryCode']";
		 SeleniumOperations.clickOnElement(input1);
		 Thread.sleep(2000);
		 
		 Object[] input=new Object[1];
		 input[0]="//*[@id='s2id_MainContent_cmbCountryCode']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on country of loss dropdown",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as country of loss$")
	 public void user_enter_as_country_of_loss(String countryOfLoss) throws Throwable{
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=countryOfLoss;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as country of loss",output.get("MESSAGE").toString());
	 }

	 @When("^user select Tanzania as country of loss$")
	 public void user_select_Tanzania_as_country_of_loss() throws Throwable {
		 Object[]input=new Object[1];
		 input[0]="//*[@class='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Tanzania as country of loss",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on cause of loss/accident dropdown$")
	 public void user_click_on_cause_of_loss_accident_dropdown() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='s2id_MainContent_cmbClmmCauses']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on cause of loss/accident dropdown",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as cause of loss/accident$")
	 public void user_enter_as_cause_of_loss_accident(String causeOfLoss) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=causeOfLoss;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as cause of loss/accident",output.get("MESSAGE").toString());
	 }

	 @When("^user select Burglary as cause of loss/accident$")
	 public void user_select_Burglary_as_cause_of_loss_accident() throws Throwable {
		 Object[]input=new Object[1];
		 input[0]="//*[@class='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Burglary as cause of loss/accident",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on region/city dropdown$")
	 public void user_click_on_region_city_dropdown() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='s2id_MainContent_cmbRegion']";
		 SeleniumOperations.clickOnElement(input1);
		 Thread.sleep(2000);
		 
		 Object[] input=new Object[1];
		 input[0]="//*[@id='s2id_MainContent_cmbRegion']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on region/city dropdown",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as region/city$")
	 public void user_enter_as_region_city(String region) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=region;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as region/city",output.get("MESSAGE").toString()); 
	 }

	 @When("^user select Dodoma as region/city$")
	 public void user_select_Dodoma_as_region_city() throws Throwable {
		 Object[]input=new Object[1];
		 input[0]="//*[@class='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Dodoma as region/city",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on district dropdown$")
	 public void user_click_on_district_dropdown() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='s2id_MainContent_cmbDistrict']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on district dropdown",output.get("MESSAGE").toString());
		   
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='s2id_MainContent_cmbDistrict']";
		 SeleniumOperations.clickOnElement(input1);
		 Thread.sleep(2000); 
	 }

	 @When("^user enter \"([^\"]*)\" as district$")
	 public void user_enter_as_district(String district) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=district;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as district",output.get("MESSAGE").toString()); 
	 }

	 @When("^user select Bahi as district$")
	 public void user_select_Bahi_as_district() throws Throwable {
		 Object[]input=new Object[1];
		 input[0]="//*[@class='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Bahi as district",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as place of loss/accident$")
	 public void user_enter_as_place_of_loss_accident(String placeOfLoss) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtAcciPlace']";
		 input[1]=placeOfLoss;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as place of loss/accident",output.get("MESSAGE").toString()); 
	 }

	 @When("^user enter \"([^\"]*)\" as Circumstances of the accident$")
	 public void user_enter_as_Circumstances_of_the_accident(String CircumstancesOfAccident) throws Throwable{
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtCircums']";
		 input[1]=CircumstancesOfAccident;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Circumstances of the accident",output.get("MESSAGE").toString());  
	 }

	 @When("^user enter \"([^\"]*)\" as Third Party Insurance Information \\(Insurer/Cover\\)$")
	 public void user_enter_as_Third_Party_Insurance_Information_Insurer_Cover(String thirdPartyInsurance) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtInsuranceInfo']";
		 input[1]=thirdPartyInsurance;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Third Party Insurance Information \\\\(Insurer/Cover\\\\)",output.get("MESSAGE").toString());  
	 }

	 @When("^user enter \"([^\"]*)\" as Nature of Loss$")
	 public void user_enter_as_Nature_of_Loss(String natureOfLoss) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtNatureofLoss']";
		 input[1]=natureOfLoss;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Third Party Insurance Information \\\\(Insurer/Cover\\\\)",output.get("MESSAGE").toString());  
	 }

	 @When("^user click on claimant loss type dropdown$")
	 public void user_click_on_claimant_loss_type_dropdown() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='s2id_MainContent_cmbLossType']";
		 SeleniumOperations.clickOnElement(input1);
		 Thread.sleep(2000); 
		 
		 Object[] input=new Object[1];
		 input[0]="//*[@id='s2id_MainContent_cmbLossType']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on claimant loss type dropdown",output.get("MESSAGE").toString());
	 }

	 @When("^user enter \"([^\"]*)\" as claimant loss type$")
	 public void user_enter_as_claimant_loss_type(String claimantLoss) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=claimantLoss;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as claimant loss type",output.get("MESSAGE").toString()); 
	 }

	 @When("^user select Own Damage as claimant loss type$")
	 public void user_select_Own_Damage_as_claimant_loss_type() throws Throwable {
		 Object[]input=new Object[1];
		 input[0]="//*[@class='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Own Damage as claimant loss type",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as Payee/Beneficiary$")
	 public void user_enter_as_Payee_Benefeciary(String payeeBeneficiary) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtPayeeBenefeciary']";
		 input[1]=payeeBeneficiary;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Payee/Beneficiary",output.get("MESSAGE").toString()); 
	 }

	 @When("^user enter \"([^\"]*)\" as Description of Injury$")
	 public void user_enter_as_Description_of_Injury(String descriptionOfInjury) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtInvolved']";
		 input[1]=descriptionOfInjury;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Description of Injury",output.get("MESSAGE").toString()); 
	 }

	 @When("^user enter \"([^\"]*)\" as Remarks$")
	 public void user_enter_as_Remarks(String remarks) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtRemark']";
		 input[1]=remarks;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Remarks",output.get("MESSAGE").toString()); 
	     Thread.sleep(2000);
	 }

	 @When("^user click on insert claimant button$")
	 public void user_click_on_insert_claimant_button() throws Throwable {
		 Object[]input1=new Object[1];
		 input1[0]="//*[@id='btnClaimantInsert']";
		 SeleniumOperations.clickOnElement(input1);
		 Thread.sleep(2000);
		 
		 Object[]input=new Object[1];
		 input[0]="//*[@id='btnClaimantInsert']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert claimant button",output.get("MESSAGE").toString());
	 }

	 @When("^user click on save button$")
	 public void user_click_on_save_button() throws Throwable {
		 Object[]input1=new Object[1];
		 input1[0]="//*[@id='MainContent_btnSave']";
		 SeleniumOperations.clickOnElement(input1);
		 Thread.sleep(2000); 
		 
		 Object[]input=new Object[1];
		 input[0]="//*[@id='MainContent_btnSave']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on save button",output.get("MESSAGE").toString());
	 }

	 @When ("^user able to view \"(.*)\" screen$")
	 public void validation(String validation) throws InterruptedException {
		 Object[] input=new Object[2];
		 input[0]="//*[text()='MANAGE CLAIMS']";
		 input[1]=validation;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"(.*)\\\" screen",output.get("MESSAGE").toString()); 
	     Thread.sleep(2000);    
	 }

	 @When("^user navigate on claims management$")
	 public void user_navigate_on_claims_management() throws Throwable {
	     Object[] input=new Object[1];
		 input[0]="//li[@id='MNU_CLAIM']";
		 SeleniumOperations.clickOnElement(input);
		 Thread.sleep(2000);
	 }

	 @Then("^user click on manage claim$")
	 public void user_click_on_manage_claim() throws Throwable {
	     Object[] input=new Object[1];
		 input[0]="//li[@id='MNU_WFCLMM']";
		 SeleniumOperations.clickOnElement(input);
		 Thread.sleep(2000);
	 }

	 @When("^user click on branch dropdown$")
	 public void user_click_on_branch_dropdown() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="(//*[@class='select2-chosen'])[1]";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on branch dropdown",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as branch$")
	 public void user_enter_as_branch(String branch) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=branch;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as branch",output.get("MESSAGE").toString());  
	 }
		
     @Then("^user select All as branch$")
	 public void user_select_All_as_branch() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@class='select2-match']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select All as branch",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }
	
	 @When("^user click on attach documents button$")
	 public void user_click_on_attach_documents_button() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='MainContent_gridCLMGDetails_btnAttch_0']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on attach documents button",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @When("^user click on attachment type dropdown$")
	 public void user_click_on_attachment_type_dropdown() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="(//*[@class='select2-chosen'])[41]";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on attachment type dropdown",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as document$")
	 public void user_enter_as_document(String document) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=document;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as document",output.get("MESSAGE").toString());  
	     Thread.sleep(2000);
     }
		
     @Then("^user select document to be attach$")
	 public void user_select_document_to_be_attach() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="(//*[@class='select2-match'])";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on attachment type dropdown",output.get("MESSAGE").toString());  
		 Thread.sleep(4000);
	 }

	 @When("^user click on select file button$")
	 public void user_click_on_select_file_button() throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='ctl00_MainContent_AsyncFileUpload_ctl02']";
		 input[1]="C:\\Users\\91993\\Desktop\\Document.PNG";
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as document",output.get("MESSAGE").toString());  
		 Thread.sleep(4000);
	 }
		
     @When("^user click on email option$")
	 public void user_click_on_email_option() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='MainContent_gridCLMGDetails_btnEmail_0']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on email option",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @When("^user click on to insurer option$")
	 public void user_click_on_to_email_option() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="(//*[@class='fa fa-user'])[3]";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on email option",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @When("^user enter \"([^\"]*)\" as email$")
	 public void user_enter_as_email(String email) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtEmailTo']";
		 input[1]=email;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as email",output.get("MESSAGE").toString());  
	     Thread.sleep(2000);
	 }

	 @Then("^user click on send email button$")
	 public void user_click_on_send_email_button() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='btnInsurer']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on send email button",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @When("^user click on feedback option$")
	 public void user_click_on_feedback_option() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='MainContent_gridCLMGDetails_btnFeedback_0']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on feedback option",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
     }

	 @When("^user enter \"([^\"]*)\" as feedback/Comments$")
	 public void user_enter_as_feedback_Comments(String comments) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtDisNotes']";
		 input[1]=comments;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as email",output.get("MESSAGE").toString());  
	     Thread.sleep(1000);
	 }

	 @When("^user enter \"([^\"]*)\" follow-up date$")
	 public void user_enter_follow_up_date(String followUpDate) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtFolowUp']";
		 input[1]=followUpDate;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" follow-up date",output.get("MESSAGE").toString());  
	     Thread.sleep(1000);
		 
	     Object[] input1=new Object[1];
		 input1[0]="//*[@id='chkEmailFeedback']";
		 SeleniumOperations.clickOnElement(input1);
	 }

	 @Then("^user click on insert button$")
	 public void user_click_on_insert_button() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="//*[@id='btnDisSave']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert button",output.get("MESSAGE").toString());  
		 Thread.sleep(4000);
	 }

	 @When("^user click on status dropdown$")
	 public void user_click_on_status_dropdown() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="(//*[@class='select2-arrow'])[39]";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on status dropdown",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @When("^user enter \"([^\"]*)\" as status$")
	 public void user_enter_as_status(String status) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@class='select2-input select2-focused']";
		 input[1]=status;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as status",output.get("MESSAGE").toString());  
	     Thread.sleep(2000);
	 }

	 @Then("^user select Claim settled as status$")
	 public void user_select_Claim_settled_as_status() throws Throwable {
		 Object[] input1=new Object[1];
		 input1[0]="(//*[@class='select2-match'])";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Claim settled as status",output.get("MESSAGE").toString());  
	 }	 	
}
