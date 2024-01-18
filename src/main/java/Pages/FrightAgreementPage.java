package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class FrightAgreementPage extends TestBase{

	@FindBy(xpath = "(//input[@type='radio'])[2]") private WebElement BringAgreement;
	@FindBy(xpath = "//input[@value='RetailhubAgreement_Postnord']")private WebElement FrightAgreementPostnord;
	@FindBy(xpath = "//input[@value='OwnAgreement_Postnord']")private WebElement OwnFrightAgreement;
	@FindBy(xpath = "//button[@id='btnSaveStep2']")private WebElement savebuttonstep2;
	//@FindBy(xpath = "(//div[@class='card-title'])[3]")private WebElement step3;
	@FindBy(xpath = "(//h1[@class='text-center'])[3]")private WebElement  returnAddress;
	
	public FrightAgreementPage() {
		PageFactory.initElements(driver, this);
	             }
		
	public String agreement() throws InterruptedException { 
		BringAgreement.click();
		Thread.sleep(2000);
		FrightAgreementPostnord.click();
		Thread.sleep(2000);
		OwnFrightAgreement.click();
		Thread.sleep(2000);
		savebuttonstep2.click();
		Thread.sleep(2000);
		return returnAddress.getText();
		
		
	}
	}
	
	
	
	
	
	

