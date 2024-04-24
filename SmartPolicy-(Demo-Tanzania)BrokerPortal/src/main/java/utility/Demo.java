package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	
	
	
	/*public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91993\\Downloads\\driver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://apps.itl.co.tz:/broker");
		
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.xpath("//*[@id='usercode']"));
		id.sendKeys("PravinS");
		String getValueSum=id.getText();
		System.out.println(getValueSum);
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Qw@12345");
		
		WebElement id1 = driver.findElement(By.xpath("//*[text()='Login']"));
		String name = id1.getText();
		System.out.println(name);
		id1.click();
		
		//navigate on operations
		Actions act=new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//*[@id='MOD_OPERATIONS']"));
		act.moveToElement(move).build().perform();
		   
		//navigate on quotations
		WebElement move1 = driver.findElement(By.xpath("(//*[text()='Quotations '])[1]"));
		act.moveToElement(move1).build().perform();
		
		driver.findElement(By.xpath("(//*[text()='Current Quotations'])[1]")).click();
		
		driver.findElement(By.xpath("//*[@class='bold'][text()='Add']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//*[text()='Select Insurance Type'])[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@class='select2-input select2-focused']")).sendKeys("Fire Class");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='select2-result-label']")).click();
		Thread.sleep(7000);
		
	    String quotationText=driver.findElement(By.xpath("//*[text()='Fire Class Quotation']")).getText();
		Assertions.assertEquals(quotationText, "Fire Class Quotation");
		
		
		
		
		WebElement waitTill= driver.findElement(By.xpath("//*[@id='MainContent_txtClientName']"));
		Thread.sleep(5000);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(waitTill)));
		waitTill.sendKeys("Pravin Testing Broker");
		
		//act.moveToElement(waitTill).sendKeys("Pravin Testing Broker").build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
	    Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@class='select2-chosen'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='select2-input select2-focused']")).sendKeys("Alliance Insurance Company (T) Ltd.");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='select2-match']")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,550)");
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("s2id_MainContent_cmbInsuranceClass")));
		Thread.sleep(2000);
		//Select Insurance Class
		WebElement pass= driver.findElement(By.id("s2id_MainContent_cmbInsuranceClass"));
	    pass.click();

		driver.findElement(By.xpath("//*[@class='select2-input select2-focused']")).sendKeys("Industrial");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//*[@class='select2-match']")).click();
		Thread.sleep(2000);
		
		WebElement value1=driver.findElement(By.xpath("//*[@id='txtSumInsured']"));
		value1.sendKeys("100000");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='txtOverride']")).sendKeys("10");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id='btnCompute']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='btnInsert']")).click();
		Thread.sleep(5000);
		
		java.util.List<WebElement> values100 = driver.findElements(By.xpath("//*[@style='text-align: right;']"));
		
		String t1= values100.get(1).getText();
		String newt1 = t1.replace(",", "");
		double v1= Double.parseDouble(newt1);
		System.out.println(v1);
		 
		String t2= values100.get(2).getText();
		String newt2 = t2.replace(",", "");
		double v2= Double.parseDouble(newt2);
		System.out.println(v2);
		
		String t3= values100.get(3).getText();
		String newt3= t3.replace(",", "");
		double v3= Double.parseDouble(newt3);
		System.out.println(v3);
		 
		String t4= values100.get(4).getText();
		String newt4= t4.replace(",", "");
		double v4= Double.parseDouble(newt4);
		System.out.println(v4);
		 
		if(v3>=1) {
		  double multiple = v1*(v3/100);
		  System.out.println(multiple);
		  Assertions.assertEquals(multiple, v4);
		}
		 
		else {
		  double multiple = v1*(v2/100);
		  System.out.println(multiple);
		  Assertions.assertEquals(multiple, v4);	 
        }
			 
		
		
			/* Assertions.assertEquals("100000.00",values100.get(0).getText());
			 Assertions.assertEquals("0.20",values100.get(1).getText());
			 Assertions.assertEquals("0.00",values100.get(2).getText());
			 Assertions.assertEquals("200.00",values100.get(3).getText());
			 Assertions.assertEquals("0.00",values100.get(4).getText());
			 Assertions.assertEquals("50.00",values100.get(5).getText());
			 Assertions.assertEquals("200.00",values100.get(6).getText());*/
			
		/*	 Thread.sleep(5000);
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			    js1.executeScript("window.scrollBy(0,1100)");
			   
			   WebElement pay = driver.findElement(By.xpath("//*[@id='btnSave']"));
			    WebDriverWait wait2 = new WebDriverWait(driver, 20);
				wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pay)));
			    Thread.sleep(5000);
			   pay.click();
			   Thread.sleep(5000);
		
		
		List<WebElement> values101 = driver.findElements(By.xpath("(//*[@style='padding-left: 0%; text-align: left;'])"));
		for (int i=0;i<8;i++) {
			String pass01 = values101.get(i).getText();
			System.out.println(pass01);
		}
		 Assertions.assertEquals("Head Office",values101.get(0).getText());
		 Assertions.assertEquals("Pravin Testing Broker",values101.get(2).getText());
		 Assertions.assertEquals("Fire Class",values101.get(3).getText());
		 Assertions.assertEquals("Alliance Insurance Company (T) Ltd.",values101.get(5).getText());
		 Assertions.assertEquals("11,800.00",values101.get(6).getText());
		 Assertions.assertEquals("Awaiting Receipt",values101.get(7).getText());*/
		                                              
		
		
	/*	//Sum Insured Value
        String values1 = driver.findElement(By.xpath("(//*[@style='text-align: right;padding-right: 0%'])[1]")).getText();
        String value1New= values1.replace(",", "");
        double pass1 = Double.parseDouble(value1New);
		
		String values2 = driver.findElement(By.xpath("(//*[@style='text-align: right;padding-right: 0%'])[2]")).getText();
		String value2New= values2.replace(",", "");
		double pass2 = Double.parseDouble(value2New);
		
		double multiple = pass1*(pass2/100);
		System.out.println(multiple);
		
        String values3 = driver.findElement(By.xpath("(//*[@style='text-align: right;padding-right: 0%'])[4]")).getText();
        String value3New = values3.replace(",", "");
        double pass3 = Double.parseDouble(value3New);
        
        Assertions.assertEquals(multiple, pass3); */
		
		
		
		
		
		
		
		
		
		
		   
		   
		
		
		
		
	}	
