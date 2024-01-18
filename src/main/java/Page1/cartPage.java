package Page1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBaseForVIKI;

public class cartPage extends TestBaseForVIKI {
	
	@FindBy(xpath="//button[@id='checkout']") private WebElement checkoutButton;
	@FindBy(xpath="//div[@class='page-title']") private WebElement checkoutText;
	
	
	
	
	public cartPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	public String goToCart() throws InterruptedException {
		checkoutButton.click();
		  Thread.sleep(2000);
		  return checkoutText.getText();
		
	}
	
}
