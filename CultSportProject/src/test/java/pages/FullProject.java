package pages;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FullProject {
		static WebDriver driver;
		
		
		public FullProject(WebDriver driver)
		{
			FullProject.driver = driver;
		}
		
//		// Login Module using email
//		@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[2]/div/div/img")
//	WebElement loginbtn;
//	
//		@FindBy(xpath = "//*[@id=\"phoneloginModal\"]/div[3]/div/div/div[2]/div/div[2]/div[3]/button/div/div/div[2]/img[2]")
//	WebElement emailicn;
//	
//		@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div[2]/div/span/div[2]/button/div/div[1]/img")
//	WebElement emailicn1;
//	
//		@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div/div[2]/div/div[1]/input")
//	WebElement loginPage;
//	
//	@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/button/div")
//	WebElement continuebtn;
//	
//	@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div/div/div[2]/div[1]/input")
//	WebElement oTP;
//	
//	@FindBy(xpath = "//*[@id=\"loginModal\"]/div[3]/div/div/div/div/div/div/div/div[2]/div[2]/button")
//	WebElement confirmBtn;
//	
//	// Women Module
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
//	// CART Module
//	@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[3]/div/div[2]/img")
//	WebElement carticon;
//	
//	@FindBy(xpath = "//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[3]/div/div[3]/div/div/div[2]/button")
//	WebElement bookNowbtn;
//	
//	public void clickingOntoLoginButton() throws InterruptedException {
//		loginbtn.click();
//		Thread.sleep(3000);
//	}
//	
//	public void clickOntoEmailIcon() {
//		emailicn.click();
//	}
//	
//	public void clickOntoEmailIcon1() {
//		emailicn1.click();
//	}
//	
//	public void enterTheValuesInLoginPage(String emailID) throws InterruptedException {
//		loginPage.sendKeys(emailID);
//		Thread.sleep(3000);
//		//loginPage.click();
//	}
//	
//	public void clickOntoContinuebtn() throws InterruptedException {
//		continuebtn.click();
//		Thread.sleep(5000);
//	}
//	
//	public void oTPPassword() throws InterruptedException {
//		 Scanner obj = new Scanner(System.in);  
//		 System.out.println("Enter OTP");
//		 String passWord = obj.nextLine(); 
//		 oTP.sendKeys(passWord);
//		 Thread.sleep(3000);
//		 obj.close();
//		 
//	}
//	
//	public void continueButtonOnOTPpage() throws InterruptedException {
//		confirmBtn.click();
//		Thread.sleep(5000);
//	}
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
//	public void clickOntoCartButton() {
//		carticon.click();
//	}
//	
//	public void clickOntoBookNowbtn() {
//		bookNowbtn.click();
//	}
//	

}
