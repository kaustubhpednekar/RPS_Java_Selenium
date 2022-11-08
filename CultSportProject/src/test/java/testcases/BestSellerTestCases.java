package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;
 
public class BestSellerTestCases {
	 
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.cultsport.com");
	driver.manage().window().maximize();
	
	BestSellerModule bestsp = PageFactory.initElements(driver, BestSellerModule.class);
	bestsp.bests();
	bestsp.tops();
	bestsp.item();
	bestsp.cart();
	}
	 
	}