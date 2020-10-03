package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\mehdi\\work\\BrowserDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\mehdi\\work\\BrowserDrivers\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\mehdi\\work\\BrowserDrivers\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
	}

}
