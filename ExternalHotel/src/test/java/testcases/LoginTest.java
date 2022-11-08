package testcases;
import pages.LoginPage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataProvider.ConfigFileReader;
public class LoginTest {

	public static void main(String[] args) 
	{
		ConfigFileReader conRead=new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver",conRead.getDriverPath());
		WebDriver driver = new ChromeDriver();
		String url = conRead.getAppUrl();
		driver.get(url);
		String uName = conRead.getUsename();
		String pwd = conRead.getPassword();
		
		
		LoginPage1 loginpg = new LoginPage1(driver);
		loginpg.loginAction(uName, pwd);

	}

}
