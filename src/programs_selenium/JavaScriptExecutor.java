package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class JavaScriptExecutor {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		// scrolling by using javascriptexecutor
		JavascriptExecutor execute = (JavascriptExecutor)driver;
		WebElement button4= driver.findElement(By.id("newTabsBtn"));
		execute.executeScript("arguments[0].scrollIntoView();",button4);
		
		// waiting until the required button is availble
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.visibilityOf(button4));
		
		//clicking button by using javascriptexecutor
		execute.executeScript("arguments[0].click();",button4);
		
		Thread.sleep(1200);
		driver.quit();
	}
}
