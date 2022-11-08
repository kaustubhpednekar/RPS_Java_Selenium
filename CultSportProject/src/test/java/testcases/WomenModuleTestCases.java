package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.*;

public class WomenModuleTestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Naman\\chromedriver102win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cultsport.com/");
		driver.manage().window().maximize();
		
		WomenModule p = PageFactory.initElements(driver, WomenModule.class);
		p.hoverToWomen();
		p.clickTshirts();
		p.scrollTo();
		p.selectTshirt();
		p.addToCart();
	}

}