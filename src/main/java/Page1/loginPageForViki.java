package Page1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBaseForVIKI;

public class loginPageForViki extends TestBaseForVIKI{
	
	@FindBy(xpath="//input[@id='Email']") private WebElement Email;
	@FindBy(xpath="//input[@id='Password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
    @FindBy(xpath="//a[@class='administration']") private WebElement administration;
    
    
	public loginPageForViki() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String loginInStore() throws InterruptedException { 
		Email.sendKeys("store14@viki-test.no");
		password.sendKeys("demo#QA123$");
		login.click();
		 Thread.sleep(2000);
		return administration.getText();
	
	}

 }
