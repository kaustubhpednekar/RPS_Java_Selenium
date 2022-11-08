package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='top']/div[3]/div/div/div/div[2]/ul[1]/li[2]/button/div")
	private WebElement login;

	@FindBy(xpath = "//*[@id='phoneNumberInput']")
	private WebElement number;

	@FindBy(xpath = "//*[@id='app']/div[6]/div/div[2]/form/div[2]/button")
	private WebElement submit;

	public void loginClick() {
		login.click();
	}

	public void enterPh(String num) {
		number.sendKeys(num);
	}

	public void submitClick() {
		submit.click();
	}

//	public void loginAction(String num) throws InterruptedException {
//		login.click();
//		number.sendKeys(num);
//		submit.click();
//		Thread.sleep(10000);
//		submit.click();

}
