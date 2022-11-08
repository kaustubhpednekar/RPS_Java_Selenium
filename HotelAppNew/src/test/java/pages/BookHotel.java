package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BookHotel 
{
	WebDriver driver;
	By fName = By.name("first_name");
	By lname = By.name("last_name");
	By address =By.id("address");
	By cardNo =By.xpath("//*[@id=\"cc_num\"]");
	By cardType =By.cssSelector("#cc_type");
	By month = By.cssSelector("#cc_exp_month");
	By year = By.cssSelector("#cc_exp_year");
	By cvv =By.xpath("//*[@id=\"cc_cvv\"]");
	By book =By.cssSelector("#book_now");
	
	public BookHotel(WebDriver driver2)
	{
		this.driver = driver2;
	}
	
	public void enterFname(String first)
	{
		driver.findElement(fName).sendKeys(first);
	}
	public void enterLname(String last)
	{
		driver.findElement(lname).sendKeys(last);
	}
	public void enterAddress(String addr)
	{
		driver.findElement(address).sendKeys(addr);
	}
	public void enterCardNo(String num)
	{
		driver.findElement(cardNo).sendKeys(num);
	}
	public void selectType(String type)
	{
		new Select(driver.findElement(cardType)).selectByVisibleText(type);
	}
	public void selectMonth(String mon)
	{
		new Select(driver.findElement(month)).selectByVisibleText(mon);
	}
	public void selectYear(String num)
	{
		new Select(driver.findElement(year)).selectByVisibleText(num);
	}
	public void selectCvv(String num1)
	{
		driver.findElement(cvv).sendKeys(num1);
	}	
	public void clickBook()
	{
		driver.findElement(book).click();
	}
	

}
