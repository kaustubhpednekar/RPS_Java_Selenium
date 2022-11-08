package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		//new Select(driver.findElement(By.cssSelector("#oldSelectMenu"))).selectByIndex(4);
		new Select(driver.findElement(By.cssSelector("#oldSelectMenu"))).selectByVisibleText("Magenta");
		
		

	}

}
