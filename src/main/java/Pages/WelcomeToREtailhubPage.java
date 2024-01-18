package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class WelcomeToREtailhubPage extends TestBase{
	
	@FindBy(xpath = "//input[@id='CompanyName']") private WebElement CompanyName;
	@FindBy(xpath = "//input[@id='CompanyStreetAddress']")private WebElement CompanyStreetAddress;
	@FindBy(xpath = "//input[@id='CompanyPostalCode']") private WebElement Companypostalcode;
	@FindBy(xpath = "//input[@id='CompanyCity']") private WebElement companyCity;
	@FindBy(xpath = "//input[@id='CompanyPhoneNumber']")private WebElement companyPhoneNumber;
	@FindBy(xpath = "//input[@id='CompanyVat']") private WebElement CompantVat;
	@FindBy(xpath = "//select[@class='form-control']") private WebElement POSApiType;
	@FindBy(xpath = "//button[@id='btnSaveStep1']")private WebElement savebuttonstep1;
	@FindBy(xpath = "(//h1[@class='text-center'])[2]")private WebElement  Velgfraktavtale;
	
	
	    public WelcomeToREtailhubPage() {
		PageFactory.initElements(driver, this);
		}
	
	    public String retailhubPage () throws InterruptedException {
	    	CompanyName.clear();
	    	Thread.sleep(2000);
		CompanyName.sendKeys("mayra Solutions");
		CompanyStreetAddress.clear();
		Thread.sleep(2000);
		CompanyStreetAddress.sendKeys("Sentralveien 23");
		Companypostalcode.clear();
		Thread.sleep(2000);
		Companypostalcode.sendKeys("6900");
		companyCity.clear();
		Thread.sleep(2000);
		companyCity.sendKeys("Flora");
		companyPhoneNumber.clear();
		Thread.sleep(2000);
		companyPhoneNumber.sendKeys("9956784534");
		CompantVat.clear();
		Thread.sleep(2000);
		CompantVat.clear();
		CompantVat.sendKeys("12312313 (test)");
		Select s = new Select(POSApiType);
		s.selectByIndex(1);
		Thread.sleep(2000);
		savebuttonstep1.click();
		Thread.sleep(3000);
		return Velgfraktavtale.getText();
		
	}
	}
	
	
	
	
	
	
	


