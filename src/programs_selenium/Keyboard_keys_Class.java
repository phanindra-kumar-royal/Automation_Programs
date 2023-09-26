package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class Keyboard_keys_Class {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1200);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}
