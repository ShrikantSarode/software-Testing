import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {

	public static void main(String[] args) throws Exception {
		 
		WebDriver wd = new ChromeDriver();
		
		 wd.get("https://www.demoblaze.com");
		 
		 wd.manage().window().maximize();
		 
		 wd.findElement(By.id("signin2")).click();
		 Thread.sleep(2000);
		  
		 wd.findElement(By.id("sign-username")).sendKeys("example@gmail.com");
		 
		 wd.findElement(By.id("sign-password")).sendKeys("password");
		 
		 wd.findElement(By.name("Sign up")).click();
		 
		  
	}

}
