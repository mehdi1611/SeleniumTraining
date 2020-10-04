package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		
		//print the title
		String scriptJs = "return document.title;";
		String title = (String) jsExec.executeScript(scriptJs);
		System.out.println(title);
		
		//click the button
		driver.switchTo().frame("iframeResult");
		jsExec.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("ok");
		
		//highlight
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsExec.executeScript("arguments[0].style.border='3px solid red'", button);
		
		//scroll
		driver.navigate().to("https://www.w3schools.com");
		WebElement certifiedButton = driver.findElement(By.xpath("//*[@id=\"certsection\"]/p/a"));
		jsExec.executeScript("arguments[0].scrollIntoView(true);", certifiedButton);		
	}

}
