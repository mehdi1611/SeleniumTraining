package ui;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdownDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		
		List<WebElement> allTags = driver.findElementsByTagName("a");
		System.out.println("Total tags are : "+allTags.size());
		
		for(int i=0;i<allTags.size();i++) {
			System.out.println("Links on page are : "+allTags.get(i).getAttribute("href"));
			System.out.println("Links on page are : "+allTags.get(i).getText());
		}
		driver.quit();
	}
	
}
