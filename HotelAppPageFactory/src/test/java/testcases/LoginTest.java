package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();	
		
		LoginPage logPage = PageFactory.initElements(driver, LoginPage.class);
		logPage.loginAction("vasuvespag", "vasu1234");
		driver.quit();

	}

}
