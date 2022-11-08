package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class EmailLogin {
	WebDriver driver;
  @Test
  public void eMail() throws InterruptedException {
	  
	  	 driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-4g6ai3 > div > div > img")).click();
	  	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  	 driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1nr9jr0 > div.style-prefix-qtcbab > button > div > div > div.style-prefix-7kp13n > img:nth-child(2)")).click();
	  	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div.style-prefix-46b038 > div > span > div:nth-child(2) > button > div > div.style-prefix-u8x7nc > img")).click();
	  	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-0 > input")).sendKeys("namansharma03020@gmail.com");
	  	 Thread.sleep(3000);
	  	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-ej336q > button > div")).click();
	  	 //Thread.sleep(20000);
	  	 Scanner obj = new Scanner(System.in);  
		 System.out.println("Enter OTP");
		 String passWord = obj.nextLine(); 
	  	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div > div.style-prefix-1thztxf > div.style-prefix-17754hw > input")).sendKeys(passWord);
	  	 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div > div.style-prefix-1thztxf > div.style-prefix-1ykdma4 > button")).click();
	  	 Thread.sleep(5000);
	  	 obj.close();
	  	 
  }
  @Test
  public void menModule() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/h3")).click();
	  driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-1u4kqgz > div > div > ul > li:nth-child(3) > ul > li:nth-child(3) > a > h3")).click();
	  
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
	  Thread.sleep(5000);
  }
  @Test(priority = 1)
  public void womenModule() throws InterruptedException {
	  Actions a = new Actions(driver);
      a.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]"))).build().perform();
      a.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]/ul/li[3]/a"))).click().build().perform();
      Thread.sleep(4000);
      
      WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img"));
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView(true);", tshirt);
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")).click();
      Thread.sleep(3000);
      WebElement add = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]"));
      add.click();
      Thread.sleep(5000);
  }
  @Test(priority = 2)
  public void thirdModule() {
	  //selecting footwears
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/h3")).click();
      driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[2]/a/h3")).click();

      //pressing flipflops
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[1]/div/div[1]/label")).click();
      
      //selecting flipflops 
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.findElement(By.cssSelector("#plp-container > div.animate-tb > div > div:nth-child(1) > a > div > div.style-prefix-1xgnd8t")).click();
    
      //Choosing size 
      driver.findElement(By.cssSelector("#main-layout > div.clearfix.style-prefix-1ytu7n5 > div.style-prefix-say49q > div > div > div.info > div.product-size > div.size-container > div:nth-child(2)")).click();

      //Adding to cart
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.findElement(By.cssSelector("#main-layout > div.clearfix.style-prefix-1ytu7n5 > div.style-prefix-say49q > div > div > div.info > div.actions-container > div:nth-child(1) > div")).click();
  }
  @Test(priority = 3)
  public void cartOpening() {
	  
	  driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-1h5x3dy > div > div.style-prefix-52lhj0 > img")).click();
	  driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-1h5x3dy > div > div:nth-child(3) > div > div > div.style-prefix-7128mx > button")).click();
	 
//	  // Selecting Address
//	  driver.findElement(By.cssSelector("#checkout-option-container > div.checkout-button-container > button")).click();
//	  driver.findElement(By.cssSelector("#checkoutAddressModal > div.style-prefix-pbmsma > div > div > div.style-prefix-py08r0 > div > button")).click();
//	  
//	  // Add New Address
	  
	 // driver.findElement(By.cssSelector("#checkout-option-container > div.checkout-button-container > button")).click();
//	  if(driver.getTitle().equals("Adactin.com - Search Hotel"))
//		{
//			test.log(Status.PASS, "Successfully Logged In");
//			Screenshot s = new AShot().takeScreenshot(driver);
//			try {
//				ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\Administrator\\JAVA Workspace\\ExtentReportDemo\\img1.png"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			test.pass(MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Administrator\\JAVA Workspace\\ExtentReportDemo\\img1.png").build());
//		
//		}
//		else
//		{
//			//test.log(Status.FAIL, "Invalid Login");
//			Screenshot s = new AShot().takeScreenshot(driver);
//			try {
//				ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\Administrator\\JAVA Workspace\\ExtentReportDemo\\img.png"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			test.fail(MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Administrator\\JAVA Workspace\\ExtentReportDemo\\img.png").build());
//		}
  
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
