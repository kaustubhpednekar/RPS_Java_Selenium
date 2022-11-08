package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class WomenModule {
	
	static WebDriver driver;
	
	
	public WomenModule(WebDriver driver)
	{
		WomenModule.driver = driver;
	}
	
	@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]/h3")
	WebElement women;
	
	@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]/ul/li[3]/a")
	WebElement tshirt;
	
	@FindBy(xpath="//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")
	WebElement tshirtImage;
	
	@FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]")
	WebElement addToCart;
	
	
	public void hoverToWomen() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(women).build().perform();
		Thread.sleep(3000);
	}
	
	public void clickTshirts() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(tshirt).click().build().perform();
		Thread.sleep(3000);
	}
	
	public void scrollTo() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", tshirtImage);
		Thread.sleep(3000);
	}
	
	public void selectTshirt() throws InterruptedException {
		tshirtImage.click();
		Thread.sleep(3000);
	}
	
	public void addToCart() throws InterruptedException {
		addToCart.click();
		Thread.sleep(3000);
	}
}