package com.stepDefinitions2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesForPO.BestSellerPO;
import pagesForPO.CartPO;
import pagesForPO.FootWearModulePO;
import pagesForPO.LoginTHroughEmailPO;
import pagesForPO.MenModulePO;
import pagesForPO.WomenModulePO;

public class Test_StepsForPO {
	
	static WebDriver driver;
	static LoginTHroughEmailPO lg;
	static WomenModulePO wm;
	static MenModulePO mn;
	static BestSellerPO bsp;
	static FootWearModulePO fp;
	static CartPO cp;
	
	

	/* --------------------------------------------------- FULL PROJECT-----------------------------------------*/	
	
	/* ------------------------------------------Cucumber FrameWork with PO------------------------------------*/
			
		// Login Module
		@Given("User is on CultSport HomePage")
		public void user_is_on_cult_sport_home_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Naman\\chromedriver102win32\\chromedriver.exe");
			
			driver = new ChromeDriver();   
			driver.get("http://cultsport.com");
			driver.manage().window().maximize();
			lg = new LoginTHroughEmailPO(driver);
		//	Thread.sleep(1000);
		}
		
		@When("User clicks onto Login Option")
		public void user_clicks_onto_login_option() throws InterruptedException {
			lg = new LoginTHroughEmailPO(driver);
			 lg.clickingOntoLoginButton();
			 Thread.sleep(1000);
		  	 
		}
		
		@When("User selects the Email Option")
		public void user_selects_the_email_option() {
			lg = new LoginTHroughEmailPO(driver);
			lg.clickOntoEmailIcon();
		}
		
		@When("User sign in with Email Option")
		public void user_sign_in_with_email_option() throws InterruptedException {
			lg = new LoginTHroughEmailPO(driver);
			lg.clickOntoEmailIcon1(); 
			Thread.sleep(1000);
		}
		
		@When("User enter it's Email Address")
		public void user_enter_it_s_email_address() throws InterruptedException {
			lg = new LoginTHroughEmailPO(driver);
			lg.enterTheValuesInLoginPage("namansharma03020@gmail.com");
			Thread.sleep(3000);
			
		}
		
		@When("User clicks on the Continue")
		public void user_clicks_on_the_continue() throws InterruptedException {
			lg = new LoginTHroughEmailPO(driver);
			lg.clickOntoContinuebtn();
			Thread.sleep(15000);
		  	
		}
		
		@When("User clicks on Continue after passing OTP")
		public void user_clicks_on_continue_after_passing_otp() throws InterruptedException {
			lg = new LoginTHroughEmailPO(driver);
			lg.continueButtonOnOTPpage();
			Thread.sleep(3000);
		}
		
		@When("User is logged in Successfully")
		public void user_is_logged_in_successfully() {
			lg = new LoginTHroughEmailPO(driver);
		   System.out.println("LOGIN SUCCESS");
		}
		
		// WOMEN
		@When("User hovers on Women module")
		public void user_hovers_on_women_module() throws InterruptedException {
			wm = new WomenModulePO(driver);
			wm.hoverToWomen(driver);
			Thread.sleep(3000);
		}

		@When("User clicks on Tshirts module")
		public void user_clicks_on_tshirts_module() throws InterruptedException {
			wm = new WomenModulePO(driver);
		    wm.clickTshirts(driver);
			Thread.sleep(3000);
		}

		@When("User scrolls down")
		public void user_scrolls_down() throws InterruptedException  {
			wm = new WomenModulePO(driver);
			wm.scrollTo(driver);
			Thread.sleep(3000);
		}

		@When("User selects the first tshirt")
		public void user_selects_the_first_tshirt() throws InterruptedException {
			wm = new WomenModulePO(driver);
			wm.selectTshirt();
			Thread.sleep(3000);
		}

		@When("User clicks Add to Cart")
		public void user_clicks_add_to_cart() throws InterruptedException {
			wm = new WomenModulePO(driver);
		    wm.addToCart();
		    Thread.sleep(3000);
		}
		
		// MEN
		@When("User clicks on Men module")
		public void user_clicks_on_men_module() throws InterruptedException {
			mn = new MenModulePO(driver);
		    mn.clickmen();
		    Thread.sleep(2000);
		}

		@When("User clicks on tshirts")
		public void user_clicks_on_tshirts() throws InterruptedException {
			mn = new MenModulePO(driver);
		    mn.clicktshirt();
		    Thread.sleep(2000);
		}

		@When("User clicks on the product")
		public void user_clicks_on_the_product() throws InterruptedException {
			mn = new MenModulePO(driver);
		   mn.clickproduct(driver);
		   Thread.sleep(2000);
		}

		@When("User clicks Add to Carts")
		public void user_clicks_add_to_carts() throws InterruptedException {
			mn = new MenModulePO(driver);
		   mn.clickcart();
			
		}
		
		// BestSeller
		@When("user clicks on BestSellers")
		public void user_clicks_on_best_sellers() throws InterruptedException  {
			bsp = new BestSellerPO(driver);
			bsp.bests();
		}
		 
		@When("user clicks on TopSelling")
		public void user_clicks_on_top_selling() throws InterruptedException {
			bsp = new BestSellerPO(driver);
			bsp.tops();
		}
		 
		@When("user clicks on item")
		public void user_clicks_on_item() throws InterruptedException {
			bsp = new BestSellerPO(driver);
			bsp.item();
		}
		 
		@When("user adds item to cart")
		public void user_adds_item_to_cart() {
			bsp = new BestSellerPO(driver);
			bsp.cart();
		}
		
		// Foot Wear
		@When("User hovers on Men module1")
		public void user_hovers_on_men_module1() throws InterruptedException {
				fp = new FootWearModulePO(driver);
				fp.hoverToMen(driver);
		        Thread.sleep(3000);
		}
		
		@When("User clicks on Footwears")
		public void user_clicks_on_footwears() throws InterruptedException {
				fp = new FootWearModulePO(driver);
				fp.clickFootwear(driver);
		        Thread.sleep(3000);
		}
		
		@When("User clicks on FlipFlops")
		public void user_clicks_on_flip_flops() throws InterruptedException {
			fp = new FootWearModulePO(driver);
			fp.scrolling(driver);
	        Thread.sleep(3000);
		}
		
		@When("User selects item1")
		public void user_selects_item1() throws InterruptedException {
			fp = new FootWearModulePO(driver);
			fp.selectFlipFlops();
	        Thread.sleep(3000);
		}
		
		@When("User selects item size1")
		public void user_selects_item_size1() throws InterruptedException {
			fp = new FootWearModulePO(driver);
			fp.selectSize(driver);
	        Thread.sleep(3000);
		}
		
		@When("User clicks Add to Cart1")
		public void user_clicks_add_to_cart1() throws InterruptedException {
			fp = new FootWearModulePO(driver);
			fp.cartAdd(driver);
	        Thread.sleep(3000);
		}
		// Cart
		@When("User open cart")
		public void user_open_cart() throws InterruptedException {
			cp = new CartPO(driver);
			cp.clickOntoCartButton();
		}
		
		@When("User clicks on book now")
		public void user_clicks_on_book_now() {
			cp = new CartPO(driver);
			cp.clickOntoBookNowbtn();
		}
		
		@Then("Cart is Opened Successfully")
		public void cart_is_opened_successfully() {
		    System.out.println("Cart is Opened Successfully");
		}
			
		
}


