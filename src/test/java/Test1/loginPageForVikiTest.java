package Test1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBaseForVIKI;
import Page1.loginPageForViki;
import Utility.CaptureScreenshot;

public class loginPageForVikiTest extends TestBaseForVIKI {
	loginPageForViki login;
	
	@BeforeMethod
	public void setup() { 
		initialization();
		
		login = new loginPageForViki();
	}
	
	@Test
	public void loginInStoreTest() throws InterruptedException {
		String lable = login.loginInStore();
		
		 Assert.assertEquals(lable, "Administration");
	}
	
	
	
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception 
	{
		if (ITestResult.FAILURE == it.getStatus()) {
			CaptureScreenshot.screenshot();
		}
			
		driver.close();
		}
	
	
	
	}
