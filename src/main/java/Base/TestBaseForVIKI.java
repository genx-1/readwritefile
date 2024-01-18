package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseForVIKI {
	public static WebDriver driver;
	public void initialization() {
	System.setProperty("webdriver.http.factory","jdk-http-client");
	//System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
	WebDriverManager.edgedriver().setup();
	 driver = new EdgeDriver();
	 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://vikiv45.retailhub-test.no/login");
	
  }
}
