import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		wd.manage().window().maximize();
		wd.findElement(By.name("firstName")).sendKeys("john");
		wd.findElement(By.name("lastName")).sendKeys("deo");
		wd.findElement(By.name("phone")).sendKeys("78454665465");
		wd.findElement(By.id("userName")).sendKeys("example@gmail.com");
		wd.findElement(By.name("address1")).sendKeys("Pune");
		wd.findElement(By.name("city")).sendKeys("Pune");
		wd.findElement(By.name("state")).sendKeys("mhara");
		wd.findElement(By.name("postalCode")).sendKeys("545445");
		
		
		WebElement we = null;
		Select sr = new Select(wd.findElement(By.name("country")));
		sr.selectByVisibleText("INDIA");
		
		
		wd.findElement(By.name("email")).sendKeys("sss");
		wd.findElement(By.name("password")).sendKeys("password@123");
		wd.findElement(By.name("confirmPassword")).sendKeys("password@123");
		Thread.sleep(3000);
//		wd.findElement(By.name("submit")).click();
		
		wd.close();
		
		
		sr.selectByVisibleText("");
		
	}
}
