package test;

import org.testng.annotations.Test;

import utility.ExcelUtils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import utility.ExcelUtils;

public class DataProviderWithExcel {
	WebDriver driver;
	String testCaseName;
	int testCaseRow;
  @Test(dataProvider="Auth")
  public void f(String user, String pass) {
	  WebElement uname = driver.findElement(By.id("username"));
	  uname.clear();
	  uname.sendKeys(user);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.className("login_button")).click();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
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
  public Object[][] Auth() throws Exception{
	  ExcelUtils.setExcelFile("C:\\Users\\Administrator\\Java Workplace\\DataDrivenDemo\\src\\test\\java\\testData\\TestData.xlsx", "Sheet1");
	  testCaseName = this.toString();
	  testCaseName = ExcelUtils.getTestCaseName(this.toString());
	  testCaseRow = ExcelUtils.getRowContent(testCaseName, 0);
	  Object[][] testObjectArray = ExcelUtils.getTableArray("C:\\Users\\Administrator\\Java Workplace\\DataDrivenDemo\\src\\test\\java\\testData\\TestData.xlsx", "Sheet1",testCaseRow);
	  return (testObjectArray);
  }

}
