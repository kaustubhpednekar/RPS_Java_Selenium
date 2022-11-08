package test;

import org.testng.annotations.Test;

import utility.ExcelUtils;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderWithExcel01t {
	WebDriver driver;
  @Test(dataProvider = "dp")
 public void f(String user, String pass) {
	  WebElement uname = driver.findElement(By.id("username"));
	  uname.clear();
	  uname.sendKeys(user);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.className("login_button")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://adactinhotelapp.com");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() throws Exception {
	  Object[][] testObjectArray = ExcelUtils.getTableArray("C:\\Users\\Administrator\\Java Workplace\\DataDrivenDemo\\src\\test\\java\\testData\\TestData.xlsx", "Sheet1");
	  return (testObjectArray);
    }
  }

