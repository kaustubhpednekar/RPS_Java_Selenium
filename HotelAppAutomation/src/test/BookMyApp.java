package test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import org.apache.commons.*;

public class BookMyApp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("--disable-notifications");
		opt.addArguments("--incognito");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		opt.setCapability(ChromeOptions.CAPABILITY, opt);
		opt.merge(cap);

		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		Screenshot s = new AShot().takeScreenshot(driver);
		try {
			ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\Administrator\\Java Workplace\\HotelAppAutomation\\Screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
     	//File secshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     	
		driver.findElement(By.xpath("//img[@alt='PUNE']")).click();
		driver.findElement(By.xpath("//a[text()='Movies']")).click();
		
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver; WebElement ele =
		 * driver.findElement(By.xpath("//h2[text()='Recommended Movies']"));
		 * js.executeScript("arguments[0].scrollIntoView();", ele);
		 */
		
		 
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[3]/div[1]/div")));
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[3]/div[1]/div")).click();

		
		
		/*
		 * JavascriptExecutor js1 = (JavascriptExecutor) driver; WebElement
		 * ele2=driver.findElement(By.xpath(
		 * "//*[@id=\\\"component-1\\\"]/section/span/div/span"));
		 * js1.executeScript("arguments[0].scrollIntoView();", ele2);
		 */
		
		WebDriverWait ele1 =new WebDriverWait(driver,Duration.ofSeconds(10));
		ele1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"component-1\"]/section/span/div/span")));
		WebElement about = driver.findElement(By.xpath("//*[@id=\"component-1\"]/section/span/div/span"));
		System.out.println(about.getText());
		
		driver.close();
	
		
		
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"my_itinerary\"]")));
	}

}
