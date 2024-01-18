package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ConfirmPickupAddressPage;
import Pages.ContactPerAndReturnAddressPage;
import Pages.FrightAgreementPage;
import Pages.OpeningHourPage;
import Pages.PickupInStoreInformation;
import Pages.WelcomeToREtailhubPage;
import Pages.loginPage;

public class ConfirmPickupAddressPageTest extends TestBase
{
	
	loginPage login;
	WelcomeToREtailhubPage Retailhub;
	FrightAgreementPage Friagreement;
	ContactPerAndReturnAddressPage ContactPerson;
	OpeningHourPage Openinghour;
	PickupInStoreInformation pickup;
	ConfirmPickupAddressPage pickupAddress;
	
	@BeforeMethod
    public void setup() {
		initialization();
	login = new loginPage();
	Retailhub = new WelcomeToREtailhubPage();
	Friagreement = new FrightAgreementPage();		
	ContactPerson = new ContactPerAndReturnAddressPage();		
	Openinghour = new OpeningHourPage();		
	pickup = new PickupInStoreInformation();	
    pickupAddress = new ConfirmPickupAddressPage();		
	}
	
	
	@Test
	public void confirmPickupAddressTest() throws InterruptedException {
		login.loginInStore();
		Retailhub.retailhubPage();
		Friagreement.agreement();
		ContactPerson.returnAddressInfo();
		Openinghour.openTimeOfStore();
		pickup.pickupAddressInfo();
		String lable7 = pickupAddress.confirmPickupAddress();
			Assert.assertEquals(lable7, true);
}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
} 
	
	
	
	
	
	
	

	


