package programs_selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.ArrayList;
//import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class DropDownValues {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		//login into application
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		// getting all values from dropdown list
		driver.switchTo().frame("rightMenu");
		WebElement dropdown= driver.findElement(By.name("loc_code"));
		Select sc = new Select(dropdown);
//		List<WebElement> ls=sc.getOptions();
//		
//		// displaying by using for each loop
//		for(WebElement temp:ls) {
//			System.out.println(temp.getText());
//		}
		
		
		//by using arraylist
		ArrayList<WebElement> list = new ArrayList<WebElement>(sc.getOptions());
		
		//printing by using for each loop
		for(WebElement element:list) {
			System.out.println(element.getText());
		}
		
		//getting particular value from dropdown list
		WebElement random = sc.getOptions().get(6);
		System.out.println("particular value is==>"+random.getText());
		
		// logout from application
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(500);
		driver.close();
	}
}
