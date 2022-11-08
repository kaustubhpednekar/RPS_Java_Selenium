package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CartAddress {
	 WebDriver driver;
  @Test
  public void addressProceddings() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div > div > div > div:nth-child(5) > input")).sendKeys("NAMAN SHARMA");
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div > div > div > div:nth-child(6) > div.style-prefix-qxr2u0 > input")).sendKeys("9914766725");
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div > div > div > div:nth-child(7) > input")).sendKeys("naman@gmail.com");
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div > div > div > div:nth-child(8) > input")).sendKeys("160047");
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div > div > div > div:nth-child(9) > input")).sendKeys("1101, Chandigarh");
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div > div > div > div:nth-child(10) > input")).sendKeys("The Palms");
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div > div > div > div:nth-child(11) > input")).sendKeys("Chandigarh");
	//  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div > div > div > div:nth-child(12) > select")).sendKeys("Chandigarh");
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div > div > div > div:nth-child(13) > button > div")).click();
 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
	  driver = new ChromeDriver();
//	  driver.get("http://cultsport.com");
	  driver.get("http://cultsport.com/login-with-address?redirect=checkout");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
