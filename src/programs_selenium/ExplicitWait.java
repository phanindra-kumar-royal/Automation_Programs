package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.WebElement;
public class ExplicitWait {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		// explicit wait statement
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.name("txtUserName"));
		WebElement password = driver.findElement(By.name("txtPassword"));
		WebElement submit = driver.findElement(By.name("Submit"));
		
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("nareshit");
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("nareshit");
		wait.until(ExpectedConditions.visibilityOf(submit)).click();
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1200);
		driver.close();
		
	}
}
