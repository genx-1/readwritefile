package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OpeningHourPage extends TestBase {
	
    @FindBy(xpath = "(//h1[@class='text-center'])[3]") private WebElement openingHour;
    @FindBy(xpath = "(//input[@type='checkbox'])[2]") private WebElement checkboxbutton;
	@FindBy(xpath = "//button[@id='btnSaveStep4']") private WebElement SaveButtonstep4;
	@FindBy(xpath = "(//h5[@class='text-justify'])[1]") private WebElement Address;	
	
	public OpeningHourPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String openTimeOfStore() throws InterruptedException {
		//openingHour.getText();
		//checkboxbutton.click();
		//System.out.println("Makke komal Vitthal");
		SaveButtonstep4.click();
		Thread.sleep(2000);
		return Address.getText();
		
	}
	
	
	
	
	
	
	
	
}
