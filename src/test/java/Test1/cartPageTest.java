package Test1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBaseForVIKI;
import Page1.cartPage;
import Page1.loginPageForViki;
import Page1.productDetailPage;

public class cartPageTest extends TestBaseForVIKI {
	loginPageForViki login;
	productDetailPage productDetail;
	cartPage cart;
	
	
	@BeforeMethod
	public void setup() { 
		initialization();
		
		login = new loginPageForViki();
		 productDetail = new productDetailPage();
		 cart = new cartPage();
	}
	
	@Test
	public void goToCartTest() throws InterruptedException {
		login.loginInStore();
		productDetail.productinfo();
		//cartPage cart = new cartPage();
		String checkouttText = cart.goToCart();
		
		 Assert.assertEquals(checkouttText, "Checkout");
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
		}
	
	
	
	
	
}
