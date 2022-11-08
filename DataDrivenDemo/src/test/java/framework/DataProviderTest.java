package framework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	WebDriver driver;
  @Test(dataProvider = "Auth")
  public void test(String user, String pass) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://adactinhotelapp.com");
	  driver.manage().window().maximize();
		
	  WebElement uname = driver.findElement(By.id("username"));
	  uname.clear();
	  uname.sendKeys(user);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.className("login_button")).click();
  }

  @DataProvider(name="Auth")
  public Object[][] credentials() {
    return new Object[][] {
    	{"vasuvespag","vasu1234"},
    	{"aryan1207","Aryan@120799"}
    };
  }
}
