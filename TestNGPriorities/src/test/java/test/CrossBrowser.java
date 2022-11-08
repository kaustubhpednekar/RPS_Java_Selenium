package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
  @Test
  public void f() 
  {
	  WebElement uname = driver.findElement(By.id("username"));
	  uname.clear();
	  uname.sendKeys("vasuvespag");
	  driver.findElement(By.id("password")).sendKeys("vasu1234");
	  driver.findElement(By.className("login_button")).click();
  }
  
  @Parameters("browser")
  @BeforeTest
  public void beforeTest(String browser)
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
			System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
			driver = new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
			System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\msedgedriver.exe");
			driver = new EdgeDriver();
	  }
	  
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
	  
  }
  
  @AfterTest
  public void afterTest()
  {
	  driver.quit();
  }
}
