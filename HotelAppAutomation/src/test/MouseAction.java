package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement mobEle = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
        act.click(mobEle).build().perform();
        WebElement elecEle = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
        act.doubleClick(elecEle).build().perform();
        act.contextClick().build().perform();
	}

}
