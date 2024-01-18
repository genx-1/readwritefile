package Page1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBaseForVIKI;

public class checkoutpage extends TestBaseForVIKI {
	@FindBy(xpath="(//span[@class='checkmark'])[5]") private WebElement myPackCollect;
	@FindBy(xpath="(//span[@class='checkmark'])[10]") private WebElement creditCardCheckbox;
	//@FindBy(xpath="//select[@id='product_attribute_350615_0']") private WebElement size;
	//@FindBy(xpath="//button[@id='add-to-cart-button-932047']") private WebElement addToCartButton;
	//@FindBy(xpath="//input[@value='Go to cart']") private WebElement GoToCartButton;
	//@FindBy(xpath="//div[@class='page-title']") private WebElement mycart;
	
	
	
	public checkoutpage () {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean PaymencheckboxtEnable() throws InterruptedException  {
		myPackCollect.click();
        Thread.sleep(2000);
        creditCardCheckbox.click();
		return creditCardCheckbox.isEnabled();
        
        
        //return mycart.getText();
	
		
}}
