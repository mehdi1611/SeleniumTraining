package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/sg/home#/book/bookflight");
		driver.manage().window().maximize();
		WebElement radioBtn1 = driver.findElement(By.id("bookFlights"));
		WebElement radioBtn2 = driver.findElement(By.id("redeemFlights"));
		radioBtn2.click();
		Thread.sleep(2000);
		System.out.println(radioBtn1.isSelected());
		System.out.println(radioBtn2.isSelected());
		driver.quit();
	}
	
}
