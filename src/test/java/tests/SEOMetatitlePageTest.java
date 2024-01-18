package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ContactPerAndReturnAddressPage;
import Pages.FrightAgreementPage;
import Pages.FrightPricePage6;
import Pages.OpeningHourPage;
import Pages.OrderConfirmationPage;
import Pages.PickupInStoreInformation;
import Pages.WelcomeToREtailhubPage;
import Pages.loginPage;

public class SEOMetatitlePageTest extends TestBase {

	 loginPage login;
	 WelcomeToREtailhubPage Retailhub;
	 FrightAgreementPage Friagreement;
	 ContactPerAndReturnAddressPage ContactPerson;
	 OpeningHourPage Openinghour;
	 PickupInStoreInformation pickup;
	 FrightPricePage6 frightconfirmprice;
	 OrderConfirmationPage orderConfirm;
	 SEOMetatitlePage metatitle;
	
	@BeforeMethod
	 public void setup() {
		    initialization();
			login = new loginPage();
		    Retailhub = new WelcomeToREtailhubPage();
		    Friagreement = new FrightAgreementPage(); 
		    ContactPerson = new ContactPerAndReturnAddressPage();
	        Openinghour = new OpeningHourPage();	
	        pickup = new PickupInStoreInformation();
	        frightconfirmprice = new FrightPricePage6();
	         orderConfirm = new OrderConfirmationPage();
	      metatitle = new SEOMetatitlePage();
	         }
	
	
	
	@Test
	public void metaTitleTest() throws InterruptedException {
		login.loginInStore();	
		Retailhub.retailhubPage();
		Friagreement.agreement();
		ContactPerson.returnAddressInfo();
		Openinghour.openTimeOfStore();
		pickup.pickupAddressInfo();
	    frightconfirmprice.frightPrice();
	    orderConfirm.confirmOrder();
	    String lable8 = metatitle.metaTitle();
		Assert.assertEquals(lable8,"Step 9");
		
	    }
	
	public void closeBrowser()
	   {
		driver.close();
	   }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

