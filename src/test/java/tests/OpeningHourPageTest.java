package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ContactPerAndReturnAddressPage;
import Pages.FrightAgreementPage;
import Pages.OpeningHourPage;
import Pages.WelcomeToREtailhubPage;
import Pages.loginPage;

public class OpeningHourPageTest extends TestBase{

	loginPage login;
	WelcomeToREtailhubPage Retailhub;
	FrightAgreementPage Friagreement;
	ContactPerAndReturnAddressPage ContactPerson;
	OpeningHourPage Openinghour;
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new loginPage();
	    Retailhub = new WelcomeToREtailhubPage();
	    Friagreement = new FrightAgreementPage(); 
	    ContactPerson = new ContactPerAndReturnAddressPage();
        Openinghour = new OpeningHourPage();	
	}
		
		
		@Test
	public void openTimeOfStoreTest() throws InterruptedException {
		login.loginInStore();
		Retailhub.retailhubPage();
		Friagreement.agreement();
		ContactPerson.returnAddressInfo();
	    String lable5 = Openinghour.openTimeOfStore();
	    Assert.assertEquals(lable5,"Adresse for \"klikk og hent\" kan endres på et senere tidspunkt.");
	 
	}
		
	@ AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
		
		
		
		
		
		
		

