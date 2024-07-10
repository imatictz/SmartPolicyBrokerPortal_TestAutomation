package cucumberMap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ClientDetails {
	
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
	    Thread.sleep(4000);
	}

	@When("^user click on select insurance type dropdown$")
	public void user_click_on_select_insurance_type_dropdown() throws InterruptedException  {    
		Object[] input11=new Object[1];
		input11[0]="(//*[text()='Select Insurance Type'])[1]";
		SeleniumOperations.clickOnElement(input11);  
		Thread.sleep(5000);
	}

	@When("^user enter \"([^\"]*)\" to search insurance type in search box$")
	public void user_enter_to_search_insurance_type_in_search_box(String insuranceType) throws InterruptedException {
		Object[] input12=new Object[2];
	    input12[0]="//*[@class='select2-input select2-focused']";
	    input12[1]=insuranceType;
	    SeleniumOperations.sendKeys(input12);
	    Thread.sleep(2000);
	}

	@When("^user select money insurance cover as insurance type from dropdown$")
	public void user_select_money_insurance_cover_as_insurance_type_from_dropdown() {
		Object[] input13=new Object[1];
	    input13[0]="//*[@class='select2-result-label']";
	    SeleniumOperations.clickOnElement(input13);
	}

	@When("^user click on Click here for New Client link$")
	public void user_click_on_Click_here_for_New_Client_link() throws InterruptedException {   
		Thread.sleep(4000);
		Object[] input14=new Object[1];
		input14[0]="//*[@id='client']";
		SeleniumOperations.clickOnElement(input14);
		Thread.sleep(3000);
	}

	@When("^user click on title dropdown$")
	public void user_click_on_title_dropdown() throws InterruptedException {
		Object[] input15=new Object[1];
	    input15[0]="//*[@id='s2id_MainContent_cmbTitle']";
	    Hashtable<String, Object> output15 = SeleniumOperations.clickOnElement(input15);
	    HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(),"^user click on title dropdown$",output15.get("MESSAGE").toString());  
	    Thread.sleep(5000);
	}

	@When("^user enter \"([^\"]*)\" as title in search box$")
	public void user_enter_as_title_in_search_box(String Mr) throws InterruptedException {  
		Object[] input16=new Object[2];
		input16[0]="(//*[@class='select2-input select2-focused'])";
		input16[1]=Mr;
		Hashtable<String, Object> output16 =SeleniumOperations.sendKeys(input16);
		HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(),"user enter \"Mr\" as title in search box",output16.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user click on Mr from dropdown$")
	public void user_click_on_Mr_from_dropdown() throws InterruptedException {
		Thread.sleep(5000);
	    Object[] input17=new Object[1];
	    input17[0]="(//*[@class='select2-match'])[1]";
	    Hashtable<String, Object> output17 =SeleniumOperations.clickOnElement(input17);
	    HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(),"user click on Mr from dropdown",output17.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as client name$")
	public void user_enter_as_client_name(String clientName) throws InterruptedException {   
		Thread.sleep(4000);
		Object[] input18=new Object[2];
		input18[0]="//*[@id='MainContent_txtCltName']";
		input18[1]=clientName;
		Hashtable<String, Object> output18 =SeleniumOperations.sendKeys(input18);
		HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(),"user enter \"Automation3\" as client name",output18.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user click in account number field$")
	public void user_click_in_account_number_field() throws InterruptedException {   
		Thread.sleep(4000);
		Object[] input19=new Object[1];
		input19[0]="//*[@class='form-control'][@id='txtCltRefID']";
		Hashtable<String, Object> output19 =SeleniumOperations.clickOnElement(input19);
		HTMLReportGenerator.StepDetails(output19.get("STATUS").toString(),"user click in account number field",output19.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as account number$")
	public void user_enter_as_account_number(String accNumber) throws InterruptedException{   
		Thread.sleep(4000);
		Object[] input20=new Object[2];
		input20[0]="//*[@class='form-control'][@id='txtCltRefID']";
		input20[1]=accNumber;
		Hashtable<String, Object> output20 =SeleniumOperations.sendKeys(input20);
		HTMLReportGenerator.StepDetails(output20.get("STATUS").toString(),"user enter \"12345678901\" as account number",output20.get("MESSAGE").toString());
		Thread.sleep(4000);
	}

	@When("^user click on ID type dropdown$")
	public void user_click_on_ID_type_dropdown() throws InterruptedException {
		Object[] input21=new Object[1];
	    input21[0]="//*[@id='s2id_MainContent_cmbIDType']";
	    Hashtable<String, Object> output21 =SeleniumOperations.clickOnElement(input21);
	    HTMLReportGenerator.StepDetails(output21.get("STATUS").toString(),"user click on ID type dropdown",output21.get("MESSAGE").toString());    
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" to search ID type in search box$")
	public void user_enter_to_search_ID_type_in_search_box(String idType) throws InterruptedException {
		Object[] input22=new Object[2];
	    input22[0]="//*[@class='select2-input select2-focused']";
	    input22[1]=idType;
	    Hashtable<String, Object> output22 =SeleniumOperations.sendKeys(input22);
	    HTMLReportGenerator.StepDetails(output22.get("STATUS").toString(),"user enter \"Birth certificate\" to search ID type in search box",output22.get("MESSAGE").toString());
	    Thread.sleep(3000);   
	}

	@When("^user click on birth certificate as ID type from dropdown$")
	public void user_click_on_birth_certificate_as_ID_type_from_dropdown() throws InterruptedException {
		Object[] input23=new Object[1];
	    input23[0]="(//*[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted'])";
	    Hashtable<String, Object> output23 =SeleniumOperations.clickOnElement(input23);
	    HTMLReportGenerator.StepDetails(output23.get("STATUS").toString(),"user click on birth certificate as ID type from dropdown",output23.get("MESSAGE").toString());
	    Thread.sleep(2000);    
	}

	@When("^user enter \"([^\"]*)\" as ID number$")
	public void user_enter_as_ID_number(String idNumber) throws InterruptedException {
		Object[] input24=new Object[2];
	    input24[0]="//*[@id='txtIDNumber']";
	    input24[1]=idNumber;
	    Hashtable<String, Object> output24 =SeleniumOperations.sendKeys(input24);
	    HTMLReportGenerator.StepDetails(output24.get("STATUS").toString(),"user enter \"12345678901\" as ID number",output24.get("MESSAGE").toString());    
	    Thread.sleep(2000);
	}

	@When("^user click on date of birth icon$")
	public void user_click_on_date_of_birth_icon() {
		Object[] input25=new Object[1];
	    input25[0]="(//*[@class='fa fa-calendar'])[4]";
	    Hashtable<String, Object> output25 =SeleniumOperations.clickOnElement(input25);
	    HTMLReportGenerator.StepDetails(output25.get("STATUS").toString(),"user click on date of birth icon",output25.get("MESSAGE").toString());        
	}

	@When("^user click on previous button$")
	public void user_click_on_previous_button() {
		Object[] input26=new Object[1];
	    input26[0]="(//*[@style='visibility: visible;'])[3]";
	    Hashtable<String, Object> output26 =SeleniumOperations.clickOnElement(input26);
	    HTMLReportGenerator.StepDetails(output26.get("STATUS").toString(),"user click on previous button",output26.get("MESSAGE").toString());        
	}

	@When("^user select year from calender$")
	public void user_select_year_from_calender() {
		Object[] input27=new Object[1];
	    input27[0]="//*[@class='year'][text()='2015']";
	    Hashtable<String, Object> output27 =SeleniumOperations.clickOnElement(input27);
	    HTMLReportGenerator.StepDetails(output27.get("STATUS").toString(),"user select year from calender",output27.get("MESSAGE").toString());      
	}

	@When("^user select month from calender$")
	public void user_select_month_from_calender() {
		Object[] input28=new Object[1];
	    input28[0]="//*[@class='month'][text()='Jan']";
	    Hashtable<String, Object> output28 =SeleniumOperations.clickOnElement(input28);
	    HTMLReportGenerator.StepDetails(output28.get("STATUS").toString(),"user select month from calender",output28.get("MESSAGE").toString());     
	}

	@When("^user click on next button$")
	public void user_click_on_next_button() {
		Object[] input29=new Object[1];
		input29[0]="(//*[@class='next'])[1]";
		Hashtable<String, Object> output29 =SeleniumOperations.clickOnElement(input29);
		HTMLReportGenerator.StepDetails(output29.get("STATUS").toString(),"user click on next button",output29.get("MESSAGE").toString());  
	}

	@When("^user select day from calender$")
	public void user_select_day_from_calender() {
		Object[] input30=new Object[1];
		input30[0]="//*[@class='day'][text()='1']";
		Hashtable<String, Object> output30 =SeleniumOperations.clickOnElement(input30);
		HTMLReportGenerator.StepDetails(output30.get("STATUS").toString(),"user select day from calender",output30.get("MESSAGE").toString());  
	}

	@When("^user click on nationality dropdown$")
	public void user_click_on_nationality_dropdown() throws InterruptedException {
		Object[] input31=new Object[1];
		input31[0]="//*[@id='s2id_MainContent_cmbNationality']";
		Hashtable<String, Object> output31 =SeleniumOperations.clickOnElement(input31);
		HTMLReportGenerator.StepDetails(output31.get("STATUS").toString(),"user click on nationality dropdown",output31.get("MESSAGE").toString()); 
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" to search nationality in search box$")
	public void user_enter_to_search_nationality_in_search_box(String nationality) {
		Object[] input32=new Object[2];
		input32[0]="//*[@class='select2-input select2-focused']";
		input32[1]=nationality;
		Hashtable<String, Object> output32 =SeleniumOperations.sendKeys(input32);
		HTMLReportGenerator.StepDetails(output32.get("STATUS").toString(),"user enter \"Tanzania\" to search nationality in search box",output32.get("MESSAGE").toString());
	}

	@When("^user click on tanzania as nationality$")
	public void user_click_on_tanzania_as_nationality() throws InterruptedException {
		Object[] input33=new Object[1];
		input33[0]="//*[@class='select2-result-label']";
		Hashtable<String, Object> output33 =SeleniumOperations.clickOnElement(input33);
		HTMLReportGenerator.StepDetails(output33.get("STATUS").toString(),"user click on tanzania as nationality",output33.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as place of birth$")
	public void user_enter_as_place_of_birth(String pBirth) {
		Object[] input34=new Object[2];
		input34[0]="//*[@id='txtPOB']";
		input34[1]=pBirth;
		Hashtable<String, Object> output34 =SeleniumOperations.sendKeys(input34);
		HTMLReportGenerator.StepDetails(output34.get("STATUS").toString(),"user enter \"Bahi\" as place of birth",output34.get("MESSAGE").toString());
	}

	@When("^user click on gender dropdown$")
	public void user_click_on_gender_dropdown() throws InterruptedException {
		Object[] input35=new Object[1];
		input35[0]="//*[@id='s2id_MainContent_cmbclntGender']";
		Hashtable<String, Object> output35 =SeleniumOperations.clickOnElement(input35); 
		HTMLReportGenerator.StepDetails(output35.get("STATUS").toString(),"user click on gender dropdown",output35.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" to search gender in search box$")
	public void user_enter_to_search_gender_in_search_box(String gender) {
		Object[] input36=new Object[2];
		input36[0]="//*[@class='select2-input select2-focused']";
		input36[1]=gender;
		Hashtable<String, Object> output36 =SeleniumOperations.sendKeys(input36); 
		HTMLReportGenerator.StepDetails(output36.get("STATUS").toString(),"user enter \"Male\" to search gender in search box",output36.get("MESSAGE").toString());
	}

	@When("^user click on male as gender$")
	public void user_click_on_male_as_gender() {
		Object[] input37=new Object[1];
		input37[0]="//*[@class='select2-match'][text()='Male']";
		Hashtable<String, Object> output37 =SeleniumOperations.clickOnElement(input37); 
		HTMLReportGenerator.StepDetails(output37.get("STATUS").toString(),"user click on male as gender",output37.get("MESSAGE").toString());
	}

	@When("^user click on region/province dropdown$")
	public void user_click_on_region_province_dropdown() throws InterruptedException {
		Object[] input38=new Object[1];
		input38[0]="//*[@id='s2id_MainContent_cmbRegion']";
		Hashtable<String, Object> output38 =SeleniumOperations.clickOnElement(input38);
		HTMLReportGenerator.StepDetails(output38.get("STATUS").toString(),"user click on region/province dropdown",output38.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" to search region/province in search box$")
	public void user_enter_to_search_region_province_in_search_box(String region) {
		Object[] input39=new Object[2];
		input39[0]="//*[@class='select2-input select2-focused']";
		input39[1]=region;
		Hashtable<String, Object> output39 =SeleniumOperations.sendKeys(input39);
		HTMLReportGenerator.StepDetails(output39.get("STATUS").toString(),"user enter \"Dodoma\" to search region/province in search box",output39.get("MESSAGE").toString());
	}

	@When("^user click on dodoma as region/province$")
	public void user_click_on_dodoma_as_region_province() {
		Object[] input40=new Object[1];
		input40[0]="//*[@class='select2-match'][text()='Dodoma']";
		Hashtable<String, Object> output40 =SeleniumOperations.clickOnElement(input40);
		HTMLReportGenerator.StepDetails(output40.get("STATUS").toString(),"user click on dodoma as region/province",output40.get("MESSAGE").toString());
	}

	@When("^user click on district dropdown$")
	public void user_click_on_district_dropdown() throws InterruptedException {   
		Thread.sleep(2000);
		Object[] input41=new Object[1];
		input41[0]="//*[@id='s2id_MainContent_cmbDistrict']";
		Hashtable<String, Object> output41 =SeleniumOperations.clickOnElement(input41); 
		HTMLReportGenerator.StepDetails(output41.get("STATUS").toString(),"user click on district dropdown",output41.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" to search district in search box$")
	public void user_enter_to_search_district_in_search_box(String district){
		Object[] input42=new Object[2];
		input42[0]="//*[@class='select2-input select2-focused']";
		input42[1]=district;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \"Bahi\" to search district in search box",output42.get("MESSAGE").toString());
	}

	@When("^user click on bahi as district$")
	public void user_click_on_bahi_as_district() {
		Object[] input43=new Object[1];
		input43[0]="//*[@class='select2-match'][text()='Bahi']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user click on bahi as district",output43.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as cell/street$")
	public void user_enter_as_cell_street(String cell) {
		Object[] input44=new Object[2];
		input44[0]="//*[@id='txtStreet']";
		input44[1]=cell;
		Hashtable<String, Object> output44 =SeleniumOperations.sendKeys(input44);
		HTMLReportGenerator.StepDetails(output44.get("STATUS").toString(),"user enter \"Tree\" as cell/street",output44.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String address) throws InterruptedException {
		Object[] input45=new Object[2];
		input45[0]="//*[@id='MainContent_txtClientAddress']";
		input45[1]=address;
		Hashtable<String, Object> output45 =SeleniumOperations.sendKeys(input45);
		HTMLReportGenerator.StepDetails(output45.get("STATUS").toString(),"user enter \"House No.12 XYZ World\" as address",output45.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When ("^user click on save button to save client details$")
	public void user_click_on_save_button() throws InterruptedException {
		Object[] input49=new Object[1];
		input49[0]="//*[@id='btnSavePopup']";
		Hashtable<String, Object>  output49 =SeleniumOperations.clickOnElement(input49); 
		HTMLReportGenerator.StepDetails(output49.get("STATUS").toString(),"user click on save button to save client details",output49.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}
	
	@Then ("^user able to view \"(.*)\"$")
	public void validation(String validation) throws InterruptedException{
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_lblQuoteHeader']";
		input[1]=validation;
		Hashtable<String,Object> output=SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user is redirected to selected quotation page",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as TIN/PAN$")
	public void user_enter_as_TIN_PAN(String TIN) throws Throwable {
	    Object[] input=new Object[2];
		input[0]="//*[@id='txtIndTINNb']";
		input[1]=TIN;
		Hashtable<String,Object> output=SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as TIN/PAN$",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as ZRB No$")
	public void user_enter_as_ZRB_No(String ZRBNo) throws Throwable {
	    Object[] input=new Object[2];
		input[0]="//*[@id='txtZRBNb']";
		input[1]=ZRBNo;
		Hashtable<String,Object> output=SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"ser enter \\\"([^\\\"]*)\\\" as ZRB No",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user click on occupation dropdown$")
	public void user_click_on_occupation_dropdown() throws Throwable {
	    Object[] input49=new Object[1];
		input49[0]="//*[@id='s2id_MainContent_cmbOccupation']";
		Hashtable<String, Object>  output49 =SeleniumOperations.clickOnElement(input49); 
		HTMLReportGenerator.StepDetails(output49.get("STATUS").toString(),"user click on occupation dropdown",output49.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as occupation$")
	public void user_enter_as_occupation(String occupation) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@class='select2-input select2-focused']";
		input42[1]=occupation;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as occupation",output42.get("MESSAGE").toString());
	}

	@When("^user select banker as occupation$")
	public void user_select_banker_as_occupation() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@class='select2-match']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user select banker as occupation",output43.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When ("^user select \"(.*)\" as Disability Status$")
	public void disabilityStatus(String status){
		Object[] input=new Object[5];
		input[0]="//*[@id='s2id_MainContent_cmbDisbSts']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=status;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"(.*)\\\" as Disability Status", output.get("MESSAGE").toString());
    }
	
	@When ("^user select \"(.*)\" as Client Sub Status$")
	public void Clientstatus(String status) throws InterruptedException{
		Object[] input=new Object[5];
		input[0]="//*[@id='s2id_MainContent_cmbClntSubSts']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=status;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"(.*)\\\" as Client Sub Status", output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@Then ("^user select related party checkbox$")
	public void partyCheckBox() throws InterruptedException{
		Object[] input43=new Object[1];
		input43[0]="//*[@id='chkRelatedParty']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user select related party checkbox",output43.get("MESSAGE").toString());
		Thread.sleep(2000);	
	}
	
	@When ("user select \"(.*)\" as related party$")
	public void relatedParty(String relatedParty) throws InterruptedException{
		Object[] input=new Object[5];
		input[0]="//*[@id='s2id_MainContent_cmbRelatedParty']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=relatedParty;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"(.*)\\\" as related party", output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When ("user select \"(.*)\" as relationship$")
	public void relationship(String relationship) throws InterruptedException{
		Object[] input=new Object[5];
		input[0]="//*[@id='s2id_MainContent_cmbCLNTRelationship']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=relationship;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"(.*)\\\" as relationship", output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as VRN/GST$")
	public void user_enter_as_VRN_GST(String VRNGST) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtVRNNb']";
		input42[1]=VRNGST;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as VRN/GST",output42.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as sector$")
	public void user_enter_as_sector(String sector) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtSector']";
		input42[1]=sector;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as sector",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as village$")
	public void user_enter_as_village(String village) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtVillage']";
		input42[1]=village;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as village",output42.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as fax$")
	public void user_enter_as_fax(String fax) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtFax']";
		input42[1]=fax;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as fax",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as profile ID$")
	public void user_enter_as_profile_ID(String profileId) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtProfileID']";
		input42[1]=profileId;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as profile ID",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user click on profile category dropdown$")
	public void user_click_on_profile_category_dropdown() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@id='s2id_MainContent_cmbProfileCat']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user click on profile category dropdown",output43.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as profile category$")
	public void user_enter_as_profile_category(String profileCategory) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@class='select2-input select2-focused']";
		input42[1]=profileCategory;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as profile category",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user select main as profile category$")
	public void user_select_main_as_profile_category() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@class='select2-match']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user select main as profile category",output43.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as screening group ID$")
	public void user_enter_as_screening_group_ID(String groupId) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtScreeningGrpID']";
		input42[1]=groupId;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as screening group ID",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as Telephone No One$")
	public void user_enter_as_Telephone_No_One(String TelephoneOne) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtTelephone1']";
		input42[1]=TelephoneOne;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Telephone No One",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as Telephone No Two$")
	public void user_enter_as_Telephone_No_Two(String TelephoneTwo) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtTelephone2']";
		input42[1]=TelephoneTwo;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Telephone No Two",output42.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Telephone No Three$")
	public void user_enter_as_Telephone_No_Three(String TelephoneThree) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtTelephone3']";
		input42[1]=TelephoneThree;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Telephone No Three",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as mobile No One$")
	public void user_enter_as_mobile_No_One(String mobileOne) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='MainContent_txtmobileno1']";
		input42[1]=mobileOne;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as mobile No One",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as mobile No Two$")
	public void user_enter_as_mobile_No_Two(String mobileTwo) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='MainContent_txtmobileno2']";
		input42[1]=mobileTwo;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as mobile No Two",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as mobile No Three$")
	public void user_enter_as_mobile_No_Three(String mobileThree) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='MainContent_txtmobileno3']";
		input42[1]=mobileThree;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as mobile No Three",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as email id one$")
	public void user_enter_as_email_id_one(String emailId) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtEmail1']";
		input42[1]=emailId;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as email id one",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as email id two$")
	public void user_enter_as_email_id_two(String emailId) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtEmail2']";
		input42[1]=emailId;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as email id Two",output42.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as email id three$")
	public void user_enter_as_email_id_three(String emailId) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtEmail3']";
		input42[1]=emailId;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as email id Three",output42.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user select Email checkbox$")
	public void user_select_Email_checkbox() throws Throwable {
		Object[] input43=new Object[1];
		input43[0]="//*[@id='chkEmail']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user select Email checkbox",output43.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user select tax exempted checkbox$")
	public void user_select_tax_exempted_checkbox() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@id='chkClntTaxExempted']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user select tax exempted checkbox",output43.get("MESSAGE").toString());
	}

	@When("^user select PEP customer radiobutton$")
	public void user_select_PEP_customer_radiobutton() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@id='MainContent_rdlList_0']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user select PEP customer radiobutton",output43.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user click on AML risk category dropdown$")
	public void user_click_on_AML_risk_category_dropdown() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@id='s2id_MainContent_cmbRisk']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user click on AML risk category dropdown",output43.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as AML risk category$")
	public void user_enter_as_AML_risk_category(String amlRiskCategory) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@class='select2-input select2-focused']";
		input42[1]=amlRiskCategory;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as AML risk category",output42.get("MESSAGE").toString());
	}

	@When("^user select medium as AML risk category$")
	public void user_select_medium_as_AML_risk_category() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@class='select2-match']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user select medium as AML risk category",output43.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as appointment date$")
	public void user_enter_as_appointment_date(String appointmentDate) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='MainContent_txtAppointDate']";
		input42[1]=appointmentDate;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as appointment date",output42.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as mandate expiry$")
	public void user_enter_as_mandate_expiry(String mandateExpiry) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='MainContent_txtExpiryDate']";
		input42[1]=mandateExpiry;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as mandate expiry",output42.get("MESSAGE").toString());
	}

	@When ("^user click on Company Incorporation Certificate Number as ID type from dropdown$")
	public void selectCompanyIncorporationAsIDType() throws InterruptedException {
		Object[] input23=new Object[1];
	    input23[0]="(//*[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted'])";
	    Hashtable<String, Object> output23 =SeleniumOperations.clickOnElement(input23);
	    HTMLReportGenerator.StepDetails(output23.get("STATUS").toString(),"user click on birth certificate as ID type from dropdown",output23.get("MESSAGE").toString());
	    Thread.sleep(2000);    
	}

	@When("^user click on business type dropdown$")
	public void user_click_on_business_type_dropdown() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@id='s2id_MainContent_cmbClntBusType']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user click on business type dropdown",output43.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as business type$")
	public void user_enter_as_business_type(String businessType) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@class='select2-input select2-focused']";
		input42[1]=businessType;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as business type",output42.get("MESSAGE").toString());
	}

	@When("^user select Automobile Manufacturing as business type$")
	public void user_select_Automobile_Manufacturing_as_business_type() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@class='select2-match']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user select Automobile Manufacturing as business type",output43.get("MESSAGE").toString());
	}

	@When("^user click on country of registration dropdown$")
	public void user_click_on_country_of_registration_dropdown() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@id='s2id_MainContent_cmbCOR']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user click on country of registration dropdown",output43.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as country of registration$")
	public void user_enter_as_country_of_registration(String countryOfRegistration) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@class='select2-input select2-focused']";
		input42[1]=countryOfRegistration;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as country of registration",output42.get("MESSAGE").toString());
	}

	@When("^user select South Africa as country of registration$")
	public void user_select_South_Africa_as_country_of_registration() throws Throwable {
	    Object[] input43=new Object[1];
		input43[0]="//*[@class='select2-match']";
		Hashtable<String, Object> output43 =SeleniumOperations.clickOnElement(input43);
		HTMLReportGenerator.StepDetails(output43.get("STATUS").toString(),"user select South Africa as country of registration",output43.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as registration date$")
	public void user_enter_as_registration_date(String registrationDate) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='MainContent_txtRegDate']";
		input42[1]=registrationDate;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as registration date",output42.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as contact person$")
	public void user_enter_as_contact_person(String contactPerson) throws Throwable {
	    Object[] input42=new Object[2];
		input42[0]="//*[@id='txtContactPerson']";
		input42[1]=contactPerson;
		Hashtable<String, Object> output42 =SeleniumOperations.sendKeys(input42);
		HTMLReportGenerator.StepDetails(output42.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as contact person",output42.get("MESSAGE").toString());
	}
}
