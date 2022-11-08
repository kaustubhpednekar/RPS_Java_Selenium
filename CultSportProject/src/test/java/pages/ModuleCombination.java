package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModuleCombination {

static WebDriver driver;
	
	
	public ModuleCombination(WebDriver driver)
	{
		ModuleCombination.driver = driver;
	}
	
//	// Women
//	@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]/h3")
//	WebElement women;
//	
//	@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]/ul/li[3]/a")
//	WebElement tshirt;
//	
//	@FindBy(xpath="//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")
//	WebElement tshirtImage;
//	
//	@FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]")
//	WebElement addToCart;
//	
//	
//	public void hoverToWomen() throws InterruptedException {
//		Actions a = new Actions(driver);
//		a.moveToElement(women).build().perform();
//		Thread.sleep(3000);
//	}
//	
//	public void clickTshirts() throws InterruptedException {
//		Actions a = new Actions(driver);
//		a.moveToElement(tshirt).click().build().perform();
//		Thread.sleep(3000);
//	}
//	
//	public void scrollTo() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", tshirtImage);
//		Thread.sleep(3000);
//	}
//	
//	public void selectTshirt() throws InterruptedException {
//		tshirtImage.click();
//		Thread.sleep(3000);
//	}
//	
//	public void addToCart() throws InterruptedException {
//		addToCart.click();
//		Thread.sleep(3000);
//	}
//	
//	//Best Seller
//	@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/h3")
//	WebElement a;
//	public void bests() throws InterruptedException {
//	a.click();
//	Thread.sleep(2000);
//	}
//	
//	@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/ul/li/a/h3")
//	WebElement b;
//	public void tops() throws InterruptedException {
//	b.click();
//	Thread.sleep(2000);
//	}
//	@FindBy(xpath="//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")
//	WebElement c;
//	public void item() throws InterruptedException {
//	c.click();
//	Thread.sleep(2000);
//	}
//	@FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")
//	WebElement d;
//	public void cart() {
//	d.click();
//	}
//	
//	// FootWear
//		@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/h3")
//		WebElement men;
//		
//		@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[2]/a/h3")
//		WebElement footwear;
//		
//		@FindBy(xpath="//*[@id=\"plp-container\"]/div[1]/div/div[1]")
//		WebElement flipflops;
//		
//		@FindBy(xpath="//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")
//		WebElement slflipflops;
//		
//		@FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")
//		WebElement size;
//		@FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")
//		WebElement addcart1;
//		
//		public void hoverToMen() throws InterruptedException {
//			Actions a = new Actions(driver);
//			a.moveToElement(men).build().perform();
//			Thread.sleep(3000);
//		}
//		
//		public void clickFootwear() throws InterruptedException {
//			Actions a = new Actions(driver);
//			a.moveToElement(footwear).click().build().perform();
//			Thread.sleep(3000);
//		}
//		
//		public void scrolling() throws InterruptedException {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			wait.until(ExpectedConditions.visibilityOf(flipflops)).click();
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView(true,5);", flipflops);
//			Thread.sleep(3000);
//		}
//		public void selectFlipFlops() throws InterruptedException {
//			slflipflops.click();
//			Thread.sleep(3000);
//		}
//		public void selectSize() throws InterruptedException {
//			Actions a = new Actions(driver);
//			a.moveToElement(size).click().build().perform();
//			Thread.sleep(3000);
//		}
//		public void cartAdd() throws InterruptedException {
//			Actions a = new Actions(driver);
//			a.moveToElement(addcart1).click().build().perform();
//			Thread.sleep(3000);
//		}
//	
//	// CART
//	@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[3]/div/div[2]/img")
//	WebElement carticon;
//	
//	@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[3]/div/div[3]/div/div/div[2]/button")
//	WebElement bookNowbtn;
//	
//	public void clickOntoCartButton() {
//		carticon.click();
//	}
//	
//	public void clickOntoBookNowbtn() throws InterruptedException {
//		bookNowbtn.click();
//		Thread.sleep(3000);
//	}
	
}