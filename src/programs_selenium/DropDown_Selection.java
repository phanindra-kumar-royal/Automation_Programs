package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class DropDown_Selection {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		driver.switchTo().frame("rightMenu");
		
		Select sc = new Select(driver.findElement(By.name("loc_code")));
		//sc.selectByIndex(5);
		sc.selectByVisibleText("Supervisor");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1200);
		driver.close();
		
	}
}
