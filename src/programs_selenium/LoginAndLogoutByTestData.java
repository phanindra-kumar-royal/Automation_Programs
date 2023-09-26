package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class LoginAndLogoutByTestData {
	public static void main(String[] args) {
		
		//credentials
		String username="nareshit";
		String password="nareshit";
		
		// object identifications data
		String objusername="txtUserName";
		String objpassword="txtPassword";
		String objloginbtn="Submit";
		String objlogoutbtn="Logout";
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name(objusername)).sendKeys(username);
		driver.findElement(By.name(objpassword)).sendKeys(password);
		driver.findElement(By.name(objloginbtn)).click();
		
		driver.findElement(By.linkText(objlogoutbtn)).click();
		driver.close();
	}
}
