package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ContactPerAndReturnAddressPage;
import Pages.FrightAgreementPage;
import Pages.FrightPricePage6;
import Pages.OpeningHourPage;
import Pages.PickupInStoreInformation;
import Pages.WelcomeToREtailhubPage;
import Pages.loginPage;

public class FrightPricePage6Test extends TestBase 
     {

	 loginPage login;
	 WelcomeToREtailhubPage Retailhub;
	 FrightAgreementPage Friagreement;
	 ContactPerAndReturnAddressPage ContactPerson;
	 OpeningHourPage Openinghour;
	 PickupInStoreInformation pickup;
	 FrightPricePage6 frightconfirmprice;
	
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
	         }
	
	    @Test
	    public void frightPriceTest() throws InterruptedException {
		login.loginInStore();	
		Retailhub.retailhubPage();
		Friagreement.agreement();
		ContactPerson.returnAddressInfo();
		Openinghour.openTimeOfStore();
		pickup.pickupAddressInfo();
		String lable6 = frightconfirmprice.frightPrice();
		Assert.assertEquals(lable6,"Step 7");
	    }
	
	   @AfterMethod
	   public void closeBrowser()
	   {
		driver.close();
	   }
	
   }
	
	
	
	
	
	
	
	
	

