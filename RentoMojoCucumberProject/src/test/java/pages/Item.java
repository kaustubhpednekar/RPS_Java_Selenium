package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Item {

	public Item(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(1)")
	private WebElement item;

	public void itemclick(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		item.click();

	}

}
