package test;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimedAlert 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("timerAlertButton")).click();
		
		
		  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		  Alert alert1 = wait1.until(ExpectedConditions.alertIsPresent());
		 //System.out.println(alert1.getText()); 
		 // alert1.accept();
		 
		
		//fluent wait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoAlertPresentException.class);
		wait.until(ExpectedConditions.alertIsPresent());
		//Alert alert2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("timerAlertButton")));		
		System.out.println(alert1.getText());
		alert1.accept();
	}

}
