import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto5Alert {

	public static void main(String[] args) throws Exception {
//		 https://www.browserstack.com/users/sign_up
//		https://demoqa.com/alerts
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://demoqa.com/alerts");
//		wd.manage().window().maximize();
		
//		Thread.sleep(5000);
		
		wd.findElement(By.id("alertButton")).click();

		Alert al = wd.switchTo().alert();
				
		String s = al.getText();
		System.out.println(s);
		
		al.accept();
		
		
		
		 
		 
		

	}

}
