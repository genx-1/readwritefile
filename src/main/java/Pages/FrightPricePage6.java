package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

   public class FrightPricePage6 extends TestBase{
	
	@FindBy(xpath = "(//input[@class='k-formatted-value text-box single-line numeric k-input'])[1]") private WebElement Bringsmallparcel;
	@FindBy(xpath = "(//input[@class='k-formatted-value text-box single-line numeric k-input'])[2]") private WebElement BringPickupPointParcel;
   // @FindBy(xpath = "(//input[@class='form-control text-box single-line'])[9]")private WebElement FreeFrightAboveOrdervalue;	
	@FindBy(xpath = "//button[@id='btnSaveStep6']")private WebElement buttonsavestep6;
	@FindBy(xpath = "(//div[@class='card-title'])[4]")private WebElement step7;
	//input[@class='k-formatted-value text-box single-line numeric k-input']
	
	public FrightPricePage6() {
		PageFactory.initElements(driver, this);
	}
	
	
	  public String frightPrice() throws InterruptedException {
		/*Bringsmallparcel.clear();
		Thread.sleep(1000);
		Bringsmallparcel.sendKeys("79");
		Thread.sleep(5000);
		BringPickupPointParcel.click();
		BringPickupPointParcel.clear();
		Thread.sleep(5000);
		BringPickupPointParcel.sendKeys("59");
		//Thread.sleep(1000);
		//FreeFrightAboveOrdervalue.clear();
		Thread.sleep(1000);
		//FreeFrightAboveOrdervalue.sendKeys("1500");*/
		buttonsavestep6.click();
		Thread.sleep(1000);
		return step7.getText();
	
	   }

     }
