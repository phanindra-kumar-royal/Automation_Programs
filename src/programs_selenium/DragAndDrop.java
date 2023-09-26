package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class DragAndDrop {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions ac = new Actions(driver);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		
		ac.dragAndDrop(draggable, droppable).build().perform();
		Thread.sleep(1200);
		
		driver.close();
	}
}
