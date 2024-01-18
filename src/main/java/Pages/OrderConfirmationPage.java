package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderConfirmationPage extends TestBase {

	@FindBy(xpath = "//input[@id='DefaultEmail']") private WebElement DefaultEmail;
	@FindBy(xpath = "//input[@id='SupportEmail']")private WebElement supportEmail;
 	@FindBy(xpath = "//button[@id='btnSaveStep7']")private WebElement buttonsavestep7;
	@FindBy(xpath = "(//div[@class='card-title'])[5]")private WebElement step8;
	
	
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String confirmOrder() throws InterruptedException {
		DefaultEmail.clear();
		  Thread.sleep(1000);
		DefaultEmail.sendKeys("nisha@gmail.com");
		 Thread.sleep(1000);
		 supportEmail.clear();
		 Thread.sleep(1000);
       	supportEmail.sendKeys("komal@gmail.com");
		 Thread.sleep(3000);
		 buttonsavestep7.click();
		 Thread.sleep(2000);
		 return step8.getText();
		
		
	}
		
		
	}
	
	
	
	
	
	
	 
	
	
	
	
	
	
	

