package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.findElement(By.id("cookieChoiceDismiss")).click();
		System.out.println("passed");
		Thread.sleep(2000);
		WebElement sourceTextArea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
		System.out.println(sourceTextArea.getTagName());
		WebElement sourceTargetArea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[10]/pre/span"));
		System.out.println(sourceTargetArea.getTagName());
		Actions action = new Actions(driver);
		action.keyDown(sourceTextArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(sourceTargetArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
