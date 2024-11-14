import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
//		https://demo.guru99.com/test/drag_drop.html
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://demo.guru99.com/test/drag_drop.html");
		
		String pw = wd.getWindowHandle();
		
		
		WebElement drag= wd.findElement(By.id("fourth"));
		
		WebElement drop= wd.findElement(By.id("amt7"));
		
		Actions act = new Actions(wd);
		
		act.dragAndDrop(drag, drop).build().perform();
	}
}
