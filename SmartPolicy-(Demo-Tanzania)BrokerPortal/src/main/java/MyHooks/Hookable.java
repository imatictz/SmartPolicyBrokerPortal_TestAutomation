package MyHooks;

import java.net.UnknownHostException;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Hookable {
	@Before(order=0)
	public void before(Scenario Scenario) throws UnknownHostException{   
		HTMLReportGenerator.TestSuiteStart("C:\\TestResult\\Demo-Broker-April.html","SmartPolicy");
		HTMLReportGenerator.TestCaseStart(Scenario.getName(),Scenario.getStatus().toString());
		System.out.println("--------------------Scenario Start---------------------");
	}
	
	@After
	public void after(Scenario Scenario){
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		System.out.println("--------------------Scenario End-----------------------");
	}
	
	@Before(order=1)
	public void bLaunch(){
	    SeleniumOperations.browserLaunch(); 
	}
	 	
	@Before(order=2)
	public void openApp(){
	 	SeleniumOperations.openApplication(); 
	}
	 	
    @Before(order=3)
	public void enterUserName(){
	    Object[] input2=new Object[2];
	 	input2[0]="//*[@id='usercode']";
	 	SeleniumOperations.sendUserId(input2);
	}
	 	
	@Before(order=4)
	public void enterPassword(){
	    Object[] input3=new Object[2];
	    input3[0]="//*[@id='password']";
	    SeleniumOperations.sendPassword(input3);
	}
	 	
	@Before(order=5)
    public void clickOnLoginButton(){
	    Object[] input4=new Object[1];
		input4[0]="//*[text()='Login']";
		SeleniumOperations.clickOnElement(input4);
    } 
}
