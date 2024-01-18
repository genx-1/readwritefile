package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class BasicInformationPage extends TestBase {

	@FindBy(xpath = "//input[@id='CompanyName']") private WebElement CompanyName;
	@FindBy(xpath = "//input[@id='CompanyStreetAddress']")private WebElement CompanyStreetAddress;
	@FindBy(xpath = "//input[@id='CompanyPostalCode']") private WebElement Companypostalcode;
	@FindBy(xpath = "//input[@id='CompanyCity']") private WebElement companyCity;
	@FindBy(xpath = "//input[@id='CompanyPhoneNumber']")private WebElement companyPhoneNumber;
	@FindBy(xpath = "//input[@id='CompanyVat']") private WebElement CompantVat;
	@FindBy(xpath = "//button[@id='btnSaveStep1']")private WebElement savebuttonstep1;
	@FindBy(xpath = "(//div[@class='card-title'])[2]")private WebElement step2;
	
	
	public BasicInformationPage () {
		PageFactory.initElements(driver, this);
	                  }
	
	public String basicinfo() {
		CompanyName.sendKeys("mayra Solutions");
		CompanyStreetAddress.sendKeys("Sentralveien 23");
		Companypostalcode.sendKeys("6900");
		companyCity.sendKeys("Flora");
		companyPhoneNumber.sendKeys("9956784534");
		CompantVat.sendKeys("12312313 (test)");
		savebuttonstep1.click();
		return step2.getText();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
