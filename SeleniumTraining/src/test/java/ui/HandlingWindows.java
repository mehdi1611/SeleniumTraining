package ui;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"_content_www_fr_fr_home_jcr_content_main-par_columncontainer_3b6d\"]/div/div/div[6]/div[1]/div[1]/div[2]/div/div[2]/div/div/div/div[1]/div/a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		Iterator<String> iteratorWindowHandles = windowHandles.iterator();
		String parentWindow = iteratorWindowHandles.next();
		String childWindow = iteratorWindowHandles.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("El Mehdi");
		driver.findElement(By.name("UserLastName")).sendKeys("HOUDAF");
		driver.switchTo().window(parentWindow);
		//driver.findElement(By.xpath("//*[@id=\"_content_www_fr_fr_home_jcr_content_main-par_columncontainer_3b6d\"]/div/div/div[6]/div[1]/div[1]/div[2]/div/div[2]/div/div/div/div[1]/div/a")).click();
		//driver.quit();
	}

}
