package ui;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
//		WebElement dropDown = driver.findElement(By.xpath("//*[@id='field27']/div/select"));
//		Select select = new Select(dropDown);
//		
//		
//		select.selectByVisibleText("2,501 - 5,000 employees");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		select.selectByValue("level2");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		select.selectByIndex(6);
		
		
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));
		Select select = new Select(dropDown);
		select.selectByValue("California");
		Thread.sleep(2000);
		select.selectByIndex(5);
		Thread.sleep(2000);
		List<WebElement> allItems = select.getAllSelectedOptions();
		System.out.println(allItems.size());
		select.deselectAll();
		Thread.sleep(2000);
		select.selectByValue("California");
		Thread.sleep(2000);
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.deselectByIndex(5);
		List<WebElement> allItems1 = select.getAllSelectedOptions();
		System.out.println(allItems1.size());
		
		
		
		driver.quit();
	}

}
