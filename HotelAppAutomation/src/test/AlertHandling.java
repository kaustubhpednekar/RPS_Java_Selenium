package test;
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	WebDriver driver;
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
	}		
		@Test
		public void testAlerts()
		{
			driver.findElement(By.cssSelector("#alertButton")).click();
			driver.switchTo().alert().accept();
			
			driver.findElement(By.id("confirmButton")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Alert alert3 = driver.switchTo().alert();
			System.out.println(alert3.getText());
			alert3.dismiss();
			//alert3.accept(); 
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement alert4 = driver.findElement(By.id("promtButtonS"));
			js.executeScript("arguments[0].scrollIntoView();", alert4);
			//driver.findElement(By.id("promtButtonS")).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.switchTo().alert();
			System.out.println(alert4.getText());
			alert4.sendKeys("manoj");
			//alert4.accept();	
			System.out.println("success");
		
		}

}
