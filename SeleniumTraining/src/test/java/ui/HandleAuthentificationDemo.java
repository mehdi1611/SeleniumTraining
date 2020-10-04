package ui;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthentificationDemo {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static String userName="admin";
	public static String password="admin";
	public static String url = "http://"+userName+":"+password+"@the-internet.herokuapp.com/basic_auth";

	public static void main(String[] args) throws IOException {
		
		// Global profile
		DesiredCapabilities dc = new DesiredCapabilities();
		//two ways :
		//dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		if (browser.toUpperCase().equals("CHROME")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.merge(dc);

			driver = new ChromeDriver(cOptions);
			driver.get(url);
		} else if (browser.toUpperCase().equals("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fOptions = new FirefoxOptions();
			fOptions.merge(dc);

			driver = new FirefoxDriver(fOptions);
			driver.get(url);

		} else if (browser.toUpperCase().equals("EDGE")) {
			WebDriverManager.edgedriver().setup();

			EdgeOptions eOptions = new EdgeOptions();
			eOptions.merge(dc);
			driver = new EdgeDriver(eOptions);
		}
		driver.get(url);
	}

}
