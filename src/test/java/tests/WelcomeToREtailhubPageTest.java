package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.WelcomeToREtailhubPage;
import Pages.loginPage;
import Utility.CaptureScreenshot;

public class WelcomeToREtailhubPageTest extends TestBase{

	loginPage login;
	WelcomeToREtailhubPage Retailhub;
	
	@BeforeMethod
	
	public void setup() {
		initialization();
		login = new loginPage();
		 Retailhub = new WelcomeToREtailhubPage();
		 
	}
	
	
	@Test
	public void retailhubPageTest() throws InterruptedException {
		login.loginInStore();
		String lable2 = Retailhub.retailhubPage();
		Assert.assertEquals(lable2,"Velg fraktavtale");
		}
	
	@AfterMethod
	public	void	closeBrowser()	throws	Exception{
	
	driver.close();

	}
	
	/*@AfterMethod
	public void closeBrowser(ITestResult it) throws IOException {
		/*if (ITestResult.FAILURE == it.getStatus())
		{
			CaptureScreenshot.screenshot(it.getName());
		}*/
		
		
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
