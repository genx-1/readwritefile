package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class loginPage extends TestBase {
	
	@FindBy(xpath = "//input[@id='Email']") private WebElement emailidTextbox;
	@FindBy(xpath = "//input[@id='Password']")private WebElement passwordTextbox;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ClickButton;
	@FindBy(xpath = "(//h1[@class ='text-center'])[1]") private WebElement WelcomeToretailhub;
	
	
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	                         }
	
	
	public String loginInStore() throws InterruptedException { 
		emailidTextbox.sendKeys("mayra@gmail.com");
		passwordTextbox.sendKeys("12345");
		ClickButton.click();
		Thread.sleep(3000);
		return WelcomeToretailhub.getText();
	            }
	

}
