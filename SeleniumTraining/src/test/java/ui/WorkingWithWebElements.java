package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		
//		if(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div")).isEnabled()) {
//			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div")).click();
//		}
//		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("firstname")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("name"));
		System.out.println(driver.findElement(By.name("firstname")).getCssValue("color"));
		System.out.println(driver.findElement(By.name("firstname")).getLocation());
		System.out.println(driver.findElement(By.name("firstname")).getSize());
		System.out.println(driver.findElement(By.name("firstname")).getTagName());
		System.out.println(driver.findElement(By.name("firstname")).getText());
		System.out.println(driver.findElement(By.name("firstname")).isDisplayed());
		System.out.println(driver.findElement(By.name("firstname")).isEnabled());
		System.out.println(driver.findElement(By.name("firstname")).isSelected());
		driver.quit();
	}

}
