 package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ContactPerAndReturnAddressPage extends TestBase{
	
	@FindBy(xpath = "//input[@id='ReturnAddress_Address1']")private WebElement ReturnAddress1;
	@FindBy(xpath = "//input[@id='ReturnAddress_Address2']")private WebElement ReturnAddress2;
    @FindBy(xpath = "//input[@id='ReturnAddress_ZipPostalCode']")private WebElement ReturnZipPostalCode;
    @FindBy(xpath = "//input[@id='ReturnAddress_City']")private WebElement ReturnCity;
    @FindBy(xpath = "//input[@name='use_same_sender_address']")private WebElement checkbox;
	@FindBy(xpath = "//input[@id='ReturnAddress_FirstName']")private WebElement ContactPerfirstName;
	@FindBy(xpath = "//input[@id='ReturnAddress_LastName']")private WebElement ContactPerLastName;
	@FindBy(xpath = "//input[@id='ReturnAddress_PhoneNumber']")private WebElement ContactPerFoneNumber;
	@FindBy(xpath = "//input[@id='ReturnAddress_Email']")private WebElement ContactEmail;
	@FindBy(xpath = "//button[@id='btnSaveStep3']") private WebElement SaveButton3;
	@FindBy(xpath = "(//h5[@class='text-justify mb-5'])[3]") private WebElement Åpningstider;
	
	public ContactPerAndReturnAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String returnAddressInfo () throws InterruptedException {
		ReturnAddress1.clear();
		Thread.sleep(2000);
		ReturnAddress1.sendKeys("Sentralveien 23");
		ReturnAddress2.clear();
		Thread.sleep(2000);
		ReturnAddress2.clear();
		ReturnAddress2.sendKeys("Sentralveien 23");
		Thread.sleep(2000);
		ReturnZipPostalCode.clear();
		ReturnZipPostalCode.sendKeys("6900");
		Thread.sleep(2000);
		ReturnCity.clear();
		ReturnCity.sendKeys("Flora");
		Thread.sleep(2000);
		checkbox.click();
		Thread.sleep(2000);
		ContactPerfirstName.clear();
		ContactPerfirstName.sendKeys("Komal");
		Thread.sleep(2000);
		ContactPerLastName.clear();
		ContactPerLastName.sendKeys("Makke");
		Thread.sleep(2000);
		ContactPerFoneNumber.clear();
		ContactPerFoneNumber.sendKeys("9956784523");
		Thread.sleep(2000);
		ContactEmail.clear();
		ContactEmail.sendKeys("komal@gmail.com");
		Thread.sleep(2000);
		SaveButton3.click();
		Thread.sleep(8000);
		return Åpningstider.getText();
		
		
	}
	
	
	
}
