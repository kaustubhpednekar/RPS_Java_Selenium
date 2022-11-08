package pagesForPO;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTHroughEmailPO {
	
		public LoginTHroughEmailPO(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[2]/div/div/img")
	private WebElement loginbtn;
	
		@FindBy(xpath = "//*[@id=\"phoneloginModal\"]/div[3]/div/div/div[2]/div/div[2]/div[3]/button/div/div/div[2]/img[2]")
	private WebElement emailicn;
	
		@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div[2]/div/span/div[2]/button/div/div[1]/img")
	private WebElement emailicn1;
	
	@FindAll({
		@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div/div[2]/div/div[1]/input")
	//	@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/button/div")
	})
	private WebElement loginPage;
	
	@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/button/div")
	private WebElement continuebtn;
	
	@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div/div/div[2]/div[1]/input")
	private WebElement oTP;
	
	@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div/div/div[2]/div[2]/button")
	private WebElement confirmBtn;
	
	public void clickingOntoLoginButton() throws InterruptedException {
		loginbtn.click();
		Thread.sleep(3000);
	}
	
	public void clickOntoEmailIcon() {
		emailicn.click();
	}
	
	public void clickOntoEmailIcon1() {
		emailicn1.click();
	}
	
	public void enterTheValuesInLoginPage(String emailID) throws InterruptedException {
		loginPage.sendKeys(emailID);
		Thread.sleep(3000);
		//loginPage.click();
	}
	
	public void clickOntoContinuebtn() throws InterruptedException {
		continuebtn.click();
		Thread.sleep(5000);
	}
	
	public void oTPPassword() throws InterruptedException {
		 Scanner obj = new Scanner(System.in);  
		 System.out.println("Enter OTP");
		 String passWord = obj.nextLine(); 
		 oTP.sendKeys(passWord);
		 Thread.sleep(3000);
		 obj.close();
		 
	}
	
	public void continueButtonOnOTPpage() throws InterruptedException {
		confirmBtn.click();
		Thread.sleep(3000);
	}
}