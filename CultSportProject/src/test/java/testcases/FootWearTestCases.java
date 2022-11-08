package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.*;

public class FootWearTestCases {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cultsport.com");
		driver.manage().window().maximize();
		
		FootWear fw = PageFactory.initElements(driver, FootWear.class);
		fw.hoverToMen();
		fw.clickFootwear();
		fw.scrolling();
		fw.selectFlipFlops();
		fw.selectSize();
		fw.cartAdd();
	}

}
