package programs_selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
public class VerifyTitle {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		
		// verifying title
		if(driver.getTitle().equals("orange hrms")) {
			System.out.println("title matched");
		}
		else {
			System.out.println("title not matched");
			System.out.println("actual title is-->"+driver.getTitle());
		}
		
		// login into application
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		// again verifying
		if(driver.getTitle().equals("orange hrms")) {
			System.out.println("title matched");
		}
		else {
			System.out.println("title not matched");
			System.out.println("actual title is-->"+driver.getTitle());
		}
		
		// logout from application
		driver.findElement(By.linkText("Logout")).click();
		
		// close the application
		driver.close();
		
	}
}
