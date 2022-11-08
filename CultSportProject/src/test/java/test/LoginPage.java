package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class LoginPage {
	WebDriver driver;
  @Test
  public void Login() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[2]/div/div/img")).click();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//*[@id=\"phoneloginModal\"]/div[3]/div/div/div[2]/div/div[2]/div[1]/input")).sendKeys("7550264627");
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1nr9jr0 > div.style-prefix-1w1gazz > button > div")).click();
	  
	  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	  System.out.println("Enter OTP");

	  String userName = myObj.nextLine(); 
	  
	 // Thread.sleep(30000);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1thztxf > div.style-prefix-17754hw > input")).sendKeys(userName);                                  
	 
	  // LOGIN BUTTON
	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1thztxf > div.style-prefix-1ykdma4 > button")).click();
	  
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
	 // driver.quit();
	 
  }

}
