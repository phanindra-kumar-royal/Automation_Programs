package programs_selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class Frames {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		Actions ac = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("PIM"));
		ac.moveToElement(element).perform();
		Thread.sleep(1200);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(1200);
		
		// switching into frame
		driver.switchTo().frame("rightMenu");
		
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("phanindra");
		Thread.sleep(500);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("kumar");
		Thread.sleep(500);
		WebElement element1=driver.findElement(By.name("photofile"));
		element1.sendKeys("D:\\uploads\\color.png");
		Thread.sleep(500);
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(1200);
		
		// switching back to frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1200);
		driver.close();
		
	}
}
