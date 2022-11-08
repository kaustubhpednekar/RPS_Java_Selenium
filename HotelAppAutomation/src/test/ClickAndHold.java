package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement tileC = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		//act.clickAndHold(tileC).build().perform();
		WebElement tileK = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		//act.dragAndDrop(tileC, tileK).perform();
		int xoffset = tileK.getLocation().getX();
		int yoffset = tileK.getLocation().getY();
		System.out.println(xoffset+","+yoffset);
		int xoffset1 = tileC.getLocation().getX();
		int yoffset1 = tileC.getLocation().getY();
		xoffset1=(xoffset-xoffset1)+10;
		yoffset1=(yoffset-yoffset1)+20;
		
		act.dragAndDropBy(tileC, xoffset1, yoffset1).perform();
		
	}

}
