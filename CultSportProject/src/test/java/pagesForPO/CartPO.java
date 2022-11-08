package pagesForPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPO {
	
	public CartPO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[3]/div/div[2]/img")
	private WebElement carticon;
	
	@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[3]/div/div[3]/div/div/div[2]/button")
	private WebElement bookNowbtn;
	
	public void clickOntoCartButton() throws InterruptedException {
		carticon.click();
		Thread.sleep(2000);
	}
	
	public void clickOntoBookNowbtn() {
		bookNowbtn.click();
	}

}
