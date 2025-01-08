package cucumberMap;

import java.util.Hashtable;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login {
	
	@Given ("^user provide browser name and exe location$")
	public void bLaunch(){
	    SeleniumOperations.browserLaunch();  
	}
	
	@Given ("^user enter url$")
	public void openApp(){
	    SeleniumOperations.openApplication(); 
	}
	
	@When ("^user enter username$")
	public void enterUserName(){
		Object[] input2=new Object[2];
	    input2[0]="//*[@id='usercode']";
	    Hashtable<String, Object> output2 = SeleniumOperations.sendUserId(input2);
	    HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user enter username$",output2.get("MESSAGE").toString());
	}
	
	@When ("^user enter password$")
	public void enterPassword(){
		Object[] input3=new Object[2];
	    input3[0]="//*[@id='password']";
 	    Hashtable<String, Object> output3 = SeleniumOperations.sendPassword(input3);
	    HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user enter password$",output3.get("MESSAGE").toString());

	}
	
	
	

	@When ("^user enter \"(.*)\" as username$")
	public void sendUserName(String username){
		Object[] input2=new Object[2];
	    input2[0]="//*[@id='usercode']";
	    input2[1]=username;
	    Hashtable<String, Object> output2 = SeleniumOperations.sendKeys(input2);
	    HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user enter username$",output2.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as password$")
	public void sendPassword(String password){
		Object[] input2=new Object[2];
	    input2[0]="//*[@id='password']";
	    input2[1]=password;
	    Hashtable<String, Object> output2 = SeleniumOperations.sendKeys(input2);
	    HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user enter password$",output2.get("MESSAGE").toString());
	}
	  
	@And ("^user click on login button$")
	public void clickOnLoginButton(){
		Object[] input4=new Object[1];
	    input4[0]="//*[text()='Login']";
	    Hashtable<String, Object> output4 = SeleniumOperations.clickOnElement(input4);
	    HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on login button$",output4.get("MESSAGE").toString());
	}
	 
	//Valid
	@Then ("^application shows home page to user$")
	public void validValidation(){
		Object[] input5=new Object[2];
        input5[0]="(//*[text()='Pravin Wagh'])[2]";
	    input5[1]="Pravin Wagh";
	    Hashtable<String, Object> output5 = SeleniumOperations.validation(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^application shows home page to user$",output5.get("MESSAGE").toString());
	 }
	 
	 //InValid
	 @Then ("^application shows error message as 2031-Invalid User / Password entered$")
	 public void InvalidValidation1(){
		 Object[] input6=new Object[2];
		 input6[0]="//*[text()='2031-Invalid User / Password entered']";
		 input6[1]="2031-Invalid User / Password entered";
		 Hashtable<String, Object> output6 = SeleniumOperations.validation(input6);
		 HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^application shows error message as 2031-Invalid User / Password entered$",output6.get("MESSAGE").toString());
	 }
	
	 @Then ("^application shows error message as 2024-Invalid User / Password entered$")
	 public void InvalidValidation2() {
		 Object[] input7=new Object[2];
		 input7[0]="//*[text()='2024-Invalid User / Password entered']";
		 input7[1]="2024-Invalid User / Password entered";
		 Hashtable<String, Object> output7 = SeleniumOperations.validation(input7);
		 HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^application shows error message as 2024-Invalid User / Password entered$",output7.get("MESSAGE").toString());
	 }
	 
	 @Then ("^application shows error message as 2002-Password cannot be empty$")
	 public void invalidValidation3() {
		 Object[] input8=new Object[2];
		 input8[0]="//*[text()='2002-Password cannot be empty']";
		 input8[1]="2002-Password cannot be empty";
		 Hashtable<String, Object> output8 = SeleniumOperations.validation(input8);
		 HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^application shows error message as 2002-Password cannot be empty$",output8.get("MESSAGE").toString());
	 }
	 
	 @Then ("^application shows error message as 2001-Please specify Login User$")
	 public void invalidValidation4() {
		 Object[] input9=new Object[2];
		 input9[0]="//*[text()='2001-Please specify Login User']";
		 input9[1]="2001-Please specify Login User";
		 Hashtable<String, Object> output9 = SeleniumOperations.validation(input9);
		 HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^application shows error message as 2001-Please specify Login User$",output9.get("MESSAGE").toString());
	 }
	 
	 @Then ("^application shows error message as 2028-Invalid User / Password entered$")
	 public void invalidValidation5() {
		 Object[] input10=new Object[2];
		 input10[0]="//*[text()='2028-Invalid User / Password entered']";
		 input10[1]="2028-Invalid User / Password entered";
		 Hashtable<String, Object> output10 = SeleniumOperations.validation(input10);
		 HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^application shows error message as 2028-Invalid User / Password entered$",output10.get("MESSAGE").toString());
	 }
}














