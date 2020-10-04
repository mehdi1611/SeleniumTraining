package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.manage().window().maximize();
		driver.switchTo().frame(element);
		//indentification du triangle en bas à droite
		//WebElement redSlidable = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		WebElement greenSlidable = driver.findElement(By.cssSelector("#green > span:nth-child(2)"));
//				.xpath("/html/body/div[2]/span"));
		WebElement blueSlidable = driver.findElement(By.cssSelector("#blue > span:nth-child(2)"));
//				.xpath("/html/body/div[3]/span"));
		
		Actions action = new Actions(driver);
		//prob dans la récupération des coordonées
		int x = blueSlidable.getLocation().getX();
		int y = greenSlidable.getLocation().getY();
		action.dragAndDropBy(greenSlidable, x, y).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(greenSlidable, -100, 0).perform();
	}

}
