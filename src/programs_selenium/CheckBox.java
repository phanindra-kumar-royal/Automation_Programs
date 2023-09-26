package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class CheckBox {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		// login into application
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		// checkbox selection by using for loop
		driver.switchTo().frame("rightMenu");
		
		for(int i=1;i<=10;i++) {
			driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[1]/input")).click();
		}
		
		driver.switchTo().defaultContent();
		
		//logout from application
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1200);
		driver.close();
	}
}
