package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import org.openqa.selenium.OutputType;
public class Screenshot {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file:///D:/files/WebTable.html");
		
		TakesScreenshot shot = (TakesScreenshot)driver;
		File f1=shot.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\uploads\\pani.jpg");
		FileHandler.copy(f1, f2);
		
		if(f2.exists()) {
			System.out.println("already existed");
			Thread.sleep(500);
			System.out.print("deleting file");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			f2.delete();
			System.out.println("\nsucessfully deleted");
		}
		else {
			System.out.println("else statement executed");
		}
	}
}
