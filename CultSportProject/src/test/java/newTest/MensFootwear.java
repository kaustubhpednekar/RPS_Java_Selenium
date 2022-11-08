package newTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MensFootwear {
	WebDriver driver;
  @Test
  public void f() {
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
