package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
public class Alerts {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(1200);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		
		String alerttext=a.getText();
		
		System.out.println("NEW ALERT IS==>"+alerttext);
		
		a.accept();
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();	
	}
}
