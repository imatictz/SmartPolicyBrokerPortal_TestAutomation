    package utility;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.ElementNotInteractableException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumOperations 
{
	
  //private static final String[] String = null;
    public static WebDriver driver=null;
	public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
	public static ConfigReader config;
	public static WebDriverWait wait1;
	static Properties langProperties;

  //BrowserLaunch
	public static Hashtable<String,Object>  browserLaunch(){  
		try {
		  config=new ConfigReader();
	      if(config.getBrowserName().equalsIgnoreCase("Chrome")){		
		    
	    	  WebDriverManager.chromedriver().setup();
	    	  driver = new ChromeDriver();
	    	  /*System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
		     driver=new ChromeDriver();*/
		     driver.manage().window().maximize();
	      }
	      else if(config.getBrowserName().equalsIgnoreCase("FireFox")) { 
	        WebDriverManager.firefoxdriver().setup();
	        driver = new FirefoxDriver();
	    	  /* System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
	         driver=new FirefoxDriver();*/
	         driver.manage().window().maximize();
	     
	      }
	      else if(config.getBrowserName().equalsIgnoreCase("MicroSoftEdge")){ 
	        WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
	    	  /* System.setProperty("webdriver.edge.driver", config.getDriverPathMicroSoft() );
	         driver=new EdgeDriver();*/
	         driver.manage().window().maximize();
	      }
	      else if(config.getBrowserName().equalsIgnoreCase("Safari")){ 
		        WebDriverManager.safaridriver().setup();
		        driver = new SafariDriver();
		    	  /* System.setProperty("webdriver.edge.driver", config.getDriverPathMicroSoft() );
		         driver=new EdgeDriver();*/
		         driver.manage().window().maximize();
		      }
	         outputparameters.put("STATUS","PASS");
	         outputparameters.put("MESSAGE","Method Used:browserLaunch,Input Given:"+config.getBrowserName().toString());
	    }
	    catch(Exception e){
	    	 outputparameters.put("STATUS","FAIL");
	    	 outputparameters.put("MESSAGE","Method Used:browserLaunch,Input Given:"+config.getBrowserName().toString());
		}
	    return outputparameters;
     }
//SelectLanguage
	public static void selectLanguage() throws InterruptedException {
		if(config.getLanguageName().equalsIgnoreCase("En")){		
		    
			Object[] input4=new Object[1];
			input4[0]="(//*[@class='menu-arrow'])[18]";
			SeleniumOperations.actionClass(input4);
			
			
			Object[] input5=new Object[1];
			input5[0]="//*[@data-language='En']";
			SeleniumOperations.clickOnLogin(input5);
			
			Object[] input6=new Object[1];
			input6[0]="//*[@id='btnYesLocal']";
			SeleniumOperations.clickOnLogin(input6);
			Thread.sleep(2000);
			Object[] input7 = new Object[2];
			input7[0] ="//*[@id='span_lblHi_lc']";
			input7[1]="Hi";
			SeleniumOperations.validation(input7);
	      }
	      else if(config.getLanguageName().equalsIgnoreCase("Fr")) { 
	    	  Object[] input4=new Object[1];
	  		input4[0]="(//*[@class='menu-arrow'])[18]";
	  		SeleniumOperations.actionClass(input4);
	  		
	  		Object[] input5=new Object[1];
	  		input5[0]="//*[@data-language='Fr']";
	  		SeleniumOperations.clickOnLogin(input5);
	  		
	  		Object[] input6=new Object[1];
	  		input6[0]="//*[@id='btnYesLocal']";
	  		SeleniumOperations.clickOnLogin(input6);
	  		Thread.sleep(2000);
	  		Object[] input7 = new Object[2];
	  		input7[0] ="//*[@id='span_lblHi_lc']";
	  		input7[1]="Salut";
	  		SeleniumOperations.validation(input7);
	     
	      }
	      else if(config.getLanguageName().equalsIgnoreCase("Sw")) { 
	    	  Object[] input4=new Object[1];
	  		input4[0]="(//*[@class='menu-arrow'])[18]";
	  		SeleniumOperations.actionClass(input4);
	  		
	  		Object[] input5=new Object[1];
	  		input5[0]="//*[@data-language='Sw']";
	  		SeleniumOperations.clickOnLogin(input5);
	  		
	  		Object[] input6=new Object[1];
	  		input6[0]="//*[@id='btnYesLocal']";
	  		SeleniumOperations.clickOnLogin(input6);
	  		Thread.sleep(2000);
	  		Object[] input7 = new Object[2];
	  		input7[0] ="//*[@id='span_lblHi_lc']";
	  		input7[1]="Habari";
	  		SeleniumOperations.validation(input7);
	     
	      }
	}
//OpenApplication
	 public static Hashtable<String,Object> openApplication(){   
		 try {  
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		   driver.navigate().to(config.getApplicationUrl());
		  /* String textValue = driver.findElement(By.xpath("//*[text()='Session Expired.']")).getText();
		   String pass ="Session Expired.";
		   if(textValue==pass) {
			   driver.findElement(By.xpath("//a[@href='wfLogin.aspx']")).click();
               driver.findElement(By.xpath("//*[@id='usercode']")).sendKeys("PravinS");
               driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sp@12345");
               driver.findElement(By.xpath("//*[text()='Login']")).click();
		   }*/
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:openApplication, Input Given:"+config.getApplicationUrl());
	      }
	      catch(Exception e){
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:openApplication, Input Given:"+config.getApplicationUrl());
	      }
	      return outputparameters;
     }
	 
//SendUserID
     public static Hashtable<String,Object> sendUserId(Object[]inputparameters){   
	    try {
	      driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	      String strXpath=(String)inputparameters[0];
          driver.findElement(By.xpath(strXpath)).sendKeys(config.sendUserId());
          outputparameters.put("STATUS","PASS");
	      outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+config.sendUserId());
	    }
        catch(Exception e){
   	      outputparameters.put("STATUS","FAIL");
		  outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+config.sendUserId());
        }
        return outputparameters;
     }
	 
//SendPassword
     public static Hashtable<String,Object> sendPassword(Object[]inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
	       driver.findElement(By.xpath(strXpath)).sendKeys(config.sendPassword());
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+config.sendPassword());
	     }
	     catch(Exception e){
	   	   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+config.sendPassword());
	     }
	     return outputparameters;
     }
     
     //ClickOnLoginButton
     public static Hashtable<String,Object> clickOnLogin(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   driver.findElement(By.xpath(strXpath)).click();
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:clickOnElement, Input Given:"+inputparameters[0]);
	   /*  String test = driver.findElement(By.xpath("//*[text()='Session Expired.']")).getText();
		   System.out.println(test);
	     if(test.equalsIgnoreCase("Session Expired.")) {
			   driver.findElement(By.xpath("//*[@href='wfLogin.aspx']")).click();
			   driver.findElement(By.xpath("//*[@id='usercode']")).sendKeys(config.sendUserId());
			   driver.findElement(By.xpath("//*[@id='password']")).sendKeys(config.sendPassword());
			   driver.findElement(By.xpath("//*[text()='Login']")).click();
		   }*/
		 }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:clickOnElement, Input Given:"+inputparameters[0]);
	     }
	     return outputparameters;
     }

//SendKeys
     public static Hashtable<String,Object> sendKeys(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
	       driver.findElement(By.xpath(strXpath)).sendKeys(strvalue);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e){
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
     
//DynamicValuesSendKeys
     public static Hashtable<String,Object> DynamicValuessendKeys(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
		   if (strvalue.equalsIgnoreCase("CODE")) {
		        String code = "Code" + UUID.randomUUID().toString().substring(0, 8);
		        String value = code;


	       driver.findElement(By.xpath(strXpath)).sendKeys(value);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
		   }
		   }
	     catch(Exception e){
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
     
     
     
   //SendKeysVehRegistration
     public static Hashtable<String,Object> sendKeysVehRes(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
		   String vehicleNumber = strvalue; // Initial value
	        int number = Integer.parseInt(vehicleNumber.replaceAll("\\D", "")); // Extract the numeric part

	        number++; // Increment the number
	        vehicleNumber = "VEHICLE" + number; // Combine the prefix with the new number
		    
	       driver.findElement(By.xpath(strXpath)).sendKeys(vehicleNumber);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e){
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
     
	
//Click
     public static Hashtable<String,Object> clickOnElement(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   driver.findElement(By.xpath(strXpath)).click();
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:clickOnElement, Input Given:"+inputparameters[0]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:clickOnElement, Input Given:"+inputparameters[0]);
	     }
	     return outputparameters;
     }
     
 //DoubleClick
     public static Hashtable<String,Object> doubleClickOnElement(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   driver.findElement(By.xpath(strXpath)).click();
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:doubleClickOnElement, Input Given:"+inputparameters[0]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:doubleClickOnElement, Input Given:"+inputparameters[0]);
	     }
	     return outputparameters;
     }   
     
	
//Validation
     public static Hashtable<String,Object> validation(Object[] inputparameters){  
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String xpath=(String)inputparameters[0];
		   String givenText=(String)inputparameters[1];
		  // String statusText =(String)inputparameters[2];
		   String findText=driver.findElement(By.xpath(xpath)).getText();
		   System.out.println(findText);
		   
		   if(givenText.equalsIgnoreCase(findText)){
			 System.out.println("Test Case Pass");
			 outputparameters.put("STATUS","PASS");
			   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
		     
		   }
		   else {
			 System.out.println("Test Case Fail");
			 outputparameters.put("STATUS","FAIL");
			   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
		   }
		   }
		   
	     catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
//ValidationForAlert
     
     public static Hashtable<String,Object> validationForAlert(Object[] inputparameters){  
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String givenText=(String)inputparameters[0];
		   Alert pass=driver.switchTo().alert();
		   String findText = pass.getText();
		   //pass.accept();
		   System.out.println(findText);
		   
		   if(givenText.equalsIgnoreCase(findText)){
			 System.out.println("Test Case Pass");
			 outputparameters.put("STATUS","PASS");
			   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[0]);
		     
		   }
		   else {
			 System.out.println("Test Case Fail");
			 outputparameters.put("STATUS","FAIL");
			   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[0]);
		   }
		   }
		   
	     catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
     
//ValidationForenabledFields
     
     public static Hashtable<String,Object> validationForEnabledFields(Object[] inputparameters){  
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String Xpath=(String)inputparameters[0];
		  WebElement status = driver.findElement(By.xpath(Xpath));
		 boolean result = status.isEnabled();
		   
		 if (result) {
             System.out.println("✅ Passed: Selected field is enabled");
             outputparameters.put("STATUS","PASS");
    		   outputparameters.put("MESSAGE","Method Used:ValidateEnabled, Input Given:"+inputparameters[0]);
         } else {
             System.out.println("❌ Failed: Selected field is disabled");
             outputparameters.put("STATUS","FAIL");
  		   outputparameters.put("MESSAGE","Method Used:ValidateEnabled, Input Given:"+inputparameters[0]);
         }
		 }
		   
	     catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:ValidateEnabled, Input Given:"+inputparameters[0]);
	     }
	     return outputparameters;
     }
     
//ValidationForDisabledFields
     
     public static Hashtable<String,Object> validationForDisabledFields(Object[] inputparameters){  
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String Xpath=(String)inputparameters[0];
		  WebElement status = driver.findElement(By.xpath(Xpath));
		// Attribute extraction
		    String disabledAttr = status.getAttribute("disabled");
		    String ariaDisabledAttr = status.getAttribute("aria-disabled");

		    // Fallback to isEnabled()
		    boolean result = status.isEnabled();

		    // Inline condition without boolean variable
		    if ((disabledAttr != null) || "true".equalsIgnoreCase(ariaDisabledAttr) || !result) {
		        System.out.println("✅ Passed: Selected field is disabled");
		        outputparameters.put("STATUS", "PASS");
		        outputparameters.put("MESSAGE", "Method Used: ValidateDisabled, Input Given: " + inputparameters[0]);
		    } else {
		        System.out.println("❌ Failed: Selected field is enabled");
		        outputparameters.put("STATUS", "FAIL");
		        outputparameters.put("MESSAGE", "Method Used: ValidateDisabled, Input Given: " + inputparameters[0]);
		    }
		 }
		   
	     catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:ValidateDisabled, Input Given:"+inputparameters[0]);
	     }
	     return outputparameters;
     }
     
//ValidationForEmail
     
     public static Hashtable<String,Object> validationForEmail(Object[] inputparameters){  
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String Xpath1=(String)inputparameters[0];
		   String email=(String)inputparameters[1];
		   String Xpath2=(String)inputparameters[2];
		   String Xpath3=(String)inputparameters[3];
		   String givenText=(String)inputparameters[4];
		   
		   WebElement emailField = driver.findElement(By.xpath(Xpath1));
		   emailField.clear();
	        emailField.sendKeys(email);

	        // Submit the form (update selector if needed)
	        driver.findElement(By.xpath(Xpath2)).click();

	        // Wait for error/validation message (optional wait can be added)
	        String findText=driver.findElement(By.xpath(Xpath3)).getText();
			   System.out.println(findText);
			   
			   if(givenText.equalsIgnoreCase(findText)){
				 System.out.println("Test Case Pass");
				 outputparameters.put("STATUS","PASS");
				   outputparameters.put("MESSAGE","Method Used:validationEmail, Input Given:"+inputparameters[1]);
			     
			   }
			   else {
				 System.out.println("Test Case Fail");
				 outputparameters.put("STATUS","FAIL");
				   outputparameters.put("MESSAGE","Method Used:validationEmail, Input Given:"+inputparameters[1]);
			   }

	    
		 }
		   
	     catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:validationEmail, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }

//Actions Class	 
	 public static Hashtable<String,Object> actionClass(Object[] inputparameters) {
	     try {
		   String xpath=(String) inputparameters[0];
		   //driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   Actions act=new Actions(driver);
		   WebElement move = driver.findElement(By.xpath(xpath));
		   act.moveToElement(move).build().perform();
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:actionClass, Input Given:"+inputparameters[0]);
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:actionClass, Input Given:"+inputparameters[0]);
		 }
		 return outputparameters;
     }
		
//ActionsDownEnter
	 public static Hashtable<String,Object> actionDownEnter() {
		 try { 
		 //String xpath=(String) inputparameters[0];
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		 //driver.findElement(By.xpath(xpath));
		   Actions act=new Actions(driver);
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ARROW_DOWN).build().perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ENTER).build().perform();
		   Thread.sleep(2000);
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:actionDownEnter, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:actionDownEnter, Input Given:");
		 }
		 return outputparameters;
     }  
	 
	//SendActionsDownEnter
		 public static Hashtable<String,Object> SendActionDownEnter(Object[] inputparameters) {
			 try { 
			   String xpath=(String) inputparameters[0];
			   String value=(String) inputparameters[1];
			   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
			 WebElement sendxpath = driver.findElement(By.xpath(xpath));
			 sendxpath.sendKeys(value);
			   Actions act=new Actions(driver);
			   Thread.sleep(2000);
			   act.sendKeys(Keys.ARROW_DOWN).build().perform();
			   Thread.sleep(2000);
			   act.sendKeys(Keys.ENTER).build().perform();
			   Thread.sleep(2000);
			   outputparameters.put("STATUS","PASS");
			   outputparameters.put("MESSAGE","Method Used:actionDownEnter, Input Given:");
			 }
			 catch(Exception e) {
			   outputparameters.put("STATUS","FAIL");
			   outputparameters.put("MESSAGE","Method Used:actionDownEnter, Input Given:");
			 }
			 return outputparameters;
	     }  

//ActionsDoubleDownEnter	 
	 public static Hashtable<String,Object> actionDoubleDownEnter() {
		 try { 
		 //String xpath=(String) inputparameters[0];
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		 //driver.findElement(By.xpath(xpath));
		   Actions act=new Actions(driver);
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ARROW_DOWN).build().perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ARROW_DOWN).build().perform();
		   act.sendKeys(Keys.ENTER).build().perform();
		   Thread.sleep(2000);
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:actionDownEnter, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:actionDownEnter, Input Given:");
		 }
		 return outputparameters;
     }  
	
//HandleAlertMessage		 
     public static Hashtable<String,Object> alert() {   
    	 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   Alert pass=driver.switchTo().alert();
		   pass.accept();
		 }
		 catch(Exception e) {
		   System.out.println(e);
		 }
		 return outputparameters;
     }
		 
//ScrollUp
     public static Hashtable<String,Object> scrollUp() {
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,-750)");
		   js.executeScript("window.scrollBy(0,250");
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:scrollUp, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:scrollUp, Input Given:");
		 }
	     return outputparameters;
     }
		 
//Select date
     public static Hashtable<String, Object> date (Object[] inputParameters) {
		 try {
		   String xpath1=(String) inputParameters[0];
		   String xpath2=(String) inputParameters[1];
		   String xpath3=(String) inputParameters[2];
		   String xpath4=(String) inputParameters[3];
		   String xpath5=(String) inputParameters[4];
		   String xpath6=(String) inputParameters[5];
		 //Click on calender symbol
		   driver.findElement(By.xpath(xpath1)).click();
		 //Select Date of birth
		   driver.findElement(By.xpath(xpath2)).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath(xpath3)).click();
		 //Click On Year
		   driver.findElement(By.xpath(xpath4)).click();
		   Thread.sleep(2000);
		 //Select month
		   driver.findElement(By.xpath(xpath5)).click();
		   Thread.sleep(2000);
		 //Select Day
		   driver.findElement(By.xpath(xpath6)).click();
		   Thread.sleep(2000);
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 return outputparameters;
     }
		 
//Scrolldown		 
     public static Hashtable<String,Object> scrolldown() {
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='modal-content'])[3]")));
		   JavascriptExecutor down=(JavascriptExecutor) driver;
		   //down.executeScript("window.scrollBy(0,1500)");//1050
		   down.executeScript("arguments[0].scrollTop += 300", popup);
		   Thread.sleep(2000);
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 return outputparameters;
     }
     
     public static void enter() {
    	 Actions actions = new Actions(driver);
    	 WebElement element = driver.findElement(By.xpath("//*[@id='btnSave']"));
    	 actions.moveToElement(element).click().perform();

     }
		 
//ClearAndEnter
     public static Hashtable<String,Object> clearAndEnter(Object[]inputparameters) {   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
	       WebElement remove=driver.findElement(By.xpath(strXpath));
	       remove.clear();
	       Thread.sleep(2000);
	       remove.click();
	       Thread.sleep(2000);
	       remove.sendKeys(strvalue);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
     
   //Clear
     public static Hashtable<String,Object> clear(Object[]inputparameters) {   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
	       WebElement remove=driver.findElement(By.xpath(strXpath));
	       remove.clear();
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:clear, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:clear, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
		 
//Iframe
     public static Hashtable<String,Object> iFrameEnter(Object[]inputparameters) {   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
		   driver.switchTo().frame(0);
	       WebElement send=driver.findElement(By.xpath(strXpath));
	       send.clear();
	       Thread.sleep(2000);
	       send.click();
	       send.sendKeys(strvalue);
	       Thread.sleep(2000);
	       driver.switchTo().defaultContent();
	       Thread.sleep(2000);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     } 
		 
//Switch Window 		
     public static void transfer() {
		 ((JavascriptExecutor)driver).executeScript("window.open()");
         ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
         driver.switchTo().window(tab.get(0));
     }	

//Open New Tab
     public static void tab() {
		 ((JavascriptExecutor)driver).executeScript("window.open()");
		  ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
     }

//DropDown
     public static Hashtable<String,Object> dropdown(Object[] inputparameters) {   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String clickXpath = (String)inputparameters[0];
		   driver.findElement(By.xpath(clickXpath)).click();
	 		//wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(waitTill)));

		 
		   Thread.sleep(2000);
		   String sendXpath = (String)inputparameters[1];
		   String sendValue = (String)inputparameters[2];
		   WebElement sendText = driver.findElement(By.xpath(sendXpath));
		   sendText.clear();
		   sendText.sendKeys(sendValue);
		   String selectXpath = (String)inputparameters[3];
		   driver.findElement(By.xpath(selectXpath)).click();
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:Dropdown, Input Given:"+inputparameters[2]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:Dropdown, Input Given:"+inputparameters[2]);
	     }
	     return outputparameters;
     }
     
  //Dropdown Options Client
     
     public static Hashtable<String, Object> dropdownOptions(Object[] inputparameters) {
    	 
    	 try{
    		 String clickXpath = (String)inputparameters[0];
    	 
    	 String sendXpath = (String)inputparameters[1];
    	// Locate the dropdown element
         WebElement genderDropdown = driver.findElement(By.xpath(clickXpath));
         


         // Hover/click using Actions class (optional interaction)
         Actions actions = new Actions(driver);
         actions.moveToElement(genderDropdown).click().perform();
         
    	 // Get all dropdown <option> elements
         List<WebElement> optionElements = genderDropdown.findElements(By.xpath(sendXpath));

         List<String> actualOptions = new ArrayList<>();
         for (WebElement option : optionElements) {
             String text = option.getText().trim();
            // System.out.println("Found: [" + text + "]");

             // Skip placeholder like "Please Select"
             if (!text.equalsIgnoreCase("Please Select") && !text.isEmpty()) {
                 actualOptions.add(text);
             }
         }

         // Expected options
         List<String> expectedOptions = Arrays.asList("Male","Female","Other");

      // Sort both lists before comparing
         Collections.sort(actualOptions);
         Collections.sort(expectedOptions);

         System.out.println("Actual (normalized & sorted): " + actualOptions);
         System.out.println("Expected (normalized & sorted): " + expectedOptions);

         if (actualOptions.equals(expectedOptions)) {
             System.out.println("✅ Dropdown options are correct.");
             outputparameters.put("STATUS","PASS");
  		   outputparameters.put("MESSAGE","Method Used:Dropdown, Input Given:"+inputparameters[1]);
         } else {
             System.out.println("❌ Dropdown options are incorrect.");
             outputparameters.put("STATUS","FAIL");
    		   outputparameters.put("MESSAGE","Method Used:Dropdown, Input Given:"+inputparameters[1]);
         }
         
    	 }
    	 catch(Exception e) {
  	       outputparameters.put("STATUS","FAIL");
  		   outputparameters.put("MESSAGE","Method Used:Dropdown, Input Given:"+inputparameters[1]);
  	     }
		return outputparameters;

     }
     
 
    	
     
//ValidateDOB
public static Hashtable<String, Object> validateDob(Object[] inputparameters) {
    	 
    	 try{
    		// Format today's date dynamically
    		 String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
    		 String clickXpath = (String)inputparameters[0];
    		 String expectedResult = (String)inputparameters[1];
    		 
    		 WebElement dobField = driver.findElement(By.xpath(clickXpath)); // Replace with actual locator
    		    String fieldValue = dobField.getAttribute("value").trim();
    		    boolean fieldIsToday = fieldValue.equals(today);

    	        System.out.println("\n🔍 Expected Result from Cucumber: " + expectedResult);
    	        System.out.println("📅 Field Value: " + fieldValue);
    	        System.out.println("📆 Today Date : " + today);

    	        if (expectedResult.equalsIgnoreCase("valid")) {
    	            if (!fieldIsToday) {
    	                System.out.println("✅ Passed: Valid input retained.");
    	                outputparameters.put("STATUS","PASS");
    	       		   outputparameters.put("MESSAGE","Method Used:ValidateDOB, Input Given:"+inputparameters[1]);
    	            } else {
    	                System.out.println("❌ Failed: Valid input was wrongly replaced with today's date.");
    	                outputparameters.put("STATUS","FAIL");
    	     		   outputparameters.put("MESSAGE","Method Used:ValidateDOB, Input Given:"+inputparameters[1]);
    	            }
    	        } else if (expectedResult.equalsIgnoreCase("invalid")) {
    	            if (fieldIsToday) {
    	                System.out.println("✅ Passed: Invalid input replaced with today's date.");
    	                outputparameters.put("STATUS","PASS");
    	       		   outputparameters.put("MESSAGE","Method Used:ValidateDOB, Input Given:"+inputparameters[1]);
    	            } else {
    	                System.out.println("❌ Failed: Invalid input was not corrected.");
    	                outputparameters.put("STATUS","FAIL");
    	     		   outputparameters.put("MESSAGE","Method Used:ValidateDOB, Input Given:"+inputparameters[1]);
    	            }
    	        } else {
    	            System.out.println("⚠️ Invalid expectedResult value provided: " + expectedResult);
    	        }
    	    
    	
    	 }
    	 catch(Exception e) {
    	       outputparameters.put("STATUS","FAIL");
    		   outputparameters.put("MESSAGE","Method Used:Dropdown, Input Given:"+inputparameters[0]);
    	     }
  		return outputparameters;
    	 }

//ValidateDOB
public static Hashtable<String, Object> sendDate(Object[] inputparameters) {
  	 
  	 try{
  		// Format today's date dynamically
  		 String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
  		 String strXpath = (String)inputparameters[0];
  		 driver.findElement(By.xpath(strXpath)).clear();
  		 driver.findElement(By.xpath(strXpath)).sendKeys(today);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendDate, Input Given:"+inputparameters[1]);
	     
  		
  	 }
  	 catch(Exception e) {
  	       outputparameters.put("STATUS","FAIL");
  		   outputparameters.put("MESSAGE","Method Used:sendDate, Input Given:"+inputparameters[0]);
  	     }
		return outputparameters;
  	 }

//Navigate Back		 
     public static Hashtable<String,Object> navigateBack() {   
   		 try {
   		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
   		   driver.navigate().back();
   	    // outputparameters.put("STATUS","Pass");
   		// outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
   	     }
   	     catch(Exception e) {
   	     //outputparameters.put("STATUS","Fail");
   	     //outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
   	     }
   	     return outputparameters;
     } 
     
//OpenApplicationOfInsurer
     public static Hashtable<String,Object> openApplicationinsurer(Object[]inputparameters) {   
	     try {  
	       driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	       String strXpath=(String)inputparameters[0]; 
	       driver.navigate().to(strXpath);
	       outputparameters.put("STATUS","Pass");
	       outputparameters.put("MESSAGE","Method Used:openApplication, Input Given:"+config.getApplicationUrl());
         }
         catch(Exception e) {
    	   outputparameters.put("STATUS","Fail");
		   outputparameters.put("MESSAGE","Method Used:openApplication, Input Given:"+config.getApplicationUrl());
         }
         return outputparameters;
     }
     
//ScrollUp450
     public static Hashtable<String,Object> scrollUp450() {
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,-150)");
	       outputparameters.put("STATUS","Pass");
		   outputparameters.put("MESSAGE","Method Used:scrollUp, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","Fail");
		   outputparameters.put("MESSAGE","Method Used:scrollUp, Input Given:");
		 }
		 return outputparameters;
	 }
     
     
     
     public static Hashtable<String, Object> calculations(Object[]inputparameters){
    	
    	String input1 = (String)inputparameters[0];
    	String input2 = (String)inputparameters[1]; 
    	
    	String  sumInsuredValue=driver.findElement(By.xpath(input1)).getText();
    	 System.out.println(sumInsuredValue);
    	 
    	 String  rateValue=driver.findElement(By.xpath(input2)).getText();
    	 System.out.println(rateValue);
    	// Assertions.assertEquals(sumInsuredValue, rateValue);
		return outputparameters; 
    	 
    	 
     }
     

     
//printReport     
     
     public static Hashtable<String, Object> printReport() throws IOException {
    	try {

    	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);

    	Set<String> ids1 = driver.getWindowHandles();
    	
    	Iterator<String> values = ids1.iterator();    
    	String one = values.next();
    	String two = values.next();
    	
        driver.switchTo().window(two);
    	
    	String url = driver.getCurrentUrl();
    	System.out.println(url);
    	 
    	URL pdfUrl = new URL(url);
    	
    	URLConnection urlConnection = pdfUrl.openConnection();
    	urlConnection.addRequestProperty("User-Agent", "Chrome");
    	InputStream id = urlConnection.getInputStream();
    	
    	BufferedInputStream bufferedInput = new BufferedInputStream(id);
    	
    	System.out.println("==========Print Page Number Of Pdf==========");
    	PDDocument pdDocument = PDDocument.load(bufferedInput);
    	int pages = pdDocument.getNumberOfPages();
    	System.out.println("Number Of Pages In PDF"+" "+pages);
        System.out.println("==========End==========");
        //.load(bufferedInput);
        PDFTextStripper text = new PDFTextStripper();
        String printText = text.getText(pdDocument);
        System.out.println("==========Print PDF Text==========");
        System.out.println("PDF Text" +" "+printText);
        System.out.println("==========End==========");
      
       outputparameters.put("STATUS","Pass");

	   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
    	}
    	catch(Exception e) {
   		 outputparameters.put("STATUS","Fail");
 		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
    	}
		return outputparameters;
 		 	 
   	 }
    	
//printQuote     
        
       /* public static Hashtable<String, Object> printQuote(Object[] inputparameters) throws IOException {
       	try {

       	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
       	String fieldName = ((String) inputparameters[0]).trim();
        System.out.println(fieldName);
        // 💡 Step 1: Get Client Name from UI before switching to PDF tab
       	String getClientName = driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[3]")).getText(); 
       	String ClientNameFromUI =getClientName.toUpperCase();
       	//System.out.println("🔍 Client Name from UI: " + ClientNameFromUI);
        
       	// 💡 Step 2: Get quote number from UI before switching to PDF tab
       	String quoteNumberFromUI = driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[2]/*[1]")).getText(); 
       	//System.out.println("🔍 Quote Number from UI: " + quoteNumberFromUI);
        
       	// 💡 Step 3: Get amount payable from UI before switching to PDF tab
       	String amountPayableFromUI = driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[7]/*[1]")).getText(); 
       	//System.out.println("🔍 Amount Payable from UI: " + amountPayableFromUI);
        
       	// 💡 Step 4: Get insurance type from UI before switching to PDF tab
       	String getInsuranceType = driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[4]")).getText(); 
       	String InsuranceTypeFromUI =getInsuranceType.toUpperCase();
       	//System.out.println("🔍 Insurance Type from UI: " + InsuranceTypeFromUI);
       	
       	Set<String> ids1 = driver.getWindowHandles();
       	
       	Iterator<String> values = ids1.iterator();    
       	String one = values.next();
       	String two = values.next();
       	
           driver.switchTo().window(two);
       	
       	String url = driver.getCurrentUrl();
       	System.out.println(url);
       	 
       	URL pdfUrl = new URL(url);
       	
       	URLConnection urlConnection = pdfUrl.openConnection();
       	urlConnection.addRequestProperty("User-Agent", "Chrome");
       	InputStream id = urlConnection.getInputStream();
       	
       	BufferedInputStream bufferedInput = new BufferedInputStream(id);
       	
       	System.out.println("==========Print Page Number Of Pdf==========");
       	PDDocument pdDocument = PDDocument.load(bufferedInput);
       	int pages = pdDocument.getNumberOfPages();
       	System.out.println("Number Of Pages In PDF"+" "+pages);
           System.out.println("==========End==========");
           //.load(bufferedInput);
           PDFTextStripper text = new PDFTextStripper();
           String printText = text.getText(pdDocument);
           System.out.println("==========Print PDF Text==========");
           System.out.println("PDF Text" +" "+printText);
           System.out.println("==========End==========");
           Thread.sleep(5000);
        // ✅ Add validations here
           String expectedClientName = ClientNameFromUI;
           String expectedQuoteNumber =quoteNumberFromUI;
           String expectedAmountPayable =amountPayableFromUI;
           String expectedInsuranceType =InsuranceTypeFromUI;
           // 🟡 Step 3: Field Name passed as input
         /*  String fieldName0 = ((String) inputparameters[1]).trim();
           System.out.println(fieldName0);
           String fieldName1 = ((String) inputparameters[2]).trim();
           System.out.println(fieldName1);
           String fieldName2 = ((String) inputparameters[3]).trim();
           System.out.println(fieldName2);
           String fieldName3 = ((String) inputparameters[4]).trim();
           System.out.println(fieldName3);

           
       
      
        // ClientName
           if (fieldName.contains("Client Name")) {
           if (printText.contains(expectedClientName)) {
               System.out.println("✅ Client Name found in PDF: " + expectedClientName);
               outputparameters.put("STATUS","Pass");
       	       outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           } else {
               
               outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
    		   System.out.println("❌ Client Name NOT found in PDF");
           }
           }
           
        // QuoteNumber
           if (fieldName.contains("Quote Number")) {
           if (printText.contains(expectedQuoteNumber)) {
               System.out.println("✅ Quote Number found in PDF: " + expectedQuoteNumber);
               outputparameters.put("STATUS","Pass");
       	       outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           } else {
               System.out.println("❌ Quote Number NOT found in PDF");
               outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           }
           }
           
        // AmountPayable
           if (fieldName.contains("Premium Amount")) {
           if (printText.contains(expectedAmountPayable)) {
               System.out.println("✅ AmountPayable found in PDF: " + expectedAmountPayable);
               outputparameters.put("STATUS","Pass");
       	       outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           } else {
               System.out.println("❌ AmountPayable NOT found in PDF");
               outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           }
           }
           
        // InsuranceType
           if (fieldName.contains("Insurance Type")) {
           if (printText.contains(expectedInsuranceType)) {
               System.out.println("✅ Insurance Type found in PDF: " + expectedInsuranceType);
               outputparameters.put("STATUS","Pass");
       	       outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           } else {
               System.out.println("❌ Insurance Type NOT found in PDF");
               outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           }
           }
          
       	}
       	catch(Exception e) {
      		 outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
    		 	 
      	 }

	   
		return outputparameters;
     
     }*/
     
     public static Hashtable<String, Object> printQuote(Object[] inputparameters) throws IOException {
    	    Hashtable<String, Object> outputparameters = new Hashtable<>();

    	    try {
    	        driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);

    	        String fieldName = ((String) inputparameters[0]).trim();
    	        //System.out.println("🔍 Checking field: " + fieldName);

    	        // ✅ Store current (main) window
    	        String mainWindow = driver.getWindowHandle();

    	        // ✅ Get expected values from UI BEFORE switching to PDF
    	        Map<String, String> expectedValues = new HashMap<>();
    	        expectedValues.put("Client Name", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[3]")).getText().toUpperCase());
    	        expectedValues.put("Quote Number", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[2]/*[1]")).getText());
    	        expectedValues.put("Premium Amount", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[7]/*[1]")).getText());
    	        expectedValues.put("Insurance Type", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[4]")).getText().toUpperCase());

    	        // ✅ Now switch to PDF tab
    	        Set<String> ids = driver.getWindowHandles();
    	        for (String id : ids) {
    	            if (!id.equals(mainWindow)) {
    	                driver.switchTo().window(id);
    	                break;
    	            }
    	        }

    	        // ✅ Read PDF
    	        URL pdfUrl = new URL(driver.getCurrentUrl());
    	        URLConnection urlConnection = pdfUrl.openConnection();
    	        urlConnection.addRequestProperty("User-Agent", "Chrome");

    	        try (InputStream id = urlConnection.getInputStream();
    	             BufferedInputStream bufferedInput = new BufferedInputStream(id);
    	             PDDocument pdDocument = PDDocument.load(bufferedInput)) {

    	            String printText = new PDFTextStripper().getText(pdDocument);

    	            // ✅ Compare current field
    	            String expectedValue = expectedValues.get(fieldName);
    	            if (expectedValue != null && printText.contains(expectedValue)) {
    	                System.out.println("✅ " + fieldName + " found in PDF: " + expectedValue);
    	                outputparameters.put("STATUS", "Pass");
    	                outputparameters.put("MESSAGE", "Field '" + fieldName + "' is present in PDF with value: " + expectedValue);
    	            } else {
    	                System.out.println("❌ " + fieldName + " NOT found in PDF");
    	                outputparameters.put("STATUS", "Fail");
    	                outputparameters.put("MESSAGE", "Field '" + fieldName + "' is missing or value mismatch in PDF");
    	            }
    	        }

    	        // ✅ Switch back to main tab for next field
    	        driver.switchTo().window(mainWindow);

    	    } catch (Exception e) {
    	        e.printStackTrace();
    	        outputparameters.put("STATUS", "Fail");
    	        outputparameters.put("MESSAGE", "Exception in printQuote: " + e.getMessage());
    	    }

    	    return outputparameters;
    	}
     
   /*  public static Hashtable<String, Object> printRiskNote(Object[] inputparameters) throws IOException {
 	    Hashtable<String, Object> outputparameters = new Hashtable<>();

 	    try {
 	        driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);

 	        String fieldName = ((String) inputparameters[0]).trim();
 	        //System.out.println("🔍 Checking field: " + fieldName);

 	        // ✅ Store current (main) window
 	        String mainWindow = driver.getWindowHandle();

 	    
 	        // ✅ Get expected values from UI BEFORE switching to PDF
 	        Map<String, String> expectedValues = new HashMap<>();
 	        expectedValues.put("Risk Note No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[2]/*[1]")).getText().toUpperCase());
 	        expectedValues.put("Cover Note No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[2]/*[3]")).getText());
 	        expectedValues.put("Insured Name", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[4]")).getText());
 	        expectedValues.put("Insurance Type", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[5]")).getText());

 	    
 	        // ✅ Now switch to PDF tab
 	        Set<String> ids = driver.getWindowHandles();
 	        for (String id : ids) {
 	            if (!id.equals(mainWindow)) {
 	                driver.switchTo().window(id);
 	                break;
 	            }
 	        }

 	        // ✅ Read PDF
 	        URL pdfUrl = new URL(driver.getCurrentUrl());
 	        URLConnection urlConnection = pdfUrl.openConnection();
 	        urlConnection.addRequestProperty("User-Agent", "Chrome");

 	        try (InputStream id = urlConnection.getInputStream();
 	             BufferedInputStream bufferedInput = new BufferedInputStream(id);
 	             PDDocument pdDocument = PDDocument.load(bufferedInput)) {

 	            String printText = new PDFTextStripper().getText(pdDocument);

 	            // ✅ Compare current field
 	            String expectedValue = expectedValues.get(fieldName);
 	            if (expectedValue != null && printText.contains(expectedValue)) {
 	                System.out.println("✅ " + fieldName + " found in PDF: " + expectedValue);
 	                outputparameters.put("STATUS", "Pass");
 	                outputparameters.put("MESSAGE", "Field '" + fieldName + "' is present in PDF with value: " + expectedValue);
 	            } else {
 	                System.out.println("❌ " + fieldName + " NOT found in PDF");
 	                outputparameters.put("STATUS", "Fail");
 	                outputparameters.put("MESSAGE", "Field '" + fieldName + "' is missing or value mismatch in PDF");
 	            }
 	        }

 	        // ✅ Switch back to main tab for next field
 	        driver.switchTo().window(mainWindow);

 	    } catch (Exception e) {
 	        e.printStackTrace();
 	        outputparameters.put("STATUS", "Fail");
 	        outputparameters.put("MESSAGE", "Exception in printQuote: " + e.getMessage());
 	    }

 	    return outputparameters;
 	}*/

     public static Hashtable<String, Object> printRiskNote(Object[] inputparameters) throws IOException {
    	    Hashtable<String, Object> outputparameters = new Hashtable<>();

    	    try {
    	        driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);

    	        String fieldName = ((String) inputparameters[0]).trim();
    	        String premiumXpath = ((String)inputparameters[1]);
    	        String totalReceivableXpath = ((String)inputparameters[2]);
    	        String vatAmountXpath = ((String)inputparameters[3]);

    	        // ✅ Store current (main) window
    	        String mainWindow = driver.getWindowHandle();

    	        // ✅ Get expected values from UI BEFORE switching to PDF
    	        Map<String, String> expectedValues = new HashMap<>();
    	        expectedValues.put("Risk Note No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[2]/*[1]")).getText().toUpperCase());
    	        expectedValues.put("Cover Note No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[2]/*[3]")).getText());
    	        expectedValues.put("Date Of Issue", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[3]/*[1]")).getText());
    	        expectedValues.put("Policy No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[3]/*[3]")).getText());
    	        expectedValues.put("Insurer", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[7]")).getText());
    	        expectedValues.put("Insured Name", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[4]")).getText());
    	        expectedValues.put("Insurance Type", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[5]")).getText());

    	        Thread.sleep(2000);
    	        // ✅ Step 1: Click on Display icon
    	        WebElement displayIcon = driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[10]/*[4]")); 
    	        displayIcon.click();
    	        Thread.sleep(2000);

    	        // ✅ Step 2: Capture values from Display screen
    	        String premiumValue = driver.findElement(By.xpath(premiumXpath)).getAttribute("value");
    	        expectedValues.put("Premium", premiumValue);
    	        String totalReceivable = driver.findElement(By.xpath(totalReceivableXpath)).getAttribute("value");
    	        expectedValues.put("Total Receivable", totalReceivable);
    	        String vatAmount = driver.findElement(By.xpath(vatAmountXpath)).getAttribute("value");
    	        expectedValues.put("VAT Amount", vatAmount);
    	        Thread.sleep(2000);
    	        // ✅ Step 3: Close the display popup
    	        WebElement closeBtn = driver.findElement(By.xpath("//*[@id='btnCancel']"));
    	        closeBtn.click();

    	        // ✅ Step 4: Switch to PDF tab
    	        Set<String> ids = driver.getWindowHandles();
    	        for (String id : ids) {
    	            if (!id.equals(mainWindow)) {
    	                driver.switchTo().window(id);
    	                break;
    	            }
    	        }

    	        // ✅ Read PDF
    	        URL pdfUrl = new URL(driver.getCurrentUrl());
    	        URLConnection urlConnection = pdfUrl.openConnection();
    	        urlConnection.addRequestProperty("User-Agent", "Chrome");

    	        try (InputStream id = urlConnection.getInputStream();
    	             BufferedInputStream bufferedInput = new BufferedInputStream(id);
    	             PDDocument pdDocument = PDDocument.load(bufferedInput)) {

    	            String printText = new PDFTextStripper().getText(pdDocument);
    	         // ✅ Compare current field (PDF vs Expected Value)
    	            String expectedValue = expectedValues.get(fieldName);

    	         // 🚀 Special handling for VAT
    	            if (fieldName.equalsIgnoreCase("VAT Amount")) {
    	                if (expectedValue == null || expectedValue.trim().isEmpty() 
    	                    || expectedValue.trim().equals("0") 
    	                    || expectedValue.trim().equalsIgnoreCase("0.00")) {

    	                    System.out.println("⚠️ Skipping VAT check (not applicable / zero VAT)");
    	                    outputparameters.put("STATUS", "Skip");
    	                    outputparameters.put("MESSAGE", "VAT validation skipped since VAT = " + expectedValue);

    	                    // 🔥 Instead of stopping execution, just skip this field
    	                    // 👉 Works only if this code is inside a loop like: for(String fieldName : expectedValues.keySet()) {...}
    	                }
    	            }
    	            
    	         // 🚀 Special handling for CoverNote Number
    	            if (fieldName.equalsIgnoreCase("Cover Note No")) {
    	                if (expectedValue == null || expectedValue.trim().isEmpty() 
    	                    || expectedValue.trim().equals("0") 
    	                    || expectedValue.trim().equalsIgnoreCase("0.00")) {

    	                    System.out.println("⚠️ Skipping VAT check (not applicable / zero VAT)");
    	                    outputparameters.put("STATUS", "Skip");
    	                    outputparameters.put("MESSAGE", "VAT validation skipped since VAT = " + expectedValue);

    	                    // 🔥 Instead of stopping execution, just skip this field
    	                    // 👉 Works only if this code is inside a loop like: for(String fieldName : expectedValues.keySet()) {...}
    	                }
    	            }

    	            if (expectedValue != null) {
    	                // Normalize expected value (remove extra spaces, unify case, remove special chars for fuzzy match)
    	                String normalizedExpected = expectedValue.trim()
    	                                                         .replaceAll("\\s+", " ")   // collapse multiple spaces
    	                                                         .toUpperCase();

    	                // 🔥 Split PDF into lines
    	                String[] pdfLines = printText.split("\\r?\\n");
    	                boolean matchFound = false;

    	                for (String line : pdfLines) {
    	                    // Normalize PDF line
    	                    String normalizedLine = line.trim()
    	                                                .replaceAll("\\s+", " ")   // collapse spaces
    	                                                .toUpperCase();

    	                    // Debug print
    	                   // System.out.println("📄 PDF Line: [" + line + "]");

    	                    // 1️⃣ Exact match
    	                    if (normalizedLine.equals(normalizedExpected)) {
    	                        matchFound = true;
    	                        break;
    	                    }

    	                    // 2️⃣ Contains match (handles multi-line or label+value cases)
    	                    if (normalizedLine.contains(normalizedExpected)) {
    	                        matchFound = true;
    	                        break;
    	                    }

    	                    // 3️⃣ Regex whole word match (avoid partial matches like "1234" inside "123456")
    	                    if (normalizedLine.matches(".*\\b" + java.util.regex.Pattern.quote(normalizedExpected) + "\\b.*")) {
    	                        matchFound = true;
    	                        break;
    	                    }

    	                    // 4️⃣ Number-only comparison (ignore commas, decimals, currency symbols)
    	                    String digitsExpected = normalizedExpected.replaceAll("[^0-9A-Za-z]", "");
    	                    String digitsLine = normalizedLine.replaceAll("[^0-9A-Za-z]", "");
    	                    if (!digitsExpected.isEmpty() && digitsExpected.equalsIgnoreCase(digitsLine)) {
    	                        matchFound = true;
    	                        break;
    	                    }
    	                }

    	                if (matchFound) {
    	                    System.out.println("✅ " + fieldName + " found in PDF: " + expectedValue);
    	                    outputparameters.put("STATUS", "Pass");
    	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is present in PDF with value: " + expectedValue);
    	                } else {
    	                    System.out.println("❌ " + fieldName + " NOT found in PDF (all match strategies failed)");
    	                    outputparameters.put("STATUS", "Fail");
    	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is missing or mismatch in PDF. Expected: " + expectedValue);
    	                }
    	            } else {
    	                System.out.println("⚠️ Expected value for " + fieldName + " not found in map");
    	            }

    	            
    	        }

    	        // ✅ Switch back to main tab
    	        driver.switchTo().window(mainWindow);

    	    } catch (Exception e) {
    	        e.printStackTrace();
    	        outputparameters.put("STATUS", "Fail");
    	        outputparameters.put("MESSAGE", "Exception in printQuote: " + e.getMessage());
    	    }

    	    return outputparameters;
    	}
     
     public static Hashtable<String, Object> printClaimReport(Object[] inputparameters) throws IOException {
 	    Hashtable<String, Object> outputparameters = new Hashtable<>();

 	    try {
 	        driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);

 	        String fieldName = ((String) inputparameters[0]).trim();
 	        String typeOfPolicyXpath = ((String)inputparameters[1]);
 	        String policyNoXpath = ((String)inputparameters[2]);
 	        String sumInsuredXpath = ((String)inputparameters[3]);

 	        // ✅ Store current (main) window
 	        String mainWindow = driver.getWindowHandle();

 	        // ✅ Get expected values from UI BEFORE switching to PDF
 	        Map<String, String> expectedValues = new HashMap<>();
 	        expectedValues.put("System Claim No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[1]")).getText().toUpperCase());
 	        expectedValues.put("Risk Note No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[3]")).getText());
 	        expectedValues.put("CoverNote No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[4]")).getText());
 	        expectedValues.put("Claimant Name", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[5]")).getText());

 	        Thread.sleep(2000);
 	        // ✅ Step 1: Click on Display icon
 	        WebElement displayIcon = driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[1]")); 
 	        displayIcon.click();
 	        Thread.sleep(5000);
 	        
 	       JavascriptExecutor down=(JavascriptExecutor) driver;
		   down.executeScript("window.scrollBy(0,1000)");//1050

 	        // ✅ Step 2: Capture values from Display screen
		   WebElement policyElement = driver.findElement(By.xpath(typeOfPolicyXpath));
		   String typeOfPolicy = policyElement.getText().trim();
		   expectedValues.put("Type Of Policy", typeOfPolicy);
 	        String policyNo = driver.findElement(By.xpath(policyNoXpath)).getAttribute("value");
 	        expectedValues.put("Policy No", policyNo);
 	        String sumInsured = driver.findElement(By.xpath(sumInsuredXpath)).getAttribute("value");
 	        expectedValues.put("Sum Insured", sumInsured);
 	        
 	        Thread.sleep(2000);
 	        // ✅ Step 3: Close the display popup
 	        WebElement closeBtn = driver.findElement(By.xpath("//*[@id='btnCancel']"));
 	        closeBtn.click();

 	        // ✅ Step 4: Switch to PDF tab
 	        Set<String> ids = driver.getWindowHandles();
 	        for (String id : ids) {
 	            if (!id.equals(mainWindow)) {
 	                driver.switchTo().window(id);
 	                break;
 	            }
 	        }

 	        // ✅ Read PDF
 	        URL pdfUrl = new URL(driver.getCurrentUrl());
 	        URLConnection urlConnection = pdfUrl.openConnection();
 	        urlConnection.addRequestProperty("User-Agent", "Chrome");

 	        try (InputStream id = urlConnection.getInputStream();
 	             BufferedInputStream bufferedInput = new BufferedInputStream(id);
 	             PDDocument pdDocument = PDDocument.load(bufferedInput)) {

 	            String printText = new PDFTextStripper().getText(pdDocument);
 	         // ✅ Compare current field (PDF vs Expected Value)
 	            String expectedValue = expectedValues.get(fieldName);

 	         
 	            if (expectedValue != null) {
 	                // Normalize expected value (remove extra spaces, unify case, remove special chars for fuzzy match)
 	                String normalizedExpected = expectedValue.trim()
 	                                                         .replaceAll("\\s+", " ")   // collapse multiple spaces
 	                                                         .toUpperCase();

 	                // 🔥 Split PDF into lines
 	                String[] pdfLines = printText.split("\\r?\\n");
 	                boolean matchFound = false;

 	                for (String line : pdfLines) {
 	                    // Normalize PDF line
 	                    String normalizedLine = line.trim()
 	                                                .replaceAll("\\s+", " ")   // collapse spaces
 	                                                .toUpperCase();

 	                    // Debug print
 	                   // System.out.println("📄 PDF Line: [" + line + "]");

 	                    // 1️⃣ Exact match
 	                    if (normalizedLine.equals(normalizedExpected)) {
 	                        matchFound = true;
 	                        break;
 	                    }

 	                    // 2️⃣ Contains match (handles multi-line or label+value cases)
 	                    if (normalizedLine.contains(normalizedExpected)) {
 	                        matchFound = true;
 	                        break;
 	                    }

 	                    // 3️⃣ Regex whole word match (avoid partial matches like "1234" inside "123456")
 	                    if (normalizedLine.matches(".*\\b" + java.util.regex.Pattern.quote(normalizedExpected) + "\\b.*")) {
 	                        matchFound = true;
 	                        break;
 	                    }

 	                    // 4️⃣ Number-only comparison (ignore commas, decimals, currency symbols)
 	                    String digitsExpected = normalizedExpected.replaceAll("[^0-9A-Za-z]", "");
 	                    String digitsLine = normalizedLine.replaceAll("[^0-9A-Za-z]", "");
 	                    if (!digitsExpected.isEmpty() && digitsExpected.equalsIgnoreCase(digitsLine)) {
 	                        matchFound = true;
 	                        break;
 	                    }
 	                }

 	                if (matchFound) {
 	                    System.out.println("✅ " + fieldName + " found in PDF: " + expectedValue);
 	                    outputparameters.put("STATUS", "Pass");
 	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is present in PDF with value: " + expectedValue);
 	                } else {
 	                    System.out.println("❌ " + fieldName + " NOT found in PDF (all match strategies failed)");
 	                    outputparameters.put("STATUS", "Fail");
 	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is missing or mismatch in PDF. Expected: " + expectedValue);
 	                }
 	            } else {
 	                System.out.println("⚠️ Expected value for " + fieldName + " not found in map");
 	            }

 	            
 	        }

 	        // ✅ Switch back to main tab
 	        driver.switchTo().window(mainWindow);

 	    } catch (Exception e) {
 	        e.printStackTrace();
 	        outputparameters.put("STATUS", "Fail");
 	        outputparameters.put("MESSAGE", "Exception in printQuote: " + e.getMessage());
 	    }

 	    return outputparameters;
 	}
     
     public static Hashtable<String, Object> printEndorsementReport(Object[] inputparameters) throws IOException {
  	    Hashtable<String, Object> outputparameters = new Hashtable<>();

  	    try {
  	        driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);

  	        String fieldName = ((String) inputparameters[0]).trim();
  	        String newPremiumXpath = ((String)inputparameters[1]);
  	        String actualPremiumXpath = ((String)inputparameters[2]);
  	        String vatAmountXpath = ((String)inputparameters[3]);
  	        String totalPremiumXpath = ((String)inputparameters[4]);

  	        // ✅ Store current (main) window
  	        String mainWindow = driver.getWindowHandle();

  	        // ✅ Get expected values from UI BEFORE switching to PDF
  	        Map<String, String> expectedValues = new HashMap<>();
  	        expectedValues.put("Endorsement No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[1]")).getText().toUpperCase());
  	        expectedValues.put("Risk Note No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[2]")).getText());
  	        expectedValues.put("Branch", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[3]")).getText());
  	        expectedValues.put("Date", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[4]")).getText());
  	        expectedValues.put("Insured Name", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[5]")).getText());
  	        expectedValues.put("Insurance Company", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[8]")).getText());

  	        Thread.sleep(2000);
  	        // ✅ Step 1: Click on Display icon
  	        WebElement displayIcon = driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr[1]/td[11]/*[1]")); 
  	        displayIcon.click();
  	        Thread.sleep(5000);
  	        
  	       JavascriptExecutor down=(JavascriptExecutor) driver;
 		   down.executeScript("window.scrollBy(0,1000)");//1050

  	        // ✅ Step 2: Capture values from Display screen
 		   WebElement policyElement = driver.findElement(By.xpath(newPremiumXpath));
 		   String newPremium = policyElement.getText().trim();
 		   expectedValues.put("New Premium", newPremium);
  	        String actualPremium = driver.findElement(By.xpath(actualPremiumXpath)).getAttribute("value");
  	        expectedValues.put("Actual Premium", actualPremium);
  	        String vatAmount = driver.findElement(By.xpath(vatAmountXpath)).getAttribute("value");
  	        expectedValues.put("VAT Amount", vatAmount);
  	        String totalPremium = driver.findElement(By.xpath(totalPremiumXpath)).getAttribute("value");
	        expectedValues.put("Total Premium", totalPremium);
  	        
  	        Thread.sleep(2000);
  	        // ✅ Step 3: Close the display popup
  	        WebElement closeBtn = driver.findElement(By.xpath("//*[@id='btnBack']"));
  	        closeBtn.click();

  	        // ✅ Step 4: Switch to PDF tab
  	        Set<String> ids = driver.getWindowHandles();
  	        for (String id : ids) {
  	            if (!id.equals(mainWindow)) {
  	                driver.switchTo().window(id);
  	                break;
  	            }
  	        }

  	        // ✅ Read PDF
  	        URL pdfUrl = new URL(driver.getCurrentUrl());
  	        URLConnection urlConnection = pdfUrl.openConnection();
  	        urlConnection.addRequestProperty("User-Agent", "Chrome");

  	        try (InputStream id = urlConnection.getInputStream();
  	             BufferedInputStream bufferedInput = new BufferedInputStream(id);
  	             PDDocument pdDocument = PDDocument.load(bufferedInput)) {

  	            String printText = new PDFTextStripper().getText(pdDocument);
  	         // ✅ Compare current field (PDF vs Expected Value)
  	            String expectedValue = expectedValues.get(fieldName);

  	         
  	            if (expectedValue != null) {
  	                // Normalize expected value (remove extra spaces, unify case, remove special chars for fuzzy match)
  	                String normalizedExpected = expectedValue.trim()
  	                                                         .replaceAll("\\s+", " ")   // collapse multiple spaces
  	                                                         .toUpperCase();

  	                // 🔥 Split PDF into lines
  	                String[] pdfLines = printText.split("\\r?\\n");
  	                boolean matchFound = false;

  	                for (String line : pdfLines) {
  	                    // Normalize PDF line
  	                    String normalizedLine = line.trim()
  	                                                .replaceAll("\\s+", " ")   // collapse spaces
  	                                                .toUpperCase();

  	                    // Debug print
  	                   // System.out.println("📄 PDF Line: [" + line + "]");

  	                    // 1️⃣ Exact match
  	                    if (normalizedLine.equals(normalizedExpected)) {
  	                        matchFound = true;
  	                        break;
  	                    }

  	                    // 2️⃣ Contains match (handles multi-line or label+value cases)
  	                    if (normalizedLine.contains(normalizedExpected)) {
  	                        matchFound = true;
  	                        break;
  	                    }

  	                    // 3️⃣ Regex whole word match (avoid partial matches like "1234" inside "123456")
  	                    if (normalizedLine.matches(".*\\b" + java.util.regex.Pattern.quote(normalizedExpected) + "\\b.*")) {
  	                        matchFound = true;
  	                        break;
  	                    }

  	                    // 4️⃣ Number-only comparison (ignore commas, decimals, currency symbols)
  	                    String digitsExpected = normalizedExpected.replaceAll("[^0-9A-Za-z]", "");
  	                    String digitsLine = normalizedLine.replaceAll("[^0-9A-Za-z]", "");
  	                    if (!digitsExpected.isEmpty() && digitsExpected.equalsIgnoreCase(digitsLine)) {
  	                        matchFound = true;
  	                        break;
  	                    }
  	                }

  	                if (matchFound) {
  	                    System.out.println("✅ " + fieldName + " found in PDF: " + expectedValue);
  	                    outputparameters.put("STATUS", "Pass");
  	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is present in PDF with value: " + expectedValue);
  	                } else {
  	                    System.out.println("❌ " + fieldName + " NOT found in PDF (all match strategies failed)");
  	                    outputparameters.put("STATUS", "Fail");
  	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is missing or mismatch in PDF. Expected: " + expectedValue);
  	                }
  	            } else {
  	                System.out.println("⚠️ Expected value for " + fieldName + " not found in map");
  	            }

  	            
  	        }

  	        // ✅ Switch back to main tab
  	        driver.switchTo().window(mainWindow);

  	    } catch (Exception e) {
  	        e.printStackTrace();
  	        outputparameters.put("STATUS", "Fail");
  	        outputparameters.put("MESSAGE", "Exception in printEndorsement: " + e.getMessage());
  	    }

  	    return outputparameters;
  	}

   
     
     public static void browserClose() {
    	 try {
    		 driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
    	 driver.quit();
    	 }
    	 catch(Exception e) {
    		 outputparameters.put("STATUS","Fail");
  		   outputparameters.put("MESSAGE","Method Used:browserColse, Input Given:");
  		 	 
    	 }
     }
          
     
     //Calculations
     public static void calculate(Object[] inputparameters) {
    	try { 
    	 String output = (String)inputparameters[0];
    	WebElement text = driver.findElement(By.xpath(output));
    	String pass =text.getText();
    	System.out.println(pass); 
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	/*List<WebElement> test = driver.findElements(By.xpath(output));
        
        for(WebElement i:test) {
        	
        	String pass = i.getText();
        	System.out.println(pass);
        }
         
         }*/

    	 
     } 
     
     public static void gstPercentCalculationValidation(Object[] inputparameters) {
    	try {
    		
    		//Get Vatt on commission for equal or check
    	       
    	       String output1 = (String)inputparameters[0];
    	   	WebElement vattOnCommssionValue = driver.findElement(By.xpath(output1));
    	   	String vattOnCommssionStringValue = vattOnCommssionValue.getAttribute("value");
    	   	String clearValue1=vattOnCommssionStringValue.replaceAll(",", "");
    	   	//System.out.println(clearValue1);
    	       double percentage1 = Double.parseDouble(clearValue1);
    	       System.out.println("Percentage Value"+" "+percentage1);
    	       if(percentage1!=0) {
    		//VATT on commission calculate by percent
    		String output = (String)inputparameters[1];
    	WebElement commissionValue = driver.findElement(By.xpath(output));
    	String CommissionStringValue =commissionValue.getAttribute("value");
    	String commissionClearValue=CommissionStringValue.replaceAll(",", "");
    	double commissionClearValue0 =Double.parseDouble(commissionClearValue);
    	System.out.println(commissionClearValue0);
    	
       
    		double percentage = Double.parseDouble(commissionClearValue)*18/100;
       DecimalFormat df = new DecimalFormat("0.00");
       df.setRoundingMode(RoundingMode.DOWN);
       String finalCommission = df.format(percentage);
      double calculatedFinalPercent = Double.parseDouble(finalCommission);
      System.out.println(calculatedFinalPercent);
    	 
     
        
    	   if(calculatedFinalPercent==percentage1) {
       	       System.out.println("Percentage Is Right");
           }
           else {
               System.out.println("Percentage Is Wrong");
           }
   	//System.out.println("VATT/GST Is : "+(calculatedFinalPercent==percentage1));
     
   	
   	//Get Total Commission
   	//commission+vatt on commission
   	 double calculatedTotalCommission = Double.sum(commissionClearValue0, percentage1);
   	 System.out.println(calculatedTotalCommission);
   	 
   	 //Get Total Commission for equal or check
   	 String output2 = (String)inputparameters[2];
    	WebElement totalCommissionValue = driver.findElement(By.xpath(output2));
    	String totalCommissionStringValue =totalCommissionValue.getAttribute("value");
    	String clearValue2=totalCommissionStringValue.replaceAll(",", "");
    	System.out.println(clearValue2);
       double finalValue = Double.parseDouble(clearValue2);
       System.out.println("Total Premium/Commission Is :"+(calculatedTotalCommission==finalValue));
   	
    	}
    	else {
    		System.out.println("No GST/VATT On Quotation");
    	}
        
        
        
        
        
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}     
    	}
     
     
     public static void CalculateSumOfColumn(Object[] inputparameters) {
    	 String input = (String)inputparameters[0];
    	// WebElement colunmValues = (WebElement) driver.findElements(By.xpath(input));
    	 List<WebElement> colunmValues = driver.findElements(By.xpath(input));
    	int t = colunmValues.size();
    	for(int i = 0;i<t;i++) {
        String finalValues = colunmValues.get(i).getText();
        
        System.out.println("Values"+" "+finalValues);
    	
    	
    	}
    	 
    	
     }
     
     public static void swahiliElement(Object[] inputparameters) {
    	SoftAssert SoftAssert = new SoftAssert();
    	 String xpath = (String) inputparameters[0];
    	 String text = (String) inputparameters[1];
    	 WebElement dashboardTitle = driver.findElement(By.xpath(xpath)); // replace with actual ID
         //System.out.println(dashboardTitle.getText());
         //SoftAssert.assertEquals(dashboardTitle.getText(), text);
         SoftAssert.assertEquals(dashboardTitle.getText(), text, "fail");
         SoftAssert.assertAll();
 	
     }
     
     

     
     
     public static String getQuote1(String quoteName) {
    	 try {
    		    // Locate the insurance table
    		    WebElement table = driver.findElement(By.xpath("//*[@id='sort_table']")); // Update XPath as needed

    		    // Get all rows of the table
    		    List<WebElement> rows = table.findElements(By.xpath("//*[@id='sort_table']/tbody/tr")); // Get all rows
    		    boolean found = false;
    		    for (WebElement row : rows) {
    		        WebElement cell1 = row.findElement(By.xpath("./td[4]")); // Get the 4th column
    		        WebElement cell2 = row.findElement(By.xpath("./td[8]")); // Get the 8th column

    		        if (cell1.getText().trim().equalsIgnoreCase(quoteName) && 
    		            cell2.getText().trim().equalsIgnoreCase("Awaiting Receipt")) {
    		            WebElement quoteCell = row.findElement(By.xpath("./td[2]/*[1]"));
    		            String quoteNumber = quoteCell.getText().trim();
    		            
    		            
    		            //System.out.println("Pending status found for Bonds. Quote Number: " + quoteNumber);
    		            return quoteNumber;
    		        }
    		        
    		    }
    		    if (!found) {
                    Object quoteNumber = null;
                    System.out.println("No Quote with 'Awaiting Receipt' status found.");
                }

    		} catch (Exception e) {
    		    e.printStackTrace();
    		}
		return null;
		

     }

     public static String getQuote(String quoteName) {
    	    try {
    	        boolean found = false;
    	        String quoteNumber = null;

    	        while (true) {
    	            // Locate table and rows
    	            WebElement table = driver.findElement(By.xpath("//*[@id='sort_table']"));
    	            List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

    	            for (WebElement row : rows) {
    	                WebElement cell1 = row.findElement(By.xpath("./td[4]")); // 4th column
    	                WebElement cell2 = row.findElement(By.xpath("./td[8]")); // 8th column

    	                if (cell1.getText().trim().equalsIgnoreCase(quoteName)
    	                        && cell2.getText().trim().equalsIgnoreCase("Awaiting Receipt")) {

    	                    WebElement quoteCell = row.findElement(By.xpath("./td[2]/*[1]"));
    	                    quoteNumber = quoteCell.getText().trim();
    	                    found = true;

    	                    System.out.println("✅ Found 'Awaiting Receipt' for " + quoteName + ". Quote Number: " + quoteNumber);
    	                    return quoteNumber; // stop immediately
    	                }
    	            }

    	            // Check for pagination only if not found yet
    	            if (!found) {
    	                WebElement nextButton = driver.findElement(By.xpath("//*[@id='sort_table_next']"));
    	                String nextClass = nextButton.getAttribute("class");

    	                if (nextClass != null && nextClass.contains("disabled")) {
    	                    System.out.println("🚫 Reached last page. No 'Awaiting Receipt' found for: " + quoteName);
    	                    break;
    	                } else {
    	                    System.out.println("➡️ Moving to next page...");
    	                    nextButton.click();
    	                    Thread.sleep(1500); // Wait for next page to load
    	                }
    	            } else {
    	                break; // safety exit (redundant but safe)
    	            }
    	        }

    	        return quoteNumber; // null if not found

    	    } catch (Exception e) {
    	        e.printStackTrace();
    	        return null;
    	    }
    	}


    
     
     
     public static String getRiskNote(String quoteName) {
    	    try {
    	        while (true) {
    	            // Locate the insurance table
    	            WebElement table = driver.findElement(By.xpath("//*[@id='sort_table']"));

    	            // Get all rows of the table
    	            List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

    	            for (WebElement row : rows) {
    	                WebElement cell1 = row.findElement(By.xpath("./td[5]")); // Quote name column
    	                WebElement cell2 = row.findElement(By.xpath("./td[8]")); // Status column

    	                if (cell1.getText().trim().contains(quoteName) &&
    	                    cell2.getText().trim().equalsIgnoreCase("Active")) {

    	                    WebElement quoteCell = row.findElement(By.xpath("./td[2]/*[1]"));
    	                    riskNoteNumber = quoteCell.getText().trim();

    	                    System.out.println("✅ Found Risk Note: " + riskNoteNumber);
    	                    return riskNoteNumber; // return immediately when found
    	                }
    	            }

    	            // Check for pagination
    	            WebElement nextButton = driver.findElement(By.xpath("//*[@id='sort_table_next']"));
    	            String nextClass = nextButton.getAttribute("class");

    	            if (nextClass != null && nextClass.contains("disabled")) {
    	                System.out.println("🚫 Reached last page. No 'Active' quote found for: " + quoteName);
    	                break;
    	            } else {
    	                System.out.println("➡️ Moving to next page...");
    	                nextButton.click();
    	                Thread.sleep(1500); // Wait for page to load
    	            }
    	        }

    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    }

    	    return null;
    	}

    	// ✅ Store and reuse the latest risk note
    	private static String riskNoteNumber;

    	// ✅ Getter method to reuse later
    	public static String getStoredRiskNote() {
    	    return riskNoteNumber;
    	}
    	
    	public static String getEndorsementNo(String quoteName) {
    	    try {
    	        while (true) {
    	            // Locate the insurance table
    	            WebElement table = driver.findElement(By.xpath("//*[@id='sort_table']"));

    	            // Get all rows of the table
    	            List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

    	            for (WebElement row : rows) {
    	                WebElement cell1 = row.findElement(By.xpath("./td[6]")); // Quote name column
    	                WebElement cell2 = row.findElement(By.xpath("./td[10]")); // Status column

    	                if (cell1.getText().trim().contains(quoteName) &&
    	                    cell2.getText().trim().equalsIgnoreCase("Issued")) {

    	                    WebElement quoteCell = row.findElement(By.xpath("./td[1]"));
    	                    endorsementNo = quoteCell.getText().trim();

    	                    System.out.println("✅ Found Risk Note: " + endorsementNo);
    	                    return endorsementNo; // return immediately when found
    	                }
    	            }

    	            // Check for pagination
    	            WebElement nextButton = driver.findElement(By.xpath("//*[@id='sort_table_next']"));
    	            String nextClass = nextButton.getAttribute("class");

    	            if (nextClass != null && nextClass.contains("disabled")) {
    	                System.out.println("🚫 Reached last page. No 'issued' quote found for: " + quoteName);
    	                break;
    	            } else {
    	                System.out.println("➡️ Moving to next page...");
    	                nextButton.click();
    	                Thread.sleep(1500); // Wait for page to load
    	            }
    	        }

    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    }

    	    return null;
    	}

    	// ✅ Store and reuse the latest risk note
    	private static String endorsementNo;

    	// ✅ Getter method to reuse later
    	public static String getEndorsementNo() {
    	    return endorsementNo;
    	}


     
     public static String getClaimId(String quoteName) {
    	 try {
    		    // Locate the insurance table
    		    WebElement table = driver.findElement(By.xpath("//*[@id='sort_table']")); // Update XPath as needed

    		    // Get all rows of the table
    		    List<WebElement> rows = table.findElements(By.xpath("//*[@id='sort_table']/tbody/tr")); // Get all rows
    		    boolean found = false;
    		    for (WebElement row : rows) {
    		        WebElement cell1 = row.findElement(By.xpath("./td[6]")); // Get the 5th column
    		        WebElement cell2 = row.findElement(By.xpath("./td[9]")); // Get the 8th column

    		        if (cell1.getText().trim().contains(quoteName) && 
    		            cell2.getText().trim().equalsIgnoreCase("Active")) {
    		            WebElement quoteCell = row.findElement(By.xpath("./td[1]"));
    		            String claimId = quoteCell.getText().trim();
    		            return claimId;
    		        }
    		    }
    		    if (!found) {
                    Object claimId = null;
                    System.out.println("No Claim ID with 'Active' status found.");
                }

    		} catch (Exception e) {
    		    e.printStackTrace();
    		}
		return null;
		

     }


     
     
     
     public static String getClaim(String quoteName) throws TimeoutException {
 	    String lastRiskNoteNumber = null; // store the latest valid risk note

 	    try {
 	        WebElement table = driver.findElement(By.xpath("//*[@id='sort_table']")); 
 	        List<WebElement> rows = table.findElements(By.xpath("./tbody/tr")); // get all rows

 	        for (int i = 1; i <= rows.size(); i++) {
 	            WebElement row = rows.get(i - 1);

 	            // 5th column = Quote Name
 	            WebElement cell1 = row.findElement(By.xpath("./td[5]"));
 	            // 8th column = Status
 	            WebElement cell2 = row.findElement(By.xpath("./td[8]"));

 	            if (cell1.getText().trim().contains(quoteName) &&
 	                cell2.getText().trim().equalsIgnoreCase("Active")) {

 	                // Get Risk Note number from 2nd column
 	                WebElement quoteCell = row.findElement(By.xpath("./td[2]/*[1]"));
 	                lastRiskNoteNumber = quoteCell.getText().trim();
 	                System.out.println("🎯 Found Active Risk Note: " + lastRiskNoteNumber);

 	                // Click Issue Claim button (adjust XPath as needed)
 	                WebElement issueClaimBtn = row.findElement(
 	                    By.xpath("//*[@id='sort_table']/tbody/tr[" + i + "]/td[10]/*[6]")
 	                );
 	                issueClaimBtn.click();

 	                // Report Claim
 	                WebElement reportClaimBtn = driver.findElement(
 	                    By.xpath("//*[@id='sort_table']/tbody/tr[" + i + "]/td[10]/*[6]/*[2]/*[5]")
 	                );
 	                reportClaimBtn.click();

 	                // Exit Claim Page
 	                WebElement exit = driver.findElement(By.xpath("//*[@id='btnClaimExit']"));
 	                exit.click();
 	             // ✅ After exit, table may reload → refresh rows reference
 	                rows = driver.findElements(By.xpath("//*[@id='sort_table']/tbody/tr"));
 	                // ✅ Continue to check next rows also
 	                //continue;
 	            }
 	        }

 	        if (lastRiskNoteNumber == null) {
 	            System.out.println("❌ No eligible Risk Note found for new claim.");
 	        }

 	    } catch (Exception e) {
 	        e.printStackTrace();
 	    }

 	    return lastRiskNoteNumber; // return the last one found
 	}
     public static Hashtable<String, Object> createDummyPDF(Object[] inputparameters) throws IOException {
    	    Hashtable<String, Object> output = new Hashtable<>();
    	    try {
    	        // Extract parameters
    	        String fileName = (String) inputparameters[0];
    	        int sizeInKB = Integer.parseInt(inputparameters[1].toString());

    	        // Create folder if not exists
    	        String folderPath = System.getProperty("user.dir") + "/src/test/resources/Files/";
    	        File folder = new File(folderPath);
    	        if (!folder.exists()) folder.mkdirs();

    	        // Generate PDF
    	        File file = new File(folderPath + fileName);
    	        try (FileOutputStream fos = new FileOutputStream(file)) {
    	            String content = "PDF Test Content - " + fileName + "\n";
    	            byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
    	            while (file.length() < sizeInKB * 1024) {
    	                fos.write(bytes);
    	            }
    	        }

    	        // Upload via Selenium
    	        WebElement uploadInput = driver.findElement(By.xpath("//*[@id='files']"));
    	        uploadInput.sendKeys(file.getAbsolutePath());
    	        Thread.sleep(2000); // optional wait for upload to register

    	        // Report success
    	        double actualSizeKB = (double) file.length() / 1024;
    	        output.put("STATUS", "PASS");
    	        output.put("MESSAGE", "PDF created and uploaded successfully: " + file.getAbsolutePath()
    	                + " | Size: " + String.format("%.2f KB", actualSizeKB));
    	        output.put("FILE_PATH", file.getAbsolutePath());

    	    } catch (Exception e) {
    	        output.put("STATUS", "FAIL");
    	        output.put("MESSAGE", "Error creating/uploading PDF: " + e.getMessage());
    	    }

    	    return output;
    	}

     

    
     public static Hashtable<String, Object> verifyClientSearchByColumn(Object[] inputparameters) throws InterruptedException {
    	    Hashtable<String, Object> output = new Hashtable<>();
    	    boolean matchFound = false;
    	    int totalMatches = 0;
    	    int totalEntriesFromUI = 0;

    	    try {
    	        // Input parameters
    	        String expectedValue = (String) inputparameters[0]; // e.g. "John Doe" or "ACC1234"
    	        String searchType = (String) inputparameters[1];    // e.g. "name", "email", "acc no"
    	        String columnIndexStr = (String) inputparameters[2];
    	        int columnIndex = 0;

    	        try {
    	            columnIndex = Integer.parseInt(columnIndexStr);
    	        } catch (Exception e) {
    	            System.out.println("⚠️ Invalid column index format, defaulting to 0");
    	        }

    	        System.out.println("🔍 Starting validation for searchType: " + searchType + " | Value: " + expectedValue);

    	        // Step 1: Capture total entries
    	        WebElement entriesTextElement = driver.findElement(By.xpath("//*[@id='sort_table_info']"));
    	        String entriesText = entriesTextElement.getText().trim();
    	        System.out.println("📊 Pagination info: " + entriesText);

    	        Pattern pattern = Pattern.compile("of\\s+(\\d+)\\s+entries");
    	        Matcher matcher = pattern.matcher(entriesText);
    	        if (matcher.find()) {
    	            totalEntriesFromUI = Integer.parseInt(matcher.group(1));
    	            System.out.println("📈 Total entries from UI: " + totalEntriesFromUI);
    	        } else {
    	            System.out.println("⚠️ Unable to extract total entries count from UI text.");
    	        }
    	     // 🚨 Stop early if no records found
    	        if (totalEntriesFromUI == 0) {
    	            System.out.println("❌ No records found for searchType: " + searchType + " | Value: " + expectedValue);
    	            output.put("STATUS", "FAIL");
    	            output.put("MESSAGE", "❌ No records found for " + searchType + ": " + expectedValue);
    	            output.put("TOTAL_ENTRIES_UI", 0);
    	            output.put("SEARCH_TYPE", searchType);
    	            output.put("SEARCHED_VALUE", expectedValue);
    	            return output;
    	        }
    	        // Step 2: Define popup-based search types
    	        List<String> popupBasedFields = Arrays.asList("email", "accountnumber", "dateofbirth");

    	        // Step 3: Start pagination loop
    	        while (true) {
    	            WebElement resultsTable = driver.findElement(By.xpath("//*[@id='sort_table']"));
    	            List<WebElement> rows = resultsTable.findElements(By.xpath(".//tbody/tr"));
    	            System.out.println("📄 Found " + rows.size() + " rows on this page.");

    	            if (rows.isEmpty()) {
    	                System.out.println("⚠️ No rows found on current page.");
    	                break;
    	            }

    	            for (int i = 0; i < rows.size(); i++) {
    	                WebElement row = rows.get(i);

    	                // ✅ If field requires popup validation
    	                if (popupBasedFields.contains(searchType.toLowerCase())) {
    	                    try {
    	                        WebElement viewBtn = row.findElement(By.xpath("//*[@id='sort_table']/tbody/tr[1]/td[8]/*[1]"));
    	                        viewBtn.click();
    	                        Thread.sleep(3000);

    	                        String actualPopupValue = "";

    	                        if (searchType.equalsIgnoreCase("email")) {
    	                            WebElement emailField = driver.findElement(By.xpath("//*[@id='txtEmail1']"));
    	                            actualPopupValue = emailField.getAttribute("value").trim();

    	                        } else if (searchType.equalsIgnoreCase("accountnumber")) {
    	                            WebElement accField = driver.findElement(By.xpath("//*[@id='txtCltRefID']"));
    	                            actualPopupValue = accField.getAttribute("value").trim();

    	                        } else if (searchType.equalsIgnoreCase("dateofbirth")) {
    	                            WebElement clientField = driver.findElement(By.xpath("//*[@id='MainContent_txtDOB']"));
    	                            actualPopupValue = clientField.getAttribute("value").trim();
    	                        }

    	                        System.out.println("🔎 Value found in popup (" + searchType + "): " + actualPopupValue);

    	                        if (actualPopupValue.equalsIgnoreCase(expectedValue)) {
    	                            totalMatches++;
    	                            matchFound = true;
    	                            System.out.println("✅ Match found for " + searchType + ": " + actualPopupValue);
    	                        }

    	                        // Close popup safely
    	                        try {
    	                            WebElement closeBtn = driver.findElement(By.xpath("//*[@id='btnCancel']"));
    	                            closeBtn.click();
    	                            Thread.sleep(500);
    	                            break;
    	                        } catch (Exception ignore) {}

    	                    } catch (Exception e) {
    	                        System.out.println("⚠️ Could not validate popup for row " + (i + 1) + ": " + e.getMessage());
    	                    }
    	                }

    	                // ✅ Normal table-based validation (only if column index > 0)
    	                else if (columnIndex > 0) {
    	                    try {
    	                        WebElement cell = row.findElement(By.xpath(".//td[" + columnIndex + "]"));
    	                        String actualValue = cell.getText().trim();

    	                        if (actualValue.equalsIgnoreCase(expectedValue)) {
    	                            totalMatches++;
    	                            matchFound = true;
    	                            System.out.println("✅ Match found: " + actualValue);
    	                        }
    	                    } catch (Exception e) {
    	                        System.out.println("⚠️ Could not read value from column " + columnIndex + ": " + e.getMessage());
    	                    }
    	                }
    	            }

    	            // Step 4: Handle pagination
    	            WebElement nextButton = driver.findElement(By.xpath("//*[@id='sort_table_next']"));
    	            String nextClass = nextButton.getAttribute("class");

    	            if (nextClass != null && nextClass.contains("disabled")) {
    	                System.out.println("🚫 Reached last page. Stopping pagination.");
    	                break;
    	            } else {
    	                System.out.println("➡️ Moving to next page...");
    	                nextButton.click();
    	                Thread.sleep(1500);
    	            }
    	        }

    	        // Step 5: Final output summary
    	        if (matchFound) {
    	            output.put("STATUS", "PASS");
    	            output.put("MESSAGE", "✅ Match(es) found for " + searchType + ": " + expectedValue +
    	                    " | Total Matches: " + totalMatches + " | Total Entries: " + totalEntriesFromUI);
    	        } else {
    	            output.put("STATUS", "FAIL");
    	            output.put("MESSAGE", "❌ No matches found for " + searchType + ": " + expectedValue);
    	        }

    	        output.put("TOTAL_MATCHES", totalMatches);
    	        output.put("TOTAL_ENTRIES_UI", totalEntriesFromUI);
    	        output.put("SEARCH_TYPE", searchType);
    	        output.put("SEARCHED_VALUE", expectedValue);

    	    } catch (Exception e) {
    	        String errorMsg = "⚠️ Exception during validation: " + e.getMessage();
    	        System.out.println(errorMsg);
    	        output.put("STATUS", "ERROR");
    	        output.put("MESSAGE", errorMsg);
    	    }

    	    return output;
    	}

     public static Hashtable<String, Object> createDummyPDF1(Object[] inputparameters) throws IOException {
    	    Hashtable<String, Object> output = new Hashtable<>();
    	    try {
    	        String fileName = (String) inputparameters[0];
    	        int sizeInKB = Integer.parseInt(inputparameters[1].toString());

    	        // Define folder path
    	        String folderPath = System.getProperty("user.dir") + "/src/test/resources/Files/";
    	        File folder = new File(folderPath);
    	        if (!folder.exists()) folder.mkdirs();

    	        // Create PDF file
    	        File file = new File(folderPath + fileName);
    	        Document document = new Document();
    	        PdfWriter.getInstance(document, new FileOutputStream(file));
    	        document.open();

    	        // Add repeated content until file size target is met
    	        String baseText = "This is a dummy PDF for testing file upload in Cucumber automation.\n";
    	        while (file.length() < sizeInKB * 1024) {
    	            document.add(new Paragraph(baseText));
    	        }

    	        document.close();

    	        // Upload file using Selenium
    	        WebElement uploadInput = driver.findElement(By.xpath("//*[@id='files']"));
    	        uploadInput.sendKeys(file.getAbsolutePath());
    	        Thread.sleep(2000);

    	        // Calculate actual file size
    	        double actualSizeKB = (double) file.length() / 1024;

    	        output.put("STATUS", "PASS");
    	        output.put("MESSAGE", "PDF created and uploaded successfully: " + file.getAbsolutePath()
    	                + " | Size: " + String.format("%.2f KB", actualSizeKB));
    	        output.put("FILE_PATH", file.getAbsolutePath());

    	    } catch (Exception e) {
    	        output.put("STATUS", "FAIL");
    	        output.put("MESSAGE", "Error creating/uploading PDF: " + e.getMessage());
    	    }

    	    return output;
    	}

     public static Hashtable<String, Object> createDummyPDF2(Object[] inputparameters) throws IOException {
    	    Hashtable<String, Object> output = new Hashtable<>();
    	    try {
    	        String fileName = (String) inputparameters[0];
    	        int targetSizeKB = Integer.parseInt(inputparameters[1].toString());
    	        String folderPath = System.getProperty("user.dir") + "/src/test/resources/Files/";
    	        File folder = new File(folderPath);
    	        if (!folder.exists()) folder.mkdirs();

    	        File file = new File(folderPath + fileName);

    	        // Step 1: Create valid minimal PDF
    	        Document document = new Document();
    	        PdfWriter.getInstance(document, new FileOutputStream(file));
    	        document.open();
    	        document.add(new Paragraph("This is a valid test PDF file for upload testing."));
    	        document.add(new Paragraph("File Name: " + fileName));
    	        document.add(new Paragraph("Target Size: " + targetSizeKB + " KB"));
    	        document.add(new Paragraph("Generated at: " + new java.util.Date()));
    	        document.close();

    	        // Step 2: Add binary padding until near target size
    	        long targetBytes = targetSizeKB * 1024L;
    	        long currentSize = file.length();

    	        if (currentSize < targetBytes) {
    	            try (FileOutputStream fos = new FileOutputStream(file, true)) {
    	                byte[] padding = new byte[1024]; // 1 KB block
    	                while (file.length() + padding.length < targetBytes) {
    	                    fos.write(padding);
    	                }
    	                // Write exact remaining bytes
    	                long remaining = targetBytes - file.length();
    	                if (remaining > 0) fos.write(new byte[(int) remaining]);
    	            }
    	        }

    	        double finalSizeKB = (double) file.length() / 1024.0;

    	        // Step 3: Upload file using Selenium
    	        WebElement uploadInput = driver.findElement(By.xpath("//*[@id='files']"));
    	        uploadInput.sendKeys(file.getAbsolutePath());
    	        Thread.sleep(1500);

    	        output.put("STATUS", "PASS");
    	        output.put("MESSAGE", String.format("PDF created and uploaded successfully: %s | Final Size: %.2f KB",
    	                file.getAbsolutePath(), finalSizeKB));
    	        output.put("FILE_PATH", file.getAbsolutePath());

    	    } catch (Exception e) {
    	        output.put("STATUS", "FAIL");
    	        output.put("MESSAGE", "Error creating/uploading PDF: " + e.getMessage());
    	    }
    	    return output;
    	}
     public static Hashtable<String, Object> printCreditNote(Object[] inputparameters) throws IOException {
 	    Hashtable<String, Object> outputparameters = new Hashtable<>();

 	    try {
 	        driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);

 	        String fieldName = ((String) inputparameters[0]).trim();
 	        

 	        // ✅ Store current (main) window
 	        String mainWindow = driver.getWindowHandle();

 	        // ✅ Get expected values from UI BEFORE switching to PDF
 	        Map<String, String> expectedValues = new HashMap<>();
 	        expectedValues.put("Credit No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[2]")).getText().toUpperCase());
 	        expectedValues.put("Risk Note No", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[3]")).getText());
 	        expectedValues.put("Name", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[5]")).getText());
 	        expectedValues.put("Amount", driver.findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[7]")).getText());

 	        Thread.sleep(2000);
 	        

 	        // ✅ Step 4: Switch to PDF tab
 	        Set<String> ids = driver.getWindowHandles();
 	        for (String id : ids) {
 	            if (!id.equals(mainWindow)) {
 	                driver.switchTo().window(id);
 	                break;
 	            }
 	        }

 	        // ✅ Read PDF
 	        URL pdfUrl = new URL(driver.getCurrentUrl());
 	        URLConnection urlConnection = pdfUrl.openConnection();
 	        urlConnection.addRequestProperty("User-Agent", "Chrome");

 	        try (InputStream id = urlConnection.getInputStream();
 	             BufferedInputStream bufferedInput = new BufferedInputStream(id);
 	             PDDocument pdDocument = PDDocument.load(bufferedInput)) {

 	            String printText = new PDFTextStripper().getText(pdDocument);
 	         // ✅ Compare current field (PDF vs Expected Value)
 	            String expectedValue = expectedValues.get(fieldName);

 	         
 	            if (expectedValue != null) {
 	                // Normalize expected value (remove extra spaces, unify case, remove special chars for fuzzy match)
 	                String normalizedExpected = expectedValue.trim()
 	                                                         .replaceAll("\\s+", " ")   // collapse multiple spaces
 	                                                         .toUpperCase();

 	                // 🔥 Split PDF into lines
 	                String[] pdfLines = printText.split("\\r?\\n");
 	                boolean matchFound = false;

 	                for (String line : pdfLines) {
 	                    // Normalize PDF line
 	                    String normalizedLine = line.trim()
 	                                                .replaceAll("\\s+", " ")   // collapse spaces
 	                                                .toUpperCase();

 	                    // Debug print
 	                   // System.out.println("📄 PDF Line: [" + line + "]");

 	                    // 1️⃣ Exact match
 	                    if (normalizedLine.equals(normalizedExpected)) {
 	                        matchFound = true;
 	                        break;
 	                    }

 	                    // 2️⃣ Contains match (handles multi-line or label+value cases)
 	                    if (normalizedLine.contains(normalizedExpected)) {
 	                        matchFound = true;
 	                        break;
 	                    }

 	                    // 3️⃣ Regex whole word match (avoid partial matches like "1234" inside "123456")
 	                    if (normalizedLine.matches(".*\\b" + java.util.regex.Pattern.quote(normalizedExpected) + "\\b.*")) {
 	                        matchFound = true;
 	                        break;
 	                    }

 	                    // 4️⃣ Number-only comparison (ignore commas, decimals, currency symbols)
 	                    String digitsExpected = normalizedExpected.replaceAll("[^0-9A-Za-z]", "");
 	                    String digitsLine = normalizedLine.replaceAll("[^0-9A-Za-z]", "");
 	                    if (!digitsExpected.isEmpty() && digitsExpected.equalsIgnoreCase(digitsLine)) {
 	                        matchFound = true;
 	                        break;
 	                    }
 	                }

 	                if (matchFound) {
 	                    System.out.println("✅ " + fieldName + " found in PDF: " + expectedValue);
 	                    outputparameters.put("STATUS", "Pass");
 	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is present in PDF with value: " + expectedValue);
 	                } else {
 	                    System.out.println("❌ " + fieldName + " NOT found in PDF (all match strategies failed)");
 	                    outputparameters.put("STATUS", "Fail");
 	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is missing or mismatch in PDF. Expected: " + expectedValue);
 	                }
 	            } else {
 	                System.out.println("⚠️ Expected value for " + fieldName + " not found in map");
 	            }

 	            
 	        }

 	        // ✅ Switch back to main tab
 	        driver.switchTo().window(mainWindow);

 	    } catch (Exception e) {
 	        e.printStackTrace();
 	        outputparameters.put("STATUS", "Fail");
 	        outputparameters.put("MESSAGE", "Exception in printQuote: " + e.getMessage());
 	    }

 	    return outputparameters;
 	}

     public static LocalDate resolveDate(String startDateType) {

    	    if (startDateType.equalsIgnoreCase("Today")) {
    	        return LocalDate.now();
    	    } 
    	    else if (startDateType.equalsIgnoreCase("BackDate")) {
    	        return LocalDate.now().minusDays(5);
    	    } 
    	    else {
    	        // Parse yyyy-MM-dd from examples
    	        return LocalDate.parse(startDateType);
    	    }
    	}


     public static void selectDateFromCalendar(LocalDate targetDate) {

    	    // 1. Open the calendar
    	    driver.findElement(By.id("MainContent_txtFromDate")).click();

    	    // 2. XPaths based on your DOM
    	    By monthYearHeader = By.xpath("//th[@class='datepicker-switch']");
    	    By prevButton = By.xpath("//th[@class='prev']");
    	    By nextButton = By.xpath("//th[@class='next']");

    	    DateTimeFormatter headerFormatter = DateTimeFormatter.ofPattern("MMMM yyyy");

    	    // 3. Navigate until correct month-year appears
    	    while (true) {

    	        String displayed = driver.findElement(monthYearHeader).getText().trim();
    	        YearMonth displayedYM = YearMonth.parse(displayed, headerFormatter);
    	        YearMonth targetYM = YearMonth.from(targetDate);

    	        if (displayedYM.equals(targetYM)) {
    	            break;  // Month and year are correct
    	        }

    	        if (displayedYM.isBefore(targetYM)) {
    	            // Move forward → 
    	            driver.findElement(nextButton).click();
    	        } else {
    	            // Move backward ←
    	            driver.findElement(prevButton).click();
    	        }
    	    }

    	    // 4. Select day
    	    String dayXpath = "//td[contains(@class,'day') and text()='" + targetDate.getDayOfMonth() + "']";
    	    driver.findElement(By.xpath(dayXpath)).click();
    	}

     

}


             
                      

         

    	 
    	 
    	 
    	 
         
    	 
    	 
     
 	 
	


	