package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.*;

public class MenTestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cultsport.com/");
		driver.manage().window().maximize();
		
		MenModule m = PageFactory.initElements(driver, MenModule.class);
		m.clickmen();
		m.clicktshirt();
		m.clickproduct();
		m.clickcart();
		


	}

}
