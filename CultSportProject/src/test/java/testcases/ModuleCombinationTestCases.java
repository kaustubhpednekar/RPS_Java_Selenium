package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.BestSellerModule;
import pages.CartModule;
import pages.FootWear;
import pages.WomenModule;

public class ModuleCombinationTestCases {

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
		
		BestSellerModule bestsp = PageFactory.initElements(driver, BestSellerModule.class);
		bestsp.bests();
		bestsp.tops();
		bestsp.item();
		bestsp.cart();
		
		FootWear fw = PageFactory.initElements(driver, FootWear.class);
		fw.hoverToMen();
		fw.clickFootwear();
		fw.scrolling();
		fw.selectFlipFlops();
		fw.selectSize();
		fw.cartAdd();
		
		CartModule c = PageFactory.initElements(driver, CartModule.class);
		c.clickOntoCartButton();
		c.clickOntoBookNowbtn();

		
	}

}
