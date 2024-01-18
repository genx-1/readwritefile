package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class PickupInStoreInformation extends TestBase{


		@FindBy(xpath = "//input[@id='PickupPointModelName']") private WebElement pickupnamename;
		@FindBy(xpath = "//input[@id='Address_Address1']")private WebElement pickupAddress;
		@FindBy(xpath = "//input[@id='Address_ZipPostalCode']")private WebElement pickupPostalCode;
	    @FindBy(xpath = "//input[@id='Address_City']")private WebElement pickupCity;	
		//@FindBy(xpath = "//input[@id='CompanyVat']")private WebElement pickupOpeningHour;
		
		@FindBy(xpath = "//button[@id='btnSaveStep5']")private WebElement buttonsavestep5;
		@FindBy(xpath = "(//div[@class='card-title'])[3]")private WebElement step6;
		
		
		public PickupInStoreInformation() {
			PageFactory.initElements(driver, this);
		}
		
		
		public String pickupAddressInfo () throws InterruptedException {
			pickupnamename.clear();
			pickupnamename.sendKeys("Sentralveien 23");
			Thread.sleep(2000);
			pickupAddress.clear();
			pickupAddress.sendKeys("Sentralveien 23");
			Thread.sleep(2000);
			pickupPostalCode.clear();
			pickupPostalCode.sendKeys("6900");
			Thread.sleep(2000);
			pickupCity.clear();
			pickupCity.sendKeys("Flora");
			//pickupOpeningHour.sendKeys("");
			//pickupDescription.sendKeys("This is amazing store");
			Thread.sleep(2000);
			buttonsavestep5.click();
			Thread.sleep(2000);
			return step6.getText();
			

	}}


