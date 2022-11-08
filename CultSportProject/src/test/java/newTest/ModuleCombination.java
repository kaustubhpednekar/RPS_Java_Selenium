package newTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ModuleCombination {
	WebDriver driver;
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
