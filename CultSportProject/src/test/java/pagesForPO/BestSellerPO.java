package pagesForPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPO {
	

	public BestSellerPO(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/h3")
		private WebElement a;
		public void bests() throws InterruptedException {
		a.click();
		Thread.sleep(2000);
		}
		@FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/ul/li/a/h3")
		private WebElement b;
		public void tops() throws InterruptedException {
		b.click();
		Thread.sleep(2000);
		}
		@FindBy(xpath="//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")
		private WebElement c;
		public void item() throws InterruptedException {
		c.click();
		Thread.sleep(2000);
		}
		@FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")
		private WebElement d;
		public void cart() {
		d.click();
		}
		 

	}