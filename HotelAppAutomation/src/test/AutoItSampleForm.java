package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoItSampleForm {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement demo = driver.findElement(By.id("uploadfile"));
		j.executeScript("arguments[0].scrollIntoView();",demo);
		 
		/*
		 * WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id("uploadfile")));
		 */
	    //demo.click();
		//driver.findElement(By.id("uploadfile")).click();
		//j.executeScript("arguments[0].click;", demo);
		
		Actions act = new Actions(driver);
		act.moveToElement(demo).click().perform();
		Runtime.getRuntime().exec("C:\\kaustubh\\sampleForm.exe");
		
    
	}

}
