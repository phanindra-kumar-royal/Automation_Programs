package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.ArrayList;
import java.time.Duration;
public class WindowHandler {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		WebElement element = driver.findElement(By.id("newTabsBtn"));
		
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].scrollIntoView();",element);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
		exe.executeScript("arguments[0].click();",element);
		
		// storing windows unique string values into arraylist
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		
		//printing windows string values
		for(String temp:list) {
			System.out.println(temp);
		}
		
		Thread.sleep(1200); 
		
		driver.switchTo().window(list.get(2));
		driver.close();
		Thread.sleep(1200);
		
		driver.switchTo().window(list.get(1));
		driver.close();
		Thread.sleep(1200);
		
		driver.switchTo().window(list.get(0));
		driver.close();
	}
}
