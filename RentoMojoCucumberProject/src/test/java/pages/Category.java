package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

public class Category {

	public Category(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#app > div.application--wrap > main > div > div.view > div > div.rm-category__home > div > div:nth-child(2) > div > ul > li:nth-child(2)")
	private WebElement category;

	public void categoryClick(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,200)");
		category.click();

	}
}
