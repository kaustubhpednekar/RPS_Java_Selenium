package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pagesForPO.*;

public class Test_Steps {
	//WebDriver driver;             // for Cucumber 
	static WebDriver driver;		// Cucumber with POM
	static LoginTHroughEmailPO lg;
	static WomenModulePO wm;
	static BestSellerPO bsp;
	static MenModulePO mn;
	static FootWearModulePO fp;
	static CartPO cp;
/* ----------------------------------------------INDIVIDUAL MODULE-----------------------------------------*/	
	
//	@Given("User is on CultSport HomePage")
//	public void user_is_on_cult_sport_home_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//	}
//	
//	@When("User clicks onto Login Option")
//	public void user_clicks_onto_login_option() throws InterruptedException {
//		 driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-4g6ai3 > div > div > img")).click();
//		 Thread.sleep(1000);
//	  	 
//	}
//	
//	@When("User selects the Email Option")
//	public void user_selects_the_email_option() {
//		driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1nr9jr0 > div.style-prefix-qtcbab > button > div > div > div.style-prefix-7kp13n > img:nth-child(2)")).click();
//	  	 
//	}
//	
//	@When("User sign in with Email Option")
//	public void user_sign_in_with_email_option() {
//		driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div.style-prefix-46b038 > div > span > div:nth-child(2) > button > div > div.style-prefix-u8x7nc > img")).click();
//	  	 
//	}
//	
//	@When("User enter it's Email Address")
//	public void user_enter_it_s_email_address() throws InterruptedException {
//		driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-0 > input")).sendKeys("namansharma03020@gmail.com");
//	  	 Thread.sleep(3000);
//	}
//	
//	@When("User clicks on the Continue")
//	public void user_clicks_on_the_continue() throws InterruptedException {
//		 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-ej336q > button > div")).click();
//	  	 Thread.sleep(15000);
//	  	
//	}
//	
//	@When("User clicks on Continue after passing OTP")
//	public void user_clicks_on_continue_after_passing_otp() {
//		driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div > div.style-prefix-1thztxf > div.style-prefix-1ykdma4 > button")).click();
//	}
//	
//	@Then("User is logged in Successfully")
//	public void user_is_logged_in_successfully() {
//	   System.out.println("LOGIN SUCCESS");
//	}
//		
//	//--------------------------------------------------- Women
//	@Given("User is in Cultsport homepage")
//	public void user_is_in_cultsport_homepage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//	}
//
//	@When("User hovers on Women module")
//	public void user_hovers_on_women_module() throws InterruptedException {
//		Actions a = new Actions(driver);
//		WebElement women = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]/h3"));
//		a.moveToElement(women).build().perform();
//		Thread.sleep(3000);
//	}
//
//	@When("User clicks on Tshirts module")
//	public void user_clicks_on_tshirts_module() throws InterruptedException {
//	    WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]/ul/li[3]/a"));
//	    Actions a = new Actions(driver);
//		a.moveToElement(tshirt).click().build().perform();
//		Thread.sleep(3000);
//	}
//
//	@When("User scrolls down")
//	public void user_scrolls_down() throws InterruptedException  {
//		WebElement tshirtImage = driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", tshirtImage);
//		Thread.sleep(3000);
//	}
//
//	@When("User selects the first tshirt")
//	public void user_selects_the_first_tshirt() throws InterruptedException {
//		WebElement tshirtImage = driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img"));
//		tshirtImage.click();
//		Thread.sleep(3000);
//	}
//
//	@Then("User clicks Add to Cart")
//	public void user_clicks_add_to_cart() throws InterruptedException {
//	    WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]"));
//	    addToCart.click();
//	    Thread.sleep(3000);
//	}

//	
//	//Men
//	@Given("User is at Cultsport homepage")
//	public void user_is_at_cultsport_homepage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//	}
//
//	@When("User clicks on Men module")
//	public void user_clicks_on_men_module() throws InterruptedException {
//	    Actions act = new Actions(driver);
//	      WebElement men = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]"));
//	      act.click(men).build().perform();
//	      Thread.sleep(2000);
//	}
//
//	@When("User clicks on tshirts")
//	public void user_clicks_on_tshirts() throws InterruptedException {
//	    WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[3]/a"));
//	    Actions a = new Actions(driver);                 
//	    a.click(tshirt).build().perform();
//	    Thread.sleep(3000);
//	}
//
//	@When("User clicks on the product")
//	public void user_clicks_on_the_product() throws InterruptedException {
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    WebElement shirt = driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[3]"));
//	    js.executeScript("arguments[0].scrollIntoView();", shirt);
//	    driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[3]")).click();
//	    Thread.sleep(3000);
//	}
//
//	@Then("User clicks Add to Carts")
//	public void user_clicks_add_to_carts() {
//	    Actions act = new Actions(driver);
//	    WebElement cart = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div"));
//	    act.click(cart).build().perform();
//
//	}
//	
//	//BestSeller
//	@Given("user is on cultsport homepage")
//	public void user_is_on_cultsport_homepage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//	}
//	 
//	@When("user clicks on BestSellers")
//	public void user_clicks_on_best_sellers() throws InterruptedException {
//	driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/h3")).click();
//	  Thread.sleep(2000);
//	}
//	 
//	@When("user clicks on TopSelling")
//	public void user_clicks_on_top_selling() throws InterruptedException {
//	driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/ul/li/a/h3")).click();
//	  Thread.sleep(2000);
//	}
//	 
//	@When("user clicks on item")
//	public void user_clicks_on_item() throws InterruptedException {
//	driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")).click();
//	  Thread.sleep(2000);
//	}
//	 
//	@When("user adds item to cart")
//	public void user_adds_item_to_cart() {
//	driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")).click();
//	}
//	
	// FootWear Module 

//	@Given("User is on Cultsport homepage1")
//	public void user_is_on_cultsport_homepage1() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//	}
	
//	@When("User hovers on Men module1")
//	public void user_hovers_on_men_module1() throws InterruptedException {
//			Actions a = new Actions(driver);
//	        WebElement men=driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/h3"));
//	        a.moveToElement(men).build().perform();
//	        Thread.sleep(3000);
//	}
//	
//	@When("User clicks on Footwears")
//	public void user_clicks_on_footwears() throws InterruptedException {
//			Actions a = new Actions(driver);
//	        WebElement footwear=driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[2]/a/h3"));
//	        a.moveToElement(footwear).click().build().perform();
//	        Thread.sleep(3000);
//	}
//	
//	@When("User clicks on FlipFlops")
//	public void user_clicks_on_flip_flops() throws InterruptedException {
//		WebElement flipflops=driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[1]/div/div[1]"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(flipflops)).click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true,5);", flipflops);
//        Thread.sleep(3000);
//	}
//	
//	@When("User selects item1")
//	public void user_selects_item1() throws InterruptedException {
//		WebElement slflipflops=driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img"));
//        slflipflops.click();
//        Thread.sleep(3000);
//	}
//	
//	@When("User selects item size1")
//	public void user_selects_item_size1() throws InterruptedException {
//		Actions a = new Actions(driver);
//        WebElement size=driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]"));
//        a.moveToElement(size).click().build().perform();
//        Thread.sleep(3000);
//	}
//	
//	@Then("User clicks Add to Cart1")
//	public void user_clicks_add_to_cart1() throws InterruptedException {
//		Actions a = new Actions(driver);
//        WebElement addcart=driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div"));
//        a.moveToElement(addcart).click().build().perform();
//        Thread.sleep(3000);
//	}

	
//	// CART
//	
//	@Given("User can see cart icon")
//	public void user_can_see_cart_icon() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//	}
//	
//	@When("User open cart")
//	public void user_open_cart() {
//		driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-1h5x3dy > div > div.style-prefix-32s09s > img")).click();
//	}
//	
//	@When("User clicks on book now")
//	public void user_clicks_on_book_now() {
//		driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-1h5x3dy > div > div:nth-child(3) > div > div > div.style-prefix-7128mx > button")).click();
//	}
//	
//	@Then("Cart is Opened Successfully")
//	public void cart_is_opened_successfully() {
//	    System.out.println("Cart is Opened Successfully");
//	}
//	
	
	
/* --------------------------------------------------- FULL PROJECT-----------------------------------------*/	
	
/* ---------------------------------------------------Cucumber FrameWork------------------------------------*/
	
//	// Login Module
	@Given("User is on CultSport HomePage")
	public void user_is_on_cult_sport_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
		
		driver = new ChromeDriver();   
		driver.get("http://cultsport.com");
		driver.manage().window().maximize();
	}
	
	@When("User clicks onto Login Option")
	public void user_clicks_onto_login_option() throws InterruptedException {
		 driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-4g6ai3 > div > div > img")).click();
		 Thread.sleep(1000);
	  	 
	}
	
	@When("User selects the Email Option")
	public void user_selects_the_email_option() {
		driver.findElement(By.cssSelector("#phoneloginModal > div.style-prefix-pbmsma > div > div > div.style-prefix-mfhl81 > div > div.style-prefix-1nr9jr0 > div.style-prefix-qtcbab > button > div > div > div.style-prefix-7kp13n > img:nth-child(2)")).click();
	  	 
	}
	
	@When("User sign in with Email Option")
	public void user_sign_in_with_email_option() {
		driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div.style-prefix-46b038 > div > span > div:nth-child(2) > button > div > div.style-prefix-u8x7nc > img")).click();
	  	 
	}
	
	@When("User enter it's Email Address")
	public void user_enter_it_s_email_address() throws InterruptedException {
		driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-0 > input")).sendKeys("namansharma03020@gmail.com");
	  	 Thread.sleep(3000);
	}
	
	@When("User clicks on the Continue")
	public void user_clicks_on_the_continue() throws InterruptedException {
		 driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div.style-prefix-1axlim1 > div > div.style-prefix-ej336q > button > div")).click();
	  	 Thread.sleep(15000);
	  	
	}
	
	@When("User clicks on Continue after passing OTP")
	public void user_clicks_on_continue_after_passing_otp() throws InterruptedException {
		driver.findElement(By.cssSelector("#loginModal > div.style-prefix-pbmsma > div > div > div > div > div > div > div > div.style-prefix-1thztxf > div.style-prefix-1ykdma4 > button")).click();
		Thread.sleep(3000);
	}
	
	@Then("User is logged in Successfully")
	public void user_is_logged_in_successfully() {
	   System.out.println("LOGIN SUCCESS");
	}
	
	// Women Module
	@When("User hovers on Women module")
	public void user_hovers_on_women_module() throws InterruptedException {
		Actions a = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]/h3"));
		a.moveToElement(women).build().perform();
		Thread.sleep(3000);
	}

	@When("User clicks on Tshirts module")
	public void user_clicks_on_tshirts_module() throws InterruptedException {
	    WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[4]/ul/li[3]/a"));
	    Actions a = new Actions(driver);
		a.moveToElement(tshirt).click().build().perform();
		Thread.sleep(3000);
	}

	@When("User scrolls down")
	public void user_scrolls_down() throws InterruptedException  {
		WebElement tshirtImage = driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", tshirtImage);
		Thread.sleep(3000);
	}

	@When("User selects the first tshirt")
	public void user_selects_the_first_tshirt() throws InterruptedException {
		WebElement tshirtImage = driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img"));
		tshirtImage.click();
		Thread.sleep(3000);
	}

	@Then("User clicks Add to Cart")
	public void user_clicks_add_to_cart() throws InterruptedException {
	    WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]"));
	    addToCart.click();
	    Thread.sleep(3000);
	}

	
	// Men Module
	@When("User clicks on Men module")
	public void user_clicks_on_men_module() throws InterruptedException {
	    Actions act = new Actions(driver);
	      WebElement men = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]"));
	      act.click(men).build().perform();
	      Thread.sleep(2000);
	}

	@When("User clicks on tshirts")
	public void user_clicks_on_tshirts() throws InterruptedException {
	    WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[3]/a"));
	    Actions a = new Actions(driver);                 
	    a.click(tshirt).build().perform();
	    Thread.sleep(3000);
	}

	@When("User clicks on the product")
	public void user_clicks_on_the_product() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement shirt = driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[3]"));
	    js.executeScript("arguments[0].scrollIntoView();", shirt);
	    driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[3]")).click();
	    Thread.sleep(3000);
	}

	@Then("User clicks Add to Carts")
	public void user_clicks_add_to_carts() {
	    Actions act = new Actions(driver);
	    WebElement cart = driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div"));
	    act.click(cart).build().perform();

	}
		
	// Best Seller
	@When("user clicks on BestSellers")
	public void user_clicks_on_best_sellers() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/h3")).click();
	  Thread.sleep(2000);
	}
	 
	@When("user clicks on TopSelling")
	public void user_clicks_on_top_selling() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[1]/ul/li/a/h3")).click();
	  Thread.sleep(2000);
	}
	 
	@When("user clicks on item")
	public void user_clicks_on_item() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img")).click();
	  Thread.sleep(2000);
	}
	 
	@When("user adds item to cart")
	public void user_adds_item_to_cart() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")).click();
	Thread.sleep(3000);
	}
	
	// FootWear Module
	@When("User hovers on Men module1")
	public void user_hovers_on_men_module1() throws InterruptedException {
			Actions a = new Actions(driver);
	        WebElement men=driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/h3"));
	        a.moveToElement(men).build().perform();
	        Thread.sleep(3000);
	}
	
	@When("User clicks on Footwears")
	public void user_clicks_on_footwears() throws InterruptedException {
			Actions a = new Actions(driver);
	        WebElement footwear=driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[2]/a/h3"));
	        a.moveToElement(footwear).click().build().perform();
	        Thread.sleep(3000);
	}
	
	@When("User clicks on FlipFlops")
	public void user_clicks_on_flip_flops() throws InterruptedException {
		WebElement flipflops=driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[1]/div/div[1]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(flipflops)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true,5);", flipflops);
        Thread.sleep(3000);
	}
	
	@When("User selects item1")
	public void user_selects_item1() throws InterruptedException {
		WebElement slflipflops=driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div[2]/div/div[1]/a/div/div[1]/img"));
        slflipflops.click();
        Thread.sleep(3000);
	}
	
	@When("User selects item size1")
	public void user_selects_item_size1() throws InterruptedException {
		Actions a = new Actions(driver);
        WebElement size=driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]"));
        a.moveToElement(size).click().build().perform();
        Thread.sleep(3000);
	}
	
	@When("User clicks Add to Cart1")
	public void user_clicks_add_to_cart1() throws InterruptedException {
		Actions a = new Actions(driver);
        WebElement addcart=driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div"));
        a.moveToElement(addcart).click().build().perform();
        Thread.sleep(3000);
	}
	
	// Cart Module
	@When("User open cart")
	public void user_open_cart() throws InterruptedException {
		driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-1h5x3dy > div > div.style-prefix-52lhj0 > img")).click();
		Thread.sleep(2000);
	}
	
	@When("User clicks on book now")
	public void user_clicks_on_book_now() {
		driver.findElement(By.cssSelector("#main-layout > div.style-prefix-1txy79u > div > div.style-prefix-1oecpj9 > div.style-prefix-1h5x3dy > div > div:nth-child(3) > div > div > div.style-prefix-7128mx > button")).click();
	}
	
	@Then("Cart is Opened Successfully")
	public void cart_is_opened_successfully() {
	    System.out.println("Cart is Opened Successfully");
	}
	


//}
	

/* ---------------------------------------------INDIVIDUAL MODULES-----------------------------------------*/	
	
/* -----------------------------------Cucumber FrameWork with PageObject Module----------------------------*/
	// LOGIN 
//	@Given("User is on CultSport HomePage")
//	public void user_is_on_cult_sport_home_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//	}
//	
//	@When("User clicks onto Login Option")
//	public void user_clicks_onto_login_option() throws InterruptedException {
//		 lg.clickingOntoLoginButton();
//	  	 
//	}
//	
//	@When("User selects the Email Option")
//	public void user_selects_the_email_option() {
//		lg.clickOntoEmailIcon();
//	}
//	
//	@When("User sign in with Email Option")
//	public void user_sign_in_with_email_option() {
//		lg.clickOntoEmailIcon1(); 
//	}
//	
//	@When("User enter it's Email Address")
//	public void user_enter_it_s_email_address() throws InterruptedException {
//		lg.enterTheValuesInLoginPage("namansharma03020@gmail.com");
//	}
//	
//	@When("User clicks on the Continue")
//	public void user_clicks_on_the_continue() throws InterruptedException {
//		lg.clickOntoContinuebtn();
//	  	
//	}
//	
//	@When("User clicks on Continue after passing OTP")
//	public void user_clicks_on_continue_after_passing_otp() throws InterruptedException {
//		lg.continueButtonOnOTPpage();
//	}
//	
//	@Then("User is logged in Successfully")
//	public void user_is_logged_in_successfully() {
//	   System.out.println("LOGIN SUCCESS");
//	}
//	
//	// WOMEN
//	@Given("User is in Cultsport homepage")
//	public void user_is_in_cultsport_homepage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//		wm = new WomenModulePO(driver);
//	}
//
//	@When("User hovers on Women module")
//	public void user_hovers_on_women_module() throws InterruptedException {
//		wm.hoverToWomen(driver);
//		Thread.sleep(3000);
//	}
//
//	@When("User clicks on Tshirts module")
//	public void user_clicks_on_tshirts_module() throws InterruptedException {
//	    wm.clickTshirts(driver);
//		Thread.sleep(3000);
//	}
//
//	@When("User scrolls down")
//	public void user_scrolls_down() throws InterruptedException  {
//		wm.scrollTo(driver);
//		Thread.sleep(3000);
//	}
//
//	@When("User selects the first tshirt")
//	public void user_selects_the_first_tshirt() throws InterruptedException {
//		wm.selectTshirt();
//		Thread.sleep(3000);
//	}
//
//	@Then("User clicks Add to Cart")
//	public void user_clicks_add_to_cart() throws InterruptedException {
//	    wm.addToCart();
//	    Thread.sleep(3000);
//	}
//	
//	// MEN MODULE
//	@Given("User is at Cultsport homepage")
//	public void user_is_at_cultsport_homepage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//		mn = new MenModulePO(driver);
//	}
//
//	@When("User clicks on Men module")
//	public void user_clicks_on_men_module() throws InterruptedException {
//	    mn.clickmen();
//	    Thread.sleep(2000);
//	}
//
//	@When("User clicks on tshirts")
//	public void user_clicks_on_tshirts() throws InterruptedException {
//	    mn.clicktshirt();
//	    Thread.sleep(2000);
//	}
//
//	@When("User clicks on the product")
//	public void user_clicks_on_the_product() throws InterruptedException {
//	   mn.clickproduct(driver);
//	   Thread.sleep(2000);
//	}
//
//	@Then("User clicks Add to Carts")
//	public void user_clicks_add_to_carts() throws InterruptedException {
//	   mn.clickcart();
//		
//	}
//	
//	//BEST SELLER
//	@Given("user is on cultsport homepage")
//	public void user_is_on_cultsport_homepage() {
//	System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.get("http://www.cultsport.com");
//	driver.manage().window().maximize();
//	bsp = new BestSellerPO(driver);
//	
//	}
//	 
//	@When("user clicks on BestSellers")
//	public void user_clicks_on_best_sellers() throws InterruptedException  {
//		bsp.bests();
//	}
//	 
//	@When("user clicks on TopSelling")
//	public void user_clicks_on_top_selling() throws InterruptedException {
//		bsp.tops();
//	}
//	 
//	@When("user clicks on item")
//	public void user_clicks_on_item() throws InterruptedException {
//		bsp.item();
//	}
//	 
//	@When("user adds item to cart")
//	public void user_adds_item_to_cart() {
//		bsp.cart();
//	}
//	
//	// CART 
//	@Given("User can see cart icon")
//	public void user_can_see_cart_icon() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://www.cultsport.com");
//		driver.manage().window().maximize();
//		cp = new CartPO(driver);
//	}
//	
//	@When("User open cart")
//	public void user_open_cart() throws InterruptedException {
//		cp.clickOntoCartButton();
//	}
//	
//	@When("User clicks on book now")
//	public void user_clicks_on_book_now() {
//		cp.clickOntoBookNowbtn();
//	}
//	
//	@Then("Cart is Opened Successfully")
//	public void cart_is_opened_successfully() {
//	    System.out.println("Cart is Opened Successfully");
//	}

/* --------------------------------------------------- FULL PROJECT-----------------------------------------*/	
	
/* ------------------------------------------Cucumber FrameWork with PO------------------------------------*/
		
	// Login Module
//	@Given("User is on CultSport HomePage")
//	public void user_is_on_cult_sport_home_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();   
//		driver.get("http://cultsport.com");
//		driver.manage().window().maximize();
//		lg = new LoginTHroughEmailPO(driver);
//	}
//	
//	@When("User clicks onto Login Option")
//	public void user_clicks_onto_login_option() throws InterruptedException {
//		 lg.clickingOntoLoginButton();
//	  	 
//	}
//	
//	@When("User selects the Email Option")
//	public void user_selects_the_email_option() {
//		lg.clickOntoEmailIcon();
//	}
//	
//	@When("User sign in with Email Option")
//	public void user_sign_in_with_email_option() {
//		lg.clickOntoEmailIcon1(); 
//	}
//	
//	@When("User enter it's Email Address")
//	public void user_enter_it_s_email_address() throws InterruptedException {
//		lg.enterTheValuesInLoginPage("namansharma03020@gmail.com");
//	}
//	
//	@When("User clicks on the Continue")
//	public void user_clicks_on_the_continue() throws InterruptedException {
//		lg.clickOntoContinuebtn();
//	  	
//	}
//	
//	@When("User clicks on Continue after passing OTP")
//	public void user_clicks_on_continue_after_passing_otp() throws InterruptedException {
//		lg.continueButtonOnOTPpage();
//	}
//	
//	@When("User is logged in Successfully")
//	public void user_is_logged_in_successfully() {
//	   System.out.println("LOGIN SUCCESS");
//	}
//	
//	// WOMEN
//	@When("User hovers on Women module")
//	public void user_hovers_on_women_module() throws InterruptedException {
//		wm = new WomenModulePO(driver);
//		wm.hoverToWomen(driver);
//		Thread.sleep(3000);
//	}
//
//	@When("User clicks on Tshirts module")
//	public void user_clicks_on_tshirts_module() throws InterruptedException {
//	    wm.clickTshirts(driver);
//		Thread.sleep(3000);
//	}
//
//	@When("User scrolls down")
//	public void user_scrolls_down() throws InterruptedException  {
//		wm.scrollTo(driver);
//		Thread.sleep(3000);
//	}
//
//	@When("User selects the first tshirt")
//	public void user_selects_the_first_tshirt() throws InterruptedException {
//		wm.selectTshirt();
//		Thread.sleep(3000);
//	}
//
//	@When("User clicks Add to Cart")
//	public void user_clicks_add_to_cart() throws InterruptedException {
//	    wm.addToCart();
//	    Thread.sleep(3000);
//	}
//	
//	// MEN
//	@When("User clicks on Men module")
//	public void user_clicks_on_men_module() throws InterruptedException {
//	    mn.clickmen();
//	    Thread.sleep(2000);
//	}
//
//	@When("User clicks on tshirts")
//	public void user_clicks_on_tshirts() throws InterruptedException {
//	    mn.clicktshirt();
//	    Thread.sleep(2000);
//	}
//
//	@When("User clicks on the product")
//	public void user_clicks_on_the_product() throws InterruptedException {
//	   mn.clickproduct(driver);
//	   Thread.sleep(2000);
//	}
//
//	@When("User clicks Add to Carts")
//	public void user_clicks_add_to_carts() throws InterruptedException {
//	   mn.clickcart();
//		
//	}
//	
//	// BestSeller
//	@When("user clicks on BestSellers")
//	public void user_clicks_on_best_sellers() throws InterruptedException  {
//		bsp.bests();
//	}
//	 
//	@When("user clicks on TopSelling")
//	public void user_clicks_on_top_selling() throws InterruptedException {
//		bsp.tops();
//	}
//	 
//	@When("user clicks on item")
//	public void user_clicks_on_item() throws InterruptedException {
//		bsp.item();
//	}
//	 
//	@When("user adds item to cart")
//	public void user_adds_item_to_cart() {
//		bsp.cart();
//	}
//	
//	// Foot Wear
//	@When("User hovers on Men module1")
//	public void user_hovers_on_men_module1() throws InterruptedException {
//			fp = new FootWearModulePO(driver);
//			fp.hoverToMen(driver);
//	        Thread.sleep(3000);
//	}
//	
//	@When("User clicks on Footwears")
//	public void user_clicks_on_footwears() throws InterruptedException {
//			fp = new FootWearModulePO(driver);
//			fp.clickFootwear(driver);
//	        Thread.sleep(3000);
//	}
//	
//	@When("User clicks on FlipFlops")
//	public void user_clicks_on_flip_flops() throws InterruptedException {
//		fp = new FootWearModulePO(driver);
//		fp.scrolling(driver);
//        Thread.sleep(3000);
//	}
//	
//	@When("User selects item1")
//	public void user_selects_item1() throws InterruptedException {
//		fp = new FootWearModulePO(driver);
//		fp.selectFlipFlops();
//        Thread.sleep(3000);
//	}
//	
//	@When("User selects item size1")
//	public void user_selects_item_size1() throws InterruptedException {
//		fp = new FootWearModulePO(driver);
//		fp.selectSize(driver);
//        Thread.sleep(3000);
//	}
//	
//	@When("User clicks Add to Cart1")
//	public void user_clicks_add_to_cart1() throws InterruptedException {
//		fp = new FootWearModulePO(driver);
//		fp.cartAdd(driver);
//        Thread.sleep(3000);
//	}
	
//	// Cart
//	@When("User open cart")
//	public void user_open_cart() throws InterruptedException {
//		cp.clickOntoCartButton();
//	}
//	
//	@When("User clicks on book now")
//	public void user_clicks_on_book_now() {
//		cp.clickOntoBookNowbtn();
//	}
//	
//	@Then("Cart is Opened Successfully")
//	public void cart_is_opened_successfully() {
//	    System.out.println("Cart is Opened Successfully");
//	}
//		
	
}
