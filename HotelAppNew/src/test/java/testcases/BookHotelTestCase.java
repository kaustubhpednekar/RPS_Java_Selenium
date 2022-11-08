package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.BookHotel;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;

public class BookHotelTestCase {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		LoginPage log = new LoginPage(driver);
		log.enterUsername("vasuvespag");
		log.enterPassword("vasu1234");
		log.loginClick();
		
		SearchHotelPage search = new SearchHotelPage(driver);
		search.chooseLoc("Adelaide");
		search.chooseHotel("Hotel Hervey");
		search.chooseRoom("2 - Two");
		search.chooseSubmit();
		
		SelectHotelPage select = new SelectHotelPage(driver);
		select.hotelSelection();
		select.okContinue();
		
		BookHotel bk = new BookHotel(driver);
		bk.enterFname("Manoj");
		bk.enterLname("Singh");
		bk.enterAddress("Shalimar complex bangalore");
		bk.enterCardNo("1234567890123456");
		bk.selectType("VISA");
		bk.selectMonth("December");
		bk.selectYear("2022");
		bk.selectCvv("234");
		bk.clickBook();
	}

}
