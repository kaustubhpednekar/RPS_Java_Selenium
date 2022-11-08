package newTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class WomenModule {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
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
