package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenModule {
		static WebDriver driver;
		
		public MenModule(WebDriver driver)
		{
			MenModule.driver = driver;
		}
		
		@FindBy(xpath="//*[@id=\\\"main-layout\\\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]")
		WebElement men;
		

		@FindBy(xpath="//*[@id=\\\"main-layout\\\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[1]")
		WebElement tshirt;
		
		

		@FindBy(xpath="//*[@id=\\\"plp-container\\\"]/div[2]/div/div[3]")
		WebElement product;
		
		

		@FindBy(xpath="//*[@id=\\\"main-layout\\\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")
		WebElement cart;
		
		

		public void clickmen() throws InterruptedException
		{
			
			Actions act = new Actions(driver);
			act.click(men).build().perform();
			Thread.sleep(3000);
	}
		
		public void clicktshirt() throws InterruptedException
		{
			tshirt.click();
			Thread.sleep(3000);
	}
		
		public void clickproduct() throws InterruptedException
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();", product);
			product.click();
			Thread.sleep(3000);
			
	}
		
		public void clickcart() throws InterruptedException
		{
			cart.click();
			Thread.sleep(3000);
	}
	}
