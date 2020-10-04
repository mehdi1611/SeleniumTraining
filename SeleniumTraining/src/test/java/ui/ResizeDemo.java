package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeDemo {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resizable/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(element);
		//indentification du triangle en bas à droite
		WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions action = new Actions(driver);
		//prob dans la récupération des coordonées
		int x = resizable.getLocation().getX();
		int y = resizable.getLocation().getY();
		System.out.println("x : "+x+"\ny : "+y);
		action.dragAndDropBy(resizable, 159, 159).perform();
		//action.perform();
	}

}
