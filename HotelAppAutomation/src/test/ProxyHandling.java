package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProxyHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/basic_auth.php");
		
		Alert userName = driver.switchTo().alert();
		userName.sendKeys("guru99");
		userName.accept();
		
		Alert passWord = driver.switchTo().alert();
		passWord.sendKeys("guru99");
		passWord.accept();
		driver.manage().window().maximize();


	}

}
