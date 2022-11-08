package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class LoginTestCase  {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		LoginPage log = new LoginPage(driver);
		log.enterUsername("vasuvespag");
		log.enterPassword("vasu1234");
		log.loginClick();
		
	}

}
