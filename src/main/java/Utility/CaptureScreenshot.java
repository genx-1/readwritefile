package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class CaptureScreenshot extends TestBase {
	public	static	void	screenshot()	throws	Exception
	{

		File source = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti = new File ("C:\\Users\\Komal\\eclipse-workspace\\readwritefile\\Screenshots.jpeg");
		FileHandler.copy(source, desti);
		
	}
}
	
	
	
	
	
	
	
	
	
	

