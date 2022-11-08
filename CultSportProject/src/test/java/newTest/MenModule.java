package newTest;

import org.testng.annotations.Test;

import io.reactivex.rxjava3.functions.Action;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MenModule {
	WebDriver driver;
  @Test
  public void f() {
	  
	  Actions acp = new Actions(driver);
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
