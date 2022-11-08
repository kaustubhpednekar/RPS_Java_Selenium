package com.stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class TestSteps {
	LoginPage loginpg;
	public static WebDriver driver;
	public String ExpectedOutput="Hello vasuvespag!";
	@Given("User is on HotelApp homepage")
	public void user_is_on_hotel_app_homepage() {	   
	    System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromeDriver106\\chromedriver.exe");
		//create an object of webdriver
		driver = new ChromeDriver();
		//navigate to webapplication
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		loginpg =new LoginPage(driver);
	}

	@When("user enters username")
	public void user_enters_username() {
	   
//		  WebElement uname=driver.findElement(By.id("username"));
//			uname.clear();
//			uname.sendKeys("vasuvespag");
		
		loginpg.enterUname("vasuvespag");
		
	}

	@When("User enters Password")
	public void user_enters_password() {
//		driver.findElement(By.name("password")).clear();
//		driver.findElement(By.name("password")).sendKeys("vasu1234");
		loginpg.enterPWD("vasu1234");
	}

	@When("user clicks on LoginButton")
	public void user_clicks_on_login_button() {
		//driver.findElement(By.className("login_button")).click();
		loginpg.clickLoginBtn();
	}
	

	@Then("Login is Successful")
	public void login_is_successful() {
		WebElement Greeting=driver.findElement(By.name("username_show"));
		String actualOutput=Greeting.getAttribute("value");
		Assert.assertEquals(ExpectedOutput,actualOutput);
		
	}
	
	@When("user Selects location")
	public void user_selects_location() {
		new Select(driver.findElement(By.cssSelector("#location"))).selectByIndex(1);
	}

	@When("user clicks on search Button")
	public void user_clicks_on_search_button() {
		driver.findElement(By.id("Submit")).click();
	}

	@Then("list of Hotels is displayed")
	public void list_of_hotels_is_displayed() {
	    String ExpectedTitle ="Adactin.com - Select Hotel";
	    String actualTitle=driver.getTitle();
	    Assert.assertEquals(ExpectedTitle,actualTitle);
	    
	}
	@When("user selects a radio button")
	public void user_selects_a_radio_button() {
		driver.findElement(By.id("radiobutton_1")).click();
	}

	@When("user clicks continue")
	public void user_clicks_continue() {
		driver.findElement(By.id("continue")).click();

	}

	@Then("Book a hotel page is displayed")
	public void book_a_hotel_page_is_displayed() {
		 String ExpectedTitle ="Adactin.com - Book A Hotel";
		 String actualTitle=driver.getTitle();
		 Assert.assertEquals(ExpectedTitle,actualTitle);
	}
//	@When("user enters username as {string}")
//	public void user_enters_username_as(String string) {
//		 WebElement uname=driver.findElement(By.id("username"));
//			uname.clear();
//			uname.sendKeys(string);
//	}
//
//	@When("User enters password as {string}")
//	public void user_enters_password_as(String string) {
//		driver.findElement(By.name("password")).clear();
//		driver.findElement(By.name("password")).sendKeys(string);
//	}
	@When("user enters username as <{string}>")
	public void user_enters_username_as(String string) {
		 WebElement uname=driver.findElement(By.id("username"));
		 uname.clear();
		 uname.sendKeys(string);
	}

	@When("User enters Password as <{string}>")
	public void user_enters_password_as(String string) {
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(string);
	}
	
	@When("user enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable userCredentials) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		//We can access only one row from the data table and no need of headers and footers
//	    List<List<String>> data = userCredentials.asLists(String.class);
//	    String username=data.get(0).get(0);
//	    String password=data.get(0).get(1);
//		 WebElement uname=driver.findElement(By.id("username"));
//		 uname.clear();
//		 uname.sendKeys(username);
//		 driver.findElement(By.name("password")).clear();
//		 driver.findElement(By.name("password")).sendKeys(password);
		//Use Maps When we have multiple datasets
		List<Map<String,String>> data = userCredentials.asMaps(String.class,String.class);
		for(Map<String,String> data1:data) {
			String username = data1.get("username");
			 WebElement uname=driver.findElement(By.id("username"));
			 uname.clear();
			 uname.sendKeys(username);
			String password = data1.get("password");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(password);
			
					
		}
	}
}
	    	
	



