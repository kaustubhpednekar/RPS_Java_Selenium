package test;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.partialLinkText("Go back to")).click();
		List<WebElement>InList = driver.findElements(By.tagName("input"));
		System.out.println(InList.size());
		for(WebElement InElement:InList)
		{
			System.out.println(InElement.getAttribute("name"));
		}

	}

}
