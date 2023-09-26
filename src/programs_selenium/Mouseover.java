package programs_selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class Mouseover {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		// mouseover action
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		
		Thread.sleep(1200);
		
		driver.findElement(By.linkText("Employee List")).click();
		
		Thread.sleep(1200);
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
