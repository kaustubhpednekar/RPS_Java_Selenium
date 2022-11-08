package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FootWear {
	
static WebDriver driver;
	
	public FootWear(WebDriver driver) {
		FootWear.driver = driver;
	}
	
	@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/h3")
	WebElement men;
	
	@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[2]/a/h3")
	WebElement footwear;
	
	@FindBy(xpath="//*[@id=\"plp-container\"]/div[1]/div/div[1]")
	WebElement flipflops;
	
	@FindBy(xpath="//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")
	WebElement slflipflops;
	
	@FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")
	WebElement size;
	@FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")
	WebElement addcart1;
	
	public void hoverToMen() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(men).build().perform();
		Thread.sleep(3000);
	}
	
	public void clickFootwear() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(footwear).click().build().perform();
		Thread.sleep(3000);
	}
	
	public void scrolling() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(flipflops)).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true,5);", flipflops);
		Thread.sleep(3000);
	}
	public void selectFlipFlops() throws InterruptedException {
		slflipflops.click();
		Thread.sleep(3000);
	}
	public void selectSize() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(size).click().build().perform();
		Thread.sleep(3000);
	}
	public void cartAdd() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(addcart1).click().build().perform();
		Thread.sleep(3000);
	}
	
	
}