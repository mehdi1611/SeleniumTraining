package ui;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.asx.com.au/");
		driver.manage().window().maximize();

		//step1	switch to the frame which has the particular table
		//step2	get the number of rows
		//step3 get the number of columns
		//step4 to iterate rows and columns and get text and print it
		
		//step1
		WebElement frameElement = driver.findElement(By.id("announcements-frame"));
		driver.switchTo().frame(frameElement);
		
		//step2
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"announcement_data_widget\"]/table/tbody/tr"));
		System.out.println(rows.size());
		int rowSize = rows.size();
		
		//step3
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"announcement_data_widget\"]/table/tbody/tr[1]/td"));
		System.out.println(columns.size());
		int columnSize = columns.size();
		
		//step4
		for(int i=1;i<=rowSize;i++) {
			for(int j=1;j<=columnSize;j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id=\"announcement_data_widget\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
			}
			System.out.println();
		}
	}

}
