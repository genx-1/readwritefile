package Pages;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ConfirmPickupAddressPage extends TestBase {

	
		@FindBy(xpath = "(//input[@class='form-control text-box single-line'])[9]") private WebElement name;
		@FindBy(xpath = "//input[@id='Address_Address1']")private WebElement ConfirmAddress;
		@FindBy(xpath = "//input[@id='Address_ZipPostalCode']")private WebElement CompanyPostalZipCode;
	    @FindBy(xpath = "//input[@id='Address_City']")private WebElement pickupCity;	
		@FindBy(xpath = "//input[@id='CompanyVat']")private WebElement OpeningHour;
		@FindBy(xpath = "//button[@id='btnSaveStep1']")private WebElement Description;
		@FindBy(xpath = "//button[@id='btnSaveStep5']")private WebElement buttonsavestep5;
	    @FindBy(xpath = "//h5[@class='text-left']")private WebElement Frakttjenester ;
		
		//input[@id='FreeShippingOverXEnabled']
		
		public ConfirmPickupAddressPage() {
			PageFactory.initElements(driver, this);
		}
	
		
		public String confirmPickupAddress() throws InterruptedException {
			name.sendKeys("nisha flora");	
			ConfirmAddress.sendKeys("Sentralveien 23");
			CompanyPostalZipCode.sendKeys("6900");
			pickupCity.sendKeys("Flora");
			buttonsavestep5.click();
			Thread.sleep(4000);
			return Frakttjenester.getText();
			
	
		
	

		}

}
