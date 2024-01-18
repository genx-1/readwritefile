package tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.BasicInformationPage;
import Pages.FrightAgreementPage;
import Pages.WelcomeToREtailhubPage;

import Pages.loginPage;

public class FrightAgreementPageTest extends TestBase{
	loginPage login;
	WelcomeToREtailhubPage Retailhub;
	FrightAgreementPage Friagreement;
	
	@BeforeMethod
	public void setup() {
		initialization();
		Friagreement = new FrightAgreementPage();
		Retailhub = new WelcomeToREtailhubPage();
		 login = new loginPage();
		
	}
	
	@Test
	public void agreementTest() throws InterruptedException {
		login.loginInStore();
		Retailhub.retailhubPage();
		String lable3 = Friagreement.agreement();
		Assert.assertEquals(lable3, "Returadresse og kontaktperson for mayra flora");
	}
	@AfterMethod 
	public void closeBrowser() {
		driver.close();
	}
	
	
}
	
	
	
	
	
	
	


