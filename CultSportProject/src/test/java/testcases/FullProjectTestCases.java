package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.*;

public class FullProjectTestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cultsport.com/");
		driver.manage().window().maximize();
		
		LoginThroughEmail l = PageFactory.initElements(driver, LoginThroughEmail.class);
		l.clickingOntoLoginButton();
		l.clickOntoEmailIcon();
		l.clickOntoEmailIcon1();
		l.enterTheValuesInLoginPage("namansharma03020@gmail.com");
		l.clickOntoContinuebtn();
		l.oTPPassword();
		l.continueButtonOnOTPpage();
		
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
