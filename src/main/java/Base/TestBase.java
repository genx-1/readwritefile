package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public void initialization() {
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		//EdgeOptions edge = new EdgeOptions();
		//edge.setHeadless(true);
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://mayraflora.retailhub-test.no/login?ReturnUrl=%2Fadmin");
	}
	
}
