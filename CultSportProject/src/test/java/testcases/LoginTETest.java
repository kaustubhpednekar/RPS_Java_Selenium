package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.*;
public class LoginTETest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cultsport.com/");
		driver.manage().window().maximize();
		
		LoginThroughEmail l = PageFactory.initElements(driver, LoginThroughEmail.class);
		l.clickingOntoLoginButton();
		l.clickOntoEmailIcon();
		l.clickOntoEmailIcon1();
		l.enterTheValuesInLoginPage("namansharma03020@gmail.com");
		l.clickOntoContinuebtn();
		l.oTPPassword();
		l.continueButtonOnOTPpage();
	}

}
