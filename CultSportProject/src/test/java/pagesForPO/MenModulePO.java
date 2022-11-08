package pagesForPO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenModulePO {
	
	public MenModulePO(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/h3")
    private WebElement men;
    

    @FindBy(xpath="//*[@id=\"main-layout\"]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/ul/li[3]/a/h3")
    private WebElement tshirt;
                   
    

    @FindBy(xpath="//*[@id=\"plp-container\"]/div[2]/div/div[2]")
    private WebElement product;
    
    

    @FindBy(xpath="//*[@id=\"main-layout\"]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div")
    private WebElement cart;
                   
    

    public void clickmen() throws InterruptedException
    {
        
        men.click();
        Thread.sleep(3000);
    }
    
    public void clicktshirt() throws InterruptedException
    {
        tshirt.click();
        Thread.sleep(3000);
    }
    
    public void clickproduct(WebDriver driver) throws InterruptedException
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", product);
        product.click();
        Thread.sleep(3000);
    }     
    
    public void clickcart() throws InterruptedException
    {
        cart.click();
        Thread.sleep(3000);
    }

}

    
