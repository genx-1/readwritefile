 package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.BasicInformationPage;
import Pages.ContactPerAndReturnAddressPage;
import Pages.FrightAgreementPage;
import Pages.OpeningHourPage;
import Pages.WelcomeToREtailhubPage;

import Pages.loginPage;

             public class ContactPerAndReturnAddressPageTest extends TestBase {
loginPage login;
WelcomeToREtailhubPage Retailhub;
FrightAgreementPage Friagreement;
ContactPerAndReturnAddressPage ContactPerson;

	
	@BeforeMethod
	    public void setup() 
	{
		initialization();
		login = new loginPage();
	    Retailhub = new WelcomeToREtailhubPage();
	    Friagreement = new FrightAgreementPage(); 
	    ContactPerson = new ContactPerAndReturnAddressPage();
	   }
	
	    @Test
	       public void returnAddressInfoTest() throws InterruptedException {
		    login.loginInStore();
			Retailhub.retailhubPage();
			Friagreement.agreement();
			String lable4 = ContactPerson.returnAddressInfo();
			Assert.assertEquals(lable4, "Lager: mayra flora");
		  //  Assert.assertEquals(lable4,"Åpningstider - Sentralveien 23");
		    
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 

