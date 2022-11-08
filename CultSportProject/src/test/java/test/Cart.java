package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
		// Changes from here !! 
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("--disable--notifications");
		
		// Okie code
		WebDriver driver = new ChromeDriver(opt);   //new ChromeDriver(); ->  ChromeDriver(opt);
		driver.get("http://cultsport.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[3]/div/div[2]/img")).click();
		
		Thread.sleep(1000);
		// When Cart is Empty
		//driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[3]/div/div[3]/div/div/div[2]/button/button")).click();
		
		//When cart is not empty
		driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[3]/div/div[3]/div/div/div[2]/button")).click();

	}

}
