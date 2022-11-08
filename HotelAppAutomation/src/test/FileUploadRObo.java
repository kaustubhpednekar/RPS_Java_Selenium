package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRObo {

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.monsterindia.com/create_account.html");
		driver.manage().window().maximize();

		/*
		 * JavascriptExecutor j = (JavascriptExecutor)driver;
		 * j.executeScript("scroll(0.200)");
		 */
		
		 driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();
		 Robot r = new Robot();
		
		 StringSelection s = new StringSelection("C:\\kaustubh\\text.txt");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  r.keyPress(KeyEvent.VK_CONTROL); 
		  r.keyPress(KeyEvent.VK_V);
		  
		  r.keyRelease(KeyEvent.VK_CONTROL); 
		  r.keyRelease(KeyEvent.VK_V);
		  
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		 	
		
	}

}
