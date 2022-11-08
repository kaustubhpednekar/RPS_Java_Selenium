package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		act.moveToElement(slide,150,0).perform();
		slide.click();
	}

}
