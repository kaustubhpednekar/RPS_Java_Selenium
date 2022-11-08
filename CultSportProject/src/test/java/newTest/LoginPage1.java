package newTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class LoginPage1 {
	WebDriver driver;
  @Test
  public void loginPage() throws InterruptedException {
	   
	  driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-4g6ai3 > div > div > img")).click();
	  	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  	 driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1nr9jr0 > div.style-prefix-qtcbab > button > div > div > div.style-prefix-7kp13n > img:nth-child(2)")).click();
	  	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div.style-prefix-46b038 > div > span > div:nth-child(2) > button > div > div.style-prefix-u8x7nc > img")).click();
	  	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-0 > input")).sendKeys("namansharma03020@gmail.com");
	  	 Thread.sleep(3000);
	  	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-ej336q > button > div")).click();
	  	 Thread.sleep(15000);
	  	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div > div.style-prefix-1thztxf > div.style-prefix-1ykdma4 > button")).click();
	  	 
}
  @BeforeTest
  public void beforeTest() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
		
		driver = new ChromeDriver();   
		driver.get("http://cultsport.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
