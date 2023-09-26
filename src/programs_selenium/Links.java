package programs_selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.ArrayList;
public class Links {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		
		// storing all links in a list
		List<WebElement> ls= driver.findElements(By.tagName("a"));
//		
//		// diaplaying by using for each loop
//		for(WebElement temp:ls) {
//			System.out.println(temp.getText());
//		}
		
		ArrayList<WebElement> list = new ArrayList<WebElement>(ls);
		
		//displaying by using for each loop
		for(WebElement temp:list) {
			System.out.println(temp.getText());
		}
		
	}
}