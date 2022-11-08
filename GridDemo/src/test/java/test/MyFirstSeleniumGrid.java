package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class MyFirstSeleniumGrid {

	public static void main(String[] args) throws MalformedURLException 
	{
       String baseUrl ="http:/adactinhotelapp.com";
       String gridUrl ="http://172.20.0.30:4444";
		
		/*
		 * ChromeOptions opt = new ChromeOptions(); opt.addArguments("start-maximized");
		 * opt.addArguments("chrome.switches","--disable--extensions");
		 * opt.addArguments("--enable-popup-blocking");
		 */
		 
			
		/*
		 * EdgeOptions op =new EdgeOptions(); op.addArguments("start-maximized");
		 * op.addArguments("--enable-popup-blocking");
		 */
			 
			
   	  DesiredCapabilities dCap =new DesiredCapabilities();
	   dCap.setCapability("browserName","MicrosoftEdge"); 
	   dCap.setCapability("version","106.0.1370.47"); //102.0.1245.33
			        
		  
       System.out.println("Starting execution in grid");
       WebDriver driver = new RemoteWebDriver(new URL(gridUrl),dCap); //instead of opt op for edge
       
       driver.get(baseUrl);
       WebElement uname = driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys("vasuvespag");
		driver.findElement(By.id("password")).sendKeys("vasu1234");
		
		driver.findElement(By.className("login_button")).click();
		WebElement greeting = driver.findElement(By.id("username_show"));
		System.out.println(greeting.getAttribute("value"));
		
		new Select(driver.findElement(By.cssSelector("#location"))).selectByVisibleText("Adelaide");
		new Select(driver.findElement(By.cssSelector("#hotels"))).selectByValue("Hotel Sunshine");
		
		driver.findElement(By.cssSelector("#Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"radiobutton_1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.name("first_name")).sendKeys("Manoj");
		driver.findElement(By.name("last_name")).sendKeys("Kumar");
		driver.findElement(By.id("address")).sendKeys("Housing Colony, Bangalore");
		driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("1234567890123456");
		
		new Select(driver.findElement(By.cssSelector("#cc_type"))).selectByVisibleText("VISA");
		new Select(driver.findElement(By.cssSelector("#cc_exp_month"))).selectByValue("10");
		new Select(driver.findElement(By.cssSelector("#cc_exp_year"))).selectByValue("2022");
		
		driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]")).sendKeys("087");
		driver.findElement(By.cssSelector("#book_now")).click();
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"my_itinerary\"]")));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"my_itinerary\"]")));
		
		
		WebElement wb = driver.findElement(By.cssSelector("#order_no"));
		System.out.println(wb.getAttribute("value"));
		 
		driver.findElement(By.xpath("//*[@id=\"my_itinerary\"]")).click();
		System.out.println(driver.getTitle());		
		
	}

}
