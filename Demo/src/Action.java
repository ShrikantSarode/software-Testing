import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		String cW=wd.getWindowHandle();
		wd.get("https://www.gmail.com");
		wd.switchTo().window(cW);
		
		Actions act = new Actions(wd);
		
		
//		wd.findElement(By.id("identifierId"));
		
		WebElement we = wd.findElement(By.id("identifierId"));
		Thread.sleep(3000);
		we.sendKeys("Hello I am Hacker");
		
		act.doubleClick().build().perform();
		act.contextClick().build().perform();
		
		

	}

}
