package com.stepDefinition;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.SelectCity;
import pages.Login;
import pages.Search;
import pages.Category;
import pages.Item;
import pages.AddCart;

public class Test_Steps {
	public static WebDriver driver;
	static SelectCity selectCityPg;
	static Login loginPg;
	static Search searchPg;
	static Category categoryPg;
	static Item itemPg;
	static AddCart addPg;

	@Given("User is on Rentomojo homepage")
	public void user_is_on_Rentomojo_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Tridisha\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rentomojo.com");
		driver.manage().window().maximize();
	}

	@When("User selects city")
	public void user_selects_city() {
//		WebElement city=driver.findElement(By.xpath("//*[@id=\"citySelector\"]/li[1]"));
//		  city.click();
		selectCityPg = new SelectCity(driver);
		selectCityPg.SelectCityAction();
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
//		 driver.findElement(By.xpath("//*[@id=\"top\"]/div[3]/div/div/div/div[2]/ul[1]/li[2]/button/div")).click();
		loginPg = new Login(driver);
		loginPg.loginClick();
	}

	@When("User enters Number")
	public void user_enters_number() {
//		driver.findElement(By.xpath("//*[@id=\"phoneNumberInput\"]")).sendKeys("8667225215");
		loginPg.enterPh("7086108456");
	}

	@When("User clicks on Continue Button")
	public void user_clicks_on_continue_button() {
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/div/div[2]/form/div[2]/button")).click();
		loginPg.submitClick();
	}

	@When("User enters Otp")
	public void user_enters_otp() throws InterruptedException {
		Thread.sleep(12000);
	}

	@When("User clicks on Continue2 button")
	public void user_clicks_on_continue2_button() {
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/div/div[2]/form/div[2]/button")).click();
		loginPg.submitClick();
	}

	@When("User searches for a product")
	public void user_searches_for_a_product() throws InterruptedException {
		Thread.sleep(8000);

//	      Actions act=new Actions(driver);

//	      WebElement mobileElement = driver.findElement(By.className("form-control"));
//			act.click(search).build().perform(); 
//			mobileElement.sendKeys("bed");
		searchPg = new Search(driver);
		searchPg.searchClick("bed", driver);

	}

	@When("User clicks enter")
	public void user_clicks_enter() {
//		Actions act=new Actions(driver);
//		 WebElement mobileElement = driver.findElement(By.className("form-control"));
//		 act.sendKeys(Keys.ENTER).build().perform();
		searchPg.enterClick(driver);
	}

	@When("User navigates back to homepage")
	public void user_navigates_back_to_homepage() {
//		 driver.navigate().to("https://www.rentomojo.com");
		searchPg.navigate(driver);
	}

	@When("User selects furnitures in category")
	public void user_selects_furnitures_in_category() {
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		  js.executeScript("scroll(0,200)");
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		  driver.findElement(By.cssSelector("#app > div.application--wrap > main > div > div.view > div > div.rm-category__home > div > div:nth-child(2) > div > ul > li:nth-child(2)")).click();
		categoryPg = new Category(driver);
		categoryPg.categoryClick(driver);
	}

	@When("User clicks on Bedroom Item")
	public void user_clicks_on_bedroom_item() {
//		driver.findElement(By.cssSelector("#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(1) > div")).click();
		itemPg = new Item(driver);
		itemPg.itemclick(driver);
	}

	@When("User selects product")
	public void user_selects_product() {
//		Actions act=new Actions(driver);
//		WebElement mainMenu=driver.findElement(By.cssSelector("#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div.col-md-9 > div.cat-items > div.row.row-flexed > div:nth-child(3) > a > div > div.cat-item--img"));
//		act.moveToElement(mainMenu).perform();
//		driver.findElement(By.cssSelector("#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div.col-md-9 > div.cat-items > div.row.row-flexed > div:nth-child(3) > a > div > div.pa-3 > div.rm-quickview__container")).click();
		addPg = new AddCart(driver);
		addPg.selectAction(driver);

	}

	@When("User clicks on Add to cart button")
	public void user_clicks_on_add_to_cart_button() {
//		driver.findElement(By.cssSelector("#app > div.dialog__content.dialog__content__active > div > div.dialog-content > div > div.col-md-6.rm-product__details > div > div.rm-buttons > div > button")).click();
		addPg.addedAction();
	}

	@When("User clicks on View cart button")
	public void user_clicks_on_view_cart_button() {
//		driver.findElement(By.cssSelector("#app > div.dialog__content.dialog__content__active > div > div.dialog-content > div > div.col-md-6.rm-product__details > div > div.rm-buttons > div > a")).click();
		addPg.viewAction(driver);
	}

	@Then("View Cart Page is displayed")
	public void view_cart_page_is_displayed() {
		String expectedTitle = "Bedroom Furniture on Rent in Bangalore | Rent Now @RentoMojo";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
	}

}
