package cucumberMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
       
	public static void main (String[]args) throws InterruptedException {
		//BrowserLanunch
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
  	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    //Open Application
        driver.navigate().to("https://apps.itl.co.tz/brokeruat/wfLogin.aspx");
        
        //Login
        driver.findElement(By.xpath("//*[@id='usercode']")).sendKeys("TestProject0001");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Ps@12345");
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='MOD_OPERATIONS']"));
        act.moveToElement(element).build().perform();
        
	    
	}
}
