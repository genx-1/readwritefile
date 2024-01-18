package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCategoryPage {
	
	//select[@id='SelectedCategoryIds']
	@FindBy(xpath = "//select[@id='SelectedCategoryIds']") private WebElement ele1;
	@FindBy(xpath = "//input[@id='DefaultMetaDescription']")private WebElement DefaultMetaDescription;
 	@FindBy(xpath = "//button[@id='btnSaveStep8']")private WebElement buttonsavestep8;
	@FindBy(xpath = "(//div[@class='card-title'])[6]")private WebElement step9;
	
	
	
	
	
	
	
	
	
	
	
	

}
