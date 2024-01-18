package tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;

import Pages.loginPage;
import Utility.CaptureScreenshot;

public class loginPageTest extends TestBase {
	loginPage login  ;
	@BeforeMethod
		public void setup() { 
		initialization();
		login = new loginPage();
		}
	
	
	@Test 
	public void loginInStoreTest() throws InterruptedException {
		 String lable1 = login.loginInStore();
		 Assert.assertEquals(lable1, "Velkommen til Retailhub");
	}
	
	
	
	@AfterMethod
	public	void	closeBrowser()	throws	Exception{
	
	driver.close();

	}
	
	
}



