package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
  @Test
  public void chromeTest() 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		Reporter.log("Inside the setup where inialisation is done");
  }
  
  @Test
  public void edgeTest()
  {
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();  
		Reporter.log("Inside the setup where inialisation is done");
  }
}
