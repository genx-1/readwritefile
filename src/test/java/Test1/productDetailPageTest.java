package Test1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBaseForVIKI;
import Page1.loginPageForViki;
import Page1.productDetailPage;

public class productDetailPageTest extends TestBaseForVIKI{
	loginPageForViki login;
	productDetailPage productDetail;
	
	@BeforeMethod
	public void setup() { 
		initialization();
		 login = new loginPageForViki();
		 productDetail = new productDetailPage();
		
	}
	
	@Test
	public void productinfoTest() throws InterruptedException {
		login.loginInStore();
		//productDetailPage productDetail;
		String Product = productDetail.productinfo();
		
		 Assert.assertEquals(Product, "My Cart");
		// Assert.assertEquals("My Cart", Product);
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
		}
	
	
	
	
	
	
	
	

}
