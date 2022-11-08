package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class CultSports {
	WebDriver driver;
  @Test
  public void login() throws InterruptedException {
	  
	  // LOGIN PAGE
	  driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[2]/div/div/img")).click();
//	 Thread.sleep(5000);
//	 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	  driver.findElement(By.xpath("//*[@id=\"phoneloginModal\"]/div[3]/div/div/div[2]/div/div[2]/div[1]/input")).sendKeys("7550264627");
//	  Thread.sleep(2000);
//	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1nr9jr0 > div.style-prefix-1w1gazz > button")).click();
//	  
	  
//	 
//	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1thztxf > div.style-prefix-1ykdma4 > button")).sendKeys(userName);                                  
//	 
//	  // LOGIN BUTTON
//	  driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1thztxf > div.style-prefix-1ykdma4 > button")).click();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    // LOGIN THROUGH EMAIL
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1nr9jr0 > div.style-prefix-qtcbab > button > div > div > div.style-prefix-7kp13n > img:nth-child(2)")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div.style-prefix-46b038 > div > span > div:nth-child(2) > button > div > div.style-prefix-u8x7nc > img")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-0 > input")).sendKeys("namansharma03020@gmail.com");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-ej336q > button > div")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div > div.style-prefix-1thztxf > div.style-prefix-17754hw > input")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
	 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	  System.out.println("Enter OTP");
	  String userName = myObj.nextLine(); 
	 
	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div > div.style-prefix-1thztxf > div.style-prefix-1ykdma4 > button")).sendKeys(userName);
	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div > div.style-prefix-1thztxf > div.style-prefix-1ykdma4 > button")).click();
  }
  @Test(priority = 1)
  public void moduel1() {
	  
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	  driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/h3")).click();
//	  driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-1u4kqgz > div > div > ul > li:nth-child(3) > ul > li:nth-child(3) > a > h3")).click();
//	  
//	  // Pressing polo button
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[1]/div/div[2]/label")).click();
//	  
//	  // Selecting Polo Shirts
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  driver.findElement(By.cssSelector("#plp-container > div.animate-tb > div > div:nth-child(2) > a > div > div.style-prefix-1xgnd8t")).click();
//	 
//	  // Checking PINCODE
//	  driver.findElement(By.cssSelector("#pincode-query-modal > div > input")).sendKeys("140301");
//	  driver.findElement(By.cssSelector("#pincode-query-modal > div > button")).click();
//	  
//	  // Selecting SIZE OF Shirt
//	  driver.findElement(By.cssSelector("#main-layout > div.clearfix.style-prefix-1ytu7n5 > div.style-prefix-say49q > div > div > div.info > div.product-size > div.size-container > div:nth-child(3)")).click();
//	  
//	  // Adding to Cart
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	  driver.findElement(By.cssSelector("#main-layout > div.clearfix.style-prefix-1ytu7n5 > div.style-prefix-say49q > div > div > div.info > div.actions-container > div:nth-child(1) > div")).click();
//	  
	  
	  driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]")).click();
      driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[1]")).click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      JavascriptExecutor js = (JavascriptExecutor) driver;
      WebElement shirt = driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[2]"));
      js.executeScript("arguments[0].scrollIntoView();", shirt);
      driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[2]")).click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")).click();
  }
  
  @Test(priority = 2)
  public void cart() {
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
		// Chrome Options 
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("start-maximized");
//		opt.addArguments("--disable--notifications");
//		
		// Driver Code
		driver = new ChromeDriver();   
		driver.get("http://cultsport.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
