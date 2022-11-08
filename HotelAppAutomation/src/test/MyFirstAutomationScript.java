package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MyFirstAutomationScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		
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
		
		driver.close();
	}

}
