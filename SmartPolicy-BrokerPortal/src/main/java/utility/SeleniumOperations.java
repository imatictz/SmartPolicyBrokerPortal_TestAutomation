    package utility;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
		   driver.findElement(By.xpath(sendXpath)).sendKeys(sendValue);
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
        
        public static Hashtable<String, Object> printQuote(Object[] inputparameters) throws IOException {
       	try {

       	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);

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
        // ✅ Add validations here
           String expectedClientName = ClientNameFromUI;
           System.out.println(expectedClientName);
           String expectedQuoteNumber =quoteNumberFromUI;
           System.out.println(expectedQuoteNumber);
           String expectedAmountPayable =amountPayableFromUI;
           System.out.println(expectedAmountPayable);
           String expectedInsuranceType =InsuranceTypeFromUI;
           System.out.println(expectedInsuranceType);
           System.out.println("🔧 printQuote() called with field: " + inputparameters[0]);
           // 🟡 Step 3: Field Name passed as input
           String fieldName = ((String) inputparameters[0]).trim();
           System.out.println("📌 Matching field name: [" + fieldName + "]");
           String expectedValue = "";

           if (fieldName.equalsIgnoreCase("Client Name")) {
        	   System.out.println("📌 Matching field name1: [" + fieldName + "]");
        	   expectedValue = expectedClientName;
           } else if (fieldName.equalsIgnoreCase("Quote Number")) {
        	   System.out.println("📌 Matching field name2: [" + fieldName + "]");
        	   expectedValue = expectedQuoteNumber;
           } else if (fieldName.equalsIgnoreCase("Premium Amount")) {
        	   System.out.println("📌 Matching field name3: [" + fieldName + "]");
        	   expectedValue = expectedAmountPayable;
           } else if (fieldName.equalsIgnoreCase("Insurance Type")) {
        	   System.out.println("📌 Matching field name4: [" + fieldName + "]");
        	   expectedValue = expectedInsuranceType;
           } else {
               System.out.println("❌ Unknown field: [" + fieldName + "]");
               outputparameters.put("STATUS","Fail");
               outputparameters.put("MESSAGE","Unknown field: " + fieldName);
               return outputparameters;
           }

           // ✅ Debug: print expected value
           System.out.println("📥 Expected value: [" + expectedValue + "]");

           // ✅ Safety check
           if (expectedValue == null || expectedValue.isEmpty()) {
               System.out.println("❌ Expected value is null/empty for field: " + fieldName);
               outputparameters.put("STATUS", "Fail");
               outputparameters.put("MESSAGE", "Expected value for " + fieldName + " is not set");
               return outputparameters;
           }
       	}
       /* String text1= (String) inputparameters[0];
        System.out.println(text1);
        String text2= (String) inputparameters[1];
        System.out.println(text2);
           
           
      
        // ClientName
        if(text1.contains("Client Name")){
           if (printText.contains(expectedClientName)) {
               System.out.println("✅ Client Name found in PDF: " + expectedClientName);
               outputparameters.put("STATUS","Pass");
       	       outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           } }else {
               
               outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
    		   System.out.println("❌ Client Name NOT found in PDF");
           }
        
           
        // QuoteNumber
           if (printText.contains(expectedQuoteNumber)) {
               System.out.println("✅ Quote Number found in PDF: " + expectedQuoteNumber);
               outputparameters.put("STATUS","Pass");
       	       outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           } else {
               System.out.println("❌ Quote Number NOT found in PDF");
               outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           }
           
        // AmountPayable
           if (printText.contains(expectedAmountPayable)) {
               System.out.println("✅ AmountPayable found in PDF: " + expectedAmountPayable);
               outputparameters.put("STATUS","Pass");
       	       outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           } else {
               System.out.println("❌ AmountPayable NOT found in PDF");
               outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           }
          
           
        // InsuranceType
           if (printText.contains(expectedInsuranceType)) {
               System.out.println("✅ Insurance Type found in PDF: " + expectedInsuranceType);
               outputparameters.put("STATUS","Pass");
       	       outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           } else {
               System.out.println("❌ Insurance Type NOT found in PDF");
               outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
           }
        
          
       	}*/
       	catch(Exception e) {
      		 outputparameters.put("STATUS","Fail");
    		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
    		 	 
      	 }

	   
		return outputparameters;
     
     }
     
     public static void browserColse() {
    	 driver.quit();
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
     
     

     
     
     public static String getriskNote(String quoteName) {
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
     
     
     public static String getClaim(String quoteName) {
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
    		            cell2.getText().trim().equalsIgnoreCase("Active")) {
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
     
     
     

}


             
                      

         

    	 
    	 
    	 
    	 
         
    	 
    	 
     
 	 
	


	