package test;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase {
	@Test
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		//DesiredCapabilities HandleSSL = DesiredCapabilities.chrome();
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		opt.addArguments("disable-infobars");
		opt.addArguments("start-maximized");
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.petco.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"bx-close-inside-1805167\"]")).click();
		//Search
		driver.findElement(By.cssSelector("#header-search")).sendKeys("WholeHearted");		
		driver.findElement(By.xpath( "//*[@id=\"petco-header-render-node\"]/header/div[3]/div/div[1]/form/button[2]")).click(); 
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"product_tile_val_4137502\"]")));
		
		JavascriptExecutor j = (JavascriptExecutor) driver; 
		WebElement element1 =driver.findElement(By.xpath("//*[@id=\"catalogEntry_img4137502\"]"));
		j.executeScript("arguments[0].scrollIntoView();", element1);
		
		driver.findElement(By.xpath("//*[@id=\"product_tile_val_4137502\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"cf-challenge-hcaptcha-wrapper\"]/div[2]/iframe")));
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkbox\"]"))).click();

		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/form/div[7]/button")).click();
			
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait element =new WebDriverWait(driver,Duration.ofSeconds(5));
//		element.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"shop-by-pet\\\"]/div/div/div[1]/a")));
		
//		JavascriptExecutor j = (JavascriptExecutor) driver; 
//		WebElement ele1 =driver.findElement(By.xpath("//*[@id=\"shop-by-pet\"]/div/div/div[1]/img"));
//		j.executeScript("arguments[0].scrollIntoView();", ele1);
//		
//		driver.findElement(By.xpath("//*[@id=\"shop-by-pet\"]/div/div/div[1]/a")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		WebElement ele =driver.findElement(By.xpath("//*[@id=\"shop-by-category\"]/div/div[2]/div[2]/div[1]/img"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		
//		driver.findElement(By.xpath("//*[@id=\"shop-by-category\"]/div/div[2]/div[2]/div[1]/img")).click();
	}
}
