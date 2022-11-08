package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();		
		
		driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		String mainWindow = driver.getWindowHandle();
		//System.out.println(mainWindow);
		
		Set<String> set = driver.getWindowHandles();
		//List<String> windows = new ArrayList<String>(set);
		//driver.switchTo().window(windows.get(1));
		//System.out.println(driver.getTitle());
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String childWindow = itr.next();
			
			if(! mainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				//System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.quit();
		System.out.println("success");

	}

}
