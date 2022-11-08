package pages;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class BestSellerModule {
	WebDriver driver;
	
	public BestSellerModule(WebDriver driver) {
	this.driver=driver;
	}
	 
	@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/h3")
	WebElement a;
	public void bests() throws InterruptedException {
	a.click();
	Thread.sleep(2000);
	}
	
	@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/ul/li/a/h3")
	WebElement b;
	public void tops() throws InterruptedException {
	b.click();
	Thread.sleep(2000);
	}
	@FindBy(xpath="//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")
	WebElement c;
	public void item() throws InterruptedException {
	c.click();
	Thread.sleep(2000);
	}
	@FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")
	WebElement d;
	public void cart() {
	d.click();
	}
	 
	
	}