package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SEOMetatitlePage extends TestBase {


	@FindBy(xpath = "//input[@id='DefaultTitle']") private WebElement DefaultPageTitle;
	@FindBy(xpath = "//input[@id='DefaultMetaDescription']")private WebElement DefaultMetaDescription;
 	@FindBy(xpath = "//button[@id='btnSaveStep8']")private WebElement buttonsavestep8;
	@FindBy(xpath = "(//div[@class='card-title'])[6]")private WebElement step9;
	
	
	public SEOMetatitlePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String metaTitle() throws InterruptedException {
		DefaultPageTitle.clear();
		  Thread.sleep(1000);
		  DefaultPageTitle.sendKeys("nisha@gmail.com");
		 Thread.sleep(1000);
		 DefaultMetaDescription.clear();
		 Thread.sleep(1000);
		 DefaultMetaDescription.sendKeys("komal@gmail.com");
		 Thread.sleep(1000);
		 buttonsavestep8.click();
		 Thread.sleep(2000);
		 return step9.getText();
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

