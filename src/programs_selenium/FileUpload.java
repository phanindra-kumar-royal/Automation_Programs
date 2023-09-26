package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class FileUpload {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		// login into application
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		//adding employee details
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		
		//using implicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement firstname=driver.findElement(By.name("txtEmpFirstName"));
		
		wait.until(ExpectedConditions.visibilityOf(firstname)).sendKeys("phanindra");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("kumar");
		
		// fileupload
		WebElement file = driver.findElement(By.name("photofile"));
		file.sendKeys("D:\\uploads\\color.png");
		
		// saving employee details
		driver.findElement(By.id("btnEdit")).click();
		
		Thread.sleep(1200);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1200);
		driver.close();
	}
}
