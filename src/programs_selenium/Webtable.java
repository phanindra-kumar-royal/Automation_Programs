package programs_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class Webtable {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/files/WebTable.html");
		
		int rows = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		int columns = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td")).size();
		System.out.println("ROWS ARE==>"+rows);
		System.out.println("COLUMNS ARE==>"+columns);
		
		// getting data from a particular column
		String random= driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[3]")).getText();
		System.out.println("RANDOM DATA IS==>"+random);
		
		// getting all data from table by using single for loop
//		for(int i=1;i<=rows;i++) {
//			String data = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).getText();
//			System.out.println(data+"       ");
//			System.out.println();
//		}
		
		// getting data from table by using two for loops
		for(int i = 1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				String data=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data);
				Thread.sleep(120);
				if(j==4&&i!=7) {
					System.out.println();
				}
				
				else {
					System.out.print("    ");
				}
			}
		}
	}
}
