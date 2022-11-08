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
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NetMeds {
	WebDriver driver;
//	@Test(priority=1)
//	public void login() throws Exception
//	{
//		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[5]/div/a[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"loginfirst_mobileno\"]")).sendKeys("7411920347");
//		driver.findElement(By.xpath("//*[@id=\"app\"]/main/app-login/div[1]/div/div[1]/div[2]/div/div[1]/form/div[2]/button")).click();
//		Thread.sleep(40000);
//		
//	}
  @Test(priority=1)
  public void medicineDropDown() throws InterruptedException 
  {
	  
	  Actions act = new Actions(driver);
	  WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[1]"));
	  act.moveToElement(mainMenu).build().perform();
	  
	  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[1]/ul/li[1]/a")).click();	
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 // driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
	  
	  JavascriptExecutor j = (JavascriptExecutor) driver; 
	  WebElement element1 =driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/h1"));
	  j.executeScript("arguments[0].scrollIntoView();", element1);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//*[@id=\"list-nav\"]/div[1]/ul/li[2]/a")).click();		
	  driver.findElement(By.xpath("//*[@id=\"list-nav-nav\"]/div/a[4]")).click();	
	  driver.findElement(By.linkText("D Acne Soap 75gm")).click();	
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  WebElement element2 =driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[1]/h1"));
	  js.executeScript("arguments[0].scrollIntoView();", element2);

	  WebElement web = driver.findElement(By.xpath("//*[@id=\"pincode\"]"));
	  web.clear();
	  web.sendKeys("110044");
	  driver.findElement(By.xpath("//*[@id=\"check_expiry_btn\"]/i")).click();
	// System.out.println(driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[10]/div[3]/div/span[1]")).getText());
	 
	 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[8]/form/div/button/span[1]")).click();	
	 System.out.println(driver.getTitle());
	 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[8]/form/div/button[2]")).click();
	 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[8]/form/div/button[1]")).click();
	 
	 Reporter.log("This is Medicine Drop Down test");	
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-infobars");
		opt.addArguments("start-maximized");
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://www.netmeds.com/");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
