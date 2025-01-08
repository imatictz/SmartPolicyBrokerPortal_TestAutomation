package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOne {
	
	public static void main(String args[]){
       //System.setProperty("webdriver.chrome.driver","C:\\Users\\91993\\Downloads\\driver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://apps.itl.co.tz:/broker");
		
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.xpath("//*[@id='usercode']"));
		id.sendKeys("PravinS");
		String pass = id.getAttribute("value");
		System.out.println(pass);
		
	}	
}
