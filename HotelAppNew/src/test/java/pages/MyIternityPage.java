package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyIternityPage 
{
	WebDriver driver;
	By iternity = By.xpath("//*[@id=\"my_itinerary\"]");
		
	public MyIternityPage(WebDriver driver2) 
	{
		this.driver = driver2;
	}

	public void waitEx()
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"my_itinerary\"]")));
	}
	public void myIternity()
	{
	    driver.findElement(iternity).click();	
		System.out.println(driver.getTitle());	
	}	

}
