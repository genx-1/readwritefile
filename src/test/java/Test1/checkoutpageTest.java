package Test1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBaseForVIKI;
import Page1.cartPage;
import Page1.checkoutpage;
import Page1.loginPageForViki;
import Page1.productDetailPage;

public class checkoutpageTest extends TestBaseForVIKI {
	loginPageForViki login;
	productDetailPage productDetail;
	cartPage cart;
	checkoutpage checkout;
	
	
	@BeforeMethod
		public void setup() { 
			initialization();
			
			login = new loginPageForViki();
			 productDetail = new productDetailPage();
			 cart = new cartPage();
			 checkout = new checkoutpage();
			 
	}
			 
			 
			 @Test
	private void PaymencheckboxtEnable() throws InterruptedException {
		login.loginInStore();
		productDetail.productinfo();
		cart.goToCart();
		boolean Paymentcheckbox = checkout.PaymencheckboxtEnable();
		
		 Assert.assertEquals(Paymentcheckbox, true);
		 System.out.println("Veryfy checkbox");
	}
				
	
	
	
	
@AfterMethod
public void closeBrowser() {
	
	driver.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
