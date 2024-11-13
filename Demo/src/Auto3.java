import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto3 {

	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		
		wd.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement we = wd.findElement(By.name("firstName"));
		
		we.click();
		
		Thread.sleep(2000);
		
		we.sendKeys("john");
		
		Thread.sleep(3000);
		
		we.clear();
		
		Thread.sleep(2000);
		
		we.click();
		
		we.sendKeys("Pinky");
		
		 String w = we.getAttribute("value");
		 System.out.println(w);
		
	}
	
}
