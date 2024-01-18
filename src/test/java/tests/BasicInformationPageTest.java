package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.BasicInformationPage;
import Pages.WelcomeToRetailhubPage;

public class BasicInformationPageTest extends TestBase{
	WelcomeToRetailhubPage Retailhub;
	BasicInformationPage BasicInform;

	
	
	@BeforeMethod
	public void setup() {
		initialization();
		 BasicInform = new BasicInformationPage();
		Retailhub = new WelcomeToRetailhubPage();
		
	}
	
	
	@Test
	public void basicinfoTest() {
		Retailhub.login();
		String lable2 = BasicInform.basicinfo();
		Assert.assertEquals(lable2, "Step 2");
		
	}	
	}
	
	
	


