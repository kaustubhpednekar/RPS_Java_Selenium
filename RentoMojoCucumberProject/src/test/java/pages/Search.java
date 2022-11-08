package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	public Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "form-control")
	private WebElement search;

	public void searchClick(String furn, WebDriver driver) {
		Actions act = new Actions(driver);
//		Thread.sleep(8000);
		act.click(search).build().perform();
		search.sendKeys(furn);

	}

	public void enterClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	}

	public void navigate(WebDriver driver) {
		driver.navigate().to("https://www.rentomojo.com");
	}

}

//	
//	public void searchAction(String furn) throws InterruptedException {
//		Actions act=new Actions(driver);
//		Thread.sleep(8000);
//		act.click(search).build().perform();
//		search.sendKeys(furn);
//		act.sendKeys(Keys.ENTER).build().perform();
