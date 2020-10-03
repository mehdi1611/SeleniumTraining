package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(element);
		//indentification du triangle en bas à droite
		//WebElement redSlidable = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		WebElement greenSlidable = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		WebElement blueSlidable = driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		
		Actions action = new Actions(driver);
		//prob dans la récupération des coordonées
		int x = blueSlidable.getLocation().getX();
		int y = greenSlidable.getLocation().getY();
		action.dragAndDropBy(greenSlidable, x, y).perform();
		action.dragAndDropBy(greenSlidable, 100, 0).perform();
	}

}
