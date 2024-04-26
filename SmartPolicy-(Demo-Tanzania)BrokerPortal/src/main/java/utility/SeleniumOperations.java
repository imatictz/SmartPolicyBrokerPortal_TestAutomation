    package utility;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumOperations 
{
	
  //private static final String[] String = null;
    public static WebDriver driver=null;
	public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
	public static ConfigReader config;

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
	         outputparameters.put("STATUS","PASS");
	         outputparameters.put("MESSAGE","Method Used:browserLaunch,Input Given:"+config.getBrowserName().toString());
	    }
	    catch(Exception e){
	    	 outputparameters.put("STATUS","FAIL");
	    	 outputparameters.put("MESSAGE","Method Used:browserLaunch,Input Given:"+config.getBrowserName().toString());
		}
	    return outputparameters;
     }

//OpenApplication
	 public static Hashtable<String,Object> openApplication(){   
		 try {  
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		   driver.navigate().to(config.getApplicationUrl());
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
		   String findText=driver.findElement(By.xpath(xpath)).getText();
		   
		   if(givenText.equalsIgnoreCase(findText)){
			 System.out.println("Test Case Pass");
		   }
		   else {
			 System.out.println("Test Case Fail");
		   }
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
	 
//Actions Class	 
	 public static Hashtable<String,Object> actionClass(Object[] inputparameters) {
	     try {
		   String xpath=(String) inputparameters[0];
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
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
		   JavascriptExecutor down=(JavascriptExecutor) driver;
		   down.executeScript("window.scrollBy(0,1000)");
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 return outputparameters;
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
		 
//Iframe
     public static Hashtable<String,Object> iFrameEnter(Object[]inputparameters) {   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
		   driver.switchTo().frame(0);
	       WebElement send=driver.findElement(By.xpath(strXpath));
	       send.clear();
	       Thread.sleep(1000);
	       send.sendKeys(strvalue);
	       Thread.sleep(2000);
	       driver.switchTo().defaultContent();
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
		   Thread.sleep(2000);
		   String sendXpath = (String)inputparameters[1];
		   String sendValue = (String)inputparameters[2];
		   driver.findElement(By.xpath(sendXpath)).sendKeys(sendValue);
		   String selectXpath = (String)inputparameters[3];
		   driver.findElement(By.xpath(selectXpath)).click();
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[2]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[2]);
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
     
// Explicit Wait
     public static void wait(Object[]Inputparameters) throws InterruptedException {
    	String input=(String)Inputparameters[0];
    	 WebElement waitTill= driver.findElement(By.xpath(input));
 		Thread.sleep(5000);
 		WebDriverWait wait1 = new WebDriverWait(driver, 20);
 		wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(waitTill)));
     }
     
//SwitchWindow     
     
     public static Hashtable<String, Object> switchWindow() throws IOException {
    	try {
    	Set<String> ids = driver.getWindowHandles();
    	
    	Iterator<String> values = ids.iterator();    
    	
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
        Assert.assertEquals(pages,1);
        System.out.println("==========End==========");
        
        PDFTextStripper text = new PDFTextStripper();
        String printText = text.getText(pdDocument);
        System.out.println("==========Print PDF Text==========");
        System.out.println("PDF Text" +" "+printText);
        System.out.println("==========End==========");
      
       outputparameters.put("STATUS","Pass");
	   outputparameters.put("MESSAGE","Method Used:scrollUp, Input Given:");
    	}
    	catch(Exception e) {
 		   outputparameters.put("STATUS","Fail");
 		   outputparameters.put("MESSAGE","Method Used:scrollUp, Input Given:");
 		 }
	     
		return outputparameters;
     
     }
     
     public static void browserColse() {
    	 driver.quit();
     }
     
     
 }		 
	
	