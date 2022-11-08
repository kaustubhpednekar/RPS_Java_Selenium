package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps {
	WebDriver driver;
	String Expectedoutput = "Hello vasuvespag!";

	@Given("User is on the HotelApp HomePage")
	public void user_is_on_the_hotel_app_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Given Method");
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://Adactinhotelapp.com");

	}

	@When("User enters the username details")
	public void user_enters_the_username_details() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside When Method of username Method");
		WebElement uname = driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys("vasuvespag");

	}

	@When("User enters the Password details")
	public void user_enters_the_password_details() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside When Method of password");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("vasu1234");
	}

	@When("User clicks the Loginbutton")
	public void user_clicks_the_loginbutton() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside When Method of Login");
		driver.findElement(By.className("login_button")).click();
	}

	@Then("Login is successful")
	public void login_is_successful() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Then Method of login successful");

		WebElement greeting = driver.findElement(By.name("username_show"));
		String actualoutput = greeting.getAttribute("value");
		Assert.assertEquals(Expectedoutput, actualoutput);
		System.out.println(actualoutput);
	}

	@When("User selects location from the dropdown")
	public void user_selects_location_from_the_dropdown() {
		// Write code here that turns the phrase above into concrete actions
		new Select(driver.findElement(By.cssSelector("#location"))).selectByIndex(1);
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("reg_button")).click();
	}

	@Then("The List of Hotels is displayed")
	public void the_list_of_hotels_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		String expectedTitle = "Adactin.com - Search Hotel";
		String actualTitle = driver.getTitle();
		// Assert.assertEquals(expectedTitle,actualTitle);

	}

	@When("User selects a radio button")
	public void user_selects_a_radio_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"radiobutton_1\"]")).click();
		// radiobutton_1"
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}

	@Then("The Book a Hotel  page is displayed")
	public void the_book_a_hotel_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		String expectedTitle = "Adactin.com - Book A Hotel";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	/*
	 * @When("User enters the username as {string} details") public void
	 * user_enters_the_username_as_details(String string) { // Write code here that
	 * turns the phrase above into concrete actions WebElement
	 * uname=driver.findElement(By.id("username")); uname.clear();
	 * uname.sendKeys(string); }
	 * 
	 * @When("User enters the password as {string} details") public void
	 * user_enters_the_password_as_details(String string) { // Write code here that
	 * turns the phrase above into concrete actions
	 * driver.findElement(By.name("password")).clear();
	 * driver.findElement(By.name("password")).sendKeys(string); }
	 */
	@When("User enters the username as <{string}> details")
	public void user_enters_the_username_as_details(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebElement uname = driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys(string);
	}

	@When("User enters the Password as <{string}> details")
	public void user_enters_the_password_as_details(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("User enters Username and Password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable UserCredentials) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		/*
		 * List<List<String>> data=UserCredentials.asLists(String.class);
		 * 
		 * int s=data.size(); for i=0 to s:
		 * 
		 * String username=data.get(0).get(0); String password=data.get(0).get(1);
		 * WebElement uname=driver.findElement(By.id("username")); uname.clear();
		 * uname.sendKeys(username); driver.findElement(By.name("password")).clear();
		 * driver.findElement(By.name("password")).sendKeys(password);
		 */
		List<Map<String,String>> data=UserCredentials.asMaps(String.class,String.class);
		for (Map<String,String> data1:data) {
			String userName=data1.get("username");
			String passWord=data1.get("password");
			WebElement uname=driver.findElement(By.id("username")); uname.clear();
			uname.sendKeys(userName);
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(passWord);
			
		}
		

	}

}
