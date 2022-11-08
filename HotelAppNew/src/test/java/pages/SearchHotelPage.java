package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage 
{
	WebDriver driver;
	
	By loc = By.name("location");
	By hotel = By.id("hotels");
	By roomType = By.id("room_nos");
	By submit = By.cssSelector("#Submit");
	
	public SearchHotelPage(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	public void chooseLoc(String location)
	{
		new Select(driver.findElement(loc)).selectByVisibleText(location);
	}
	
	public void chooseHotel(String hotelName)
	{
		new Select(driver.findElement(hotel)).selectByVisibleText(hotelName);
	}
	
	public void chooseRoom(String room)
	{
		new Select(driver.findElement(roomType)).selectByVisibleText(room);
	}
	
	public void chooseSubmit()
	{
		driver.findElement(submit).click();
	}
	
	
	

}
