package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectHotelPage 
{
	WebDriver driver;
	By hotelName = By.xpath("//*[@id=\"radiobutton_1\"]");
	By clickCont = By.xpath("//*[@id=\"continue\"]");
	
	public SelectHotelPage(WebDriver driver2) 
	{
		this.driver = driver2;
	}

	public void hotelSelection()
	{
		driver.findElement(hotelName).click();
	}
	
	public void okContinue()
	{
		driver.findElement(clickCont).click();
	}

}
