package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		driver.findElement(By.id("userName")).sendKeys("Mr. Manoj");
		driver.findElement(By.id("userEmail")).sendKeys("abcd@domain.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Pune Maharashtra");
		/*
		 * driver.findElement(By.id("currentAddress")).sendKeys(Keys.CONTROL);
		 * driver.findElement(By.id("currentAddress")).sendKeys("a");
		 * driver.findElement(By.id("currentAddress")).sendKeys(Keys.CONTROL);
		 * driver.findElement(By.id("currentAddress")).sendKeys("c");
		 * driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
		 * driver.findElement(By.id("permanentAddress")).sendKeys(Keys.CONTROL);
		 * driver.findElement(By.id("permanentAddress")).sendKeys("v");
		 */
		
		
		builder.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		builder.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		builder.sendKeys(Keys.TAB).build().perform();
		builder.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}

}
