package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class SelectingMenPortion {
	WebDriver driver;
  @Test
  public void men() {
	 
	  driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/h3")).click();
	  driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-1u4kqgz > div > div > ul > li:nth-child(3) > ul > li:nth-child(3) > a > h3")).click();
	  
//	  	JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement PoloShirt = driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[1]/div/div[2]/label"));
//		js.executeScript("arguments[0].scrollIntoView();", PoloShirt);
	  
	  // Pressing polo button
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[1]/div/div[2]/label")).click();
	  
	  // Selecting Polo Shirts
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.cssSelector("#plp-container > div.animate-tb > div > div:nth-child(2) > a > div > div.style-prefix-1xgnd8t")).click();
	 
	  // Checking PINCODE
	  driver.findElement(By.cssSelector("#pincode-query-modal > div > input")).sendKeys("140301");
	  driver.findElement(By.cssSelector("#pincode-query-modal > div > button")).click();
	  
	  // Selceting SIZE OF Shirt
	  driver.findElement(By.cssSelector("#main-layout > div.clearfix.style-prefix-1ytu7n5 > div.style-prefix-say49q > div > div > div.info > div.product-size > div.size-container > div:nth-child(3)")).click();
	  
	  // Adding to Cart
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.cssSelector("#main-layout > div.clearfix.style-prefix-1ytu7n5 > div.style-prefix-say49q > div > div > div.info > div.actions-container > div:nth-child(1) > div")).click();
	  
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
	  //driver.quit();
  }

}
