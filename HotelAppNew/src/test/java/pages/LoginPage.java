package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	By uName = By.id("username");
	By pwd = By.id("password");
	By logButton = By.id("login");
	
	public LoginPage(WebDriver driver2) 
	{
		this.driver = driver2;
	}

	public void enterUsername(String user)
	{
		driver.findElement(uName).sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(pwd).sendKeys(pass);
	}
	
	public void loginClick()
	{
		driver.findElement(logButton).click();
	}

}
