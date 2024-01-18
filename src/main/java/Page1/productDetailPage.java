package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBaseForVIKI;

public class productDetailPage extends TestBaseForVIKI{
	
	@FindBy(xpath="(//span[text()='Women'])[1]") private WebElement womenClothing;
	@FindBy(xpath="(//img[@itemprop='image'])[4]") private WebElement image;
	@FindBy(xpath="//select[@id='product_attribute_350615_0']") private WebElement size;
	@FindBy(xpath="//button[@id='add-to-cart-button-932047']") private WebElement addToCartButton;
	@FindBy(xpath="//input[@value='Go to cart']") private WebElement GoToCartButton;
	@FindBy(xpath="//div[@class='page-title']") private WebElement mycart;
	
	
	
	public productDetailPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	public String productinfo() throws InterruptedException {
		Actions a4 = new Actions(driver);
        a4.moveToElement(womenClothing).click().build().perform();
        Thread.sleep(2000);
        image.click();
        Thread.sleep(2000);
        Select s = new Select(size);
        s.selectByIndex(1);
        Thread.sleep(4000);
        
        addToCartButton.click();
        Thread.sleep(2000);
        GoToCartButton.click();
        Thread.sleep(2000);
        return mycart.getText();
	
		
	}
	
	
}
