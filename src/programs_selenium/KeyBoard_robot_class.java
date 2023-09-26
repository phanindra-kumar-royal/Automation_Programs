package programs_selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import org.openqa.selenium.By;
public class KeyBoard_robot_class {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		//robo.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.name("Submit")).click();
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(1200);
		driver.close();
		
		
	}
}
