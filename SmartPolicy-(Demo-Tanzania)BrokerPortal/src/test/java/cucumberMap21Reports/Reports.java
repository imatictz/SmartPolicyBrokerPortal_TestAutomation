package cucumberMap21Reports;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.asserts.Assertion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Reports {

	@Given("user navigate on reports dropdown")
	public void user_navigate_on_reports_dropdown() {
	    Object[] input = new Object[2];
	    input[0] = "//*[@id='MOD_REPORTS']";
	    SeleniumOperations.actionClass(input);
	}
	@Given("user click on all reports")
	public void user_click_on_all_reports() throws InterruptedException {
		 Object[] input = new Object[2];
		 input[0] = "//*[@id='MNU_WFREPORTLAUNCHER']";
		 SeleniumOperations.clickOnElement(input);
		 Thread.sleep(2000);
	}
	@When ("^user search \"(.*)\" as report name in search box$")
	public void user_search_in_search_box(String reportName) {
		Object[] input = new Object[2];
		input[0] = "//*[@id='MainContent_txtSearch']";
		input[1] = reportName;
		Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user search \\\"(.*)\\\" as report name in search box", output.get("MESSAGE").toString());
	}
	// (//*[@id='MainContent_LstReports']/option)[1]
	@Then("user click to select Admin Fee Report as report")
	public void user_click_to_select_admin_fee_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "(//*[@id='MainContent_LstReports']/option)[1]";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);		 
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Admin Fee Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@When("user select {string} as insurer")
	public void user_select_as_insurer(String insurerName) {
	    Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbSrchInsurer']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = insurerName;
	    input[3] = "(//*[@class='select2-match'])[1]";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select {string} as insurer", output.get("MESSAGE").toString());

	}
	@When("user select {string} as from date")
	public void user_select_as_from_date(String date) throws InterruptedException {
	    Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtFromDate']";
	    input[1] = date;
	    Hashtable<String, Object> output = SeleniumOperations.clearAndEnter(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select {string} as from date", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}
	@When("user click on show report button")
	public void user_click_on_show_report_button() throws InterruptedException {
		/* Object[] input1 = new Object[1];
		 input1[0] = "//*[@id='MainContent_btnShowReports']";
		 SeleniumOperations.wait(input1);*/
		 Object[] input = new Object[2];
		 input[0] = "//*[@id='MainContent_btnShowReports']";
		 Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on show report button", output.get("MESSAGE").toString());
		 
		 
		 Thread.sleep(10000);
	}
	@Then ("^user able to view admin fee report in pdf format$")
	public void pdfReport() throws IOException{
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view admin fee report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary by Charts as report")
	public void user_click_to_select_business_summary_by_charts_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT226']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary by Charts as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary by Charts report in pdf format")
	public void user_able_to_view_business_summary_by_charts_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary by Charts report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	@When("^user enter \"([^\"]*)\" as client name$")
	public void enterClientName(String clientName) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtClientName']";
	    input[1]=clientName;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Pravin Testing\" as client name",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user select Pravin Testing Broker as client name$")
	public void clickOnClientName() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_txtClientName']";
		Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Pravin Testing as client name",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}
	
	@Then("user click to select AON Reports as report")
	public void user_click_to_select_aon_reports_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT82']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select AON Reports as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	
	@Then("user able to view AON Reports in pdf format")
	public void user_able_to_view_aon_reports_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view AON Reports in pdf formats", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	@When("^user select \"([^\"]*)\" as insurance type$")
	public void user_select_as_insurance_type(String insuranceType) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbInsuranceType']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=insuranceType;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as insurance type",output.get("MESSAGE").toString());
		
	}
	@When ("^user select \"(.*)\" as curreny$")
	public void user_select_as_curreny(String curreny) throws Throwable {
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbCurrency']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=curreny;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"(.*)\\\" as curreny",output.get("MESSAGE").toString());
		
	}
	
	@Then("user click to select Business Summary \\(Branch wise with Risk Note) as report")
	public void user_click_to_select_business_summary_branch_wise_with_risk_note_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT198']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Branch wise with Risk Note) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Branch wise with Risk Note) in pdf format")
	public void user_able_to_view_business_summary_branch_wise_with_risk_note_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Branch wise with Risk Note) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Branch wise with Type) as report")
	public void user_click_to_select_business_summary_branch_wise_with_type_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT197']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Branch wise with Type) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Branch wise with Type) in pdf format")
	public void user_able_to_view_business_summary_branch_wise_with_type_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Branch wise with Type) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Branch wise) as report")
	public void user_click_to_select_business_summary_branch_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT72']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Branch wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Branch wise) in pdf format")
	public void user_able_to_view_business_summary_branch_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Branch wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(by Cover Period start date) as report")
	public void user_click_to_select_business_summary_by_cover_period_start_date_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT164']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(by Cover Period start date) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(by Cover Period start date) in pdf format")
	public void user_able_to_view_business_summary_by_cover_period_start_date_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(by Cover Period start date) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(By total premium booked for each customer) as report")
	public void user_click_to_select_business_summary_by_total_premium_booked_for_each_customer_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT135']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(By total premium booked for each customer) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(By total premium booked for each customer) in pdf format")
	public void user_able_to_view_business_summary_by_total_premium_booked_for_each_customer_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(By total premium booked for each customer) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("^user click to select Business Summary \\(By total premium booked for each insurance company cover as report$")
	public void user_click_to_select_business_summary_by_total_premium_booked_for_each_insurance_company_cover_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT135']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(By total premium booked for each insurance company cover as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("^user able to view Business Summary \\(By total premium booked for each insurance company cover in pdf format$")
	public void user_able_to_view_business_summary_by_total_premium_booked_for_each_insurance_company_cover_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(By total premium booked for each insurance company cover in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(By total premium booked for each insurance company) as report")
	public void user_click_to_select_business_summary_by_total_premium_booked_for_each_insurance_company_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT134']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(By total premium booked for each insurance company) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(By total premium booked for each insurance company) in pdf format")
	public void user_able_to_view_business_summary_by_total_premium_booked_for_each_insurance_company_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(By total premium booked for each insurance company) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Class wise) as report")
	public void user_click_to_select_business_summary_class_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT76']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Class wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Class wise) in pdf format")
	public void user_able_to_view_business_summary_class_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Class wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Client type) as report")
	public void user_click_to_select_business_summary_client_type_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT202']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Client type) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Client type) in pdf format")
	public void user_able_to_view_business_summary_client_type_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Client type) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Client wise) as report")
	public void user_click_to_select_business_summary_client_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT129']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Client wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Client wise) in pdf format")
	public void user_able_to_view_business_summary_client_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Client wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Client wise-Cover Period start date) as report")
	public void user_click_to_select_business_summary_client_wise_cover_period_start_date_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT163']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Client wise-Cover Period start date) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Client wise-Cover Period start date) in pdf format")
	public void user_able_to_view_business_summary_client_wise_cover_period_start_date_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Client wise-Cover Period start date) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Customer Segment) as report")
	public void user_click_to_select_business_summary_customer_segment_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT73']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Customer Segment) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@When("user select {string} as Customer Segment")
	public void user_select_as_customer_segment(String customerSegment) {
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbCustSegment']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=customerSegment;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as Customer Segment",output.get("MESSAGE").toString());
		
	}
	@Then("user able to view Business Summary \\(Customer Segment)in pdf format")
	public void user_able_to_view_business_summary_customer_segment_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Customer Segment)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Insurer wise with type) as report")
	public void user_click_to_select_business_summary_insurer_wise_with_type_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT128']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Insurer wise with type) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Insurer wise with type)in pdf format")
	public void user_able_to_view_business_summary_insurer_wise_with_type_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Insurer wise with type)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Insurer wise)as report")
	public void user_click_to_select_business_summary_insurer_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT75']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Insurer wise)as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Insurer wise)in pdf format")
	public void user_able_to_view_business_summary_insurer_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Insurer wise)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Insurer wise-Cover Period start date)as report")
	public void user_click_to_select_business_summary_insurer_wise_cover_period_start_date_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT162']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Insurer wise-Cover Period start date)as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Insurer wise-Cover Period start date)in pdf format")
	public void user_able_to_view_business_summary_insurer_wise_cover_period_start_date_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Insurer wise-Cover Period start date)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Region wise) as report")
	public void user_click_to_select_business_summary_region_wise_as_report() throws InterruptedException  {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT71']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Region wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Region wise) in pdf format")
	public void user_able_to_view_business_summary_region_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Region wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary \\(Zone)as report")
	public void user_click_to_select_business_summary_zone_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT70']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary \\\\(Zone)as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary \\(Zone)in pdf format")
	public void user_able_to_view_business_summary_zone_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary \\\\(Zone)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary by insurer\\/category \\(Base Currency) as report")
	public void user_click_to_select_business_summary_by_insurer_category_base_currency_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT238']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary by insurer\\\\/category \\\\(Base Currency) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary by insurer\\/category \\(Base Currency) report in pdf format")
	public void user_able_to_view_business_summary_by_insurer_category_base_currency_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary by insurer\\\\/category \\\\(Base Currency) report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Business Summary\\(User wise)as report")
	public void user_click_to_select_business_summary_user_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT160']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Business Summary\\\\(User wise)as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Business Summary\\(User wise) report in pdf format")
	public void user_able_to_view_business_summary_user_wise_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Business Summary\\\\(User wise) report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select claim Payment Request Report as report")
	public void user_click_to_select_claim_payment_request_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT195']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select claim Payment Request Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view claim Payment Request Report in pdf format")
	public void user_able_to_view_claim_payment_request_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view claim Payment Request Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Incured but not reported on time \\(IBNR)as report")
	public void user_click_to_select_claims_incured_but_not_reported_on_time_ibnr_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT83']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Incured but not reported on time \\\\(IBNR)as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Incured but not reported on time \\(IBNR)in pdf format")
	public void user_able_to_view_claims_incured_but_not_reported_on_time_ibnr_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Incured but not reported on time \\\\(IBNR)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Pending \\(Assessor wise) as report")
	public void user_click_to_select_claims_pending_assessor_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT141']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending \\\\(Assessor wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	
	@Then("user able to view Claims Pending \\(Assessor wise)in pdf format")
	public void user_able_to_view_claims_pending_assessor_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending \\\\(Assessor wise)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	@When("user select {string} as user name")
	public void user_select_as_user_name(String userName) {
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbUser']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=userName;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as user name",output.get("MESSAGE").toString());
		
	}
	@When("user select {string} as business By")
	public void user_select_as_business_by(String businessBy) {
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbBusinessBy']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=businessBy;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as business By",output.get("MESSAGE").toString());
	}
	
	@Then("user click to select Claims Pending \\(by Assigned users)as report")
	public void user_click_to_select_claims_pending_by_assigned_users_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT232']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending \\\\(by Assigned users)as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@When("user select {string} as product")
	public void user_select_as_product(String product) throws InterruptedException {
		/*Object[] input1 = new Object[2];
		 input1[0] = "//*[@id='s2id_MainContent_cmbProduct']";
		 SeleniumOperations.clickOnElement(input1);
		 Thread.sleep(2000);*/
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbProduct']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=product;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as product",output.get("MESSAGE").toString());
	
	}
	
	@Then("user able to view Claims Pending \\(by Assigned users)in pdf format")
	public void user_able_to_view_claims_pending_by_assigned_users_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending \\\\(by Assigned users)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	@Then("user click to select Claims Pending \\(Status wise)as report")
	public void user_click_to_select_claims_pending_status_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT58']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending \\\\(Status wise)as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	
	@Then("user able to view Claims Pending \\(Status wise)in pdf format")
	public void user_able_to_view_claims_pending_status_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending \\\\(Status wise)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	@Then("user click to select Claims Pending Report as report")
	public void user_click_to_select_claims_pending_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT32']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Pending Report in pdf format")
	public void user_able_to_view_claims_pending_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	@Then("user click to select Claims Pending Report \\(Branch Wise) as report")
	public void user_click_to_select_claims_pending_report_branch_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT242']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending Report \\\\(Branch Wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Pending Report \\(Branch Wise) in pdf format")
	public void user_able_to_view_claims_pending_report_branch_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending Report \\\\(Branch Wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	@Then("user click to select Claims Pending Report \\(Covering Branch) as report")
	public void user_click_to_select_claims_pending_report_covering_branch_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT154']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending Report \\\\(Covering Branch) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Pending Report \\(Covering Branch)in pdf format")
	public void user_able_to_view_claims_pending_report_covering_branch_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending Report \\\\(Covering Branch)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	@Then("user click to select Claims Pending Report \\(Time taken between Accident & Reporting) as report")
	public void user_click_to_select_claims_pending_report_time_taken_between_accident_reporting_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT172']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending Report \\\\(Time taken between Accident & Reporting) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	
	@Then("user able to view Claims Pending Report \\(Time taken between Accident & Reporting)in pdf format")
	public void user_able_to_view_claims_pending_report_time_taken_between_accident_reporting_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending Report \\\\(Time taken between Accident & Reporting)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	@Then("user click to select Claims Pending Report no activity for last seven Days as report")
    public void user_click_to_select_claims_pending_report_no_activity_for_last_days_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT91']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending Report {double} no activity for last {int} Days as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}

	@Then("user able to view Claims Pending Report no activity for last seven Days in pdf format")
    public void user_able_to_view_claims_pending_report_no_activity_for_last_days_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending Report {double} no activity for last {int} Days in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Pending Report\\(Covering Branch) Not Initiated To Insurer as report")
	public void user_click_to_select_claims_pending_report_covering_branch_not_initiated_to_insurer_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT170']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending Report\\\\(Covering Branch) Not Initiated To Insurer as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Pending Report\\(Covering Branch) Not Initiated To Insurer in pdf format")
	public void user_able_to_view_claims_pending_report_covering_branch_not_initiated_to_insurer_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending Report\\\\(Covering Branch) Not Initiated To Insurer in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Pending Report\\(Covering Branch) Time Taken to Initiate to Insurer as report")
	public void user_click_to_select_claims_pending_report_covering_branch_time_taken_to_initiate_to_insurer_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT170']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Pending Report\\\\(Covering Branch) Time Taken to Initiate to Insurer as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	
	@Then("user able to view Claims Pending Report\\(Covering Branch) Time Taken to Initiate to Insurer in pdf format")
	public void user_able_to_view_claims_pending_report_covering_branch_time_taken_to_initiate_to_insurer_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Pending Report\\\\(Covering Branch) Time Taken to Initiate to Insurer in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Ratio Report\\(Branch wise) as report")
	public void user_click_to_select_claims_ratio_report_branch_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT86']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Ratio Report\\\\(Branch wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	
	@Then("user able to view Claims Ratio Report\\(Branch wise) to Insurer in pdf format")
	public void user_able_to_view_claims_ratio_report_branch_wise_to_insurer_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Ratio Report\\\\(Branch wise) to Insurer in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Ratio Report\\(Client wise) as report")
	public void user_click_to_select_claims_ratio_report_client_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT90']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Ratio Report\\\\(Client wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Ratio Report\\(Client wise)in pdf format")
	public void user_able_to_view_claims_ratio_report_client_wise_to_insurer_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Ratio Report\\\\(Client wise)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Ratio Report\\(Insurer wise) as report")
	public void user_click_to_select_claims_ratio_report_insurer_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT89']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Ratio Report\\\\(Insurer wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Ratio Report\\(Insurer wise)in pdf format")
	public void user_able_to_view_claims_ratio_report_insurer_wise_to_insurer_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Ratio Report\\\\(Insurer wise)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Ratio Report\\(Region wise) as report")
	public void user_click_to_select_claims_ratio_report_region_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT87']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Ratio Report\\\\(Region wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	
	@Then("user able to view Claims Ratio Report\\(Region wise)in pdf format")
	public void user_able_to_view_claims_ratio_report_region_wise_to_insurer_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Ratio Report\\\\(Region wise)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Ratio Report\\(Zone wise) as report")
	public void user_click_to_select_claims_ratio_report_zone_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT88']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Ratio Report\\\\(Zone wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Ratio Report\\(Zone wise)in pdf format")
	public void user_able_to_view_claims_ratio_report_zone_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Ratio Report\\\\(Zone wise)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Register \\(Branch Wise) as report")
	public void user_click_to_select_claims_register_branch_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT240']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Register \\\\(Branch Wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Register \\(Branch Wise) in pdf format")
	public void user_able_to_view_claims_register_branch_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Register \\\\(Branch Wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Register as report")
	public void user_click_to_select_claims_register_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT27']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Register as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Register in pdf format")
	public void user_able_to_view_claims_register_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Register in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Rejected Report as report")
	public void user_click_to_select_claims_rejected_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT60']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Rejected Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Rejected Report in pdf format")
	public void user_able_to_view_claims_rejected_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Rejected Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Report \\(Retrenchment wise) as report")
	public void user_click_to_select_claims_report_retrenchment_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT203']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Report \\\\(Retrenchment wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Report \\(Retrenchment wise) in pdf format")
	public void user_able_to_view_claims_report_retrenchment_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Report \\\\(Retrenchment wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Settled Report as report")
	public void user_click_to_select_claims_settled_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT31']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Settled Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Settled Report in pdf format")
	public void user_able_to_view_claims_settled_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Settled Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Settled Report \\(Branch Wise) as report")
	public void user_click_to_select_claims_settled_report_branch_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT241']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Settled Report \\\\(Branch Wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Settled Report \\(Branch Wise) in pdf format")
	public void user_able_to_view_claims_settled_report_branch_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Settled Report \\\\(Branch Wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Settled Report \\(Time Taken between DV & Settlement) as report")
	public void user_click_to_select_claims_settled_report_time_taken_between_dv_settlement_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT67']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Settled Report \\\\(Time Taken between DV & Settlement) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Settled Report \\(Time Taken between DV & Settlement) in pdf format")
	public void user_able_to_view_claims_settled_report_time_taken_between_dv_settlement_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Settled Report \\\\(Time Taken between DV & Settlement) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Settled Report Life as report")
	public void user_click_to_select_claims_settled_report_life_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT84']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Settled Report Life as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Settled Report Life in pdf format")
	public void user_able_to_view_claims_settled_report_life_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Settled Report Life in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Claims Settlement beyond fourty five Days Life as report")
	public void user_click_to_select_claims_settlement_beyond_fouty_five_days_life_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT85']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Claims Settlement beyond fouty five Days Life as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Claims Settlement beyond fourty five Days in pdf format")
	public void user_able_to_view_claims_settlement_beyond_fouty_five_days_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Claims Settlement beyond fouty five Days in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Comesa Booking as report")
	public void user_click_to_select_comesa_booking_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT211']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Comesa Booking as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@When("user select {string} as Business type")
	public void user_select_as_business_type(String businessType) {
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbBusinessType']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=businessType;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as Business type",output.get("MESSAGE").toString());
		
	}
	@Then("user able to view Comesa Booking in pdf format")
	public void user_able_to_view_comesa_booking_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Comesa Booking in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Commision Rebate Report as report")
	public void user_click_to_select_commision_rebate_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT223']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Commision Rebate Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Commision Rebate Report in pdf format")
	public void user_able_to_view_commision_rebate_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Commision Rebate Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Commission Allocated Report as report")
	public void user_click_to_select_commission_allocated_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT181']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Commission Allocated Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	
	@Then("user able to view Commission Allocated Report in pdf format")
	public void user_able_to_view_commission_allocated_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Commission Allocated Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Commission Receivable Ageing Report as report")
	public void user_click_to_select_commission_receivable_ageing_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT205']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Commission Receivable Ageing Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Commission Receivable Ageing Report in pdf format")
	public void user_able_to_view_commission_receivable_ageing_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Commission Receivable Ageing Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Commission Receivable Report as report")
	public void user_click_to_select_commission_receivable_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT121']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Commission Receivable Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Commission Receivable Report in pdf format")
	public void user_able_to_view_commission_receivable_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Commission Receivable Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Commission Receivable Report \\(With VAT Commission) as report")
	public void user_click_to_select_commission_receivable_report_with_vat_commission_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT207']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Commission Receivable Report \\\\(With VAT Commission) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Commission Receivable Report \\(With VAT Commission) in pdf format")
	public void user_able_to_view_commission_receivable_report_with_vat_commission_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Commission Receivable Report \\\\(With VAT Commission) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Commission Receivable Report\\(WH TAX) as report")
	public void user_click_to_select_commission_receivable_report_wh_tax_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT200']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Commission Receivable Report\\\\(WH TAX) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Commission Receivable Report\\(WH TAX) in pdf format")
	public void user_able_to_view_commission_receivable_report_wh_tax_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Commission Receivable Report\\\\(WH TAX) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Commission Refundable Report as report")
	public void user_click_to_select_commission_refundable_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT140']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Commission Refundable Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Commission Refundable Report in pdf format")
	public void user_able_to_view_commission_refundable_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Commission Refundable Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Commission Statement Report as report")
	public void user_click_to_select_commission_statement_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT122']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Commission Statement Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Commission Statement Report in pdf format")
	public void user_able_to_view_commission_statement_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Commission Statement Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Commission Statement Report one as report")
	public void user_click_to_select_commission_statement_report_one_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT132']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Commission Statement Report one as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Commission Statement Report one in pdf format")
	public void user_able_to_view_commission_statement_report_one_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Commission Statement Report one in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select CSV Data Extraction as report")
	public void user_click_to_select_csv_data_extraction_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT69']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select CSV Data Extraction as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view CSV Data Extraction in pdf format")
	public void user_able_to_view_csv_data_extraction_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view CSV Data Extraction in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Customer Sales Statistics Report as report")
	public void user_click_to_select_customer_sales_statistics_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT43']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Customer Sales Statistics Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Customer Sales Statistics Report in pdf format")
	public void user_able_to_view_customer_sales_statistics_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Customer Sales Statistics Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes as report")
	public void user_click_to_select_daily_cover_notes_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT07']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes Report in pdf format")
	public void user_able_to_view_daily_cover_notes_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@When ("^user enter \"(.*)\" as debit No$")
	public void debitNo(String debitNo){
		Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtDebitNo']";
	    input[1]=debitNo;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"(.*)\\\" as debit No",output.get("MESSAGE").toString());
	}
	
	@Then("user click to select Daily Cover Notes \\(Borrower Wise) as report")
	public void user_click_to_select_daily_cover_notes_borrower_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT179']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(Borrower Wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(Borrower Wise) in pdf format")
	public void user_able_to_view_daily_cover_notes_borrower_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(Borrower Wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes \\(Broker Partner Business) as report")
	public void user_click_to_select_daily_cover_notes_broker_partner_business_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT07_P']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(Broker Partner Business) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(Broker Partner Business) in pdf format")
	public void user_able_to_view_daily_cover_notes_broker_partner_business_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(Broker Partner Business) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes \\(Business By) as report")
	public void user_click_to_select_daily_cover_notes_business_by_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT07_P']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(Business By) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(Business By) in pdf format")
	public void user_able_to_view_daily_cover_notes_business_by_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(Business By) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes \\(Cover Period start date) as report")
	public void user_click_to_select_daily_cover_notes_cover_period_start_date_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT161']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(Cover Period start date) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(Cover Period start date) in pdf format")
	public void user_able_to_view_daily_cover_notes_cover_period_start_date_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(Cover Period start date) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes \\(Different Policy Issued Date & TIRA Issued Date) as report")
	public void user_click_to_select_daily_cover_notes_different_policy_issued_date_tira_issued_date_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT163']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(Different Policy Issued Date & TIRA Issued Date) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(Different Policy Issued Date & TIRA Issued Date) in pdf format")
	public void user_able_to_view_daily_cover_notes_different_policy_issued_date_tira_issued_date_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(Different Policy Issued Date & TIRA Issued Date) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes \\(Insurer wise) as report")
	public void user_click_to_select_daily_cover_notes_insurer_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT185']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(Insurer wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(Insurer wise) in pdf format")
	public void user_able_to_view_daily_cover_notes_insurer_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(Insurer wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes \\(User wise) as report")
	public void user_click_to_select_daily_cover_notes_user_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT155']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(User wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(User wise) in pdf format")
	public void user_able_to_view_daily_cover_notes_user_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(User wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes \\(With First Loss Payee) as report")
	public void user_click_to_select_daily_cover_notes_with_first_loss_payee_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT177']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(With First Loss Payee) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(With First Loss Payee) in pdf format")
	public void user_able_to_view_daily_cover_notes_with_first_loss_payee_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(With First Loss Payee) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes \\(With Levy) as report")
	public void user_click_to_select_daily_cover_notes_with_levy_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT95']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(With Levy) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(With Levy) in pdf format")
	public void user_able_to_view_daily_cover_notes_with_levy_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(With Levy) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	
	@Then("user click to select Daily Cover Notes \\(With Reg No) as report")
	public void user_click_to_select_daily_cover_notes_with_reg_no_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT95']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(With Reg No.) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(With Reg No) in pdf format")
	public void user_able_to_view_daily_cover_notes_with_reg_no_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(With Reg No.) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes \\(With Stamp Duty) as report")
	public void user_click_to_select_daily_cover_notes_with_stamp_duty_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT194']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes \\\\(With Stamp Duty) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes \\(With Stamp Duty) in pdf format")
	public void user_able_to_view_daily_cover_notes_with_stamp_duty_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes \\\\(With Stamp Duty) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes Online Channels as report")
	public void user_click_to_select_daily_cover_notes_online_channels_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT227']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes Online Channels as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes Online Channels in pdf format")
	public void user_able_to_view_daily_cover_notes_online_channels_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes Online Channels in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes\\(Lien Clause) as report")
	public void user_click_to_select_daily_cover_notes_lien_clause_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT150']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes\\\\(Lien Clause) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes\\(Lien Clause) in pdf format")
	public void user_able_to_view_daily_cover_notes_lien_clause_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes\\\\(Lien Clause) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover Notes\\(New business & renewals) as report")
	public void user_click_to_select_daily_cover_notes_new_business_renewals_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT176']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover Notes\\\\(New business & renewals) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover Notes\\(New business & renewals) in pdf format")
	public void user_able_to_view_daily_cover_notes_new_business_renewals_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover Notes\\\\(New business & renewals) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Cover\\/Notes \\(Expiry Date wise) as report")
	public void user_click_to_select_daily_cover_notes_expiry_date_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT220']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Cover\\\\/Notes \\\\(Expiry Date wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Cover\\/Notes \\(Expiry Date wise) in pdf format")
	public void user_able_to_view_daily_cover_notes_expiry_date_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Cover\\\\/Notes \\\\(Expiry Date wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Credit Note as report")
	public void user_click_to_select_daily_credit_note_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT175']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Credit Note as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Credit Note in pdf format")
	public void user_able_to_view_daily_credit_note_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Credit Note in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Debit Notes\\/ Tax Invoices as report")
	public void user_click_to_select_daily_debit_notes_tax_invoices_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT30']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Debit Notes\\\\/ Tax Invoices as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Debit Notes\\/ Tax Invoices in pdf format")
	public void user_able_to_view_daily_debit_notes_tax_invoices_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Debit Notes\\\\/ Tax Invoices in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Debit Notes\\/ Tax Invoices\\(Un-Allocated\\/Allocated as report")
	public void user_click_to_select_daily_debit_notes_tax_invoices_un_allocated_allocated_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT213']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Debit Notes\\\\/ Tax Invoices\\\\(Un-Allocated\\\\/Allocated as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Debit Notes\\/ Tax Invoices\\(Un-Allocated\\/Allocated in pdf format")
	public void user_able_to_view_daily_debit_notes_tax_invoices_un_allocated_allocated_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Debit Notes\\\\/ Tax Invoices\\\\(Un-Allocated\\\\/Allocated in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Debit Notes\\/ Tax Invoices\\(with Levy) as report")
	public void user_click_to_select_daily_debit_notes_tax_invoices_with_levy_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT180']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Debit Notes\\\\/ Tax Invoices\\\\(with Levy) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Debit Notes\\/ Tax Invoices\\(with Levy) in pdf format")
	public void user_able_to_view_daily_debit_notes_tax_invoices_with_levy_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Debit Notes\\\\/ Tax Invoices\\\\(with Levy) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Payments as report")
	public void user_click_to_select_daily_payments_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT12']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Payments as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Payments in pdf format")
	public void user_able_to_view_daily_payments_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Payments in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Receipts as report")
	public void user_click_to_select_daily_receipts_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT13']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Receipts as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Receipts in pdf format")
	public void user_able_to_view_daily_receipts_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Receipts in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Receipts \\(Business Type) as report")
	public void user_click_to_select_daily_receipts_business_type_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT187']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Receipts \\\\(Business Type) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Receipts \\(Business Type) in pdf format")
	public void user_able_to_view_daily_receipts_business_type_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Receipts \\\\(Business Type) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Receipts \\(Insurer wise) as report")
	public void user_click_to_select_daily_receipts_insurer_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT65']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Receipts \\\\(Insurer wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Receipts \\(Insurer wise) in pdf format")
	public void user_able_to_view_daily_receipts_insurer_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Receipts \\\\(Insurer wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Daily Remittance Report as report")
	public void user_click_to_select_daily_remittance_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT204']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Daily Remittance Report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Daily Remittance Report in pdf format")
	public void user_able_to_view_daily_remittance_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Daily Remittance Report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Debit Note Ageing as report")
	public void user_click_to_select_debit_note_ageing_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT16']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Debit Note Ageing as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Debit Note Ageing in pdf format")
	public void user_able_to_view_debit_note_ageing_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Debit Note Ageing in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Debtors Age Analysis report as report")
	public void user_click_to_select_debtors_age_analysis_report_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT178']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Debtors Age Analysis report as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Debtors Age Analysis report in pdf format")
	public void user_able_to_view_debtors_age_analysis_report_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Debtors Age Analysis report in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Debtors Analysis Report\\(by date) as report")
	public void user_click_to_select_debtors_analysis_report_by_date_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT239']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Debtors Analysis Report\\\\(by date) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Debtors Analysis Report\\(by date) in pdf format")
	public void user_able_to_view_debtors_analysis_report_by_date_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Debtors Analysis Report\\\\(by date) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Details of the Policy issued on Credit as report")
	public void user_click_to_select_details_of_the_policy_issued_on_credit_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT92']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Details of the Policy issued on Credit as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then ("^user able to view Details of the Policy issued on credit in pdf format$")
	public void user_able_to_view_details_of_the_policy_issued_on_credit_daily_payments_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Details of the Policy issued on CreditDaily Payments in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Exchange Rate Report For Insurer as report")
	public void user_click_to_select_exchange_rate_report_for_insurer_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT235']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Exchange Rate Report For Insurer as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Exchange Rate Report For Insurer in pdf format")
	public void user_able_to_view_exchange_rate_report_for_insurer_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Exchange Rate Report For Insurer in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Expired Risk Notes as report")
	public void user_click_to_select_expired_risk_notes_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT78']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Expired Risk Notes as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Expired Risk Notes in pdf format")
	public void user_able_to_view_expired_risk_notes_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Expired Risk Notes in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Financial Statement - Balance Sheet as report")
	public void user_click_to_select_financial_statement_balance_sheet_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT110']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Financial Statement - Balance Sheet as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Financial Statement - Balance Sheet in pdf format")
	public void user_able_to_view_financial_statement_balance_sheet_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Financial Statement - Balance Sheet in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Financial Statement - Balance Sheet\\(Summarized) as report")
	public void user_click_to_select_financial_statement_balance_sheet_summarized_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT138']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Financial Statement - Balance Sheet\\\\(Summarized) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Financial Statement - Balance Sheet\\(Summarized) in pdf format")
	public void user_able_to_view_financial_statement_balance_sheet_summarized_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Financial Statement - Balance Sheet\\\\(Summarized) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Financial Statement - Profit and Loss account as report")
	public void user_click_to_select_financial_statement_profit_and_loss_account_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT111']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Financial Statement - Profit and Loss account as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Financial Statement - Profit and Loss account in pdf format")
	public void user_able_to_view_financial_statement_profit_and_loss_account_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Financial Statement - Profit and Loss account in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	/*@Then("user click to select Financial Statement - Profit and Loss account\\(Summarized) as report")
	public void user_click_to_select_financial_statement_profit_and_loss_account_summarized_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT139']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Financial Statement - Profit and Loss account\\\\(Summarized) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
		 Assertion assertion = new Assertion();
		assertion.assertEquals(output, "test");
	}*/

	/*@Then("user able to view Financial Statement - Profit and Loss account\\(Summarized) in pdf format")

	@Then("user able to view Financial Statement - Profit and Loss account\\(Summarized) in pdf format")

	public void user_able_to_view_financial_statement_profit_and_loss_account_summarized_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Financial Statement - Profit and Loss account\\\\(Summarized) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}*/

	@Then("user click to select Financial Statement - Profit and Loss account\\(Summarized) as report")
	public void user_click_to_select_financial_statement_profit_and_loss_account_summarized_as_report1() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT139']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Financial Statement - Profit and Loss account\\\\(Summarized) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	/*@Then("user able to view Financial Statement - Profit and Loss account\\(Summarized) in pdf format")
	public void user_able_to_view_financial_statement_profit_and_loss_account_summarized_in_pdf_format1() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Financial Statement - Profit and Loss account\\\\(Summarized) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}*/
	@Then("user click to select Financial Statement - Trial Balance as report")
	public void user_click_to_select_financial_statement_trial_balance_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT112']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Financial Statement - Trial Balance as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Financial Statement - Trial Balance in pdf format")
	public void user_able_to_view_financial_statement_trial_balance_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Financial Statement - Trial Balance in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Front Office - Daily Performance as report")
	public void user_click_to_select_front_office_daily_performance_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT18']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Front Office - Daily Performance as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Front Office - Daily Performance in pdf format")
	public void user_able_to_view_front_office_daily_performance_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Front Office - Daily Performance in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Front Office - Overall Performance as report")
	public void user_click_to_select_front_office_overall_performance_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT145']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Front Office - Overall Performance as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Front Office - Overall Performance in pdf format")
	public void user_able_to_view_front_office_overall_performance_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Front Office - Overall Performance in pdf formatuser able to view Front Office - Daily Performance in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select General Ledger as report")
	public void user_click_to_select_general_ledger_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT107']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select General Ledger as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@When("user select {string} as account")
	public void user_enter_as_account(String account) {
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbAcct']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=account;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as account",output.get("MESSAGE").toString());
		
	}
	@Then("user able to view General Ledger in pdf format")
	public void user_able_to_view_general_ledger_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view General Ledger in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Ledger \\(Client\\/Supplier) as report")
	public void user_click_to_select_ledger_client_supplier_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT10']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Ledger \\\\(Client\\\\/Supplier)) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Ledger \\(Client\\/Supplier) in pdf format")
	public void user_able_to_view_ledger_client_supplier_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Ledger \\\\(Client\\\\/Supplier) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Ledger \\(Insurer) as report")
	public void user_click_to_select_ledger_insurer_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT11']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Ledger \\\\(Insurer) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Ledger \\(Insurer) in pdf format")
	public void user_able_to_view_ledger_insurer_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Ledger \\\\(Insurer) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select List of Policies as report")
	public void user_click_to_select_list_of_policies_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT46']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select List of Policies as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view List of Policies in pdf format")
	public void user_able_to_view_list_of_policies_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view List of Policies in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select List Policies \\(Customer wise) as report")
	public void user_click_to_select_list_policies_customer_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT26']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select List Policies \\\\(Customer wise) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view List Policies \\(Customer wise) in pdf format")
	public void user_able_to_view_list_policies_customer_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view List Policies \\\\(Customer wise) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select MIS - Performance Report \\(Quarterly) as report")
	public void user_click_to_select_mis_performance_report_quarterly_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT52']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select MIS - Performance Report \\\\(Quarterly) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@When("user select {string} as year")
	public void user_select_as_year(String year) {
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbYear']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=year;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as year",output.get("MESSAGE").toString());
		
	}
	@When("user select {string} as quarter")
	public void user_select_as_quarter(String quarter) {
		Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbQuarter']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=quarter;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string} as quarter",output.get("MESSAGE").toString());
		
	}
	@Then("user able to view MIS - Performance Report \\(Quarterly) in pdf format")
	public void user_able_to_view_mis_performance_report_quarterly_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view MIS - Performance Report \\\\(Quarterly) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select MIS - Performance Report \\(Yearly) as report")
	public void user_click_to_select_mis_performance_report_yearly_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT53']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select MIS - Performance Report \\\\(Yearly) as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view MIS - Performance Report \\(Yearly) in pdf format")
	public void user_able_to_view_mis_performance_report_yearly_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view MIS - Performance Report \\\\(Yearly) in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Mobile Money Transaction as report")
	public void user_click_to_select_mobile_money_transaction_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT120']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Mobile Money Transaction as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Mobile Money Transaction in pdf format")
	public void user_able_to_view_mobile_money_transaction_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Mobile Money Transaction in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Then("user click to select Mobile Money Transaction \\(User Wise)as report")
	public void user_click_to_select_mobile_money_transaction_user_wise_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT156']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Mobile Money Transaction \\\\(User Wise)as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Mobile Money Transaction \\(User Wise)in pdf format")
	public void user_able_to_view_mobile_money_transaction_user_wise_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Mobile Money Transaction \\\\(User Wise)in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Modified \\/ Endorsed Cover Notes as report")
	public void user_click_to_select_modified_endorsed_cover_notesas_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT61']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Modified \\\\/ Endorsed Cover Notesas report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Modified \\/ Endorsed Cover Notes in pdf format")
	public void user_able_to_view_modified_endorsed_cover_notesin_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Modified \\\\/ Endorsed Cover Notesin pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Motor Schedule as report")
	public void user_click_to_select_motor_schedule_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT17']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Motor Schedule as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Motor Schedule in pdf format")
	public void user_able_to_view_motor_schedule_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Motor Schedule in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Then("user click to select Multi Policies Quotation as report")
	public void user_click_to_select_multi_policies_quotation_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT51']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Multi Policies Quotation as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Multi Policies Quotation in pdf format")
	public void user_able_to_view_multi_policies_quotation_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Multi Policies Quotation in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Not Renewed Policies as report")
	public void user_click_to_select_not_renewed_policies_as_report() throws InterruptedException {
		Object[] input = new Object[2];
		 input[0] = "//*[@value='REPORT146']";
		 Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click to select Not Renewed Policies as report", output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@Then("user able to view Not Renewed Policies in pdf format")
	public void user_able_to_view_not_renewed_policies_in_pdf_format() {
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view Not Renewed Policies in pdf format", output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("user click to select Outstanding Commission Ageing Report as report")
	public void user_click_to_select_outstanding_commission_ageing_report_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT124']",  "user click to select Outstanding Commission Ageing Report as report","CLICK", 2000);
	}
	
	@Then("user able to view Outstanding Commission Ageing Report in pdf format")
	public void user_able_to_view_outstanding_commission_ageing_report_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Outstanding Commission Ageing Report in pdf format","SWITCHWINDOW");
	}
	
	@Then("user click to select Outstanding Commission Statement as report")
	public void user_click_to_select_outstanding_commission_statement_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT123']",  "user click to select Outstanding Commission Statement as report","CLICK", 2000);

	}
	@Then("user able to view Outstanding Commission Statement in pdf format")
	public void user_able_to_view_outstanding_commission_statement_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Outstanding Commission Statement in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Outstanding Premium Ageing Report\\(Details) as report")
	public void user_click_to_select_outstanding_premium_ageing_report_details_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT216']",  "user click to select Outstanding Premium Ageing Report\\\\(Details) as report","CLICK", 2000);

	}
	@Then("user able to view Outstanding Premium Ageing Report\\(Details) in pdf format")
	public void user_able_to_view_outstanding_premium_ageing_report_details_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Outstanding Premium Ageing Report\\\\(Details) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Outstanding Premium Report\\(Business Group) as report")
	public void user_click_to_select_outstanding_premium_report_business_group_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT209']",  "user click to select Outstanding Premium Report\\\\(Business Group) as report","CLICK", 2000);

	}
	@Then("user able to view Outstanding Premium Report\\(Business Group) in pdf format")
	public void user_able_to_view_outstanding_premium_report_business_group_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Outstanding Premium Report\\\\(Business Group) in pdf format","SWITCHWINDOW");
	}

	@Then("user click to select Payment Cheque Register as report")
	public void user_click_to_select_payment_cheque_register_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT108']",  "user click to select Payment Cheque Register as report","CLICK", 2000);

	}
	@When("user select {string} as Supplier Name")
	public void user_select_as_supplier_name(String supplierName) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbSPLR']", "//*[@class='select2-input select2-focused']", 
	    supplierName, "//*[@class='select2-match']", "user select {string} as Supplier Name", "DROPDOWN", 0);
	}
	
	@Then ("user able to view Payment Cheque Register in pdf format")
	public void paymentChequeRegister() {
	    Itl.CustomswitchWindowEvent("user able to view Payment Cheque Register in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Pending Quotation as report")
	public void user_click_to_select_pending_quotation_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT98']",  "user click to select Pending Quotation as report","CLICK", 2000);

	}
	@Then("user able to view Pending Quotation in pdf format")
	public void user_able_to_view_pending_quotation_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Pending Quotation in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Performance Incentive Report as report")
	public void user_click_to_select_performance_incentive_report_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT64']",  "user click to select Performance Incentive Report as report","CLICK", 2000);

	}
	@Then("user able to view Performance Incentive Report in pdf format")
	public void user_able_to_view_performance_incentive_reportin_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Performance Incentive Reportin pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Policy Cancellation as report")
	public void user_click_to_select_policy_cancellation_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT56']",  "user click to select Policy Cancellation as report","CLICK", 2000);

	}
	@Then("user able to view Policy Cancellation in pdf format")
	public void user_able_to_view_policy_cancellation_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Policy Cancellation in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Policy Push Error Records as report")
	public void user_click_to_select_policy_push_error_records_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT196']",  "user click to select Policy Push Error Records as report","CLICK", 2000);

	}
	@Then("user able to view Policy Push Error Records in pdf format")
	public void user_able_to_view_policy_push_error_records_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Policy Push Error Records in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Policy Renewable as report")
	public void user_click_to_select_policy_renewable_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT169']",  "user click to select Policy Renewable as report","CLICK", 2000);

	}
	@Then("user able to view Policy Renewable in pdf format")
	public void user_able_to_view_policy_renewable_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Policy Renewable in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Policy Retention Report \\(Quarterly) as report")
	public void user_click_to_select_policy_retention_report_quarterly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT167']",  "user click to select Policy Retention Report \\\\(Quarterly)) as report","CLICK", 2000);

	}
	@Then("user able to view Policy Retention Report \\(Quarterly) in pdf format")
	public void user_able_to_view_policy_retention_report_quarterly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Policy Retention Report \\\\(Quarterly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Policy Retention Report \\(Yearly) as report")
	public void user_click_to_select_policy_retention_report_yearly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT168']",  "user click to select Policy Retention Report \\\\(Yearly) as report","CLICK", 2000);

	}
	@Then("user able to view Policy Retention Report \\(Yearly) in pdf format")
	public void user_able_to_view_policy_retention_report_yearly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Policy Retention Report \\\\(Yearly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Premium Financed Risk Notes as report")
	public void user_click_to_select_premium_financed_risk_notes_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT68']",  "user click to select Premium Financed Risk Notes as report","CLICK", 2000);

	}
	@Then("user able to view Premium Financed Risk Notes in pdf format")
	public void user_able_to_view_premium_financed_risk_notes_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Premium Financed Risk Notes in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Print Multiple Certificate as report")
	public void user_click_to_select_print_multiple_certificate_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT229']",  "user click to select Print Multiple Certificate as report","CLICK", 2000);

	}
	@When("user enter {string} as risk note from")
	public void user_enter_as_risk_note_from(String riskNoteFrom) throws InterruptedException {
		Itl.CustomSendEvent("//*[@id='MainContent_txtRiskNoteFrom']",riskNoteFrom ,"user enter {string} as risk note from", "TEXTBOX", 2000);

	}
	@When("user enter {string} as To")
	public void user_enter_as_to(String riskNoteTo) throws InterruptedException {
		Itl.CustomSendEvent("//*[@id='MainContent_txtRiskNoteTo']",riskNoteTo , "user enter {string} as risk note from","TEXTBOX", 2000);

	}
	@Then("user able to view Print Multiple Certificate in pdf format")
	public void user_able_to_view_print_multiple_certificate_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Print Multiple Certificate in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Print Multiple Policy Documents as report")
	public void user_click_to_select_print_multiple_policy_documents_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT_PD']",  "user click to select Print Multiple Policy Documents as report","CLICK", 2000);

	}
	@Then("user able to view Print Multiple Policy Documents in pdf format")
	public void user_able_to_view_print_multiple_policy_documents_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Print Multiple Policy Documents in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Print Multiple Risk Notes as report")
	public void user_click_to_select_print_multiple_risk_notes_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT02']",  "user click to select Print Multiple Risk Notes as report","CLICK", 2000);

	}
	@Then("user able to view Print Multiple Risk Notes in pdf format")
	public void user_able_to_view_print_multiple_risk_notes_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Print Multiple Risk Notes in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Print Multiple TIRA Stickers \\(New) as report")
	public void user_click_to_select_print_multiple_tira_stickers_new_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT147']",  "user click to select Print Multiple TIRA Stickers \\\\(New) as report","CLICK", 2000);

	}
	@Then("user able to view Print Multiple TIRA Stickers \\(New) in pdf format")
	public void user_able_to_view_print_multiple_tira_stickers_new_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Print Multiple TIRA Stickers \\\\(New) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Regulatory Document Inventory as report")
	public void user_click_to_select_regulatory_document_inventory_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT189']",  "user click to select Regulatory Document Inventory as report","CLICK", 2000);

	}
	@Then("user able to view Regulatory Document Inventory in pdf format")
	public void user_able_to_view_regulatory_document_inventory_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Regulatory Document Inventory in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Renewal List as report")
	public void user_click_to_select_renewal_list_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT14']",  "user click to select Renewal List as report","CLICK", 2000);

	}
	@Then("user able to view Renewal List in pdf format")
	public void user_able_to_view_renewal_list_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Renewal List in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Renewal List \\(User wise) as report")
	public void user_click_to_select_renewal_list_user_wise_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT221']",  "user click to select Renewal List \\\\(User wise) as report","CLICK", 2000);

	}
	@Then("user able to view Renewal List \\(User wise) in pdf format")
	public void user_able_to_view_renewal_list_user_wise_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Renewal List \\\\(User wise) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Renewal Reminder Letter as report")
	public void user_click_to_select_renewal_reminder_letter_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT15']",  "user click to select Renewal Reminder Letter as report","CLICK", 2000);

	}
	@Then("user able to view Renewal Reminder Letter in pdf format")
	public void user_able_to_view_renewal_reminder_letter_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Renewal Reminder Letter in pdf format","SWITCHWINDOW");
	}
	
	@Then("user click to select Show Expired, Active or Renewed Risk Notes. as report")
	public void user_click_to_select_show_expired_active_or_renewed_risk_notes_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT62']",  "user click to select Show Expired, Active or Renewed Risk Notes. as report","CLICK", 2000);

	}
	@Then("user able to view Show Expired, Active or Renewed Risk Notes. in pdf format")
	public void user_able_to_view_show_expired_active_or_renewed_risk_notes_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Show Expired, Active or Renewed Risk Notes. in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Statement \\(Client-wise) as report")
	public void user_click_to_select_statement_client_wise_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT09']",  "user click to select Statement \\\\(Client-wise) as report","CLICK", 2000);

	}
	@Then("user able to view Statement \\(Client-wise) in pdf format")
	public void user_able_to_view_statement_client_wise_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Statement \\\\(Client-wise) in pdf forma","SWITCHWINDOW");

	}
	
	@Then("user click to select Statement \\(Insurer-wise) Comprehensive as report")
	public void user_click_to_select_statement_insurer_wise_comprehensive_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT59']",  "user click to select Statement \\\\(Insurer-wise) Comprehensive as report","CLICK", 2000);

	}
	@Then("user able to view Statement \\(Insurer-wise) Comprehensive in pdf format")
	public void user_able_to_view_statement_insurer_wise_comprehensive_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Statement \\\\(Insurer-wise) Comprehensive in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Statement \\(Insurer-wise) Kenya as report")
	public void user_click_to_select_statement_insurer_wise_kenya_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT97']",  "user click to select Statement \\\\(Insurer-wise) Kenya as report","CLICK", 2000);

	}
	@Then("user able to view Statement \\(Insurer-wise) Kenya in pdf format")
	public void user_able_to_view_statement_insurer_wise_kenya_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Statement \\\\(Insurer-wise) Kenya in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Statement \\(Insurer-wise)Type one as report")
	public void user_click_to_select_statement_insurer_wise_type_one_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT08']",  "user click to select Statement \\\\(Insurer-wise)Type one as report","CLICK", 2000);

	}
	@Then("user able to view Statement \\(Insurer-wise)Type one in pdf format")
	public void user_able_to_view_statement_insurer_wise_type_one_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Statement \\\\(Insurer-wise)Type one in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Statement \\(Insurer-wise)Type two as report")
	public void user_click_to_select_statement_insurer_wise_type_two_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT44']",  "user click to select Statement \\\\(Insurer-wise)Type two as report","CLICK", 2000);

	}
	@Then("user able to view Statement \\(Insurer-wise)Type two in pdf format")
	public void user_able_to_view_statement_insurer_wise_type_two_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Statement \\\\(Insurer-wise)Type two in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Statement \\(Insurer-wise)Type three as report")
	public void user_click_to_select_statement_insurer_wise_type_three_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT44']",  "user click to select Statement \\\\(Insurer-wise)Type three as report","CLICK", 2000);

	}
	@Then("user able to view Statement \\(Insurer-wise)Type three in pdf format")
	public void user_able_to_view_statement_insurer_wise_type_three_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Statement \\\\(Insurer-wise)Type three in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Statement Statement \\(Client-wise) - on Risk Note as report")
	public void user_click_to_select_statement_statement_client_wise_on_risk_note_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT217']",  "user click to select Statement Statement \\\\(Client-wise) - on Risk Note as report","CLICK", 2000);

	}
	@Then("user able to view Statement Statement \\(Client-wise) - on Risk Note in pdf format")
	public void user_able_to_view_statement_statement_client_wise_on_risk_note_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Statement Statement \\\\(Client-wise) - on Risk Note in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Sticker Replacement as report")
	public void user_click_to_select_sticker_replacement_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT186']",  "user click to select Sticker Replacement as report","CLICK", 2000);

	}
	@Then("user able to view Sticker Replacement in pdf format")
	public void user_able_to_view_sticker_replacement_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Sticker Replacement in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Supplier Invoice Ageing Report as report")
	public void user_click_to_select_supplier_invoice_ageing_report_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT105']",  "user click to select Supplier Invoice Ageing Report as report","CLICK", 2000);

	}
	@Then("user able to view Supplier Invoice Ageing Report in pdf format")
	public void user_able_to_view_supplier_invoice_ageing_report_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Supplier Invoice Ageing Report in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Supplier Statement as report")
	public void user_click_to_select_supplier_statement_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT104']",  "user click to select Supplier Statement as report","CLICK", 2000);

	}
	@Then("user able to view Supplier Statement in pdf format")
	public void user_able_to_view_supplier_statement_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Supplier Statement in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Targets as report")
	public void user_click_to_select_targets_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT117']",  "user click to select Targets as report","CLICK", 2000);

	}
	@Then("user able to view Targets in pdf format")
	public void user_able_to_view_targets_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Targets in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Targets \\(Zone wise) as report")
	public void user_click_to_select_targets_zone_wise_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT159']",  "user click to select Targets \\\\(Zone wise) as report","CLICK", 2000);

	}
	@Then("user able to view Targets \\(Zone wise) in pdf format")
	public void user_able_to_view_targets_zone_wise_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Targets \\\\(Zone wise) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Targets \\(Zone wise) BY Policy Count as report")
	public void user_click_to_select_targets_zone_wise_by_policy_count_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT166']",  "user click to select Targets \\\\(Zone wise) BY Policy Count as report","CLICK", 2000);

	}
	@Then("user able to view Targets \\(Zone wise) BY Policy Count in pdf format")
	public void user_able_to_view_targets_zone_wise_by_policy_count_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Targets \\\\(Zone wise) BY Policy Count in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Targets By Policy Count as report")
	public void user_click_to_select_targets_by_policy_count_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT165']",  "user click to select Targets By Policy Count as report","CLICK", 2000);

	}
	@Then("user able to view Targets By Policy Count in pdf format")
	public void user_able_to_view_targets_by_policy_count_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Targets By Policy Count in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA MIS Report as report")
	public void user_click_to_select_tira_mis_report_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT79']",  "user click to select TIRA MIS Report as report","CLICK", 2000);
;
	}
	@Then("user able to view TIRA MIS Report in pdf format")
	public void user_able_to_view_tira_mis_reportnt_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA MIS Reportnt in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Broker Premium Remittance Statement as report")
	public void user_click_to_select_tira_reports_broker_premium_remittance_statement_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT40']",  "user click to select TIRA Reports - Broker Premium Remittance Statement as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Broker Premium Remittance Statement in pdf format")
	public void user_able_to_view_tira_reports_broker_premium_remittance_statement_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Broker Premium Remittance Statement in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Broker Premium Remittance Statement\\(Quarterly) as report")
	public void user_click_to_select_tira_reports_broker_premium_remittance_statement_quarterly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT80']",  "user click to select TIRA Reports - Broker Premium Remittance Statement\\\\(Quarterly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Broker Premium Remittance Statement\\(Quarterly) in pdf format")
	public void user_able_to_view_tira_reports_broker_premium_remittance_statement_quarterly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Broker Premium Remittance Statement\\\\(Quarterly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Brokers Premium Collection Report \\(Quarterly) as report")
	public void user_click_to_select_tira_reports_brokers_premium_collection_report_quarterly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT48']",  "user click to select TIRA Reports - Brokers Premium Collection Report \\\\(Quarterly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Brokers Premium Collection Report \\(Quarterly) in pdf format")
	public void user_able_to_view_tira_reports_brokers_premium_collection_report_quarterly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Brokers Premium Collection Report \\\\(Quarterly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Commission Income Statemnt \\(Quarterly) as report")
	public void user_click_to_select_tira_reports_commission_income_statemnt_quarterly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT42']",  "user click to select TIRA Reports - Commission Income Statemnt \\\\(Quarterly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Commission Income Statemnt \\(Quarterly) in pdf format")
	public void user_able_to_view_tira_reports_commission_income_statemnt_quarterly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Commission Income Statemnt \\\\(Quarterly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Commission Income Statemnt \\(Yearly) as report")
	public void user_click_to_select_tira_reports_commission_income_statemnt_yearly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT41']",  "user click to select TIRA Reports - Commission Income Statemnt \\\\(Yearly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Commission Income Statemnt \\(Yearly) in pdf format")
	public void user_able_to_view_tira_reports_commission_income_statemnt_yearly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Commission Income Statemnt \\\\(Yearly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Commission IncomeStatement \\(Monthly) as report")
	public void user_click_to_select_tira_reports_commission_income_statement_monthly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT100']",  "user click to select TIRA Reports - Commission IncomeStatement \\\\(Monthly) as report","CLICK", 2000);

	}
	@When("user select {string} as monthly")
	public void user_select_as_monthly(String monthly) {
		Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbMonthly']", "//*[@class='select2-input select2-focused']", 
			    monthly, "//*[@class='select2-match']", "user select {string} as monthly", "DROPDOWN", 0);
			
	}
	@Then("user able to view TIRA Reports - Commission IncomeStatement \\(Monthly) in pdf format")
	public void user_able_to_view_tira_reports_commission_income_statement_monthly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Commission IncomeStatement \\\\(Monthly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Payables Outstanding to Insurers as report")
	public void user_click_to_select_tira_reports_payables_outstanding_to_insurers_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT38']",  "user click to select TIRA Reports - Payables Outstanding to Insurers as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Payables Outstanding to Insurers in pdf format")
	public void user_able_to_view_tira_reports_payables_outstanding_to_insurers_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Payables Outstanding to Insurers in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Payables Outstanding to Insurers \\(Quaterly) as report")
	public void user_click_to_select_tira_reports_payables_outstanding_to_insurers_quaterly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT115']",  "user click to select TIRA Reports - Payables Outstanding to Insurers \\\\(Quaterly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Payables Outstanding to Insurers \\(Quaterly) in pdf format")
	public void user_able_to_view_tira_reports_payables_outstanding_to_insurers_quaterly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Payables Outstanding to Insurers \\\\(Quaterly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Premium Booked Statement \\(Monthly) as report")
	public void user_click_to_select_tira_reports_premium_booked_statement_monthly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT148']",  "user click to select TIRA Reports - Premium Booked Statement \\\\(Monthly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Premium Booked Statement \\(Monthly) in pdf format")
	public void user_able_to_view_tira_reports_premium_booked_statement_monthly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Premium Booked Statement \\\\(Monthly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Premium Booked Statement \\(Quarterly) as report")
	public void user_click_to_select_tira_reports_premium_booked_statement_quarterly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT36']",  "user click to select TIRA Reports - Premium Booked Statement \\\\(Quarterly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Premium Booked Statement \\(Quarterly) in pdf format")
	public void user_able_to_view_tira_reports_premium_booked_statement_quarterly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Premium Booked Statement \\\\(Quarterly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Premium Booked Statement \\(Yearly) as report")
	public void user_click_to_select_tira_reports_premium_booked_statement_yearly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT35']",  "user click to select TIRA Reports - Premium Booked Statement \\\\(Yearly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Premium Booked Statement \\(Yearly) in pdf format")
	public void user_able_to_view_tira_reports_premium_booked_statement_yearly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Premium Booked Statement \\\\(Yearly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Premium Booked Statement-Life Assurance \\(Quarterly) as report")
	public void user_click_to_select_tira_reports_premium_booked_statement_life_assurance_quarterly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT39']",  "user click to select TIRA Reports - Premium Booked Statement-Life Assurance \\\\(Quarterly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Premium Booked Statement-Life Assurance \\(Quarterly) in pdf format")
	public void user_able_to_view_tira_reports_premium_booked_statement_life_assurance_quarterly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Premium Booked Statement-Life Assurance \\\\(Quarterly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Reports - Premium Booked Statement-Life Assurance \\(Yearly) as report")
	public void user_click_to_select_tira_reports_premium_booked_statement_life_assurance_yearly_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT37']",  "user click to select TIRA Reports - Premium Booked Statement-Life Assurance \\\\(Yearly) as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Reports - Premium Booked Statement-Life Assurance \\(Yearly) in pdf format")
	public void user_able_to_view_tira_reports_premium_booked_statement_life_assurance_yearly_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Reports - Premium Booked Statement-Life Assurance \\\\(Yearly) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select TIRA Sticker Inventory as report")
	public void user_click_to_select_tira_sticker_inventory_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT93']",  "user click to select TIRA Sticker Inventory as report","CLICK", 2000);

	}
	@Then("user able to view TIRA Sticker Inventory in pdf format")
	public void user_able_to_view_tira_sticker_inventory_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view TIRA Sticker Inventory in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Total Outstanding Payments \\(Client wise) as report")
	public void user_click_to_select_total_outstanding_payments_client_wise_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT214']",  "user click to select Total Outstanding Payments \\\\(Client wise) as report","CLICK", 2000);

	}
	@Then("user able to view Total Outstanding Payments \\(Client wise) in pdf format")
	public void user_able_to_view_total_outstanding_payments_client_wise_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Total Outstanding Payments \\\\(Client wise) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Total Outstanding Payments \\(Detailed) as report")
	public void user_click_to_select_total_outstanding_payments_detailed_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT29']",  "user click to select Total Outstanding Payments \\\\(Detailed) as report","CLICK", 2000);

	}
	@Then("user able to view Total Outstanding Payments \\(Detailed) in pdf format")
	public void user_able_to_view_total_outstanding_payments_detailed_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Total Outstanding Payments \\\\(Detailed) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Total Outstanding Payments \\(Summarized) as report")
	public void user_click_to_select_total_outstanding_payments_summarized_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT22']",  "user click to select Total Outstanding Payments \\\\(Summarized) as report","CLICK", 2000);

	}
	@Then("user able to view Total Outstanding Payments \\(Summarized) in pdf format")
	public void user_able_to_view_total_outstanding_payments_summarized_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Total Outstanding Payments \\\\(Summarized) in pdf format","SWITCHWINDOW");

	}
	
	@Then("user click to select Total Outstanding Receipts \\(Detailed) as report")
	public void user_click_to_select_total_outstanding_receipts_detailed_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT28']",  "user click to select Total Outstanding Receipts \\\\(Detailed) as report","CLICK", 2000);

	}
	@Then("user able to view Total Outstanding Receipts \\(Detailed) in pdf format")
	public void user_able_to_view_total_outstanding_receipts_detailed_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Total Outstanding Receipts \\\\(Detailed) in pdf format","SWITCHWINDOW");

	}
	

    @Then("user click to select Total Outstanding Receipts \\(Summarized) as report")
    public void user_click_to_select_total_outstanding_receipts_summarized_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT21']",  "user click to select Total Outstanding Receipts \\\\(Summarized) as report","CLICK", 2000);

    }
    @Then("user able to view Total Outstanding Receipts \\(Summarized) in pdf format")
    public void user_able_to_view_total_outstanding_receipts_summarized_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Total Outstanding Receipts \\\\(Summarized) in pdf format","SWITCHWINDOW");

    }
    
    @Then("user click to select Unallocated Credit Note as report")
    public void user_click_to_select_unallocated_credit_note_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT236']",  "user click to select Unallocated Credit Note as report","CLICK", 2000);

    }
    @Then("user able to view Unallocated Credit Note in pdf format")
    public void user_able_to_view_unallocated_credit_note_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Unallocated Credit Note in pdf format","SWITCHWINDOW");

    }
    
    @Then("user click to select Unallocated Payments as report")
    public void user_click_to_select_unallocated_payments_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT24']",  "user click to select Unallocated Payments as report","CLICK", 2000);

    }
    @Then("user able to view Unallocated Payments in pdf format")
    public void user_able_to_view_unallocated_payments_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Unallocated Payments in pdf format","SWITCHWINDOW");

    }
    
    @Then("user click to select Unallocated Receipts as report")
    public void user_click_to_select_unallocated_receipts_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT23']",  "user click to select Unallocated Receipts as report","CLICK", 2000);

    }
    @Then("user able to view Unallocated Receipts in pdf format")
    public void user_able_to_view_unallocated_receipts_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Unallocated Receipts in pdf format","SWITCHWINDOW");
    }
    
    @Then("user click to select Unrequested Customer Tax Invoice Transactions as report")
    public void user_click_to_select_unrequested_customer_tax_invoice_transactions_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT133']",  "user click to select Unrequested Customer Tax Invoice Transactions as report","CLICK", 2000);

    }
    @Then("user able to view Unrequested Customer Tax Invoice Transactions in pdf format")
    public void user_able_to_view_unrequested_customer_tax_invoice_transactions_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Unrequested Customer Tax Invoice Transactions in pdf format","SWITCHWINDOW");

    }
    
    @Then("user click to select User Details as report")
    public void user_click_to_select_user_details_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT219']",  "user click to select User Details as report","CLICK", 2000);

    }
    @Then("user able to view User Details in pdf format")
    public void user_able_to_view_user_details_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view User Details in pdf format","SWITCHWINDOW");
    }
    
    @Then("user click to select VAT submission Report as report")
    public void user_click_to_select_vat_submission_report_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT109']",  "user click to select VAT submission Report as report","CLICK", 2000);

    }
    @Then("user able to view VAT submission Report in pdf format")
    public void user_able_to_view_vat_submission_report_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view VAT submission Report in pdf format","SWITCHWINDOW");

    }
    
    @Then("user click to select VAT submission Report for Insurance Companies as report")
    public void user_click_to_select_vat_submission_report_for_insurance_companies_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT49']",  "user click to select VAT submission Report for Insurance Companies as report","CLICK", 2000);

    }
    @Then("user able to view VAT submission Report for Insurance Companies in pdf format")
    public void user_able_to_view_vat_submission_report_for_insurance_companies_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view VAT submission Report for Insurance Companies in pdf format","SWITCHWINDOW");

    }
    
    @Then("user click to select VAT submission Report for Insurance Companies one as report")
    public void user_click_to_select_vat_submission_report_for_insurance_companies_one_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT54']",  "user click to select VAT submission Report for Insurance Companies one as report","CLICK", 2000);

    }
    @Then("user able to view VAT submission Report for Insurance Companies one in pdf format")
    public void user_able_to_view_vat_submission_report_for_insurance_companiesone_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view VAT submission Report for Insurance Companies one in pdf format","SWITCHWINDOW");

    }
    
    @Then("user click to select Vouchers Report as report")
    public void user_click_to_select_vouchers_report_as_report() throws InterruptedException {
	    Itl.CustomDoubleClickEvent("//*[@value='REPORT106']",  "user click to select Vouchers Report as report","CLICK", 2000);

    }
    @Then("user able to view Vouchers Report in pdf format")
    public void user_able_to_view_vouchers_report_in_pdf_format() {
	    Itl.CustomswitchWindowEvent("user able to view Vouchers Report in pdf format","SWITCHWINDOW");
    }


}
