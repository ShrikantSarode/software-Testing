import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https:www.google.com");
		
		wd.navigate().back();
		wd.navigate().forward();
		wd.navigate().refresh();
		wd.close();
	}
	
	
}