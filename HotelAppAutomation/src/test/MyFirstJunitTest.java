package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class MyFirstJunitTest 
{
	public static WebDriver driver;
	public String ExpectedOutput = "Hello vasuvespag!";
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();		
	}
	
	@After
	public void tareDown()
	{
		driver.quit();
	}

	@Test
	public void hotelAppTest()
	{
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys("vasuvespag1");
		driver.findElement(By.id("password")).sendKeys("vasu1234");
		
		driver.findElement(By.className("login_button")).click();
		WebElement greeting = driver.findElement(By.id("username_show"));
		String actualOutput = greeting.getAttribute("value");
		Assert.assertEquals(ExpectedOutput, actualOutput);
		
	}
	
	
}
