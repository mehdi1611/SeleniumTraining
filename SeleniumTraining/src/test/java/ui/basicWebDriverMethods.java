package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.util.List;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicWebDriverMethods {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		//System.out.println(browser.toUpperCase().equals("FIREFOX"));
		if (browser.toUpperCase().equals("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			//System.out.println("firefox");
		} else if (browser.toUpperCase().equals("CHROME")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("chrome");
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		//driver.navigate().back();
		//driver.navigate().to("http://google.com");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webElements);
		
		driver.navigate().to("https://www.sugarcrm.com/");
		System.out.println(driver.getWindowHandle());
		
		//driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[3]/button[2]/span")).click();
		//driver.manage().wait();
		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("\n"+windowHandles);
		
		
		//driver.quit();
	}

}
